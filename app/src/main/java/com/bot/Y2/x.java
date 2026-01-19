package Y2;

import M4.C0255c;
import S2.Y;
import com.bot.core.database.dao.McpServerDao;
import com.bot.core.database.entity.McpServerEntity;
import com.bot.core.model.McpHeader;
import com.bot.core.model.McpServer;
import java.util.List;

/* loaded from: classes.dex */
public final class x {
    public final McpServerDao a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.m f9785b = Y4.d.e(new Y(9));

    public x(McpServerDao mcpServerDao) {
        this.a = mcpServerDao;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Y3.v] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(d4.c r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof Y2.C0732v
            if (r0 == 0) goto L13
            r0 = r13
            Y2.v r0 = (Y2.C0732v) r0
            int r1 = r0.f9780i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9780i = r1
            goto L18
        L13:
            Y2.v r0 = new Y2.v
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.f9778g
            int r1 = r0.f9780i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r13)
            goto L3d
        L25:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L2d:
            X3.a.e(r13)
            r0.f9780i = r2
            com.bot.core.database.dao.McpServerDao r13 = r12.a
            java.lang.Object r13 = r13.getAll(r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r13 != r0) goto L3d
            return r0
        L3d:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = Y3.n.Z(r13, r0)
            r1.<init>(r0)
            java.util.Iterator r13 = r13.iterator()
        L4e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r13.next()
            r2 = r0
            com.bot.core.database.entity.McpServerEntity r2 = (com.bot.core.database.entity.McpServerEntity) r2
            java.lang.String r0 = r2.getHeadersJson()
            boolean r3 = u4.AbstractC1776n.Q(r0)
            Y3.v r4 = Y3.v.f9812c
            if (r3 == 0) goto L69
        L67:
            r11 = r4
            goto L8f
        L69:
            N4.m r3 = r12.f9785b     // Catch: java.lang.Throwable -> L81
            r3.getClass()     // Catch: java.lang.Throwable -> L81
            M4.c r5 = new M4.c     // Catch: java.lang.Throwable -> L81
            com.bot.core.model.McpHeader$Companion r6 = com.bot.core.model.McpHeader.Companion     // Catch: java.lang.Throwable -> L81
            kotlinx.serialization.KSerializer r6 = r6.serializer()     // Catch: java.lang.Throwable -> L81
            r7 = 0
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r3.a(r0, r5)     // Catch: java.lang.Throwable -> L81
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L81
            goto L86
        L81:
            r0 = move-exception
            X3.k r0 = X3.a.b(r0)
        L86:
            boolean r3 = r0 instanceof X3.k
            if (r3 == 0) goto L8b
            goto L8c
        L8b:
            r4 = r0
        L8c:
            java.util.List r4 = (java.util.List) r4
            goto L67
        L8f:
            com.bot.core.model.McpServer r5 = new com.bot.core.model.McpServer
            java.lang.String r6 = r2.getId()
            boolean r7 = r2.isEnabled()
            java.lang.String r8 = r2.getName()
            java.lang.String r9 = r2.getTransportType()
            java.lang.String r10 = r2.getServerAddress()
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r1.add(r5)
            goto L4e
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.x.a(d4.c):java.io.Serializable");
    }

    public final McpServerEntity b(McpServer mcpServer, long j3) {
        List list = mcpServer.f11216f;
        N4.m mVar = this.f9785b;
        mVar.getClass();
        return new McpServerEntity(mcpServer.a, mcpServer.f11212b, mcpServer.f11213c, mcpServer.f11214d, mcpServer.f11215e, mVar.b(new C0255c(McpHeader.Companion.serializer(), 0), list), j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r2.upsert(r9, r0) != r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r10 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.bot.core.model.McpServer r9, d4.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof Y2.C0733w
            if (r0 == 0) goto L13
            r0 = r10
            Y2.w r0 = (Y2.C0733w) r0
            int r1 = r0.f9784j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9784j = r1
            goto L18
        L13:
            Y2.w r0 = new Y2.w
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f9782h
            int r1 = r0.f9784j
            com.bot.core.database.dao.McpServerDao r2 = r8.a
            r3 = 2
            r4 = 1
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L3a
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2c
            X3.a.e(r10)
            goto L67
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            com.bot.core.model.McpServer r9 = r0.f9781g
            X3.a.e(r10)
            goto L4a
        L3a:
            X3.a.e(r10)
            java.lang.String r10 = r9.a
            r0.f9781g = r9
            r0.f9784j = r4
            java.lang.Object r10 = r2.getById(r10, r0)
            if (r10 != r5) goto L4a
            goto L66
        L4a:
            com.bot.core.database.entity.McpServerEntity r10 = (com.bot.core.database.entity.McpServerEntity) r10
            if (r10 == 0) goto L53
            long r6 = r10.getCreatedAt()
            goto L57
        L53:
            long r6 = java.lang.System.currentTimeMillis()
        L57:
            com.bot.core.database.entity.McpServerEntity r9 = r8.b(r9, r6)
            r10 = 0
            r0.f9781g = r10
            r0.f9784j = r3
            java.lang.Object r9 = r2.upsert(r9, r0)
            if (r9 != r5) goto L67
        L66:
            return r5
        L67:
            X3.y r9 = X3.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.x.c(com.bot.core.model.McpServer, d4.c):java.lang.Object");
    }
}
