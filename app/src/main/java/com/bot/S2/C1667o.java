package s2;

import android.graphics.drawable.Drawable;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import q2.C1501a;

/* renamed from: s2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1667o extends AbstractC1662j {
    public final Drawable a;

    /* renamed from: b, reason: collision with root package name */
    public final C1661i f14807b;

    /* renamed from: c, reason: collision with root package name */
    public final k2.f f14808c;

    /* renamed from: d, reason: collision with root package name */
    public final C1501a f14809d;

    /* renamed from: e, reason: collision with root package name */
    public final String f14810e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14811f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14812g;

    public C1667o(Drawable drawable, C1661i c1661i, k2.f fVar, C1501a c1501a, String str, boolean z5, boolean z6) {
        this.a = drawable;
        this.f14807b = c1661i;
        this.f14808c = fVar;
        this.f14809d = c1501a;
        this.f14810e = str;
        this.f14811f = z5;
        this.f14812g = z6;
    }

    @Override // s2.AbstractC1662j
    public final C1661i a() {
        return this.f14807b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1667o)) {
            return false;
        }
        C1667o c1667o = (C1667o) obj;
        return AbstractC1276k.b(this.a, c1667o.a) && AbstractC1276k.b(this.f14807b, c1667o.f14807b) && this.f14808c == c1667o.f14808c && AbstractC1276k.b(this.f14809d, c1667o.f14809d) && AbstractC1276k.b(this.f14810e, c1667o.f14810e) && this.f14811f == c1667o.f14811f && this.f14812g == c1667o.f14812g;
    }

    public final int hashCode() {
        int hashCode = (this.f14808c.hashCode() + ((this.f14807b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        C1501a c1501a = this.f14809d;
        int hashCode2 = (hashCode + (c1501a != null ? c1501a.hashCode() : 0)) * 31;
        String str = this.f14810e;
        return Boolean.hashCode(this.f14812g) + AbstractC1135a.d((hashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f14811f);
    }
}
