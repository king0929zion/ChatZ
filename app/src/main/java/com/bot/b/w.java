package b;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class w extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0853B f10961f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(C0853B c0853b, int i6) {
        super(0);
        this.f10960e = i6;
        this.f10961f = c0853b;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f10960e) {
            case 0:
                this.f10961f.c();
                return X3.y.a;
            case 1:
                this.f10961f.b();
                return X3.y.a;
            default:
                this.f10961f.c();
                return X3.y.a;
        }
    }
}
