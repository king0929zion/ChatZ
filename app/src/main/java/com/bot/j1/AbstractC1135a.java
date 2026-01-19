package j1;

import H0.C0144d;
import H0.C0146e;
import H0.C0158m;
import T.C0626q;
import T.r;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import m4.AbstractC1276k;
import o0.s;
import z0.AbstractC2015c;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1135a {
    public static int a(float f6, int i6, int i7) {
        return (Float.hashCode(f6) + i6) * i7;
    }

    public static int b(int i6, int i7, int i8) {
        return (Integer.hashCode(i6) + i7) * i8;
    }

    public static int c(int i6, int i7, long j3) {
        return (Long.hashCode(j3) + i6) * i7;
    }

    public static int d(int i6, int i7, boolean z5) {
        return (Boolean.hashCode(z5) + i6) * i7;
    }

    public static int e(List list, int i6, int i7) {
        return (list.hashCode() + i6) * i7;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String h(StringBuilder sb, float f6, char c6) {
        sb.append(f6);
        sb.append(c6);
        return sb.toString();
    }

    public static String i(StringBuilder sb, int i6, String str) {
        sb.append(i6);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder j(int i6, String str, int i7, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i6);
        sb.append(str2);
        sb.append(i7);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(String str, int i6, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i6);
        sb.append(str2);
        return sb;
    }

    public static /* synthetic */ void l(int i6) {
        if (i6 != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC1276k.j(nullPointerException, AbstractC1276k.class.getName());
        throw nullPointerException;
    }

    public static void m(int i6, int i7, int i8, int i9, int i10) {
        AbstractC2015c.a(i6);
        AbstractC2015c.a(i7);
        AbstractC2015c.a(i8);
        AbstractC2015c.a(i9);
        AbstractC2015c.a(i10);
    }

    public static void n(int i6, C0626q c0626q, C0146e c0146e, C0626q c0626q2, C0144d c0144d) {
        r.x(c0626q, Integer.valueOf(i6), c0146e);
        r.C(c0626q2, c0144d);
    }

    public static /* synthetic */ void o(int i6, String str) {
        if (i6 == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1276k.class.getName();
            int i7 = 0;
            while (!stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            while (stackTrace[i7].getClassName().equals(name)) {
                i7++;
            }
            StackTraceElement stackTraceElement = stackTrace[i7];
            StringBuilder u5 = B3.e.u("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            u5.append(str);
            NullPointerException nullPointerException = new NullPointerException(u5.toString());
            AbstractC1276k.j(nullPointerException, AbstractC1276k.class.getName());
            throw nullPointerException;
        }
    }

    public static void p(long j3, StringBuilder sb, String str) {
        sb.append((Object) s.j(j3));
        sb.append(str);
    }

    public static void q(C0158m c0158m, long j3) {
        c0158m.g().p();
        c0158m.s(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void r(X1.c cVar) {
        boolean isTerminated;
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

    public static String s(String str, String str2, String str3) {
        return str + str2 + str3;
    }
}
