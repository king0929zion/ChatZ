package P1;

import i4.AbstractC1120d;
import i4.AbstractC1121e;
import java.util.concurrent.atomic.AtomicBoolean;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import v4.C1825a;
import v4.EnumC1827c;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: c, reason: collision with root package name */
    public final m f4573c;

    /* renamed from: e, reason: collision with root package name */
    public final m f4574e;

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f4575f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f4576g;

    /* renamed from: h, reason: collision with root package name */
    public final long f4577h;

    public g(M.q qVar) {
        long u5;
        this.f4575f = new ThreadLocal();
        this.f4576g = new AtomicBoolean(false);
        int i6 = C1825a.f15384g;
        EnumC1827c enumC1827c = EnumC1827c.SECONDS;
        AbstractC1276k.f(enumC1827c, "unit");
        if (enumC1827c.compareTo(enumC1827c) <= 0) {
            u5 = AbstractC1120d.m(AbstractC1121e.k(30, enumC1827c, EnumC1827c.NANOSECONDS));
        } else {
            u5 = AbstractC1120d.u(30, enumC1827c);
        }
        this.f4577h = u5;
        m mVar = new m(1, new A.b(qVar, 21));
        this.f4573c = mVar;
        this.f4574e = mVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f4576g.compareAndSet(false, true)) {
            this.f4573c.c();
            this.f4574e.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0181 A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #3 {all -> 0x0198, blocks: (B:16:0x017b, B:18:0x0181, B:24:0x018d, B:21:0x0191), top: B:15:0x017b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148 A[Catch: all -> 0x0199, TRY_LEAVE, TryCatch #4 {all -> 0x0199, blocks: (B:60:0x011f, B:64:0x013d, B:66:0x0148, B:70:0x019d, B:71:0x01a4, B:106:0x00f7), top: B:105:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d A[Catch: all -> 0x0199, TRY_ENTER, TryCatch #4 {all -> 0x0199, blocks: (B:60:0x011f, B:64:0x013d, B:66:0x0148, B:70:0x019d, B:71:0x01a4, B:106:0x00f7), top: B:105:0x00f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Type inference failed for: r6v4, types: [m4.w, java.lang.Object] */
    @Override // P1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(boolean r18, l4.e r19, d4.c r20) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: P1.g.l(boolean, l4.e, d4.c):java.lang.Object");
    }

    public g(final M.q qVar, final String str, int i6) {
        long u5;
        AbstractC1276k.f(str, "fileName");
        this.f4575f = new ThreadLocal();
        final int i7 = 0;
        this.f4576g = new AtomicBoolean(false);
        int i8 = C1825a.f15384g;
        EnumC1827c enumC1827c = EnumC1827c.SECONDS;
        AbstractC1276k.f(enumC1827c, "unit");
        if (enumC1827c.compareTo(enumC1827c) <= 0) {
            u5 = AbstractC1120d.m(AbstractC1121e.k(30, enumC1827c, EnumC1827c.NANOSECONDS));
        } else {
            u5 = AbstractC1120d.u(30, enumC1827c);
        }
        this.f4577h = u5;
        if (i6 > 0) {
            this.f4573c = new m(i6, new InterfaceC1193a() { // from class: P1.c
                @Override // l4.InterfaceC1193a
                public final Object b() {
                    switch (i7) {
                        case 0:
                            X1.a c6 = qVar.c(str);
                            h5.e.S("PRAGMA query_only = 1", c6);
                            return c6;
                        default:
                            return qVar.c(str);
                    }
                }
            });
            final int i9 = 1;
            this.f4574e = new m(1, new InterfaceC1193a() { // from class: P1.c
                @Override // l4.InterfaceC1193a
                public final Object b() {
                    switch (i9) {
                        case 0:
                            X1.a c6 = qVar.c(str);
                            h5.e.S("PRAGMA query_only = 1", c6);
                            return c6;
                        default:
                            return qVar.c(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
