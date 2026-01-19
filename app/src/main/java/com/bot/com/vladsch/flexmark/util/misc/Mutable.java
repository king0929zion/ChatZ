package com.vladsch.flexmark.util.misc;

import com.vladsch.flexmark.util.misc.Immutable;
import com.vladsch.flexmark.util.misc.Mutable;

/* loaded from: classes.dex */
public interface Mutable<M extends Mutable<M, I>, I extends Immutable<I, M>> {
    I toImmutable();
}
