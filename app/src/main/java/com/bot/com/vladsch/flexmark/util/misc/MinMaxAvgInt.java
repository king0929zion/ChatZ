package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.util.format.TableCell;

/* loaded from: classes.dex */
public class MinMaxAvgInt {
    private int min = TableCell.NOT_TRACKED;
    private int max = Integer.MIN_VALUE;
    private int total = 0;

    public void add(int i6) {
        this.total += i6;
        this.min = Math.min(this.min, i6);
        this.max = Math.max(this.max, i6);
    }

    public void diff(int i6, int i7) {
        add(i7 - i6);
    }

    public int getAvg(int i6) {
        if (i6 == 0) {
            return 0;
        }
        return this.total / i6;
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    public int getTotal() {
        return this.total;
    }

    public void add(MinMaxAvgInt minMaxAvgInt) {
        this.total += minMaxAvgInt.total;
        this.min = Math.min(this.min, minMaxAvgInt.min);
        this.max = Math.max(this.max, minMaxAvgInt.max);
    }
}
