package N;

import S0.F;
import S0.P;
import e1.AbstractC0960b;
import e1.C0959a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static b f3511h;
    public final e1.m a;

    /* renamed from: b, reason: collision with root package name */
    public final P f3512b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.d f3513c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.d f3514d;

    /* renamed from: e, reason: collision with root package name */
    public final P f3515e;

    /* renamed from: f, reason: collision with root package name */
    public float f3516f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f3517g = Float.NaN;

    public b(e1.m mVar, P p5, e1.d dVar, W0.d dVar2) {
        this.a = mVar;
        this.f3512b = p5;
        this.f3513c = dVar;
        this.f3514d = dVar2;
        this.f3515e = F.h(p5, mVar);
    }

    public final long a(long j3, int i6) {
        int i7;
        float f6 = this.f3517g;
        float f7 = this.f3516f;
        if (Float.isNaN(f6) || Float.isNaN(f7)) {
            String str = c.a;
            long b5 = AbstractC0960b.b(0, 0, 15);
            P p5 = this.f3515e;
            e1.d dVar = this.f3513c;
            float b6 = F.a(str, p5, b5, dVar, this.f3514d, 1, 96).b();
            float b7 = F.a(c.f3518b, this.f3515e, AbstractC0960b.b(0, 0, 15), dVar, this.f3514d, 2, 96).b() - b6;
            this.f3517g = b6;
            this.f3516f = b7;
            f7 = b7;
            f6 = b6;
        }
        if (i6 != 1) {
            int round = Math.round((f7 * (i6 - 1)) + f6);
            i7 = round >= 0 ? round : 0;
            int g3 = C0959a.g(j3);
            if (i7 > g3) {
                i7 = g3;
            }
        } else {
            i7 = C0959a.i(j3);
        }
        return AbstractC0960b.a(C0959a.j(j3), C0959a.h(j3), i7, C0959a.g(j3));
    }
}
