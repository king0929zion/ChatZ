package k;

import java.util.ConcurrentModificationException;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1174v {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f12576b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f12577c = new Object();

    public static final void a(X x5) {
        int i6 = x5.f12512g;
        int[] iArr = x5.f12510e;
        Object[] objArr = x5.f12511f;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (obj != f12577c) {
                if (i8 != i7) {
                    iArr[i7] = iArr[i8];
                    objArr[i7] = obj;
                    objArr[i8] = null;
                }
                i7++;
            }
        }
        x5.f12509c = false;
        x5.f12512g = i7;
    }

    public static final void b(C1160g c1160g, int i6) {
        c1160g.f12543c = new int[i6];
        c1160g.f12544e = new Object[i6];
    }

    public static final int c(C1160g c1160g, Object obj, int i6) {
        int i7 = c1160g.f12545f;
        if (i7 == 0) {
            return -1;
        }
        try {
            int a6 = AbstractC1180a.a(c1160g.f12543c, i7, i6);
            if (a6 < 0 || AbstractC1276k.b(obj, c1160g.f12544e[a6])) {
                return a6;
            }
            int i8 = a6 + 1;
            while (i8 < i7 && c1160g.f12543c[i8] == i6) {
                if (AbstractC1276k.b(obj, c1160g.f12544e[i8])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = a6 - 1; i9 >= 0 && c1160g.f12543c[i9] == i6; i9--) {
                if (AbstractC1276k.b(obj, c1160g.f12544e[i9])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
