package P2;

import T.C0601d0;
import b4.InterfaceC0905c;
import java.util.List;
import x4.InterfaceC1942y;

/* renamed from: P2.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371o0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5001h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5002i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f5003j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5004k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A4.N f5005l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0601d0 f5006m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0371o0(int i6, List list, int i7, A4.N n3, C0601d0 c0601d0, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5002i = i6;
        this.f5003j = list;
        this.f5004k = i7;
        this.f5005l = n3;
        this.f5006m = c0601d0;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0371o0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0371o0(this.f5002i, this.f5003j, this.f5004k, this.f5005l, this.f5006m, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (A4.W.i(r0, r7) == r4) goto L21;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.f5001h
            X3.y r1 = X3.y.a
            r2 = 2
            r3 = 1
            c4.a r4 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L1a
            if (r0 != r2) goto L12
            X3.a.e(r8)
            return r1
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            X3.a.e(r8)
            goto L52
        L1e:
            X3.a.e(r8)
            T.d0 r8 = r7.f5006m
            int r0 = r8.g()
            int r5 = r7.f5002i
            if (r5 > r0) goto L2c
            goto L5f
        L2c:
            r8.h(r5)
            java.util.List r8 = r7.f5003j
            int r0 = r8.size()
            int r5 = r7.f5004k
            if (r0 > r5) goto L52
            I4.f r0 = new I4.f
            r6 = 2
            r0.<init>(r8, r6)
            A4.k r8 = T.r.H(r0)
            P2.n0 r0 = new P2.n0
            r6 = 0
            r0.<init>(r8, r5, r6)
            r7.f5001h = r3
            java.lang.Object r8 = A4.W.i(r0, r7)
            if (r8 != r4) goto L52
            goto L5e
        L52:
            P2.f r8 = P2.C0352f.f4926c
            r7.f5001h = r2
            A4.N r0 = r7.f5005l
            java.lang.Object r8 = r0.a(r8, r7)
            if (r8 != r4) goto L5f
        L5e:
            return r4
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.C0371o0.r(java.lang.Object):java.lang.Object");
    }
}
