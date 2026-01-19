package w2;

import s2.C1655c;
import s2.C1661i;
import t2.C1719c;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1834d {
    public static final C1655c a = new C1655c();

    public static final boolean a(C1661i c1661i) {
        int ordinal = c1661i.f14769e.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1) {
            return true;
        }
        if (ordinal == 2) {
            return c1661i.f14789y.a == null && (c1661i.f14786v instanceof C1719c);
        }
        throw new RuntimeException();
    }
}
