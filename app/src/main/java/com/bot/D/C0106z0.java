package D;

import l4.InterfaceC1193a;

/* renamed from: D.z0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0106z0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1249c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ H0 f1250e;

    public /* synthetic */ C0106z0(H0 h02, int i6) {
        this.f1249c = i6;
        this.f1250e = h02;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f1249c) {
            case 0:
                this.f1250e.b();
                break;
            default:
                this.f1250e.onCancel();
                break;
        }
        return X3.y.a;
    }
}
