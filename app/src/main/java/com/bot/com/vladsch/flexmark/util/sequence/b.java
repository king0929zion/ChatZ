package com.vladsch.flexmark.util.sequence;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IRichSequenceBase f11375b;

    public /* synthetic */ b(IRichSequenceBase iRichSequenceBase, int i6) {
        this.a = i6;
        this.f11375b = iRichSequenceBase;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return this.f11375b.matches((CharSequence) obj);
            case 1:
                return this.f11375b.startsWithIgnoreCase((CharSequence) obj);
            case 2:
                return this.f11375b.endsWithIgnoreCase((CharSequence) obj);
            case 3:
                return this.f11375b.endsWith((CharSequence) obj);
            default:
                return this.f11375b.startsWith((CharSequence) obj);
        }
    }
}
