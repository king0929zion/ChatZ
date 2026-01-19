package I0;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: classes.dex */
public final class A0 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ B0 a;

    public A0(B0 b02) {
        this.a = b02;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        B0 b02 = this.a;
        C0203q c0203q = b02.a;
        if (!b02.f2132c) {
            int i6 = b02.f2131b;
            if (i6 == 1) {
                if (Math.abs(f6) > Math.abs(f7)) {
                    ((m0.q) c0203q.f2351f.getFocusOwner()).i(f6 > S.l.f7374V ? 1 : 2, false);
                    return true;
                }
            } else if (i6 == 2 && Math.abs(f7) > Math.abs(f6)) {
                ((m0.q) c0203q.f2351f.getFocusOwner()).i(f7 > S.l.f7374V ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f6, float f7) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }
}
