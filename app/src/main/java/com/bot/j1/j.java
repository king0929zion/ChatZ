package J1;

import b0.C0873f;

/* loaded from: classes.dex */
public final class j extends I1.w {

    /* renamed from: f, reason: collision with root package name */
    public final i f2834f;

    /* renamed from: g, reason: collision with root package name */
    public final C0873f f2835g;

    public j(i iVar, String str, C0873f c0873f) {
        super(iVar, str);
        this.f2834f = iVar;
        this.f2835g = c0873f;
    }

    @Override // I1.w
    public final I1.v a() {
        return (h) super.a();
    }

    @Override // I1.w
    public final I1.v b() {
        return new h(this.f2834f, this.f2835g);
    }
}
