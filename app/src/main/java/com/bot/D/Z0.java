package D;

import T.C0599c0;
import T.C0601d0;
import T.C0602e;
import T.C0607g0;
import i4.AbstractC1117a;
import n0.C1354c;

/* loaded from: classes.dex */
public final class Z0 {

    /* renamed from: g, reason: collision with root package name */
    public static final e0.k f967g = e0.l.b(new B4.z(4), new A2.a(12));
    public final C0599c0 a;

    /* renamed from: b, reason: collision with root package name */
    public final C0599c0 f968b = new C0599c0(S.l.f7374V);

    /* renamed from: c, reason: collision with root package name */
    public final C0601d0 f969c = new C0601d0(0);

    /* renamed from: d, reason: collision with root package name */
    public C1354c f970d = C1354c.f13294e;

    /* renamed from: e, reason: collision with root package name */
    public long f971e = S0.O.f7610b;

    /* renamed from: f, reason: collision with root package name */
    public final C0607g0 f972f;

    public Z0(r.X0 x02, float f6) {
        this.a = new C0599c0(f6);
        this.f972f = new C0607g0(x02, C0602e.f8083j);
    }

    public final void a(r.X0 x02, C1354c c1354c, int i6, int i7) {
        float f6 = i7 - i6;
        this.f968b.h(f6);
        float f7 = c1354c.a;
        float f8 = c1354c.f13295b;
        C1354c c1354c2 = this.f970d;
        float f9 = c1354c2.a;
        C0599c0 c0599c0 = this.a;
        if (f7 != f9 || f8 != c1354c2.f13295b) {
            boolean z5 = x02 == r.X0.f14183c;
            if (z5) {
                f7 = f8;
            }
            float f10 = z5 ? c1354c.f13297d : c1354c.f13296c;
            float g3 = c0599c0.g();
            float f11 = i6;
            float f12 = g3 + f11;
            c0599c0.h(c0599c0.g() + ((f10 <= f12 && (f7 >= g3 || f10 - f7 <= f11)) ? (f7 >= g3 || f10 - f7 > f11) ? 0.0f : f7 - g3 : f10 - f12));
            this.f970d = c1354c;
        }
        c0599c0.h(AbstractC1117a.e(c0599c0.g(), S.l.f7374V, f6));
        this.f969c.h(i6);
    }
}
