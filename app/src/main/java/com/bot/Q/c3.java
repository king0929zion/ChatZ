package Q;

import m4.InterfaceC1272g;

/* loaded from: classes.dex */
public final /* synthetic */ class c3 implements o0.t, InterfaceC1272g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4.j f5732c;

    public c3(C4.j jVar) {
        this.f5732c = jVar;
    }

    @Override // o0.t
    public final long a() {
        return ((o0.s) this.f5732c.get()).a;
    }

    @Override // m4.InterfaceC1272g
    public final X3.e b() {
        return this.f5732c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0.t) || !(obj instanceof InterfaceC1272g)) {
            return false;
        }
        return this.f5732c.equals(((InterfaceC1272g) obj).b());
    }

    public final int hashCode() {
        return this.f5732c.hashCode();
    }
}
