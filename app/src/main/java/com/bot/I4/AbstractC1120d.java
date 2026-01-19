package i4;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vladsch.flexmark.util.format.TableCell;
import d5.o;
import io.ktor.utils.io.t;
import io.ktor.utils.io.y;
import j1.AbstractC1135a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import p1.AbstractC1484a;
import r3.InterfaceC1634a;
import u0.C1746g;
import u4.AbstractC1776n;
import u4.u;
import v4.AbstractC1826b;
import v4.C1825a;
import v4.EnumC1827c;
import z1.C2017b;
import z4.C2057h;
import z4.C2060k;
import z4.EnumC2050a;
import z4.InterfaceC2061l;
import z4.r;

/* renamed from: i4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1120d {
    public static C1746g a;

    public static C2057h a(int i6, int i7, EnumC2050a enumC2050a) {
        if ((i7 & 1) != 0) {
            i6 = 0;
        }
        int i8 = i7 & 2;
        EnumC2050a enumC2050a2 = EnumC2050a.f16327c;
        if (i8 != 0) {
            enumC2050a = enumC2050a2;
        }
        if (i6 == -2) {
            if (enumC2050a != enumC2050a2) {
                return new r(1, enumC2050a);
            }
            InterfaceC2061l.f16372d.getClass();
            return new C2057h(C2060k.f16371b);
        }
        if (i6 != -1) {
            return i6 != 0 ? i6 != Integer.MAX_VALUE ? enumC2050a == enumC2050a2 ? new C2057h(i6) : new r(i6, enumC2050a) : new C2057h(TableCell.NOT_TRACKED) : enumC2050a == enumC2050a2 ? new C2057h(0) : new r(1, enumC2050a);
        }
        if (enumC2050a == enumC2050a2) {
            return new r(1, EnumC2050a.f16328e);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0169  */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, x.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final h0.InterfaceC1041r r39, x.s r40, final v.InterfaceC1802i0 r41, final boolean r42, final r.InterfaceC1619x0 r43, final boolean r44, final p.C1459u r45, h0.InterfaceC1027d r46, v.InterfaceC1797g r47, h0.C1032i r48, v.InterfaceC1793e r49, final l4.c r50, T.C0626q r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.AbstractC1120d.b(h0.r, x.s, v.i0, boolean, r.x0, boolean, p.u, h0.d, v.g, h0.i, v.e, l4.c, T.q, int, int, int):void");
    }

    public static final long c(float f6, float f7) {
        return (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final long d(String str) {
        EnumC1827c enumC1827c;
        char charAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i6 = C1825a.f15384g;
        char charAt2 = str.charAt(0);
        int i7 = (charAt2 == '+' || charAt2 == '-') ? 1 : 0;
        boolean z5 = i7 > 0 && AbstractC1776n.d0(str, '-');
        if (length <= i7) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i7) != 'P') {
            throw new IllegalArgumentException();
        }
        int i8 = i7 + 1;
        if (i8 == length) {
            throw new IllegalArgumentException();
        }
        EnumC1827c enumC1827c2 = null;
        long j3 = 0;
        boolean z6 = false;
        while (i8 < length) {
            if (str.charAt(i8) != 'T') {
                int i9 = i8;
                while (i9 < str.length() && (('0' <= (charAt = str.charAt(i9)) && charAt < ':') || AbstractC1776n.H("+-.", charAt))) {
                    i9++;
                }
                String substring = str.substring(i8, i9);
                AbstractC1276k.e(substring, "substring(...)");
                if (substring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = substring.length() + i8;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(substring));
                }
                char charAt3 = str.charAt(length2);
                int i10 = length2 + 1;
                if (z6) {
                    if (charAt3 == 'H') {
                        enumC1827c = EnumC1827c.HOURS;
                    } else if (charAt3 == 'M') {
                        enumC1827c = EnumC1827c.MINUTES;
                    } else {
                        if (charAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + charAt3);
                        }
                        enumC1827c = EnumC1827c.SECONDS;
                    }
                } else {
                    if (charAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + charAt3);
                    }
                    enumC1827c = EnumC1827c.DAYS;
                }
                if (enumC1827c2 != null && enumC1827c2.compareTo(enumC1827c) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int N5 = AbstractC1776n.N(substring, '.', 0, 6);
                if (enumC1827c != EnumC1827c.SECONDS || N5 <= 0) {
                    j3 = C1825a.e(j3, u(s(substring), enumC1827c));
                } else {
                    String substring2 = substring.substring(0, N5);
                    AbstractC1276k.e(substring2, "substring(...)");
                    long e6 = C1825a.e(j3, u(s(substring2), enumC1827c));
                    String substring3 = substring.substring(N5);
                    AbstractC1276k.e(substring3, "substring(...)");
                    double parseDouble = Double.parseDouble(substring3);
                    double i11 = AbstractC1121e.i(parseDouble, enumC1827c, EnumC1827c.NANOSECONDS);
                    if (Double.isNaN(i11)) {
                        throw new IllegalArgumentException("Duration value cannot be NaN.");
                    }
                    long L5 = AbstractC1410a.L(i11);
                    j3 = C1825a.e(e6, (-4611686018426999999L > L5 || L5 >= 4611686018427000000L) ? l(AbstractC1410a.L(AbstractC1121e.i(parseDouble, enumC1827c, EnumC1827c.MILLISECONDS))) : m(L5));
                }
                enumC1827c2 = enumC1827c;
                i8 = i10;
            } else {
                if (z6 || (i8 = i8 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z6 = true;
            }
        }
        return z5 ? C1825a.g(j3) : j3;
    }

    public static final void e(y yVar) {
        AbstractC1276k.f(yVar, "<this>");
        ((t) yVar).i(new CancellationException("Channel has been cancelled"));
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void g(int i6) {
        if (2 > i6 || i6 >= 37) {
            StringBuilder k3 = AbstractC1135a.k("radix ", i6, " was not in valid range ");
            k3.append(new r4.e(2, 36, 1));
            throw new IllegalArgumentException(k3.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(X1.c cVar, Throwable th) {
        boolean isTerminated;
        if (cVar != 0) {
            if (th != null) {
                try {
                    AbstractC1135a.r(cVar);
                    return;
                } catch (Throwable th2) {
                    X3.a.a(th, th2);
                    return;
                }
            }
            if (cVar instanceof AutoCloseable) {
                cVar.close();
                return;
            }
            if (!(cVar instanceof ExecutorService)) {
                if (cVar instanceof TypedArray) {
                    ((TypedArray) cVar).recycle();
                    return;
                } else if (cVar instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) cVar).release();
                    return;
                } else {
                    if (!(cVar instanceof MediaDrm)) {
                        throw new IllegalArgumentException();
                    }
                    ((MediaDrm) cVar).release();
                    return;
                }
            }
            ExecutorService executorService = (ExecutorService) cVar;
            if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
                return;
            }
            executorService.shutdown();
            boolean z5 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z5) {
                        executorService.shutdownNow();
                        z5 = true;
                    }
                }
            }
            if (z5) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Handler i(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC1484a.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e7) {
            e = e7;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e8) {
            e = e8;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static final void j(o oVar, d5.y yVar) {
        try {
            IOException iOException = null;
            for (d5.y yVar2 : oVar.g(yVar)) {
                try {
                    if (oVar.h(yVar2).f11490b) {
                        j(oVar, yVar2);
                    }
                    oVar.d(yVar2);
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final long k(long j3) {
        long j4 = (j3 << 1) + 1;
        int i6 = C1825a.f15384g;
        int i7 = AbstractC1826b.a;
        return j4;
    }

    public static final long l(long j3) {
        return (-4611686018426L > j3 || j3 >= 4611686018427L) ? k(AbstractC1117a.g(j3, -4611686018427387903L, 4611686018427387903L)) : m(j3 * 1000000);
    }

    public static final long m(long j3) {
        long j4 = j3 << 1;
        int i6 = C1825a.f15384g;
        int i7 = AbstractC1826b.a;
        return j4;
    }

    public static final boolean n(char c6, char c7, boolean z5) {
        if (c6 == c7) {
            return true;
        }
        if (!z5) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c7);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static Object o(Object obj, Class cls) {
        if (obj instanceof InterfaceC1634a) {
            return cls.cast(obj);
        }
        if (obj instanceof r3.b) {
            return o(((r3.b) obj).b(), cls);
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + InterfaceC1634a.class + " or " + r3.b.class);
    }

    public static final long p(long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static int q(int i6) {
        if (i6 == 1) {
            return 0;
        }
        if (i6 == 2) {
            return 1;
        }
        if (i6 == 4) {
            return 2;
        }
        if (i6 == 8) {
            return 3;
        }
        if (i6 == 16) {
            return 4;
        }
        if (i6 == 32) {
            return 5;
        }
        if (i6 == 64) {
            return 6;
        }
        if (i6 == 128) {
            return 7;
        }
        if (i6 == 256) {
            return 8;
        }
        if (i6 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(B3.e.h(i6, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean r(char c6) {
        return Character.isWhitespace(c6) || Character.isSpaceChar(c6);
    }

    public static final long s(String str) {
        char charAt;
        int length = str.length();
        int i6 = (length <= 0 || !AbstractC1776n.H("+-", str.charAt(0))) ? 0 : 1;
        if (length - i6 > 16) {
            int i7 = i6;
            while (true) {
                if (i6 < length) {
                    char charAt2 = str.charAt(i6);
                    if (charAt2 != '0') {
                        if ('1' > charAt2 || charAt2 >= ':') {
                            break;
                        }
                    } else if (i7 == i6) {
                        i7++;
                    }
                    i6++;
                } else if (length - i7 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!u.D(str, "+", false) || length <= 1 || '0' > (charAt = str.charAt(1)) || charAt >= ':') ? Long.parseLong(str) : Long.parseLong(AbstractC1776n.I(1, str));
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [z1.b, Z3.e] */
    public static C2017b t(MappedByteBuffer mappedByteBuffer) {
        long j3;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i6 = duplicate.getShort() & 65535;
        if (i6 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                j3 = -1;
                break;
            }
            int i8 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j3 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i8) {
                break;
            }
            i7++;
        }
        if (j3 != -1) {
            duplicate.position(duplicate.position() + ((int) (j3 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j4 = duplicate.getInt() & 4294967295L;
            for (int i9 = 0; i9 < j4; i9++) {
                int i10 = duplicate.getInt();
                long j5 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i10 || 1701669481 == i10) {
                    duplicate.position((int) (j5 + j3));
                    ?? eVar = new Z3.e();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    eVar.f10524g = duplicate;
                    eVar.f10521c = position;
                    int i11 = position - duplicate.getInt(position);
                    eVar.f10522e = i11;
                    eVar.f10523f = ((ByteBuffer) eVar.f10524g).getShort(i11);
                    return eVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final long u(long j3, EnumC1827c enumC1827c) {
        AbstractC1276k.f(enumC1827c, "unit");
        EnumC1827c enumC1827c2 = EnumC1827c.NANOSECONDS;
        long k3 = AbstractC1121e.k(4611686018426999999L, enumC1827c2, enumC1827c);
        return ((-k3) > j3 || j3 > k3) ? k(AbstractC1117a.g(AbstractC1121e.j(j3, enumC1827c, EnumC1827c.MILLISECONDS), -4611686018427387903L, 4611686018427387903L)) : m(AbstractC1121e.k(j3, enumC1827c, enumC1827c2));
    }
}
