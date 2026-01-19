package Q;

import F0.C0125m;
import I0.AbstractC0204q0;
import S.AbstractC0536c;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.C1038o;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public abstract class M {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f5362b = 20;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5363c;

    static {
        float f6 = 2;
        a = f6;
        f5363c = f6;
    }

    public static final void a(final boolean z5, final InterfaceC1041r interfaceC1041r, final boolean z6, G g3, C0626q c0626q, final int i6) {
        final G g6;
        G a6;
        c0626q.d0(-1406741137);
        int i7 = i6 | (c0626q.g(z5) ? 4 : 2) | 204800;
        if (c0626q.S(i7 & 1, (74899 & i7) != 74898)) {
            c0626q.X();
            if ((i6 & 1) == 0 || c0626q.B()) {
                a6 = H.a(c0626q);
            } else {
                c0626q.V();
                a6 = g3;
            }
            c0626q.q();
            float floor = (float) Math.floor(((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).e0(H.a));
            R0.a aVar = z5 ? R0.a.f6850c : R0.a.f6851e;
            c0626q.b0(2066218639);
            c0626q.p(false);
            c(aVar, null, new q0.h(floor, S.l.f7374V, 2, 0, 26), new q0.h(floor, S.l.f7374V, 0, 0, 30), interfaceC1041r, z6, a6, c0626q, 12804096);
            g6 = a6;
        } else {
            c0626q.V();
            g6 = g3;
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new l4.e(z5, interfaceC1041r, z6, g6, i6) { // from class: Q.I

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f5283c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1041r f5284e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f5285f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ G f5286g;

                @Override // l4.e
                public final Object m(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int J4 = T.r.J(3505);
                    M.a(this.f5283c, this.f5284e, this.f5285f, this.f5286g, (C0626q) obj, J4);
                    return X3.y.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(boolean r23, R0.a r24, h0.InterfaceC1041r r25, Q.G r26, final q0.h r27, final q0.h r28, T.C0626q r29, int r30) {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.M.b(boolean, R0.a, h0.r, Q.G, q0.h, q0.h, T.q, int):void");
    }

    public static final void c(R0.a aVar, InterfaceC1193a interfaceC1193a, q0.h hVar, q0.h hVar2, InterfaceC1041r interfaceC1041r, boolean z5, G g3, C0626q c0626q, int i6) {
        int i7;
        G g6;
        R0.a aVar2;
        InterfaceC1041r interfaceC1041r2;
        c0626q.d0(-406243761);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.d(aVar.ordinal()) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.h(interfaceC1193a) ? 32 : 16;
        }
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(hVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if ((i6 & 3072) == 0) {
            i7 |= c0626q.h(hVar2) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 16384 : 8192;
        }
        if ((196608 & i6) == 0) {
            i7 |= c0626q.g(z5) ? PegdownExtensions.SUPPRESS_INLINE_HTML : PegdownExtensions.SUPPRESS_HTML_BLOCKS;
        }
        if ((1572864 & i6) == 0) {
            g6 = g3;
            i7 |= c0626q.f(g6) ? PegdownExtensions.RELAXEDHRULES : PegdownExtensions.SUBSCRIPT;
        } else {
            g6 = g3;
        }
        if ((12582912 & i6) == 0) {
            i7 |= c0626q.f(null) ? PegdownExtensions.EXTANCHORLINKS_WRAP : PegdownExtensions.EXTANCHORLINKS;
        }
        if (c0626q.S(i7 & 1, (4793491 & i7) != 4793490)) {
            c0626q.X();
            if ((i6 & 1) != 0 && !c0626q.B()) {
                c0626q.V();
            }
            c0626q.q();
            InterfaceC1041r interfaceC1041r3 = C1038o.a;
            if (interfaceC1193a != null) {
                aVar2 = aVar;
                interfaceC1041r2 = B.c.d(aVar2, S1.a(AbstractC0536c.f7251d / 2, 4, 0L, false), z5, new P0.i(1), interfaceC1193a);
            } else {
                aVar2 = aVar;
                interfaceC1041r2 = interfaceC1041r3;
            }
            if (interfaceC1193a != null) {
                C0125m c0125m = D0.a;
                interfaceC1041r3 = L0.a;
            }
            InterfaceC1041r y5 = AbstractC1787b.y(interfaceC1041r.c(interfaceC1041r3).c(interfaceC1041r2), a);
            int i8 = ((i7 >> 15) & 14) | ((i7 << 3) & 112) | ((i7 >> 9) & 7168);
            int i9 = i7 << 6;
            b(z5, aVar2, y5, g6, hVar, hVar2, c0626q, i8 | (57344 & i9) | (i9 & 458752));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new J(aVar, interfaceC1193a, hVar, hVar2, interfaceC1041r, z5, g3, i6, 0);
        }
    }
}
