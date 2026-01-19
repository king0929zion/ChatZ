package Q;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class Z0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5635c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0405d2 f5636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f5637f;

    public /* synthetic */ Z0(C0405d2 c0405d2, InterfaceC1193a interfaceC1193a, int i6) {
        this.f5635c = i6;
        this.f5636e = c0405d2;
        this.f5637f = interfaceC1193a;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f5635c) {
            case 0:
                if (!this.f5636e.d()) {
                    this.f5637f.b();
                }
                return X3.y.a;
            default:
                if (!this.f5636e.d()) {
                    this.f5637f.b();
                }
                return X3.y.a;
        }
    }
}
