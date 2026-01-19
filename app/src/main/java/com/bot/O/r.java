package O;

import F0.InterfaceC0134w;
import S0.C0545g;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class r {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final N.h f4181b;

    /* renamed from: c, reason: collision with root package name */
    public final N.h f4182c;

    /* renamed from: e, reason: collision with root package name */
    public S0.L f4184e;

    /* renamed from: d, reason: collision with root package name */
    public final r f4183d = this;

    /* renamed from: f, reason: collision with root package name */
    public int f4185f = -1;

    public r(long j3, N.h hVar, N.h hVar2) {
        this.a = j3;
        this.f4181b = hVar;
        this.f4182c = hVar2;
    }

    public final long a(G g3, boolean z5) {
        S0.L l3;
        F f6 = g3.f3945b;
        F f7 = g3.a;
        long j3 = this.a;
        if (z5 && f7.f3942c != j3) {
            return 9205357640488583168L;
        }
        if ((!z5 && f6.f3942c != j3) || c() == null || (l3 = (S0.L) this.f4182c.b()) == null) {
            return 9205357640488583168L;
        }
        return AbstractC0336u0.t(l3, AbstractC1117a.f(z5 ? f7.f3941b : f6.f3941b, 0, b(l3)), z5, g3.f3946c);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(S0.L r10) {
        /*
            r9 = this;
            O.r r0 = r9.f4183d
            monitor-enter(r0)
            S0.L r1 = r9.f4184e     // Catch: java.lang.Throwable -> L4d
            if (r1 == r10) goto L62
            S0.p r1 = r10.f7599b     // Catch: java.lang.Throwable -> L4d
            boolean r2 = r1.f7649c     // Catch: java.lang.Throwable -> L4d
            r3 = 0
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = 1
            if (r2 != 0) goto L22
            long r7 = r10.f7600c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            float r8 = r1.f7651e     // Catch: java.lang.Throwable -> L4d
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L20
            goto L22
        L20:
            r7 = r3
            goto L23
        L22:
            r7 = r6
        L23:
            if (r7 == 0) goto L54
            if (r2 == 0) goto L28
            goto L54
        L28:
            long r7 = r10.f7600c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r2 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.e(r2)     // Catch: java.lang.Throwable -> L4d
            S0.p r2 = r10.f7599b     // Catch: java.lang.Throwable -> L4d
            int r2 = r2.f7652f     // Catch: java.lang.Throwable -> L4d
            int r2 = r2 - r6
            if (r1 <= r2) goto L39
            r1 = r2
        L39:
            if (r1 < 0) goto L4f
            S0.p r2 = r10.f7599b     // Catch: java.lang.Throwable -> L4d
            float r2 = r2.f(r1)     // Catch: java.lang.Throwable -> L4d
            long r7 = r10.f7600c     // Catch: java.lang.Throwable -> L4d
            long r7 = r7 & r4
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L4d
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L4d
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 < 0) goto L4f
            int r1 = r1 + (-1)
            goto L39
        L4d:
            r10 = move-exception
            goto L66
        L4f:
            if (r1 >= 0) goto L52
            goto L58
        L52:
            r3 = r1
            goto L58
        L54:
            int r1 = r1.f7652f     // Catch: java.lang.Throwable -> L4d
            int r3 = r1 + (-1)
        L58:
            S0.p r1 = r10.f7599b     // Catch: java.lang.Throwable -> L4d
            int r1 = r1.c(r3, r6)     // Catch: java.lang.Throwable -> L4d
            r9.f4185f = r1     // Catch: java.lang.Throwable -> L4d
            r9.f4184e = r10     // Catch: java.lang.Throwable -> L4d
        L62:
            int r10 = r9.f4185f     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)
            return r10
        L66:
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: O.r.b(S0.L):int");
    }

    public final InterfaceC0134w c() {
        InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f4181b.b();
        if (interfaceC0134w == null || !interfaceC0134w.j()) {
            return null;
        }
        return interfaceC0134w;
    }

    public final C0545g d() {
        S0.L l3 = (S0.L) this.f4182c.b();
        return l3 == null ? new C0545g(FlexmarkHtmlConverter.DEFAULT_NODE) : l3.a.a;
    }
}
