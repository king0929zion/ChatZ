package s;

import X3.y;
import b4.InterfaceC0905c;
import m4.C1285t;
import r.InterfaceC1563e1;
import x4.InterfaceC1942y;

/* renamed from: s.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1640d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1285t f14695h;

    /* renamed from: i, reason: collision with root package name */
    public int f14696i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C1643g f14697j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f14698k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.c f14699l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1563e1 f14700m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640d(C1643g c1643g, float f6, l4.c cVar, InterfaceC1563e1 interfaceC1563e1, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14697j = c1643g;
        this.f14698k = f6;
        this.f14699l = cVar;
        this.f14700m = interfaceC1563e1;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1640d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C1640d(this.f14697j, this.f14698k, this.f14699l, this.f14700m, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (r1 == r10) goto L22;
     */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, m4.t] */
    /* JADX WARN: Type inference failed for: r4v1, types: [s.c] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            s.g r0 = r12.f14697j
            s.l r6 = r0.a
            int r1 = r12.f14696i
            r7 = 0
            r8 = 2
            r2 = 1
            l4.c r9 = r12.f14699l
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L27
            if (r1 == r2) goto L1f
            if (r1 != r8) goto L17
            X3.a.e(r13)
            return r13
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            m4.t r1 = r12.f14695h
            X3.a.e(r13)
            r11 = r1
            r1 = r13
            goto L72
        L27:
            X3.a.e(r13)
            n.v r1 = r0.f14707b
            float r3 = r12.f14698k
            float r1 = n.AbstractC1318d.j(r1, r7, r3)
            float r1 = r6.f(r3, r1)
            boolean r4 = java.lang.Float.isNaN(r1)
            if (r4 == 0) goto L41
            java.lang.String r4 = "calculateApproachOffset returned NaN. Please use a valid value."
            u.AbstractC1734b.c(r4)
        L41:
            m4.t r11 = new m4.t
            r11.<init>()
            float r1 = java.lang.Math.abs(r1)
            float r3 = java.lang.Math.signum(r3)
            float r3 = r3 * r1
            r11.f12970c = r3
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r3)
            r9.f(r1)
            float r1 = r11.f12970c
            s.c r4 = new s.c
            r3 = 0
            r4.<init>()
            r12.f14695h = r11
            r12.f14696i = r2
            r2 = r1
            r.e1 r1 = r12.f14700m
            float r3 = r12.f14698k
            r5 = r12
            java.lang.Object r1 = s.C1643g.b(r0, r1, r2, r3, r4, r5)
            if (r1 != r10) goto L72
            goto Lae
        L72:
            n.m r1 = (n.C1336m) r1
            java.lang.Object r2 = r1.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r6.i(r2)
            boolean r3 = java.lang.Float.isNaN(r2)
            if (r3 == 0) goto L8d
            java.lang.String r3 = "calculateSnapOffset returned NaN. Please use a valid value."
            u.AbstractC1734b.c(r3)
        L8d:
            r11.f12970c = r2
            r3 = 30
            n.m r3 = n.AbstractC1318d.l(r1, r7, r7, r3)
            n.l r4 = r0.f14708c
            s.c r0 = new s.c
            r1 = 1
            r0.<init>()
            r1 = 0
            r12.f14695h = r1
            r12.f14696i = r8
            r1 = r0
            r.e1 r0 = r12.f14700m
            r5 = r1
            r1 = r2
            r6 = r12
            java.lang.Object r0 = s.AbstractC1647k.b(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r10) goto Laf
        Lae:
            return r10
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s.C1640d.r(java.lang.Object):java.lang.Object");
    }
}
