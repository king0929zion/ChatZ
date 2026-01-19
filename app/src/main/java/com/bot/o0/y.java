package o0;

import B0.AbstractC0037m;
import I0.AbstractC0189j;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import com.vladsch.flexmark.parser.PegdownExtensions;
import h0.InterfaceC1041r;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import n0.C1354c;
import n0.C1355d;
import p0.AbstractC1466b;
import p0.AbstractC1467c;
import p0.C1468d;
import p0.C1476l;
import p0.C1477m;
import p0.C1481q;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public abstract class y {
    public static C1387I a;

    /* renamed from: b, reason: collision with root package name */
    public static final C1386H f13496b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static Method f13497c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f13498d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f13499e;

    public static final Shader.TileMode A(int i6) {
        if (i6 == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i6 == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i6 == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i6 == 3 && Build.VERSION.SDK_INT >= 31) {
            return AbstractC0189j.d();
        }
        return Shader.TileMode.CLAMP;
    }

    public static final int B(long j3) {
        float[] fArr = C1468d.a;
        return (int) (s.b(j3, C1468d.f13841e) >>> 32);
    }

    public static final Bitmap.Config C(int i6) {
        return i6 == 0 ? Bitmap.Config.ARGB_8888 : i6 == 1 ? Bitmap.Config.ALPHA_8 : i6 == 2 ? Bitmap.Config.RGB_565 : i6 == 3 ? Bitmap.Config.RGBA_F16 : i6 == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final C1354c D(Rect rect) {
        return new C1354c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final C1354c E(RectF rectF) {
        return new C1354c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final PorterDuff.Mode F(int i6) {
        return i6 == 0 ? PorterDuff.Mode.CLEAR : i6 == 1 ? PorterDuff.Mode.SRC : i6 == 2 ? PorterDuff.Mode.DST : i6 == 3 ? PorterDuff.Mode.SRC_OVER : i6 == 4 ? PorterDuff.Mode.DST_OVER : i6 == 5 ? PorterDuff.Mode.SRC_IN : i6 == 6 ? PorterDuff.Mode.DST_IN : i6 == 7 ? PorterDuff.Mode.SRC_OUT : i6 == 8 ? PorterDuff.Mode.DST_OUT : i6 == 9 ? PorterDuff.Mode.SRC_ATOP : i6 == 10 ? PorterDuff.Mode.DST_ATOP : i6 == 11 ? PorterDuff.Mode.XOR : i6 == 12 ? PorterDuff.Mode.ADD : i6 == 14 ? PorterDuff.Mode.SCREEN : i6 == 15 ? PorterDuff.Mode.OVERLAY : i6 == 16 ? PorterDuff.Mode.DARKEN : i6 == 17 ? PorterDuff.Mode.LIGHTEN : i6 == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }

    public static String G(int i6) {
        return i6 == 0 ? "Clear" : i6 == 1 ? "Src" : i6 == 2 ? "Dst" : i6 == 3 ? "SrcOver" : i6 == 4 ? "DstOver" : i6 == 5 ? "SrcIn" : i6 == 6 ? "DstIn" : i6 == 7 ? "SrcOut" : i6 == 8 ? "DstOut" : i6 == 9 ? "SrcAtop" : i6 == 10 ? "DstAtop" : i6 == 11 ? "Xor" : i6 == 12 ? "Plus" : i6 == 13 ? "Modulate" : i6 == 14 ? "Screen" : i6 == 15 ? "Overlay" : i6 == 16 ? "Darken" : i6 == 17 ? "Lighten" : i6 == 18 ? "ColorDodge" : i6 == 19 ? "ColorBurn" : i6 == 20 ? "HardLight" : i6 == 21 ? "Softlight" : i6 == 22 ? "Difference" : i6 == 23 ? "Exclusion" : i6 == 24 ? "Multiply" : i6 == 25 ? "Hue" : i6 == 26 ? "Saturation" : i6 == 27 ? "Color" : i6 == 28 ? "Luminosity" : "Unknown";
    }

    public static final int H(float f6, float[] fArr, int i6) {
        float f7 = S.l.f7374V;
        if (f6 >= S.l.f7374V) {
            f7 = f6;
        }
        if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        if (Math.abs(f7 - f6) > 1.05E-6f) {
            f7 = Float.NaN;
        }
        fArr[i6] = f7;
        return !Float.isNaN(f7) ? 1 : 0;
    }

    public static final C1391b a(C1395f c1395f) {
        Canvas canvas = AbstractC1392c.a;
        C1391b c1391b = new C1391b();
        c1391b.a = new Canvas(j(c1395f));
        return c1391b;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long b(float r21, float r22, float r23, float r24, p0.AbstractC1467c r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.y.b(float, float, float, float, p0.c):long");
    }

    public static final long c(int i6) {
        long j3 = i6 << 32;
        int i7 = s.f13482i;
        return j3;
    }

    public static final long d(long j3) {
        long j4 = j3 << 32;
        int i6 = s.f13482i;
        return j4;
    }

    public static long e(int i6, int i7, int i8) {
        return c(((i6 & 255) << 16) | (-16777216) | ((i7 & 255) << 8) | (i8 & 255));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
    
        if (r1 != null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static o0.C1395f f(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.y.f(int, int, int):o0.f");
    }

    public static final L1.d g() {
        return new L1.d(new Paint(7));
    }

    public static final long h(float f6, float f7) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
        int i6 = O.f13455c;
        return floatToRawIntBits;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long i(float r17, float r18, float r19, float r20, p0.AbstractC1467c r21) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0.y.i(float, float, float, float, p0.c):long");
    }

    public static final Bitmap j(C1395f c1395f) {
        if (c1395f instanceof C1395f) {
            return c1395f.a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final long k(long j3, long j4) {
        float f6;
        float f7;
        long b5 = s.b(j3, s.g(j4));
        float e6 = s.e(j4);
        float e7 = s.e(b5);
        float f8 = 1.0f - e7;
        float f9 = (e6 * f8) + e7;
        float i6 = s.i(b5);
        float i7 = s.i(j4);
        float f10 = S.l.f7374V;
        if (f9 == S.l.f7374V) {
            f6 = 0.0f;
        } else {
            f6 = (((i7 * e6) * f8) + (i6 * e7)) / f9;
        }
        float h3 = s.h(b5);
        float h6 = s.h(j4);
        if (f9 == S.l.f7374V) {
            f7 = 0.0f;
        } else {
            f7 = (((h6 * e6) * f8) + (h3 * e7)) / f9;
        }
        float f11 = s.f(b5);
        float f12 = s.f(j4);
        if (f9 != S.l.f7374V) {
            f10 = (((f12 * e6) * f8) + (f11 * e7)) / f9;
        }
        return i(f6, f7, f10, f9, s.g(j4));
    }

    public static void l(InterfaceC1498d interfaceC1498d, y yVar, long j3) {
        if (yVar instanceof C1384F) {
            C1354c c1354c = ((C1384F) yVar).f13410f;
            float f6 = c1354c.a;
            float f7 = c1354c.f13295b;
            interfaceC1498d.w0(j3, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), w(c1354c), 1.0f, 3);
            return;
        }
        boolean z5 = yVar instanceof C1385G;
        q0.g gVar = q0.g.a;
        if (!z5) {
            if (!(yVar instanceof C1383E)) {
                throw new RuntimeException();
            }
            interfaceC1498d.y(((C1383E) yVar).f13409f, j3, gVar);
            return;
        }
        C1385G c1385g = (C1385G) yVar;
        C1397h c1397h = c1385g.f13412g;
        if (c1397h != null) {
            interfaceC1498d.y(c1397h, j3, gVar);
            return;
        }
        C1355d c1355d = c1385g.f13411f;
        float intBitsToFloat = Float.intBitsToFloat((int) (c1355d.f13304h >> 32));
        float f8 = c1355d.a;
        float f9 = c1355d.f13298b;
        long floatToRawIntBits = (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
        float b5 = c1355d.b();
        float a6 = c1355d.a();
        interfaceC1498d.i(j3, floatToRawIntBits, (Float.floatToRawIntBits(b5) << 32) | (Float.floatToRawIntBits(a6) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), gVar);
    }

    public static void m(Canvas canvas, boolean z5) {
        Method method;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 29) {
            if (z5) {
                AbstractC1390a.e(canvas);
                return;
            } else {
                AbstractC1390a.h(canvas);
                return;
            }
        }
        if (!f13499e) {
            try {
                if (i6 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f13497c = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f13498d = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f13497c = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f13498d = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f13497c;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f13498d;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f13499e = true;
        }
        if (z5) {
            try {
                Method method4 = f13497c;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z5 || (method = f13498d) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final InterfaceC1041r o(InterfaceC1041r interfaceC1041r, l4.c cVar) {
        return interfaceC1041r.c(new C1401l(cVar));
    }

    public static InterfaceC1041r p(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9, L l3, int i6) {
        float f10 = (i6 & 1) != 0 ? 1.0f : f6;
        float f11 = (i6 & 2) != 0 ? 1.0f : f7;
        float f12 = (i6 & 4) != 0 ? 1.0f : f8;
        float f13 = (i6 & 32) != 0 ? 0.0f : f9;
        long j3 = O.f13454b;
        L l5 = (i6 & 2048) != 0 ? f13496b : l3;
        long j4 = z.a;
        return interfaceC1041r.c(new x(f10, f11, f12, S.l.f7374V, S.l.f7374V, f13, S.l.f7374V, j3, l5, false, j4, j4, 0));
    }

    public static InterfaceC1041r q(InterfaceC1041r interfaceC1041r, float f6, float f7, float f8, float f9, float f10, float f11, L l3, int i6) {
        float f12 = (i6 & 1) != 0 ? 1.0f : f6;
        float f13 = (i6 & 2) != 0 ? 1.0f : f7;
        float f14 = (i6 & 4) != 0 ? 1.0f : f8;
        float f15 = (i6 & 8) != 0 ? 0.0f : f9;
        float f16 = (i6 & 16) != 0 ? 0.0f : f10;
        float f17 = (i6 & PegdownExtensions.WIKILINKS) != 0 ? 0.0f : f11;
        long j3 = O.f13454b;
        L l5 = (i6 & 2048) != 0 ? f13496b : l3;
        boolean z5 = (i6 & 4096) == 0;
        long j4 = z.a;
        return interfaceC1041r.c(new x(f12, f13, f14, f15, f16, S.l.f7374V, f17, j3, l5, z5, j4, j4, (i6 & PegdownExtensions.SUPPRESS_HTML_BLOCKS) != 0 ? 0 : 1));
    }

    public static final boolean r(float[] fArr) {
        return fArr.length >= 16 && fArr[0] == 1.0f && fArr[1] == S.l.f7374V && fArr[2] == S.l.f7374V && fArr[3] == S.l.f7374V && fArr[4] == S.l.f7374V && fArr[5] == 1.0f && fArr[6] == S.l.f7374V && fArr[7] == S.l.f7374V && fArr[8] == S.l.f7374V && fArr[9] == S.l.f7374V && fArr[10] == 1.0f && fArr[11] == S.l.f7374V && fArr[12] == S.l.f7374V && fArr[13] == S.l.f7374V && fArr[14] == S.l.f7374V && fArr[15] == 1.0f;
    }

    public static final long s(long j3, long j4, float f6) {
        C1476l c1476l = C1468d.f13860x;
        long b5 = s.b(j3, c1476l);
        long b6 = s.b(j4, c1476l);
        float e6 = s.e(b5);
        float i6 = s.i(b5);
        float h3 = s.h(b5);
        float f7 = s.f(b5);
        float e7 = s.e(b6);
        float i7 = s.i(b6);
        float h6 = s.h(b6);
        float f8 = s.f(b6);
        if (f6 < S.l.f7374V) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return s.b(i(Y3.C.B(i6, i7, f6), Y3.C.B(h3, h6, f6), Y3.C.B(f7, f8, f6), Y3.C.B(e6, e7, f6), c1476l), s.g(j4));
    }

    public static final float t(long j3) {
        AbstractC1467c g3 = s.g(j3);
        if (!AbstractC1466b.a(g3.f13836b, AbstractC1466b.a)) {
            AbstractC1380B.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1466b.b(g3.f13836b)));
        }
        C1477m c1477m = ((C1481q) g3).f13898p;
        double e6 = c1477m.e(s.i(j3));
        float e7 = (float) ((c1477m.e(s.f(j3)) * 0.0722d) + (c1477m.e(s.h(j3)) * 0.7152d) + (e6 * 0.2126d));
        if (e7 < S.l.f7374V) {
            e7 = 0.0f;
        }
        if (e7 > 1.0f) {
            return 1.0f;
        }
        return e7;
    }

    public static final void u(Matrix matrix, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        float f15 = fArr[12];
        float f16 = fArr[13];
        float f17 = fArr[15];
        fArr[0] = f6;
        fArr[1] = f10;
        fArr[2] = f15;
        fArr[3] = f7;
        fArr[4] = f11;
        fArr[5] = f16;
        fArr[6] = f9;
        fArr[7] = f13;
        fArr[8] = f17;
        matrix.setValues(fArr);
        fArr[0] = f6;
        fArr[1] = f7;
        fArr[2] = f8;
        fArr[3] = f9;
        fArr[4] = f10;
        fArr[5] = f11;
        fArr[6] = f12;
        fArr[7] = f13;
        fArr[8] = f14;
    }

    public static final void v(Matrix matrix, float[] fArr) {
        matrix.getValues(fArr);
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = fArr[4];
        float f11 = fArr[5];
        float f12 = fArr[6];
        float f13 = fArr[7];
        float f14 = fArr[8];
        fArr[0] = f6;
        fArr[1] = f9;
        fArr[2] = 0.0f;
        fArr[3] = f12;
        fArr[4] = f7;
        fArr[5] = f10;
        fArr[6] = 0.0f;
        fArr[7] = f13;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = f8;
        fArr[13] = f11;
        fArr[14] = 0.0f;
        fArr[15] = f14;
    }

    public static final long w(C1354c c1354c) {
        float f6 = c1354c.f13296c - c1354c.a;
        float f7 = c1354c.f13297d - c1354c.f13295b;
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final BlendMode x(int i6) {
        return i6 == 0 ? AbstractC0037m.e() : i6 == 1 ? AbstractC0037m.B() : i6 == 2 ? AbstractC1390a.D() : i6 == 3 ? AbstractC1390a.C() : i6 == 4 ? AbstractC1390a.i() : i6 == 5 ? AbstractC1390a.j() : i6 == 6 ? AbstractC1390a.k() : i6 == 7 ? AbstractC1390a.l() : i6 == 8 ? AbstractC1390a.m() : i6 == 9 ? AbstractC1390a.n() : i6 == 10 ? AbstractC1390a.A() : i6 == 11 ? AbstractC1390a.o() : i6 == 12 ? AbstractC1390a.p() : i6 == 13 ? AbstractC1390a.q() : i6 == 14 ? AbstractC1390a.r() : i6 == 15 ? AbstractC1390a.t() : i6 == 16 ? AbstractC1390a.u() : i6 == 17 ? AbstractC1390a.v() : i6 == 18 ? AbstractC1390a.w() : i6 == 19 ? AbstractC0037m.A() : i6 == 20 ? AbstractC0037m.C() : i6 == 21 ? AbstractC0037m.D() : i6 == 22 ? AbstractC1390a.b() : i6 == 23 ? AbstractC1390a.g() : i6 == 24 ? AbstractC1390a.s() : i6 == 25 ? AbstractC1390a.x() : i6 == 26 ? AbstractC1390a.y() : i6 == 27 ? AbstractC1390a.z() : i6 == 28 ? AbstractC1390a.B() : AbstractC1390a.C();
    }

    public static final Rect y(e1.k kVar) {
        return new Rect(kVar.a, kVar.f11573b, kVar.f11574c, kVar.f11575d);
    }

    public static final RectF z(C1354c c1354c) {
        return new RectF(c1354c.a, c1354c.f13295b, c1354c.f13296c, c1354c.f13297d);
    }

    public abstract C1354c n();
}
