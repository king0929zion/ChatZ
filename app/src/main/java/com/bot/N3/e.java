package N3;

import b4.InterfaceC0905c;
import io.ktor.utils.io.y;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public byte[] f3850h;

    /* renamed from: i, reason: collision with root package name */
    public int f3851i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f3852j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y f3853k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.t f3854l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.ktor.utils.io.t f3855m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar, io.ktor.utils.io.t tVar, io.ktor.utils.io.t tVar2, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3853k = yVar;
        this.f3854l = tVar;
        this.f3855m = tVar2;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        e eVar = new e(this.f3853k, this.f3854l, this.f3855m, interfaceC0905c);
        eVar.f3852j = obj;
        return eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (x4.AbstractC1888A.g(r15, r14) != r7) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: all -> 0x001e, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:9:0x0042, B:11:0x004b, B:17:0x005f, B:19:0x0090, B:25:0x00a5, B:30:0x002f), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0090 A[Catch: all -> 0x001e, TRY_LEAVE, TryCatch #1 {all -> 0x001e, blocks: (B:7:0x0019, B:9:0x0042, B:11:0x004b, B:17:0x005f, B:19:0x0090, B:25:0x00a5, B:30:0x002f), top: B:2:0x000d }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v6, types: [byte[], java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:8:0x001c). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.f3851i
            r1 = 0
            r2 = 2
            r3 = 1
            io.ktor.utils.io.y r4 = r14.f3853k
            io.ktor.utils.io.t r5 = r14.f3855m
            io.ktor.utils.io.t r6 = r14.f3854l
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L33
            if (r0 == r3) goto L29
            if (r0 != r2) goto L21
            byte[] r0 = r14.f3850h
            java.lang.Object r8 = r14.f3852j
            x4.y r8 = (x4.InterfaceC1942y) r8
            X3.a.e(r15)     // Catch: java.lang.Throwable -> L1e
        L1c:
            r15 = r8
            goto L42
        L1e:
            r15 = move-exception
            goto La6
        L21:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L29:
            byte[] r0 = r14.f3850h
            java.lang.Object r8 = r14.f3852j
            x4.y r8 = (x4.InterfaceC1942y) r8
            X3.a.e(r15)     // Catch: java.lang.Throwable -> L1e
            goto L5f
        L33:
            X3.a.e(r15)
            java.lang.Object r15 = r14.f3852j
            x4.y r15 = (x4.InterfaceC1942y) r15
            W3.a r0 = W3.b.a
            java.lang.Object r0 = r0.v()
            byte[] r0 = (byte[]) r0
        L42:
            r8 = r4
            io.ktor.utils.io.t r8 = (io.ktor.utils.io.t) r8     // Catch: java.lang.Throwable -> L1e
            boolean r8 = r8.p()     // Catch: java.lang.Throwable -> L1e
            if (r8 != 0) goto L90
            r14.f3852j = r15     // Catch: java.lang.Throwable -> L1e
            r14.f3850h = r0     // Catch: java.lang.Throwable -> L1e
            r14.f3851i = r3     // Catch: java.lang.Throwable -> L1e
            int r8 = r0.length     // Catch: java.lang.Throwable -> L1e
            r9 = r4
            io.ktor.utils.io.t r9 = (io.ktor.utils.io.t) r9     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r8 = r9.w(r0, r1, r8, r14)     // Catch: java.lang.Throwable -> L1e
            if (r8 != r7) goto L5c
            goto L8f
        L5c:
            r13 = r8
            r8 = r15
            r15 = r13
        L5f:
            java.lang.Number r15 = (java.lang.Number) r15     // Catch: java.lang.Throwable -> L1e
            int r15 = r15.intValue()     // Catch: java.lang.Throwable -> L1e
            N3.c r9 = new N3.c     // Catch: java.lang.Throwable -> L1e
            r10 = 0
            r9.<init>(r6, r0, r15, r10)     // Catch: java.lang.Throwable -> L1e
            r11 = 3
            x4.E r9 = x4.AbstractC1888A.f(r8, r10, r9, r11)     // Catch: java.lang.Throwable -> L1e
            N3.d r12 = new N3.d     // Catch: java.lang.Throwable -> L1e
            r12.<init>(r5, r0, r15, r10)     // Catch: java.lang.Throwable -> L1e
            x4.E r15 = x4.AbstractC1888A.f(r8, r10, r12, r11)     // Catch: java.lang.Throwable -> L1e
            x4.D[] r10 = new x4.InterfaceC1891D[r2]     // Catch: java.lang.Throwable -> L1e
            r10[r1] = r9     // Catch: java.lang.Throwable -> L1e
            r10[r3] = r15     // Catch: java.lang.Throwable -> L1e
            java.util.List r15 = Y4.l.I(r10)     // Catch: java.lang.Throwable -> L1e
            r14.f3852j = r8     // Catch: java.lang.Throwable -> L1e
            r14.f3850h = r0     // Catch: java.lang.Throwable -> L1e
            r14.f3851i = r2     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r15 = x4.AbstractC1888A.g(r15, r14)     // Catch: java.lang.Throwable -> L1e
            if (r15 != r7) goto L1c
        L8f:
            return r7
        L90:
            r15 = r4
            io.ktor.utils.io.t r15 = (io.ktor.utils.io.t) r15     // Catch: java.lang.Throwable -> L1e
            java.lang.Throwable r15 = r15.o()     // Catch: java.lang.Throwable -> L1e
            if (r15 != 0) goto La5
            W3.a r15 = W3.b.a
            r15.X(r0)
        L9e:
            i4.AbstractC1121e.h(r6)
            i4.AbstractC1121e.h(r5)
            goto Lb7
        La5:
            throw r15     // Catch: java.lang.Throwable -> L1e
        La6:
            io.ktor.utils.io.t r4 = (io.ktor.utils.io.t) r4     // Catch: java.lang.Throwable -> Lba
            r4.i(r15)     // Catch: java.lang.Throwable -> Lba
            r6.i(r15)     // Catch: java.lang.Throwable -> Lba
            r5.i(r15)     // Catch: java.lang.Throwable -> Lba
            W3.a r15 = W3.b.a
            r15.X(r0)
            goto L9e
        Lb7:
            X3.y r15 = X3.y.a
            return r15
        Lba:
            r15 = move-exception
            W3.a r1 = W3.b.a
            r1.X(r0)
            i4.AbstractC1121e.h(r6)
            i4.AbstractC1121e.h(r5)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: N3.e.r(java.lang.Object):java.lang.Object");
    }
}
