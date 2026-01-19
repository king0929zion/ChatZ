package com.vladsch.flexmark.util.html;

import com.vladsch.flexmark.util.misc.Mutable;

/* loaded from: classes.dex */
public interface MutableAttribute extends Attribute, Mutable<MutableAttribute, Attribute> {
    @Override // com.vladsch.flexmark.util.html.Attribute
    boolean containsValue(CharSequence charSequence);

    MutableAttribute copy();

    @Override // com.vladsch.flexmark.util.html.Attribute
    MutableAttribute removeValue(CharSequence charSequence);

    @Override // com.vladsch.flexmark.util.html.Attribute
    MutableAttribute replaceValue(CharSequence charSequence);

    @Override // com.vladsch.flexmark.util.html.Attribute
    MutableAttribute setValue(CharSequence charSequence);
}
