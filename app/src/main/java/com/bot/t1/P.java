package t1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: b, reason: collision with root package name */
    public static final P f14862b;
    public final L a;

    static {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            f14862b = K.f14860s;
        } else if (i6 >= 30) {
            f14862b = J.f14859r;
        } else {
            f14862b = L.f14861b;
        }
    }

    public P(WindowInsets windowInsets) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            this.a = new K(this, windowInsets);
            return;
        }
        if (i6 >= 30) {
            this.a = new J(this, windowInsets);
            return;
        }
        if (i6 >= 29) {
            this.a = new C1697I(this, windowInsets);
        } else if (i6 >= 28) {
            this.a = new C1696H(this, windowInsets);
        } else {
            this.a = new C1695G(this, windowInsets);
        }
    }

    public static o1.c a(o1.c cVar, int i6, int i7, int i8, int i9) {
        int max = Math.max(0, cVar.a - i6);
        int max2 = Math.max(0, cVar.f13501b - i7);
        int max3 = Math.max(0, cVar.f13502c - i8);
        int max4 = Math.max(0, cVar.f13503d - i9);
        return (max == i6 && max2 == i7 && max3 == i8 && max4 == i9) ? cVar : o1.c.b(max, max2, max3, max4);
    }

    public static P c(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        P p5 = new P(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            int i6 = AbstractC1713p.a;
            P a = AbstractC1709l.a(view);
            L l3 = p5.a;
            l3.t(a);
            l3.d(view.getRootView());
            l3.v(view.getWindowSystemUiVisibility());
        }
        return p5;
    }

    public final WindowInsets b() {
        L l3 = this.a;
        if (l3 instanceof C1694F) {
            return ((C1694F) l3).f14849c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof P) {
            return Objects.equals(this.a, ((P) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        L l3 = this.a;
        if (l3 == null) {
            return 0;
        }
        return l3.hashCode();
    }

    public P(P p5) {
        if (p5 != null) {
            L l3 = p5.a;
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 34 && (l3 instanceof K)) {
                this.a = new K(this, (K) l3);
            } else if (i6 >= 30 && (l3 instanceof J)) {
                this.a = new J(this, (J) l3);
            } else if (i6 >= 29 && (l3 instanceof C1697I)) {
                this.a = new C1697I(this, (C1697I) l3);
            } else if (i6 >= 28 && (l3 instanceof C1696H)) {
                this.a = new C1696H(this, (C1696H) l3);
            } else if (l3 instanceof C1695G) {
                this.a = new C1695G(this, (C1695G) l3);
            } else if (l3 instanceof C1694F) {
                this.a = new C1694F(this, (C1694F) l3);
            } else {
                this.a = new L(this);
            }
            l3.e(this);
            return;
        }
        this.a = new L(this);
    }
}
