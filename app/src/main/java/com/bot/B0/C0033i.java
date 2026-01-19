package B0;

import D.C0098v0;
import D.EnumC0075j0;
import O.InterfaceC0326p;
import O.N0;
import i4.AbstractC1120d;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingQueue;
import k.C1173u;
import org.slf4j.ILoggerFactory;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import x4.s0;
import z4.C2057h;
import z4.EnumC2050a;

/* renamed from: B0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033i implements InterfaceC0326p, ILoggerFactory {

    /* renamed from: c, reason: collision with root package name */
    public boolean f452c;

    /* renamed from: e, reason: collision with root package name */
    public Object f453e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f454f;

    public C0033i(C1173u c1173u, M.q qVar) {
        this.f453e = c1173u;
        this.f454f = qVar;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized f5.a a(String str) {
        h5.c cVar;
        cVar = (h5.c) ((HashMap) this.f453e).get(str);
        if (cVar == null) {
            cVar = new h5.c(str, (LinkedBlockingQueue) this.f454f, this.f452c);
            ((HashMap) this.f453e).put(str, cVar);
        }
        return cVar;
    }

    public boolean b(long j3) {
        Object obj;
        List list = (List) ((M.q) this.f454f).f3179e;
        int size = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i6);
            if (AbstractC0047x.e(((A) obj).a, j3)) {
                break;
            }
            i6++;
        }
        A a = (A) obj;
        if (a != null) {
            return a.f374h;
        }
        return false;
    }

    @Override // O.InterfaceC0326p
    public boolean c(long j3) {
        C0098v0 c0098v0;
        N0 n02 = (N0) this.f454f;
        if (!n02.k() || n02.n().a.f7630e.length() == 0 || (c0098v0 = n02.f3995d) == null || c0098v0.d() == null) {
            return false;
        }
        i(n02.n(), j3, false, O.I.f3953d);
        return true;
    }

    @Override // O.InterfaceC0326p
    public void d() {
        if (this.f452c) {
            N0.b((N0) this.f454f, (S0.O) this.f453e);
        }
    }

    @Override // O.InterfaceC0326p
    public boolean e(long j3, O.H h3, int i6) {
        C0098v0 c0098v0;
        N0 n02 = (N0) this.f454f;
        if (!n02.k() || n02.n().a.f7630e.length() == 0 || (c0098v0 = n02.f3995d) == null || c0098v0.d() == null) {
            return false;
        }
        m0.w wVar = n02.f4002k;
        if (wVar != null) {
            m0.w.a(wVar);
        }
        n02.f4005n = j3;
        n02.f4010s = -1;
        n02.h(true);
        long i7 = i(n02.n(), n02.f4005n, true, h3);
        if (i6 >= 2) {
            this.f452c = true;
            this.f453e = new S0.O(i7);
        }
        return true;
    }

    @Override // O.InterfaceC0326p
    public boolean f(long j3, O.H h3) {
        C0098v0 c0098v0;
        N0 n02 = (N0) this.f454f;
        if (!n02.k() || n02.n().a.f7630e.length() == 0 || (c0098v0 = n02.f3995d) == null || c0098v0.d() == null) {
            return false;
        }
        i(n02.n(), j3, false, h3);
        return true;
    }

    @Override // O.InterfaceC0326p
    public boolean g(long j3) {
        N0 n02 = (N0) this.f454f;
        C0098v0 c0098v0 = n02.f3995d;
        if (c0098v0 == null || c0098v0.d() == null || !n02.k()) {
            return false;
        }
        n02.f4010s = -1;
        m0.w wVar = n02.f4002k;
        if (wVar != null) {
            m0.w.a(wVar);
        }
        i(n02.n(), j3, false, O.I.f3953d);
        return true;
    }

    public void h() {
        ((C2057h) this.f453e).h(new CancellationException("onBack cancelled"), true);
        ((s0) this.f454f).f(null);
    }

    public long i(X0.v vVar, long j3, boolean z5, O.H h3) {
        N0 n02 = (N0) this.f454f;
        long c6 = N0.c(n02, vVar, j3, z5, false, h3, false);
        if (!S0.O.a(c6, (S0.O) this.f453e)) {
            this.f452c = false;
        }
        n02.q(S0.O.c(c6) ? EnumC0075j0.f1044f : EnumC0075j0.f1043e);
        return c6;
    }

    public C0033i() {
        this.f452c = false;
        this.f453e = new HashMap();
        this.f454f = new LinkedBlockingQueue();
    }

    public C0033i(InterfaceC1942y interfaceC1942y, boolean z5, l4.e eVar, c.n nVar) {
        this.f452c = z5;
        this.f453e = AbstractC1120d.a(-2, 4, EnumC2050a.f16327c);
        this.f454f = AbstractC1888A.y(interfaceC1942y, null, new c.m(nVar, eVar, this, null), 3);
    }

    public C0033i(N0 n02) {
        this.f454f = n02;
        this.f452c = true;
    }
}
