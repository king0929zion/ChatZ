package p;

import b4.InterfaceC0905c;
import r.C1551a1;
import t.C1682j;
import x4.InterfaceC1942y;

/* renamed from: p.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1431f extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public boolean f13700h;

    /* renamed from: i, reason: collision with root package name */
    public int f13701i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f13702j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1551a1 f13703k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f13704l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1682j f13705m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r f13706n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431f(C1551a1 c1551a1, long j3, C1682j c1682j, r rVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f13703k = c1551a1;
        this.f13704l = j3;
        this.f13705m = c1682j;
        this.f13706n = rVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C1431f) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C1431f c1431f = new C1431f(this.f13703k, this.f13704l, this.f13705m, this.f13706n, interfaceC0905c);
        c1431f.f13702j = obj;
        return c1431f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b2, code lost:
    
        if (r14.a(r1, r17) != r9) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r14.a(r3, r17) == r9) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006c, code lost:
    
        if (r3 == r9) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p.C1431f.r(java.lang.Object):java.lang.Object");
    }
}
