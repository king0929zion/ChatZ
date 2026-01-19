package N1;

import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;

/* loaded from: classes.dex */
public final class G extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f3654h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f3655i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Q f3656j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f3657k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String[] f3658l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q3, int[] iArr, String[] strArr, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3656j = q3;
        this.f3657k = iArr;
        this.f3658l = strArr;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((G) p((InterfaceC0905c) obj2, (InterfaceC0008i) obj)).r(X3.y.a);
        return EnumC0927a.f11114c;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        G g3 = new G(this.f3656j, this.f3657k, this.f3658l, interfaceC0905c);
        g3.f3655i = obj;
        return g3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        if (x4.AbstractC1888A.H((b4.InterfaceC0910h) r6, r9, r20) == r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r6 == r8) goto L32;
     */
    /* JADX WARN: Type inference failed for: r5v3, types: [m4.w, java.lang.Object] */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.G.r(java.lang.Object):java.lang.Object");
    }
}
