package com.vladsch.flexmark.util.sequence.builder;

/* loaded from: classes.dex */
public final class StringSequenceBuilder implements ISequenceBuilder<StringSequenceBuilder, CharSequence> {
    private final StringBuilder segments;

    private StringSequenceBuilder() {
        this.segments = new StringBuilder();
    }

    public static StringSequenceBuilder emptyBuilder() {
        return new StringSequenceBuilder();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public char charAt(int i6) {
        return this.segments.charAt(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public CharSequence getSingleBasedSequence() {
        return toSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public int length() {
        return this.segments.length();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public CharSequence toSequence() {
        return this.segments;
    }

    public String toString() {
        return this.segments.toString();
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public StringSequenceBuilder getBuilder() {
        return new StringSequenceBuilder();
    }

    public StringSequenceBuilder(int i6) {
        this.segments = new StringBuilder(i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public StringSequenceBuilder append(CharSequence charSequence, int i6, int i7) {
        if (charSequence != null && charSequence.length() > 0 && i6 < i7) {
            this.segments.append(charSequence, i6, i7);
        }
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder, java.lang.Appendable
    public StringSequenceBuilder append(char c6) {
        this.segments.append(c6);
        return this;
    }

    @Override // com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder
    public StringSequenceBuilder append(char c6, int i6) {
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
