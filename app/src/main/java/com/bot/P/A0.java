package p;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class A0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public H4.a f13539h;

    /* renamed from: i, reason: collision with root package name */
    public Object f13540i;

    /* renamed from: j, reason: collision with root package name */
    public C0 f13541j;

    /* renamed from: k, reason: collision with root package name */
    public int f13542k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f13543l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f13544m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0 f13545n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d4.i f13546o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A0(x0 x0Var, C0 c02, l4.c cVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13544m = x0Var;
        this.f13545n = c02;
        this.f13546o = (d4.i) cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((A0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [d4.i, l4.c] */
    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        A0 a02 = new A0(this.f13544m, this.f13545n, this.f13546o, interfaceC0905c);
        a02.f13543l = obj;
        return a02;
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
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f13542k
            r1 = 2
            r2 = 1
            r3 = 0
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L36
            if (r0 == r2) goto L26
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r7.f13540i
            p.C0 r0 = (p.C0) r0
            H4.a r1 = r7.f13539h
            java.lang.Object r2 = r7.f13543l
            p.z0 r2 = (p.z0) r2
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L1b
            goto L83
        L1b:
            r8 = move-exception
            goto L9b
        L1e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L26:
            p.C0 r0 = r7.f13541j
            java.lang.Object r2 = r7.f13540i
            l4.c r2 = (l4.c) r2
            H4.a r5 = r7.f13539h
            java.lang.Object r6 = r7.f13543l
            p.z0 r6 = (p.z0) r6
            X3.a.e(r8)
            goto L70
        L36:
            X3.a.e(r8)
            java.lang.Object r8 = r7.f13543l
            x4.y r8 = (x4.InterfaceC1942y) r8
            p.z0 r0 = new p.z0
            b4.h r8 = r8.c()
            x4.w r5 = x4.C1940w.f15731e
            b4.f r8 = r8.r(r5)
            m4.AbstractC1276k.c(r8)
            x4.e0 r8 = (x4.InterfaceC1922e0) r8
            p.x0 r5 = r7.f13544m
            r0.<init>(r5, r8)
            p.C0 r8 = r7.f13545n
            p.C0.a(r8, r0)
            H4.c r5 = r8.f13564b
            r7.f13543l = r0
            r7.f13539h = r5
            d4.i r6 = r7.f13546o
            r7.f13540i = r6
            r7.f13541j = r8
            r7.f13542k = r2
            java.lang.Object r2 = r5.d(r7)
            if (r2 != r4) goto L6d
            goto L80
        L6d:
            r2 = r6
            r6 = r0
            r0 = r8
        L70:
            r7.f13543l = r6     // Catch: java.lang.Throwable -> L98
            r7.f13539h = r5     // Catch: java.lang.Throwable -> L98
            r7.f13540i = r0     // Catch: java.lang.Throwable -> L98
            r7.f13541j = r3     // Catch: java.lang.Throwable -> L98
            r7.f13542k = r1     // Catch: java.lang.Throwable -> L98
            java.lang.Object r8 = r2.f(r7)     // Catch: java.lang.Throwable -> L98
            if (r8 != r4) goto L81
        L80:
            return r4
        L81:
            r1 = r5
            r2 = r6
        L83:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L96
        L85:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L96
            if (r4 == 0) goto L8c
            goto L92
        L8c:
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L96
            if (r4 == r2) goto L85
        L92:
            r1.c(r3)
            return r8
        L96:
            r8 = move-exception
            goto Lab
        L98:
            r8 = move-exception
            r1 = r5
            r2 = r6
        L9b:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L96
        L9d:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L96
            if (r4 != 0) goto Laa
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L96
            if (r4 != r2) goto Laa
            goto L9d
        Laa:
            throw r8     // Catch: java.lang.Throwable -> L96
        Lab:
            r1.c(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.A0.r(java.lang.Object):java.lang.Object");
    }
}
