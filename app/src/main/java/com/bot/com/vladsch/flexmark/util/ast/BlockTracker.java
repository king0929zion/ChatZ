package com.vladsch.flexmark.util.ast;

/* loaded from: classes.dex */
public interface BlockTracker {
    void blockAdded(Block block);

    void blockAddedWithChildren(Block block);

    void blockAddedWithDescendants(Block block);

    void blockRemoved(Block block);

    void blockRemovedWithChildren(Block block);

    void blockRemovedWithDescendants(Block block);
}
