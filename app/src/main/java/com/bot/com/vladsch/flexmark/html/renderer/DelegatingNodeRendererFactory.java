package com.vladsch.flexmark.html.renderer;

import java.util.Set;

/* loaded from: classes.dex */
public interface DelegatingNodeRendererFactory extends NodeRendererFactory {
    Set<Class<?>> getDelegates();
}
