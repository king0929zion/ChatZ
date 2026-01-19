package o0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import m4.AbstractC1276k;
import n0.C1354c;
import n0.C1355d;

/* renamed from: o0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1397h {
    public final Path a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f13465b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f13466c;

    /* renamed from: d, reason: collision with root package name */
    public Matrix f13467d;

    public C1397h(Path path) {
        this.a = path;
    }

    public static void a(C1397h c1397h, C1397h c1397h2) {
        Path path = c1397h.a;
        if (!(c1397h2 instanceof C1397h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.addPath(c1397h2.a, Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0));
    }

    public static void b(C1397h c1397h, C1355d c1355d) {
        if (c1397h.f13465b == null) {
            c1397h.f13465b = new RectF();
        }
        RectF rectF = c1397h.f13465b;
        AbstractC1276k.c(rectF);
        float f6 = c1355d.a;
        long j3 = c1355d.f13304h;
        long j4 = c1355d.f13303g;
        long j5 = c1355d.f13302f;
        long j6 = c1355d.f13301e;
        rectF.set(f6, c1355d.f13298b, c1355d.f13299c, c1355d.f13300d);
        if (c1397h.f13466c == null) {
            c1397h.f13466c = new float[8];
        }
        float[] fArr = c1397h.f13466c;
        AbstractC1276k.c(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j5 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j5 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        Path path = c1397h.a;
        RectF rectF2 = c1397h.f13465b;
        AbstractC1276k.c(rectF2);
        float[] fArr2 = c1397h.f13466c;
        AbstractC1276k.c(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final C1354c c() {
        if (this.f13465b == null) {
            this.f13465b = new RectF();
        }
        RectF rectF = this.f13465b;
        AbstractC1276k.c(rectF);
        this.a.computeBounds(rectF, true);
        return new C1354c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean d(C1397h c1397h, C1397h c1397h2, int i6) {
        Path.Op op = i6 == 0 ? Path.Op.DIFFERENCE : i6 == 1 ? Path.Op.INTERSECT : i6 == 4 ? Path.Op.REVERSE_DIFFERENCE : i6 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(c1397h instanceof C1397h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = c1397h.a;
        if (c1397h2 instanceof C1397h) {
            return this.a.op(path, c1397h2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void e() {
        this.a.reset();
    }

    public final void f() {
        this.a.rewind();
    }

    public final void g(long j3) {
        Matrix matrix = this.f13467d;
        if (matrix == null) {
            this.f13467d = new Matrix();
        } else {
            AbstractC1276k.c(matrix);
            matrix.reset();
        }
        Matrix matrix2 = this.f13467d;
        AbstractC1276k.c(matrix2);
        matrix2.setTranslate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        Matrix matrix3 = this.f13467d;
        AbstractC1276k.c(matrix3);
        this.a.transform(matrix3);
    }
}
