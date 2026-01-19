package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.RichSequenceBuilder;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;

/* loaded from: classes.dex */
public class RichSequenceImpl extends IRichSequenceBase<RichSequence> implements RichSequence {
    final CharSequence charSequence;

    private RichSequenceImpl(CharSequence charSequence) {
        super(charSequence instanceof String ? charSequence.hashCode() : 0);
        this.charSequence = charSequence;
    }

    public static RichSequence create(CharSequence charSequence, int i6, int i7) {
        return charSequence instanceof RichSequence ? ((RichSequence) charSequence).subSequence(i6, i7) : charSequence != null ? (i6 == 0 && i7 == charSequence.length()) ? new RichSequenceImpl(charSequence) : new RichSequenceImpl(charSequence.subSequence(i6, i7)) : RichSequence.NULL;
    }

    @Deprecated
    public static RichSequence of(CharSequence charSequence) {
        return RichSequence.of(charSequence, 0, charSequence.length());
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        char charAt = this.charSequence.charAt(i6);
        return charAt == 0 ? SequenceUtils.ENC_NUL : charAt;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public <B extends ISequenceBuilder<B, RichSequence>> B getBuilder() {
        return RichSequenceBuilder.emptyBuilder();
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.charSequence.length();
    }

    @Deprecated
    public static RichSequence of(CharSequence charSequence, int i6) {
        return RichSequence.of(charSequence, i6, charSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence[] emptyArray() {
        return RichSequence.EMPTY_ARRAY;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence nullSequence() {
        return RichSequence.NULL;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence sequenceOf(CharSequence charSequence, int i6, int i7) {
        return of(charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence toMapped(CharMapper charMapper) {
        return MappedRichSequence.mappedOf(charMapper, this);
    }

    @Deprecated
    public static RichSequence of(CharSequence charSequence, int i6, int i7) {
        return RichSequence.of(charSequence, i6, i7);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public RichSequence subSequence(int i6, int i7) {
        SequenceUtils.validateStartEnd(i6, i7, length());
        return (i6 == 0 && i7 == this.charSequence.length()) ? this : create(this.charSequence, i6, i7);
    }
}
