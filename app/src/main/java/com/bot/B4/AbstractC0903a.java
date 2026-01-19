package b4;

/* renamed from: b4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0903a implements InterfaceC0908f {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0909g f11053c;

    public AbstractC0903a(InterfaceC0909g interfaceC0909g) {
        this.f11053c = interfaceC0909g;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return this.f11053c;
    }

    @Override // b4.InterfaceC0910h
    public InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return Y4.d.L(this, interfaceC0909g);
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return Y4.d.F(this, interfaceC0909g);
    }
}
