package p;

import b4.InterfaceC0905c;

/* renamed from: p.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1458t extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f13794f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f13795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1459u f13796h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458t(C1459u c1459u, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13796h = c1459u;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1458t) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1458t c1458t = new C1458t(this.f13796h, interfaceC0905c);
        c1458t.f13795g = obj;
        return c1458t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004d, code lost:
    
        if (r12 != r4) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        if (r12 == r4) goto L16;
     */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x004d -> B:6:0x0050). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f13794f
            r1 = 2
            p.u r2 = r11.f13796h
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1e
            if (r0 != r1) goto L16
            java.lang.Object r0 = r11.f13795g
            B0.V r0 = (B0.V) r0
            X3.a.e(r12)
            goto L50
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            java.lang.Object r0 = r11.f13795g
            B0.V r0 = (B0.V) r0
            X3.a.e(r12)
            goto L39
        L26:
            X3.a.e(r12)
            java.lang.Object r12 = r11.f13795g
            r0 = r12
            B0.V r0 = (B0.V) r0
            r11.f13795g = r0
            r11.f13794f = r3
            java.lang.Object r12 = r.f2.c(r0, r11, r1)
            if (r12 != r4) goto L39
            goto L4f
        L39:
            B0.y r12 = (B0.y) r12
            long r5 = r12.a
            r2.f13805h = r5
            long r5 = r12.f483c
            r2.f13799b = r5
        L43:
            r11.f13795g = r0
            r11.f13794f = r1
            B0.q r12 = B0.EnumC0041q.f476e
            java.lang.Object r12 = r0.b(r12, r11)
            if (r12 != r4) goto L50
        L4f:
            return r4
        L50:
            B0.p r12 = (B0.C0040p) r12
            java.lang.Object r12 = r12.a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r12.size()
            r3.<init>(r5)
            int r5 = r12.size()
            r6 = 0
            r7 = r6
        L63:
            if (r7 >= r5) goto L76
            java.lang.Object r8 = r12.get(r7)
            r9 = r8
            B0.y r9 = (B0.y) r9
            boolean r9 = r9.f484d
            if (r9 == 0) goto L73
            r3.add(r8)
        L73:
            int r7 = r7 + 1
            goto L63
        L76:
            int r12 = r3.size()
        L7a:
            if (r6 >= r12) goto L91
            java.lang.Object r5 = r3.get(r6)
            r7 = r5
            B0.y r7 = (B0.y) r7
            long r7 = r7.a
            long r9 = r2.f13805h
            boolean r7 = B0.AbstractC0047x.e(r7, r9)
            if (r7 == 0) goto L8e
            goto L92
        L8e:
            int r6 = r6 + 1
            goto L7a
        L91:
            r5 = 0
        L92:
            B0.y r5 = (B0.y) r5
            if (r5 != 0) goto L9d
            java.lang.Object r12 = Y3.m.q0(r3)
            r5 = r12
            B0.y r5 = (B0.y) r5
        L9d:
            if (r5 == 0) goto La7
            long r6 = r5.a
            r2.f13805h = r6
            long r5 = r5.f483c
            r2.f13799b = r5
        La7:
            boolean r12 = r3.isEmpty()
            if (r12 == 0) goto L43
            r0 = -1
            r2.f13805h = r0
            X3.y r12 = X3.y.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1458t.r(java.lang.Object):java.lang.Object");
    }
}
