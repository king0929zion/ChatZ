package e3;

import H0.L;
import T.B0;
import T.C0607g0;
import T.r;
import X3.n;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import e1.m;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import m4.AbstractC1276k;
import n0.C1356e;
import o0.AbstractC1392c;
import o0.C1400k;
import o0.q;
import o4.AbstractC1410a;
import q0.C1496b;
import t0.AbstractC1688b;

/* renamed from: e3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0965b extends AbstractC1688b implements B0 {

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f11592h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f11593i;

    /* renamed from: j, reason: collision with root package name */
    public final C0607g0 f11594j;

    /* renamed from: k, reason: collision with root package name */
    public final n f11595k;

    public C0965b(Drawable drawable) {
        AbstractC1276k.f(drawable, "drawable");
        this.f11592h = drawable;
        this.f11593i = r.A(0);
        Object obj = AbstractC0967d.a;
        this.f11594j = r.A(new C1356e((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : AbstractC1120d.c(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f11595k = X3.a.d(new A0.b(this, 13));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // T.B0
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T.B0
    public final void b() {
        Drawable drawable = this.f11592h;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // t0.AbstractC1688b
    public final void c(float f6) {
        this.f11592h.setAlpha(AbstractC1117a.f(AbstractC1410a.K(f6 * 255), 0, 255));
    }

    @Override // t0.AbstractC1688b
    public final void d(C1400k c1400k) {
        this.f11592h.setColorFilter(c1400k != null ? c1400k.a : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // T.B0
    public final void e() {
        Drawable.Callback callback = (Drawable.Callback) this.f11595k.getValue();
        Drawable drawable = this.f11592h;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // t0.AbstractC1688b
    public final void f(m mVar) {
        int i6;
        AbstractC1276k.f(mVar, "layoutDirection");
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i6 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i6 = 0;
        }
        this.f11592h.setLayoutDirection(i6);
    }

    @Override // t0.AbstractC1688b
    public final long h() {
        return ((C1356e) this.f11594j.getValue()).a;
    }

    @Override // t0.AbstractC1688b
    public final void i(L l3) {
        C1496b c1496b = l3.f1765c;
        q g3 = c1496b.f13944e.g();
        ((Number) this.f11593i.getValue()).intValue();
        int K2 = AbstractC1410a.K(C1356e.d(c1496b.c()));
        int K5 = AbstractC1410a.K(C1356e.b(c1496b.c()));
        Drawable drawable = this.f11592h;
        drawable.setBounds(0, 0, K2, K5);
        try {
            g3.h();
            drawable.draw(AbstractC1392c.a(g3));
        } finally {
            g3.p();
        }
    }
}
