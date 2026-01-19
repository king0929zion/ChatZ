package com.vladsch.flexmark.util.collection;

import java.util.HashMap;

/* loaded from: classes.dex */
public class TwoWayHashMap<F, S> {
    private HashMap<F, S> fToSMap = new HashMap<>();
    private HashMap<S, F> sToFMap = new HashMap<>();

    public void add(F f6, S s5) {
        this.fToSMap.put(f6, s5);
        this.sToFMap.put(s5, f6);
    }

    public F getFirst(S s5) {
        return this.sToFMap.get(s5);
    }

    public S getSecond(F f6) {
        return this.fToSMap.get(f6);
    }
}
