package C3;

import X3.y;
import b4.InterfaceC0905c;
import d4.i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class d extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f674h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f675i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ F3.c f676j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f677k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(F3.c cVar, e eVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f676j = cVar;
        this.f677k = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d dVar = new d(this.f676j, this.f677k, interfaceC0905c);
        dVar.f675i = obj;
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        if (r6 == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0039, code lost:
    
        if (r0.m(r1, r5) == r4) goto L27;
     */
    /* JADX WARN: Type inference failed for: r0v5, types: [d4.i, l4.e] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f674h
            F3.c r1 = r5.f676j
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L12
            goto L57
        L12:
            r6 = move-exception
            goto L63
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            java.lang.Object r0 = r5.f675i
            x4.y r0 = (x4.InterfaceC1942y) r0
            X3.a.e(r6)     // Catch: java.lang.Throwable -> L24
            goto L3f
        L24:
            r6 = move-exception
            goto L3c
        L26:
            X3.a.e(r6)
            java.lang.Object r6 = r5.f675i
            x4.y r6 = (x4.InterfaceC1942y) r6
            C3.e r0 = r5.f677k
            d4.i r0 = r0.a     // Catch: java.lang.Throwable -> L24
            r5.f675i = r6     // Catch: java.lang.Throwable -> L24
            r5.f674h = r3     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r0.m(r1, r5)     // Catch: java.lang.Throwable -> L24
            if (r6 != r4) goto L3f
            goto L56
        L3c:
            X3.a.b(r6)
        L3f:
            io.ktor.utils.io.y r6 = r1.d()
            io.ktor.utils.io.t r6 = (io.ktor.utils.io.t) r6
            boolean r0 = r6.p()
            if (r0 != 0) goto L66
            r0 = 0
            r5.f675i = r0     // Catch: java.lang.Throwable -> L12
            r5.f674h = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r6 = r6.k(r5)     // Catch: java.lang.Throwable -> L12
            if (r6 != r4) goto L57
        L56:
            return r4
        L57:
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L12
            long r0 = r6.longValue()     // Catch: java.lang.Throwable -> L12
            java.lang.Long r6 = new java.lang.Long     // Catch: java.lang.Throwable -> L12
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L12
            goto L66
        L63:
            X3.a.b(r6)
        L66:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.d.r(java.lang.Object):java.lang.Object");
    }
}
