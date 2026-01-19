package androidx.lifecycle;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import b4.InterfaceC0909g;
import d5.C0946f;
import d5.C0952l;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import m4.AbstractC1276k;
import n.InterfaceC1293B;
import o0.C1381C;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import r2.InterfaceC1632e;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public class N implements F1.b, InterfaceC0909g, InterfaceC1293B, InterfaceC1632e {

    /* renamed from: e, reason: collision with root package name */
    public static N f10848e;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10849c;

    public /* synthetic */ N(int i6) {
        this.f10849c = i6;
    }

    public static final String b(byte[] bArr, byte[][] bArr2, int i6) {
        int i7;
        boolean z5;
        int i8;
        int i9;
        byte[] bArr3 = PublicSuffixDatabase.f13518e;
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = (i10 + length) / 2;
            while (i11 > -1 && bArr[i11] != 10) {
                i11--;
            }
            int i12 = i11 + 1;
            int i13 = 1;
            while (true) {
                i7 = i12 + i13;
                if (bArr[i7] == 10) {
                    break;
                }
                i13++;
            }
            int i14 = i7 - i12;
            int i15 = i6;
            boolean z6 = false;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (z6) {
                    i8 = 46;
                    z5 = false;
                } else {
                    byte b5 = bArr2[i15][i16];
                    byte[] bArr4 = R4.b.a;
                    int i18 = b5 & 255;
                    z5 = z6;
                    i8 = i18;
                }
                byte b6 = bArr[i12 + i17];
                byte[] bArr5 = R4.b.a;
                i9 = i8 - (b6 & 255);
                if (i9 != 0) {
                    break;
                }
                i17++;
                i16++;
                if (i17 == i14) {
                    break;
                }
                if (bArr2[i15].length != i16) {
                    z6 = z5;
                } else {
                    if (i15 == bArr2.length - 1) {
                        break;
                    }
                    i15++;
                    i16 = -1;
                    z6 = true;
                }
            }
            if (i9 >= 0) {
                if (i9 <= 0) {
                    int i19 = i14 - i17;
                    int length2 = bArr2[i15].length - i16;
                    int length3 = bArr2.length;
                    for (int i20 = i15 + 1; i20 < length3; i20++) {
                        length2 += bArr2[i20].length;
                    }
                    if (length2 >= i19) {
                        if (length2 <= i19) {
                            Charset charset = StandardCharsets.UTF_8;
                            AbstractC1276k.e(charset, "UTF_8");
                            return new String(bArr, i12, i14, charset);
                        }
                    }
                }
                i10 = i7 + 1;
            }
            length = i11;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d5.f, java.lang.Object] */
    public static final void c(C0946f c0946f, long j3, boolean z5) {
        C0946f c0946f2;
        ReentrantLock reentrantLock = C0946f.f11471h;
        if (C0946f.f11475l == null) {
            C0946f.f11475l = new Object();
            Thread thread = new Thread("Okio Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        long nanoTime = System.nanoTime();
        if (j3 != 0 && z5) {
            c0946f.f11478g = Math.min(j3, c0946f.c() - nanoTime) + nanoTime;
        } else if (j3 != 0) {
            c0946f.f11478g = j3 + nanoTime;
        } else {
            if (!z5) {
                throw new AssertionError();
            }
            c0946f.f11478g = c0946f.c();
        }
        long j4 = c0946f.f11478g - nanoTime;
        C0946f c0946f3 = C0946f.f11475l;
        AbstractC1276k.c(c0946f3);
        while (true) {
            c0946f2 = c0946f3.f11477f;
            if (c0946f2 == null || j4 < c0946f2.f11478g - nanoTime) {
                break;
            }
            AbstractC1276k.c(c0946f2);
            c0946f3 = c0946f2;
        }
        c0946f.f11477f = c0946f2;
        c0946f3.f11477f = c0946f;
        if (c0946f3 == C0946f.f11475l) {
            C0946f.f11472i.signal();
        }
    }

    public static final boolean g(d5.y yVar) {
        d5.y yVar2 = e5.f.f11606e;
        C0952l c0952l = yVar.f11514c;
        int k3 = C0952l.k(c0952l, e5.c.a);
        if (k3 == -1) {
            k3 = C0952l.k(yVar.f11514c, e5.c.f11598b);
        }
        if (k3 != -1) {
            c0952l = C0952l.o(c0952l, k3 + 1, 0, 2);
        } else if (yVar.f() != null && c0952l.d() == 2) {
            c0952l = C0952l.f11483g;
        }
        return !u4.u.w(c0952l.q(), ".class", true);
    }

    public static final float h(float f6, float[] fArr, float[] fArr2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float abs = Math.abs(f6);
        float signum = Math.signum(f6);
        int binarySearch = Arrays.binarySearch(fArr, abs);
        if (binarySearch >= 0) {
            return signum * fArr2[binarySearch];
        }
        int i6 = -(binarySearch + 1);
        int i7 = i6 - 1;
        if (i7 >= fArr.length - 1) {
            float f11 = fArr[fArr.length - 1];
            return f11 == S.l.f7374V ? S.l.f7374V : (fArr2[fArr.length - 1] / f11) * f6;
        }
        if (i7 == -1) {
            float f12 = fArr[0];
            f9 = fArr2[0];
            f10 = f12;
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            float f13 = fArr[i7];
            float f14 = fArr[i6];
            f7 = fArr2[i7];
            f8 = f13;
            f9 = fArr2[i6];
            f10 = f14;
        }
        return (((f9 - f7) * Math.max(S.l.f7374V, Math.min(1.0f, f8 == f10 ? 0.0f : (abs - f8) / (f10 - f8)))) + f7) * signum;
    }

    public static C0946f i() {
        C0946f c0946f = C0946f.f11475l;
        AbstractC1276k.c(c0946f);
        C0946f c0946f2 = c0946f.f11477f;
        if (c0946f2 == null) {
            long nanoTime = System.nanoTime();
            C0946f.f11472i.await(C0946f.f11473j, TimeUnit.MILLISECONDS);
            C0946f c0946f3 = C0946f.f11475l;
            AbstractC1276k.c(c0946f3);
            if (c0946f3.f11477f != null || System.nanoTime() - nanoTime < C0946f.f11474k) {
                return null;
            }
            return C0946f.f11475l;
        }
        long nanoTime2 = c0946f2.f11478g - System.nanoTime();
        if (nanoTime2 > 0) {
            C0946f.f11472i.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C0946f c0946f4 = C0946f.f11475l;
        AbstractC1276k.c(c0946f4);
        c0946f4.f11477f = c0946f2.f11477f;
        c0946f2.f11477f = null;
        c0946f2.f11476e = 2;
        return c0946f2;
    }

    public static Y j(a0 a0Var, W w5, int i6) {
        if ((i6 & 2) != 0) {
            AbstractC1276k.f(a0Var, "owner");
            w5 = a0Var instanceof InterfaceC0837k ? ((InterfaceC0837k) a0Var).c() : H1.b.a;
        }
        AbstractC1276k.f(a0Var, "owner");
        F1.c d6 = a0Var instanceof InterfaceC0837k ? ((InterfaceC0837k) a0Var).d() : F1.a.f1544b;
        AbstractC1276k.f(a0Var, "owner");
        AbstractC1276k.f(w5, "factory");
        AbstractC1276k.f(d6, "extras");
        return new Y(a0Var.e(), w5, d6);
    }

    public static void k(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            k(copyOf);
        }
    }

    public static C0952l l(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            bArr[i6] = (byte) (e5.b.a(str.charAt(i7 + 1)) + (e5.b.a(str.charAt(i7)) << 4));
        }
        return new C0952l(bArr);
    }

    public static void o(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            o(copyOf);
        }
    }

    public static void p(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            p(copyOf);
        }
    }

    public static C0952l q(String str) {
        AbstractC1276k.f(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC1763a.a);
        AbstractC1276k.e(bytes, "getBytes(...)");
        C0952l c0952l = new C0952l(bytes);
        c0952l.f11486f = str;
        return c0952l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [d5.i, java.lang.Object] */
    public static d5.y r(String str) {
        AbstractC1276k.f(str, "<this>");
        C0952l c0952l = e5.c.a;
        ?? obj = new Object();
        obj.g0(str);
        return e5.c.d(obj, false);
    }

    public static d5.y s(File file) {
        String str = d5.y.f11513e;
        String file2 = file.toString();
        AbstractC1276k.e(file2, "toString(...)");
        return r(file2);
    }

    public static C1381C u(List list) {
        return new C1381C(list, (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L), (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L));
    }

    public static void v(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            v(copyOf);
        }
    }

    public static C1381C x(List list) {
        return new C1381C(list, (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(S.l.f7374V) & 4294967295L), (Float.floatToRawIntBits(S.l.f7374V) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & 4294967295L));
    }

    public static void y(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            y(copyOf);
        }
    }

    public static void z(Object... objArr) {
        AbstractC1276k.f(objArr, "args");
        for (N n3 : i5.a.f12086b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            n3.getClass();
            z(copyOf);
        }
    }

    @Override // r2.InterfaceC1632e
    public boolean a() {
        return true;
    }

    @Override // n.InterfaceC1293B
    public float d() {
        return S.l.f7374V;
    }

    @Override // n.InterfaceC1293B
    public float e(float f6, long j3) {
        return S.l.f7374V;
    }

    @Override // n.InterfaceC1293B
    public float f(float f6, float f7, long j3) {
        return S.l.f7374V;
    }

    @Override // n.InterfaceC1293B
    public long m(float f6) {
        return 0L;
    }

    @Override // n.InterfaceC1293B
    public float n(float f6, float f7) {
        return S.l.f7374V;
    }

    @Override // r2.InterfaceC1632e
    public void shutdown() {
    }

    public Signature[] t(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public String toString() {
        switch (this.f10849c) {
            case 11:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    public boolean w(CharSequence charSequence) {
        return false;
    }
}
