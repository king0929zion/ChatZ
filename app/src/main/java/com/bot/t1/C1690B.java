package t1;

import android.view.WindowInsets;

/* renamed from: t1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1690B extends AbstractC1693E {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f14842c;

    public C1690B() {
        this.f14842c = r0.f.b();
    }

    @Override // t1.AbstractC1693E
    public P b() {
        WindowInsets build;
        a();
        build = this.f14842c.build();
        P c6 = P.c(null, build);
        c6.a.r(this.f14843b);
        return c6;
    }

    @Override // t1.AbstractC1693E
    public void d(o1.c cVar) {
        this.f14842c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // t1.AbstractC1693E
    public void e(o1.c cVar) {
        this.f14842c.setStableInsets(cVar.d());
    }

    @Override // t1.AbstractC1693E
    public void f(o1.c cVar) {
        this.f14842c.setSystemGestureInsets(cVar.d());
    }

    @Override // t1.AbstractC1693E
    public void g(o1.c cVar) {
        this.f14842c.setSystemWindowInsets(cVar.d());
    }

    @Override // t1.AbstractC1693E
    public void h(o1.c cVar) {
        this.f14842c.setTappableElementInsets(cVar.d());
    }

    public C1690B(P p5) {
        super(p5);
        WindowInsets.Builder b5;
        WindowInsets b6 = p5.b();
        if (b6 != null) {
            b5 = r0.f.c(b6);
        } else {
            b5 = r0.f.b();
        }
        this.f14842c = b5;
    }
}
