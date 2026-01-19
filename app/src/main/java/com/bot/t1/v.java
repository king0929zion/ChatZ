package t1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.tencent.mmkv.R;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends y {

    /* renamed from: e, reason: collision with root package name */
    public static final PathInterpolator f14889e = new PathInterpolator(S.l.f7374V, 1.1f, S.l.f7374V, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public static final C1.a f14890f = new C1.a(C1.a.f660c);

    /* renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f14891g = new DecelerateInterpolator(1.5f);

    /* renamed from: h, reason: collision with root package name */
    public static final AccelerateInterpolator f14892h = new AccelerateInterpolator(1.5f);

    public static void f(View view, z zVar) {
        O4.d k3 = k(view);
        if (k3 != null) {
            k3.b(zVar);
            if (k3.f4332c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                f(viewGroup.getChildAt(i6), zVar);
            }
        }
    }

    public static void g(View view, z zVar, P p5, boolean z5) {
        O4.d k3 = k(view);
        if (k3 != null) {
            k3.f4333e = p5;
            if (!z5) {
                k3.c();
                z5 = k3.f4332c == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                g(viewGroup.getChildAt(i6), zVar, p5, z5);
            }
        }
    }

    public static void h(View view, P p5, List list) {
        O4.d k3 = k(view);
        if (k3 != null) {
            p5 = k3.d(p5, list);
            if (k3.f4332c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                h(viewGroup.getChildAt(i6), p5, list);
            }
        }
    }

    public static void i(View view, z zVar, e0.k kVar) {
        O4.d k3 = k(view);
        if (k3 != null) {
            k3.e(zVar, kVar);
            if (k3.f4332c == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                i(viewGroup.getChildAt(i6), zVar, kVar);
            }
        }
    }

    public static WindowInsets j(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static O4.d k(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof u) {
            return ((u) tag).a;
        }
        return null;
    }
}
