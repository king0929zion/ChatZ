package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;

/* loaded from: classes.dex */
public interface RichSequence extends IRichSequence<RichSequence> {
    public static final RichSequence NULL = RichSequenceImpl.create(FlexmarkHtmlConverter.DEFAULT_NODE, 0, 0);
    public static final RichSequence[] EMPTY_ARRAY = new RichSequence[0];

    static RichSequence of(CharSequence charSequence) {
        return RichSequenceImpl.create(charSequence, 0, charSequence.length());
    }

    static RichSequence ofSpaces(int i6) {
        return of(RepeatedSequence.ofSpaces(i6));
    }

    static RichSequence repeatOf(char c6, int i6) {
        return of(RepeatedSequence.repeatOf(String.valueOf(c6), 0, i6));
    }

    static RichSequence of(CharSequence charSequence, int i6) {
        return RichSequenceImpl.create(charSequence, i6, charSequence.length());
    }

    static RichSequence repeatOf(CharSequence charSequence, int i6) {
        return of(RepeatedSequence.repeatOf(charSequence, 0, charSequence.length() * i6));
    }

    static RichSequence of(CharSequence charSequence, int i6, int i7) {
        return RichSequenceImpl.create(charSequence, i6, i7);
    }

    static RichSequence repeatOf(CharSequence charSequence, int i6, int i7) {
        return of(RepeatedSequence.repeatOf(charSequence, i6, i7));
    }
}
