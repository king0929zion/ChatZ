package x;

import P2.C0361j0;
import T.C0601d0;
import T.E;
import X3.y;
import c4.EnumC0927a;
import r.X0;
import y.i0;
import y.m0;

/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1852c implements i0 {
    public final E a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f15443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f15444c;

    public C1852c(s sVar, boolean z5) {
        this.f15443b = sVar;
        this.f15444c = z5;
        this.a = T.r.s(new C0361j0(sVar, 5));
    }

    @Override // y.i0
    public final int a() {
        s sVar = this.f15443b;
        return (int) (sVar.g().f15505o == X0.f14183c ? sVar.g().g() & 4294967295L : sVar.g().g() >> 32);
    }

    @Override // y.i0
    public final float b() {
        s sVar = this.f15443b;
        return (((C0601d0) sVar.f15548e.f378b).g() * 500) + ((C0601d0) sVar.f15548e.f379c).g();
    }

    @Override // y.i0
    public final int c() {
        s sVar = this.f15443b;
        return (-sVar.g().f15502l) + sVar.g().f15506p;
    }

    @Override // y.i0
    public final float d() {
        s sVar = this.f15443b;
        int g3 = ((C0601d0) sVar.f15548e.f378b).g();
        int g6 = ((C0601d0) sVar.f15548e.f379c).g();
        return sVar.d() ? (g3 * 500) + g6 + 100 : (g3 * 500) + g6;
    }

    @Override // y.i0
    public final P0.c e() {
        boolean z5 = this.f15444c;
        E e6 = this.a;
        return z5 ? new P0.c(((Number) e6.getValue()).intValue(), 1) : new P0.c(1, ((Number) e6.getValue()).intValue());
    }

    @Override // y.i0
    public final Object f(int i6, m0 m0Var) {
        Object i7 = s.i(this.f15443b, i6, m0Var);
        return i7 == EnumC0927a.f11114c ? i7 : y.a;
    }
}
