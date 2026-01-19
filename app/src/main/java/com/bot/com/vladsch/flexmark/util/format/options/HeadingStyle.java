package com.vladsch.flexmark.util.format.options;

/* loaded from: classes.dex */
public enum HeadingStyle {
    AS_IS,
    ATX_PREFERRED,
    SETEXT_PREFERRED;

    public boolean isAtx() {
        return this == ATX_PREFERRED;
    }

    public boolean isNoChange() {
        return this == AS_IS;
    }

    public boolean isSetext() {
        return this == SETEXT_PREFERRED;
    }

    public boolean isNoChange(boolean z5, int i6) {
        if (this == AS_IS) {
            return true;
        }
        if (this != SETEXT_PREFERRED || (!z5 && i6 <= 2)) {
            return this == ATX_PREFERRED && !z5;
        }
        return true;
    }
}
