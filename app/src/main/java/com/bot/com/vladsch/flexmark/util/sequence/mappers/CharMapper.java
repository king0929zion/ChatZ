package com.vladsch.flexmark.util.sequence.mappers;

import java.util.Objects;

/* loaded from: classes.dex */
public interface CharMapper {
    public static final CharMapper IDENTITY = new Object();

    static CharMapper identity() {
        return IDENTITY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default char lambda$andThen$2(CharMapper charMapper, char c6) {
        return charMapper.map(map(c6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default char lambda$compose$1(CharMapper charMapper, char c6) {
        return map(charMapper.map(c6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ char lambda$static$0(char c6) {
        return c6;
    }

    default CharMapper andThen(CharMapper charMapper) {
        Objects.requireNonNull(charMapper);
        return charMapper == IDENTITY ? this : new a(this, charMapper, 1);
    }

    default CharMapper compose(CharMapper charMapper) {
        Objects.requireNonNull(charMapper);
        return charMapper == IDENTITY ? this : new a(this, charMapper, 0);
    }

    char map(char c6);
}
