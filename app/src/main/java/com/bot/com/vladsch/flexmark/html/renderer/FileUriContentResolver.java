package com.vladsch.flexmark.html.renderer;

import com.vladsch.flexmark.html.UriContentResolver;
import com.vladsch.flexmark.html.UriContentResolverFactory;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.dependency.LastDependent;
import com.vladsch.flexmark.util.misc.FileUtil;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class FileUriContentResolver implements UriContentResolver {

    /* loaded from: classes.dex */
    public static class Factory implements UriContentResolverFactory {
        @Override // com.vladsch.flexmark.html.UriContentResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public boolean affectsGlobalScope() {
            return false;
        }

        @Override // com.vladsch.flexmark.html.UriContentResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getAfterDependents() {
            return Collections.singleton(LastDependent.class);
        }

        @Override // com.vladsch.flexmark.html.UriContentResolverFactory, com.vladsch.flexmark.util.dependency.Dependent
        public Set<Class<?>> getBeforeDependents() {
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.html.UriContentResolverFactory, java.util.function.Function
        public UriContentResolver apply(LinkResolverBasicContext linkResolverBasicContext) {
            return new FileUriContentResolver(linkResolverBasicContext);
        }
    }

    public FileUriContentResolver(LinkResolverBasicContext linkResolverBasicContext) {
    }

    @Override // com.vladsch.flexmark.html.UriContentResolver
    public ResolvedContent resolveContent(Node node, LinkResolverBasicContext linkResolverBasicContext, ResolvedContent resolvedContent) {
        ResolvedLink resolvedLink = resolvedContent.getResolvedLink();
        LinkStatus status = resolvedLink.getStatus();
        LinkStatus linkStatus = LinkStatus.VALID;
        if (status == linkStatus) {
            String url = resolvedLink.getUrl();
            if (url.startsWith("file:/")) {
                File file = new File(url.substring(url.startsWith("file://") ? 7 : File.separatorChar == '\\' ? 6 : 5));
                if (file.isFile() && file.exists()) {
                    try {
                        return resolvedContent.withContent(FileUtil.getFileContentBytesWithExceptions(file)).withStatus(linkStatus);
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                }
            }
        }
        return resolvedContent;
    }
}
