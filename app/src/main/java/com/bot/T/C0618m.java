package T;

import l4.InterfaceC1193a;

/* renamed from: T.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0618m implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8128c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0626q f8129e;

    public /* synthetic */ C0618m(int i6, C0626q c0626q) {
        this.f8128c = i6;
        this.f8129e = c0626q;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f8128c) {
            case 0:
                throw null;
            case 1:
                return this.f8129e.m();
            default:
                return this.f8129e.m();
        }
    }

    public /* synthetic */ C0618m(C0626q c0626q, W w5) {
        this.f8128c = 0;
        this.f8129e = c0626q;
    }
}
