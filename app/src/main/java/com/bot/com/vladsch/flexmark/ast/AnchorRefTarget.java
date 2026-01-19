package com.vladsch.flexmark.ast;

/* loaded from: classes.dex */
public interface AnchorRefTarget {
    String getAnchorRefId();

    String getAnchorRefText();

    boolean isExplicitAnchorRefId();

    void setAnchorRefId(String str);

    void setExplicitAnchorRefId(boolean z5);
}
