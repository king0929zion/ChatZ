package com.vladsch.flexmark.util.misc;

import S.l;

/* loaded from: classes.dex */
public class MinMaxAvgFloat {
    private float min = Float.MAX_VALUE;
    private float max = Float.MIN_VALUE;
    private float total = l.f7374V;

    public void add(float f6) {
        this.total += f6;
        this.min = Math.min(this.min, f6);
        this.max = Math.max(this.max, f6);
    }

    public void diff(float f6, float f7) {
        add(f7 - f6);
    }

    public float getAvg(float f6) {
        return f6 == l.f7374V ? l.f7374V : this.total / f6;
    }

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public float getTotal() {
        return this.total;
    }

    public void add(MinMaxAvgFloat minMaxAvgFloat) {
        this.total += minMaxAvgFloat.total;
        this.min = Math.min(this.min, minMaxAvgFloat.min);
        this.max = Math.max(this.max, minMaxAvgFloat.max);
    }
}
