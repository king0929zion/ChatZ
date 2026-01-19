package t1;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class u implements View.OnApplyWindowInsetsListener {
    public final O4.d a;

    /* renamed from: b, reason: collision with root package name */
    public P f14888b;

    public u(View view, O4.d dVar) {
        P p5;
        this.a = dVar;
        int i6 = AbstractC1713p.a;
        P a = AbstractC1709l.a(view);
        if (a != null) {
            int i7 = Build.VERSION.SDK_INT;
            p5 = (i7 >= 34 ? new C1692D(a) : i7 >= 30 ? new C1691C(a) : i7 >= 29 ? new C1690B(a) : new C1689A(a)).b();
        } else {
            p5 = null;
        }
        this.f14888b = p5;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z5;
        if (!view.isLaidOut()) {
            this.f14888b = P.c(view, windowInsets);
            return v.j(view, windowInsets);
        }
        P c6 = P.c(view, windowInsets);
        L l3 = c6.a;
        if (this.f14888b == null) {
            int i6 = AbstractC1713p.a;
            this.f14888b = AbstractC1709l.a(view);
        }
        if (this.f14888b == null) {
            this.f14888b = c6;
            return v.j(view, windowInsets);
        }
        O4.d k3 = v.k(view);
        if (k3 != null && Objects.equals((P) k3.f4333e, c6)) {
            return v.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        P p5 = this.f14888b;
        int i7 = 1;
        while (i7 <= 512) {
            o1.c g3 = l3.g(i7);
            o1.c g6 = p5.a.g(i7);
            int i8 = g3.a;
            int i9 = g3.f13503d;
            int i10 = g3.f13502c;
            int i11 = g3.f13501b;
            int i12 = g6.a;
            int i13 = g6.f13503d;
            int i14 = g6.f13502c;
            int i15 = g6.f13501b;
            if (i8 > i12 || i11 > i15 || i10 > i14 || i9 > i13) {
                iArr = iArr2;
                z5 = true;
            } else {
                iArr = iArr2;
                z5 = false;
            }
            if (z5 != (i8 < i12 || i11 < i15 || i10 < i14 || i9 < i13)) {
                if (z5) {
                    iArr[0] = iArr[0] | i7;
                } else {
                    iArr3[0] = iArr3[0] | i7;
                }
            }
            i7 <<= 1;
            iArr2 = iArr;
        }
        int i16 = iArr2[0];
        int i17 = iArr3[0];
        int i18 = i16 | i17;
        if (i18 == 0) {
            this.f14888b = c6;
            return v.j(view, windowInsets);
        }
        P p6 = this.f14888b;
        z zVar = new z(i18, (i16 & 8) != 0 ? v.f14889e : (i17 & 8) != 0 ? v.f14890f : (i16 & 519) != 0 ? v.f14891g : (i17 & 519) != 0 ? v.f14892h : null, (i18 & 8) != 0 ? 160L : 250L);
        zVar.a.e(S.l.f7374V);
        ValueAnimator duration = ValueAnimator.ofFloat(S.l.f7374V, 1.0f).setDuration(zVar.a.b());
        o1.c g7 = l3.g(i18);
        o1.c g8 = p6.a.g(i18);
        int min = Math.min(g7.a, g8.a);
        int i19 = g7.f13501b;
        int i20 = g8.f13501b;
        int min2 = Math.min(i19, i20);
        int i21 = g7.f13502c;
        int i22 = g8.f13502c;
        int min3 = Math.min(i21, i22);
        int i23 = g7.f13503d;
        int i24 = g8.f13503d;
        e0.k kVar = new e0.k(8, o1.c.b(min, min2, min3, Math.min(i23, i24)), o1.c.b(Math.max(g7.a, g8.a), Math.max(i19, i20), Math.max(i21, i22), Math.max(i23, i24)));
        v.g(view, zVar, c6, false);
        duration.addUpdateListener(new r(zVar, c6, p6, i18, view));
        duration.addListener(new C1715s(view, zVar));
        ViewTreeObserverOnPreDrawListenerC1703f viewTreeObserverOnPreDrawListenerC1703f = new ViewTreeObserverOnPreDrawListenerC1703f(view, new RunnableC1716t(view, zVar, kVar, duration));
        view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1703f);
        view.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC1703f);
        this.f14888b = c6;
        return v.j(view, windowInsets);
    }
}
