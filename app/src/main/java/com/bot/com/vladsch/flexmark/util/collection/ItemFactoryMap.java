package com.vladsch.flexmark.util.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes.dex */
public class ItemFactoryMap<I, P> implements Map<Function<P, I>, I> {
    protected final HashMap<Function<P, I>, I> itemMap;
    protected final P param;

    public ItemFactoryMap(P p5) {
        this(p5, 0);
    }

    @Override // java.util.Map
    public void clear() {
        this.itemMap.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.itemMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.itemMap.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Function<P, I>, I>> entrySet() {
        return this.itemMap.entrySet();
    }

    @Override // java.util.Map
    public I get(Object obj) {
        if (obj instanceof Function) {
            return getItem((Function) obj);
        }
        return null;
    }

    public I getItem(Function<P, I> function) {
        I i6 = this.itemMap.get(function);
        if (i6 != null) {
            return i6;
        }
        I apply = function.apply(this.param);
        this.itemMap.put(function, apply);
        return apply;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.itemMap.isEmpty();
    }

    @Override // java.util.Map
    public Set<Function<P, I>> keySet() {
        return this.itemMap.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Function<P, Function<P, I>>) obj, (Function<P, I>) obj2);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Function<P, I>, ? extends I> map) {
        this.itemMap.putAll(map);
    }

    @Override // java.util.Map
    public I remove(Object obj) {
        return this.itemMap.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.itemMap.size();
    }

    @Override // java.util.Map
    public Collection<I> values() {
        return this.itemMap.values();
    }

    public ItemFactoryMap(P p5, int i6) {
        this.itemMap = new HashMap<>(i6);
        this.param = p5;
    }

    public I put(Function<P, I> function, I i6) {
        return this.itemMap.put(function, i6);
    }
}
