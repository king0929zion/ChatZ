package p;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class B0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f13550h;

    /* renamed from: i, reason: collision with root package name */
    public Object f13551i;

    /* renamed from: j, reason: collision with root package name */
    public Object f13552j;

    /* renamed from: k, reason: collision with root package name */
    public C0 f13553k;

    /* renamed from: l, reason: collision with root package name */
    public int f13554l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f13555m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x0 f13556n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0 f13557o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ d4.i f13558p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Object f13559q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public B0(x0 x0Var, C0 c02, l4.e eVar, Object obj, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13556n = x0Var;
        this.f13557o = c02;
        this.f13558p = (d4.i) eVar;
        this.f13559q = obj;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((B0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [d4.i, l4.e] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        B0 b02 = new B0(this.f13556n, this.f13557o, this.f13558p, this.f13559q, interfaceC0905c);
        b02.f13555m = obj;
        return b02;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // d4.a
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f13554l
            r1 = 2
            r2 = 1
            r3 = 0
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L27
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r9.f13551i
            p.C0 r0 = (p.C0) r0
            H4.a r1 = r9.f13550h
            java.lang.Object r2 = r9.f13555m
            p.z0 r2 = (p.z0) r2
            X3.a.e(r10)     // Catch: java.lang.Throwable -> L1c
            goto L8f
        L1c:
            r10 = move-exception
            goto La7
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L27:
            p.C0 r0 = r9.f13553k
            java.lang.Object r2 = r9.f13552j
            java.lang.Object r5 = r9.f13551i
            l4.e r5 = (l4.e) r5
            H4.a r6 = r9.f13550h
            java.lang.Object r7 = r9.f13555m
            p.z0 r7 = (p.z0) r7
            X3.a.e(r10)
            r8 = r6
            r6 = r5
            r5 = r8
            goto L7a
        L3c:
            X3.a.e(r10)
            java.lang.Object r10 = r9.f13555m
            x4.y r10 = (x4.InterfaceC1942y) r10
            p.z0 r0 = new p.z0
            b4.h r10 = r10.c()
            x4.w r5 = x4.C1940w.f15731e
            b4.f r10 = r10.r(r5)
            m4.AbstractC1276k.c(r10)
            x4.e0 r10 = (x4.InterfaceC1922e0) r10
            p.x0 r5 = r9.f13556n
            r0.<init>(r5, r10)
            p.C0 r10 = r9.f13557o
            p.C0.a(r10, r0)
            H4.c r5 = r10.f13564b
            r9.f13555m = r0
            r9.f13550h = r5
            d4.i r6 = r9.f13558p
            r9.f13551i = r6
            java.lang.Object r7 = r9.f13559q
            r9.f13552j = r7
            r9.f13553k = r10
            r9.f13554l = r2
            java.lang.Object r2 = r5.d(r9)
            if (r2 != r4) goto L77
            goto L8c
        L77:
            r2 = r7
            r7 = r0
            r0 = r10
        L7a:
            r9.f13555m = r7     // Catch: java.lang.Throwable -> La4
            r9.f13550h = r5     // Catch: java.lang.Throwable -> La4
            r9.f13551i = r0     // Catch: java.lang.Throwable -> La4
            r9.f13552j = r3     // Catch: java.lang.Throwable -> La4
            r9.f13553k = r3     // Catch: java.lang.Throwable -> La4
            r9.f13554l = r1     // Catch: java.lang.Throwable -> La4
            java.lang.Object r10 = r6.m(r2, r9)     // Catch: java.lang.Throwable -> La4
            if (r10 != r4) goto L8d
        L8c:
            return r4
        L8d:
            r1 = r5
            r2 = r7
        L8f:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La2
        L91:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La2
            if (r4 == 0) goto L98
            goto L9e
        L98:
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r4 == r2) goto L91
        L9e:
            r1.c(r3)
            return r10
        La2:
            r10 = move-exception
            goto Lb7
        La4:
            r10 = move-exception
            r1 = r5
            r2 = r7
        La7:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La2
        La9:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La2
            if (r4 != 0) goto Lb6
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La2
            if (r4 != r2) goto Lb6
            goto La9
        Lb6:
            throw r10     // Catch: java.lang.Throwable -> La2
        Lb7:
            r1.c(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p.B0.r(java.lang.Object):java.lang.Object");
    }
}
