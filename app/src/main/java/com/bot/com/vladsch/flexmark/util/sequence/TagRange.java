package com.vladsch.flexmark.util.sequence;

/* loaded from: classes.dex */
public class TagRange extends Range {
    protected final String tag;

    public TagRange(CharSequence charSequence, Range range) {
        super(range);
        this.tag = String.valueOf(charSequence);
    }

    public static TagRange of(CharSequence charSequence, int i6, int i7) {
        return new TagRange(charSequence, i6, i7);
    }

    public String getTag() {
        return this.tag;
    }

    public TagRange withTag(CharSequence charSequence) {
        return this.tag.equals(String.valueOf(charSequence)) ? this : new TagRange(charSequence, getStart(), getEnd());
    }

    @Override // com.vladsch.flexmark.util.sequence.Range
    public TagRange withEnd(int i6) {
        return i6 == getEnd() ? this : new TagRange(getTag(), getStart(), i6);
    }

    @Override // com.vladsch.flexmark.util.sequence.Range
    public TagRange withRange(int i6, int i7) {
        return (i6 == getStart() && i7 == getEnd()) ? this : new TagRange(getTag(), i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.Range
    public TagRange withStart(int i6) {
        return i6 == getStart() ? this : new TagRange(getTag(), i6, getEnd());
    }

    public TagRange(CharSequence charSequence, int i6, int i7) {
        super(i6, i7);
        this.tag = String.valueOf(charSequence);
    }
}
