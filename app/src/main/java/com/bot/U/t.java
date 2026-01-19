package U;

import T.AbstractC0629s;
import T.C0594a;
import T.InterfaceC0598c;
import T.J0;
import T.M0;
import b0.C0879l;

/* loaded from: classes.dex */
public final class t extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final t f8590c = new J(0, 3, 1);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        M.q qVar;
        J0 j02 = (J0) l3.d(1);
        C0594a c0594a = (C0594a) l3.d(0);
        C0672c c0672c = (C0672c) l3.d(2);
        M0 d6 = j02.d();
        if (k3 != null) {
            try {
                qVar = new M.q(24, k3, m02);
            } catch (Throwable th) {
                d6.e(false);
                throw th;
            }
        } else {
            qVar = null;
        }
        if (!c0672c.f8569d.U()) {
            AbstractC0629s.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        c0672c.f8568c.T(interfaceC0598c, d6, c0879l, qVar);
        d6.e(true);
        m02.d();
        c0594a.getClass();
        m02.A(j02, j02.a(c0594a));
        m02.k();
    }
}
