package t1;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class x extends y {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f14896e;

    public x(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f14896e = windowInsetsAnimation;
    }

    @Override // t1.y
    public final float a() {
        float alpha;
        alpha = this.f14896e.getAlpha();
        return alpha;
    }

    @Override // t1.y
    public final long b() {
        long durationMillis;
        durationMillis = this.f14896e.getDurationMillis();
        return durationMillis;
    }

    @Override // t1.y
    public final float c() {
        float interpolatedFraction;
        interpolatedFraction = this.f14896e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // t1.y
    public final int d() {
        int typeMask;
        typeMask = this.f14896e.getTypeMask();
        return typeMask;
    }

    @Override // t1.y
    public final void e(float f6) {
        this.f14896e.setFraction(f6);
    }
}
