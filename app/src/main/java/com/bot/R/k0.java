package R;

import m4.InterfaceC1272g;

/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements InterfaceC1272g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4.j f6799c;

    public k0(C4.j jVar) {
        this.f6799c = jVar;
    }

    public final float a() {
        return ((Number) this.f6799c.get()).floatValue();
    }

    @Override // m4.InterfaceC1272g
    public final X3.e b() {
        return this.f6799c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k0) || obj == null) {
            return false;
        }
        return this.f6799c.equals(((InterfaceC1272g) obj).b());
    }

    public final int hashCode() {
        return this.f6799c.hashCode();
    }
}
