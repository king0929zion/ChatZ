package a3;

import A4.g0;
import b4.InterfaceC0905c;
import com.bot.core.model.McpServer;
import x4.InterfaceC1942y;

/* renamed from: a3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0817f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public g0 f10652h;

    /* renamed from: i, reason: collision with root package name */
    public int f10653i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0818g f10654j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ McpServer f10655k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0817f(C0818g c0818g, InterfaceC0905c interfaceC0905c, McpServer mcpServer) {
        super(2, interfaceC0905c);
        this.f10654j = c0818g;
        this.f10655k = mcpServer;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0817f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0817f(this.f10654j, interfaceC0905c, this.f10655k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        if (r6 == r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r6.c(r5.f10655k, r5) == r4) goto L15;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.f10653i
            a3.g r1 = r5.f10654j
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L14
            A4.g0 r0 = r5.f10652h
            X3.a.e(r6)
            goto L3f
        L14:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1c:
            X3.a.e(r6)
            goto L30
        L20:
            X3.a.e(r6)
            Y2.x r6 = r1.f10656b
            r5.f10653i = r3
            com.bot.core.model.McpServer r0 = r5.f10655k
            java.lang.Object r6 = r6.c(r0, r5)
            if (r6 != r4) goto L30
            goto L3e
        L30:
            A4.g0 r0 = r1.f10657c
            Y2.x r6 = r1.f10656b
            r5.f10652h = r0
            r5.f10653i = r2
            java.io.Serializable r6 = r6.a(r5)
            if (r6 != r4) goto L3f
        L3e:
            return r4
        L3f:
            r0.k(r6)
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0817f.r(java.lang.Object):java.lang.Object");
    }
}
