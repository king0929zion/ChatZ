package t1;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class J extends C1697I {

    /* renamed from: r, reason: collision with root package name */
    public static final P f14859r;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f14859r = P.c(null, windowInsets);
    }

    public J(P p5, WindowInsets windowInsets) {
        super(p5, windowInsets);
    }

    @Override // t1.C1694F, t1.L
    public final void d(View view) {
    }

    @Override // t1.C1694F, t1.L
    public o1.c g(int i6) {
        Insets insets;
        insets = this.f14849c.getInsets(N.a(i6));
        return o1.c.c(insets);
    }

    @Override // t1.C1694F, t1.L
    public o1.c h(int i6) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.f14849c.getInsetsIgnoringVisibility(N.a(i6));
        return o1.c.c(insetsIgnoringVisibility);
    }

    @Override // t1.C1694F, t1.L
    public boolean q(int i6) {
        boolean isVisible;
        isVisible = this.f14849c.isVisible(N.a(i6));
        return isVisible;
    }

    public J(P p5, J j3) {
        super(p5, j3);
    }
}
