package B0;

import H0.r0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.view.MotionEvent;
import m4.AbstractC1277l;
import m4.AbstractC1291z;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class J extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h1.x f399f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J(h1.x xVar, int i6) {
        super(1);
        this.f398e = i6;
        this.f399f = xVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean dispatchTouchEvent;
        switch (this.f398e) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                h1.x xVar = this.f399f;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case AbstractC1787b.f15290g /* 5 */:
                    case 6:
                        dispatchTouchEvent = xVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        dispatchTouchEvent = xVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(dispatchTouchEvent);
            case 1:
                r0 r0Var = (r0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = r0Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0216x ? (ViewTreeObserverOnGlobalLayoutListenerC0216x) r0Var : null;
                h1.x xVar2 = this.f399f;
                if (viewTreeObserverOnGlobalLayoutListenerC0216x != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().removeViewInLayout(xVar2);
                    AbstractC1291z.a(viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC0216x.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(xVar2));
                    xVar2.setImportantForAccessibility(0);
                }
                xVar2.removeAllViewsInLayout();
                return X3.y.a;
            default:
                this.f399f.f11870t = (l4.c) obj;
                return X3.y.a;
        }
    }
}
