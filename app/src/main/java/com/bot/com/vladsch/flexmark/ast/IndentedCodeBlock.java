package com.vladsch.flexmark.ast;

import com.vladsch.flexmark.util.ast.Block;
import com.vladsch.flexmark.util.ast.BlockContent;
import com.vladsch.flexmark.util.ast.Node;
import com.vladsch.flexmark.util.ast.NodeVisitor;
import com.vladsch.flexmark.util.ast.TextContainer;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedSequence;
import com.vladsch.flexmark.util.sequence.Escaping;
import com.vladsch.flexmark.util.sequence.ReplacedTextMapper;
import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.util.List;

/* loaded from: classes.dex */
public class IndentedCodeBlock extends Block implements TextContainer {
    public IndentedCodeBlock() {
    }

    @Override // com.vladsch.flexmark.util.ast.TextContainer
    public boolean collectText(ISequenceBuilder<? extends ISequenceBuilder<?, BasedSequence>, BasedSequence> iSequenceBuilder, int i6, NodeVisitor nodeVisitor) {
        BasedSequence contentChars = getContentChars();
        if (BitFieldSet.any(i6, TextContainer.F_NODE_TEXT)) {
            iSequenceBuilder.append((CharSequence) contentChars);
            return false;
        }
        BasedSequence unescape = Escaping.unescape(contentChars, new ReplacedTextMapper(contentChars));
        if (unescape.isEmpty()) {
            return false;
        }
        iSequenceBuilder.append((CharSequence) unescape);
        return false;
    }

    @Override // com.vladsch.flexmark.util.ast.Node
    public BasedSequence[] getSegments() {
        return Node.EMPTY_SEGMENTS;
    }

    public IndentedCodeBlock(BasedSequence basedSequence) {
        super(basedSequence);
    }

    public IndentedCodeBlock(BasedSequence basedSequence, List<BasedSequence> list) {
        super(basedSequence, list);
    }

    public IndentedCodeBlock(BlockContent blockContent) {
        super(blockContent);
    }
}
