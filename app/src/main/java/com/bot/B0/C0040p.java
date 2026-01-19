package B0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import v.AbstractC1787b;

/* renamed from: B0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0040p {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final C0033i f470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f472d;

    /* renamed from: e, reason: collision with root package name */
    public final int f473e;

    /* renamed from: f, reason: collision with root package name */
    public int f474f;

    public C0040p(List list, C0033i c0033i) {
        MotionEvent a;
        this.a = list;
        this.f470b = c0033i;
        int i6 = 0;
        this.f471c = (Build.VERSION.SDK_INT < 29 || (a = a()) == null) ? 0 : a.getClassification();
        MotionEvent a6 = a();
        this.f472d = a6 != null ? a6.getButtonState() : 0;
        MotionEvent a7 = a();
        this.f473e = a7 != null ? a7.getMetaState() : 0;
        MotionEvent a8 = a();
        if (a8 != null) {
            int actionMasked = a8.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 8:
                                i6 = 6;
                                break;
                            case AbstractC1787b.f15287d /* 9 */:
                                i6 = 4;
                                break;
                            case AbstractC1787b.f15289f /* 10 */:
                                i6 = 5;
                                break;
                        }
                    }
                    i6 = 3;
                }
                i6 = 2;
            }
            i6 = 1;
        } else {
            int size = list.size();
            while (i6 < size) {
                y yVar = (y) list.get(i6);
                if (AbstractC0047x.d(yVar)) {
                    i6 = 2;
                } else if (AbstractC0047x.b(yVar)) {
                    i6 = 1;
                } else {
                    i6++;
                }
            }
            i6 = 3;
        }
        this.f474f = i6;
    }

    public final MotionEvent a() {
        C0033i c0033i = this.f470b;
        if (c0033i != null) {
            return (MotionEvent) ((M.q) c0033i.f454f).f3180f;
        }
        return null;
    }
}
