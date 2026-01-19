package a3;

import A4.g0;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: a3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0814c extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public g0 f10641h;

    /* renamed from: i, reason: collision with root package name */
    public int f10642i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0818g f10643j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f10644k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0814c(C0818g c0818g, String str, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f10643j = c0818g;
        this.f10644k = str;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0814c) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0814c(this.f10643j, this.f10644k, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (r7 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (r7 == r5) goto L18;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f10642i
            X3.y r1 = X3.y.a
            a3.g r2 = r6.f10643j
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L16
            A4.g0 r0 = r6.f10641h
            X3.a.e(r7)
            goto L47
        L16:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1e:
            X3.a.e(r7)
            goto L38
        L22:
            X3.a.e(r7)
            Y2.x r7 = r2.f10656b
            r6.f10642i = r4
            com.bot.core.database.dao.McpServerDao r7 = r7.a
            java.lang.String r0 = r6.f10644k
            java.lang.Object r7 = r7.delete(r0, r6)
            if (r7 != r5) goto L34
            goto L35
        L34:
            r7 = r1
        L35:
            if (r7 != r5) goto L38
            goto L46
        L38:
            A4.g0 r0 = r2.f10657c
            Y2.x r7 = r2.f10656b
            r6.f10641h = r0
            r6.f10642i = r3
            java.io.Serializable r7 = r7.a(r6)
            if (r7 != r5) goto L47
        L46:
            return r5
        L47:
            r0.k(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0814c.r(java.lang.Object):java.lang.Object");
    }
}
