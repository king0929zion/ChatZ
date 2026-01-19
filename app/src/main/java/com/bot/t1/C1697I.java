package t1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* renamed from: t1.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1697I extends C1696H {

    /* renamed from: o, reason: collision with root package name */
    public o1.c f14856o;

    /* renamed from: p, reason: collision with root package name */
    public o1.c f14857p;

    /* renamed from: q, reason: collision with root package name */
    public o1.c f14858q;

    public C1697I(P p5, WindowInsets windowInsets) {
        super(p5, windowInsets);
        this.f14856o = null;
        this.f14857p = null;
        this.f14858q = null;
    }

    @Override // t1.L
    public o1.c i() {
        Insets mandatorySystemGestureInsets;
        if (this.f14857p == null) {
            mandatorySystemGestureInsets = this.f14849c.getMandatorySystemGestureInsets();
            this.f14857p = o1.c.c(mandatorySystemGestureInsets);
        }
        return this.f14857p;
    }

    @Override // t1.L
    public o1.c k() {
        Insets systemGestureInsets;
        if (this.f14856o == null) {
            systemGestureInsets = this.f14849c.getSystemGestureInsets();
            this.f14856o = o1.c.c(systemGestureInsets);
        }
        return this.f14856o;
    }

    @Override // t1.L
    public o1.c m() {
        Insets tappableElementInsets;
        if (this.f14858q == null) {
            tappableElementInsets = this.f14849c.getTappableElementInsets();
            this.f14858q = o1.c.c(tappableElementInsets);
        }
        return this.f14858q;
    }

    @Override // t1.C1694F, t1.L
    public P n(int i6, int i7, int i8, int i9) {
        WindowInsets inset;
        inset = this.f14849c.inset(i6, i7, i8, i9);
        return P.c(null, inset);
    }

    @Override // t1.C1695G, t1.L
    public void u(o1.c cVar) {
    }

    public C1697I(P p5, C1697I c1697i) {
        super(p5, c1697i);
        this.f14856o = null;
        this.f14857p = null;
        this.f14858q = null;
    }
}
