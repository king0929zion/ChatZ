package com.vladsch.flexmark.html.renderer;

/* loaded from: classes.dex */
public class LinkStatus {
    private final String myName;
    public static final LinkStatus UNKNOWN = new LinkStatus("UNKNOWN");
    public static final LinkStatus VALID = new LinkStatus("VALID");
    public static final LinkStatus INVALID = new LinkStatus("INVALID");
    public static final LinkStatus UNCHECKED = new LinkStatus("UNCHECKED");
    public static final LinkStatus NOT_FOUND = new LinkStatus("NOT_FOUND");

    public LinkStatus(String str) {
        this.myName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkStatus) {
            return this.myName.equals(((LinkStatus) obj).myName);
        }
        return false;
    }

    public String getName() {
        return this.myName;
    }

    public int hashCode() {
        return this.myName.hashCode();
    }

    public boolean isStatus(CharSequence charSequence) {
        return this.myName.equals(charSequence instanceof String ? (String) charSequence : String.valueOf(charSequence));
    }
}
