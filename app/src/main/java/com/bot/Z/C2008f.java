package z;

import c4.EnumC0927a;
import i4.AbstractC1118b;
import p.x0;
import r.X0;
import y.i0;
import y.m0;

/* renamed from: z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2008f implements i0 {
    public final /* synthetic */ C2004b a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f16105b;

    public C2008f(C2004b c2004b, boolean z5) {
        this.a = c2004b;
        this.f16105b = z5;
    }

    @Override // y.i0
    public final int a() {
        C2004b c2004b = this.a;
        return (int) (c2004b.l().f16155e == X0.f14183c ? c2004b.l().g() & 4294967295L : c2004b.l().g() >> 32);
    }

    @Override // y.i0
    public final float b() {
        return (float) AbstractC1118b.k(this.a);
    }

    @Override // y.i0
    public final int c() {
        C2004b c2004b = this.a;
        return (-c2004b.l().f16156f) + c2004b.l().f16154d;
    }

    @Override // y.i0
    public final float d() {
        C2004b c2004b = this.a;
        return (float) H.a(c2004b.l(), c2004b.m());
    }

    @Override // y.i0
    public final P0.c e() {
        boolean z5 = this.f16105b;
        C2004b c2004b = this.a;
        return z5 ? new P0.c(c2004b.m(), 1) : new P0.c(1, c2004b.m());
    }

    @Override // y.i0
    public final Object f(int i6, m0 m0Var) {
        C2004b c2004b = this.a;
        Object a = c2004b.a(x0.f13823c, new D(c2004b, i6, null), m0Var);
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (a != enumC0927a) {
            a = yVar;
        }
        return a == enumC0927a ? a : yVar;
    }
}
