package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A extends AbstractC0835i {
    final /* synthetic */ B this$0;

    /* loaded from: classes.dex */
    public static final class a extends AbstractC0835i {
        final /* synthetic */ B this$0;

        public a(B b5) {
            this.this$0 = b5;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            this.this$0.b();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            B b5 = this.this$0;
            int i6 = b5.f10807c + 1;
            b5.f10807c = i6;
            if (i6 == 1 && b5.f10810g) {
                b5.f10812i.n(EnumC0841o.ON_START);
                b5.f10810g = false;
            }
        }
    }

    public A(B b5) {
        this.this$0 = b5;
    }

    @Override // androidx.lifecycle.AbstractC0835i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1276k.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i6 = J.f10842e;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1276k.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((J) findFragmentByTag).f10843c = this.this$0.f10814k;
        }
    }

    @Override // androidx.lifecycle.AbstractC0835i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1276k.f(activity, "activity");
        B b5 = this.this$0;
        int i6 = b5.f10808e - 1;
        b5.f10808e = i6;
        if (i6 == 0) {
            Handler handler = b5.f10811h;
            AbstractC1276k.c(handler);
            handler.postDelayed(b5.f10813j, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1276k.f(activity, "activity");
        AbstractC0851z.a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0835i, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1276k.f(activity, "activity");
        B b5 = this.this$0;
        int i6 = b5.f10807c - 1;
        b5.f10807c = i6;
        if (i6 == 0 && b5.f10809f) {
            b5.f10812i.n(EnumC0841o.ON_STOP);
            b5.f10810g = true;
        }
    }
}
