package com.vladsch.flexmark.html.renderer;

/* loaded from: classes.dex */
public class AttributablePart {
    private final String myName;
    public static final AttributablePart NODE = new AttributablePart("NODE");
    public static final AttributablePart NODE_POSITION = new AttributablePart("NODE_POSITION");
    public static final AttributablePart LINK = new AttributablePart("LINK");
    public static final AttributablePart ID = new AttributablePart("ID");

    public AttributablePart(String str) {
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
