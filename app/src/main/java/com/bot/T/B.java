package T;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class B extends AbstractC0623o0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7933b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(InterfaceC1193a interfaceC1193a) {
        super(interfaceC1193a);
        C0602e c0602e = C0602e.f8083j;
        this.f7934c = c0602e;
    }

    @Override // T.AbstractC0623o0
    public final C0625p0 a(Object obj) {
        switch (this.f7933b) {
            case 0:
                return new C0625p0(this, obj, obj == null, null, true);
            default:
                return new C0625p0(this, obj, obj == null, (R0) this.f7934c, true);
        }
    }

    @Override // T.AbstractC0623o0
    public g1 b() {
        switch (this.f7933b) {
            case 0:
                return (C) this.f7934c;
            default:
                return super.b();
        }
    }

    public B(l4.c cVar) {
        super(new O.A(20));
        this.f7934c = new C(cVar);
    }
}
