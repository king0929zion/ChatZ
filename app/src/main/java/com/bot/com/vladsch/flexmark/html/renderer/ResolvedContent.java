package com.vladsch.flexmark.html.renderer;

import java.util.Arrays;

/* loaded from: classes.dex */
public class ResolvedContent {
    private final byte[] content;
    private final ResolvedLink resolvedLink;
    private final LinkStatus status;

    public ResolvedContent(ResolvedLink resolvedLink, LinkStatus linkStatus, byte[] bArr) {
        this.resolvedLink = resolvedLink;
        this.status = linkStatus;
        this.content = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResolvedContent resolvedContent = (ResolvedContent) obj;
        if (this.resolvedLink.equals(resolvedContent.resolvedLink) && this.status.equals(resolvedContent.status)) {
            return Arrays.equals(this.content, resolvedContent.content);
        }
        return false;
    }

    public byte[] getContent() {
        return this.content;
    }

    public ResolvedLink getResolvedLink() {
        return this.resolvedLink;
    }

    public LinkStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Arrays.hashCode(this.content) + ((this.status.hashCode() + (this.resolvedLink.hashCode() * 31)) * 31);
    }

    public ResolvedContent withContent(byte[] bArr) {
        return Arrays.equals(this.content, bArr) ? this : new ResolvedContent(this.resolvedLink, this.status, bArr);
    }

    public ResolvedContent withStatus(LinkStatus linkStatus) {
        return linkStatus == this.status ? this : new ResolvedContent(this.resolvedLink, linkStatus, this.content);
    }
}
