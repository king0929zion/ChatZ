package r;

import Z2.C0782v0;
import b4.InterfaceC0905c;
import l4.InterfaceC1193a;
import m4.C1285t;

/* renamed from: r.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1562e0 extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public C1285t f14296f;

    /* renamed from: g, reason: collision with root package name */
    public int f14297g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14298h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l4.c f14299i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l4.e f14300j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f14301k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0782v0 f14302l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1562e0(l4.c cVar, l4.e eVar, InterfaceC1193a interfaceC1193a, C0782v0 c0782v0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f14299i = cVar;
        this.f14300j = eVar;
        this.f14301k = interfaceC1193a;
        this.f14302l = c0782v0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1562e0) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1562e0 c1562e0 = new C1562e0(this.f14299i, this.f14300j, this.f14301k, this.f14302l, interfaceC0905c);
        c1562e0.f14298h = obj;
        return c1562e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r12 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, m4.t] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f14297g
            r1 = 3
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L31
            if (r0 == r3) goto L28
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L15
            X3.a.e(r12)
            r10 = r11
            goto L97
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            m4.t r0 = r11.f14296f
            java.lang.Object r2 = r11.f14298h
            B0.V r2 = (B0.V) r2
            X3.a.e(r12)
            r10 = r11
            goto L66
        L28:
            java.lang.Object r0 = r11.f14298h
            B0.V r0 = (B0.V) r0
            X3.a.e(r12)
        L2f:
            r5 = r0
            goto L45
        L31:
            X3.a.e(r12)
            java.lang.Object r12 = r11.f14298h
            r0 = r12
            B0.V r0 = (B0.V) r0
            r11.f14298h = r0
            r11.f14297g = r3
            java.lang.Object r12 = r.f2.c(r0, r11, r2)
            if (r12 != r4) goto L2f
            r10 = r11
            goto L96
        L45:
            B0.y r12 = (B0.y) r12
            m4.t r0 = new m4.t
            r0.<init>()
            long r6 = r12.a
            int r8 = r12.f489i
            B4.D r9 = new B4.D
            r12 = 28
            r9.<init>(r0, r12)
            r11.f14298h = r5
            r11.f14296f = r0
            r11.f14297g = r2
            r10 = r11
            java.lang.Object r12 = r.AbstractC1571h0.c(r5, r6, r8, r9, r10)
            if (r12 != r4) goto L65
            goto L96
        L65:
            r2 = r5
        L66:
            B0.y r12 = (B0.y) r12
            if (r12 == 0) goto La7
            long r5 = r12.f483c
            n0.b r3 = new n0.b
            r3.<init>(r5)
            l4.c r5 = r10.f14299i
            r5.f(r3)
            float r0 = r0.f12970c
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            l4.e r0 = r10.f14300j
            r0.m(r12, r3)
            long r5 = r12.a
            Z2.c0 r12 = new Z2.c0
            r12.<init>(r1, r0)
            r0 = 0
            r10.f14298h = r0
            r10.f14296f = r0
            r10.f14297g = r1
            java.lang.Object r12 = r.AbstractC1571h0.h(r2, r5, r12, r11)
            if (r12 != r4) goto L97
        L96:
            return r4
        L97:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto La5
            l4.a r12 = r10.f14301k
            r12.b()
            goto La7
        La5:
            float r12 = r.AbstractC1571h0.a
        La7:
            X3.y r12 = X3.y.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1562e0.r(java.lang.Object):java.lang.Object");
    }
}
