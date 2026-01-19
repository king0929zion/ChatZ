package I0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: I0.c0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0176c0 extends ViewGroup {

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f2288c;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f2289e;

    public C0176c0(Context context) {
        super(context);
        setClipChildren(false);
        this.f2288c = new HashMap();
        this.f2289e = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<h1.i, H0.J> getHolderToLayoutNode() {
        return this.f2288c;
    }

    public final HashMap<H0.J, h1.i> getLayoutNodeToHolder() {
        return this.f2289e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        for (h1.i iVar : this.f2288c.keySet()) {
            iVar.layout(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        int i8;
        if (!(View.MeasureSpec.getMode(i6) == 1073741824)) {
            E0.a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i7) == 1073741824)) {
            E0.a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i6), View.MeasureSpec.getSize(i7));
        for (h1.i iVar : this.f2288c.keySet()) {
            int i9 = iVar.f11875y;
            if (i9 != Integer.MIN_VALUE && (i8 = iVar.f11876z) != Integer.MIN_VALUE) {
                iVar.measure(i9, i8);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            H0.J j3 = (H0.J) this.f2288c.get(childAt);
            if (childAt.isLayoutRequested() && j3 != null) {
                H0.J.X(j3, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
