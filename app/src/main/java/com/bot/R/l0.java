package R;

import D.C0058b;
import I0.AbstractC0204q0;
import Q.D0;
import Q.d3;
import Q.t3;
import Q.u3;
import T.C0626q;
import T.C0627q0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.InterfaceC1027d;

/* loaded from: classes.dex */
public abstract class l0 {
    public static final float a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f6802b = 4;

    /* renamed from: c, reason: collision with root package name */
    public static final float f6803c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final float f6804d = 24;

    /* renamed from: e, reason: collision with root package name */
    public static final float f6805e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f6806f;

    static {
        float f6 = 16;
        a = f6;
        f6805e = f6;
        f6806f = f6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c8, code lost:
    
        if (r33 != false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x033a, code lost:
    
        if (r33 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0308, code lost:
    
        if (r33 != false) goto L204;
     */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x041a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x030e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final java.lang.CharSequence r45, final l4.e r46, final Q.d3 r47, final l4.f r48, final l4.e r49, final l4.e r50, final l4.e r51, final l4.e r52, final boolean r53, final boolean r54, final boolean r55, final t.C1682j r56, final v.InterfaceC1802i0 r57, final Q.b3 r58, final b0.C0873f r59, T.C0626q r60, final int r61, final int r62) {
        /*
            Method dump skipped, instructions count: 1909
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R.l0.a(java.lang.CharSequence, l4.e, Q.d3, l4.f, l4.e, l4.e, l4.e, l4.e, boolean, boolean, boolean, t.j, v.i0, Q.b3, b0.f, T.q, int, int):void");
    }

    public static final void b(long j3, S0.P p5, l4.e eVar, C0626q c0626q, int i6) {
        long j4;
        S0.P p6;
        l4.e eVar2;
        C0626q c0626q2;
        c0626q.d0(396611577);
        int i7 = (c0626q.e(j3) ? 4 : 2) | i6 | (c0626q.f(p5) ? 32 : 16);
        if ((i6 & 384) == 0) {
            i7 |= c0626q.h(eVar) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS;
        }
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            c0626q2 = c0626q;
            AbstractC0507l.d(j3, p5, eVar, c0626q2, i7 & 1022);
            j4 = j3;
            p6 = p5;
            eVar2 = eVar;
        } else {
            j4 = j3;
            p6 = p5;
            eVar2 = eVar;
            c0626q2 = c0626q;
            c0626q2.V();
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new c0(j4, p6, eVar2, i6, 1);
        }
    }

    public static final void c(long j3, l4.e eVar, C0626q c0626q, int i6) {
        c0626q.d0(590397809);
        int i7 = (c0626q.e(j3) ? 4 : 2) | i6 | (c0626q.h(eVar) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            T.r.a(Q.U.a.a(new o0.s(j3)), eVar, c0626q, (i7 & 112) | 8);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0058b(j3, eVar, i6);
        }
    }

    public static final InterfaceC1027d d(d3 d3Var) {
        if (d3Var instanceof d3) {
            return d3Var.a;
        }
        throw new IllegalArgumentException("Unknown position: " + d3Var);
    }

    public static final float e(C0626q c0626q) {
        long j3 = ((t3) c0626q.j(u3.a)).f6131l.f7613b.f7666c;
        long j4 = S.A.f7181l;
        if ((1095216660480L & j3) != 4294967296L) {
            j3 = j4;
        }
        return ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).A(j3) / 2;
    }

    public static final float f(C0626q c0626q) {
        float f6 = ((e1.f) c0626q.j(D0.f5207c)).f11571c;
        if (Float.isNaN(f6)) {
            f6 = 0;
        }
        float f7 = (f6 - S.x.f7496d) / 2;
        float f8 = 0;
        return f7 < f8 ? f8 : f7;
    }
}
