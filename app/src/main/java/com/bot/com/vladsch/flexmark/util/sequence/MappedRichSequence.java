package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import com.vladsch.flexmark.util.sequence.builder.RichSequenceBuilder;
import com.vladsch.flexmark.util.sequence.mappers.CharMapper;

/* loaded from: classes.dex */
public class MappedRichSequence extends IRichSequenceBase<RichSequence> implements RichSequence, MappedSequence<RichSequence> {
    private final RichSequence base;
    private final CharMapper mapper;

    private MappedRichSequence(CharMapper charMapper, RichSequence richSequence) {
        super(0);
        this.base = richSequence;
        this.mapper = charMapper;
    }

    public static RichSequence mappedOf(CharMapper charMapper, RichSequence richSequence) {
        return mappedOf(charMapper, richSequence, 0, richSequence.length());
    }

    @Override // java.lang.CharSequence
    public char charAt(int i6) {
        return this.mapper.map(this.base.charAt(i6));
    }

    public RichSequence getBaseSequence() {
        return this.base;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public <B extends ISequenceBuilder<B, RichSequence>> B getBuilder() {
        return RichSequenceBuilder.emptyBuilder();
    }

    @Override // com.vladsch.flexmark.util.sequence.MappedSequence
    public CharMapper getCharMapper() {
        return this.mapper;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.base.length();
    }

    public static RichSequence mappedOf(CharMapper charMapper, RichSequence richSequence, int i6) {
        return mappedOf(charMapper, richSequence, i6, richSequence.length());
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence[] emptyArray() {
        return this.base.emptyArray();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.vladsch.flexmark.util.sequence.MappedSequence
    public RichSequence getCharSequence() {
        return this.base;
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence nullSequence() {
        return this.base.nullSequence();
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence sequenceOf(CharSequence charSequence, int i6, int i7) {
        if (charSequence instanceof MappedRichSequence) {
            return (i6 == 0 && i7 == charSequence.length()) ? (RichSequence) charSequence : ((RichSequence) charSequence).subSequence(i6, i7).toMapped(this.mapper);
        }
        return new MappedRichSequence(this.mapper, this.base.sequenceOf(charSequence, i6, i7));
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence
    public RichSequence toMapped(CharMapper charMapper) {
        return charMapper == CharMapper.IDENTITY ? this : new MappedRichSequence(this.mapper.andThen(charMapper), this.base);
    }

    public static RichSequence mappedOf(CharMapper charMapper, RichSequence richSequence, int i6, int i7) {
        if (!(richSequence instanceof MappedRichSequence)) {
            return new MappedRichSequence(charMapper, richSequence.subSequence(i6, i7));
        }
        if (i6 != 0 || i7 != richSequence.length()) {
            richSequence = richSequence.subSequence(i6, i7);
        }
        return richSequence.toMapped(charMapper);
    }

    @Override // com.vladsch.flexmark.util.sequence.IRichSequence, java.lang.CharSequence
    public RichSequence subSequence(int i6, int i7) {
        RichSequence subSequence = this.base.subSequence(i6, i7);
        return subSequence == this.base ? this : new MappedRichSequence(this.mapper, subSequence);
    }
}
