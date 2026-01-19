package x;

import X3.y;
import b4.InterfaceC0905c;
import r.InterfaceC1563e1;

/* loaded from: classes.dex */
public final class r extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s f15542h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15543i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, int i6, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f15542h = sVar;
        this.f15543i = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        r rVar = (r) p((InterfaceC0905c) obj2, (InterfaceC1563e1) obj);
        y yVar = y.a;
        rVar.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new r(this.f15542h, this.f15543i, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f15542h.j(this.f15543i);
        return y.a;
    }
}
