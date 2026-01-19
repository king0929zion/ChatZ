package x4;

import b4.InterfaceC0905c;
import java.util.concurrent.CancellationException;

/* renamed from: x4.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1896I extends E4.i {

    /* renamed from: f, reason: collision with root package name */
    public int f15657f;

    public AbstractC1896I(int i6) {
        super(0L, false);
        this.f15657f = i6;
    }

    public void b(CancellationException cancellationException) {
    }

    public abstract InterfaceC0905c c();

    public Throwable d(Object obj) {
        C1936s c1936s = obj instanceof C1936s ? (C1936s) obj : null;
        if (c1936s != null) {
            return c1936s.a;
        }
        return null;
    }

    public Object f(Object obj) {
        return obj;
    }

    public final void h(Throwable th) {
        AbstractC1888A.t(c().o(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r4 = (x4.InterfaceC1922e0) r5.r(x4.C1940w.f15731e);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            b4.c r0 = r11.c()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            m4.AbstractC1276k.d(r0, r1)     // Catch: java.lang.Throwable -> L21
            C4.f r0 = (C4.f) r0     // Catch: java.lang.Throwable -> L21
            d4.c r1 = r0.f690h     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r0.f692j     // Catch: java.lang.Throwable -> L21
            b4.h r2 = r1.o()     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = C4.a.l(r2, r0)     // Catch: java.lang.Throwable -> L21
            C4.u r3 = C4.a.f680d     // Catch: java.lang.Throwable -> L21
            r4 = 0
            if (r0 == r3) goto L24
            x4.B0 r3 = x4.AbstractC1888A.G(r1, r2, r0)     // Catch: java.lang.Throwable -> L21
            goto L25
        L21:
            r0 = move-exception
            goto L8c
        L24:
            r3 = r4
        L25:
            b4.h r5 = r1.o()     // Catch: java.lang.Throwable -> L48
            java.lang.Object r6 = r11.i()     // Catch: java.lang.Throwable -> L48
            java.lang.Throwable r7 = r11.d(r6)     // Catch: java.lang.Throwable -> L48
            if (r7 != 0) goto L4a
            int r8 = r11.f15657f     // Catch: java.lang.Throwable -> L48
            r9 = 1
            if (r8 == r9) goto L3d
            r10 = 2
            if (r8 != r10) goto L3c
            goto L3d
        L3c:
            r9 = 0
        L3d:
            if (r9 == 0) goto L4a
            x4.w r4 = x4.C1940w.f15731e     // Catch: java.lang.Throwable -> L48
            b4.f r4 = r5.r(r4)     // Catch: java.lang.Throwable -> L48
            x4.e0 r4 = (x4.InterfaceC1922e0) r4     // Catch: java.lang.Throwable -> L48
            goto L4a
        L48:
            r1 = move-exception
            goto L80
        L4a:
            if (r4 == 0) goto L61
            boolean r5 = r4.d()     // Catch: java.lang.Throwable -> L48
            if (r5 != 0) goto L61
            java.util.concurrent.CancellationException r4 = r4.y()     // Catch: java.lang.Throwable -> L48
            r11.b(r4)     // Catch: java.lang.Throwable -> L48
            X3.k r4 = X3.a.b(r4)     // Catch: java.lang.Throwable -> L48
            r1.k(r4)     // Catch: java.lang.Throwable -> L48
            goto L72
        L61:
            if (r7 == 0) goto L6b
            X3.k r4 = X3.a.b(r7)     // Catch: java.lang.Throwable -> L48
            r1.k(r4)     // Catch: java.lang.Throwable -> L48
            goto L72
        L6b:
            java.lang.Object r4 = r11.f(r6)     // Catch: java.lang.Throwable -> L48
            r1.k(r4)     // Catch: java.lang.Throwable -> L48
        L72:
            if (r3 == 0) goto L7c
            boolean r1 = r3.q0()     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            return
        L7c:
            C4.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.q0()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L8b
        L88:
            C4.a.g(r2, r0)     // Catch: java.lang.Throwable -> L21
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L21
        L8c:
            r11.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.AbstractC1896I.run():void");
    }
}
