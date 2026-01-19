package C4;

import b4.InterfaceC0905c;
import b4.InterfaceC0910h;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import x4.AbstractC1888A;
import x4.AbstractC1896I;
import x4.AbstractC1908V;
import x4.AbstractC1939v;
import x4.C1936s;
import x4.v0;

/* loaded from: classes.dex */
public final class f extends AbstractC1896I implements d4.d, InterfaceC0905c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f688k = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1939v f689g;

    /* renamed from: h, reason: collision with root package name */
    public final d4.c f690h;

    /* renamed from: i, reason: collision with root package name */
    public Object f691i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f692j;

    public f(AbstractC1939v abstractC1939v, d4.c cVar) {
        super(-1);
        this.f689g = abstractC1939v;
        this.f690h = cVar;
        this.f691i = a.f678b;
        this.f692j = a.k(cVar.o());
    }

    @Override // x4.AbstractC1896I
    public final InterfaceC0905c c() {
        return this;
    }

    @Override // d4.d
    public final d4.d g() {
        return this.f690h;
    }

    @Override // x4.AbstractC1896I
    public final Object i() {
        Object obj = this.f691i;
        this.f691i = a.f678b;
        return obj;
    }

    @Override // b4.InterfaceC0905c
    public final void k(Object obj) {
        Throwable a = X3.l.a(obj);
        Object c1936s = a == null ? obj : new C1936s(a, false);
        d4.c cVar = this.f690h;
        InterfaceC0910h o5 = cVar.o();
        AbstractC1939v abstractC1939v = this.f689g;
        if (abstractC1939v.f0(o5)) {
            this.f691i = c1936s;
            this.f15657f = 0;
            abstractC1939v.d0(cVar.o(), this);
            return;
        }
        AbstractC1908V a6 = v0.a();
        if (a6.f15673f >= 4294967296L) {
            this.f691i = c1936s;
            this.f15657f = 0;
            a6.i0(this);
            return;
        }
        a6.k0(true);
        try {
            InterfaceC0910h o6 = cVar.o();
            Object l3 = a.l(o6, this.f692j);
            try {
                cVar.k(obj);
                do {
                } while (a6.m0());
            } finally {
                a.g(o6, l3);
            }
        } catch (Throwable th) {
            try {
                h(th);
            } finally {
                a6.h0(true);
            }
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return this.f690h.o();
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f689g + ", " + AbstractC1888A.E(this.f690h) + ']';
    }
}
