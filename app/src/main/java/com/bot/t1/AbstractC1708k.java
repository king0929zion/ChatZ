package t1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.tencent.mmkv.R;

/* renamed from: t1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1708k {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void b(View view, InterfaceC1702e interfaceC1702e) {
        ViewOnApplyWindowInsetsListenerC1707j viewOnApplyWindowInsetsListenerC1707j = interfaceC1702e != null ? new ViewOnApplyWindowInsetsListenerC1707j(view, interfaceC1702e) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, viewOnApplyWindowInsetsListenerC1707j);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (viewOnApplyWindowInsetsListenerC1707j != null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1707j);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }
}
