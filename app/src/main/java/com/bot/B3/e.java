package B3;

import H0.C0146e;
import H0.C0150g;
import S0.P;
import T.C0626q;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import h0.InterfaceC1041r;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ boolean a(int i6) {
        if (i6 == 1) {
            return true;
        }
        if (i6 == 2) {
            return false;
        }
        if (i6 == 3) {
            return true;
        }
        if (i6 == 4 || i6 == 5) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean b(int i6) {
        if (i6 == 1 || i6 == 2) {
            return true;
        }
        if (i6 == 3 || i6 == 4 || i6 == 5) {
            return false;
        }
        throw null;
    }

    public static /* synthetic */ boolean c(int i6) {
        if (i6 == 1 || i6 == 2 || i6 == 3 || i6 == 4) {
            return true;
        }
        if (i6 == 5) {
            return false;
        }
        throw null;
    }

    public static int d(int i6, int i7, P p5) {
        return (p5.hashCode() + i6) * i7;
    }

    public static int e(int i6, int i7, String str) {
        return (str.hashCode() + i6) * i7;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.RuntimeException, N0.e] */
    public static N0.e f(String str) {
        E0.a.c(str);
        return new RuntimeException();
    }

    public static String g(char c6, String str, String str2) {
        return str + str2 + c6;
    }

    public static String h(int i6, String str) {
        return str + i6;
    }

    public static String i(int i6, String str, int i7, String str2, String str3) {
        return str + i6 + str2 + i7 + str3;
    }

    public static String j(C0626q c0626q, int i6, int i7, C0626q c0626q2, boolean z5) {
        c0626q.b0(i6);
        String j02 = h5.e.j0(i7, c0626q2);
        c0626q.p(z5);
        return j02;
    }

    public static String k(String str, int i6, int i7, String str2) {
        return str + i6 + str2 + i7;
    }

    public static String l(String str, int i6, String str2) {
        return str + i6 + str2;
    }

    public static String m(String str, long j3) {
        return str + j3;
    }

    public static String n(String str, String str2) {
        return str + str2;
    }

    public static String o(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String p(String str, StringBuilder sb) {
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, str);
        return AbstractC1776n.l0(sb2).toString();
    }

    public static String q(StringBuilder sb, int i6, char c6) {
        sb.append(i6);
        sb.append(c6);
        return sb.toString();
    }

    public static String r(StringBuilder sb, String str, char c6) {
        sb.append(str);
        sb.append(c6);
        return sb.toString();
    }

    public static String s(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder t(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void v(int i6, C0626q c0626q, int i7, C0146e c0146e) {
        c0626q.m0(Integer.valueOf(i6));
        c0626q.b(Integer.valueOf(i7), c0146e);
    }

    public static void w(C0626q c0626q, Integer num, C0626q c0626q2, C0626q c0626q3, InterfaceC1041r interfaceC1041r) {
        T.r.x(c0626q, num, C0150g.f1929g);
        T.r.C(c0626q2, C0150g.f1930h);
        T.r.G(c0626q3, interfaceC1041r, C0150g.f1926d);
    }

    public static /* synthetic */ void x(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
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

    public static /* synthetic */ void y(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void z(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }
}
