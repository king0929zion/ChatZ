package t1;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public float f14897b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f14898c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14899d;

    public y(int i6, Interpolator interpolator, long j3) {
        this.a = i6;
        this.f14898c = interpolator;
        this.f14899d = j3;
    }

    public float a() {
        return 1.0f;
    }

    public long b() {
        return this.f14899d;
    }

    public float c() {
        Interpolator interpolator = this.f14898c;
        return interpolator != null ? interpolator.getInterpolation(this.f14897b) : this.f14897b;
    }

    public int d() {
        return this.a;
    }

    public void e(float f6) {
        this.f14897b = f6;
    }
}
