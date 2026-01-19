package Q;

import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final /* synthetic */ class M0 implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5364c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ F0.k0 f5365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5366f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5367g;

    public /* synthetic */ M0(int i6, int i7, F0.k0 k0Var) {
        this.f5364c = 0;
        this.f5366f = i6;
        this.f5365e = k0Var;
        this.f5367g = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f5364c) {
            case 0:
                ((F0.j0) obj).h(this.f5365e, AbstractC1410a.K((this.f5366f - r0.f1485c) / 2.0f), AbstractC1410a.K((this.f5367g - r0.f1486e) / 2.0f), S.l.f7374V);
                break;
            case 1:
                ((F0.j0) obj).h(this.f5365e, this.f5366f, this.f5367g, S.l.f7374V);
                break;
            default:
                ((F0.j0) obj).h(this.f5365e, this.f5366f, this.f5367g, S.l.f7374V);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ M0(F0.k0 k0Var, int i6, int i7, int i8) {
        this.f5364c = i8;
        this.f5365e = k0Var;
        this.f5366f = i6;
        this.f5367g = i7;
    }
}
