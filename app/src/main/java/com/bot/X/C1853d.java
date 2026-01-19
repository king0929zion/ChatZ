package x;

import T.C0601d0;
import i4.AbstractC1121e;
import r.X0;
import y.InterfaceC1978s;

/* renamed from: x.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853d implements InterfaceC1978s {
    public final s a;

    public C1853d(s sVar) {
        this.a = sVar;
    }

    @Override // y.InterfaceC1978s
    public final int a() {
        return this.a.g().f15504n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // y.InterfaceC1978s
    public final int b() {
        return Math.min(a() - 1, ((m) Y3.m.w0(this.a.g().f15501k)).a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // y.InterfaceC1978s
    public final int c() {
        int i6;
        s sVar = this.a;
        if (sVar.g().f15501k.isEmpty()) {
            return 0;
        }
        l g3 = sVar.g();
        int g6 = (int) (g3.f15505o == X0.f14183c ? g3.g() & 4294967295L : g3.g() >> 32);
        int p5 = AbstractC1121e.p(sVar.g());
        if (p5 != 0 && (i6 = g6 / p5) >= 1) {
            return i6;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection, java.lang.Object] */
    @Override // y.InterfaceC1978s
    public final boolean d() {
        return !this.a.g().f15501k.isEmpty();
    }

    @Override // y.InterfaceC1978s
    public final int e() {
        return Math.max(0, ((C0601d0) this.a.f15548e.f378b).g());
    }
}
