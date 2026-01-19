package P2;

import l4.InterfaceC1193a;

/* renamed from: P2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0355g0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4930c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T.X f4931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ T.X f4932f;

    public /* synthetic */ C0355g0(T.X x5, T.X x6, int i6) {
        this.f4930c = i6;
        this.f4931e = x5;
        this.f4932f = x6;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f4930c) {
            case 0:
                Boolean bool = Boolean.FALSE;
                this.f4931e.setValue(bool);
                this.f4932f.setValue(bool);
                break;
            case 1:
                Boolean bool2 = Boolean.FALSE;
                this.f4931e.setValue(bool2);
                this.f4932f.setValue(bool2);
                break;
            case 2:
                this.f4931e.setValue(Boolean.FALSE);
                this.f4932f.setValue(Boolean.TRUE);
                break;
            case 3:
                this.f4931e.setValue(Boolean.FALSE);
                this.f4932f.setValue(Boolean.TRUE);
                break;
            case 4:
                if (!((Boolean) this.f4931e.getValue()).booleanValue()) {
                    this.f4932f.setValue(null);
                }
                return X3.y.a;
            default:
                if (!((Boolean) this.f4931e.getValue()).booleanValue()) {
                    this.f4932f.setValue(null);
                }
                return X3.y.a;
        }
        return X3.y.a;
    }
}
