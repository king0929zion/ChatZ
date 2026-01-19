package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.RichSequence;

/* loaded from: classes.dex */
public final class RichSequenceBuilder implements ISequenceBuilder<RichSequenceBuilder, RichSequence> {
    private final StringBuilder segments;

    private RichSequenceBuilder() {
        this.segments = new StringBuilder();
    }

    public static RichSequenceBuilder emptyBuilder() {
        return new RichSequenceBuilder();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public char charAt(int i6) {
        return this.segments.charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public int length() {
        return this.segments.length();
    }

    public String toString() {
        return this.segments.toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public RichSequenceBuilder getBuilder() {
        return new RichSequenceBuilder();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public RichSequence getSingleBasedSequence() {
        return toSequence();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public RichSequence toSequence() {
        return RichSequence.of(this.segments);
    }

    public RichSequenceBuilder(int i6) {
        this.segments = new StringBuilder(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public RichSequenceBuilder append(CharSequence charSequence, int i6, int i7) {
        if (charSequence != null && charSequence.length() > 0 && i6 < i7) {
            this.segments.append(charSequence, i6, i7);
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public RichSequenceBuilder append(char c6) {
        this.segments.append(c6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public RichSequenceBuilder append(char c6, int i6) {
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return this;
            }
            this.segments.append(c6);
            i6 = i7;
        }
    }
}
