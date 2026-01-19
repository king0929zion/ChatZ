package N;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3565c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f3566e;

    public /* synthetic */ h(i iVar, int i6) {
        this.f3565c = i6;
        this.f3566e = iVar;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f3565c) {
            case 0:
                return this.f3566e.f3570g.a;
            case 1:
                return this.f3566e.f3570g.f3584b;
            default:
                return this.f3566e.f3570g.a;
        }
    }
}
