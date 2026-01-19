package com.vladsch.flexmark.html;

import com.vladsch.flexmark.util.data.MutableDataHolder;
import com.vladsch.flexmark.util.misc.Extension;

/* loaded from: classes.dex */
public interface RendererExtension extends Extension {
    void extend(RendererBuilder rendererBuilder, String str);

    void rendererOptions(MutableDataHolder mutableDataHolder);
}
