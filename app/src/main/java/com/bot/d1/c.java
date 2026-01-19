package D1;

import A4.InterfaceC0007h;
import T.C0621n0;
import X3.y;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import d4.i;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class c extends i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f1256h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0910h f1257i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0007h f1258j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0621n0 f1259k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC0910h interfaceC0910h, InterfaceC0007h interfaceC0007h, C0621n0 c0621n0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f1257i = interfaceC0910h;
        this.f1258j = interfaceC0007h;
        this.f1259k = c0621n0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new c(this.f1257i, this.f1258j, this.f1259k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r4.b(r7, r6) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (x4.AbstractC1888A.H(r0, r7, r6) == r5) goto L17;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f1256h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L17
            if (r0 == r2) goto L13
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L13:
            X3.a.e(r7)
            goto L48
        L17:
            X3.a.e(r7)
            b4.i r7 = b4.C0911i.f11057c
            b4.h r0 = r6.f1257i
            boolean r7 = m4.AbstractC1276k.b(r0, r7)
            T.n0 r3 = r6.f1259k
            A4.h r4 = r6.f1258j
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r7 == 0) goto L39
            D1.a r7 = new D1.a
            r0 = 0
            r7.<init>(r3, r0)
            r6.f1256h = r2
            java.lang.Object r7 = r4.b(r7, r6)
            if (r7 != r5) goto L48
            goto L47
        L39:
            D1.b r7 = new D1.b
            r2 = 0
            r7.<init>(r4, r3, r2)
            r6.f1256h = r1
            java.lang.Object r7 = x4.AbstractC1888A.H(r0, r7, r6)
            if (r7 != r5) goto L48
        L47:
            return r5
        L48:
            X3.y r7 = X3.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D1.c.r(java.lang.Object):java.lang.Object");
    }
}
