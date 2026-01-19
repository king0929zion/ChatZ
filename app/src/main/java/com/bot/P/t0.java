package p;

import F0.InterfaceC0134w;
import l4.InterfaceC1193a;
import n0.C1353b;

/* loaded from: classes.dex */
public final /* synthetic */ class t0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13797c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v0 f13798e;

    public /* synthetic */ t0(v0 v0Var, int i6) {
        this.f13797c = i6;
        this.f13798e = v0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f13797c) {
            case 0:
                this.f13798e.O0();
                return X3.y.a;
            case 1:
                return new C1353b(this.f13798e.f13822z);
            default:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) this.f13798e.f13820x.getValue();
                return new C1353b(interfaceC0134w != null ? interfaceC0134w.U(0L) : 9205357640488583168L);
        }
    }
}
