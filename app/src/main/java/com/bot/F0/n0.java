package F0;

import m4.AbstractC1277l;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class n0 extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k0 f1498f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(k0 k0Var, int i6) {
        super(1);
        this.f1497e = i6;
        this.f1498f = k0Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1497e) {
            case 0:
                j0.m((j0) obj, this.f1498f, 0, 0);
                return X3.y.a;
            case 1:
                ((j0) obj).h(this.f1498f, 0, 0, S.l.f7374V);
                return X3.y.a;
            case 2:
                j0.l((j0) obj, this.f1498f, 0, 0);
                return X3.y.a;
            case 3:
                j0.l((j0) obj, this.f1498f, 0, 0);
                return X3.y.a;
            case 4:
                ((j0) obj).h(this.f1498f, 0, 0, S.l.f7374V);
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                ((j0) obj).h(this.f1498f, 0, 0, S.l.f7374V);
                return X3.y.a;
            default:
                ((j0) obj).h(this.f1498f, 0, 0, S.l.f7374V);
                return X3.y.a;
        }
    }
}
