package com.vladsch.flexmark.util.sequence;

import com.vladsch.flexmark.util.misc.CharPredicate;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements CharPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i6) {
        this.a = i6;
    }

    @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
    public final boolean test(int i6) {
        boolean lambda$static$16;
        switch (this.a) {
            case 0:
                return SequenceUtils.a(i6);
            default:
                lambda$static$16 = CharPredicate.lambda$static$16(i6);
                return lambda$static$16;
        }
    }
}
