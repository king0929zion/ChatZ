package I0;

import android.os.Build;
import android.view.ViewConfiguration;

/* renamed from: I0.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0174b0 implements X0 {
    public final ViewConfiguration a;

    public C0174b0(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // I0.X0
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // I0.X0
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // I0.X0
    public final float c() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.a.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // I0.X0
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // I0.X0
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // I0.X0
    public final float g() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.a.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }
}
