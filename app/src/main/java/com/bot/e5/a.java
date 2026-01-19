package e5;

import d5.C0949i;
import m4.AbstractC1276k;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public abstract class a {
    public static final byte[] a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(AbstractC1763a.a);
        AbstractC1276k.e(bytes, "getBytes(...)");
        a = bytes;
    }

    public static final String a(long j3, C0949i c0949i) {
        if (j3 > 0) {
            long j4 = j3 - 1;
            if (c0949i.h(j4) == 13) {
                String u5 = c0949i.u(j4, AbstractC1763a.a);
                c0949i.skip(2L);
                return u5;
            }
        }
        String u6 = c0949i.u(j3, AbstractC1763a.a);
        c0949i.skip(1L);
        return u6;
    }
}
