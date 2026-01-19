package u1;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import b.AbstractC0857a;
import com.vladsch.flexmark.parser.PegdownExtensions;
import org.jsoup.internal.SharedConstants;

/* renamed from: u1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1753c {

    /* renamed from: c, reason: collision with root package name */
    public static final C1753c f15142c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1753c f15143d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1753c f15144e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1753c f15145f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1753c f15146g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1753c f15147h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1753c f15148i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1753c f15149j;
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15150b;

    static {
        new C1753c(null, 1, null, null);
        new C1753c(null, 2, null, null);
        new C1753c(null, 4, null, null);
        new C1753c(null, 8, null, null);
        new C1753c(null, 16, null, null);
        new C1753c(null, 32, null, null);
        f15142c = new C1753c(null, 64, null, null);
        f15143d = new C1753c(null, PegdownExtensions.FENCED_CODE_BLOCKS, null, null);
        new C1753c(null, PegdownExtensions.WIKILINKS, null, f.class);
        new C1753c(null, PegdownExtensions.STRIKETHROUGH, null, f.class);
        new C1753c(null, PegdownExtensions.ANCHORLINKS, null, g.class);
        new C1753c(null, 2048, null, g.class);
        f15144e = new C1753c(null, 4096, null, null);
        f15145f = new C1753c(null, 8192, null, null);
        new C1753c(null, 16384, null, null);
        new C1753c(null, SharedConstants.DefaultBufferSize, null, null);
        new C1753c(null, PegdownExtensions.SUPPRESS_HTML_BLOCKS, null, null);
        new C1753c(null, PegdownExtensions.SUPPRESS_INLINE_HTML, null, k.class);
        new C1753c(null, PegdownExtensions.ATXHEADERSPACE, null, null);
        new C1753c(null, PegdownExtensions.SUBSCRIPT, null, null);
        new C1753c(null, PegdownExtensions.RELAXEDHRULES, null, null);
        new C1753c(null, PegdownExtensions.TASKLISTITEMS, null, l.class);
        int i6 = Build.VERSION.SDK_INT;
        new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null);
        new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, i.class);
        f15146g = new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null);
        f15147h = new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null);
        f15148i = new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null);
        f15149j = new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null);
        new C1753c(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null);
        new C1753c(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null);
        new C1753c(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null);
        new C1753c(i6 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null);
        new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null);
        new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, j.class);
        new C1753c(AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow, null, h.class);
        new C1753c(i6 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null);
        new C1753c(i6 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null);
        new C1753c(i6 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null);
        new C1753c(i6 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null);
        new C1753c(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.ALT, null, null);
        new C1753c(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.CTRL, null, null);
        new C1753c(i6 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.FUNCTION, null, null);
        new C1753c(i6 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.KEYCODE_0, null, null);
        new C1753c(i6 >= 34 ? AbstractC0857a.a() : null, R.id.KEYCODE_3D_MODE, null, null);
    }

    public C1753c(int i6, String str) {
        this(null, i6, str, null);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1753c)) {
            return false;
        }
        Object obj2 = ((C1753c) obj).a;
        Object obj3 = this.a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String c6 = C1754d.c(this.f15150b);
        if (c6.equals("ACTION_UNKNOWN")) {
            Object obj = this.a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                c6 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(c6);
        return sb.toString();
    }

    public C1753c(Object obj, int i6, CharSequence charSequence, Class cls) {
        this.f15150b = i6;
        if (obj == null) {
            this.a = new AccessibilityNodeInfo.AccessibilityAction(i6, charSequence);
        } else {
            this.a = obj;
        }
    }
}
