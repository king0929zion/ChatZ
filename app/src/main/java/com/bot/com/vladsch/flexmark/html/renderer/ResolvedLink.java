package com.vladsch.flexmark.html.renderer;

import B3.e;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.html.Attributes;
import com.vladsch.flexmark.util.html.MutableAttributes;

/* loaded from: classes.dex */
public class ResolvedLink {
    private MutableAttributes myAttributes;
    private final LinkType myLinkType;
    private final LinkStatus myStatus;
    private final String myUrl;

    public ResolvedLink(LinkType linkType, CharSequence charSequence) {
        this(linkType, charSequence, null, LinkStatus.UNKNOWN);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResolvedLink)) {
            return false;
        }
        ResolvedLink resolvedLink = (ResolvedLink) obj;
        if (this.myLinkType.equals(resolvedLink.myLinkType) && this.myUrl.equals(resolvedLink.myUrl)) {
            return this.myStatus.equals(resolvedLink.myStatus);
        }
        return false;
    }

    public String getAnchorRef() {
        int indexOf = this.myUrl.indexOf(35);
        if (indexOf < 0) {
            return null;
        }
        return this.myUrl.substring(indexOf + 1);
    }

    public Attributes getAttributes() {
        MutableAttributes mutableAttributes = this.myAttributes;
        if (mutableAttributes == null) {
            return null;
        }
        return mutableAttributes.toImmutable();
    }

    public LinkType getLinkType() {
        return this.myLinkType;
    }

    public MutableAttributes getMutableAttributes() {
        if (this.myAttributes == null) {
            this.myAttributes = new MutableAttributes();
        }
        return this.myAttributes;
    }

    public Attributes getNonNullAttributes() {
        if (this.myAttributes == null) {
            this.myAttributes = new MutableAttributes();
        }
        return this.myAttributes.toImmutable();
    }

    public String getPageRef() {
        int indexOf = this.myUrl.indexOf(35);
        return indexOf < 0 ? this.myUrl : this.myUrl.substring(0, indexOf);
    }

    public LinkStatus getStatus() {
        return this.myStatus;
    }

    public String getTarget() {
        MutableAttributes mutableAttributes = this.myAttributes;
        if (mutableAttributes == null) {
            return null;
        }
        return mutableAttributes.getValue(Attribute.TARGET_ATTR);
    }

    public String getTitle() {
        MutableAttributes mutableAttributes = this.myAttributes;
        if (mutableAttributes == null) {
            return null;
        }
        return mutableAttributes.getValue(Attribute.TITLE_ATTR);
    }

    public String getUrl() {
        return this.myUrl;
    }

    public int hashCode() {
        return this.myStatus.hashCode() + e.e(this.myLinkType.hashCode() * 31, 31, this.myUrl);
    }

    public ResolvedLink withLinkType(LinkType linkType) {
        return linkType == this.myLinkType ? this : new ResolvedLink(linkType, this.myUrl, this.myAttributes, this.myStatus);
    }

    public ResolvedLink withStatus(LinkStatus linkStatus) {
        return linkStatus == this.myStatus ? this : new ResolvedLink(this.myLinkType, this.myUrl, this.myAttributes, linkStatus);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0.isEmpty() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.html.renderer.ResolvedLink withTarget(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.vladsch.flexmark.util.html.MutableAttributes r0 = r4.myAttributes
            r1 = 0
            java.lang.String r2 = "target"
            if (r0 != 0) goto L9
            r0 = r1
            goto Ld
        L9:
            java.lang.String r0 = r0.getValue(r2)
        Ld:
            if (r5 == r0) goto L3d
            if (r0 == 0) goto L1a
            if (r5 == 0) goto L1a
            boolean r0 = r0.contentEquals(r5)
            if (r0 == 0) goto L1a
            goto L3d
        L1a:
            com.vladsch.flexmark.util.html.MutableAttributes r0 = new com.vladsch.flexmark.util.html.MutableAttributes
            com.vladsch.flexmark.util.html.MutableAttributes r3 = r4.myAttributes
            r0.<init>(r3)
            if (r5 != 0) goto L2d
            r0.remove(r2)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L30
            goto L31
        L2d:
            r0.replaceValue(r2, r5)
        L30:
            r1 = r0
        L31:
            com.vladsch.flexmark.html.renderer.ResolvedLink r5 = new com.vladsch.flexmark.html.renderer.ResolvedLink
            com.vladsch.flexmark.html.renderer.LinkType r0 = r4.myLinkType
            java.lang.String r2 = r4.myUrl
            com.vladsch.flexmark.html.renderer.LinkStatus r3 = r4.myStatus
            r5.<init>(r0, r2, r1, r3)
            return r5
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html.renderer.ResolvedLink.withTarget(java.lang.CharSequence):com.vladsch.flexmark.html.renderer.ResolvedLink");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r0.isEmpty() != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.html.renderer.ResolvedLink withTitle(java.lang.CharSequence r5) {
        /*
            r4 = this;
            com.vladsch.flexmark.util.html.MutableAttributes r0 = r4.myAttributes
            r1 = 0
            java.lang.String r2 = "title"
            if (r0 != 0) goto L9
            r0 = r1
            goto Ld
        L9:
            java.lang.String r0 = r0.getValue(r2)
        Ld:
            if (r5 == r0) goto L3d
            if (r0 == 0) goto L1a
            if (r5 == 0) goto L1a
            boolean r0 = r0.contentEquals(r5)
            if (r0 == 0) goto L1a
            goto L3d
        L1a:
            com.vladsch.flexmark.util.html.MutableAttributes r0 = new com.vladsch.flexmark.util.html.MutableAttributes
            com.vladsch.flexmark.util.html.MutableAttributes r3 = r4.myAttributes
            r0.<init>(r3)
            if (r5 != 0) goto L2d
            r0.remove(r2)
            boolean r5 = r0.isEmpty()
            if (r5 == 0) goto L30
            goto L31
        L2d:
            r0.replaceValue(r2, r5)
        L30:
            r1 = r0
        L31:
            com.vladsch.flexmark.html.renderer.ResolvedLink r5 = new com.vladsch.flexmark.html.renderer.ResolvedLink
            com.vladsch.flexmark.html.renderer.LinkType r0 = r4.myLinkType
            java.lang.String r2 = r4.myUrl
            com.vladsch.flexmark.html.renderer.LinkStatus r3 = r4.myStatus
            r5.<init>(r0, r2, r1, r3)
            return r5
        L3d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.html.renderer.ResolvedLink.withTitle(java.lang.CharSequence):com.vladsch.flexmark.html.renderer.ResolvedLink");
    }

    public ResolvedLink withUrl(CharSequence charSequence) {
        String valueOf = String.valueOf(charSequence);
        return this.myUrl.equals(valueOf) ? this : new ResolvedLink(this.myLinkType, valueOf, this.myAttributes, this.myStatus);
    }

    public ResolvedLink(LinkType linkType, CharSequence charSequence, Attributes attributes) {
        this(linkType, charSequence, attributes, LinkStatus.UNKNOWN);
    }

    public ResolvedLink(LinkType linkType, CharSequence charSequence, Attributes attributes, LinkStatus linkStatus) {
        this.myLinkType = linkType;
        this.myUrl = String.valueOf(charSequence);
        this.myStatus = linkStatus;
        if (attributes != null) {
            getMutableAttributes().addValues(attributes);
        }
    }
}
