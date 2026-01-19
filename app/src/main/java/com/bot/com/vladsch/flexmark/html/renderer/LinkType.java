package com.vladsch.flexmark.html.renderer;

/* loaded from: classes.dex */
public class LinkType {
    private final String myName;
    public static final LinkType LINK = new LinkType("LINK");
    public static final LinkType IMAGE = new LinkType("IMAGE");
    public static final LinkType LINK_REF = new LinkType("LINK_REF");
    public static final LinkType IMAGE_REF = new LinkType("IMAGE_REF");

    public LinkType(String str) {
        this.myName = str;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String getName() {
        return this.myName;
    }

    public int hashCode() {
        return super.hashCode();
    }
}
