package Q;

import H0.C0146e;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0204q0;
import R.AbstractC0507l;
import R.AbstractC0516v;
import T.C0616l;
import T.C0626q;
import T.C0627q0;
import T.InterfaceC0617l0;
import b0.AbstractC0874g;
import b0.C0873f;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.AbstractC1318d;
import n.AbstractC1350y;
import v.AbstractC1806l;

/* renamed from: Q.a2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0393a2 {
    public static final float a = 22;

    /* renamed from: b, reason: collision with root package name */
    public static final n.D0 f5649b = AbstractC1318d.s(300, 2, AbstractC1350y.a);

    public static final void a(C0873f c0873f, C0626q c0626q, int i6) {
        c0626q.d0(1033612924);
        int i7 = 1;
        if (c0626q.S(i6 & 1, (i6 & 19) != 18)) {
            String j3 = AbstractC0507l.j(R.string.m3c_bottom_sheet_drag_handle_description, c0626q);
            v.J j4 = new v.J(C1026c.f11799q);
            F0.V d6 = AbstractC1806l.d(C1026c.f11786c, false);
            int hashCode = Long.hashCode(c0626q.f8164T);
            InterfaceC0617l0 l3 = c0626q.l();
            InterfaceC1041r c6 = AbstractC1024a.c(c0626q, j4);
            InterfaceC0152h.a.getClass();
            InterfaceC1193a interfaceC1193a = C0150g.f1924b;
            c0626q.f0();
            if (c0626q.f8163S) {
                c0626q.k(interfaceC1193a);
            } else {
                c0626q.p0();
            }
            T.r.G(c0626q, d6, C0150g.f1928f);
            T.r.G(c0626q, l3, C0150g.f1927e);
            C0146e c0146e = C0150g.f1929g;
            if (c0626q.f8163S || !AbstractC1276k.b(c0626q.P(), Integer.valueOf(hashCode))) {
                B3.e.v(hashCode, c0626q, hashCode, c0146e);
            }
            T.r.G(c0626q, c6, C0150g.f1926d);
            float f6 = l3.a;
            int l02 = ((InterfaceC0961c) c0626q.j(AbstractC0204q0.f2358h)).l0(o3.a);
            boolean d7 = c0626q.d(l02);
            Object P5 = c0626q.P();
            Object obj = C0616l.a;
            if (d7 || P5 == obj) {
                P5 = new p3(l02);
                c0626q.m0(P5);
            }
            p3 p3Var = (p3) P5;
            C0873f c7 = AbstractC0874g.c(2059851063, new I.n(j3, 4), c0626q);
            p.C0 c02 = AbstractC0516v.a;
            boolean g3 = c0626q.g(false) | c0626q.f(c02);
            Object P6 = c0626q.P();
            if (g3 || P6 == obj) {
                P6 = new s3(c02);
                c0626q.m0(P6);
            }
            o3.b(p3Var, c7, (s3) P6, null, false, c0873f, c0626q, 100663344);
            c0626q.p(true);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new C0398c(c0873f, i6, i7);
        }
    }
}
