package com.vladsch.flexmark.util.misc;

import java.util.BitSet;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CharPredicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11367b;

    public /* synthetic */ d(Object obj, int i6) {
        this.a = i6;
        this.f11367b = obj;
    }

    @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
    public final boolean test(int i6) {
        boolean lambda$anyOf$36;
        boolean lambda$negate$30;
        switch (this.a) {
            case 0:
                lambda$anyOf$36 = CharPredicate.lambda$anyOf$36((String) this.f11367b, i6);
                return lambda$anyOf$36;
            case 1:
                return ((BitSet) this.f11367b).get(i6);
            default:
                lambda$negate$30 = ((CharPredicate) this.f11367b).lambda$negate$30(i6);
                return lambda$negate$30;
        }
    }
}
