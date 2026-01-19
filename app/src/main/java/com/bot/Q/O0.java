package Q;

import I0.AbstractC0171a;
import T.C0607g0;
import T.C0626q;
import T.C0627q0;
import android.content.Context;

/* loaded from: classes.dex */
public final class O0 extends AbstractC0171a {

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f5452l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5453m;

    public O0(Context context) {
        super(context);
        this.f5452l = T.r.A(S.a);
    }

    @Override // I0.AbstractC0171a
    public final void b(int i6, C0626q c0626q) {
        c0626q.d0(576708319);
        int i7 = (c0626q.h(this) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            ((l4.e) this.f5452l.getValue()).m(c0626q, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new B4.D(i6, 13, this);
        }
    }

    @Override // I0.AbstractC0171a
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f5453m;
    }
}
