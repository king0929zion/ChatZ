package n;

import b4.InterfaceC0905c;

/* renamed from: n.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1314b extends d4.i implements l4.c {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1316c f13084h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13085i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1314b(C1316c c1316c, Object obj, InterfaceC0905c interfaceC0905c) {
        super(1, interfaceC0905c);
        this.f13084h = c1316c;
        this.f13085i = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1314b c1314b = new C1314b(this.f13084h, this.f13085i, (InterfaceC0905c) obj);
        X3.y yVar = X3.y.a;
        c1314b.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        C1316c c1316c = this.f13084h;
        C1316c.b(c1316c);
        Object a = C1316c.a(c1316c, this.f13085i);
        c1316c.f13093c.f13186e.setValue(a);
        c1316c.f13095e.setValue(a);
        return X3.y.a;
    }
}
