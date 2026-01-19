package P2;

import l4.InterfaceC1193a;

/* renamed from: P2.h0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0357h0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4937c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f4938e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f4939f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f4940g;

    public /* synthetic */ C0357h0(T.X x5, T.X x6, InterfaceC1193a interfaceC1193a) {
        this.f4938e = x5;
        this.f4939f = x6;
        this.f4940g = interfaceC1193a;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f4937c) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.f4938e.setValue(bool);
                this.f4939f.setValue(bool);
                this.f4940g.b();
                return X3.y.a;
            default:
                return new z.q((l4.g) this.f4938e.getValue(), (l4.c) this.f4939f.getValue(), ((Number) this.f4940g.b()).intValue());
        }
    }

    public /* synthetic */ C0357h0(InterfaceC1193a interfaceC1193a, T.X x5, T.X x6) {
        this.f4940g = interfaceC1193a;
        this.f4938e = x5;
        this.f4939f = x6;
    }
}
