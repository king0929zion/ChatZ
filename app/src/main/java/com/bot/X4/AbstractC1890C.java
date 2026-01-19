package x4;

import y4.C1998d;

/* renamed from: x4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1890C {
    public static final InterfaceC1893F a;

    static {
        String str;
        InterfaceC1893F interfaceC1893F;
        int i6 = C4.v.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null ? Boolean.parseBoolean(str) : false) {
            E4.e eVar = AbstractC1898K.a;
            C1998d c1998d = C4.o.a;
            C1998d c1998d2 = c1998d.f16023i;
            interfaceC1893F = c1998d;
            if (c1998d == null) {
                interfaceC1893F = RunnableC1889B.f15648m;
            }
        } else {
            interfaceC1893F = RunnableC1889B.f15648m;
        }
        a = interfaceC1893F;
    }
}
