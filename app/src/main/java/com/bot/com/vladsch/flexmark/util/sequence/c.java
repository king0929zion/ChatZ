package com.vladsch.flexmark.util.sequence;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements BiPredicate {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f11378b;

    public /* synthetic */ c(Predicate predicate, int i6) {
        this.a = i6;
        this.f11378b = predicate;
    }

    @Override // java.util.function.BiPredicate
    public final boolean test(Object obj, Object obj2) {
        boolean test;
        boolean test2;
        CharSequence charSequence = (CharSequence) obj2;
        switch (this.a) {
            case 0:
                test = this.f11378b.test(charSequence);
                return test;
            default:
                test2 = this.f11378b.test(charSequence);
                return test2;
        }
    }
}
