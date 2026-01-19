package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.data.DataHolder;
import com.vladsch.flexmark.util.data.DataKeyBase;
import com.vladsch.flexmark.util.misc.BitFieldSet;
import com.vladsch.flexmark.util.sequence.BasedOptionsHolder;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class BasedOptionsSequence implements CharSequence, BasedOptionsHolder {
    private final CharSequence chars;
    private final int optionFlags;
    private final DataHolder options;

    private BasedOptionsSequence(CharSequence charSequence, int i6, DataHolder dataHolder) {
        this.chars = charSequence;
        this.optionFlags = (~((dataHolder == null || BasedOptionsHolder.SEGMENTED_STATS.get(dataHolder) == null) ? BasedOptionsHolder.F_COLLECT_SEGMENTED_STATS : 0)) & i6;
        this.options = dataHolder;
    }

    public static BasedOptionsSequence of(CharSequence charSequence, BitFieldSet<BasedOptionsHolder.Options> bitFieldSet) {
        return new BasedOptionsSequence(charSequence, bitFieldSet.toInt(), null);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean allOptions(int i6) {
        return (this.optionFlags & i6) == i6;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public boolean anyOptions(int i6) {
        return (i6 & this.optionFlags) != 0;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        return this.chars.charAt(i6);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return this.chars.chars();
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return this.chars.codePoints();
    }

    public boolean equals(Object obj) {
        return this.chars.equals(obj);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public <T> T getOption(DataKeyBase<T> dataKeyBase) {
        return dataKeyBase.get(this.options);
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public int getOptionFlags() {
        return this.optionFlags;
    }

    @Override // com.vladsch.flexmark.util.sequence.BasedOptionsHolder
    public DataHolder getOptions() {
        return this.options;
    }

    public int hashCode() {
        return this.chars.hashCode();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.chars.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i6, int i7) {
        return this.chars.subSequence(i6, i7);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.chars.toString();
    }

    public static BasedOptionsSequence of(CharSequence charSequence, int i6) {
        return new BasedOptionsSequence(charSequence, i6, null);
    }

    public static BasedOptionsSequence of(CharSequence charSequence, BitFieldSet<BasedOptionsHolder.Options> bitFieldSet, DataHolder dataHolder) {
        return new BasedOptionsSequence(charSequence, bitFieldSet.toInt(), dataHolder);
    }

    public static BasedOptionsSequence of(CharSequence charSequence, int i6, DataHolder dataHolder) {
        return new BasedOptionsSequence(charSequence, i6, dataHolder);
    }
}
