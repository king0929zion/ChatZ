package I0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: I0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190j0 implements InterfaceC0186h0 {
    public final Matrix a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2312b = new int[2];

    @Override // I0.InterfaceC0186h0
    public void a(View view, float[] fArr) {
        Matrix matrix = this.a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f2312b;
        view.getLocationOnScreen(iArr);
        int i6 = iArr[0];
        int i7 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i6, iArr[1] - i7);
        o0.y.v(matrix, fArr);
    }
}
