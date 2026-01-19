package R;

import l4.InterfaceC1193a;

/* renamed from: R.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0508m implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6807c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0513s f6808e;

    public /* synthetic */ C0508m(C0513s c0513s, int i6) {
        this.f6807c = i6;
        this.f6808e = c0513s;
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
            int r0 = r5.f6807c
            switch(r0) {
                case 0: goto Lb0;
                case 1: goto L68;
                case 2: goto L1e;
                case 3: goto L17;
                default: goto L5;
            }
        L5:
            R.s r0 = r5.f6808e
            R.W r1 = r0.d()
            T.E r0 = r0.f6831h
            java.lang.Object r0 = r0.getValue()
            X3.i r2 = new X3.i
            r2.<init>(r1, r0)
            return r2
        L17:
            R.s r0 = r5.f6808e
            R.W r0 = r0.d()
            return r0
        L1e:
            R.s r0 = r5.f6808e
            R.W r1 = r0.d()
            T.g0 r2 = r0.f6830g
            java.lang.Object r2 = r2.getValue()
            float r1 = r1.d(r2)
            R.W r2 = r0.d()
            T.E r3 = r0.f6832i
            java.lang.Object r3 = r3.getValue()
            float r2 = r2.d(r3)
            float r2 = r2 - r1
            float r3 = java.lang.Math.abs(r2)
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L61
            r4 = 897988541(0x358637bd, float:1.0E-6)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L61
            float r0 = r0.f()
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
            R.s r0 = r5.f6808e
            T.g0 r1 = r0.f6835l
            T.g0 r2 = r0.f6830g
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto Laf
            T.c0 r1 = r0.f6833j
            float r1 = r1.g()
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto Lab
            java.lang.Object r2 = r2.getValue()
            R.W r0 = r0.d()
            float r3 = r0.d(r2)
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 != 0) goto L91
            goto La9
        L91:
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto L98
            goto La9
        L98:
            if (r4 >= 0) goto La2
            r3 = 1
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != 0) goto Laf
            goto La9
        La2:
            r3 = 0
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != 0) goto Laf
        La9:
            r1 = r2
            goto Laf
        Lab:
            java.lang.Object r1 = r2.getValue()
        Laf:
            return r1
        Lb0:
            R.s r0 = r5.f6808e
            T.g0 r1 = r0.f6835l
            T.g0 r2 = r0.f6830g
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto Ld6
            T.c0 r1 = r0.f6833j
            float r1 = r1.g()
            boolean r3 = java.lang.Float.isNaN(r1)
            if (r3 != 0) goto Ld2
            java.lang.Object r2 = r2.getValue()
            r3 = 0
            java.lang.Object r1 = r0.c(r1, r3, r2)
            goto Ld6
        Ld2:
            java.lang.Object r1 = r2.getValue()
        Ld6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: R.C0508m.b():java.lang.Object");
    }
}
