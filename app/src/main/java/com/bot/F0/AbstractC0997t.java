package f0;

import D.C0079l0;
import b0.AbstractC0874g;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0997t {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11719b = new Object();

    public static final void a(int i6, int i7) {
        if (i6 < 0 || i6 >= i7) {
            throw new IndexOutOfBoundsException("index (" + i6 + ") is out of bound of [0, " + i7 + ')');
        }
    }

    public static final boolean b(C1002y c1002y, int i6, X.c cVar, boolean z5) {
        boolean z6;
        synchronized (a) {
            try {
                int i7 = c1002y.f11748d;
                if (i7 == i6) {
                    c1002y.f11747c = cVar;
                    z6 = true;
                    if (z5) {
                        c1002y.f11749e++;
                    }
                    c1002y.f11748d = i7 + 1;
                } else {
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }

    public static final int c(long[] jArr, long j3) {
        int length = jArr.length - 1;
        int i6 = 0;
        while (i6 <= length) {
            int i7 = (i6 + length) >>> 1;
            long j4 = jArr[i7];
            if (j3 > j4) {
                i6 = i7 + 1;
            } else {
                if (j3 >= j4) {
                    return i7;
                }
                length = i7 - 1;
            }
        }
        return -(i6 + 1);
    }

    public static AbstractC0983f e() {
        return (AbstractC0983f) AbstractC0992o.f11706b.e();
    }

    public static final C1002y f(C0996s c0996s) {
        C1002y c1002y = c0996s.f11718c;
        AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.<get-readable>>");
        return (C1002y) AbstractC0992o.t(c1002y, c0996s);
    }

    public static final int g(C0996s c0996s) {
        C1002y c1002y = c0996s.f11718c;
        AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
        return ((C1002y) AbstractC0992o.h(c1002y)).f11749e;
    }

    public static AbstractC0983f h(AbstractC0983f abstractC0983f) {
        if (abstractC0983f instanceof C0976F) {
            C0976F c0976f = (C0976F) abstractC0983f;
            if (c0976f.f11658t == AbstractC0874g.b()) {
                c0976f.f11656r = null;
                return abstractC0983f;
            }
        }
        if (abstractC0983f instanceof C0977G) {
            C0977G c0977g = (C0977G) abstractC0983f;
            if (c0977g.f11663i == AbstractC0874g.b()) {
                c0977g.f11662h = null;
                return abstractC0983f;
            }
        }
        AbstractC0983f g3 = AbstractC0992o.g(abstractC0983f, null, false);
        g3.j();
        return g3;
    }

    public static final boolean i(C0996s c0996s, l4.c cVar) {
        int i6;
        X.c cVar2;
        Object f6;
        AbstractC0983f j3;
        boolean b5;
        do {
            synchronized (a) {
                C1002y c1002y = c0996s.f11718c;
                AbstractC1276k.d(c1002y, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C1002y c1002y2 = (C1002y) AbstractC0992o.h(c1002y);
                i6 = c1002y2.f11748d;
                cVar2 = c1002y2.f11747c;
            }
            AbstractC1276k.c(cVar2);
            X.g e6 = cVar2.e();
            f6 = cVar.f(e6);
            X.c c6 = e6.c();
            if (AbstractC1276k.b(c6, cVar2)) {
                break;
            }
            C1002y c1002y3 = c0996s.f11718c;
            AbstractC1276k.d(c1002y3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC0992o.f11707c) {
                j3 = AbstractC0992o.j();
                b5 = b((C1002y) AbstractC0992o.w(c1002y3, c0996s, j3), i6, c6, true);
            }
            AbstractC0992o.n(j3, c0996s);
        } while (!b5);
        return ((Boolean) f6).booleanValue();
    }

    public static Object j(C0079l0 c0079l0, InterfaceC1193a interfaceC1193a) {
        AbstractC0983f c0976f;
        AbstractC0983f abstractC0983f = (AbstractC0983f) AbstractC0992o.f11706b.e();
        if (abstractC0983f instanceof C0976F) {
            C0976F c0976f2 = (C0976F) abstractC0983f;
            if (c0976f2.f11658t == AbstractC0874g.b()) {
                l4.c cVar = c0976f2.f11656r;
                l4.c cVar2 = c0976f2.f11657s;
                try {
                    ((C0976F) abstractC0983f).f11656r = AbstractC0992o.k(c0079l0, cVar, true);
                    ((C0976F) abstractC0983f).f11657s = cVar2;
                    return interfaceC1193a.b();
                } finally {
                    c0976f2.f11656r = cVar;
                    c0976f2.f11657s = cVar2;
                }
            }
        }
        if (abstractC0983f == null || (abstractC0983f instanceof C0979b)) {
            c0976f = new C0976F(abstractC0983f instanceof C0979b ? (C0979b) abstractC0983f : null, c0079l0, null, true, false);
        } else {
            c0976f = abstractC0983f.u(c0079l0);
        }
        try {
            AbstractC0983f j3 = c0976f.j();
            try {
                Object b5 = interfaceC1193a.b();
                AbstractC0983f.q(j3);
                c0976f.c();
                return b5;
            } catch (Throwable th) {
                AbstractC0983f.q(j3);
                throw th;
            }
        } catch (Throwable th2) {
            c0976f.c();
            throw th2;
        }
    }

    public static void k(AbstractC0983f abstractC0983f, AbstractC0983f abstractC0983f2, l4.c cVar) {
        if (abstractC0983f != abstractC0983f2) {
            abstractC0983f2.getClass();
            AbstractC0983f.q(abstractC0983f);
            abstractC0983f2.c();
        } else if (abstractC0983f instanceof C0976F) {
            ((C0976F) abstractC0983f).f11656r = cVar;
        } else if (abstractC0983f instanceof C0977G) {
            ((C0977G) abstractC0983f).f11662h = cVar;
        } else {
            throw new IllegalStateException(("Non-transparent snapshot was reused: " + abstractC0983f).toString());
        }
    }

    public static final void l() {
        throw new UnsupportedOperationException();
    }

    public abstract void d();
}
