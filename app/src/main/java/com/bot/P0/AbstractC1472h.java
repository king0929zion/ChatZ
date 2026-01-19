package p0;

import k.AbstractC1168o;
import k.C1147A;

/* renamed from: p0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1472h {
    public static final C1147A a;

    static {
        C1481q c1481q = C1468d.f13841e;
        int i6 = c1481q.f13837c;
        C1471g c1471g = new C1471g(c1481q, c1481q, 1);
        int i7 = c1481q.f13837c;
        C1476l c1476l = C1468d.f13860x;
        int i8 = (c1476l.f13837c << 6) | i7;
        C1471g c1471g2 = new C1471g(c1481q, c1476l, 0);
        int i9 = (i7 << 6) | c1476l.f13837c;
        C1471g c1471g3 = new C1471g(c1476l, c1481q, 0);
        C1147A c1147a = AbstractC1168o.a;
        C1147A c1147a2 = new C1147A();
        c1147a2.i(i6 | (i6 << 6), c1471g);
        c1147a2.i(i8, c1471g2);
        c1147a2.i(i9, c1471g3);
        a = c1147a2;
    }
}
