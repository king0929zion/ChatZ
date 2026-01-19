package I;

import D.C0091s;
import D.e1;
import F0.C0120h;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import X3.y;
import Y3.C;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.AbstractC0874g;
import b0.C0873f;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.C0987j;
import h0.C1038o;
import h0.InterfaceC1041r;
import i1.AbstractC1094n;
import i1.C1079C;
import l4.InterfaceC1193a;
import o0.C1400k;
import q.AbstractC1493e;
import q.AbstractC1494f;
import t0.AbstractC1688b;
import v.AbstractC1806l;
import v.t0;

/* loaded from: classes.dex */
public abstract class p {
    public static final C1079C a = new C1079C(true, 14);

    public static final void a(G.g gVar, G.c cVar, C0626q c0626q, int i6) {
        C0626q c0626q2;
        Context context;
        c0626q.d0(1904307118);
        int i7 = (c0626q.f(gVar) ? 4 : 2) | i6 | (c0626q.h(cVar) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            if (Build.VERSION.SDK_INT >= 28) {
                c0626q.b0(-1009482584);
                context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
                c0626q.p(false);
            } else {
                c0626q.b0(-1009433480);
                c0626q.p(false);
                context = null;
            }
            boolean h3 = c0626q.h(cVar) | ((i7 & 14) == 4) | c0626q.h(context);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                P5 = new C0091s(cVar, context, gVar, 5);
                c0626q.m0(P5);
            }
            c0626q2 = c0626q;
            AbstractC1494f.b(null, null, (l4.c) P5, c0626q2, 0, 3);
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new m(gVar, cVar, i6);
        }
    }

    public static final void b(final int i6, final long j3, C0626q c0626q, final int i7) {
        final int i8;
        int i9;
        C0627q0 t5;
        l4.e eVar;
        c0626q.d0(-1240244237);
        if ((i7 & 6) == 0) {
            i8 = i6;
            i9 = i7 | (c0626q.d(i8) ? 4 : 2);
        } else {
            i8 = i6;
            i9 = i7;
        }
        if ((i7 & 48) == 0) {
            i9 |= c0626q.e(j3) ? 32 : 16;
        }
        if (c0626q.S(i9 & 1, (i9 & 19) != 18)) {
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            boolean f6 = ((i9 & 14) == 4) | c0626q.f(context);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (f6 || P5 == obj) {
                P5 = Integer.valueOf(context.obtainStyledAttributes(new int[]{i8}).getResourceId(0, -1));
                c0626q.m0(P5);
            }
            int intValue = ((Number) P5).intValue();
            if (intValue == -1) {
                t5 = c0626q.t();
                if (t5 != null) {
                    final int i10 = 1;
                    eVar = new l4.e() { // from class: I.l
                        @Override // l4.e
                        public final Object m(Object obj2, Object obj3) {
                            int i11 = i10;
                            C0626q c0626q2 = (C0626q) obj2;
                            ((Integer) obj3).getClass();
                            switch (i11) {
                                case 0:
                                    p.b(i8, j3, c0626q2, T.r.J(i7 | 1));
                                    break;
                                default:
                                    p.b(i8, j3, c0626q2, T.r.J(i7 | 1));
                                    break;
                            }
                            return y.a;
                        }
                    };
                    t5.f8193d = eVar;
                }
                return;
            }
            AbstractC1688b L5 = C.L(intValue, 0, c0626q);
            boolean z5 = (i9 & 112) == 32;
            Object P6 = c0626q.P();
            if (z5 || P6 == obj) {
                P6 = j3 == 16 ? null : new C1400k(j3, 5);
                c0626q.m0(P6);
            }
            AbstractC1806l.a(l0.h.h(t0.j(C1038o.a, AbstractC1493e.f13933j), L5, null, C0120h.f1476b, S.l.f7374V, (C1400k) P6, 22), c0626q, 0);
        } else {
            c0626q.V();
        }
        t5 = c0626q.t();
        if (t5 != null) {
            final int i11 = 0;
            eVar = new l4.e() { // from class: I.l
                @Override // l4.e
                public final Object m(Object obj2, Object obj3) {
                    int i112 = i11;
                    C0626q c0626q2 = (C0626q) obj2;
                    ((Integer) obj3).getClass();
                    switch (i112) {
                        case 0:
                            p.b(i6, j3, c0626q2, T.r.J(i7 | 1));
                            break;
                        default:
                            p.b(i6, j3, c0626q2, T.r.J(i7 | 1));
                            break;
                    }
                    return y.a;
                }
            };
            t5.f8193d = eVar;
        }
    }

    public static final void c(G.g gVar, K.e eVar, InterfaceC1193a interfaceC1193a, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(-2040393164);
        if ((i6 & 6) == 0) {
            i7 = ((i6 & 8) == 0 ? c0626q.f(gVar) : c0626q.h(gVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= (i6 & 64) == 0 ? c0626q.f(eVar) : c0626q.h(eVar) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        boolean z5 = false;
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            boolean z6 = (i7 & 112) == 32 || ((i7 & 64) != 0 && c0626q.f(eVar));
            Object P5 = c0626q.P();
            C0602e c0602e = C0616l.a;
            if (z6 || P5 == c0602e) {
                P5 = new r(new C0987j(new D.r(3, eVar, interfaceC1193a), 13));
                c0626q.m0(P5);
            }
            r rVar = (r) P5;
            if ((i7 & 14) == 4 || ((i7 & 8) != 0 && c0626q.h(gVar))) {
                z5 = true;
            }
            Object P6 = c0626q.P();
            if (z5 || P6 == c0602e) {
                P6 = new A.b(gVar, 7);
                c0626q.m0(P6);
            }
            AbstractC1094n.a(rVar, (InterfaceC1193a) P6, a, AbstractC0874g.c(1315155414, new m(0, eVar, gVar), c0626q), c0626q, 3456, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new e1(gVar, eVar, interfaceC1193a, i6, 1);
        }
    }

    public static final void d(InterfaceC1041r interfaceC1041r, C0873f c0873f, C0626q c0626q, int i6) {
        int i7;
        c0626q.d0(1392105195);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.f(interfaceC1041r) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(c0873f) ? 32 : 16;
        }
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            Y4.l.j(interfaceC1041r, K.g.a, c0873f, c0626q, ((i7 << 6) & 7168) | (i7 & 14) | 432);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new j(interfaceC1041r, c0873f, i6, 2);
        }
    }
}
