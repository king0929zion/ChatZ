package q;

import D.I0;
import I.m;
import T.C0626q;
import T.C0627q0;
import b0.C0873f;
import f0.C0996s;
import l4.InterfaceC1193a;

/* renamed from: q.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1492d {
    public final C0996s a = new C0996s();

    public static void b(C1492d c1492d, l4.e eVar, C0873f c0873f, InterfaceC1193a interfaceC1193a, int i6) {
        if ((i6 & 8) != 0) {
            c0873f = null;
        }
        c1492d.a.add(new C0873f(new I0(eVar, c1492d, c0873f, interfaceC1193a), true, -1789283891));
    }

    public final void a(C1491c c1491c, C0626q c0626q, int i6) {
        c0626q.d0(-798501095);
        int i7 = (c0626q.f(c1491c) ? 4 : 2) | i6 | (c0626q.f(this) ? 32 : 16);
        if (c0626q.S(i7 & 1, (i7 & 19) != 18)) {
            C0996s c0996s = this.a;
            int size = c0996s.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((l4.f) c0996s.get(i8)).d(c1491c, c0626q, Integer.valueOf(i7 & 14));
            }
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new m(i6, 22, this, c1491c);
        }
    }
}
