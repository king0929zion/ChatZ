package com.vladsch.flexmark.util.misc;

/* loaded from: classes.dex */
public class MinMaxAvgDouble {
    private double min = Double.MAX_VALUE;
    private double max = Double.MIN_VALUE;
    private double total = 0.0d;

    public void add(double d6) {
        this.total += d6;
        this.min = Math.min(this.min, d6);
        this.max = Math.max(this.max, d6);
    }

    public void diff(double d6, double d7) {
        add(d7 - d6);
    }

    public double getAvg(double d6) {
        if (d6 == 0.0d) {
            return 0.0d;
        }
        return this.total / d6;
    }

    public double getMax() {
        return this.max;
    }

    public double getMin() {
        return this.min;
    }

    public double getTotal() {
        return this.total;
    }

    public void add(MinMaxAvgDouble minMaxAvgDouble) {
        this.total += minMaxAvgDouble.total;
        this.min = Math.min(this.min, minMaxAvgDouble.min);
        this.max = Math.max(this.max, minMaxAvgDouble.max);
    }
}
