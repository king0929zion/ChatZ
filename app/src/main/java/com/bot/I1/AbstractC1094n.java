package i1;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: i1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1094n {
    public static final T.B a = new T.B(C1085e.f11982h);

    /* renamed from: b, reason: collision with root package name */
    public static final T.B f12006b = new T.B(C1085e.f11981g);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(i1.InterfaceC1078B r21, l4.InterfaceC1193a r22, i1.C1079C r23, b0.C0873f r24, T.C0626q r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.AbstractC1094n.a(i1.B, l4.a, i1.C, b0.f, T.q, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
