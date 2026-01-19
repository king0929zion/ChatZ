package com.vladsch.flexmark.util.html;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class Attributes {
    public static final Attributes EMPTY = new Attributes();
    protected LinkedHashMap<String, Attribute> attributes;

    public Attributes() {
        this.attributes = null;
    }

    public boolean contains(CharSequence charSequence) {
        if (this.attributes == null || charSequence == null || charSequence.length() == 0) {
            return false;
        }
        return this.attributes.containsKey(String.valueOf(charSequence));
    }

    public boolean containsValue(CharSequence charSequence, CharSequence charSequence2) {
        if (this.attributes == null) {
            return false;
        }
        Attribute attribute = this.attributes.get(String.valueOf(charSequence));
        return attribute != null && attribute.containsValue(charSequence2);
    }

    public Set<Map.Entry<String, Attribute>> entrySet() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null ? linkedHashMap.entrySet() : Collections.EMPTY_SET;
    }

    public void forEach(BiConsumer<String, Attribute> biConsumer) {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap != null) {
            for (Map.Entry<String, Attribute> entry : linkedHashMap.entrySet()) {
                biConsumer.accept(entry.getKey(), entry.getValue());
            }
        }
    }

    public Attribute get(CharSequence charSequence) {
        if (this.attributes == null || charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return this.attributes.get(String.valueOf(charSequence));
    }

    public String getValue(CharSequence charSequence) {
        if (this.attributes == null || charSequence == null || charSequence.length() == 0) {
            return FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        Attribute attribute = this.attributes.get(String.valueOf(charSequence));
        return attribute == null ? FlexmarkHtmlConverter.DEFAULT_NODE : attribute.getValue();
    }

    public boolean isEmpty() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap == null || linkedHashMap.isEmpty();
    }

    public Set<String> keySet() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null ? linkedHashMap.keySet() : Collections.EMPTY_SET;
    }

    public int size() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        if (linkedHashMap == null) {
            return 0;
        }
        return linkedHashMap.size();
    }

    public Attributes toImmutable() {
        return this;
    }

    public MutableAttributes toMutable() {
        return new MutableAttributes(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = FlexmarkHtmlConverter.DEFAULT_NODE;
        for (String str2 : keySet()) {
            sb.append(str);
            sb.append(str2);
            Attribute attribute = this.attributes.get(str2);
            if (!attribute.getValue().isEmpty()) {
                sb.append("=\"");
                sb.append(attribute.getValue().replace("\"", "\\\""));
                sb.append("\"");
            }
            str = SequenceUtils.SPACE;
        }
        return AbstractC1135a.s("Attributes{", sb.toString(), "}");
    }

    public Collection<Attribute> values() {
        LinkedHashMap<String, Attribute> linkedHashMap = this.attributes;
        return linkedHashMap != null ? linkedHashMap.values() : Collections.EMPTY_LIST;
    }

    public Attributes(Attributes attributes) {
        this.attributes = (attributes == null || attributes.attributes == null) ? null : new LinkedHashMap<>(attributes.attributes);
    }
}
