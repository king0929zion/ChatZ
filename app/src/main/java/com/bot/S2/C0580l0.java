package S2;

import l4.InterfaceC1193a;
import p.P0;

/* renamed from: S2.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0580l0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7821c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P0 f7822e;

    public /* synthetic */ C0580l0(P0 p02, int i6) {
        this.f7821c = i6;
        this.f7822e = p02;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f7821c) {
            case 0:
                return Boolean.valueOf(this.f7822e.a.g() > 0);
            case 1:
                P0 p02 = this.f7822e;
                return Boolean.valueOf(p02.a.g() < p02.f13618e.g() && p02.f13618e.g() > 0);
            case 2:
                P0 p03 = this.f7822e;
                return Boolean.valueOf(p03.a.g() < p03.f13618e.g());
            default:
                return Boolean.valueOf(this.f7822e.a.g() > 0);
        }
    }
}
