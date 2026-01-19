package r;

import l4.InterfaceC1193a;

/* renamed from: r.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1591o implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14407c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1606t f14408e;

    public /* synthetic */ C1591o(C1606t c1606t, int i6) {
        this.f14407c = i6;
        this.f14408e = c1606t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
    
        if (r0 > 0.999999f) goto L17;
     */
    @Override // l4.InterfaceC1193a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r5 = this;
            int r0 = r5.f14407c
            switch(r0) {
                case 0: goto L68;
                case 1: goto L1e;
                case 2: goto L17;
                default: goto L5;
            }
        L5:
            r.t r0 = r5.f14408e
            r.E r1 = r0.b()
            T.E r0 = r0.f14471e
            java.lang.Object r0 = r0.getValue()
            X3.i r2 = new X3.i
            r2.<init>(r1, r0)
            return r2
        L17:
            r.t r0 = r5.f14408e
            r.E r0 = r0.b()
            return r0
        L1e:
            r.t r0 = r5.f14408e
            r.E r1 = r0.b()
            T.g0 r2 = r0.f14470d
            java.lang.Object r2 = r2.getValue()
            float r1 = r1.c(r2)
            r.E r2 = r0.b()
            T.E r3 = r0.f14471e
            java.lang.Object r3 = r3.getValue()
            float r2 = r2.c(r3)
            float r2 = r2 - r1
            float r3 = java.lang.Math.abs(r2)
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L61
            r4 = 897988541(0x358637bd, float:1.0E-6)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L61
            float r0 = r0.d()
            float r0 = r0 - r1
            float r0 = r0 / r2
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 >= 0) goto L5a
            r0 = 0
            goto L63
        L5a:
            r1 = 1065353199(0x3f7fffef, float:0.999999)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L63
        L61:
            r0 = 1065353216(0x3f800000, float:1.0)
        L63:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L68:
            r.t r0 = r5.f14408e
            T.c0 r1 = r0.f14472f
            T.g0 r2 = r0.f14474h
            T.g0 r3 = r0.f14469c
            java.lang.Object r2 = r2.getValue()
            if (r2 != 0) goto L97
            float r2 = r1.g()
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 != 0) goto L93
            r.E r0 = r0.b()
            float r1 = r1.g()
            java.lang.Object r2 = r0.a(r1)
            if (r2 != 0) goto L97
            java.lang.Object r2 = r3.getValue()
            goto L97
        L93:
            java.lang.Object r2 = r3.getValue()
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1591o.b():java.lang.Object");
    }
}
