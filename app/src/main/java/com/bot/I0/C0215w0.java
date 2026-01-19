package I0;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;
import z4.C2052c;
import z4.C2057h;

/* renamed from: I0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215w0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public z4.w f2397h;

    /* renamed from: i, reason: collision with root package name */
    public C2052c f2398i;

    /* renamed from: j, reason: collision with root package name */
    public int f2399j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2057h f2400k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0215w0(C2057h c2057h, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f2400k = c2057h;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0215w0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0215w0(this.f2400k, interfaceC0905c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x0058, B:19:0x0027, B:23:0x005b, B:26:0x0060, B:27:0x0061, B:34:0x0021, B:12:0x004b, B:14:0x0051), top: B:2:0x0006, inners: #2 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [z4.w] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            c4.a r0 = c4.EnumC0927a.f11114c
            int r1 = r7.f2399j
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            z4.c r1 = r7.f2398i
            z4.w r4 = r7.f2397h
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L12
            goto L34
        L12:
            r8 = move-exception
            goto L68
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            X3.a.e(r8)
            z4.h r4 = r7.f2400k
            z4.c r8 = new z4.c     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L27:
            r7.f2397h = r4     // Catch: java.lang.Throwable -> L12
            r7.f2398i = r1     // Catch: java.lang.Throwable -> L12
            r7.f2399j = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L62
            java.lang.Object r8 = r1.c()     // Catch: java.lang.Throwable -> L12
            X3.y r8 = (X3.y) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = I0.AbstractC0217x0.f2489b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = f0.AbstractC0992o.f11707c     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            f0.a r6 = f0.AbstractC0992o.f11714j     // Catch: java.lang.Throwable -> L5f
            k.N r6 = r6.f11668h     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L58
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L5f
            if (r6 != r3) goto L58
            r5 = r3
        L58:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L27
            f0.AbstractC0992o.a()     // Catch: java.lang.Throwable -> L12
            goto L27
        L5f:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r0     // Catch: java.lang.Throwable -> L12
        L62:
            r4.f(r2)
            X3.y r8 = X3.y.a
            return r8
        L68:
            throw r8     // Catch: java.lang.Throwable -> L69
        L69:
            r0 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L71
            r2 = r8
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L71:
            if (r2 != 0) goto L79
            java.lang.String r1 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = x4.AbstractC1888A.a(r1, r8)
        L79:
            r4.f(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.C0215w0.r(java.lang.Object):java.lang.Object");
    }
}
