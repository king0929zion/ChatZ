package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.sequence.mappers.CharMapper;
import java.lang.CharSequence;

/* loaded from: classes.dex */
public interface MappedSequence<T extends CharSequence> extends CharSequence {
    CharMapper getCharMapper();

    T getCharSequence();
}
