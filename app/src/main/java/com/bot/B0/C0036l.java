package B0;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import k.C1173u;

/* renamed from: B0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036l {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseLongArray f455b = new SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f456c = new SparseBooleanArray();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f457d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final C1173u f458e = new C1173u((Object) null);

    /* renamed from: f, reason: collision with root package name */
    public int f459f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f460g = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f455b;
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (sparseLongArray.indexOfKey(pointerId) < 0) {
                long j3 = this.a;
                this.a = 1 + j3;
                sparseLongArray.put(pointerId, j3);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (sparseLongArray.indexOfKey(pointerId2) < 0) {
            long j4 = this.a;
            this.a = 1 + j4;
            sparseLongArray.put(pointerId2, j4);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f456c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f459f && source == this.f460g) {
            return;
        }
        this.f459f = toolType;
        this.f460g = source;
        this.f456c.clear();
        this.f455b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M.q c(android.view.MotionEvent r46, I0.ViewTreeObserverOnGlobalLayoutListenerC0216x r47) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.C0036l.c(android.view.MotionEvent, I0.x):M.q");
    }

    public final void d(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        SparseBooleanArray sparseBooleanArray = this.f456c;
        SparseLongArray sparseLongArray = this.f455b;
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!sparseBooleanArray.get(pointerId, false)) {
                sparseLongArray.delete(pointerId);
                sparseBooleanArray.delete(pointerId);
            }
        }
        if (sparseLongArray.size() > motionEvent.getPointerCount()) {
            for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                int keyAt = sparseLongArray.keyAt(size);
                int pointerCount = motionEvent.getPointerCount();
                int i6 = 0;
                while (true) {
                    if (i6 >= pointerCount) {
                        sparseLongArray.removeAt(size);
                        sparseBooleanArray.delete(keyAt);
                        break;
                    } else if (motionEvent.getPointerId(i6) == keyAt) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
    }
}
