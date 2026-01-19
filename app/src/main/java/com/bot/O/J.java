package O;

import l4.InterfaceC1193a;
import z.C2004b;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3959c = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3961f;

    public /* synthetic */ J(int i6, InterfaceC1193a interfaceC1193a) {
        this.f3960e = i6;
        this.f3961f = interfaceC1193a;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f3959c) {
            case 0:
                return Integer.valueOf(((D) this.f3961f).f3927f.f7599b.d(this.f3960e));
            default:
                return new C2004b(this.f3960e, S.l.f7374V, (InterfaceC1193a) this.f3961f);
        }
    }

    public /* synthetic */ J(D d6, int i6) {
        this.f3961f = d6;
        this.f3960e = i6;
    }
}
