package h1;

import F0.s0;
import H0.AbstractC0157l;
import H0.C0150g;
import H0.InterfaceC0152h;
import H0.J;
import I0.AbstractC0204q0;
import I0.M;
import T.C0616l;
import T.C0622o;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.InterfaceC0846u;
import com.vladsch.flexmark.parser.PegdownExtensions;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.AbstractC1040q;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m0.B;

/* loaded from: classes.dex */
public abstract class k {
    public static final j a = new Object();

    public static final void a(l4.c cVar, InterfaceC1041r interfaceC1041r, l4.c cVar2, C0626q c0626q, int i6) {
        c0626q.d0(-1783766393);
        int i7 = (c0626q.h(cVar) ? 4 : 2) | i6 | (c0626q.f(interfaceC1041r) ? 32 : 16) | (c0626q.h(cVar2) ? PegdownExtensions.WIKILINKS : PegdownExtensions.FENCED_CODE_BLOCKS);
        if (c0626q.S(i7 & 1, (i7 & 147) != 146)) {
            b(cVar, interfaceC1041r, cVar2, c0626q, ((i7 << 6) & 57344) | (i7 & 14) | 3072 | (i7 & 112));
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new M(cVar, interfaceC1041r, cVar2, i6, 2);
        }
    }

    public static final void b(l4.c cVar, InterfaceC1041r interfaceC1041r, l4.c cVar2, C0626q c0626q, int i6) {
        int i7;
        U1.e eVar;
        InterfaceC0846u interfaceC0846u;
        e1.m mVar;
        InterfaceC0961c interfaceC0961c;
        Object obj = C1048b.f11832i;
        c0626q.d0(-180024211);
        if ((i6 & 6) == 0) {
            i7 = (c0626q.h(cVar) ? 4 : 2) | i6;
        } else {
            i7 = i6;
        }
        if ((i6 & 48) == 0) {
            i7 |= c0626q.f(interfaceC1041r) ? 32 : 16;
        }
        int i8 = i7 | 384;
        if ((i6 & 3072) == 0) {
            i8 |= c0626q.h(obj) ? 2048 : PegdownExtensions.ANCHORLINKS;
        }
        if ((i6 & 24576) == 0) {
            i8 |= c0626q.h(cVar2) ? 16384 : 8192;
        }
        if (c0626q.S(i8 & 1, (i8 & 9363) != 9362)) {
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, interfaceC1041r.c(q.a).c(B.a).c(v.a).c(t.a));
            InterfaceC0961c interfaceC0961c2 = (InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h);
            e1.m mVar2 = (e1.m) c0626q.j(AbstractC0204q0.f2364n);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC0846u interfaceC0846u2 = (InterfaceC0846u) c0626q.j(D1.e.a);
            U1.e eVar2 = (U1.e) c0626q.j(V1.a.a);
            c0626q.b0(1314774735);
            int i9 = i8 & 14;
            int hashCode2 = Long.hashCode(c0626q.f8164T);
            Context context = (Context) c0626q.j(AndroidCompositionLocals_androidKt.f10780b);
            C0622o D4 = T.r.D(c0626q);
            e0.f fVar = (e0.f) c0626q.j(e0.h.a);
            View view = (View) c0626q.j(AndroidCompositionLocals_androidKt.f10784f);
            boolean h3 = c0626q.h(context) | ((((i9 & 14) ^ 6) > 4 && c0626q.f(cVar)) || (i9 & 6) == 4) | c0626q.h(D4) | c0626q.h(fVar) | c0626q.d(hashCode2) | c0626q.h(view);
            Object P5 = c0626q.P();
            if (h3 || P5 == C0616l.a) {
                eVar = eVar2;
                interfaceC0846u = interfaceC0846u2;
                mVar = mVar2;
                interfaceC0961c = interfaceC0961c2;
                Object mVar3 = new m(context, cVar, D4, fVar, hashCode2, view);
                c0626q.m0(mVar3);
                P5 = mVar3;
            } else {
                interfaceC0846u = interfaceC0846u2;
                eVar = eVar2;
                mVar = mVar2;
                interfaceC0961c = interfaceC0961c2;
            }
            InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P5;
            c0626q.W(125, 1, null, null);
            c0626q.f8182r = true;
            InterfaceC0846u interfaceC0846u3 = interfaceC0846u;
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            InterfaceC0152h.a.getClass();
            T.r.G(c0626q, l3, C0150g.f1927e);
            T.r.G(c0626q, c6, l.f11879h);
            T.r.G(c0626q, interfaceC0961c, l.f11880i);
            T.r.G(c0626q, interfaceC0846u3, l.f11881j);
            T.r.G(c0626q, eVar, l.f11882k);
            T.r.G(c0626q, mVar, l.f11883l);
            T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
            T.r.G(c0626q, cVar2, l.f11877f);
            T.r.G(c0626q, obj, l.f11878g);
            c0626q.p(true);
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new s0(cVar, interfaceC1041r, cVar2, i6, 1);
        }
    }

    public static final View c(AbstractC1040q abstractC1040q) {
        x xVar = AbstractC0157l.v(abstractC1040q.f11806c).f1748s;
        View interopView = xVar != null ? xVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(x xVar, J j3) {
        long U5 = j3.f1721J.f1916c.U(0L);
        int round = Math.round(Float.intBitsToFloat((int) (U5 >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (U5 & 4294967295L)));
        xVar.layout(round, round2, xVar.getMeasuredWidth() + round, xVar.getMeasuredHeight() + round2);
    }

    public static final x e(J j3) {
        x xVar = j3.f1748s;
        if (xVar != null) {
            return xVar;
        }
        throw B3.e.f("Required value was null.");
    }
}
