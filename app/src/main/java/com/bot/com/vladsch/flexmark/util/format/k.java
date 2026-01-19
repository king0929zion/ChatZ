package com.vladsch.flexmark.util.format;

import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.misc.CharPredicate;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements CharPredicate {
    public final /* synthetic */ int a;

    public /* synthetic */ k(int i6) {
        this.a = i6;
    }

    @Override // com.vladsch.flexmark.util.misc.CharPredicate, java.util.function.IntPredicate
    public final boolean test(int i6) {
        switch (this.a) {
            case 0:
                return TableFormatOptions.a(i6);
            case 1:
                return CharPredicate.k(i6);
            case 2:
                return CharPredicate.z(i6);
            case 3:
                return CharPredicate.m(i6);
            case 4:
                return CharPredicate.H(i6);
            case AbstractC1787b.f15290g /* 5 */:
                return CharPredicate.w(i6);
            case 6:
                return CharPredicate.C(i6);
            case 7:
                return CharPredicate.v(i6);
            case 8:
                return CharPredicate.D(i6);
            case AbstractC1787b.f15287d /* 9 */:
                return CharPredicate.E(i6);
            case AbstractC1787b.f15289f /* 10 */:
                return CharPredicate.a(i6);
            case 11:
                return CharPredicate.B(i6);
            case 12:
                return CharPredicate.G(i6);
            case 13:
                return CharPredicate.p(i6);
            case 14:
                return CharPredicate.I(i6);
            case 15:
                return CharPredicate.f(i6);
            case PegdownExtensions.AUTOLINKS /* 16 */:
                return CharPredicate.q(i6);
            case 17:
                return CharPredicate.c(i6);
            case 18:
                return CharPredicate.F(i6);
            case 19:
                return CharPredicate.j(i6);
            case 20:
                return CharPredicate.t(i6);
            case 21:
                return CharPredicate.s(i6);
            case 22:
                return CharPredicate.d(i6);
            case 23:
                return CharPredicate.i(i6);
            case 24:
                return CharPredicate.r(i6);
            case 25:
                return CharPredicate.o(i6);
            case 26:
                return CharPredicate.h(i6);
            case 27:
                return CharPredicate.g(i6);
            default:
                return CharPredicate.x(i6);
        }
    }
}
