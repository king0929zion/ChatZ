package t1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* loaded from: classes.dex */
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ z a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f14879b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P f14880c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f14881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f14882e;

    public r(z zVar, P p5, P p6, int i6, View view) {
        this.a = zVar;
        this.f14879b = p5;
        this.f14880c = p6;
        this.f14881d = i6;
        this.f14882e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        z zVar = this.a;
        zVar.a.e(animatedFraction);
        P p5 = this.f14879b;
        L l3 = p5.a;
        float c6 = zVar.a.c();
        PathInterpolator pathInterpolator = v.f14889e;
        int i6 = Build.VERSION.SDK_INT;
        AbstractC1693E c1692d = i6 >= 34 ? new C1692D(p5) : i6 >= 30 ? new C1691C(p5) : i6 >= 29 ? new C1690B(p5) : new C1689A(p5);
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((this.f14881d & i7) == 0) {
                c1692d.c(i7, l3.g(i7));
            } else {
                o1.c g3 = l3.g(i7);
                o1.c g6 = this.f14880c.a.g(i7);
                float f6 = 1.0f - c6;
                c1692d.c(i7, P.a(g3, (int) (((g3.a - g6.a) * f6) + 0.5d), (int) (((g3.f13501b - g6.f13501b) * f6) + 0.5d), (int) (((g3.f13502c - g6.f13502c) * f6) + 0.5d), (int) (((g3.f13503d - g6.f13503d) * f6) + 0.5d)));
            }
        }
        v.h(this.f14882e, c1692d.b(), Collections.singletonList(zVar));
    }
}
