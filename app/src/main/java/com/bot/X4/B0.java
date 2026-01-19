package x4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class B0 extends C4.r {

    /* renamed from: h, reason: collision with root package name */
    public final ThreadLocal f15650h;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public B0(b4.InterfaceC0905c r3, b4.InterfaceC0910h r4) {
        /*
            r2 = this;
            x4.C0 r0 = x4.C0.f15651c
            b4.f r1 = r4.r(r0)
            if (r1 != 0) goto Ld
            b4.h r0 = r4.Y(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f15650h = r0
            b4.h r3 = r3.o()
            b4.d r0 = b4.C0906d.f11056c
            b4.f r3 = r3.r(r0)
            boolean r3 = r3 instanceof x4.AbstractC1939v
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = C4.a.l(r4, r3)
            C4.a.g(r4, r3)
            r2.r0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.B0.<init>(b4.c, b4.h):void");
    }

    public final boolean q0() {
        boolean z5 = this.threadLocalIsSet && this.f15650h.get() == null;
        this.f15650h.remove();
        return !z5;
    }

    public final void r0(InterfaceC0910h interfaceC0910h, Object obj) {
        this.threadLocalIsSet = true;
        this.f15650h.set(new X3.i(interfaceC0910h, obj));
    }

    @Override // C4.r, x4.l0
    public final void x(Object obj) {
        if (this.threadLocalIsSet) {
            X3.i iVar = (X3.i) this.f15650h.get();
            if (iVar != null) {
                C4.a.g((InterfaceC0910h) iVar.f9393c, iVar.f9394e);
            }
            this.f15650h.remove();
        }
        Object A5 = AbstractC1888A.A(obj);
        InterfaceC0905c interfaceC0905c = this.f713g;
        InterfaceC0910h o5 = interfaceC0905c.o();
        Object l3 = C4.a.l(o5, null);
        B0 G5 = l3 != C4.a.f680d ? AbstractC1888A.G(interfaceC0905c, o5, l3) : null;
        try {
            this.f713g.k(A5);
            if (G5 == null || G5.q0()) {
                C4.a.g(o5, l3);
            }
        } catch (Throwable th) {
            if (G5 == null || G5.q0()) {
                C4.a.g(o5, l3);
            }
            throw th;
        }
    }
}
