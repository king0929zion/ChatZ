package u0;

import androidx.lifecycle.N;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: u0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1746g {

    /* renamed from: k, reason: collision with root package name */
    public static int f15048k;

    /* renamed from: l, reason: collision with root package name */
    public static final N f15049l = new N(22);
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final float f15050b;

    /* renamed from: c, reason: collision with root package name */
    public final float f15051c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15052d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15053e;

    /* renamed from: f, reason: collision with root package name */
    public final G f15054f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15055g;

    /* renamed from: h, reason: collision with root package name */
    public final int f15056h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15057i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15058j;

    public C1746g(String str, float f6, float f7, float f8, float f9, G g3, long j3, int i6, boolean z5) {
        int i7;
        synchronized (f15049l) {
            i7 = f15048k;
            f15048k = i7 + 1;
        }
        this.a = str;
        this.f15050b = f6;
        this.f15051c = f7;
        this.f15052d = f8;
        this.f15053e = f9;
        this.f15054f = g3;
        this.f15055g = j3;
        this.f15056h = i6;
        this.f15057i = z5;
        this.f15058j = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1746g)) {
            return false;
        }
        C1746g c1746g = (C1746g) obj;
        return AbstractC1276k.b(this.a, c1746g.a) && e1.f.c(this.f15050b, c1746g.f15050b) && e1.f.c(this.f15051c, c1746g.f15051c) && this.f15052d == c1746g.f15052d && this.f15053e == c1746g.f15053e && this.f15054f.equals(c1746g.f15054f) && o0.s.d(this.f15055g, c1746g.f15055g) && this.f15056h == c1746g.f15056h && this.f15057i == c1746g.f15057i;
    }

    public final int hashCode() {
        int hashCode = (this.f15054f.hashCode() + AbstractC1135a.a(this.f15053e, AbstractC1135a.a(this.f15052d, AbstractC1135a.a(this.f15051c, AbstractC1135a.a(this.f15050b, this.a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i6 = o0.s.f13482i;
        return Boolean.hashCode(this.f15057i) + AbstractC1135a.b(this.f15056h, AbstractC1135a.c(hashCode, 31, this.f15055g), 31);
    }
}
