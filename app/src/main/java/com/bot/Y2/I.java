package Y2;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class I extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f9625h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9626i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ L f9627j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9627j = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((I) p((InterfaceC0905c) obj2, (X3.i) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        I i6 = new I(this.f9627j, interfaceC0905c);
        i6.f9626i = obj;
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x013f, code lost:
    
        if (r13 == r6) goto L58;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y2.I.r(java.lang.Object):java.lang.Object");
    }
}
