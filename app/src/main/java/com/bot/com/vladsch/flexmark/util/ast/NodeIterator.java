package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public class NodeIterator implements ReversiblePeekingIterator<Node> {
    public static final ReversiblePeekingIterator<Node> EMPTY = new ReversiblePeekingIterator<Node>() { // from class: com.vladsch.flexmark.util.ast.NodeIterator.1
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
        public boolean isReversed() {
            return false;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator
        public Node peek() {
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
        }

        @Override // java.util.Iterator
        public Node next() {
            throw new NoSuchElementException();
        }
    };
    final Node firstNode;
    final Node lastNode;
    Node node;
    Node result;
    final boolean reversed;

    public NodeIterator(Node node) {
        this(node, null, false);
    }

    @Override // java.util.Iterator
    public void forEachRemaining(Consumer<? super Node> consumer) {
        consumer.getClass();
        while (hasNext()) {
            consumer.accept(next());
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.node != null;
    }

    @Override // com.vladsch.flexmark.util.collection.iteration.ReversibleIterator
    public boolean isReversed() {
        return this.reversed;
    }

    @Override // java.util.Iterator
    public void remove() {
        Node node = this.result;
        if (node == null) {
            throw new IllegalStateException("Either next() was not called yet or the node was removed");
        }
        node.unlink();
        this.result = null;
    }

    public NodeIterator(Node node, boolean z5) {
        this(node, null, z5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r3.result == (r3.reversed ? r3.firstNode : r3.lastNode)) goto L15;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.vladsch.flexmark.util.ast.Node next() {
        /*
            r3 = this;
            r0 = 0
            r3.result = r0
            com.vladsch.flexmark.util.ast.Node r1 = r3.node
            if (r1 == 0) goto L2c
            r3.result = r1
            boolean r2 = r3.reversed
            if (r2 == 0) goto L12
            com.vladsch.flexmark.util.ast.Node r1 = r1.getPrevious()
            goto L16
        L12:
            com.vladsch.flexmark.util.ast.Node r1 = r1.getNext()
        L16:
            r3.node = r1
            if (r1 == 0) goto L27
            com.vladsch.flexmark.util.ast.Node r1 = r3.result
            boolean r2 = r3.reversed
            if (r2 == 0) goto L23
            com.vladsch.flexmark.util.ast.Node r2 = r3.firstNode
            goto L25
        L23:
            com.vladsch.flexmark.util.ast.Node r2 = r3.lastNode
        L25:
            if (r1 != r2) goto L29
        L27:
            r3.node = r0
        L29:
            com.vladsch.flexmark.util.ast.Node r0 = r3.result
            return r0
        L2c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vladsch.flexmark.util.ast.NodeIterator.next():com.vladsch.flexmark.util.ast.Node");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator
    public Node peek() {
        Node node = this.node;
        if (node != null) {
            return node;
        }
        return null;
    }

    public NodeIterator(Node node, Node node2) {
        this(node, node2, false);
    }

    public NodeIterator(Node node, Node node2, boolean z5) {
        node.getClass();
        this.firstNode = node;
        this.lastNode = node2;
        this.reversed = z5;
        this.node = z5 ? node2 : node;
    }
}
