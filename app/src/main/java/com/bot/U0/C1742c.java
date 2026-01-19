package u0;

import m4.AbstractC1276k;
import m4.AbstractC1277l;
import x4.AbstractC1888A;
import x4.s0;
import x4.t0;
import z3.AbstractC2026D;
import z3.C2035e;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1742c extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15009e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f15010f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1742c(Object obj, int i6) {
        super(1);
        this.f15009e = i6;
        this.f15010f = obj;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f15009e) {
            case 0:
                AbstractC1739D abstractC1739D = (AbstractC1739D) obj;
                C1743d c1743d = (C1743d) this.f15010f;
                c1743d.g(abstractC1739D);
                l4.c cVar = c1743d.f15018i;
                if (cVar != null) {
                    cVar.f(abstractC1739D);
                }
                return X3.y.a;
            case 1:
                Q4.A a = (Q4.A) this.f15010f;
                if (a != null) {
                    a.close();
                }
                return X3.y.a;
            case 2:
                ((U4.i) this.f15010f).d();
                return X3.y.a;
            case 3:
                C2035e c2035e = (C2035e) obj;
                AbstractC1276k.f(c2035e, "$this$install");
                ((A2.a) this.f15010f).f(c2035e);
                return X3.y.a;
            case 4:
                Throwable th = (Throwable) obj;
                t0 t0Var = (t0) this.f15010f;
                if (th != null) {
                    AbstractC2026D.a.c("Cancelling request because engine Job failed with error: " + th);
                    t0Var.f(AbstractC1888A.a("Engine failed", th));
                } else {
                    AbstractC2026D.a.c("Cancelling request because engine Job completed");
                    t0Var.n0();
                }
                return X3.y.a;
            default:
                ((s0) this.f15010f).f(null);
                return X3.y.a;
        }
    }
}
