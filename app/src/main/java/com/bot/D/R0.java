package D;

import b4.InterfaceC0905c;
import t.C1682j;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class R0 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public Object f873h;

    /* renamed from: i, reason: collision with root package name */
    public int f874i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ T.X f875j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f876k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1682j f877l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(T.X x5, long j3, C1682j c1682j, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f875j = x5;
        this.f876k = j3;
        this.f877l = c1682j;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((R0) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new R0(this.f875j, this.f876k, this.f877l, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
    
        if (r1.a(r0, r8) == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if (r1.a(r0, r8) == r5) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f874i
            t.j r1 = r8.f877l
            r2 = 2
            r3 = 1
            T.X r4 = r8.f875j
            c4.a r5 = c4.EnumC0927a.f11114c
            if (r0 == 0) goto L28
            if (r0 == r3) goto L20
            if (r0 != r2) goto L18
            java.lang.Object r0 = r8.f873h
            t.l r0 = (t.C1684l) r0
            X3.a.e(r9)
            goto L5e
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            java.lang.Object r0 = r8.f873h
            T.X r0 = (T.X) r0
            X3.a.e(r9)
            goto L46
        L28:
            X3.a.e(r9)
            java.lang.Object r9 = r4.getValue()
            t.l r9 = (t.C1684l) r9
            if (r9 == 0) goto L4a
            t.k r0 = new t.k
            r0.<init>(r9)
            if (r1 == 0) goto L45
            r8.f873h = r4
            r8.f874i = r3
            java.lang.Object r9 = r1.a(r0, r8)
            if (r9 != r5) goto L45
            goto L5d
        L45:
            r0 = r4
        L46:
            r9 = 0
            r0.setValue(r9)
        L4a:
            t.l r0 = new t.l
            long r6 = r8.f876k
            r0.<init>(r6)
            if (r1 == 0) goto L5e
            r8.f873h = r0
            r8.f874i = r2
            java.lang.Object r9 = r1.a(r0, r8)
            if (r9 != r5) goto L5e
        L5d:
            return r5
        L5e:
            r4.setValue(r0)
            X3.y r9 = X3.y.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: D.R0.r(java.lang.Object):java.lang.Object");
    }
}
