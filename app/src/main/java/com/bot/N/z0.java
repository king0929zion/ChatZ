package n;

/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13289c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y0 f13290e;

    public /* synthetic */ z0(y0 y0Var, int i6) {
        this.f13289c = i6;
        this.f13290e = y0Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f13289c) {
            case 0:
                return new B0(this.f13290e, 0);
            default:
                return new B0(this.f13290e, 1);
        }
    }
}
