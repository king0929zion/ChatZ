package U;

import T.AbstractC0629s;
import T.C0;
import T.C0594a;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;

/* renamed from: U.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0674e extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final C0674e f8571c = new J(0, 2, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        C0594a c0594a = (C0594a) l3.d(0);
        Object d6 = l3.d(1);
        if (d6 instanceof C0) {
            C0 c02 = (C0) d6;
            c0879l.f10992e.b(c02);
            c0879l.f10991d.a(c02);
        }
        if (m02.f7998n != 0) {
            AbstractC0629s.a("Can only append a slot if not current inserting");
        }
        int i6 = m02.f7993i;
        int i7 = m02.f7994j;
        int c6 = m02.c(c0594a);
        int g3 = m02.g(m02.f7986b, m02.r(c6 + 1));
        m02.f7993i = g3;
        m02.f7994j = g3;
        m02.x(1, c6);
        if (i6 >= g3) {
            i6++;
            i7++;
        }
        m02.f7987c[g3] = d6;
        m02.f7993i = i6;
        m02.f7994j = i7;
    }
}
