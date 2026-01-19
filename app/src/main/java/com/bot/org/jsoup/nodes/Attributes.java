package org.jsoup.nodes;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;
import org.jsoup.internal.SharedConstants;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Range;
import org.jsoup.parser.ParseSettings;

/* loaded from: classes.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {
    private static final String EmptyString = "";
    private static final int GrowthFactor = 2;
    private static final int InitialCapacity = 3;
    static final char InternalPrefix = '/';
    static final int NotFound = -1;
    protected static final String dataPrefix = "data-";
    private int size = 0;
    String[] keys = new String[3];
    Object[] vals = new Object[3];

    /* loaded from: classes.dex */
    public static class Dataset extends AbstractMap<String, String> {
        private final Attributes attributes;

        /* loaded from: classes.dex */
        public class DatasetIterator implements Iterator<Map.Entry<String, String>> {
            private Attribute attr;
            private Iterator<Attribute> attrIter;

            private DatasetIterator() {
                this.attrIter = Dataset.this.attributes.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                while (this.attrIter.hasNext()) {
                    Attribute next = this.attrIter.next();
                    this.attr = next;
                    if (next.isDataAttribute()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // java.util.Iterator
            public void remove() {
                Dataset.this.attributes.remove(this.attr.getKey());
            }

            @Override // java.util.Iterator
            public Map.Entry<String, String> next() {
                return new Attribute(this.attr.getKey().substring(5), this.attr.getValue());
            }
        }

        /* loaded from: classes.dex */
        public class EntrySet extends AbstractSet<Map.Entry<String, String>> {
            private EntrySet() {
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<String, String>> iterator() {
                return new DatasetIterator();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int i6 = 0;
                while (new DatasetIterator().hasNext()) {
                    i6++;
                }
                return i6;
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<String, String>> entrySet() {
            return new EntrySet();
        }

        private Dataset(Attributes attributes) {
            this.attributes = attributes;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public String put(String str, String str2) {
            String dataKey = Attributes.dataKey(str);
            String str3 = this.attributes.hasKey(dataKey) ? this.attributes.get(dataKey) : null;
            this.attributes.put(dataKey, str2);
            return str3;
        }
    }

    private void addObject(String str, Object obj) {
        checkCapacity(this.size + 1);
        String[] strArr = this.keys;
        int i6 = this.size;
        strArr[i6] = str;
        this.vals[i6] = obj;
        this.size = i6 + 1;
    }

    private void checkCapacity(int i6) {
        Validate.isTrue(i6 >= this.size);
        String[] strArr = this.keys;
        int length = strArr.length;
        if (length >= i6) {
            return;
        }
        int i7 = length >= 3 ? this.size * 2 : 3;
        if (i6 <= i7) {
            i6 = i7;
        }
        this.keys = (String[]) Arrays.copyOf(strArr, i6);
        this.vals = Arrays.copyOf(this.vals, i6);
    }

    public static String checkNotNull(Object obj) {
        return obj == null ? "" : (String) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String dataKey(String str) {
        return AbstractC1135a.f(dataPrefix, str);
    }

    private int indexOfKeyIgnoreCase(String str) {
        Validate.notNull(str);
        for (int i6 = 0; i6 < this.size; i6++) {
            if (str.equalsIgnoreCase(this.keys[i6])) {
                return i6;
            }
        }
        return -1;
    }

    public static String internalKey(String str) {
        return AbstractC1135a.f("/", str);
    }

    public static boolean isInternalKey(String str) {
        return str != null && str.length() > 1 && str.charAt(0) == '/';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void remove(int i6) {
        Validate.isFalse(i6 >= this.size);
        int i7 = (this.size - i6) - 1;
        if (i7 > 0) {
            String[] strArr = this.keys;
            int i8 = i6 + 1;
            System.arraycopy(strArr, i8, strArr, i6, i7);
            Object[] objArr = this.vals;
            System.arraycopy(objArr, i8, objArr, i6, i7);
        }
        int i9 = this.size - 1;
        this.size = i9;
        this.keys[i9] = null;
        this.vals[i9] = null;
    }

    public Attributes add(String str, String str2) {
        addObject(str, str2);
        return this;
    }

    public void addAll(Attributes attributes) {
        if (attributes.size() == 0) {
            return;
        }
        checkCapacity(this.size + attributes.size);
        boolean z5 = this.size != 0;
        Iterator<Attribute> it = attributes.iterator();
        while (it.hasNext()) {
            Attribute next = it.next();
            if (z5) {
                put(next);
            } else {
                add(next.getKey(), next.getValue());
            }
        }
    }

    public List<Attribute> asList() {
        ArrayList arrayList = new ArrayList(this.size);
        for (int i6 = 0; i6 < this.size; i6++) {
            if (!isInternalKey(this.keys[i6])) {
                arrayList.add(new Attribute(this.keys[i6], (String) this.vals[i6], this));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Attribute attribute(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey == -1) {
            return null;
        }
        return new Attribute(str, checkNotNull(this.vals[indexOfKey]), this);
    }

    public Map<String, String> dataset() {
        return new Dataset();
    }

    public int deduplicate(ParseSettings parseSettings) {
        String str;
        int i6 = 0;
        if (isEmpty()) {
            return 0;
        }
        boolean preserveAttributeCase = parseSettings.preserveAttributeCase();
        int i7 = 0;
        while (i6 < this.keys.length) {
            int i8 = i6 + 1;
            int i9 = i8;
            while (true) {
                String[] strArr = this.keys;
                if (i9 < strArr.length && (str = strArr[i9]) != null) {
                    if (!preserveAttributeCase || !strArr[i6].equals(str)) {
                        if (!preserveAttributeCase) {
                            String[] strArr2 = this.keys;
                            if (!strArr2[i6].equalsIgnoreCase(strArr2[i9])) {
                            }
                        }
                        i9++;
                    }
                    i7++;
                    remove(i9);
                    i9--;
                    i9++;
                }
            }
            i6 = i8;
        }
        return i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.size != attributes.size) {
            return false;
        }
        for (int i6 = 0; i6 < this.size; i6++) {
            int indexOfKey = attributes.indexOfKey(this.keys[i6]);
            if (indexOfKey == -1) {
                return false;
            }
            Object obj2 = this.vals[i6];
            Object obj3 = attributes.vals[indexOfKey];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!obj2.equals(obj3)) {
                return false;
            }
        }
        return true;
    }

    public String get(String str) {
        int indexOfKey = indexOfKey(str);
        return indexOfKey == -1 ? "" : checkNotNull(this.vals[indexOfKey]);
    }

    public String getIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        return indexOfKeyIgnoreCase == -1 ? "" : checkNotNull(this.vals[indexOfKeyIgnoreCase]);
    }

    public Map<String, Range.AttributeRange> getRanges() {
        return (Map) userData(SharedConstants.AttrRangeKey);
    }

    public boolean hasDeclaredValueForKey(String str) {
        int indexOfKey = indexOfKey(str);
        return (indexOfKey == -1 || this.vals[indexOfKey] == null) ? false : true;
    }

    public boolean hasDeclaredValueForKeyIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        return (indexOfKeyIgnoreCase == -1 || this.vals[indexOfKeyIgnoreCase] == null) ? false : true;
    }

    public boolean hasKey(String str) {
        return indexOfKey(str) != -1;
    }

    public boolean hasKeyIgnoreCase(String str) {
        return indexOfKeyIgnoreCase(str) != -1;
    }

    public int hashCode() {
        return Arrays.hashCode(this.vals) + (((this.size * 31) + Arrays.hashCode(this.keys)) * 31);
    }

    public String html() {
        StringBuilder borrowBuilder = StringUtil.borrowBuilder();
        try {
            html(borrowBuilder, new Document("").outputSettings());
            return StringUtil.releaseBuilder(borrowBuilder);
        } catch (IOException e6) {
            throw new SerializationException(e6);
        }
    }

    public int indexOfKey(String str) {
        Validate.notNull(str);
        for (int i6 = 0; i6 < this.size; i6++) {
            if (str.equals(this.keys[i6])) {
                return i6;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<Attribute> iterator() {
        return new Iterator<Attribute>() { // from class: org.jsoup.nodes.Attributes.1
            int expectedSize;

            /* renamed from: i, reason: collision with root package name */
            int f13526i = 0; {
                this.expectedSize = Attributes.this.size;
            }

            private void checkModified() {
                if (Attributes.this.size != this.expectedSize) {
                    throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                checkModified();
                while (this.f13526i < Attributes.this.size && Attributes.isInternalKey(Attributes.this.keys[this.f13526i])) {
                    this.f13526i++;
                }
                return this.f13526i < Attributes.this.size;
            }

            @Override // java.util.Iterator
            public void remove() {
                Attributes attributes = Attributes.this;
                int i6 = this.f13526i - 1;
                this.f13526i = i6;
                attributes.remove(i6);
                this.expectedSize--;
            }

            @Override // java.util.Iterator
            public Attribute next() {
                checkModified();
                if (this.f13526i < Attributes.this.size) {
                    Attributes attributes = Attributes.this;
                    String[] strArr = attributes.keys;
                    int i6 = this.f13526i;
                    Attribute attribute = new Attribute(strArr[i6], (String) attributes.vals[i6], attributes);
                    this.f13526i++;
                    return attribute;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public void normalize() {
        for (int i6 = 0; i6 < this.size; i6++) {
            if (!isInternalKey(this.keys[i6])) {
                String[] strArr = this.keys;
                strArr[i6] = Normalizer.lowerCase(strArr[i6]);
            }
        }
    }

    public Attributes put(String str, String str2) {
        Validate.notNull(str);
        int indexOfKey = indexOfKey(str);
        if (indexOfKey != -1) {
            this.vals[indexOfKey] = str2;
            return this;
        }
        add(str, str2);
        return this;
    }

    public void putIgnoreCase(String str, String str2) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase == -1) {
            add(str, str2);
            return;
        }
        this.vals[indexOfKeyIgnoreCase] = str2;
        if (this.keys[indexOfKeyIgnoreCase].equals(str)) {
            return;
        }
        this.keys[indexOfKeyIgnoreCase] = str;
    }

    public void removeIgnoreCase(String str) {
        int indexOfKeyIgnoreCase = indexOfKeyIgnoreCase(str);
        if (indexOfKeyIgnoreCase != -1) {
            remove(indexOfKeyIgnoreCase);
        }
    }

    public int size() {
        return this.size;
    }

    public Range.AttributeRange sourceRange(String str) {
        Map<String, Range.AttributeRange> ranges;
        Range.AttributeRange attributeRange;
        return (!hasKey(str) || (ranges = getRanges()) == null || (attributeRange = ranges.get(str)) == null) ? Range.AttributeRange.UntrackedAttr : attributeRange;
    }

    public String toString() {
        return html();
    }

    public Map<String, Object> userData() {
        int indexOfKey = indexOfKey(SharedConstants.UserDataKey);
        if (indexOfKey == -1) {
            HashMap hashMap = new HashMap();
            addObject(SharedConstants.UserDataKey, hashMap);
            return hashMap;
        }
        return (Map) this.vals[indexOfKey];
    }

    public Attributes clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.size = this.size;
            attributes.keys = (String[]) Arrays.copyOf(this.keys, this.size);
            attributes.vals = Arrays.copyOf(this.vals, this.size);
            return attributes;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final void html(Appendable appendable, Document.OutputSettings outputSettings) {
        String validKey;
        int i6 = this.size;
        for (int i7 = 0; i7 < i6; i7++) {
            if (!isInternalKey(this.keys[i7]) && (validKey = Attribute.getValidKey(this.keys[i7], outputSettings.syntax())) != null) {
                Attribute.htmlNoValidate(validKey, (String) this.vals[i7], appendable.append(SequenceUtils.SPC), outputSettings);
            }
        }
    }

    public Attributes put(String str, boolean z5) {
        if (z5) {
            putIgnoreCase(str, null);
            return this;
        }
        remove(str);
        return this;
    }

    public Object userData(String str) {
        Validate.notNull(str);
        if (hasKey(SharedConstants.UserDataKey)) {
            return userData().get(str);
        }
        return null;
    }

    public Attributes put(Attribute attribute) {
        Validate.notNull(attribute);
        put(attribute.getKey(), attribute.getValue());
        attribute.parent = this;
        return this;
    }

    public void remove(String str) {
        int indexOfKey = indexOfKey(str);
        if (indexOfKey != -1) {
            remove(indexOfKey);
        }
    }

    public Attributes userData(String str, Object obj) {
        Validate.notNull(str);
        userData().put(str, obj);
        return this;
    }
}
