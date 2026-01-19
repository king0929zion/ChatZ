package t1;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: t1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1696H extends C1695G {
    public C1696H(P p5, WindowInsets windowInsets) {
        super(p5, windowInsets);
    }

    @Override // t1.L
    public P a() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.f14849c.consumeDisplayCutout();
        return P.c(null, consumeDisplayCutout);
    }

    @Override // t1.C1694F, t1.L
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696H)) {
            return false;
        }
        C1696H c1696h = (C1696H) obj;
        return Objects.equals(this.f14849c, c1696h.f14849c) && Objects.equals(this.f14853g, c1696h.f14853g) && C1694F.C(this.f14854h, c1696h.f14854h);
    }

    @Override // t1.L
    public C1701d f() {
        DisplayCutout displayCutout;
        displayCutout = this.f14849c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C1701d(displayCutout);
    }

    @Override // t1.L
    public int hashCode() {
        return this.f14849c.hashCode();
    }

    public C1696H(P p5, C1696H c1696h) {
        super(p5, c1696h);
    }
}
