package t1;

import android.view.WindowInsets;

/* renamed from: t1.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1695G extends C1694F {

    /* renamed from: n, reason: collision with root package name */
    public o1.c f14855n;

    public C1695G(P p5, WindowInsets windowInsets) {
        super(p5, windowInsets);
        this.f14855n = null;
    }

    @Override // t1.L
    public P b() {
        return P.c(null, this.f14849c.consumeStableInsets());
    }

    @Override // t1.L
    public P c() {
        return P.c(null, this.f14849c.consumeSystemWindowInsets());
    }

    @Override // t1.L
    public final o1.c j() {
        if (this.f14855n == null) {
            WindowInsets windowInsets = this.f14849c;
            this.f14855n = o1.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f14855n;
    }

    @Override // t1.L
    public boolean o() {
        return this.f14849c.isConsumed();
    }

    @Override // t1.L
    public void u(o1.c cVar) {
        this.f14855n = cVar;
    }

    public C1695G(P p5, C1695G c1695g) {
        super(p5, c1695g);
        this.f14855n = null;
        this.f14855n = c1695g.f14855n;
    }
}
