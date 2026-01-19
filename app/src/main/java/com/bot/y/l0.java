package y;

import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements InterfaceC1193a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15890c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f15891e;

    public /* synthetic */ l0(n0 n0Var, int i6) {
        this.f15890c = i6;
        this.f15891e = n0Var;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        switch (this.f15890c) {
            case 0:
                return Float.valueOf(this.f15891e.f15899s.b());
            case 1:
                return Float.valueOf(this.f15891e.f15899s.d());
            default:
                n0 n0Var = this.f15891e;
                return Float.valueOf(n0Var.f15899s.a() - n0Var.f15899s.c());
        }
    }
}
