package t1;

import I0.AbstractC0221z0;
import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class z {
    public y a;

    public z(int i6, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new x(AbstractC0221z0.i(i6, interpolator, j3));
        } else {
            this.a = new y(i6, interpolator, j3);
        }
    }
}
