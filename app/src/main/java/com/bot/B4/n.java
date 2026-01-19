package B4;

import A4.InterfaceC0007h;
import A4.InterfaceC0008i;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class n extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f610h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f611i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f612j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f613k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, InterfaceC0008i interfaceC0008i, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f612j = oVar;
        this.f613k = interfaceC0008i;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((n) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        n nVar = new n(this.f612j, this.f613k, interfaceC0905c);
        nVar.f611i = obj;
        return nVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f610h;
        if (i6 == 0) {
            X3.a.e(obj);
            InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f611i;
            Object obj2 = new Object();
            o oVar = this.f612j;
            InterfaceC0007h interfaceC0007h = oVar.f595g;
            m mVar = new m(obj2, interfaceC1942y, oVar, this.f613k, 0);
            this.f610h = 1;
            Object b5 = interfaceC0007h.b(mVar, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (b5 == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return X3.y.a;
    }
}
