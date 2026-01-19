package m0;

import H0.AbstractC0157l;
import H0.J;
import java.util.Comparator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D implements Comparator {
    public static final D a = new Object();

    /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C c6 = (C) obj;
        C c7 = (C) obj2;
        int i6 = 0;
        if (AbstractC1249d.r(c6) && AbstractC1249d.r(c7)) {
            J v5 = AbstractC0157l.v(c6);
            J v6 = AbstractC0157l.v(c7);
            if (!AbstractC1276k.b(v5, v6)) {
                J[] jArr = new J[16];
                int i7 = 0;
                while (v5 != null) {
                    int i8 = i7 + 1;
                    if (jArr.length < i8) {
                        int length = jArr.length;
                        Object[] r5 = new Object[Math.max(i8, length * 2)];
                        System.arraycopy(jArr, 0, r5, 0, length);
                        jArr = r5;
                    }
                    if (i7 != 0) {
                        System.arraycopy(jArr, 0, jArr, 0 + 1, i7 + 0);
                    }
                    jArr[0] = v5;
                    i7++;
                    v5 = v5.v();
                }
                J[] jArr2 = new J[16];
                int i9 = 0;
                while (v6 != null) {
                    int i10 = i9 + 1;
                    if (jArr2.length < i10) {
                        int length2 = jArr2.length;
                        Object[] r52 = new Object[Math.max(i10, length2 * 2)];
                        System.arraycopy(jArr2, 0, r52, 0, length2);
                        jArr2 = r52;
                    }
                    if (i9 != 0) {
                        System.arraycopy(jArr2, 0, jArr2, 0 + 1, i9 + 0);
                    }
                    jArr2[0] = v6;
                    i9++;
                    v6 = v6.v();
                }
                int min = Math.min(i7 - 1, i9 - 1);
                if (min >= 0) {
                    while (AbstractC1276k.b(jArr[i6], jArr2[i6])) {
                        if (i6 != min) {
                            i6++;
                        }
                    }
                    return AbstractC1276k.g(jArr[i6].w(), jArr2[i6].w());
                }
                throw new IllegalStateException("Could not find a common ancestor between the two FocusModifiers.");
            }
        } else {
            if (AbstractC1249d.r(c6)) {
                return -1;
            }
            if (AbstractC1249d.r(c7)) {
                return 1;
            }
        }
        return 0;
    }
}
