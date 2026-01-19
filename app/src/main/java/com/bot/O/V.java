package O;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class V extends d4.h implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public int f4042f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f4043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0316k f4044h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0326p f4045i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ D.H0 f4046j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C0316k c0316k, InterfaceC0326p interfaceC0326p, D.H0 h02, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f4044h = c0316k;
        this.f4045i = interfaceC0326p;
        this.f4046j = h02;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((V) p((InterfaceC0905c) obj2, (B0.V) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        V v5 = new V(this.f4044h, this.f4045i, this.f4046j, interfaceC0905c);
        v5.f4043g = obj;
        return v5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (O.AbstractC0336u0.x(r1, r17.f4045i, r8, r7, r17) != r6) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d5, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c8, code lost:
    
        if (O.AbstractC0336u0.z(r1, r8, r7, r17) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (O.AbstractC0336u0.j(r1, r8, r7, r4, r17) == r6) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003b, code lost:
    
        if (r7 == r6) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.V.r(java.lang.Object):java.lang.Object");
    }
}
