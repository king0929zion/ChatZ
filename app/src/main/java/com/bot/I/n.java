package I;

import Q.R1;
import Q.V;
import Q.o3;
import Q.q3;
import T.C0607g0;
import T.C0626q;
import X3.y;
import android.app.RemoteAction;
import android.graphics.drawable.Drawable;
import b0.AbstractC0874g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.InterfaceC1041r;
import n.AbstractC1318d;
import n.C0;
import n.C1327h0;
import n.E0;
import n.u0;
import n.y0;

/* loaded from: classes.dex */
public final class n implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2107c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2108e;

    public /* synthetic */ n(Object obj, int i6) {
        this.f2107c = i6;
        this.f2108e = obj;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f2107c) {
            case 0:
                long j3 = ((o0.s) obj).a;
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= c0626q.e(j3) ? 4 : 2;
                }
                if (c0626q.S(intValue & 1, (intValue & 19) != 18)) {
                    p.b(((G.d) ((G.b) this.f2108e)).f1638c, j3, c0626q, (intValue << 3) & 112);
                } else {
                    c0626q.V();
                }
                return y.a;
            case 1:
                long j4 = ((o0.s) obj).a;
                C0626q c0626q2 = (C0626q) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    w.a.a((Drawable) this.f2108e, c0626q2, 48);
                } else {
                    c0626q2.V();
                }
                return y.a;
            case 2:
                long j5 = ((o0.s) obj).a;
                C0626q c0626q3 = (C0626q) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if (c0626q3.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    w.a.b(((RemoteAction) this.f2108e).getIcon(), c0626q3, 48);
                } else {
                    c0626q3.V();
                }
                return y.a;
            case 3:
                C0626q c0626q4 = (C0626q) obj2;
                int intValue4 = ((Number) obj3).intValue();
                if (c0626q4.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    ((l4.e) this.f2108e).m(c0626q4, 0);
                } else {
                    c0626q4.V();
                }
                return y.a;
            case 4:
                q3 q3Var = (q3) obj;
                C0626q c0626q5 = (C0626q) obj2;
                int intValue5 = ((Number) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= (intValue5 & 8) == 0 ? c0626q5.f(q3Var) : c0626q5.h(q3Var) ? 4 : 2;
                }
                if (c0626q5.S(intValue5 & 1, (intValue5 & 19) != 18)) {
                    o3.a(q3Var, null, S.l.f7374V, null, 0L, 0L, S.l.f7374V, S.l.f7374V, AbstractC0874g.c(-999924215, new V((String) this.f2108e, 2), c0626q5), c0626q5, (intValue5 & 14) | 805306368);
                } else {
                    c0626q5.V();
                }
                return y.a;
            default:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                C0626q c0626q6 = (C0626q) obj2;
                ((Number) obj3).intValue();
                c0626q6.b0(-1498516085);
                C1327h0 u5 = R1.u(S.p.f7414e, c0626q6);
                C1327h0 u6 = R1.u(S.p.f7416g, c0626q6);
                y0 y0Var = (y0) this.f2108e;
                E0 e02 = AbstractC1318d.f13114j;
                N3.s sVar = y0Var.a;
                C0607g0 c0607g0 = y0Var.f13280d;
                boolean booleanValue = ((Boolean) sVar.k()).booleanValue();
                c0626q6.b0(-1553362193);
                float f6 = booleanValue ? 1.0f : 0.8f;
                c0626q6.p(false);
                Float valueOf = Float.valueOf(f6);
                boolean booleanValue2 = ((Boolean) c0607g0.getValue()).booleanValue();
                c0626q6.b0(-1553362193);
                float f7 = booleanValue2 ? 1.0f : 0.8f;
                c0626q6.p(false);
                Float valueOf2 = Float.valueOf(f7);
                y0Var.f();
                c0626q6.b0(386845748);
                c0626q6.p(false);
                u0 c6 = C0.c(y0Var, valueOf, valueOf2, u5, e02, c0626q6, PegdownExtensions.SUPPRESS_ALL_HTML);
                boolean booleanValue3 = ((Boolean) y0Var.a.k()).booleanValue();
                c0626q6.b0(2073045083);
                float f8 = booleanValue3 ? 1.0f : 0.0f;
                c0626q6.p(false);
                Float valueOf3 = Float.valueOf(f8);
                boolean booleanValue4 = ((Boolean) c0607g0.getValue()).booleanValue();
                c0626q6.b0(2073045083);
                float f9 = booleanValue4 ? 1.0f : 0.0f;
                c0626q6.p(false);
                Float valueOf4 = Float.valueOf(f9);
                y0Var.f();
                c0626q6.b0(-281714272);
                c0626q6.p(false);
                InterfaceC1041r p5 = o0.y.p(interfaceC1041r, ((Number) c6.f13264m.getValue()).floatValue(), ((Number) c6.f13264m.getValue()).floatValue(), ((Number) C0.c(y0Var, valueOf3, valueOf4, u6, e02, c0626q6, PegdownExtensions.SUPPRESS_ALL_HTML).f13264m.getValue()).floatValue(), S.l.f7374V, null, 131064);
                c0626q6.p(false);
                return p5;
        }
    }
}
