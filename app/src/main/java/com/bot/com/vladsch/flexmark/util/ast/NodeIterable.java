package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class NodeIterable implements ReversiblePeekingIterable<Node> {
    public static final ReversiblePeekingIterable<Node> EMPTY = new ReversiblePeekingIterable<Node>() { // from class: com.vladsch.flexmark.util.ast.NodeIterable.1
        @Override // java.lang.Iterable
        public void forEach(Consumer<? super Node> consumer) {
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
        public boolean isReversed() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
        public ReversiblePeekingIterable<Node> reversed() {
            return this;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
        public ReversiblePeekingIterator<Node> reversedIterator() {
            return NodeIterator.EMPTY;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
        public ReversiblePeekingIterator<Node> iterator() {
            return NodeIterator.EMPTY;
        }
    };
    final Node firstNode;
    final Node lastNode;
    final boolean reversed;

    public NodeIterable(Node node, Node node2, boolean z5) {
        this.firstNode = node;
        this.lastNode = node2;
        this.reversed = z5;
    }

    @Override // java.lang.Iterable
    public void forEach(Consumer<? super Node> consumer) {
        ReversiblePeekingIterator<Node> it = iterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public boolean isReversed() {
        return this.reversed;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversiblePeekingIterable<Node> reversed() {
        return new NodeIterable(this.firstNode, this.lastNode, !this.reversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable
    public ReversiblePeekingIterator<Node> reversedIterator() {
        return new NodeIterator(this.firstNode, this.lastNode, !this.reversed);
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable, com.vladsch.flexmark.util.collection.iteration.ReversibleIterable, java.lang.Iterable
    public ReversiblePeekingIterator<Node> iterator() {
        return new NodeIterator(this.firstNode, this.lastNode, this.reversed);
    }
}
