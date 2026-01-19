package com.vladsch.flexmark.util.sequence.builder;

import com.vladsch.flexmark.util.sequence.builder.ISequenceBuilder;
import java.lang.CharSequence;

/* loaded from: classes.dex */
public interface ISequenceBuilder<T extends ISequenceBuilder<T, S>, S extends CharSequence> extends Appendable {
    default T add(CharSequence charSequence) {
        return append(charSequence);
    }

    default T addAll(Iterable<? extends CharSequence> iterable) {
        return append(iterable);
    }

    @Override // java.lang.Appendable
    T append(char c6);

    T append(char c6, int i6);

    @Override // java.lang.Appendable
    T append(CharSequence charSequence, int i6, int i7);

    char charAt(int i6);

    T getBuilder();

    S getSingleBasedSequence();

    default boolean isEmpty() {
        return length() <= 0;
    }

    default boolean isNotEmpty() {
        return length() > 0;
    }

    int length();

    S toSequence();

    default T append(Iterable<? extends CharSequence> iterable) {
        for (CharSequence charSequence : iterable) {
            append(charSequence, 0, charSequence.length());
        }
        return this;
    }

    @Override // java.lang.Appendable
    default T append(CharSequence charSequence) {
        return charSequence != null ? append(charSequence, 0, charSequence.length()) : this;
    }

    default T append(CharSequence charSequence, int i6) {
        return charSequence != null ? append(charSequence, i6, charSequence.length()) : this;
    }
}
