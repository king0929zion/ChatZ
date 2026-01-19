package I0;

import T.C0607g0;
import T.C0626q;
import T.C0627q0;
import com.bot.MainActivity;

/* renamed from: I0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0202p0 extends AbstractC0171a {

    /* renamed from: l, reason: collision with root package name */
    public final C0607g0 f2345l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2346m;

    public C0202p0(MainActivity mainActivity) {
        super(mainActivity);
        this.f2345l = T.r.A(null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // I0.AbstractC0171a
    public final void b(int i6, C0626q c0626q) {
        c0626q.d0(420213850);
        int i7 = (c0626q.h(this) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            l4.e eVar = (l4.e) this.f2345l.getValue();
            if (eVar == null) {
                c0626q.b0(-1238823553);
            } else {
                c0626q.b0(98585282);
                eVar.m(c0626q, 0);
            }
            c0626q.p(false);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new F0.B(this, i6, 2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C0202p0.class.getName();
    }

    @Override // I0.AbstractC0171a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2346m;
    }

    public final void setContent(l4.e eVar) {
        this.f2346m = true;
        this.f2345l.setValue(eVar);
        if (isAttachedToWindow()) {
            d();
        }
    }
}
