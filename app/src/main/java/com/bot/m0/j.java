package m0;

import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import n0.C1354c;

/* loaded from: classes.dex */
public abstract class j {
    public static final int[] a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public static final Rect f12891b = new Rect();

    public static final C1354c a(View view, View view2) {
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i8 = iArr[0];
        float f6 = i7 - iArr[1];
        view.getFocusedRect(f12891b);
        float f7 = (i6 - i8) + r1.left;
        return new C1354c(f7, r1.top + f6, r1.width() + f7, f6 + r1.top + r1.height());
    }

    public static final boolean b(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof ViewTreeObserverOnGlobalLayoutListenerC0216x) {
            return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final Integer c(int i6) {
        if (i6 == 5) {
            return 33;
        }
        if (i6 == 6) {
            return 130;
        }
        if (i6 == 3) {
            return 17;
        }
        if (i6 == 4) {
            return 66;
        }
        if (i6 == 1) {
            return 2;
        }
        return i6 == 2 ? 1 : null;
    }

    public static final f d(int i6) {
        if (i6 == 1) {
            return new f(2);
        }
        if (i6 == 2) {
            return new f(1);
        }
        if (i6 == 17) {
            return new f(3);
        }
        if (i6 == 33) {
            return new f(5);
        }
        if (i6 == 66) {
            return new f(4);
        }
        if (i6 != 130) {
            return null;
        }
        return new f(6);
    }
}
