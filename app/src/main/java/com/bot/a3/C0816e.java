package a3;

import Y2.C0730t;
import b4.InterfaceC0905c;
import com.bot.core.model.McpServer;
import x4.InterfaceC1942y;

/* renamed from: a3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0816e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C0730t f10648h;

    /* renamed from: i, reason: collision with root package name */
    public int f10649i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ McpServer f10650j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0818g f10651k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0816e(C0818g c0818g, InterfaceC0905c interfaceC0905c, McpServer mcpServer) {
        super(2, interfaceC0905c);
        this.f10650j = mcpServer;
        this.f10651k = c0818g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0816e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0816e(this.f10651k, interfaceC0905c, this.f10650j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        if (r10 == r7) goto L25;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f10649i
            Y2.u r1 = Y2.EnumC0731u.f9776g
            r2 = 2
            r3 = 1
            X3.y r4 = X3.y.a
            r5 = 0
            a3.g r6 = r9.f10651k
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2f
            if (r0 == r3) goto L25
            if (r0 != r2) goto L1d
            Y2.t r0 = r9.f10648h
            X3.a.e(r10)
            X3.l r10 = (X3.l) r10
            java.lang.Object r10 = r10.f9396c
            goto L77
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            Y2.t r0 = r9.f10648h
            X3.a.e(r10)
            X3.l r10 = (X3.l) r10
            java.lang.Object r10 = r10.f9396c
            goto L49
        L2f:
            X3.a.e(r10)
            Y2.t r10 = new Y2.t
            com.bot.core.model.McpServer r0 = r9.f10650j
            r10.<init>(r0)
            r6.f10661g = r10
            r9.f10648h = r10
            r9.f10649i = r3
            java.lang.Object r0 = r10.g(r9)
            if (r0 != r7) goto L46
            goto L76
        L46:
            r8 = r0
            r0 = r10
            r10 = r8
        L49:
            boolean r3 = r10 instanceof X3.k
            if (r3 == 0) goto L6c
            A4.g0 r3 = r6.f10659e
            a3.a r6 = new a3.a
            java.lang.Throwable r10 = X3.l.a(r10)
            if (r10 == 0) goto L5d
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L5f
        L5d:
            java.lang.String r10 = "连接失败"
        L5f:
            r6.<init>(r1, r5, r10, r2)
            r3.getClass()
            r3.l(r5, r6)
            r0.f()
            return r4
        L6c:
            r9.f10648h = r0
            r9.f10649i = r2
            java.lang.Object r10 = r0.h(r9)
            if (r10 != r7) goto L77
        L76:
            return r7
        L77:
            boolean r3 = r10 instanceof X3.k
            if (r3 == 0) goto L9a
            A4.g0 r3 = r6.f10659e
            a3.a r6 = new a3.a
            java.lang.Throwable r10 = X3.l.a(r10)
            if (r10 == 0) goto L8b
            java.lang.String r10 = r10.getMessage()
            if (r10 != 0) goto L8d
        L8b:
            java.lang.String r10 = "获取工具列表失败"
        L8d:
            r6.<init>(r1, r5, r10, r2)
            r3.getClass()
            r3.l(r5, r6)
            r0.f()
            return r4
        L9a:
            A4.g0 r0 = r6.f10659e
            a3.a r1 = new a3.a
            if (r3 == 0) goto La2
            Y3.v r10 = Y3.v.f9812c
        La2:
            java.util.List r10 = (java.util.List) r10
            r2 = 4
            Y2.u r3 = Y2.EnumC0731u.f9775f
            r1.<init>(r3, r10, r5, r2)
            r0.getClass()
            r0.l(r5, r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0816e.r(java.lang.Object):java.lang.Object");
    }
}
