package r;

import B0.EnumC0041q;
import b4.InterfaceC0905c;
import m4.C1288w;

/* loaded from: classes.dex */
public final class d2 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f14290f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f14291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ EnumC0041q f14292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1288w f14293i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(EnumC0041q enumC0041q, C1288w c1288w, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14292h = enumC0041q;
        this.f14293i = c1288w;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d2) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d2 d2Var = new d2(this.f14292h, this.f14293i, interfaceC0905c);
        d2Var.f14291g = obj;
        return d2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        r4.f12973c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r8 != r7) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r8.f471c != 2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r4.f12973c = r.C1528J0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.size();
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        if (r10 >= r8) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006b, code lost:
    
        r11 = (B0.y) r9.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (r11.b() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (B0.AbstractC0047x.f(r11, r1.f419i.f422A, r1.d()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
    
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        r4.f12973c = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        r16.f14291g = r1;
        r16.f14290f = 2;
        r8 = r1.b(B0.EnumC0041q.f477f, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0096, code lost:
    
        if (r8 != r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        return r7;
     */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0096 -> B:6:0x0099). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.f14290f
            r.H0 r2 = r.C1524H0.a
            r3 = 2
            m4.w r4 = r0.f14293i
            r5 = 0
            r6 = 1
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r1 == 0) goto L30
            if (r1 == r6) goto L26
            if (r1 != r3) goto L1e
            java.lang.Object r1 = r0.f14291g
            B0.V r1 = (B0.V) r1
            X3.a.e(r17)
            r8 = r17
            goto L99
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            java.lang.Object r1 = r0.f14291g
            B0.V r1 = (B0.V) r1
            X3.a.e(r17)
            r8 = r17
            goto L44
        L30:
            X3.a.e(r17)
            java.lang.Object r1 = r0.f14291g
            B0.V r1 = (B0.V) r1
        L37:
            r0.f14291g = r1
            r0.f14290f = r6
            B0.q r8 = r0.f14292h
            java.lang.Object r8 = r1.b(r8, r0)
            if (r8 != r7) goto L44
            goto L98
        L44:
            B0.p r8 = (B0.C0040p) r8
            java.lang.Object r9 = r8.a
            int r10 = r9.size()
            r11 = r5
        L4d:
            if (r11 >= r10) goto Lb9
            java.lang.Object r12 = r9.get(r11)
            B0.y r12 = (B0.y) r12
            boolean r12 = B0.AbstractC0047x.c(r12)
            if (r12 != 0) goto Lb6
            int r8 = r8.f471c
            if (r8 != r3) goto L64
            r.J0 r1 = r.C1528J0.a
            r4.f12973c = r1
            goto Lc6
        L64:
            int r8 = r9.size()
            r10 = r5
        L69:
            if (r10 >= r8) goto L8c
            java.lang.Object r11 = r9.get(r10)
            B0.y r11 = (B0.y) r11
            boolean r12 = r11.b()
            if (r12 != 0) goto L89
            B0.X r12 = r1.f419i
            long r12 = r12.f422A
            long r14 = r1.d()
            boolean r11 = B0.AbstractC0047x.f(r11, r12, r14)
            if (r11 == 0) goto L86
            goto L89
        L86:
            int r10 = r10 + 1
            goto L69
        L89:
            r4.f12973c = r2
            goto Lc6
        L8c:
            r0.f14291g = r1
            r0.f14290f = r3
            B0.q r8 = B0.EnumC0041q.f477f
            java.lang.Object r8 = r1.b(r8, r0)
            if (r8 != r7) goto L99
        L98:
            return r7
        L99:
            B0.p r8 = (B0.C0040p) r8
            java.lang.Object r8 = r8.a
            int r9 = r8.size()
            r10 = r5
        La2:
            if (r10 >= r9) goto L37
            java.lang.Object r11 = r8.get(r10)
            B0.y r11 = (B0.y) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Lb3
            r4.f12973c = r2
            goto Lc6
        Lb3:
            int r10 = r10 + 1
            goto La2
        Lb6:
            int r11 = r11 + 1
            goto L4d
        Lb9:
            r.I0 r1 = new r.I0
            java.lang.Object r2 = r9.get(r5)
            B0.y r2 = (B0.y) r2
            r1.<init>(r2)
            r4.f12973c = r1
        Lc6:
            X3.y r1 = X3.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r.d2.r(java.lang.Object):java.lang.Object");
    }
}
