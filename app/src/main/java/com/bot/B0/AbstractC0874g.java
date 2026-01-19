package b0;

import T.C0616l;
import T.C0626q;
import T.C0627q0;
import m4.AbstractC1276k;

/* renamed from: b0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0874g {
    public static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final StackTraceElement[] f10983b = new StackTraceElement[0];

    /* renamed from: c, reason: collision with root package name */
    public static final C0880m f10984c = new C0880m(0, new long[0], new Object[0]);

    public static final int a(int i6, int i7) {
        return i6 << (((i7 % 10) * 3) + 1);
    }

    public static final long b() {
        return Thread.currentThread().getId();
    }

    public static final C0873f c(int i6, X3.e eVar, C0626q c0626q) {
        Object P5 = c0626q.P();
        if (P5 == C0616l.a) {
            P5 = new C0873f(eVar, true, i6);
            c0626q.m0(P5);
        }
        C0873f c0873f = (C0873f) P5;
        c0873f.o(eVar);
        return c0873f;
    }

    public static final boolean d(C0627q0 c0627q0, C0627q0 c0627q02) {
        if (c0627q0 == null) {
            return true;
        }
        if (c0627q0 instanceof C0627q0) {
            return !c0627q0.b() || c0627q0.equals(c0627q02) || AbstractC1276k.b(c0627q0.f8192c, c0627q02.f8192c);
        }
        return false;
    }
}
