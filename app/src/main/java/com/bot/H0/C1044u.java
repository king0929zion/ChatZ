package h0;

import X3.y;
import b4.InterfaceC0905c;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC1277l;
import x4.InterfaceC1942y;

/* renamed from: h0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1044u extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f11821h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f11822i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AbstractC1277l f11823j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f11824k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.e f11825l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1044u(l4.c cVar, AtomicReference atomicReference, l4.e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f11823j = (AbstractC1277l) cVar;
        this.f11824k = atomicReference;
        this.f11825l = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1044u) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [m4.l, l4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1044u c1044u = new C1044u(this.f11823j, this.f11824k, this.f11825l, interfaceC0905c);
        c1044u.f11822i = obj;
        return c1044u;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [m4.l, l4.c] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f11821h
            r1 = 0
            r2 = 2
            r3 = 1
            java.util.concurrent.atomic.AtomicReference r4 = r8.f11824k
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2a
            if (r0 == r3) goto L22
            if (r0 != r2) goto L1a
            java.lang.Object r0 = r8.f11822i
            h0.t r0 = (h0.C1043t) r0
            X3.a.e(r9)     // Catch: java.lang.Throwable -> L18
        L16:
            r2 = r0
            goto L70
        L18:
            r9 = move-exception
            goto L7e
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r0 = r8.f11822i
            h0.t r0 = (h0.C1043t) r0
            X3.a.e(r9)
            goto L61
        L2a:
            X3.a.e(r9)
            java.lang.Object r9 = r8.f11822i
            x4.y r9 = (x4.InterfaceC1942y) r9
            h0.t r0 = new h0.t
            b4.h r6 = r9.c()
            x4.e0 r6 = x4.AbstractC1888A.r(r6)
            m4.l r7 = r8.f11823j
            java.lang.Object r9 = r7.f(r9)
            r0.<init>(r6, r9)
            java.lang.Object r9 = r4.getAndSet(r0)
            h0.t r9 = (h0.C1043t) r9
            if (r9 == 0) goto L61
            x4.e0 r9 = r9.a
            r8.f11822i = r0
            r8.f11821h = r3
            r9.f(r1)
            java.lang.Object r9 = r9.Q(r8)
            if (r9 != r5) goto L5c
            goto L5e
        L5c:
            X3.y r9 = X3.y.a
        L5e:
            if (r9 != r5) goto L61
            goto L6f
        L61:
            l4.e r9 = r8.f11825l     // Catch: java.lang.Throwable -> L18
            java.lang.Object r3 = r0.f11820b     // Catch: java.lang.Throwable -> L18
            r8.f11822i = r0     // Catch: java.lang.Throwable -> L18
            r8.f11821h = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r9 = r9.m(r3, r8)     // Catch: java.lang.Throwable -> L18
            if (r9 != r5) goto L16
        L6f:
            return r5
        L70:
            boolean r0 = r4.compareAndSet(r2, r1)
            if (r0 == 0) goto L77
            goto L7d
        L77:
            java.lang.Object r0 = r4.get()
            if (r0 == r2) goto L70
        L7d:
            return r9
        L7e:
            boolean r2 = r4.compareAndSet(r0, r1)
            if (r2 != 0) goto L8b
            java.lang.Object r2 = r4.get()
            if (r2 != r0) goto L8b
            goto L7e
        L8b:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.C1044u.r(java.lang.Object):java.lang.Object");
    }
}
