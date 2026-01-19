package F0;

import H0.AbstractC0157l;
import H0.C0149f0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import h0.AbstractC1040q;
import k.AbstractC1169p;
import k.C1148B;

/* loaded from: classes.dex */
public final class N implements t0 {
    public final C1148B a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f1435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1436c;

    public N(Q q3, Object obj) {
        this.f1435b = q3;
        this.f1436c = obj;
        int[] iArr = AbstractC1169p.a;
        this.a = new C1148B();
    }

    @Override // F0.t0
    public final int a() {
        H0.J j3 = (H0.J) this.f1435b.f1451m.g(this.f1436c);
        if (j3 != null) {
            return ((V.e) ((V.b) j3.n()).f8751e).f8761f;
        }
        return 0;
    }

    @Override // F0.t0
    public final void b(long j3, int i6) {
        Q q3 = this.f1435b;
        H0.J j4 = (H0.J) q3.f1451m.g(this.f1436c);
        if (j4 == null || !j4.H()) {
            return;
        }
        int i7 = ((V.e) ((V.b) j4.n()).f8751e).f8761f;
        if (i6 < 0 || i6 >= i7) {
            E0.a.d("Index (" + i6 + ") is out of bound of [0, " + i7 + ')');
        }
        if (j4.I()) {
            E0.a.a("Pre-measure called on node that is not placed");
        }
        H0.J j5 = q3.f1442c;
        j5.f1750u = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) H0.M.a(j4)).x((H0.J) ((V.b) j4.n()).get(i6), j3);
        j5.f1750u = false;
        this.a.a(i6);
    }

    @Override // F0.t0
    public final void c(I1.z zVar) {
        C0149f0 c0149f0;
        AbstractC1040q abstractC1040q;
        H0.J j3 = (H0.J) this.f1435b.f1451m.g(this.f1436c);
        if (j3 == null || (c0149f0 = j3.f1721J) == null || (abstractC1040q = c0149f0.f1919f) == null) {
            return;
        }
        AbstractC0157l.A(abstractC1040q, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", zVar);
    }

    @Override // F0.t0
    public final void dispose() {
        Q.a(this.f1435b, this.f1436c);
    }
}
