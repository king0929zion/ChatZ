package w3;

import X3.y;
import java.util.concurrent.CancellationException;
import m4.AbstractC1277l;
import x4.g0;

/* loaded from: classes.dex */
public final class j extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g0 f15434f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(g0 g0Var, int i6) {
        super(1);
        this.f15433e = i6;
        this.f15434f = g0Var;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f15433e) {
            case 0:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    this.f15434f.C(new CancellationException(th.getMessage()));
                }
                return y.a;
            default:
                this.f15434f.n0();
                return y.a;
        }
    }
}
