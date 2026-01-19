package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.util.misc.Utils;

/* loaded from: classes.dex */
public class FormattedCounter {
    private int count;
    private final String delimiter;
    private final Boolean isLowercase;
    private final NumberFormat numberFormat;

    public FormattedCounter(NumberFormat numberFormat, Boolean bool, String str) {
        this.numberFormat = numberFormat;
        this.isLowercase = bool;
        this.delimiter = str;
        reset();
    }

    public int getCount() {
        return this.count;
    }

    public String getFormatted(boolean z5) {
        String str;
        String format = NumberFormat.getFormat(this.numberFormat, Utils.minLimit(this.count, 1));
        Boolean bool = this.isLowercase;
        if (bool != null) {
            format = bool.booleanValue() ? format.toLowerCase() : format.toUpperCase();
        }
        return (!z5 || (str = this.delimiter) == null || str.isEmpty()) ? format : B3.e.n(format, this.delimiter);
    }

    public int nextCount() {
        int i6 = this.count + 1;
        this.count = i6;
        return i6;
    }

    public void reset() {
        this.count = 0;
    }
}
