package S0;

import e1.C0959a;
import e1.InterfaceC0961c;
import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class K {
    public final C0545g a;

    /* renamed from: b, reason: collision with root package name */
    public final P f7590b;

    /* renamed from: c, reason: collision with root package name */
    public final List f7591c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7592d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7593e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7594f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC0961c f7595g;

    /* renamed from: h, reason: collision with root package name */
    public final e1.m f7596h;

    /* renamed from: i, reason: collision with root package name */
    public final W0.d f7597i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7598j;

    public K(C0545g c0545g, P p5, List list, int i6, boolean z5, int i7, InterfaceC0961c interfaceC0961c, e1.m mVar, W0.d dVar, long j3) {
        this.a = c0545g;
        this.f7590b = p5;
        this.f7591c = list;
        this.f7592d = i6;
        this.f7593e = z5;
        this.f7594f = i7;
        this.f7595g = interfaceC0961c;
        this.f7596h = mVar;
        this.f7597i = dVar;
        this.f7598j = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k3 = (K) obj;
        return AbstractC1276k.b(this.a, k3.a) && AbstractC1276k.b(this.f7590b, k3.f7590b) && AbstractC1276k.b(this.f7591c, k3.f7591c) && this.f7592d == k3.f7592d && this.f7593e == k3.f7593e && this.f7594f == k3.f7594f && AbstractC1276k.b(this.f7595g, k3.f7595g) && this.f7596h == k3.f7596h && AbstractC1276k.b(this.f7597i, k3.f7597i) && C0959a.b(this.f7598j, k3.f7598j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f7598j) + ((this.f7597i.hashCode() + ((this.f7596h.hashCode() + ((this.f7595g.hashCode() + AbstractC1135a.b(this.f7594f, AbstractC1135a.d((AbstractC1135a.e(this.f7591c, B3.e.d(this.a.hashCode() * 31, 31, this.f7590b), 31) + this.f7592d) * 31, 31, this.f7593e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.f7590b);
        sb.append(", placeholders=");
        sb.append(this.f7591c);
        sb.append(", maxLines=");
        sb.append(this.f7592d);
        sb.append(", softWrap=");
        sb.append(this.f7593e);
        sb.append(", overflow=");
        int i6 = this.f7594f;
        sb.append((Object) (i6 == 1 ? "Clip" : i6 == 2 ? "Ellipsis" : i6 == 5 ? "MiddleEllipsis" : i6 == 3 ? "Visible" : i6 == 4 ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.f7595g);
        sb.append(", layoutDirection=");
        sb.append(this.f7596h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.f7597i);
        sb.append(", constraints=");
        sb.append((Object) C0959a.k(this.f7598j));
        sb.append(')');
        return sb.toString();
    }
}
