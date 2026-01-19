package y;

import n.C1316c;

/* renamed from: y.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1982w implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15941c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0.b f15942e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1948E f15943f;

    public /* synthetic */ C1982w(r0.b bVar, C1948E c1948e, int i6) {
        this.f15941c = i6;
        this.f15942e = bVar;
        this.f15943f = c1948e;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        C1316c c1316c = (C1316c) obj;
        switch (this.f15941c) {
            case 0:
                this.f15942e.f(((Number) c1316c.d()).floatValue());
                this.f15943f.f15758c.b();
                break;
            default:
                this.f15942e.f(((Number) c1316c.d()).floatValue());
                this.f15943f.f15758c.b();
                break;
        }
        return X3.y.a;
    }
}
