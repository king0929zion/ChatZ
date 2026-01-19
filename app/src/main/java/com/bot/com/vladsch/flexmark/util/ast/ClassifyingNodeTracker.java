package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.collection.ClassificationBag;
import com.vladsch.flexmark.util.collection.OrderedMap;
import com.vladsch.flexmark.util.collection.OrderedSet;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversibleIterator;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterable;
import com.vladsch.flexmark.util.collection.iteration.ReversiblePeekingIterator;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ClassifyingNodeTracker implements NodeTracker {
    private final OrderedMap<Class<?>, Set<Class<?>>> exclusionMap;
    private final OrderedSet<Class<?>> exclusionSet;
    private final NodeTracker host;
    private final HashMap<Integer, BitSet> nodeAncestryMap;
    protected final ClassificationBag<Class<?>, Node> nodeClassifier = new ClassificationBag<>(NodeClassifier.INSTANCE);

    public ClassifyingNodeTracker(NodeTracker nodeTracker, Map<Class<? extends Node>, Set<Class<?>>> map) {
        this.host = nodeTracker;
        OrderedMap<Class<?>, Set<Class<?>>> orderedMap = new OrderedMap<>(map.size());
        this.exclusionMap = orderedMap;
        orderedMap.putAll(map);
        this.exclusionSet = new OrderedSet<>();
        ReversibleIterator<Set<Class<?>>> it = orderedMap.valueIterable().iterator();
        while (it.hasNext()) {
            this.exclusionSet.addAll(it.next());
        }
        this.nodeAncestryMap = new HashMap<>();
    }

    private void addNodes(ReversiblePeekingIterable<Node> reversiblePeekingIterable) {
        ReversiblePeekingIterator<Node> it = reversiblePeekingIterable.iterator();
        while (it.hasNext()) {
            this.nodeClassifier.add(it.next());
        }
    }

    private void removeNodes(ReversiblePeekingIterable<Node> reversiblePeekingIterable) {
        ReversiblePeekingIterator<Node> it = reversiblePeekingIterable.iterator();
        while (it.hasNext()) {
            this.nodeClassifier.add(it.next());
        }
    }

    private void validateLinked(Node node) {
        if (node.getNext() == null && node.getParent() == null) {
            throw new IllegalStateException("Added block " + node + " is not linked into the AST");
        }
    }

    private void validateUnlinked(Node node) {
        if (node.getNext() == null && node.getParent() == null) {
            return;
        }
        throw new IllegalStateException("Removed block " + node + " is still linked in the AST");
    }

    public <X> ReversibleIterable<X> getCategoryItems(Class<? extends X> cls, Set<Class<?>> set) {
        return this.nodeClassifier.getCategoryItems(cls, set);
    }

    public OrderedMap<Class<?>, Set<Class<?>>> getExclusionMap() {
        return this.exclusionMap;
    }

    public OrderedSet<Class<?>> getExclusionSet() {
        return this.exclusionSet;
    }

    public OrderedSet<Node> getItems() {
        return this.nodeClassifier.getItems();
    }

    public HashMap<Integer, BitSet> getNodeAncestryMap() {
        return this.nodeAncestryMap;
    }

    public ClassificationBag<Class<?>, Node> getNodeClassifier() {
        return this.nodeClassifier;
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeAdded(Node node) {
        validateLinked(node);
        this.nodeClassifier.add(node);
        NodeTracker nodeTracker = this.host;
        if (nodeTracker != null) {
            nodeTracker.nodeAdded(node);
        }
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeAddedWithChildren(Node node) {
        validateLinked(node);
        this.nodeClassifier.add(node);
        addNodes(node.getChildren());
        NodeTracker nodeTracker = this.host;
        if (nodeTracker != null) {
            nodeTracker.nodeAddedWithChildren(node);
        }
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeAddedWithDescendants(Node node) {
        validateLinked(node);
        this.nodeClassifier.add(node);
        addNodes(node.getDescendants());
        NodeTracker nodeTracker = this.host;
        if (nodeTracker != null) {
            nodeTracker.nodeAddedWithDescendants(node);
        }
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeRemoved(Node node) {
        nodeRemovedWithDescendants(node);
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeRemovedWithChildren(Node node) {
        nodeRemovedWithDescendants(node);
    }

    @Override // com.vladsch.flexmark.util.ast.NodeTracker
    public void nodeRemovedWithDescendants(Node node) {
        validateUnlinked(node);
        this.nodeClassifier.add(node);
        removeNodes(node.getDescendants());
        NodeTracker nodeTracker = this.host;
        if (nodeTracker != null) {
            nodeTracker.nodeRemovedWithDescendants(node);
        }
    }
}
