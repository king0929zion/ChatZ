package x;

import X3.y;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import e1.InterfaceC0961c;
import r.InterfaceC1563e1;
import y.h0;

/* loaded from: classes.dex */
public final class o extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f15532h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f15533i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s f15534j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f15535k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15534j = sVar;
        this.f15535k = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((o) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj)).r(y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        o oVar = new o(this.f15534j, this.f15535k, interfaceC0905c);
        oVar.f15533i = obj;
        return oVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f15532h;
        if (i6 == 0) {
            X3.a.e(obj);
            s sVar = this.f15534j;
            n nVar = new n((InterfaceC1563e1) this.f15533i, sVar, 0);
            InterfaceC0961c interfaceC0961c = ((l) sVar.f15549f.getValue()).f15499i;
            this.f15532h = 1;
            Object a = h0.a(nVar, this.f15535k, 100, interfaceC0961c, this);
            EnumC0927a enumC0927a = EnumC0927a.f11114c;
            if (a == enumC0927a) {
                return enumC0927a;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
        }
        return y.a;
    }
}
