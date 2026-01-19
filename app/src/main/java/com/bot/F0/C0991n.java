package f0;

/* renamed from: f0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0991n implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11703c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f11704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f11705f;

    public /* synthetic */ C0991n(l4.c cVar, l4.c cVar2, int i6) {
        this.f11703c = i6;
        this.f11704e = cVar;
        this.f11705f = cVar2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11703c) {
            case 0:
                this.f11704e.f(obj);
                this.f11705f.f(obj);
                break;
            default:
                this.f11704e.f(obj);
                this.f11705f.f(obj);
                break;
        }
        return X3.y.a;
    }
}
