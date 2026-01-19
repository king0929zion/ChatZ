package j1;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import i4.AbstractC1118b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: j1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1142h implements Future {

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f12354g = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f12355h = Logger.getLogger(AbstractFutureC1142h.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final AbstractC1118b f12356i;

    /* renamed from: j, reason: collision with root package name */
    public static final Object f12357j;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f12358c;

    /* renamed from: e, reason: collision with root package name */
    public volatile C1138d f12359e;

    /* renamed from: f, reason: collision with root package name */
    public volatile C1141g f12360f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [i4.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        ?? r32;
        try {
            th = null;
            r32 = new C1139e(AtomicReferenceFieldUpdater.newUpdater(C1141g.class, Thread.class, FlexmarkHtmlConverter.A_NODE), AtomicReferenceFieldUpdater.newUpdater(C1141g.class, C1141g.class, FlexmarkHtmlConverter.B_NODE), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1142h.class, C1141g.class, "f"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1142h.class, C1138d.class, "e"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1142h.class, Object.class, "c"));
        } catch (Throwable th) {
            th = th;
            r32 = new Object();
        }
        f12356i = r32;
        if (th != null) {
            f12355h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f12357j = new Object();
    }

    public static void b(AbstractFutureC1142h abstractFutureC1142h) {
        C1141g c1141g;
        C1138d c1138d;
        do {
            c1141g = abstractFutureC1142h.f12360f;
        } while (!f12356i.g(abstractFutureC1142h, c1141g, C1141g.f12352c));
        while (c1141g != null) {
            Thread thread = c1141g.a;
            if (thread != null) {
                c1141g.a = null;
                LockSupport.unpark(thread);
            }
            c1141g = c1141g.f12353b;
        }
        do {
            c1138d = abstractFutureC1142h.f12359e;
        } while (!f12356i.e(abstractFutureC1142h, c1138d));
        C1138d c1138d2 = null;
        while (c1138d != null) {
            C1138d c1138d3 = c1138d.a;
            c1138d.a = c1138d2;
            c1138d2 = c1138d;
            c1138d = c1138d3;
        }
        while (c1138d2 != null) {
            c1138d2 = c1138d2.a;
            try {
                throw null;
                break;
            } catch (RuntimeException e6) {
                f12355h.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e6);
            }
        }
    }

    public static Object c(Object obj) {
        if (obj instanceof C1136b) {
            Throwable th = ((C1136b) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof AbstractC1137c) {
            ((AbstractC1137c) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f12357j) {
            return null;
        }
        return obj;
    }

    public static Object d(AbstractFutureC1142h abstractFutureC1142h) {
        Object obj;
        boolean z5 = false;
        while (true) {
            try {
                obj = abstractFutureC1142h.get();
                break;
            } catch (InterruptedException unused) {
                z5 = true;
            } catch (Throwable th) {
                if (z5) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z5) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object d6 = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(d6 == this ? "this future" : String.valueOf(d6));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e6) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e6.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e7) {
            sb.append("FAILURE, cause=[");
            sb.append(e7.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        Object obj = this.f12358c;
        if (obj != null) {
            return false;
        }
        if (!f12356i.f(this, obj, f12354g ? new C1136b(new CancellationException("Future.cancel() was called."), z5) : z5 ? C1136b.f12344b : C1136b.f12345c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C1141g c1141g) {
        c1141g.a = null;
        while (true) {
            C1141g c1141g2 = this.f12360f;
            if (c1141g2 == C1141g.f12352c) {
                return;
            }
            C1141g c1141g3 = null;
            while (c1141g2 != null) {
                C1141g c1141g4 = c1141g2.f12353b;
                if (c1141g2.a != null) {
                    c1141g3 = c1141g2;
                } else if (c1141g3 != null) {
                    c1141g3.f12353b = c1141g4;
                    if (c1141g3.a == null) {
                        break;
                    }
                } else if (!f12356i.g(this, c1141g2, c1141g4)) {
                    break;
                }
                c1141g2 = c1141g4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        C1141g c1141g = C1141g.f12352c;
        long nanos = timeUnit.toNanos(j3);
        if (!Thread.interrupted()) {
            Object obj = this.f12358c;
            if (obj != null) {
                return c(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C1141g c1141g2 = this.f12360f;
                if (c1141g2 != c1141g) {
                    C1141g c1141g3 = new C1141g();
                    do {
                        AbstractC1118b abstractC1118b = f12356i;
                        abstractC1118b.r(c1141g3, c1141g2);
                        if (abstractC1118b.g(this, c1141g2, c1141g3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f12358c;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    e(c1141g3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            e(c1141g3);
                        } else {
                            c1141g2 = this.f12360f;
                        }
                    } while (c1141g2 != c1141g);
                }
                return c(this.f12358c);
            }
            while (nanos > 0) {
                Object obj3 = this.f12358c;
                if (obj3 != null) {
                    return c(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractFutureC1142h = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j3 + SequenceUtils.SPACE + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String n3 = B3.e.n(str, " (plus ");
                long j4 = -nanos;
                long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
                long nanos2 = j4 - timeUnit.toNanos(convert);
                boolean z5 = convert == 0 || nanos2 > 1000;
                if (convert > 0) {
                    String str2 = n3 + convert + SequenceUtils.SPACE + lowerCase;
                    if (z5) {
                        str2 = B3.e.n(str2, ",");
                    }
                    n3 = B3.e.n(str2, SequenceUtils.SPACE);
                }
                if (z5) {
                    n3 = n3 + nanos2 + " nanoseconds ";
                }
                str = B3.e.n(n3, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(B3.e.n(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(AbstractC1135a.g(str, " for ", abstractFutureC1142h));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f12358c instanceof C1136b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f12358c != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f12358c instanceof C1136b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e6) {
                str = "Exception thrown from implementation: " + e6.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        C1141g c1141g = C1141g.f12352c;
        if (!Thread.interrupted()) {
            Object obj2 = this.f12358c;
            if (obj2 != null) {
                return c(obj2);
            }
            C1141g c1141g2 = this.f12360f;
            if (c1141g2 != c1141g) {
                C1141g c1141g3 = new C1141g();
                do {
                    AbstractC1118b abstractC1118b = f12356i;
                    abstractC1118b.r(c1141g3, c1141g2);
                    if (abstractC1118b.g(this, c1141g2, c1141g3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f12358c;
                            } else {
                                e(c1141g3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c1141g2 = this.f12360f;
                } while (c1141g2 != c1141g);
            }
            return c(this.f12358c);
        }
        throw new InterruptedException();
    }
}
