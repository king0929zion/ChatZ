package com.vladsch.flexmark.util.misc;

/* loaded from: classes.dex */
public class MinMaxAvgLong {
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;
    private long total = 0;

    public void add(long j3) {
        this.total += j3;
        this.min = Math.min(this.min, j3);
        this.max = Math.max(this.max, j3);
    }

    public void diff(long j3, long j4) {
        add(j4 - j3);
    }

    public long getAvg(long j3) {
        if (j3 == 0) {
            return 0L;
        }
        return this.total / j3;
    }

    public long getMax() {
        return this.max;
    }

    public long getMin() {
        return this.min;
    }

    public long getTotal() {
        return this.total;
    }

    public void add(MinMaxAvgLong minMaxAvgLong) {
        this.total += minMaxAvgLong.total;
        this.min = Math.min(this.min, minMaxAvgLong.min);
        this.max = Math.max(this.max, minMaxAvgLong.max);
    }
}
