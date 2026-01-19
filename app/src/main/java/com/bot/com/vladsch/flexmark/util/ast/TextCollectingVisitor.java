package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.sequence.BasedSequence;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class TextCollectingVisitor {
    int flags;
    private final NodeVisitor myVisitor = new NodeVisitor() { // from class: com.vladsch.flexmark.util.ast.TextCollectingVisitor.1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vladsch.flexmark.util.visitor.AstActionHandler
        public void processNode(Node node, boolean z5, BiConsumer<Node, Visitor<Node>> biConsumer) {
            if (node.isOrDescendantOfType(DoNotCollectText.class)) {
                return;
            }
            TextCollectingVisitor.this.out.setLastNode(node);
            if ((node instanceof Block) && TextCollectingVisitor.this.out.isNotEmpty()) {
                TextCollectingVisitor.this.out.appendEol();
            }
            if (node instanceof TextContainer) {
                TextContainer textContainer = (TextContainer) node;
                TextCollectingVisitor textCollectingVisitor = TextCollectingVisitor.this;
                if (textContainer.collectText(textCollectingVisitor.out, textCollectingVisitor.flags, textCollectingVisitor.myVisitor)) {
                    if ((node instanceof BlankLineBreakNode) && TextCollectingVisitor.this.out.isNotEmpty()) {
                        TextCollectingVisitor.this.out.appendEol();
                    }
                    processChildren(node, biConsumer);
                }
                TextCollectingVisitor textCollectingVisitor2 = TextCollectingVisitor.this;
                textContainer.collectEndText(textCollectingVisitor2.out, textCollectingVisitor2.flags, textCollectingVisitor2.myVisitor);
            } else {
                processChildren(node, biConsumer);
            }
            if ((node instanceof LineBreakNode) && TextCollectingVisitor.this.out.needEol()) {
                TextCollectingVisitor.this.out.appendEol();
            }
        }
    };
    SpaceInsertingSequenceBuilder out;

    public void collect(Node node) {
        collect(node, 0);
    }

    public BasedSequence collectAndGetSequence(Node node) {
        return collectAndGetSequence(node, 0);
    }

    public String collectAndGetText(Node node) {
        return collectAndGetText(node, 0);
    }

    public BasedSequence getSequence() {
        return this.out.toSequence();
    }

    public String getText() {
        return this.out.toString();
    }

    public void collect(Node node, int i6) {
        this.out = SpaceInsertingSequenceBuilder.emptyBuilder(node.getChars(), i6);
        this.flags = i6;
        this.myVisitor.visit(node);
    }

    public BasedSequence collectAndGetSequence(Node node, int i6) {
        collect(node, i6);
        return this.out.toSequence();
    }

    public String collectAndGetText(Node node, int i6) {
        collect(node, i6);
        return this.out.toString();
    }
}
