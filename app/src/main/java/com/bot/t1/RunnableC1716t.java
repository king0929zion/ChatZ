package t1;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: t1.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1716t implements Runnable {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f14884c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f14885e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.k f14886f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f14887g;

    public RunnableC1716t(View view, z zVar, e0.k kVar, ValueAnimator valueAnimator) {
        this.f14884c = view;
        this.f14885e = zVar;
        this.f14886f = kVar;
        this.f14887g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v.i(this.f14884c, this.f14885e, this.f14886f);
        this.f14887g.start();
    }
}
