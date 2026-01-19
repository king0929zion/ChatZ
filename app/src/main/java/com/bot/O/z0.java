package O;

import F0.InterfaceC0134w;
import T.C0607g0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import k.AbstractC1171s;
import k.C1151E;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: l, reason: collision with root package name */
    public static final e0.k f4263l = new e0.k(0, new B4.z(8), new I2.x(25));
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4264b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C1151E f4265c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f4266d;

    /* renamed from: e, reason: collision with root package name */
    public O f4267e;

    /* renamed from: f, reason: collision with root package name */
    public C0319l0 f4268f;

    /* renamed from: g, reason: collision with root package name */
    public C0321m0 f4269g;

    /* renamed from: h, reason: collision with root package name */
    public L f4270h;

    /* renamed from: i, reason: collision with root package name */
    public O f4271i;

    /* renamed from: j, reason: collision with root package name */
    public O f4272j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f4273k;

    public z0(long j3) {
        C1151E c1151e = AbstractC1171s.a;
        this.f4265c = new C1151E();
        this.f4266d = new AtomicLong(j3);
        C1151E c1151e2 = AbstractC1171s.a;
        AbstractC1276k.d(c1151e2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.f4273k = T.r.A(c1151e2);
    }

    public final C1151E a() {
        return (C1151E) this.f4273k.getValue();
    }

    public final boolean b(InterfaceC0134w interfaceC0134w, long j3, long j4, H h3, boolean z5) {
        C0321m0 c0321m0 = this.f4269g;
        if (c0321m0 == null) {
            return true;
        }
        C0332s0 c0332s0 = c0321m0.f4155c;
        long a = c0332s0.a(interfaceC0134w, j3);
        long a6 = c0332s0.a(interfaceC0134w, j4);
        c0332s0.k(z5);
        return c0332s0.n(a, a6, false, h3);
    }

    public final ArrayList c(InterfaceC0134w interfaceC0134w) {
        boolean z5 = this.a;
        ArrayList arrayList = this.f4264b;
        if (!z5) {
            Y3.q.b0(arrayList, new y0(new B4.D(interfaceC0134w, 11), 0));
            this.a = true;
        }
        return arrayList;
    }

    public final void d(r rVar) {
        long j3 = rVar.a;
        C1151E c1151e = this.f4265c;
        if (c1151e.b(j3)) {
            this.f4264b.remove(rVar);
            long j4 = rVar.a;
            c1151e.g(j4);
            O o5 = this.f4272j;
            if (o5 != null) {
                o5.f(Long.valueOf(j4));
            }
        }
    }
}
