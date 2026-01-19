package t1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: t1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1715s extends AnimatorListenerAdapter {
    public final /* synthetic */ z a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14883b;

    public C1715s(View view, z zVar) {
        this.a = zVar;
        this.f14883b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z zVar = this.a;
        zVar.a.e(1.0f);
        v.f(this.f14883b, zVar);
    }
}
