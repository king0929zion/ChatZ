package x4;

import b4.InterfaceC0908f;
import b4.InterfaceC0909g;
import b4.InterfaceC0910h;
import c4.EnumC0927a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public class l0 implements InterfaceC1922e0, r0 {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15714c = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_state$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f15715e = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public l0(boolean z5) {
        this._state$volatile = z5 ? AbstractC1888A.f15646j : AbstractC1888A.f15645i;
    }

    public static C1932o c0(C4.k kVar) {
        while (kVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C4.k.f705e;
            C4.k c6 = kVar.c();
            if (c6 == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (C4.k) obj;
                    if (!kVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = c6;
            }
        }
        while (true) {
            kVar = kVar.g();
            if (!kVar.h()) {
                if (kVar instanceof C1932o) {
                    return (C1932o) kVar;
                }
                if (kVar instanceof n0) {
                    return null;
                }
            }
        }
    }

    public static String k0(Object obj) {
        if (!(obj instanceof k0)) {
            return obj instanceof InterfaceC1914a0 ? ((InterfaceC1914a0) obj).d() ? "Active" : "New" : obj instanceof C1936s ? "Cancelled" : "Completed";
        }
        k0 k0Var = (k0) obj;
        return k0Var.c() ? "Cancelling" : k0.f15709e.get(k0Var) != 0 ? "Completing" : "Active";
    }

    public final Object A(d4.c cVar) {
        Object obj;
        do {
            obj = f15714c.get(this);
            if (!(obj instanceof InterfaceC1914a0)) {
                if (obj instanceof C1936s) {
                    throw ((C1936s) obj).a;
                }
                return AbstractC1888A.F(obj);
            }
        } while (j0(obj) < 0);
        i0 i0Var = new i0(Y4.d.K(cVar), this);
        i0Var.t();
        i0Var.x(new C1925h(AbstractC1888A.u(this, true, new C1901N(i0Var, 2)), 2));
        return i0Var.s();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0 = x4.AbstractC1888A.f15640d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 != x4.AbstractC1888A.f15641e) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0106, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r0 = l0(r0, new x4.C1936s(J(r10), false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r0 == x4.AbstractC1888A.f15642f) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r0 != x4.AbstractC1888A.f15640d) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        r0 = null;
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        r4 = x4.l0.f15714c;
        r5 = r4.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if ((r5 instanceof x4.k0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if ((r5 instanceof x4.InterfaceC1914a0) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r1 = J(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        r6 = (x4.InterfaceC1914a0) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0008, code lost:
    
        if (P() != false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        if (r6.d() == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r4 = l0(r5, new x4.C1936s(r1, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (r4 == x4.AbstractC1888A.f15640d) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dd, code lost:
    
        if (r4 == x4.AbstractC1888A.f15642f) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00df, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        r0 = x4.l0.f15714c.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        throw new java.lang.IllegalStateException(("Cannot happen in " + r5).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ae, code lost:
    
        r7 = R(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b2, code lost:
    
        if (r7 != null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b5, code lost:
    
        r8 = new x4.k0(r7, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
    
        if (r4.compareAndSet(r9, r6, r8) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if ((r0 instanceof x4.InterfaceC1914a0) == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ca, code lost:
    
        if (r4.get(r9) == r6) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
    
        d0(r7, r1);
        r10 = x4.AbstractC1888A.f15640d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x006a, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f9, code lost:
    
        r10 = x4.AbstractC1888A.f15643g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0051, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0052, code lost:
    
        r4 = (x4.k0) r5;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0060, code lost:
    
        if (x4.k0.f15711g.get(r4) != x4.AbstractC1888A.f15644h) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0062, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0065, code lost:
    
        if (r4 == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0067, code lost:
    
        r10 = x4.AbstractC1888A.f15643g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0069, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006f, code lost:
    
        r4 = ((x4.k0) r5).c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if ((r0 instanceof x4.k0) == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0076, code lost:
    
        if (r1 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0078, code lost:
    
        r1 = J(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x007c, code lost:
    
        ((x4.k0) r5).a(r1);
        r10 = ((x4.k0) r5).b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0089, code lost:
    
        if (r4 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x008b, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x008c, code lost:
    
        monitor-exit(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008d, code lost:
    
        if (r0 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x008f, code lost:
    
        d0(((x4.k0) r5).f15712c, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0096, code lost:
    
        r10 = x4.AbstractC1888A.f15640d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0064, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r1 = (x4.k0) r0;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00ff, code lost:
    
        if (r0 != x4.AbstractC1888A.f15640d) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        if (r0 != x4.AbstractC1888A.f15641e) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0109, code lost:
    
        if (r0 != x4.AbstractC1888A.f15643g) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x010b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x010c, code lost:
    
        v(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (x4.k0.f15709e.get(r1) == 0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x010f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.l0.B(java.lang.Object):boolean");
    }

    public void C(CancellationException cancellationException) {
        B(cancellationException);
    }

    public final boolean D(Throwable th) {
        if (X()) {
            return true;
        }
        boolean z5 = th instanceof CancellationException;
        InterfaceC1931n interfaceC1931n = (InterfaceC1931n) f15715e.get(this);
        return (interfaceC1931n == null || interfaceC1931n == p0.f15721c) ? z5 : interfaceC1931n.a(th) || z5;
    }

    public String F() {
        return "Job was cancelled";
    }

    public boolean G(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return B(th) && M();
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M H(boolean z5, boolean z6, l4.c cVar) {
        return W(z6, z5 ? new C1920d0(cVar) : new C1901N(cVar, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.RuntimeException, N0.e] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Throwable, N0.e] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void I(InterfaceC1914a0 interfaceC1914a0, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15715e;
        InterfaceC1931n interfaceC1931n = (InterfaceC1931n) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1931n != null) {
            interfaceC1931n.dispose();
            atomicReferenceFieldUpdater.set(this, p0.f15721c);
        }
        N0.e eVar = 0;
        C1936s c1936s = obj instanceof C1936s ? (C1936s) obj : null;
        Throwable th = c1936s != null ? c1936s.a : null;
        if (interfaceC1914a0 instanceof h0) {
            try {
                ((h0) interfaceC1914a0).k(th);
                return;
            } catch (Throwable th2) {
                U(new RuntimeException("Exception in completion handler " + interfaceC1914a0 + " for " + this, th2));
                return;
            }
        }
        n0 e6 = interfaceC1914a0.e();
        if (e6 != null) {
            e6.b(new C4.i(1), 1);
            Object obj2 = C4.k.f704c.get(e6);
            AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            C4.k kVar = (C4.k) obj2;
            while (!kVar.equals(e6)) {
                if (kVar instanceof h0) {
                    try {
                        ((h0) kVar).k(th);
                    } catch (Throwable th3) {
                        if (eVar != 0) {
                            X3.a.a(eVar, th3);
                        } else {
                            eVar = new RuntimeException("Exception in completion handler " + kVar + " for " + this, th3);
                        }
                    }
                }
                kVar = kVar.g();
                eVar = eVar;
            }
            if (eVar != 0) {
                U(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable J(Object obj) {
        CancellationException cancellationException;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        l0 l0Var = (l0) ((r0) obj);
        Object obj2 = f15714c.get(l0Var);
        if (obj2 instanceof k0) {
            cancellationException = ((k0) obj2).b();
        } else if (obj2 instanceof C1936s) {
            cancellationException = ((C1936s) obj2).a;
        } else {
            if (obj2 instanceof InterfaceC1914a0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new f0("Parent job is ".concat(k0(obj2)), cancellationException, l0Var) : cancellationException2;
    }

    public final Object K(k0 k0Var, Object obj) {
        Throwable L5;
        C1936s c1936s = obj instanceof C1936s ? (C1936s) obj : null;
        Throwable th = c1936s != null ? c1936s.a : null;
        synchronized (k0Var) {
            k0Var.c();
            ArrayList f6 = k0Var.f(th);
            L5 = L(k0Var, f6);
            if (L5 != null && f6.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f6.size()));
                int size = f6.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj2 = f6.get(i6);
                    i6++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != L5 && th2 != L5 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        X3.a.a(L5, th2);
                    }
                }
            }
        }
        if (L5 != null && L5 != th) {
            obj = new C1936s(L5, false);
        }
        if (L5 != null && (D(L5) || T(L5))) {
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            C1936s.f15726b.compareAndSet((C1936s) obj, 0, 1);
        }
        f0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15714c;
        Object c1916b0 = obj instanceof InterfaceC1914a0 ? new C1916b0((InterfaceC1914a0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, k0Var, c1916b0) && atomicReferenceFieldUpdater.get(this) == k0Var) {
        }
        I(k0Var, obj);
        return obj;
    }

    public final Throwable L(k0 k0Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (k0Var.c()) {
                return new f0(F(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i7);
            i7++;
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof x0) {
            int size2 = arrayList.size();
            while (true) {
                if (i6 >= size2) {
                    break;
                }
                Object obj3 = arrayList.get(i6);
                i6++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof x0)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean M() {
        return true;
    }

    public Object O(X2.r rVar) {
        return A(rVar);
    }

    public boolean P() {
        return this instanceof C1933p;
    }

    @Override // x4.InterfaceC1922e0
    public final Object Q(d4.c cVar) {
        Object obj;
        X3.y yVar;
        do {
            obj = f15714c.get(this);
            boolean z5 = obj instanceof InterfaceC1914a0;
            yVar = X3.y.a;
            if (!z5) {
                AbstractC1888A.n(cVar.o());
                return yVar;
            }
        } while (j0(obj) < 0);
        C1928k c1928k = new C1928k(1, Y4.d.K(cVar));
        c1928k.t();
        c1928k.x(new C1925h(AbstractC1888A.u(this, true, new C1930m(c1928k, 1)), 2));
        Object s5 = c1928k.s();
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        if (s5 != enumC0927a) {
            s5 = yVar;
        }
        return s5 == enumC0927a ? s5 : yVar;
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [C4.k, x4.n0] */
    public final n0 R(InterfaceC1914a0 interfaceC1914a0) {
        n0 e6 = interfaceC1914a0.e();
        if (e6 != null) {
            return e6;
        }
        if (interfaceC1914a0 instanceof C1902O) {
            return new C4.k();
        }
        if (interfaceC1914a0 instanceof h0) {
            i0((h0) interfaceC1914a0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1914a0).toString());
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1900M S(l4.c cVar) {
        return W(true, new C1901N(cVar, 1));
    }

    public boolean T(Throwable th) {
        return false;
    }

    public void U(N0.e eVar) {
        throw eVar;
    }

    public final void V(InterfaceC1922e0 interfaceC1922e0) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15715e;
        p0 p0Var = p0.f15721c;
        if (interfaceC1922e0 == null) {
            atomicReferenceFieldUpdater.set(this, p0Var);
            return;
        }
        interfaceC1922e0.start();
        InterfaceC1931n s5 = interfaceC1922e0.s(this);
        atomicReferenceFieldUpdater.set(this, s5);
        if (f15714c.get(this) instanceof InterfaceC1914a0) {
            return;
        }
        s5.dispose();
        atomicReferenceFieldUpdater.set(this, p0Var);
    }

    public final InterfaceC1900M W(boolean z5, h0 h0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        p0 p0Var;
        boolean z6;
        boolean b5;
        h0Var.f15698g = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f15714c;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj instanceof C1902O;
            p0Var = p0.f15721c;
            z6 = true;
            if (!z7) {
                if (!(obj instanceof InterfaceC1914a0)) {
                    z6 = false;
                    break;
                }
                InterfaceC1914a0 interfaceC1914a0 = (InterfaceC1914a0) obj;
                n0 e6 = interfaceC1914a0.e();
                if (e6 == null) {
                    AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    i0((h0) obj);
                } else {
                    if (h0Var.j()) {
                        k0 k0Var = interfaceC1914a0 instanceof k0 ? (k0) interfaceC1914a0 : null;
                        Throwable b6 = k0Var != null ? k0Var.b() : null;
                        if (b6 == null) {
                            b5 = e6.b(h0Var, 5);
                        } else if (z5) {
                            h0Var.k(b6);
                            return p0Var;
                        }
                    } else {
                        b5 = e6.b(h0Var, 1);
                    }
                    if (b5) {
                        break;
                    }
                }
            } else {
                C1902O c1902o = (C1902O) obj;
                if (c1902o.f15662c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, h0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                h0(c1902o);
            }
        }
        if (z6) {
            return h0Var;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C1936s c1936s = obj2 instanceof C1936s ? (C1936s) obj2 : null;
            h0Var.k(c1936s != null ? c1936s.a : null);
        }
        return p0Var;
    }

    public boolean X() {
        return this instanceof C1923f;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h Y(InterfaceC0910h interfaceC0910h) {
        return Y4.d.P(this, interfaceC0910h);
    }

    public final boolean Z(Object obj) {
        Object l02;
        do {
            l02 = l0(f15714c.get(this), obj);
            if (l02 == AbstractC1888A.f15640d) {
                return false;
            }
            if (l02 == AbstractC1888A.f15641e) {
                return true;
            }
        } while (l02 == AbstractC1888A.f15642f);
        v(l02);
        return true;
    }

    public final Object a0(Object obj) {
        Object l02;
        do {
            l02 = l0(f15714c.get(this), obj);
            if (l02 == AbstractC1888A.f15640d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C1936s c1936s = obj instanceof C1936s ? (C1936s) obj : null;
                throw new IllegalStateException(str, c1936s != null ? c1936s.a : null);
            }
        } while (l02 == AbstractC1888A.f15642f);
        return l02;
    }

    public String b0() {
        return getClass().getSimpleName();
    }

    @Override // x4.InterfaceC1922e0
    public boolean d() {
        Object obj = f15714c.get(this);
        return (obj instanceof InterfaceC1914a0) && ((InterfaceC1914a0) obj).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Throwable, N0.e] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public final void d0(n0 n0Var, Throwable th) {
        n0Var.b(new C4.i(4), 4);
        Object obj = C4.k.f704c.get(n0Var);
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C4.k kVar = (C4.k) obj;
        N0.e eVar = 0;
        while (!kVar.equals(n0Var)) {
            if ((kVar instanceof h0) && ((h0) kVar).j()) {
                try {
                    ((h0) kVar).k(th);
                } catch (Throwable th2) {
                    if (eVar != 0) {
                        X3.a.a(eVar, th2);
                    } else {
                        eVar = new RuntimeException("Exception in completion handler " + kVar + " for " + this, th2);
                    }
                }
            }
            kVar = kVar.g();
            eVar = eVar;
        }
        if (eVar != 0) {
            U(eVar);
        }
        D(th);
    }

    public void e0(Throwable th) {
    }

    @Override // x4.InterfaceC1922e0
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new f0(F(), null, this);
        }
        C(cancellationException);
    }

    public void f0(Object obj) {
    }

    public void g0() {
    }

    @Override // b4.InterfaceC0908f
    public final InterfaceC0909g getKey() {
        return C1940w.f15731e;
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0910h h(InterfaceC0909g interfaceC0909g) {
        return Y4.d.L(this, interfaceC0909g);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [C4.k, x4.n0] */
    public final void h0(C1902O c1902o) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        ?? kVar = new C4.k();
        C1912Z c1912z = kVar;
        if (!c1902o.f15662c) {
            c1912z = new C1912Z(kVar);
        }
        do {
            atomicReferenceFieldUpdater = f15714c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1902o, c1912z)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1902o);
    }

    public final void i0(h0 h0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C4.k kVar = new C4.k();
        h0Var.getClass();
        C4.k.f705e.set(kVar, h0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C4.k.f704c;
        atomicReferenceFieldUpdater2.set(kVar, h0Var);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(h0Var) != h0Var) {
                break;
            }
            while (!atomicReferenceFieldUpdater2.compareAndSet(h0Var, h0Var, kVar)) {
                if (atomicReferenceFieldUpdater2.get(h0Var) != h0Var) {
                    break;
                }
            }
            kVar.f(h0Var);
        }
        C4.k g3 = h0Var.g();
        do {
            atomicReferenceFieldUpdater = f15714c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, h0Var, g3)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == h0Var);
    }

    public Object j() {
        Object obj = f15714c.get(this);
        if (obj instanceof InterfaceC1914a0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C1936s) {
            throw ((C1936s) obj).a;
        }
        return AbstractC1888A.F(obj);
    }

    public final int j0(Object obj) {
        boolean z5 = obj instanceof C1902O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15714c;
        if (z5) {
            if (((C1902O) obj).f15662c) {
                return 0;
            }
            C1902O c1902o = AbstractC1888A.f15646j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1902o)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            g0();
            return 1;
        }
        if (!(obj instanceof C1912Z)) {
            return 0;
        }
        n0 n0Var = ((C1912Z) obj).f15678c;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, n0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        g0();
        return 1;
    }

    public final Object l0(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1914a0)) {
            return AbstractC1888A.f15640d;
        }
        if (((obj instanceof C1902O) || (obj instanceof h0)) && !(obj instanceof C1932o) && !(obj2 instanceof C1936s)) {
            InterfaceC1914a0 interfaceC1914a0 = (InterfaceC1914a0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15714c;
            Object c1916b0 = obj2 instanceof InterfaceC1914a0 ? new C1916b0((InterfaceC1914a0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1914a0, c1916b0)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1914a0) {
                    return AbstractC1888A.f15642f;
                }
            }
            f0(obj2);
            I(interfaceC1914a0, obj2);
            return obj2;
        }
        InterfaceC1914a0 interfaceC1914a02 = (InterfaceC1914a0) obj;
        n0 R5 = R(interfaceC1914a02);
        if (R5 == null) {
            return AbstractC1888A.f15642f;
        }
        k0 k0Var = interfaceC1914a02 instanceof k0 ? (k0) interfaceC1914a02 : null;
        if (k0Var == null) {
            k0Var = new k0(R5, null);
        }
        synchronized (k0Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k0.f15709e;
            if (atomicIntegerFieldUpdater.get(k0Var) != 0) {
                return AbstractC1888A.f15640d;
            }
            atomicIntegerFieldUpdater.set(k0Var, 1);
            if (k0Var != interfaceC1914a02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f15714c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1914a02, k0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1914a02) {
                        return AbstractC1888A.f15642f;
                    }
                }
            }
            boolean c6 = k0Var.c();
            C1936s c1936s = obj2 instanceof C1936s ? (C1936s) obj2 : null;
            if (c1936s != null) {
                k0Var.a(c1936s.a);
            }
            Throwable b5 = c6 ? null : k0Var.b();
            if (b5 != null) {
                d0(R5, b5);
            }
            C1932o c02 = c0(R5);
            if (c02 != null && m0(k0Var, c02, obj2)) {
                return AbstractC1888A.f15641e;
            }
            R5.b(new C4.i(2), 2);
            C1932o c03 = c0(R5);
            return (c03 == null || !m0(k0Var, c03, obj2)) ? K(k0Var, obj2) : AbstractC1888A.f15641e;
        }
    }

    public final boolean m0(k0 k0Var, C1932o c1932o, Object obj) {
        while (AbstractC1888A.u(c1932o.f15719h, false, new j0(this, k0Var, c1932o, obj)) == p0.f15721c) {
            c1932o = c0(c1932o);
            if (c1932o == null) {
                return false;
            }
        }
        return true;
    }

    @Override // b4.InterfaceC0910h
    public final Object q(Object obj, l4.e eVar) {
        return eVar.m(obj, this);
    }

    @Override // b4.InterfaceC0910h
    public final InterfaceC0908f r(InterfaceC0909g interfaceC0909g) {
        return Y4.d.F(this, interfaceC0909g);
    }

    @Override // x4.InterfaceC1922e0
    public final InterfaceC1931n s(l0 l0Var) {
        C1932o c1932o = new C1932o(l0Var);
        c1932o.f15698g = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f15714c;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1902O) {
                C1902O c1902o = (C1902O) obj;
                if (c1902o.f15662c) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1932o)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                h0(c1902o);
            } else {
                boolean z5 = obj instanceof InterfaceC1914a0;
                p0 p0Var = p0.f15721c;
                if (!z5) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C1936s c1936s = obj2 instanceof C1936s ? (C1936s) obj2 : null;
                    c1932o.k(c1936s != null ? c1936s.a : null);
                    return p0Var;
                }
                n0 e6 = ((InterfaceC1914a0) obj).e();
                if (e6 == null) {
                    AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    i0((h0) obj);
                } else if (!e6.b(c1932o, 7)) {
                    boolean b5 = e6.b(c1932o, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof k0) {
                        r4 = ((k0) obj3).b();
                    } else {
                        C1936s c1936s2 = obj3 instanceof C1936s ? (C1936s) obj3 : null;
                        if (c1936s2 != null) {
                            r4 = c1936s2.a;
                        }
                    }
                    c1932o.k(r4);
                    if (b5) {
                        break loop0;
                    }
                    return p0Var;
                }
            }
        }
        return c1932o;
    }

    @Override // x4.InterfaceC1922e0
    public final boolean start() {
        int j02;
        do {
            j02 = j0(f15714c.get(this));
            if (j02 == 0) {
                return false;
            }
        } while (j02 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(b0() + '{' + k0(f15714c.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC1888A.q(this));
        return sb.toString();
    }

    public void v(Object obj) {
    }

    public void x(Object obj) {
        v(obj);
    }

    @Override // x4.InterfaceC1922e0
    public final CancellationException y() {
        CancellationException cancellationException;
        Object obj = f15714c.get(this);
        if (!(obj instanceof k0)) {
            if (obj instanceof InterfaceC1914a0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C1936s)) {
                return new f0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C1936s) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new f0(F(), th, this) : cancellationException;
        }
        Throwable b5 = ((k0) obj).b();
        if (b5 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = b5 instanceof CancellationException ? (CancellationException) b5 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = F();
        }
        return new f0(concat, b5, this);
    }
}
