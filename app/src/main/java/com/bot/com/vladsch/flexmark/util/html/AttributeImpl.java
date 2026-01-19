package com.vladsch.flexmark.util.html;

import B3.e;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.SequenceUtils;

/* loaded from: classes.dex */
public class AttributeImpl implements Attribute {
    private final String name;
    private final String value;
    private final char valueListDelimiter;
    private final char valueNameDelimiter;

    private AttributeImpl(CharSequence charSequence, CharSequence charSequence2, char c6, char c7) {
        this.name = String.valueOf(charSequence);
        this.valueListDelimiter = c6;
        this.valueNameDelimiter = c7;
        this.value = charSequence2 == null ? FlexmarkHtmlConverter.DEFAULT_NODE : String.valueOf(charSequence2);
    }

    public static int indexOfValue(CharSequence charSequence, CharSequence charSequence2, char c6, char c7) {
        int indexOf;
        if (charSequence2.length() != 0 && charSequence.length() != 0) {
            int i6 = 0;
            if (c6 == 0) {
                return charSequence.equals(charSequence2) ? 0 : -1;
            }
            BasedSequence of = BasedSequence.of(charSequence);
            while (i6 < charSequence.length() && (indexOf = of.indexOf(charSequence2, i6)) != -1) {
                int length = charSequence2.length() + indexOf;
                if (indexOf != 0) {
                    int i7 = indexOf - 1;
                    if (charSequence.charAt(i7) != c6) {
                        if (c7 == 0) {
                            continue;
                        } else if (charSequence.charAt(i7) != c7) {
                            continue;
                        }
                        i6 = length + 1;
                    }
                }
                if (length >= charSequence.length() || charSequence.charAt(length) == c6 || (c7 != 0 && charSequence.charAt(length) == c7)) {
                    return indexOf;
                }
                i6 = length + 1;
            }
        }
        return -1;
    }

    public static AttributeImpl of(Attribute attribute) {
        return of(attribute.getName(), attribute.getValue(), attribute.getValueListDelimiter(), attribute.getValueNameDelimiter());
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public boolean containsValue(CharSequence charSequence) {
        return indexOfValue(this.value, charSequence, this.valueListDelimiter, this.valueNameDelimiter) != -1;
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
            return this.value.equals(attribute.getValue());
        }
        return false;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public String getName() {
        return this.name;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public String getValue() {
        return this.value;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public char getValueListDelimiter() {
        return this.valueListDelimiter;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public char getValueNameDelimiter() {
        return this.valueNameDelimiter;
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public boolean isNonRendering() {
        if (this.name.indexOf(32) == -1) {
            return this.value.isEmpty() && Attribute.NON_RENDERING_WHEN_EMPTY.contains(this.name);
        }
        return true;
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public Attribute removeValue(CharSequence charSequence) {
        MutableAttribute removeValue = toMutable().removeValue(charSequence);
        return removeValue.equals(this) ? this : removeValue.toImmutable();
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public Attribute replaceValue(CharSequence charSequence) {
        return charSequence.equals(this.value) ? this : of(this.name, charSequence, this.valueListDelimiter, this.valueNameDelimiter);
    }

    @Override // com.vladsch.flexmark.util.html.Attribute
    public Attribute setValue(CharSequence charSequence) {
        MutableAttribute value = toMutable().setValue(charSequence);
        return value.equals(this) ? this : value.toImmutable();
    }

    public String toString() {
        return e.o("AttributeImpl { name='", this.name, "', value='", this.value, "' }");
    }

    public static AttributeImpl of(CharSequence charSequence) {
        return of(charSequence, charSequence, (char) 0, (char) 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.misc.Immutable
    public MutableAttribute toMutable() {
        return MutableAttributeImpl.of(this);
    }

    public static AttributeImpl of(CharSequence charSequence, CharSequence charSequence2) {
        return of(charSequence, charSequence2, (char) 0, (char) 0);
    }

    public static AttributeImpl of(CharSequence charSequence, CharSequence charSequence2, char c6) {
        return of(charSequence, charSequence2, c6, (char) 0);
    }

    public static AttributeImpl of(CharSequence charSequence, CharSequence charSequence2, char c6, char c7) {
        if (charSequence.equals(Attribute.CLASS_ATTR)) {
            return new AttributeImpl(charSequence, charSequence2, SequenceUtils.SPC, (char) 0);
        }
        if (charSequence.equals(Attribute.STYLE_ATTR)) {
            return new AttributeImpl(charSequence, charSequence2, ';', ':');
        }
        return new AttributeImpl(charSequence, charSequence2, c6, c7);
    }
}
