package O;

import b4.InterfaceC0905c;
import n.C1316c;

/* loaded from: classes.dex */
public final class F0 extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3944i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F0(Object obj, InterfaceC0905c interfaceC0905c, int i6) {
        super(1, interfaceC0905c);
        this.f3943h = i6;
        this.f3944i = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        InterfaceC0905c interfaceC0905c = (InterfaceC0905c) obj;
        switch (this.f3943h) {
            case 0:
                F0 f02 = new F0((N0) this.f3944i, interfaceC0905c, 0);
                X3.y yVar = X3.y.a;
                f02.r(yVar);
                return yVar;
            case 1:
                F0 f03 = new F0((N0) this.f3944i, interfaceC0905c, 1);
                X3.y yVar2 = X3.y.a;
                f03.r(yVar2);
                return yVar2;
            case 2:
                F0 f04 = new F0((N0) this.f3944i, interfaceC0905c, 2);
                X3.y yVar3 = X3.y.a;
                f04.r(yVar3);
                return yVar3;
            case 3:
                F0 f05 = new F0((N0) this.f3944i, interfaceC0905c, 3);
                X3.y yVar4 = X3.y.a;
                f05.r(yVar4);
                return yVar4;
            default:
                F0 f06 = new F0((C1316c) this.f3944i, interfaceC0905c, 4);
                X3.y yVar5 = X3.y.a;
                f06.r(yVar5);
                return yVar5;
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f3943h;
        X3.y yVar = X3.y.a;
        Object obj2 = this.f3944i;
        switch (i6) {
            case 0:
                X3.a.e(obj);
                ((N0) obj2).f3992A = false;
                return yVar;
            case 1:
                X3.a.e(obj);
                ((N0) obj2).f();
                return yVar;
            case 2:
                X3.a.e(obj);
                N0 n02 = (N0) obj2;
                n02.d(n02.f3992A);
                return yVar;
            case 3:
                X3.a.e(obj);
                ((N0) obj2).p();
                return yVar;
            default:
                X3.a.e(obj);
                C1316c.b((C1316c) obj2);
                return yVar;
        }
    }
}
