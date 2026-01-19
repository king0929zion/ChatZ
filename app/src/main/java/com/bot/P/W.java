package p;

import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class W {
    public static final float a = ViewConfiguration.getScrollFriction();

    /* renamed from: b, reason: collision with root package name */
    public static final double f13656b;

    /* renamed from: c, reason: collision with root package name */
    public static final double f13657c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f13656b = log;
        f13657c = log - 1.0d;
    }
}
