package Q;

import H0.C0158m;
import P2.C0348d;
import R.AbstractC0497b;
import S.AbstractC0537d;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0987j;
import h0.InterfaceC1041r;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import n.C1345t;
import p.AbstractC1464z;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public abstract class M1 {
    public static final float a = 240;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5368b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5369c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5370d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1345t f5371e;

    static {
        float f6 = S.m.a;
        f5368b = S.m.a;
        f5369c = 6;
        float f7 = AbstractC0537d.a;
        f5370d = AbstractC0537d.a;
        C1345t c1345t = S.q.a;
        f5371e = S.q.f7419b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(h0.InterfaceC1041r r28, long r29, float r31, long r32, int r34, float r35, T.C0626q r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.M1.a(h0.r, long, float, long, int, float, T.q, int, int):void");
    }

    public static final void b(final InterfaceC1193a interfaceC1193a, final InterfaceC1041r interfaceC1041r, final long j3, final long j4, int i6, float f6, l4.c cVar, C0626q c0626q, final int i7) {
        final int i8;
        final float f7;
        final l4.c cVar2;
        final int i9;
        float f8;
        l4.c cVar3;
        int i10;
        final l4.c cVar4;
        InterfaceC1041r interfaceC1041r2;
        final int i11;
        final float f9;
        c0626q.d0(-339970038);
        int i12 = i7 | (c0626q.h(interfaceC1193a) ? 4 : 2) | (c0626q.f(interfaceC1041r) ? 32 : 16) | (c0626q.e(j3) ? 256 : PegdownExtensions.FENCED_CODE_BLOCKS) | (c0626q.e(j4) ? 2048 : PegdownExtensions.ANCHORLINKS) | 745472;
        if (c0626q.S(i12 & 1, (599187 & i12) != 599186)) {
            c0626q.X();
            int i13 = i7 & 1;
            Object obj = C0616l.a;
            if (i13 == 0 || c0626q.B()) {
                i9 = G1.f5258b;
                f8 = G1.f5261e;
                boolean z5 = (((i12 & 896) ^ 384) > 256 && c0626q.e(j3)) || (i12 & 384) == 256;
                Object P5 = c0626q.P();
                if (z5 || P5 == obj) {
                    P5 = new l4.c() { // from class: Q.H1
                        @Override // l4.c
                        public final Object f(Object obj2) {
                            InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj2;
                            float min = Math.min(interfaceC1498d.e0(G1.f5260d), Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)));
                            float e02 = interfaceC1498d.e0(M1.f5369c);
                            float intBitsToFloat = (Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)) - min) / 2;
                            float f10 = intBitsToFloat > e02 ? e02 : intBitsToFloat;
                            e1.m layoutDirection = interfaceC1498d.getLayoutDirection();
                            e1.m mVar = e1.m.f11577e;
                            long j5 = j3;
                            int i14 = i9;
                            if (layoutDirection == mVar) {
                                long o02 = interfaceC1498d.o0();
                                C0158m g02 = interfaceC1498d.g0();
                                long j6 = g02.j();
                                g02.g().h();
                                try {
                                    ((C0987j) g02.f1972e).D(-1.0f, 1.0f, o02);
                                    G1.a(interfaceC1498d, i14, j5, min, f10);
                                } finally {
                                    AbstractC1135a.q(g02, j6);
                                }
                            } else {
                                G1.a(interfaceC1498d, i14, j5, min, f10);
                            }
                            return X3.y.a;
                        }
                    };
                    c0626q.m0(P5);
                }
                cVar3 = (l4.c) P5;
                i10 = i12 & (-3670017);
            } else {
                c0626q.V();
                i10 = i12 & (-3670017);
                i9 = i6;
                f8 = f6;
                cVar3 = cVar;
            }
            c0626q.q();
            boolean z6 = (i10 & 14) == 4;
            Object P6 = c0626q.P();
            if (z6 || P6 == obj) {
                P6 = new C0348d(9, interfaceC1193a);
                c0626q.m0(P6);
            }
            final InterfaceC1193a interfaceC1193a2 = (InterfaceC1193a) P6;
            InterfaceC1041r c6 = interfaceC1041r.c(AbstractC0497b.f6739d);
            boolean f10 = c0626q.f(interfaceC1193a2);
            Object P7 = c0626q.P();
            if (f10 || P7 == obj) {
                P7 = new O.x0(4, interfaceC1193a2);
                c0626q.m0(P7);
            }
            InterfaceC1041r k3 = v.t0.k(P0.n.a(c6, true, (l4.c) P7), a, f5368b);
            boolean f11 = c0626q.f(interfaceC1193a2) | ((((i10 & 7168) ^ 3072) > 2048 && c0626q.e(j4)) || (i10 & 3072) == 2048) | ((((i10 & 896) ^ 384) > 256 && c0626q.e(j3)) || (i10 & 384) == 256) | c0626q.f(cVar3);
            Object P8 = c0626q.P();
            if (f11 || P8 == obj) {
                cVar4 = cVar3;
                interfaceC1041r2 = k3;
                i11 = i9;
                f9 = f8;
                Object obj2 = new l4.c() { // from class: Q.I1
                    @Override // l4.c
                    public final Object f(Object obj3) {
                        InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L));
                        int i14 = i11;
                        float f12 = f9;
                        if (i14 != 0 && Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32))) {
                            f12 += interfaceC1498d.V(intBitsToFloat);
                        }
                        float V5 = f12 / interfaceC1498d.V(Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32)));
                        float floatValue = ((Number) interfaceC1193a2.b()).floatValue();
                        float min = Math.min(floatValue, V5) + floatValue;
                        if (min <= 1.0f) {
                            M1.d(interfaceC1498d, min, 1.0f, j4, intBitsToFloat, i14);
                        }
                        M1.d(interfaceC1498d, S.l.f7374V, floatValue, j3, intBitsToFloat, i14);
                        cVar4.f(interfaceC1498d);
                        return X3.y.a;
                    }
                };
                c0626q.m0(obj2);
                P8 = obj2;
            } else {
                cVar4 = cVar3;
                f9 = f8;
                interfaceC1041r2 = k3;
                i11 = i9;
            }
            AbstractC1464z.a(interfaceC1041r2, (l4.c) P8, c0626q, 0);
            i8 = i11;
            f7 = f9;
            cVar2 = cVar4;
        } else {
            c0626q.V();
            i8 = i6;
            f7 = f6;
            cVar2 = cVar;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(interfaceC1041r, j3, j4, i8, f7, cVar2, i7) { // from class: Q.J1

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5311e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ long f5312f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ long f5313g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ int f5314h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ float f5315i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ l4.c f5316j;

                @Override // l4.e
                public final Object m(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int J4 = T.r.J(1);
                    M1.b(InterfaceC1193a.this, this.f5311e, this.f5312f, this.f5313g, this.f5314h, this.f5315i, this.f5316j, (C0626q) obj3, J4);
                    return X3.y.a;
                }
            };
        }
    }

    public static final void c(InterfaceC1498d interfaceC1498d, float f6, float f7, long j3, q0.h hVar) {
        float f8 = 2;
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32)) - (f8 * (hVar.a / f8));
        interfaceC1498d.x(j3, f6, f7, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), hVar);
    }

    public static final void d(InterfaceC1498d interfaceC1498d, float f6, float f7, long j3, float f8, int i6) {
        float intBitsToFloat = Float.intBitsToFloat((int) (interfaceC1498d.c() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC1498d.c() & 4294967295L));
        float f9 = 2;
        float f10 = intBitsToFloat2 / f9;
        boolean z5 = interfaceC1498d.getLayoutDirection() == e1.m.f11576c;
        float f11 = (z5 ? f6 : 1.0f - f7) * intBitsToFloat;
        float f12 = (z5 ? f7 : 1.0f - f6) * intBitsToFloat;
        if (i6 == 0 || intBitsToFloat2 > intBitsToFloat) {
            interfaceC1498d.G(j3, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), f8, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f13 = f8 / f9;
        float f14 = intBitsToFloat - f13;
        if (f11 < f13) {
            f11 = f13;
        }
        if (f11 > f14) {
            f11 = f14;
        }
        if (f12 < f13) {
            f12 = f13;
        }
        if (f12 <= f14) {
            f14 = f12;
        }
        if (Math.abs(f7 - f6) > S.l.f7374V) {
            interfaceC1498d.G(j3, (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), f8, (r19 & 16) != 0 ? 0 : i6);
        }
    }
}
