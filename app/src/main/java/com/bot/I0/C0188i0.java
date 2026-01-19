package I0;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;
import o0.C1382D;

/* renamed from: I0.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188i0 implements InterfaceC0186h0 {
    public final int[] a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f2304b;

    public C0188i0(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.f2304b = new float[size];
        for (int i6 = 0; i6 < size; i6++) {
            this.a[i6] = ((Integer) arrayList.get(i6)).intValue();
            this.f2304b[i6] = ((Float) arrayList2.get(i6)).floatValue();
        }
    }

    @Override // I0.InterfaceC0186h0
    public void a(View view, float[] fArr) {
        C1382D.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z5 = parent instanceof View;
        float[] fArr2 = this.f2304b;
        if (z5) {
            b((View) parent, fArr);
            C1382D.d(fArr2);
            C1382D.f(fArr2, -view.getScrollX(), -view.getScrollY());
            K.o(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            C1382D.d(fArr2);
            C1382D.f(fArr2, left, top);
            K.o(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            C1382D.d(fArr2);
            C1382D.f(fArr2, -view.getScrollX(), -view.getScrollY());
            K.o(fArr, fArr2);
            float f6 = iArr[0];
            float f7 = iArr[1];
            C1382D.d(fArr2);
            C1382D.f(fArr2, f6, f7);
            K.o(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        o0.y.v(matrix, fArr2);
        K.o(fArr, fArr2);
    }

    public C0188i0(int i6, int i7) {
        this.a = new int[]{i6, i7};
        this.f2304b = new float[]{S.l.f7374V, 1.0f};
    }

    public C0188i0(int i6, int i7, int i8) {
        this.a = new int[]{i6, i7, i8};
        this.f2304b = new float[]{S.l.f7374V, 0.5f, 1.0f};
    }

    public C0188i0(float[] fArr) {
        this.f2304b = fArr;
        this.a = new int[2];
    }
}
