package m4;

import java.io.Serializable;

/* renamed from: m4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1266a implements InterfaceC1273h, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public final Object f12949c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f12950e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12951f;

    /* renamed from: g, reason: collision with root package name */
    public final String f12952g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12953h = false;

    /* renamed from: i, reason: collision with root package name */
    public final int f12954i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12955j;

    public C1266a(int i6, int i7, Class cls, Object obj, String str, String str2) {
        this.f12949c = obj;
        this.f12950e = cls;
        this.f12951f = str;
        this.f12952g = str2;
        this.f12954i = i6;
        this.f12955j = i7 >> 1;
    }

    @Override // m4.InterfaceC1273h
    public final int c() {
        return this.f12954i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1266a)) {
            return false;
        }
        C1266a c1266a = (C1266a) obj;
        return this.f12953h == c1266a.f12953h && this.f12954i == c1266a.f12954i && this.f12955j == c1266a.f12955j && this.f12949c.equals(c1266a.f12949c) && this.f12950e.equals(c1266a.f12950e) && this.f12951f.equals(c1266a.f12951f) && this.f12952g.equals(c1266a.f12952g);
    }

    public final int hashCode() {
        return ((((B3.e.e(B3.e.e((this.f12950e.hashCode() + (this.f12949c.hashCode() * 31)) * 31, 31, this.f12951f), 31, this.f12952g) + (this.f12953h ? 1231 : 1237)) * 31) + this.f12954i) * 31) + this.f12955j;
    }

    public final String toString() {
        AbstractC1289x.a.getClass();
        return C1290y.a(this);
    }
}
