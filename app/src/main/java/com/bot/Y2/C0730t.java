package Y2;

import S2.Y;
import com.bot.core.model.McpHeader;
import com.bot.core.model.McpServer;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import u4.AbstractC1776n;

/* renamed from: Y2.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0730t {
    public static final C0721j Companion = new Object();
    public final McpServer a;

    /* renamed from: b, reason: collision with root package name */
    public final N4.m f9768b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f9769c;

    /* renamed from: d, reason: collision with root package name */
    public final t3.d f9770d;

    /* renamed from: e, reason: collision with root package name */
    public String f9771e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9772f;

    public C0730t(McpServer mcpServer) {
        AbstractC1276k.f(mcpServer, "server");
        this.a = mcpServer;
        this.f9768b = Y4.d.e(new Y(7));
        this.f9769c = new AtomicInteger(0);
        this.f9770d = h5.e.O(10000L, 30000L, 30000L, new Y(8));
    }

    public static final kotlinx.serialization.json.c a(C0730t c0730t, String str, kotlinx.serialization.json.c cVar) {
        c0730t.getClass();
        F1.e eVar = new F1.e(2);
        AbstractC1410a.D(eVar, "jsonrpc", "2.0");
        eVar.e(Attribute.ID_ATTR, new N4.n(Integer.valueOf(c0730t.f9769c.incrementAndGet()), false));
        AbstractC1410a.D(eVar, "method", str);
        eVar.e("params", cVar);
        return eVar.d();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:1|(2:3|(9:5|6|7|(1:(1:10)(2:19|20))(7:21|22|23|(1:25)(1:30)|26|27|(1:29))|11|12|(1:14)|15|16))|33|6|7|(0)(0)|11|12|(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ae, code lost:
    
        r8 = X3.a.b(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(Y2.C0730t r6, kotlinx.serialization.json.c r7, d4.c r8) {
        /*
            com.bot.core.model.McpServer r0 = r6.a
            boolean r1 = r8 instanceof Y2.C0728q
            if (r1 == 0) goto L15
            r1 = r8
            Y2.q r1 = (Y2.C0728q) r1
            int r2 = r1.f9760i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f9760i = r2
            goto L1a
        L15:
            Y2.q r1 = new Y2.q
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.f9758g
            int r2 = r1.f9760i
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            X3.a.e(r8)     // Catch: java.lang.Throwable -> L29
            goto Lab
        L29:
            r6 = move-exception
            goto Lae
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            X3.a.e(r8)
            java.lang.String r8 = r0.f11215e
            java.lang.CharSequence r8 = u4.AbstractC1776n.l0(r8)
            java.lang.String r8 = r8.toString()
            char[] r2 = new char[r3]
            r5 = 47
            r2[r4] = r5
            java.lang.String r8 = u4.AbstractC1776n.n0(r8, r2)
            t3.d r6 = r6.f9770d     // Catch: java.lang.Throwable -> L29
            E3.d r2 = new E3.d     // Catch: java.lang.Throwable -> L29
            r2.<init>()     // Catch: java.lang.Throwable -> L29
            o4.AbstractC1410a.U(r2, r8)     // Catch: java.lang.Throwable -> L29
            I3.e r8 = I3.AbstractC0239c.a     // Catch: java.lang.Throwable -> L29
            h5.e.N(r2, r8)     // Catch: java.lang.Throwable -> L29
            java.util.List r8 = r0.f11216f     // Catch: java.lang.Throwable -> L29
            d(r2, r8)     // Catch: java.lang.Throwable -> L29
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L29
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 != 0) goto L80
            J3.a r7 = J3.a.a     // Catch: java.lang.Throwable -> L29
            r2.f1307d = r7     // Catch: java.lang.Throwable -> L29
            m4.A r7 = m4.AbstractC1289x.b(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Type r0 = s4.j.w(r7)     // Catch: java.lang.Throwable -> L29
            m4.e r8 = m4.AbstractC1289x.a(r8)     // Catch: java.lang.Throwable -> L29
            R3.a r5 = new R3.a     // Catch: java.lang.Throwable -> L29
            r5.<init>(r8, r0, r7)     // Catch: java.lang.Throwable -> L29
            r2.b(r5)     // Catch: java.lang.Throwable -> L29
            goto L96
        L80:
            r2.f1307d = r7     // Catch: java.lang.Throwable -> L29
            m4.A r7 = m4.AbstractC1289x.b(r8)     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Type r0 = s4.j.w(r7)     // Catch: java.lang.Throwable -> L29
            m4.e r8 = m4.AbstractC1289x.a(r8)     // Catch: java.lang.Throwable -> L29
            R3.a r5 = new R3.a     // Catch: java.lang.Throwable -> L29
            r5.<init>(r8, r0, r7)     // Catch: java.lang.Throwable -> L29
            r2.b(r5)     // Catch: java.lang.Throwable -> L29
        L96:
            I3.u r7 = I3.u.f2755c     // Catch: java.lang.Throwable -> L29
            r2.c(r7)     // Catch: java.lang.Throwable -> L29
            F3.k r7 = new F3.k     // Catch: java.lang.Throwable -> L29
            r7.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            r1.f9760i = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r8 = r7.b(r1)     // Catch: java.lang.Throwable -> L29
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r8 != r6) goto Lab
            return r6
        Lab:
            F3.c r8 = (F3.c) r8     // Catch: java.lang.Throwable -> L29
            goto Lb2
        Lae:
            X3.k r8 = X3.a.b(r6)
        Lb2:
            java.lang.Throwable r6 = X3.l.a(r8)
            if (r6 == 0) goto Lc5
            androidx.lifecycle.N r7 = i5.a.a
            r6.getMessage()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r7.getClass()
            androidx.lifecycle.N.y(r6)
        Lc5:
            X3.y r6 = X3.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.b(Y2.t, kotlinx.serialization.json.c, d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(Y2.C0730t r4, kotlinx.serialization.json.c r5, d4.c r6) {
        /*
            boolean r0 = r6 instanceof Y2.r
            if (r0 == 0) goto L13
            r0 = r6
            Y2.r r0 = (Y2.r) r0
            int r1 = r0.f9763i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9763i = r1
            goto L18
        L13:
            Y2.r r0 = new Y2.r
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f9761g
            int r1 = r0.f9763i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r6)
            goto L3b
        L25:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            X3.a.e(r6)
            r0.f9763i = r2
            java.io.Serializable r6 = r4.i(r5, r0)
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r6 != r4) goto L3b
            return r4
        L3b:
            X3.i r6 = (X3.i) r6
            java.lang.Object r4 = r6.f9393c
            kotlinx.serialization.json.c r4 = (kotlinx.serialization.json.c) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.c(Y2.t, kotlinx.serialization.json.c, d4.c):java.lang.Object");
    }

    public static void d(E3.d dVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            McpHeader mcpHeader = (McpHeader) it.next();
            if (!AbstractC1776n.Q(mcpHeader.a)) {
                s4.j.A(dVar, mcpHeader.a, mcpHeader.f11210b);
            }
        }
    }

    public static kotlinx.serialization.json.b j(Object obj) {
        if (obj == null) {
            return JsonNull.INSTANCE;
        }
        if (obj instanceof kotlinx.serialization.json.b) {
            return (kotlinx.serialization.json.b) obj;
        }
        if (obj instanceof String) {
            return N4.j.a((String) obj);
        }
        if (obj instanceof Number) {
            M4.F f6 = N4.j.a;
            return new N4.n((Number) obj, false);
        }
        if (obj instanceof Boolean) {
            M4.F f7 = N4.j.a;
            return new N4.n((Boolean) obj, false);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                return N4.j.a(obj.toString());
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(Y3.n.Z(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(j(it.next()));
            }
            return new kotlinx.serialization.json.a(arrayList);
        }
        Set<Map.Entry> entrySet = ((Map) obj).entrySet();
        int H3 = Y3.C.H(Y3.n.Z(entrySet, 10));
        if (H3 < 16) {
            H3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put(String.valueOf(entry.getKey()), j(entry.getValue()));
        }
        return new kotlinx.serialization.json.c(linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r5, java.util.Map r6, d4.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof Y2.C0722k
            if (r0 == 0) goto L13
            r0 = r7
            Y2.k r0 = (Y2.C0722k) r0
            int r1 = r0.f9731i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9731i = r1
            goto L18
        L13:
            Y2.k r0 = new Y2.k
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f9729g
            int r1 = r0.f9731i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r7)
            goto L45
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            X3.a.e(r7)
            E4.e r7 = x4.AbstractC1898K.a
            E4.d r7 = E4.d.f1360f
            Y2.l r1 = new Y2.l
            r3 = 0
            r1.<init>(r4, r6, r5, r3)
            r0.f9731i = r2
            java.lang.Object r7 = x4.AbstractC1888A.H(r7, r1, r0)
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r7 != r5) goto L45
            return r5
        L45:
            X3.l r7 = (X3.l) r7
            java.lang.Object r5 = r7.f9396c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.e(java.lang.String, java.util.Map, d4.c):java.lang.Object");
    }

    public final void f() {
        this.f9772f = false;
        this.f9771e = null;
        this.f9770d.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y2.C0724m
            if (r0 == 0) goto L13
            r0 = r5
            Y2.m r0 = (Y2.C0724m) r0
            int r1 = r0.f9743i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9743i = r1
            goto L18
        L13:
            Y2.m r0 = new Y2.m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9741g
            int r1 = r0.f9743i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L45
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            X3.a.e(r5)
            E4.e r5 = x4.AbstractC1898K.a
            E4.d r5 = E4.d.f1360f
            Y2.n r1 = new Y2.n
            r3 = 0
            r1.<init>(r4, r3)
            r0.f9743i = r2
            java.lang.Object r5 = x4.AbstractC1888A.H(r5, r1, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L45
            return r0
        L45:
            X3.l r5 = (X3.l) r5
            java.lang.Object r5 = r5.f9396c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.g(d4.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(d4.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof Y2.C0726o
            if (r0 == 0) goto L13
            r0 = r5
            Y2.o r0 = (Y2.C0726o) r0
            int r1 = r0.f9751i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f9751i = r1
            goto L18
        L13:
            Y2.o r0 = new Y2.o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f9749g
            int r1 = r0.f9751i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            X3.a.e(r5)
            goto L45
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            X3.a.e(r5)
            E4.e r5 = x4.AbstractC1898K.a
            E4.d r5 = E4.d.f1360f
            Y2.p r1 = new Y2.p
            r3 = 0
            r1.<init>(r4, r3)
            r0.f9751i = r2
            java.lang.Object r5 = x4.AbstractC1888A.H(r5, r1, r0)
            c4.a r0 = c4.EnumC0927a.f11114c
            if (r5 != r0) goto L45
            return r0
        L45:
            X3.l r5 = (X3.l) r5
            java.lang.Object r5 = r5.f9396c
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.h(d4.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0104, code lost:
    
        if (r13 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0145, code lost:
    
        if (r13 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ea, code lost:
    
        if (r13 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(kotlinx.serialization.json.c r12, d4.c r13) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.C0730t.i(kotlinx.serialization.json.c, d4.c):java.io.Serializable");
    }
}
