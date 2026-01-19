package T1;

import N1.A;
import N1.B;
import N1.v;
import X3.y;
import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class d extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public A f8342h;

    /* renamed from: i, reason: collision with root package name */
    public int f8343i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8344j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f8345k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f8346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f8347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l4.c f8348n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v vVar, InterfaceC0905c interfaceC0905c, l4.c cVar, boolean z5, boolean z6) {
        super(2, interfaceC0905c);
        this.f8345k = z5;
        this.f8346l = z6;
        this.f8347m = vVar;
        this.f8348n = cVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((d) p((InterfaceC0905c) obj2, (B) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        d dVar = new d(this.f8347m, interfaceC0905c, this.f8348n, this.f8345k, this.f8346l);
        dVar.f8344j = obj;
        return dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c4, code lost:
    
        if (r1 == r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        if (r2 == r10) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a0, code lost:
    
        if (r15 == r10) goto L43;
     */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.d.r(java.lang.Object):java.lang.Object");
    }
}
