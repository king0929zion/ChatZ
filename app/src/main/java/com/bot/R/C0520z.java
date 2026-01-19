package R;

import Q.s3;
import b4.InterfaceC0905c;

/* renamed from: R.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520z extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ boolean f6848h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s3 f6849i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0520z(s3 s3Var, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f6849i = s3Var;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        C0520z c0520z = (C0520z) p((InterfaceC0905c) obj2, bool);
        X3.y yVar = X3.y.a;
        c0520z.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        C0520z c0520z = new C0520z(this.f6849i, interfaceC0905c);
        c0520z.f6848h = ((Boolean) obj).booleanValue();
        return c0520z;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        if (!this.f6848h) {
            this.f6849i.a();
        }
        return X3.y.a;
    }
}
