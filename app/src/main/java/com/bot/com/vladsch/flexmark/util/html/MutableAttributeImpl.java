package com.vladsch.flexmark.util.html;

import B3.e;
import com.vladsch.flexmark.ast.util.a;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class MutableAttributeImpl implements MutableAttribute {
    private final String name;
    private String value;
    private final char valueListDelimiter;
    private final char valueNameDelimiter;
    private LinkedHashMap<String, String> values;

    private MutableAttributeImpl(CharSequence charSequence, CharSequence charSequence2, char c6, char c7) {
        this.name = String.valueOf(charSequence);
        this.valueListDelimiter = c6;
        this.valueNameDelimiter = c7;
        this.value = charSequence2 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : String.valueOf(charSequence2);
        this.values = null;
    }

    public static /* synthetic */ void a(Map map, boolean[] zArr, String str, String str2) {
        lambda$removeValue$1(map, zArr, str, str2);
    }

    public static /* synthetic */ void b(MutableAttributeImpl mutableAttributeImpl, Map map, String str, String str2) {
        mutableAttributeImpl.lambda$setValue$0(map, str, str2);
    }

    private void forEachValue(CharSequence charSequence, BiConsumer<String, String> biConsumer) {
        String valueOf = charSequence == null ? FlexmarkHtmlConverter.DEFAULT_NODE : String.valueOf(charSequence);
        int i6 = 0;
        while (i6 < valueOf.length()) {
            int indexOf = valueOf.indexOf(this.valueListDelimiter, i6);
            int length = indexOf == -1 ? valueOf.length() : indexOf;
            if (i6 < length) {
                String trim = valueOf.substring(i6, length).trim();
                if (!trim.isEmpty()) {
                    char c6 = this.valueNameDelimiter;
                    int indexOf2 = c6 == 0 ? -1 : trim.indexOf(c6);
                    biConsumer.accept(indexOf2 == -1 ? trim : trim.substring(0, indexOf2), indexOf2 == -1 ? FlexmarkHtmlConverter.DEFAULT_NODE : trim.substring(indexOf2 + 1));
                }
            }
            if (indexOf == -1) {
                return;
            } else {
                i6 = length + 1;
            }
        }
    }

    public static /* synthetic */ void lambda$removeValue$1(Map map, boolean[] zArr, String str, String str2) {
        if (map.remove(str) != null) {
            zArr[0] = true;
        }
    }

    public /* synthetic */ void lambda$setValue$0(Map map, String str, String str2) {
        if (this.valueNameDelimiter == 0 || !str2.isEmpty()) {
            map.put(str, str2);
        } else {
            map.remove(str);
        }
    }

    public static MutableAttributeImpl of(Attribute attribute) {
        return of(attribute.getName(), attribute.getValue(), attribute.getValueListDelimiter(), attribute.getValueNameDelimiter());
    }

    @Override // com.vladsch.flexmark.util.html.MutableAttribute, com.vladsch.flexmark.util.html.Attribute
    public boolean containsValue(CharSequence charSequence) {
        return AttributeImpl.indexOfValue(this.value, charSequence, this.valueListDelimiter, this.valueNameDelimiter) != -1;
    }

    @Override // com.vladsch.flexmark.util.html.MutableAttribute
    public MutableAttribute copy() {
        return of(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Attribute)) {
            return false;
        }
        Attribute attribute = (Attribute) obj;
        if (this.name.equals(attribute.getName())) {
            return getValue().equals(attribute.getValue());
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public String getName() {
        return this.name;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public String getValue() {
        if (this.value == null) {
            this.value = valueFromMap();
        }
        return this.value;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public char getValueListDelimiter() {
        return this.valueListDelimiter;
    }

    public Map<String, String> getValueMap() {
        if (this.values == null) {
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
            this.values = linkedHashMap;
            if (this.valueListDelimiter == 0) {
                linkedHashMap.put(this.value, FlexmarkHtmlConverter.DEFAULT_NODE);
            } else if (!this.value.isEmpty()) {
                int i6 = 0;
                while (i6 < this.value.length()) {
                    int indexOf = this.value.indexOf(this.valueListDelimiter, i6);
                    int length = indexOf == -1 ? this.value.length() : indexOf;
                    if (i6 < length) {
                        String substring = this.value.substring(i6, length);
                        char c6 = this.valueNameDelimiter;
                        int indexOf2 = c6 != 0 ? substring.indexOf(c6) : -1;
                        if (indexOf2 == -1) {
                            this.values.put(substring, FlexmarkHtmlConverter.DEFAULT_NODE);
                        } else {
                            this.values.put(substring.substring(0, indexOf2), substring.substring(indexOf2 + 1));
                        }
                    }
                    if (indexOf == -1) {
                        break;
                    }
                    i6 = length + 1;
                }
            }
        }
        return this.values;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public char getValueNameDelimiter() {
        return this.valueNameDelimiter;
    }

    public int hashCode() {
        return getValue().hashCode() + (this.name.hashCode() * 31);
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public boolean isNonRendering() {
        if (this.name.indexOf(32) == -1) {
            return this.value.isEmpty() && Attribute.NON_RENDERING_WHEN_EMPTY.contains(this.name);
        }
        return true;
    }

    public void resetToValuesMap() {
        if (this.values == null) {
            throw new IllegalStateException("resetToValuesMap called when values is null");
        }
        this.value = null;
    }

    @Override // com.vladsch.flexmark.util.misc.Immutable
    public MutableAttribute toMutable() {
        return this;
    }

    public String toString() {
        return e.o("MutableAttributeImpl { name='", this.name, "', value='", getValue(), "' }");
    }

    public String valueFromMap() {
        char c6 = this.valueListDelimiter;
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        if (c6 != 0) {
            StringBuilder sb = new StringBuilder();
            if (this.valueNameDelimiter != 0) {
                String valueOf = String.valueOf(this.valueListDelimiter);
                for (Map.Entry<String, String> entry : this.values.entrySet()) {
                    if (!entry.getKey().isEmpty()) {
                        sb.append(str);
                        sb.append(entry.getKey());
                        sb.append(this.valueNameDelimiter);
                        sb.append(entry.getValue());
                        str = valueOf;
                    }
                }
            } else {
                String valueOf2 = String.valueOf(this.valueListDelimiter);
                for (String str2 : this.values.keySet()) {
                    if (!str2.isEmpty()) {
                        sb.append(str);
                        sb.append(str2);
                        str = valueOf2;
                    }
                }
            }
            this.value = sb.toString();
        } else {
            LinkedHashMap<String, String> linkedHashMap = this.values;
            if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                str = this.values.keySet().iterator().next();
            }
            this.value = str;
        }
        return this.value;
    }

    public static MutableAttributeImpl of(CharSequence charSequence) {
        return of(charSequence, charSequence, (char) 0, (char) 0);
    }

    @Override // com.vladsch.flexmark.util.misc.Mutable
    public Attribute toImmutable() {
        return AttributeImpl.of(this);
    }

    public static MutableAttributeImpl of(CharSequence charSequence, CharSequence charSequence2) {
        return of(charSequence, charSequence2, (char) 0, (char) 0);
    }

    @Override // com.vladsch.flexmark.util.html.MutableAttribute, com.vladsch.flexmark.util.html.Attribute
    public MutableAttributeImpl removeValue(CharSequence charSequence) {
        if (this.valueListDelimiter != 0) {
            if (charSequence != null && charSequence.length() != 0) {
                boolean[] zArr = {false};
                forEachValue(charSequence, new a(2, getValueMap(), zArr));
                if (zArr[0]) {
                    this.value = null;
                    return this;
                }
            }
        } else {
            String str = this.value;
            if (str == null || !str.contentEquals(charSequence)) {
                this.value = FlexmarkHtmlConverter.DEFAULT_NODE;
                this.values = null;
                return this;
            }
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.MutableAttribute, com.vladsch.flexmark.util.html.Attribute
    public MutableAttributeImpl replaceValue(CharSequence charSequence) {
        String valueOf = charSequence == null ? FlexmarkHtmlConverter.DEFAULT_NODE : String.valueOf(charSequence);
        String str = this.value;
        if (str != null && charSequence != null && str.equals(valueOf)) {
            return this;
        }
        this.value = valueOf;
        this.values = null;
        return this;
    }

    @Override // com.vladsch.flexmark.util.html.MutableAttribute, com.vladsch.flexmark.util.html.Attribute
    public MutableAttributeImpl setValue(CharSequence charSequence) {
        if (this.valueListDelimiter != 0) {
            if (charSequence != null && charSequence.length() != 0) {
                forEachValue(charSequence, new a(1, this, getValueMap()));
                this.value = null;
                return this;
            }
        } else {
            String str = this.value;
            if (str == null || !str.contentEquals(charSequence)) {
                this.value = charSequence == null ? FlexmarkHtmlConverter.DEFAULT_NODE : String.valueOf(charSequence);
                this.values = null;
                return this;
            }
        }
        return this;
    }

    public static MutableAttributeImpl of(CharSequence charSequence, CharSequence charSequence2, char c6) {
        return of(charSequence, charSequence2, c6, (char) 0);
    }

    public static MutableAttributeImpl of(CharSequence charSequence, CharSequence charSequence2, char c6, char c7) {
        if (Attribute.CLASS_ATTR.contentEquals(charSequence)) {
            return new MutableAttributeImpl(charSequence, charSequence2, SequenceUtils.SPC, (char) 0);
        }
        if (Attribute.STYLE_ATTR.contentEquals(charSequence)) {
            return new MutableAttributeImpl(charSequence, charSequence2, ';', ':');
        }
        return new MutableAttributeImpl(charSequence, charSequence2, c6, c7);
    }
}
