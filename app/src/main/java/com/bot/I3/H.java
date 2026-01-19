package I3;

import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class H {
    public final E a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2722c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2724e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2725f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2726g;

    /* renamed from: h, reason: collision with root package name */
    public final String f2727h;

    /* renamed from: i, reason: collision with root package name */
    public final X3.n f2728i;

    /* renamed from: j, reason: collision with root package name */
    public final X3.n f2729j;

    /* renamed from: k, reason: collision with root package name */
    public final X3.n f2730k;

    /* renamed from: l, reason: collision with root package name */
    public final X3.n f2731l;

    /* renamed from: m, reason: collision with root package name */
    public final X3.n f2732m;

    public H(E e6, String str, int i6, ArrayList arrayList, y yVar, String str2, String str3, String str4, boolean z5, String str5) {
        AbstractC1276k.f(e6, "protocol");
        AbstractC1276k.f(str, "host");
        AbstractC1276k.f(yVar, "parameters");
        AbstractC1276k.f(str2, "fragment");
        this.a = e6;
        this.f2721b = str;
        this.f2722c = i6;
        this.f2723d = arrayList;
        this.f2724e = str3;
        this.f2725f = str4;
        this.f2726g = z5;
        this.f2727h = str5;
        if ((i6 < 0 || i6 >= 65536) && i6 != 0) {
            throw new IllegalArgumentException("port must be between 0 and 65535, or 0 if not set");
        }
        this.f2728i = X3.a.d(new G(this, 2));
        this.f2729j = X3.a.d(new G(this, 4));
        X3.a.d(new G(this, 3));
        this.f2730k = X3.a.d(new G(this, 5));
        this.f2731l = X3.a.d(new G(this, 1));
        this.f2732m = X3.a.d(new G(this, 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && H.class == obj.getClass() && AbstractC1276k.b(this.f2727h, ((H) obj).f2727h);
    }

    public final int hashCode() {
        return this.f2727h.hashCode();
    }

    public final String toString() {
        return this.f2727h;
    }
}
