package p;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import r.X0;

/* loaded from: classes.dex */
public final class X {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13658b;

    /* renamed from: c, reason: collision with root package name */
    public long f13659c = 0;

    /* renamed from: d, reason: collision with root package name */
    public EdgeEffect f13660d;

    /* renamed from: e, reason: collision with root package name */
    public EdgeEffect f13661e;

    /* renamed from: f, reason: collision with root package name */
    public EdgeEffect f13662f;

    /* renamed from: g, reason: collision with root package name */
    public EdgeEffect f13663g;

    /* renamed from: h, reason: collision with root package name */
    public EdgeEffect f13664h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f13665i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f13666j;

    /* renamed from: k, reason: collision with root package name */
    public EdgeEffect f13667k;

    public X(Context context, int i6) {
        this.a = context;
        this.f13658b = i6;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !((Build.VERSION.SDK_INT >= 31 ? AbstractC1462x.b(edgeEffect) : 0.0f) == S.l.f7374V);
    }

    public final EdgeEffect a(X0 x02) {
        int i6 = Build.VERSION.SDK_INT;
        Context context = this.a;
        EdgeEffect a = i6 >= 31 ? AbstractC1462x.a(context) : new C1428d0(context);
        a.setColor(this.f13658b);
        if (!e1.l.b(this.f13659c, 0L)) {
            if (x02 == X0.f14183c) {
                long j3 = this.f13659c;
                a.setSize((int) (j3 >> 32), (int) (j3 & 4294967295L));
                return a;
            }
            long j4 = this.f13659c;
            a.setSize((int) (j4 & 4294967295L), (int) (j4 >> 32));
        }
        return a;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f13661e;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(X0.f14183c);
        this.f13661e = a;
        return a;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f13662f;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(X0.f14184e);
        this.f13662f = a;
        return a;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f13663g;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(X0.f14184e);
        this.f13663g = a;
        return a;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f13660d;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect a = a(X0.f14183c);
        this.f13660d = a;
        return a;
    }
}
