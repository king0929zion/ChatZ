package B4;

import A4.InterfaceC0008i;
import A4.W;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import x4.InterfaceC1942y;

/* renamed from: B4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0052e extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public int f582h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f583i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0008i f584j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AbstractC0054g f585k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0052e(InterfaceC0008i interfaceC0008i, AbstractC0054g abstractC0054g, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f584j = interfaceC0008i;
        this.f585k = abstractC0054g;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((C0052e) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0052e c0052e = new C0052e(this.f584j, this.f585k, interfaceC0905c);
        c0052e.f583i = obj;
        return c0052e;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        int i6 = this.f582h;
        X3.y yVar = X3.y.a;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            X3.a.e(obj);
            return yVar;
        }
        X3.a.e(obj);
        z4.w i7 = this.f585k.i((InterfaceC1942y) this.f583i);
        this.f582h = 1;
        Object h3 = W.h(this.f584j, i7, true, this);
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (h3 != enumC0927a) {
            h3 = yVar;
        }
        return h3 == enumC0927a ? enumC0927a : yVar;
    }
}
