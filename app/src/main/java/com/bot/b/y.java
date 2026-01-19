package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class y implements OnBackAnimationCallback {
    public final /* synthetic */ v a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f10963b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f10964c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f10965d;

    public y(v vVar, v vVar2, w wVar, w wVar2) {
        this.a = vVar;
        this.f10963b = vVar2;
        this.f10964c = wVar;
        this.f10965d = wVar2;
    }

    public final void onBackCancelled() {
        this.f10965d.b();
    }

    public final void onBackInvoked() {
        this.f10964c.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1276k.f(backEvent, "backEvent");
        this.f10963b.f(new C0858b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1276k.f(backEvent, "backEvent");
        this.a.f(new C0858b(backEvent));
    }
}
