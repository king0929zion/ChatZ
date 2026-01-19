package r;

import A4.C0013n;
import H0.AbstractC0157l;
import H0.C0158m;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import e1.InterfaceC0961c;
import m4.AbstractC1276k;
import n.C1347v;
import s.AbstractC1647k;
import s.C1643g;
import x4.AbstractC1888A;

/* renamed from: r.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1588n extends AbstractC1592o0 {

    /* renamed from: L, reason: collision with root package name */
    public C1606t f14392L;

    /* renamed from: M, reason: collision with root package name */
    public X0 f14393M;

    /* renamed from: N, reason: collision with root package name */
    public Boolean f14394N;

    /* renamed from: O, reason: collision with root package name */
    public C1643g f14395O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC1619x0 f14396P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC0961c f14397Q;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, m4.t] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h1(r.C1588n r5, float r6, d4.c r7) {
        /*
            boolean r0 = r7 instanceof r.C1576j
            if (r0 == 0) goto L13
            r0 = r7
            r.j r0 = (r.C1576j) r0
            int r1 = r0.f14352j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14352j = r1
            goto L18
        L13:
            r.j r0 = new r.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14350h
            int r1 = r0.f14352j
            r2 = 2
            if (r1 == 0) goto L36
            r5 = 1
            if (r1 == r5) goto L32
            if (r1 != r2) goto L2a
            m4.t r5 = r0.f14349g
            X3.a.e(r7)
            goto L71
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            X3.a.e(r7)
            return r7
        L36:
            X3.a.e(r7)
            r.t r7 = r5.f14392L
            r7.getClass()
            m4.t r7 = new m4.t
            r7.<init>()
            r7.f12970c = r6
            r.t r1 = r5.f14392L
            r.l r3 = new r.l
            r4 = 0
            r3.<init>(r5, r7, r6, r4)
            r0.f14349g = r7
            r0.f14352j = r2
            p.C0 r5 = r1.f14468b
            A4.n r6 = new A4.n
            r6.<init>(r4, r3, r1)
            r5.getClass()
            p.A0 r1 = new p.A0
            p.x0 r2 = p.x0.f13823c
            r1.<init>(r2, r5, r6, r4)
            java.lang.Object r5 = x4.AbstractC1888A.l(r1, r0)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L6b
            goto L6d
        L6b:
            X3.y r5 = X3.y.a
        L6d:
            if (r5 != r6) goto L70
            return r6
        L70:
            r5 = r7
        L71:
            float r5 = r5.f12970c
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1588n.h1(r.n, float, d4.c):java.lang.Object");
    }

    @Override // h0.AbstractC1040q
    public final void E0() {
        j1(this.f14395O);
    }

    @Override // r.AbstractC1592o0
    public final Object T0(C1586m0 c1586m0, C1589n0 c1589n0) {
        C1606t c1606t = this.f14392L;
        A3.f fVar = new A3.f(c1586m0, this, (InterfaceC0905c) null);
        p.C0 c02 = c1606t.f14468b;
        C0013n c0013n = new C0013n(null, fVar, c1606t);
        c02.getClass();
        Object l3 = AbstractC1888A.l(new p.A0(p.x0.f13823c, c02, c0013n, null), c1589n0);
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (l3 != enumC0927a) {
            l3 = yVar;
        }
        return l3 == enumC0927a ? l3 : yVar;
    }

    @Override // r.AbstractC1592o0
    public final void Y0(long j3) {
    }

    @Override // r.AbstractC1592o0
    public final void Z0(C1543U c1543u) {
        if (this.f11819q) {
            AbstractC1888A.y(A0(), null, new C1585m(this, c1543u, null), 3);
        }
    }

    @Override // H0.InterfaceC0155j, H0.w0
    public final void b() {
        L();
        if (this.f11819q) {
            InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
            InterfaceC0961c interfaceC0961c2 = this.f14397Q;
            if (interfaceC0961c2 == null || !interfaceC0961c2.equals(interfaceC0961c)) {
                this.f14397Q = interfaceC0961c;
                j1(this.f14395O);
            }
        }
    }

    @Override // r.AbstractC1592o0
    public final boolean e1() {
        return this.f14392L.f14474h.getValue() != null;
    }

    public final boolean i1() {
        Boolean bool = this.f14394N;
        if (bool == null) {
            return AbstractC0157l.v(this).f1715D == e1.m.f11577e && this.f14393M == X0.f14184e;
        }
        AbstractC1276k.c(bool);
        return bool.booleanValue();
    }

    public final void j1(C1643g c1643g) {
        if (c1643g == null) {
            n.D0 d02 = AbstractC1552b.a;
            p.O0 o02 = AbstractC1552b.f14237b;
            InterfaceC0961c interfaceC0961c = AbstractC0157l.v(this).f1714C;
            this.f14397Q = interfaceC0961c;
            C1606t c1606t = this.f14392L;
            C1347v c1347v = AbstractC1573i.f14347b;
            C0158m c0158m = new C0158m(c1606t, o02, new Y3.l(interfaceC0961c, 17), 11);
            float f6 = AbstractC1647k.a;
            c1643g = new C1643g(c0158m, c1347v, d02);
        }
        this.f14396P = c1643g;
    }
}
