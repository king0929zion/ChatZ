package com.vladsch.flexmark.html;

import com.vladsch.flexmark.html.renderer.HeaderIdGeneratorFactory;
import com.vladsch.flexmark.util.data.DataHolder;

/* loaded from: classes.dex */
public interface RendererBuilder extends DataHolder {
    RendererBuilder attributeProviderFactory(AttributeProviderFactory attributeProviderFactory);

    RendererBuilder contentResolverFactory(UriContentResolverFactory uriContentResolverFactory);

    RendererBuilder htmlIdGeneratorFactory(HeaderIdGeneratorFactory headerIdGeneratorFactory);

    RendererBuilder linkResolverFactory(LinkResolverFactory linkResolverFactory);
}
