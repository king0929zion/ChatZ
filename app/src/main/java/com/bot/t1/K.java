package t1;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class K extends J {

    /* renamed from: s, reason: collision with root package name */
    public static final P f14860s;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f14860s = P.c(null, windowInsets);
    }

    public K(P p5, WindowInsets windowInsets) {
        super(p5, windowInsets);
    }

    @Override // t1.J, t1.C1694F, t1.L
    public o1.c g(int i6) {
        Insets insets;
        insets = this.f14849c.getInsets(O.a(i6));
        return o1.c.c(insets);
    }

    @Override // t1.J, t1.C1694F, t1.L
    public o1.c h(int i6) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f14849c.getInsetsIgnoringVisibility(O.a(i6));
        return o1.c.c(insetsIgnoringVisibility);
    }

    @Override // t1.J, t1.C1694F, t1.L
    public boolean q(int i6) {
        boolean isVisible;
        isVisible = this.f14849c.isVisible(O.a(i6));
        return isVisible;
    }

    public K(P p5, K k3) {
        super(p5, k3);
    }
}
