package T;

import D.C0056a;
import D.C0086p;
import H0.C0158m;
import android.util.Log;
import b0.C0868a;
import b4.InterfaceC0910h;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.C0979b;
import f0.C0984g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import m4.AbstractC1276k;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.C1940w;
import x4.InterfaceC1922e0;
import x4.InterfaceC1927j;

/* renamed from: T.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642y0 extends AbstractC0633u {
    public final I0.Z a;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f8271b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8272c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1922e0 f8273d;

    /* renamed from: e, reason: collision with root package name */
    public Throwable f8274e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8275f;

    /* renamed from: g, reason: collision with root package name */
    public Object f8276g;

    /* renamed from: h, reason: collision with root package name */
    public k.N f8277h;

    /* renamed from: i, reason: collision with root package name */
    public final V.e f8278i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f8279j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f8280k;

    /* renamed from: l, reason: collision with root package name */
    public final k.M f8281l;

    /* renamed from: m, reason: collision with root package name */
    public final M.q f8282m;

    /* renamed from: n, reason: collision with root package name */
    public final k.M f8283n;

    /* renamed from: o, reason: collision with root package name */
    public final k.M f8284o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f8285p;

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashSet f8286q;

    /* renamed from: r, reason: collision with root package name */
    public C1928k f8287r;

    /* renamed from: s, reason: collision with root package name */
    public A3.c f8288s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8289t;

    /* renamed from: u, reason: collision with root package name */
    public final A4.g0 f8290u;

    /* renamed from: v, reason: collision with root package name */
    public final C0158m f8291v;

    /* renamed from: w, reason: collision with root package name */
    public final x4.g0 f8292w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC0910h f8293x;

    /* renamed from: y, reason: collision with root package name */
    public final C0602e f8294y;

    /* renamed from: z, reason: collision with root package name */
    public static final A4.g0 f8270z = A4.W.b(Z.b.f9846g);

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicReference f8269A = new AtomicReference(Boolean.FALSE);

    public C0642y0(InterfaceC0910h interfaceC0910h) {
        I0.Z z5 = new I0.Z(new C0628r0(this, 0));
        this.a = z5;
        this.f8271b = new C0158m(new C0628r0(this, 1));
        this.f8272c = new Object();
        this.f8275f = new ArrayList();
        this.f8277h = new k.N();
        this.f8278i = new V.e(new C0639x[16]);
        this.f8279j = new ArrayList();
        this.f8280k = new ArrayList();
        this.f8281l = new k.M();
        this.f8282m = new M.q(22);
        this.f8283n = new k.M();
        this.f8284o = new k.M();
        this.f8290u = A4.W.b(EnumC0630s0.f8207f);
        this.f8291v = new C0158m(8);
        x4.g0 g0Var = new x4.g0((InterfaceC1922e0) interfaceC0910h.r(C1940w.f15731e));
        g0Var.S(new C0056a(this, 28));
        this.f8292w = g0Var;
        this.f8293x = interfaceC0910h.Y(z5).Y(g0Var);
        this.f8294y = new C0602e(9);
    }

    public static final void G(ArrayList arrayList, C0642y0 c0642y0, C0639x c0639x) {
        arrayList.clear();
        synchronized (c0642y0.f8272c) {
            Iterator it = c0642y0.f8280k.iterator();
            if (it.hasNext()) {
                ((W) it.next()).getClass();
                throw null;
            }
        }
    }

    public static void w(C0979b c0979b) {
        try {
            if (c0979b.w() instanceof C0984g) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c0979b.c();
        }
    }

    public final boolean A() {
        return this.f8278i.f8761f != 0 || z() || B() || this.f8281l.j();
    }

    public final boolean B() {
        return !this.f8289t && (((C0868a) ((E1.b) this.f8271b.f1973f).f1293c).get() & 134217727) > 0;
    }

    public final boolean C() {
        boolean z5;
        synchronized (this.f8272c) {
            if (!this.f8277h.h() && this.f8278i.f8761f == 0 && !z()) {
                z5 = B();
            }
        }
        return z5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final List D() {
        ?? r02 = this.f8276g;
        if (r02 != 0) {
            return r02;
        }
        ArrayList arrayList = this.f8275f;
        List arrayList2 = arrayList.isEmpty() ? Y3.v.f9812c : new ArrayList(arrayList);
        this.f8276g = arrayList2;
        return arrayList2;
    }

    public final void E() {
        InterfaceC1927j y5;
        synchronized (this.f8272c) {
            y5 = y();
            if (((EnumC0630s0) this.f8290u.getValue()).compareTo(EnumC0630s0.f8206e) <= 0) {
                throw AbstractC1888A.a("Recomposer shutdown; frame clock awaiter will never resume", this.f8274e);
            }
        }
        if (y5 != null) {
            ((C1928k) y5).k(X3.y.a);
        }
    }

    public final void F(C0639x c0639x) {
        synchronized (this.f8272c) {
            ArrayList arrayList = this.f8280k;
            if (arrayList.size() > 0) {
                ((W) arrayList.get(0)).getClass();
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x013b, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0140, code lost:
    
        if (r4 >= r3) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014a, code lost:
    
        if (((X3.i) r10.get(r4)).f9394e == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x014c, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x014f, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x015d, code lost:
    
        if (r8 >= r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015f, code lost:
    
        r11 = (X3.i) r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0167, code lost:
    
        if (r11.f9394e != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0169, code lost:
    
        r11 = (T.W) r11.f9393c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0173, code lost:
    
        r4 = r17.f8272c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0175, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0176, code lost:
    
        Y3.r.c0(r3, r17.f8280k);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017b, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:
    
        if (r8 >= r4) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x018c, code lost:
    
        r11 = r10.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0195, code lost:
    
        if (((X3.i) r11).f9394e == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0197, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x019a, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x019d, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List H(java.util.List r18, k.N r19) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T.C0642y0.H(java.util.List, k.N):java.util.List");
    }

    public final C0639x I(C0639x c0639x, k.N n3) {
        C0979b C5;
        if (c0639x.f8255y.f8150F || c0639x.f8256z == 3) {
            return null;
        }
        LinkedHashSet linkedHashSet = this.f8286q;
        if (linkedHashSet == null || !linkedHashSet.contains(c0639x)) {
            C0056a c0056a = new C0056a(c0639x, 27);
            C0086p c0086p = new C0086p(25, c0639x, n3);
            AbstractC0983f j3 = AbstractC0992o.j();
            C0979b c0979b = j3 instanceof C0979b ? (C0979b) j3 : null;
            if (c0979b == null || (C5 = c0979b.C(c0056a, c0086p)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0983f j4 = C5.j();
                if (n3 != null) {
                    try {
                        if (n3.h()) {
                            D.r rVar = new D.r(25, n3, c0639x);
                            C0626q c0626q = c0639x.f8255y;
                            if (c0626q.f8150F) {
                                AbstractC0629s.a("Preparing a composition while composing is not supported");
                            }
                            c0626q.f8150F = true;
                            try {
                                rVar.b();
                                c0626q.f8150F = false;
                            } catch (Throwable th) {
                                c0626q.f8150F = false;
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC0983f.q(j4);
                        throw th2;
                    }
                }
                boolean x5 = c0639x.x();
                AbstractC0983f.q(j4);
                if (x5) {
                    return c0639x;
                }
            } finally {
                w(C5);
            }
        }
        return null;
    }

    public final void J(Throwable th, C0639x c0639x) {
        if (!((Boolean) f8269A.get()).booleanValue() || (th instanceof C0614k)) {
            synchronized (this.f8272c) {
                Log.e("ComposeInternal", "Error was captured in composition.", th);
                A3.c cVar = this.f8288s;
                if (cVar != null) {
                    throw ((Throwable) cVar.f119e);
                }
                this.f8288s = new A3.c(th, 22);
            }
            throw th;
        }
        synchronized (this.f8272c) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th);
                this.f8279j.clear();
                this.f8278i.g();
                this.f8277h = new k.N();
                this.f8280k.clear();
                this.f8281l.a();
                this.f8283n.a();
                this.f8288s = new A3.c(th, 22);
                if (c0639x != null) {
                    L(c0639x);
                }
                y();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean K() {
        boolean A5;
        synchronized (this.f8272c) {
            if (this.f8277h.g()) {
                return A();
            }
            List D4 = D();
            V.h hVar = new V.h(this.f8277h);
            this.f8277h = new k.N();
            try {
                int size = D4.size();
                for (int i6 = 0; i6 < size; i6++) {
                    ((C0639x) D4.get(i6)).y(hVar);
                    if (((EnumC0630s0) this.f8290u.getValue()).compareTo(EnumC0630s0.f8206e) <= 0) {
                        break;
                    }
                }
                synchronized (this.f8272c) {
                    if (y() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    A5 = A();
                }
                return A5;
            } catch (Throwable th) {
                synchronized (this.f8272c) {
                    k.N n3 = this.f8277h;
                    n3.getClass();
                    Iterator<E> it = hVar.iterator();
                    while (it.hasNext()) {
                        n3.j(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    public final void L(C0639x c0639x) {
        ArrayList arrayList = this.f8285p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f8285p = arrayList;
        }
        if (!arrayList.contains(c0639x)) {
            arrayList.add(c0639x);
        }
        if (this.f8275f.remove(c0639x)) {
            this.f8276g = null;
        }
    }

    @Override // T.AbstractC0633u
    public final void a(C0639x c0639x, l4.e eVar) {
        EnumC0630s0 enumC0630s0;
        boolean contains;
        C0979b C5;
        boolean z5 = c0639x.f8255y.f8150F;
        synchronized (this.f8272c) {
            EnumC0630s0 enumC0630s02 = (EnumC0630s0) this.f8290u.getValue();
            enumC0630s0 = EnumC0630s0.f8206e;
            contains = enumC0630s02.compareTo(enumC0630s0) > 0 ? true ^ D().contains(c0639x) : true;
        }
        try {
            C0056a c0056a = new C0056a(c0639x, 27);
            C0086p c0086p = new C0086p(25, c0639x, null);
            AbstractC0983f j3 = AbstractC0992o.j();
            C0979b c0979b = j3 instanceof C0979b ? (C0979b) j3 : null;
            if (c0979b == null || (C5 = c0979b.C(c0056a, c0086p)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                AbstractC0983f j4 = C5.j();
                try {
                    c0639x.j(eVar);
                    synchronized (this.f8272c) {
                        if (((EnumC0630s0) this.f8290u.getValue()).compareTo(enumC0630s0) > 0 && !D().contains(c0639x)) {
                            this.f8275f.add(c0639x);
                            this.f8276g = null;
                        }
                    }
                    if (!z5) {
                        AbstractC0992o.j().m();
                    }
                    try {
                        F(c0639x);
                        try {
                            c0639x.d();
                            c0639x.f();
                            if (z5) {
                                return;
                            }
                            AbstractC0992o.j().m();
                        } catch (Throwable th) {
                            J(th, null);
                        }
                    } catch (Throwable th2) {
                        J(th2, c0639x);
                    }
                } finally {
                    AbstractC0983f.q(j4);
                }
            } finally {
                w(C5);
            }
        } catch (Throwable th3) {
            if (contains) {
                synchronized (this.f8272c) {
                }
            }
            J(th3, c0639x);
        }
    }

    @Override // T.AbstractC0633u
    public final k.N b(C0639x c0639x, G0 g02, l4.e eVar) {
        C0158m c0158m = this.f8291v;
        try {
            G0 g03 = c0639x.f8249s;
            c0639x.f8249s = g02;
            try {
                a(c0639x, eVar);
                k.N n3 = (k.N) c0158m.e();
                if (n3 == null) {
                    n3 = k.W.a;
                    AbstractC1276k.d(n3, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return n3;
            } finally {
                c0639x.f8249s = g03;
            }
        } finally {
            c0158m.o(null);
        }
    }

    @Override // T.AbstractC0633u
    public final boolean d() {
        return ((Boolean) f8269A.get()).booleanValue();
    }

    @Override // T.AbstractC0633u
    public final boolean e() {
        return false;
    }

    @Override // T.AbstractC0633u
    public final boolean f() {
        return false;
    }

    @Override // T.AbstractC0633u
    public final long g() {
        return 1000;
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0631t h() {
        return null;
    }

    @Override // T.AbstractC0633u
    public final InterfaceC0910h j() {
        return this.f8293x;
    }

    @Override // T.AbstractC0633u
    public final boolean k() {
        return false;
    }

    @Override // T.AbstractC0633u
    public final void l(C0639x c0639x) {
        InterfaceC1927j interfaceC1927j;
        synchronized (this.f8272c) {
            if (this.f8278i.h(c0639x)) {
                interfaceC1927j = null;
            } else {
                this.f8278i.b(c0639x);
                interfaceC1927j = y();
            }
        }
        if (interfaceC1927j != null) {
            ((C1928k) interfaceC1927j).k(X3.y.a);
        }
    }

    @Override // T.AbstractC0633u
    public final V m(W w5) {
        V v5;
        synchronized (this.f8272c) {
            v5 = (V) this.f8283n.k(w5);
        }
        return v5;
    }

    @Override // T.AbstractC0633u
    public final k.N n(C0639x c0639x, G0 g02, k.N n3) {
        C0158m c0158m = this.f8291v;
        try {
            K();
            c0639x.y(new V.h(n3));
            G0 g03 = c0639x.f8249s;
            c0639x.f8249s = g02;
            try {
                C0639x I5 = I(c0639x, null);
                if (I5 != null) {
                    F(c0639x);
                    I5.d();
                    I5.f();
                }
                k.N n5 = (k.N) c0158m.e();
                if (n5 == null) {
                    n5 = k.W.a;
                    AbstractC1276k.d(n5, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
                }
                return n5;
            } finally {
                c0639x.f8249s = g03;
            }
        } finally {
            c0158m.o(null);
        }
    }

    @Override // T.AbstractC0633u
    public final void o(Set set) {
    }

    @Override // T.AbstractC0633u
    public final void q(C0627q0 c0627q0) {
        C0158m c0158m = this.f8291v;
        k.N n3 = (k.N) c0158m.e();
        if (n3 == null) {
            k.N n5 = k.W.a;
            n3 = new k.N();
            c0158m.o(n3);
        }
        n3.a(c0627q0);
    }

    @Override // T.AbstractC0633u
    public final void r(C0639x c0639x) {
        synchronized (this.f8272c) {
            try {
                LinkedHashSet linkedHashSet = this.f8286q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f8286q = linkedHashSet;
                }
                linkedHashSet.add(c0639x);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T.Z, java.lang.Object, b0.b] */
    @Override // T.AbstractC0633u
    public final InterfaceC0604f s(A0.b bVar) {
        C0158m c0158m = this.f8271b;
        E1.b bVar2 = (E1.b) c0158m.f1973f;
        ?? obj = new Object();
        obj.a = bVar;
        return bVar2.f(obj, (D.r) c0158m.f1974g);
    }

    @Override // T.AbstractC0633u
    public final void v(C0639x c0639x) {
        synchronized (this.f8272c) {
            if (this.f8275f.remove(c0639x)) {
                this.f8276g = null;
            }
            this.f8278i.j(c0639x);
            this.f8279j.remove(c0639x);
        }
    }

    public final void x() {
        synchronized (this.f8272c) {
            if (((EnumC0630s0) this.f8290u.getValue()).compareTo(EnumC0630s0.f8209h) >= 0) {
                A4.g0 g0Var = this.f8290u;
                EnumC0630s0 enumC0630s0 = EnumC0630s0.f8206e;
                g0Var.getClass();
                g0Var.l(null, enumC0630s0);
            }
        }
        this.f8292w.f(null);
    }

    public final InterfaceC1927j y() {
        A4.g0 g0Var = this.f8290u;
        int compareTo = ((EnumC0630s0) g0Var.getValue()).compareTo(EnumC0630s0.f8206e);
        ArrayList arrayList = this.f8280k;
        ArrayList arrayList2 = this.f8279j;
        V.e eVar = this.f8278i;
        if (compareTo > 0) {
            A3.c cVar = this.f8288s;
            EnumC0630s0 enumC0630s0 = EnumC0630s0.f8210i;
            EnumC0630s0 enumC0630s02 = EnumC0630s0.f8207f;
            if (cVar == null) {
                if (this.f8273d == null) {
                    this.f8277h = new k.N();
                    eVar.g();
                    if (z() || B()) {
                        enumC0630s02 = EnumC0630s0.f8208g;
                    }
                } else {
                    enumC0630s02 = (eVar.f8761f != 0 || this.f8277h.h() || !arrayList2.isEmpty() || !arrayList.isEmpty() || z() || B() || this.f8281l.j()) ? enumC0630s0 : EnumC0630s0.f8209h;
                }
            }
            g0Var.getClass();
            g0Var.l(null, enumC0630s02);
            if (enumC0630s02 != enumC0630s0) {
                return null;
            }
            C1928k c1928k = this.f8287r;
            this.f8287r = null;
            return c1928k;
        }
        List D4 = D();
        int size = D4.size();
        for (int i6 = 0; i6 < size; i6++) {
        }
        this.f8275f.clear();
        this.f8276g = Y3.v.f9812c;
        this.f8277h = new k.N();
        eVar.g();
        arrayList2.clear();
        arrayList.clear();
        this.f8285p = null;
        C1928k c1928k2 = this.f8287r;
        if (c1928k2 != null) {
            c1928k2.w(null);
        }
        this.f8287r = null;
        this.f8288s = null;
        return null;
    }

    public final boolean z() {
        return !this.f8289t && (((C0868a) ((E1.b) this.a.f2269f).f1293c).get() & 134217727) > 0;
    }
}
