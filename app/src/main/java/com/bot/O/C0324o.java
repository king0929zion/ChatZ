package O;

import h0.InterfaceC1028e;
import i1.InterfaceC1078B;

/* renamed from: O.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324o implements InterfaceC1078B {

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1028e f4164c;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0331s f4165e;

    /* renamed from: f, reason: collision with root package name */
    public long f4166f = 0;

    public C0324o(InterfaceC1028e interfaceC1028e, InterfaceC0331s interfaceC0331s) {
        this.f4164c = interfaceC1028e;
        this.f4165e = interfaceC0331s;
    }

    @Override // i1.InterfaceC1078B
    public final long g(e1.k kVar, long j3, e1.m mVar, long j4) {
        long a = this.f4165e.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.f4166f;
        }
        this.f4166f = a;
        return e1.j.e(e1.j.e(kVar.c(), Y3.C.Q(a)), this.f4164c.a(j4, 0L, mVar));
    }
}
