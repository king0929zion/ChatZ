package r;

import b4.InterfaceC0905c;
import n0.C1353b;

/* renamed from: r.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1598q0 extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f14446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1598q0(int i6, int i7, InterfaceC0905c interfaceC0905c) {
        super(i6, interfaceC0905c);
        this.f14446h = i7;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f14446h) {
            case 0:
                long j3 = ((C1353b) obj2).a;
                C1598q0 c1598q0 = new C1598q0(3, 0, (InterfaceC0905c) obj3);
                X3.y yVar = X3.y.a;
                c1598q0.r(yVar);
                return yVar;
            case 1:
                ((Number) obj2).floatValue();
                C1598q0 c1598q02 = new C1598q0(3, 1, (InterfaceC0905c) obj3);
                X3.y yVar2 = X3.y.a;
                c1598q02.r(yVar2);
                return yVar2;
            default:
                long j4 = ((C1353b) obj2).a;
                C1598q0 c1598q03 = new C1598q0(3, 2, (InterfaceC0905c) obj3);
                X3.y yVar3 = X3.y.a;
                c1598q03.r(yVar3);
                return yVar3;
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f14446h;
        X3.y yVar = X3.y.a;
        switch (i6) {
            case 0:
                X3.a.e(obj);
                return yVar;
            case 1:
                X3.a.e(obj);
                return yVar;
            default:
                X3.a.e(obj);
                return yVar;
        }
    }
}
