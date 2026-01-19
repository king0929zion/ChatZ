package o0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import m4.AbstractC1276k;
import n0.C1354c;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1391b implements q {
    public Canvas a = AbstractC1392c.a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f13456b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f13457c;

    @Override // o0.q
    public final void a(float f6, float f7, float f8, float f9, float f10, float f11, L1.d dVar) {
        this.a.drawRoundRect(f6, f7, f8, f9, f10, f11, (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void b(C1395f c1395f, L1.d dVar) {
        this.a.drawBitmap(y.j(c1395f), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void c(float f6, float f7) {
        this.a.scale(f6, f7);
    }

    @Override // o0.q
    public final void d(float f6) {
        this.a.rotate(f6);
    }

    @Override // o0.q
    public final void e(C1397h c1397h, L1.d dVar) {
        Canvas canvas = this.a;
        if (!(c1397h instanceof C1397h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(c1397h.a, (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void f(C1397h c1397h) {
        Canvas canvas = this.a;
        if (!(c1397h instanceof C1397h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(c1397h.a, Region.Op.INTERSECT);
    }

    @Override // o0.q
    public final void g(long j3, long j4, L1.d dVar) {
        this.a.drawLine(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void h() {
        this.a.save();
    }

    @Override // o0.q
    public final void i() {
        y.m(this.a, false);
    }

    @Override // o0.q
    public final void j(float f6, float f7, float f8, float f9, float f10, float f11, L1.d dVar) {
        this.a.drawArc(f6, f7, f8, f9, f10, f11, false, (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void k(float[] fArr) {
        if (y.r(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        y.u(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // o0.q
    public final void l(C1354c c1354c, L1.d dVar) {
        this.a.saveLayer(c1354c.a, c1354c.f13295b, c1354c.f13296c, c1354c.f13297d, (Paint) dVar.f3002b, 31);
    }

    @Override // o0.q
    public final void m(float f6, float f7, float f8, float f9, int i6) {
        this.a.clipRect(f6, f7, f8, f9, i6 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // o0.q
    public final void n(float f6, float f7) {
        this.a.translate(f6, f7);
    }

    @Override // o0.q
    public final void o(C1395f c1395f, long j3, long j4, long j5, L1.d dVar) {
        if (this.f13456b == null) {
            this.f13456b = new Rect();
            this.f13457c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap j6 = y.j(c1395f);
        Rect rect = this.f13456b;
        AbstractC1276k.c(rect);
        int i6 = (int) (j3 >> 32);
        rect.left = i6;
        int i7 = (int) (j3 & 4294967295L);
        rect.top = i7;
        rect.right = i6 + ((int) (j4 >> 32));
        rect.bottom = i7 + ((int) (j4 & 4294967295L));
        Rect rect2 = this.f13457c;
        AbstractC1276k.c(rect2);
        int i8 = (int) 0;
        rect2.left = i8;
        int i9 = (int) 0;
        rect2.top = i9;
        rect2.right = i8 + ((int) (j5 >> 32));
        rect2.bottom = i9 + ((int) (4294967295L & j5));
        canvas.drawBitmap(j6, rect, rect2, (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void p() {
        this.a.restore();
    }

    @Override // o0.q
    public final void r(float f6, float f7, float f8, float f9, L1.d dVar) {
        this.a.drawRect(f6, f7, f8, f9, (Paint) dVar.f3002b);
    }

    @Override // o0.q
    public final void s() {
        y.m(this.a, true);
    }

    @Override // o0.q
    public final void t(float f6, long j3, L1.d dVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f6, (Paint) dVar.f3002b);
    }
}
