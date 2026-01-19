package com.vladsch.flexmark.html2md.converter;

import java.util.Set;

/* loaded from: classes.dex */
public interface DelegatingNodeRendererFactory extends HtmlNodeRendererFactory {
    Set<Class<?>> getDelegates();
}
