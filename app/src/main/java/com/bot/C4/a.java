package C4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import com.vladsch.flexmark.util.format.TableCell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.AbstractC1908V;
import x4.AbstractC1939v;
import x4.B0;
import x4.C1936s;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.u0;
import x4.v0;

/* loaded from: classes.dex */
public abstract class a {
    public static final u a = new u("CLOSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final u f678b = new u("UNDEFINED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final u f679c = new u("REUSABLE_CLAIMED", 0);

    /* renamed from: d, reason: collision with root package name */
    public static final u f680d = new u("NO_THREAD_ELEMENTS", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final B4.z f681e = new B4.z(1);

    /* renamed from: f, reason: collision with root package name */
    public static final B4.z f682f = new B4.z(2);

    /* renamed from: g, reason: collision with root package name */
    public static final B4.z f683g = new B4.z(3);

    public static final void a(int i6) {
        if (i6 < 1) {
            throw new IllegalArgumentException(B3.e.h(i6, "Expected positive parallelism level, but got ").toString());
        }
    }

    public static final Object b(s sVar, long j3, l4.e eVar) {
        while (true) {
            if (sVar.f715f >= j3 && !sVar.d()) {
                return sVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f684c;
            Object obj = atomicReferenceFieldUpdater.get(sVar);
            u uVar = a;
            if (obj == uVar) {
                return uVar;
            }
            s sVar2 = (s) ((b) obj);
            if (sVar2 == null) {
                sVar2 = (s) eVar.m(Long.valueOf(sVar.f715f + 1), sVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(sVar, null, sVar2)) {
                    if (atomicReferenceFieldUpdater.get(sVar) != null) {
                        break;
                    }
                }
                if (sVar.d()) {
                    sVar.e();
                }
            }
            sVar = sVar2;
        }
    }

    public static final s c(Object obj) {
        if (obj != a) {
            return (s) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(InterfaceC0910h interfaceC0910h, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.a.iterator();
        while (it.hasNext()) {
            try {
                ((CoroutineExceptionHandler) it.next()).N(interfaceC0910h, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    X3.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            X3.a.a(th, new e(interfaceC0910h));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(InterfaceC0910h interfaceC0910h, Object obj) {
        if (obj == f680d) {
            return;
        }
        if (!(obj instanceof z)) {
            Object q3 = interfaceC0910h.q(null, f682f);
            AbstractC1276k.d(q3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((w) ((u0) q3)).a(obj);
            return;
        }
        z zVar = (z) obj;
        u0[] u0VarArr = zVar.f724c;
        int length = u0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i6 = length - 1;
            u0 u0Var = u0VarArr[length];
            AbstractC1276k.c(u0Var);
            ((w) u0Var).a(zVar.f723b[length]);
            if (i6 < 0) {
                return;
            } else {
                length = i6;
            }
        }
    }

    public static final void h(InterfaceC0905c interfaceC0905c, Object obj) {
        if (!(interfaceC0905c instanceof f)) {
            interfaceC0905c.k(obj);
            return;
        }
        f fVar = (f) interfaceC0905c;
        AbstractC1939v abstractC1939v = fVar.f689g;
        Throwable a6 = X3.l.a(obj);
        Object c1936s = a6 == null ? obj : new C1936s(a6, false);
        d4.c cVar = fVar.f690h;
        if (abstractC1939v.f0(cVar.o())) {
            fVar.f691i = c1936s;
            fVar.f15657f = 1;
            abstractC1939v.d0(cVar.o(), fVar);
            return;
        }
        AbstractC1908V a7 = v0.a();
        if (a7.f15673f >= 4294967296L) {
            fVar.f691i = c1936s;
            fVar.f15657f = 1;
            a7.i0(fVar);
            return;
        }
        a7.k0(true);
        try {
            InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) cVar.o().r(C1940w.f15731e);
            if (interfaceC1922e0 == null || interfaceC1922e0.d()) {
                Object obj2 = fVar.f692j;
                InterfaceC0910h o5 = cVar.o();
                Object l3 = l(o5, obj2);
                B0 G5 = l3 != f680d ? AbstractC1888A.G(cVar, o5, l3) : null;
                try {
                    cVar.k(obj);
                } finally {
                    if (G5 == null || G5.q0()) {
                        g(o5, l3);
                    }
                }
            } else {
                fVar.k(X3.a.b(interfaceC1922e0.y()));
            }
            do {
            } while (a7.m0());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long i(String str, long j3, long j4, long j5) {
        String str2;
        int i6 = v.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        Long F5 = u4.u.F(10, str2);
        if (F5 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = F5.longValue();
        if (j4 <= longValue && longValue <= j5) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + longValue + '\'').toString());
    }

    public static int j(int i6, int i7, String str) {
        return (int) i(str, i6, 1, (i7 & 8) != 0 ? TableCell.NOT_TRACKED : 2097150);
    }

    public static final Object k(InterfaceC0910h interfaceC0910h) {
        Object q3 = interfaceC0910h.q(0, f681e);
        AbstractC1276k.c(q3);
        return q3;
    }

    public static final Object l(InterfaceC0910h interfaceC0910h, Object obj) {
        if (obj == null) {
            obj = k(interfaceC0910h);
        }
        return obj == 0 ? f680d : obj instanceof Integer ? interfaceC0910h.q(new z(((Number) obj).intValue(), interfaceC0910h), f683g) : ((w) ((u0) obj)).u(interfaceC0910h);
    }
}
