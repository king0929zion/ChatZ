package z;

import i1.AbstractC1087g;
import y.InterfaceC1978s;

/* renamed from: z.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2011i implements InterfaceC1978s {
    public final C2004b a;

    public C2011i(C2004b c2004b) {
        this.a = c2004b;
    }

    @Override // y.InterfaceC1978s
    public final int a() {
        return this.a.m();
    }

    @Override // y.InterfaceC1978s
    public final int b() {
        return Math.min(r0.m() - 1, ((C2009g) Y3.m.w0(this.a.l().a)).a);
    }

    @Override // y.InterfaceC1978s
    public final int c() {
        int i6;
        C2004b c2004b = this.a;
        if (c2004b.l().a.size() == 0) {
            return 0;
        }
        int l3 = AbstractC1087g.l(c2004b.l());
        int i7 = c2004b.l().f16152b + c2004b.l().f16153c;
        if (i7 != 0 && (i6 = l3 / i7) >= 1) {
            return i6;
        }
        return 1;
    }

    @Override // y.InterfaceC1978s
    public final boolean d() {
        return !this.a.l().a.isEmpty();
    }

    @Override // y.InterfaceC1978s
    public final int e() {
        return Math.max(0, this.a.f16052e);
    }
}
