package t1;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import com.tencent.mmkv.R;
import java.util.WeakHashMap;

/* renamed from: t1.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1713p {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003d, code lost:
    
        if (r3 == 9) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.View r5, int r6) {
        /*
            r0 = -1
            if (r6 != r0) goto L5
        L3:
            r3 = r0
            goto L3f
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 6
            r4 = 0
            if (r1 >= r2) goto L16
            switch(r6) {
                case 21: goto L15;
                case 22: goto L13;
                case 23: goto L15;
                case 24: goto L13;
                case 25: goto L11;
                case 26: goto L15;
                case 27: goto L13;
                default: goto L10;
            }
        L10:
            goto L16
        L11:
            r6 = r4
            goto L16
        L13:
            r6 = 4
            goto L16
        L15:
            r6 = r3
        L16:
            r2 = 30
            if (r1 >= r2) goto L2f
            r2 = 12
            if (r6 == r2) goto L2d
            r2 = 13
            if (r6 == r2) goto L30
            r2 = 16
            if (r6 == r2) goto L2d
            r2 = 17
            if (r6 == r2) goto L2b
            goto L2f
        L2b:
            r3 = r4
            goto L30
        L2d:
            r3 = 1
            goto L30
        L2f:
            r3 = r6
        L30:
            r6 = 27
            if (r1 >= r6) goto L3f
            r6 = 7
            if (r3 == r6) goto L3
            r6 = 8
            if (r3 == r6) goto L3
            r6 = 9
            if (r3 == r6) goto L3
        L3f:
            if (r3 != r0) goto L42
            return
        L42:
            r5.performHapticFeedback(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.AbstractC1713p.a(android.view.View, int):void");
    }

    public static void b(ViewGroup viewGroup, AbstractC1699b abstractC1699b) {
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        viewGroup.setAccessibilityDelegate(abstractC1699b.f14868e);
    }

    public static void c(View view, O4.d dVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(dVar != null ? new w(dVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = v.f14889e;
        View.OnApplyWindowInsetsListener uVar = dVar != null ? new u(view, dVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, uVar);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(uVar);
        }
    }
}
