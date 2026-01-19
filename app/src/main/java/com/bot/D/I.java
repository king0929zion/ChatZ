package D;

import F0.InterfaceC0134w;
import n0.C1354c;

/* loaded from: classes.dex */
public final /* synthetic */ class I implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f781c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O.N0 f782e;

    public /* synthetic */ I(O.N0 n02, int i6) {
        this.f781c = i6;
        this.f782e = n02;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1354c c1354c;
        C0098v0 c0098v0;
        InterfaceC0134w c6;
        float f6;
        char c7;
        float f7;
        long j3;
        float f8;
        InterfaceC0134w c8;
        InterfaceC0134w c9;
        InterfaceC0134w c10;
        InterfaceC0134w c11;
        int i6 = this.f781c;
        O.N0 n02 = this.f782e;
        switch (i6) {
            case 0:
                return new Y(n02, 0);
            case 1:
                n02.r();
                return X3.y.a;
            default:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                C0098v0 c0098v02 = n02.f3995d;
                if (c0098v02 != null) {
                    if (c0098v02.f1197p) {
                        c0098v02 = null;
                    }
                    if (c0098v02 != null) {
                        X0.p pVar = n02.f3993b;
                        long j4 = n02.n().f9125b;
                        int i7 = S0.O.f7611c;
                        int b5 = pVar.b((int) (j4 >> 32));
                        int b6 = n02.f3993b.b((int) (n02.n().f9125b & 4294967295L));
                        C0098v0 c0098v03 = n02.f3995d;
                        long j5 = 0;
                        long U5 = (c0098v03 == null || (c11 = c0098v03.c()) == null) ? 0L : c11.U(n02.l(true));
                        C0098v0 c0098v04 = n02.f3995d;
                        if (c0098v04 != null && (c10 = c0098v04.c()) != null) {
                            j5 = c10.U(n02.l(false));
                        }
                        C0098v0 c0098v05 = n02.f3995d;
                        if (c0098v05 == null || (c9 = c0098v05.c()) == null) {
                            f6 = 0.0f;
                            c7 = ' ';
                            f7 = 0.0f;
                        } else {
                            f6 = 0.0f;
                            c7 = ' ';
                            f7 = Float.intBitsToFloat((int) (c9.U((Float.floatToRawIntBits(c0098v02.d() != null ? r5.a.c(b5).f13295b : 0.0f) & 4294967295L) | (Float.floatToRawIntBits(S.l.f7374V) << 32)) & 4294967295L));
                        }
                        C0098v0 c0098v06 = n02.f3995d;
                        if (c0098v06 == null || (c8 = c0098v06.c()) == null) {
                            j3 = 4294967295L;
                            f8 = f6;
                        } else {
                            j3 = 4294967295L;
                            f8 = Float.intBitsToFloat((int) (c8.U((Float.floatToRawIntBits(f6) << c7) | (Float.floatToRawIntBits(c0098v02.d() != null ? r6.a.c(b6).f13295b : f6) & 4294967295L)) & 4294967295L));
                        }
                        int i8 = (int) (U5 >> c7);
                        int i9 = (int) (j5 >> c7);
                        c1354c = new C1354c(Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), Math.min(f7, f8), Math.max(Float.intBitsToFloat(i8), Float.intBitsToFloat(i9)), (c0098v02.a.f773g.a() * 25) + Math.max(Float.intBitsToFloat((int) (U5 & j3)), Float.intBitsToFloat((int) (j5 & j3))));
                        c0098v0 = n02.f3995d;
                        if (c0098v0 != null || (c6 = c0098v0.c()) == null) {
                            return null;
                        }
                        return J.i.e(c1354c, c6, interfaceC0134w);
                    }
                }
                c1354c = C1354c.f13294e;
                c0098v0 = n02.f3995d;
                if (c0098v0 != null) {
                }
                return null;
        }
    }
}
