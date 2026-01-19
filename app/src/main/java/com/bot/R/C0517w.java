package R;

import Q.s3;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* renamed from: R.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517w extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s3 f6842h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0517w(s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6842h = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0517w c0517w = (C0517w) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        c0517w.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new C0517w(this.f6842h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        this.f6842h.a();
        return X3.y.a;
    }
}
