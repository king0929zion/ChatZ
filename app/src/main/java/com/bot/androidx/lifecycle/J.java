package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class J extends Fragment {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f10842e = 0;

    /* renamed from: c, reason: collision with root package name */
    public Y f10843c;

    /* loaded from: classes.dex */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final I Companion = new Object();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1276k.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1276k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1276k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1276k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1276k.f(activity, "activity");
            int i6 = J.f10842e;
            H.a(activity, EnumC0841o.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1276k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1276k.f(activity, "activity");
            AbstractC1276k.f(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1276k.f(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1276k.f(activity, "activity");
        }
    }

    public final void a(EnumC0841o enumC0841o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1276k.e(activity, "getActivity(...)");
            H.a(activity, enumC0841o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(EnumC0841o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(EnumC0841o.ON_DESTROY);
        this.f10843c = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(EnumC0841o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Y y5 = this.f10843c;
        if (y5 != null) {
            ((B) y5.a).b();
        }
        a(EnumC0841o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Y y5 = this.f10843c;
        if (y5 != null) {
            B b5 = (B) y5.a;
            int i6 = b5.f10807c + 1;
            b5.f10807c = i6;
            if (i6 == 1 && b5.f10810g) {
                b5.f10812i.n(EnumC0841o.ON_START);
                b5.f10810g = false;
            }
        }
        a(EnumC0841o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(EnumC0841o.ON_STOP);
    }
}
