package r;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f14148h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f14149i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ M1.b f14150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(M1.b bVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14150j = bVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((T0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        T0 t02 = new T0(this.f14150j, interfaceC0905c);
        t02.f14149i = obj;
        return t02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (M1.b.a(r4, r5, r6, r7, r8, r12) != r10) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c A[Catch: all -> 0x0018, TryCatch #0 {all -> 0x0018, blocks: (B:7:0x0013, B:9:0x0032, B:11:0x003c, B:17:0x004e, B:25:0x0027), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0073 -> B:8:0x0016). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.f14148h
            r1 = 0
            r2 = 2
            r3 = 1
            M1.b r4 = r12.f14150j
            c4.a r10 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2b
            if (r0 == r3) goto L23
            if (r0 != r2) goto L1b
            java.lang.Object r0 = r12.f14149i
            x4.y r0 = (x4.InterfaceC1942y) r0
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L18
        L16:
            r13 = r0
            goto L32
        L18:
            r0 = move-exception
            r13 = r0
            goto L7b
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r0 = r12.f14149i
            x4.y r0 = (x4.InterfaceC1942y) r0
            X3.a.e(r13)     // Catch: java.lang.Throwable -> L18
            goto L4e
        L2b:
            X3.a.e(r13)
            java.lang.Object r13 = r12.f14149i
            x4.y r13 = (x4.InterfaceC1942y) r13
        L32:
            b4.h r0 = r13.c()     // Catch: java.lang.Throwable -> L18
            boolean r0 = x4.AbstractC1888A.v(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L76
            java.lang.Object r0 = r4.f3237f     // Catch: java.lang.Throwable -> L18
            z4.h r0 = (z4.C2057h) r0     // Catch: java.lang.Throwable -> L18
            r12.f14149i = r13     // Catch: java.lang.Throwable -> L18
            r12.f14148h = r3     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.p(r12)     // Catch: java.lang.Throwable -> L18
            if (r0 != r10) goto L4b
            goto L75
        L4b:
            r11 = r0
            r0 = r13
            r13 = r11
        L4e:
            r6 = r13
            r.M0 r6 = (r.C1534M0) r6     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f3236e     // Catch: java.lang.Throwable -> L18
            e1.c r13 = (e1.InterfaceC0961c) r13     // Catch: java.lang.Throwable -> L18
            float r5 = r.AbstractC1532L0.a     // Catch: java.lang.Throwable -> L18
            float r7 = r13.e0(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f3236e     // Catch: java.lang.Throwable -> L18
            e1.c r13 = (e1.InterfaceC0961c) r13     // Catch: java.lang.Throwable -> L18
            float r5 = r.AbstractC1532L0.f14081b     // Catch: java.lang.Throwable -> L18
            float r8 = r13.e0(r5)     // Catch: java.lang.Throwable -> L18
            java.lang.Object r13 = r4.f3233b     // Catch: java.lang.Throwable -> L18
            r5 = r13
            r.E1 r5 = (r.E1) r5     // Catch: java.lang.Throwable -> L18
            r12.f14149i = r0     // Catch: java.lang.Throwable -> L18
            r12.f14148h = r2     // Catch: java.lang.Throwable -> L18
            r9 = r12
            java.lang.Object r13 = M1.b.a(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L18
            if (r13 != r10) goto L16
        L75:
            return r10
        L76:
            r4.f3238g = r1
            X3.y r13 = X3.y.a
            return r13
        L7b:
            r4.f3238g = r1
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: r.T0.r(java.lang.Object):java.lang.Object");
    }
}
