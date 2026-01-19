package N;

import F0.InterfaceC0134w;
import H0.i0;
import S0.L;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f3583c = new m(null, null);
    public final InterfaceC0134w a;

    /* renamed from: b, reason: collision with root package name */
    public final L f3584b;

    public m(InterfaceC0134w interfaceC0134w, L l3) {
        this.a = interfaceC0134w;
        this.f3584b = l3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [F0.w] */
    public static m a(m mVar, i0 i0Var, L l3, int i6) {
        i0 i0Var2 = i0Var;
        if ((i6 & 1) != 0) {
            i0Var2 = mVar.a;
        }
        if ((i6 & 2) != 0) {
            l3 = mVar.f3584b;
        }
        return new m(i0Var2, l3);
    }
}
