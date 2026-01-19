package Q;

import b4.InterfaceC0905c;
import m4.C1283r;

/* renamed from: Q.w2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0480w2 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6203i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0480w2(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(3, interfaceC0905c);
        this.f6202h = i6;
        this.f6203i = obj;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f6202h) {
            case 0:
                ((Number) obj2).floatValue();
                C0480w2 c0480w2 = new C0480w2((C2) this.f6203i, (InterfaceC0905c) obj3, 0);
                X3.y yVar = X3.y.a;
                c0480w2.r(yVar);
                return yVar;
            default:
                C0480w2 c0480w22 = new C0480w2((C1283r) this.f6203i, (InterfaceC0905c) obj3, 1);
                X3.y yVar2 = X3.y.a;
                c0480w22.r(yVar2);
                return yVar2;
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f6202h;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f6203i;
        switch (i6) {
            case 0:
                X3.a.e(obj);
                ((C2) obj2).f5193r.b();
                return yVar;
            default:
                X3.a.e(obj);
                ((C1283r) obj2).f12968c = true;
                return yVar;
        }
    }
}
