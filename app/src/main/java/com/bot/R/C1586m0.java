package r;

import b4.InterfaceC0905c;
import m4.C1288w;

/* renamed from: r.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1586m0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1288w f14384h;

    /* renamed from: i, reason: collision with root package name */
    public int f14385i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f14386j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1288w f14387k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC1592o0 f14388l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1586m0(C1288w c1288w, AbstractC1592o0 abstractC1592o0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14387k = c1288w;
        this.f14388l = abstractC1592o0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1586m0) p((InterfaceC0905c) obj2, (l4.c) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1586m0 c1586m0 = new C1586m0(this.f14387k, this.f14388l, interfaceC0905c);
        c1586m0.f14386j = obj;
        return c1586m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003f -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f14385i
            r1 = 1
            if (r0 == 0) goto L19
            if (r0 != r1) goto L11
            m4.w r0 = r5.f14384h
            java.lang.Object r2 = r5.f14386j
            l4.c r2 = (l4.c) r2
            X3.a.e(r6)
            goto L50
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            X3.a.e(r6)
            java.lang.Object r6 = r5.f14386j
            l4.c r6 = (l4.c) r6
            r2 = r6
        L21:
            m4.w r0 = r5.f14387k
            java.lang.Object r6 = r0.f12973c
            boolean r3 = r6 instanceof r.C1543U
            if (r3 != 0) goto L56
            boolean r3 = r6 instanceof r.C1540Q
            if (r3 != 0) goto L56
            boolean r3 = r6 instanceof r.C1541S
            r4 = 0
            if (r3 == 0) goto L35
            r.S r6 = (r.C1541S) r6
            goto L36
        L35:
            r6 = r4
        L36:
            if (r6 == 0) goto L3b
            r2.f(r6)
        L3b:
            r.o0 r6 = r5.f14388l
            z4.h r6 = r6.f14424x
            if (r6 == 0) goto L53
            r5.f14386j = r2
            r5.f14384h = r0
            r5.f14385i = r1
            java.lang.Object r6 = r6.p(r5)
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r6 != r3) goto L50
            return r3
        L50:
            r4 = r6
            r.V r4 = (r.AbstractC1544V) r4
        L53:
            r0.f12973c = r4
            goto L21
        L56:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1586m0.r(java.lang.Object):java.lang.Object");
    }
}
