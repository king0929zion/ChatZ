package G3;

import F2.h;
import b4.InterfaceC0910h;
import io.ktor.utils.io.u;
import io.ktor.utils.io.v;
import io.ktor.utils.io.y;
import l4.f;
import m4.AbstractC1276k;
import x4.C1911Y;

/* loaded from: classes.dex */
public abstract class b {
    public static final h a = new h(2);

    /* renamed from: b, reason: collision with root package name */
    public static final h f1675b = new h(2);

    /* renamed from: c, reason: collision with root package name */
    public static final h f1676c = new h(2);

    /* renamed from: d, reason: collision with root package name */
    public static final h f1677d = new h(2);

    /* renamed from: e, reason: collision with root package name */
    public static final h f1678e = new h(2);

    public static final v a(y yVar, InterfaceC0910h interfaceC0910h, Long l3, f fVar) {
        AbstractC1276k.f(yVar, "<this>");
        AbstractC1276k.f(interfaceC0910h, "context");
        return u.o(C1911Y.f15677c, interfaceC0910h, true, new a(l3, yVar, fVar, null)).f12088e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable b(java.lang.Throwable r3) {
        /*
            r0 = r3
        L1:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L18
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            java.lang.Throwable r2 = r1.getCause()
            boolean r0 = m4.AbstractC1276k.b(r0, r2)
            if (r0 == 0) goto L13
            goto L1a
        L13:
            java.lang.Throwable r0 = r1.getCause()
            goto L1
        L18:
            if (r0 != 0) goto L1b
        L1a:
            return r3
        L1b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.b.b(java.lang.Throwable):java.lang.Throwable");
    }
}
