package B0;

import H0.AbstractC0157l;
import H0.w0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.C0912j;
import b4.InterfaceC0905c;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import java.util.ArrayList;
import x4.AbstractC1888A;
import x4.C1928k;
import x4.s0;

/* loaded from: classes.dex */
public final class X extends AbstractC1040q implements D, InterfaceC0961c, w0 {

    /* renamed from: A, reason: collision with root package name */
    public long f422A;

    /* renamed from: r, reason: collision with root package name */
    public Object f423r;

    /* renamed from: s, reason: collision with root package name */
    public Object f424s;

    /* renamed from: t, reason: collision with root package name */
    public PointerInputEventHandler f425t;

    /* renamed from: u, reason: collision with root package name */
    public s0 f426u;

    /* renamed from: v, reason: collision with root package name */
    public C0040p f427v = Q.a;

    /* renamed from: w, reason: collision with root package name */
    public final V.e f428w;

    /* renamed from: x, reason: collision with root package name */
    public final V.e f429x;

    /* renamed from: y, reason: collision with root package name */
    public final V.e f430y;

    /* renamed from: z, reason: collision with root package name */
    public C0040p f431z;

    public X(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f423r = obj;
        this.f424s = obj2;
        this.f425t = pointerInputEventHandler;
        V.e eVar = new V.e(new V[16]);
        this.f428w = eVar;
        this.f429x = eVar;
        this.f430y = new V.e(new V[16]);
        this.f422A = 0L;
    }

    @Override // h0.AbstractC1040q
    public final void F0() {
        O0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // H0.w0
    public final void L() {
        C0040p c0040p = this.f431z;
        if (c0040p == null) {
            return;
        }
        ?? r12 = c0040p.a;
        int size = r12.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (((y) r12.get(i6)).f484d) {
                ArrayList arrayList = new ArrayList(r12.size());
                int size2 = r12.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    y yVar = (y) r12.get(i7);
                    long j3 = yVar.a;
                    long j4 = yVar.f483c;
                    long j5 = yVar.f482b;
                    float f6 = yVar.f485e;
                    boolean z5 = yVar.f484d;
                    arrayList.add(new y(j3, j5, j4, false, f6, j5, j4, z5, z5, yVar.f489i, 0L));
                }
                C0040p c0040p2 = new C0040p(arrayList, null);
                this.f427v = c0040p2;
                N0(c0040p2, EnumC0041q.f475c);
                N0(c0040p2, EnumC0041q.f476e);
                N0(c0040p2, EnumC0041q.f477f);
                this.f431z = null;
                return;
            }
        }
    }

    public final Object M0(l4.e eVar, InterfaceC0905c interfaceC0905c) {
        C1928k c1928k = new C1928k(1, Y4.d.K(interfaceC0905c));
        c1928k.t();
        V v5 = new V(this, c1928k);
        synchronized (this.f429x) {
            this.f428w.b(v5);
            new C0912j(Y4.d.K(Y4.d.x(v5, v5, eVar))).k(X3.y.a);
        }
        c1928k.v(new G(v5, 1));
        return c1928k.s();
    }

    public final void N0(C0040p c0040p, EnumC0041q enumC0041q) {
        C1928k c1928k;
        C1928k c1928k2;
        synchronized (this.f429x) {
            V.e eVar = this.f430y;
            eVar.c(eVar.f8761f, this.f428w);
        }
        try {
            int ordinal = enumC0041q.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    V.e eVar2 = this.f430y;
                    int i6 = eVar2.f8761f - 1;
                    Object[] objArr = eVar2.f8759c;
                    if (i6 < objArr.length) {
                        while (i6 >= 0) {
                            V v5 = (V) objArr[i6];
                            if (enumC0041q == v5.f417g && (c1928k2 = v5.f416f) != null) {
                                v5.f416f = null;
                                c1928k2.k(c0040p);
                            }
                            i6--;
                        }
                    }
                    this.f430y.g();
                }
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
            }
            V.e eVar3 = this.f430y;
            Object[] objArr2 = eVar3.f8759c;
            int i7 = eVar3.f8761f;
            for (int i8 = 0; i8 < i7; i8++) {
                V v6 = (V) objArr2[i8];
                if (enumC0041q == v6.f417g && (c1928k = v6.f416f) != null) {
                    v6.f416f = null;
                    c1928k.k(c0040p);
                }
            }
            this.f430y.g();
        } catch (Throwable th) {
            this.f430y.g();
            throw th;
        }
    }

    public final void O0() {
        s0 s0Var = this.f426u;
        if (s0Var != null) {
            s0Var.C(new E0.b("Pointer input was reset", 0));
            this.f426u = null;
        }
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return AbstractC0157l.v(this).f1714C.a();
    }

    @Override // H0.InterfaceC0155j, H0.w0
    public final void b() {
        O0();
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return AbstractC0157l.v(this).f1714C.b0();
    }

    @Override // H0.w0
    public final void t0() {
        O0();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // H0.w0
    public final void w(C0040p c0040p, EnumC0041q enumC0041q, long j3) {
        this.f422A = j3;
        if (enumC0041q == EnumC0041q.f475c) {
            this.f427v = c0040p;
        }
        if (this.f426u == null) {
            this.f426u = AbstractC1888A.y(A0(), null, new W(this, null), 1);
        }
        N0(c0040p, enumC0041q);
        ?? r42 = c0040p.a;
        int size = r42.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                c0040p = null;
                break;
            } else if (!AbstractC0047x.d((y) r42.get(i6))) {
                break;
            } else {
                i6++;
            }
        }
        this.f431z = c0040p;
    }
}
