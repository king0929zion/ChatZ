package I1;

import i1.C1081a;

/* loaded from: classes.dex */
public final class n extends b.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2560d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2561e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(B b5) {
        super(false);
        this.f2561e = b5;
    }

    @Override // b.u
    public final void b() {
        switch (this.f2560d) {
            case 0:
                ((B) this.f2561e).c();
                return;
            default:
                ((C1081a) this.f2561e).f(this);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(C1081a c1081a) {
        super(true);
        this.f2561e = c1081a;
    }
}
