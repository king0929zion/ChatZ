package Q;

import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: Q.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0416g1 extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f5816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5817i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f5818j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0416g1(C0405d2 c0405d2, float f6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f5817i = c0405d2;
        this.f5818j = f6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0416g1) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0416g1(this.f5817i, this.f5818j, interfaceC0905c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r9 == r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r9 != r7) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r9 != r7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
    
        if (r9 == r7) goto L23;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f5816h
            X3.y r1 = X3.y.a
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Ld
            X3.a.e(r9)
            return r1
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            X3.a.e(r9)
            r8.f5816h = r2
            Q.d2 r9 = r8.f5817i
            R.s r9 = r9.f5767d
            T.g0 r0 = r9.f6830g
            java.lang.Object r0 = r0.getValue()
            float r2 = r9.f()
            float r3 = r8.f5818j
            java.lang.Object r2 = r9.c(r2, r3, r0)
            l4.c r4 = r9.f6827d
            java.lang.Object r4 = r4.f(r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            p.x0 r5 = p.x0.f13823c
            r6 = 0
            c4.a r7 = c4.EnumC0927a.f11114c
            if (r4 == 0) goto L53
            R.f r0 = new R.f
            r0.<init>(r9, r3, r6)
            java.lang.Object r9 = r9.a(r2, r5, r0, r8)
            if (r9 != r7) goto L4d
            goto L4e
        L4d:
            r9 = r1
        L4e:
            if (r9 != r7) goto L51
            goto L62
        L51:
            r9 = r1
            goto L62
        L53:
            R.f r2 = new R.f
            r2.<init>(r9, r3, r6)
            java.lang.Object r9 = r9.a(r0, r5, r2, r8)
            if (r9 != r7) goto L5f
            goto L60
        L5f:
            r9 = r1
        L60:
            if (r9 != r7) goto L51
        L62:
            if (r9 != r7) goto L65
            goto L66
        L65:
            r9 = r1
        L66:
            if (r9 != r7) goto L69
            return r7
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.C0416g1.r(java.lang.Object):java.lang.Object");
    }
}
