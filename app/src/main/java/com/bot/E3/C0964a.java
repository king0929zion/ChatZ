package e3;

import T.C0607g0;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import i4.AbstractC1120d;
import m4.AbstractC1276k;
import n0.C1356e;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0964a implements Drawable.Callback {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0965b f11591c;

    public C0964a(C0965b c0965b) {
        this.f11591c = c0965b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        AbstractC1276k.f(drawable, "d");
        C0965b c0965b = this.f11591c;
        C0607g0 c0607g0 = c0965b.f11593i;
        c0607g0.setValue(Integer.valueOf(((Number) c0607g0.getValue()).intValue() + 1));
        Drawable drawable2 = c0965b.f11592h;
        Object obj = AbstractC0967d.a;
        c0965b.f11594j.setValue(new C1356e((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC1120d.c(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X3.f] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        AbstractC1276k.f(drawable, "d");
        AbstractC1276k.f(runnable, "what");
        ((Handler) AbstractC0967d.a.getValue()).postAtTime(runnable, j3);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, X3.f] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC1276k.f(drawable, "d");
        AbstractC1276k.f(runnable, "what");
        ((Handler) AbstractC0967d.a.getValue()).removeCallbacks(runnable);
    }
}
