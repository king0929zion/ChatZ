package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.List;

/* loaded from: classes.dex */
public class OrderedListItem extends ListItem {
    public OrderedListItem() {
    }

    @Override // com.vladsch.flexmark.ast.ListItem
    public boolean isOrderedItem() {
        return true;
    }

    public OrderedListItem(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public OrderedListItem(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public OrderedListItem(BlockContent blockContent) {
        super(blockContent);
    }
}
