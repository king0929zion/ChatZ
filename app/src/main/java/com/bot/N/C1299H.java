package n;

import b4.InterfaceC0905c;
import c4.EnumC0927a;
import m4.C1285t;
import x4.InterfaceC1942y;

/* renamed from: n.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1299H extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public C1285t f13000h;

    /* renamed from: i, reason: collision with root package name */
    public int f13001i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f13002j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ T.X f13003k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1300I f13004l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1299H(T.X x5, C1300I c1300i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13003k = x5;
        this.f13004l = c1300i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((C1299H) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1299H c1299h = new C1299H(this.f13003k, this.f13004l, interfaceC0905c);
        c1299h.f13002j = obj;
        return c1299h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (A4.W.j(r12, r0, r11) == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0066, code lost:
    
        if (T.r.w(o()).a(r11, r5) == r3) goto L20;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, m4.t] */
    /* JADX WARN: Type inference failed for: r0v4, types: [d4.i, l4.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x006e -> B:6:0x003e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008b -> B:6:0x003e). Please report as a decompilation issue!!! */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.f13001i
            r1 = 1
            r2 = 2
            c4.a r3 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L2c
            if (r0 == r1) goto L20
            if (r0 != r2) goto L18
            m4.t r0 = r11.f13000h
            java.lang.Object r4 = r11.f13002j
            x4.y r4 = (x4.InterfaceC1942y) r4
            X3.a.e(r12)
            r8 = r0
            r9 = r4
            goto L3e
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            m4.t r0 = r11.f13000h
            java.lang.Object r4 = r11.f13002j
            x4.y r4 = (x4.InterfaceC1942y) r4
            X3.a.e(r12)
            r8 = r0
            r9 = r4
            goto L69
        L2c:
            X3.a.e(r12)
            java.lang.Object r12 = r11.f13002j
            x4.y r12 = (x4.InterfaceC1942y) r12
            m4.t r0 = new m4.t
            r0.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.f12970c = r4
            r9 = r12
            r8 = r0
        L3e:
            D.P r5 = new D.P
            r10 = 7
            T.X r6 = r11.f13003k
            n.I r7 = r11.f13004l
            r5.<init>(r6, r7, r8, r9, r10)
            r11.f13002j = r9
            r11.f13000h = r8
            r11.f13001i = r1
            b4.h r12 = r11.o()
            I0.C0 r0 = I0.C0.f2136c
            b4.f r12 = r12.r(r0)
            if (r12 != 0) goto L8e
            b4.h r12 = r11.o()
            I0.Z r12 = T.r.w(r12)
            java.lang.Object r12 = r12.a(r11, r5)
            if (r12 != r3) goto L69
            goto L8d
        L69:
            float r12 = r8.f12970c
            r0 = 0
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 != 0) goto L3e
            Y3.l r12 = new Y3.l
            r0 = 13
            r12.<init>(r9, r0)
            A4.k r12 = T.r.H(r12)
            n.G r0 = new n.G
            r4 = 0
            r0.<init>(r2, r4)
            r11.f13002j = r9
            r11.f13000h = r8
            r11.f13001i = r2
            java.lang.Object r12 = A4.W.j(r12, r0, r11)
            if (r12 != r3) goto L3e
        L8d:
            return r3
        L8e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: n.C1299H.r(java.lang.Object):java.lang.Object");
    }
}
