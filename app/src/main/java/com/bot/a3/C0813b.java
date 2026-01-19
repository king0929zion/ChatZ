package a3;

import A4.g0;
import b4.InterfaceC0905c;
import com.bot.core.model.McpServer;
import x4.InterfaceC1942y;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0813b extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public g0 f10637h;

    /* renamed from: i, reason: collision with root package name */
    public int f10638i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C0818g f10639j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ McpServer f10640k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0813b(C0818g c0818g, InterfaceC0905c interfaceC0905c, McpServer mcpServer) {
        super(2, interfaceC0905c);
        this.f10639j = c0818g;
        this.f10640k = mcpServer;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0813b) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0813b(this.f10639j, interfaceC0905c, this.f10640k);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        if (r9 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r9 == r5) goto L18;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f10638i
            X3.y r1 = X3.y.a
            a3.g r2 = r8.f10639j
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L22
            if (r0 == r4) goto L1e
            if (r0 != r3) goto L16
            A4.g0 r0 = r8.f10637h
            X3.a.e(r9)
            goto L4f
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            X3.a.e(r9)
            goto L40
        L22:
            X3.a.e(r9)
            Y2.x r9 = r2.f10656b
            r8.f10638i = r4
            com.bot.core.database.dao.McpServerDao r0 = r9.a
            long r6 = java.lang.System.currentTimeMillis()
            com.bot.core.model.McpServer r4 = r8.f10640k
            com.bot.core.database.entity.McpServerEntity r9 = r9.b(r4, r6)
            java.lang.Object r9 = r0.upsert(r9, r8)
            if (r9 != r5) goto L3c
            goto L3d
        L3c:
            r9 = r1
        L3d:
            if (r9 != r5) goto L40
            goto L4e
        L40:
            A4.g0 r0 = r2.f10657c
            Y2.x r9 = r2.f10656b
            r8.f10637h = r0
            r8.f10638i = r3
            java.io.Serializable r9 = r9.a(r8)
            if (r9 != r5) goto L4f
        L4e:
            return r5
        L4f:
            r0.k(r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.C0813b.r(java.lang.Object):java.lang.Object");
    }
}
