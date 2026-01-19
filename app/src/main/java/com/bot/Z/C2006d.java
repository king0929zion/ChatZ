package z;

import B0.V;
import b4.InterfaceC0905c;

/* renamed from: z.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2006d extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public B0.y f16097f;

    /* renamed from: g, reason: collision with root package name */
    public B0.y f16098g;

    /* renamed from: h, reason: collision with root package name */
    public int f16099h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f16100i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C2004b f16101j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2006d(C2004b c2004b, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f16101j = c2004b;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C2006d) p((InterfaceC0905c) obj2, (V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C2006d c2006d = new C2006d(this.f16101j, interfaceC0905c);
        c2006d.f16100i = obj;
        return c2006d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r13 == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r13 == r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0060 -> B:6:0x0063). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            z.b r0 = r12.f16101j
            T.g0 r0 = r0.f16050c
            int r1 = r12.f16099h
            B0.q r2 = B0.EnumC0041q.f475c
            r3 = 2
            r4 = 0
            r5 = 1
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L27
            if (r1 != r3) goto L1f
            B0.y r1 = r12.f16098g
            B0.y r5 = r12.f16097f
            java.lang.Object r7 = r12.f16100i
            B0.V r7 = (B0.V) r7
            X3.a.e(r13)
            goto L63
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            java.lang.Object r1 = r12.f16100i
            B0.V r1 = (B0.V) r1
            X3.a.e(r13)
            goto L42
        L2f:
            X3.a.e(r13)
            java.lang.Object r13 = r12.f16100i
            r1 = r13
            B0.V r1 = (B0.V) r1
            r12.f16100i = r1
            r12.f16099h = r5
            java.lang.Object r13 = r.f2.b(r1, r4, r2, r12)
            if (r13 != r6) goto L42
            goto L62
        L42:
            B0.y r13 = (B0.y) r13
            n0.b r5 = new n0.b
            r7 = 0
            r5.<init>(r7)
            r0.setValue(r5)
            r5 = 0
            r7 = r1
            r1 = r5
            r5 = r13
        L52:
            if (r1 != 0) goto L88
            r12.f16100i = r7
            r12.f16097f = r5
            r12.f16098g = r1
            r12.f16099h = r3
            java.lang.Object r13 = r7.b(r2, r12)
            if (r13 != r6) goto L63
        L62:
            return r6
        L63:
            B0.p r13 = (B0.C0040p) r13
            java.lang.Object r8 = r13.a
            int r9 = r8.size()
            r10 = r4
        L6c:
            if (r10 >= r9) goto L7e
            java.lang.Object r11 = r8.get(r10)
            B0.y r11 = (B0.y) r11
            boolean r11 = B0.AbstractC0047x.c(r11)
            if (r11 != 0) goto L7b
            goto L52
        L7b:
            int r10 = r10 + 1
            goto L6c
        L7e:
            java.lang.Object r13 = r13.a
            java.lang.Object r13 = r13.get(r4)
            r1 = r13
            B0.y r1 = (B0.y) r1
            goto L52
        L88:
            long r1 = r1.f483c
            long r3 = r5.f483c
            long r1 = n0.C1353b.e(r1, r3)
            n0.b r13 = new n0.b
            r13.<init>(r1)
            r0.setValue(r13)
            X3.y r13 = X3.y.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: z.C2006d.r(java.lang.Object):java.lang.Object");
    }
}
