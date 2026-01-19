package com.vladsch.flexmark.util.html;

import com.vladsch.flexmark.util.misc.Immutable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public interface Attribute extends Immutable<Attribute, MutableAttribute> {
    public static final String LINK_STATUS_ATTR = "Link Status";

    @Deprecated
    public static final char NUL = 0;
    public static final String TARGET_ATTR = "target";
    public static final String TITLE_ATTR = "title";
    public static final Attribute NO_FOLLOW = AttributeImpl.of("rel", "nofollow");
    public static final String CLASS_ATTR = "class";
    public static final String ID_ATTR = "id";
    public static final String NAME_ATTR = "name";
    public static final String STYLE_ATTR = "style";
    public static final Set<String> NON_RENDERING_WHEN_EMPTY = new HashSet(Arrays.asList(CLASS_ATTR, ID_ATTR, NAME_ATTR, STYLE_ATTR));

    boolean containsValue(CharSequence charSequence);

    String getName();

    String getValue();

    char getValueListDelimiter();

    char getValueNameDelimiter();

    boolean isNonRendering();

    Attribute removeValue(CharSequence charSequence);

    Attribute replaceValue(CharSequence charSequence);

    Attribute setValue(CharSequence charSequence);
}
