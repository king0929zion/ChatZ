package Q;

import R.AbstractC0507l;
import T.C0626q;
import T.C0627q0;
import h0.C1038o;
import h0.InterfaceC1041r;
import java.util.ArrayList;
import u0.C1745f;
import u0.C1746g;
import u0.C1750k;
import v.AbstractC1787b;

/* renamed from: Q.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427j0 {
    public static final C0427j0 a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [Q.j0, java.lang.Object] */
    static {
        AbstractC1787b.d(AbstractC0451p0.a, 0);
    }

    public final void a(int i6, C0626q c0626q, InterfaceC1041r interfaceC1041r, boolean z5) {
        C0626q c0626q2;
        InterfaceC1041r interfaceC1041r2;
        c0626q.d0(-1732824199);
        int i7 = (c0626q.g(z5) ? 4 : 2) | i6 | 48;
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            C1746g c1746g = AbstractC0507l.f6801c;
            if (c1746g == null) {
                C1745f c1745f = new C1745f("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                int i8 = u0.H.a;
                o0.N n3 = new o0.N(o0.s.f13475b);
                ArrayList arrayList = new ArrayList(32);
                arrayList.add(new u0.o(7.0f, 10.0f));
                arrayList.add(new u0.v(5.0f, 5.0f));
                arrayList.add(new u0.v(5.0f, -5.0f));
                arrayList.add(C1750k.f15089c);
                C1745f.a(c1745f, arrayList, n3, null, 1.0f, 0, 2, 1.0f);
                c1746g = c1745f.b();
                AbstractC0507l.f6801c = c1746g;
            }
            C1746g c1746g2 = c1746g;
            float f6 = z5 ? 180.0f : S.l.f7374V;
            C1038o c1038o = C1038o.a;
            c0626q2 = c0626q;
            A0.b(c1746g2, null, l0.h.i(c1038o, f6), 0L, c0626q2, 48, 8);
            interfaceC1041r2 = c1038o;
        } else {
            c0626q2 = c0626q;
            c0626q2.V();
            interfaceC1041r2 = interfaceC1041r;
        }
        C0627q0 t5 = c0626q2.t();
        if (t5 != null) {
            t5.f8193d = new P2.G(this, z5, interfaceC1041r2, i6, 1);
        }
    }
}
