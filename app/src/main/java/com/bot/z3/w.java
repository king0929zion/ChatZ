package z3;

import b4.InterfaceC0905c;

/* loaded from: classes.dex */
public final class w extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16307h;

    /* renamed from: i, reason: collision with root package name */
    public int f16308i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Q3.f f16309j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f16310k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x f16311l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(x xVar, InterfaceC0905c interfaceC0905c, int i6) {
        super(3, interfaceC0905c);
        this.f16307h = i6;
        this.f16311l = xVar;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        Q3.f fVar = (Q3.f) obj;
        switch (this.f16307h) {
            case 0:
                w wVar = new w(this.f16311l, (InterfaceC0905c) obj3, 0);
                wVar.f16309j = fVar;
                wVar.f16310k = obj2;
                return wVar.r(X3.y.a);
            default:
                w wVar2 = new w(this.f16311l, (InterfaceC0905c) obj3, 1);
                wVar2.f16309j = fVar;
                wVar2.f16310k = (F3.d) obj2;
                return wVar2.r(X3.y.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    @Override // d4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.w.r(java.lang.Object):java.lang.Object");
    }
}
