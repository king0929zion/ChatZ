package com.vladsch.flexmark.util.ast;

import com.vladsch.flexmark.util.data.DataKey;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public abstract class NodeRepository<T> implements Map<String, T> {
    protected final KeepType keepType;
    protected final ArrayList<T> nodeList = new ArrayList<>();
    protected final Map<String, T> nodeMap = new HashMap();

    public NodeRepository(KeepType keepType) {
        this.keepType = keepType == null ? KeepType.LOCKED : keepType;
    }

    public static <T> boolean transferReferences(NodeRepository<T> nodeRepository, NodeRepository<T> nodeRepository2, boolean z5, Map<String, String> map) {
        boolean z6 = false;
        for (Map.Entry<String, T> entry : nodeRepository2.entrySet()) {
            String key = entry.getKey();
            if (map != null) {
                map.getOrDefault(key, key);
            }
            if (!z5 || !nodeRepository.containsKey(key)) {
                nodeRepository.put2(key, (String) entry.getValue());
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Map
    public void clear() {
        if (this.keepType == KeepType.LOCKED) {
            throw new IllegalStateException("Not allowed to modify LOCKED repository");
        }
        this.nodeMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.nodeMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.nodeMap.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, T>> entrySet() {
        return this.nodeMap.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.nodeMap.equals(obj);
    }

    @Override // java.util.Map
    public T get(Object obj) {
        return this.nodeMap.get(obj);
    }

    public abstract DataKey<? extends NodeRepository<T>> getDataKey();

    public T getFromRaw(CharSequence charSequence) {
        return this.nodeMap.get(normalizeKey(charSequence));
    }

    public abstract DataKey<KeepType> getKeepDataKey();

    public abstract Set<T> getReferencedElements(Node node);

    public Collection<T> getValues() {
        return this.nodeMap.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.nodeMap.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.nodeMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.nodeMap.keySet();
    }

    public String normalizeKey(CharSequence charSequence) {
        return charSequence.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(String str, Object obj) {
        return put2(str, (String) obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends T> map) {
        KeepType keepType = this.keepType;
        if (keepType == KeepType.LOCKED) {
            throw new IllegalStateException("Not allowed to modify LOCKED repository");
        }
        if (keepType == KeepType.LAST) {
            this.nodeMap.putAll(map);
            return;
        }
        for (String str : map.keySet()) {
            this.nodeMap.put(str, map.get(str));
        }
    }

    public T putRawKey(CharSequence charSequence, T t5) {
        return put2(normalizeKey(charSequence), (String) t5);
    }

    @Override // java.util.Map
    public T remove(Object obj) {
        if (this.keepType != KeepType.LOCKED) {
            return this.nodeMap.remove(obj);
        }
        throw new IllegalStateException("Not allowed to modify LOCKED repository");
    }

    @Override // java.util.Map
    public int size() {
        return this.nodeMap.size();
    }

    @SafeVarargs
    public final void visitNodes(Node node, Consumer<Node> consumer, Class<? extends Node>... clsArr) {
        NodeVisitor nodeVisitor = new NodeVisitor();
        for (Class<? extends Node> cls : clsArr) {
            Objects.requireNonNull(consumer);
            nodeVisitor.addHandler(new VisitHandler(cls, new com.vladsch.flexmark.ext.emoji.a(consumer, 7)));
        }
        nodeVisitor.visit(node);
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public T put2(String str, T t5) {
        T t6;
        this.nodeList.add(t5);
        KeepType keepType = this.keepType;
        if (keepType != KeepType.LOCKED) {
            if (keepType != KeepType.LAST && (t6 = this.nodeMap.get(str)) != null) {
                if (this.keepType != KeepType.FAIL) {
                    return t6;
                }
                throw new IllegalStateException(AbstractC1135a.f("Duplicate key ", str));
            }
            return this.nodeMap.put(str, t5);
        }
        throw new IllegalStateException("Not allowed to modify LOCKED repository");
    }

    @Override // java.util.Map
    public List<T> values() {
        return this.nodeList;
    }
}
