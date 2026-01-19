package D;

import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.InterfaceC1041r;

/* renamed from: D.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0095u {
    public static final /* synthetic */ int a = 0;

    static {
        float f6 = 40;
        Y4.l.h(f6, f6);
    }

    public static final void a(final X0.v vVar, final l4.c cVar, final InterfaceC1041r interfaceC1041r, boolean z5, final S0.P p5, C0096u0 c0096u0, C0094t0 c0094t0, final int i6, F0.F f6, l4.c cVar2, final o0.N n3, final C0873f c0873f, C0626q c0626q, final int i7) {
        final boolean z6;
        final C0096u0 c0096u02;
        final C0094t0 c0094t02;
        final F0.F f7;
        final l4.c cVar3;
        C0096u0 c0096u03;
        C0094t0 c0094t03;
        F0.F f8;
        l4.c cVar4;
        boolean z7;
        c0626q.d0(-971111025);
        int i8 = i7 | (c0626q.f(vVar) ? 4 : 2) | (c0626q.h(cVar) ? 32 : 16) | (c0626q.f(interfaceC1041r) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS) | 27648 | (c0626q.f(p5) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS) | 114819072;
        int i9 = (c0626q.f(n3) ? 16384 : 8192) | 200118;
        if (c0626q.S(i8 & 1, ((306783379 & i8) == 306783378 && (74899 & i9) == 74898) ? false : true)) {
            c0626q.X();
            int i10 = i7 & 1;
            C0602e c0602e = C0616l.a;
            if (i10 == 0 || c0626q.B()) {
                c0096u03 = C0096u0.f1177c;
                c0094t03 = C0094t0.f1176b;
                Object P5 = c0626q.P();
                if (P5 == c0602e) {
                    P5 = new A2.a(3);
                    c0626q.m0(P5);
                }
                l4.c cVar5 = (l4.c) P5;
                f8 = X0.C.a;
                cVar4 = cVar5;
                z7 = true;
            } else {
                c0626q.V();
                z7 = z5;
                c0096u03 = c0096u0;
                c0094t03 = c0094t0;
                f8 = f6;
                cVar4 = cVar2;
            }
            c0626q.q();
            X0.k a6 = c0096u03.a(false);
            boolean z8 = ((i8 & 14) == 4) | ((i8 & 112) == 32);
            Object P6 = c0626q.P();
            if (z8 || P6 == c0602e) {
                P6 = new C0086p(0, vVar, cVar);
                c0626q.m0(P6);
            }
            C0094t0 c0094t04 = c0094t03;
            C0096u0 c0096u04 = c0096u03;
            F0.F f9 = f8;
            AbstractC0090r0.g(vVar, (l4.c) P6, interfaceC1041r, p5, f9, cVar4, null, n3, true, i6, 1, a6, c0094t04, z7, false, c0873f, c0626q, ((i8 >> 6) & 7168) | (i8 & 910) | 1794048 | ((i9 << 9) & 29360128), 224640);
            f7 = f9;
            cVar3 = cVar4;
            c0094t02 = c0094t04;
            z6 = z7;
            c0096u02 = c0096u04;
        } else {
            c0626q.V();
            z6 = z5;
            c0096u02 = c0096u0;
            c0094t02 = c0094t0;
            f7 = f6;
            cVar3 = cVar2;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(cVar, interfaceC1041r, z6, p5, c0096u02, c0094t02, i6, f7, cVar3, n3, c0873f, i7) { // from class: D.q

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ l4.c f1135e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f1136f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ boolean f1137g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ S0.P f1138h;

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ C0096u0 f1139i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ C0094t0 f1140j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ int f1141k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ F0.F f1142l;

                /* renamed from: m, reason: collision with root package name */
                public final /* synthetic */ l4.c f1143m;

                /* renamed from: n, reason: collision with root package name */
                public final /* synthetic */ o0.N f1144n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ C0873f f1145o;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0095u.a(X0.v.this, this.f1135e, this.f1136f, this.f1137g, this.f1138h, this.f1139i, this.f1140j, this.f1141k, this.f1142l, this.f1143m, this.f1144n, this.f1145o, (C0626q) obj, T.r.J(805306369));
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r31, final l4.c r32, final h0.InterfaceC1041r r33, boolean r34, boolean r35, final S0.P r36, D.C0096u0 r37, D.C0094t0 r38, final boolean r39, int r40, int r41, F0.F r42, l4.c r43, final t.C1682j r44, final o0.N r45, final b0.C0873f r46, T.C0626q r47, final int r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.AbstractC0095u.b(java.lang.String, l4.c, h0.r, boolean, boolean, S0.P, D.u0, D.t0, boolean, int, int, F0.F, l4.c, t.j, o0.N, b0.f, T.q, int, int, int):void");
    }
}
