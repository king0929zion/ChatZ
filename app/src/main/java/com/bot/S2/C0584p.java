package S2;

import m4.AbstractC1276k;

/* renamed from: S2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0584p {
    public final o0.s a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.s f7838b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.s f7839c;

    /* renamed from: d, reason: collision with root package name */
    public final Float f7840d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f7841e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f7842f;

    /* renamed from: g, reason: collision with root package name */
    public final Float f7843g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f7844h;

    public /* synthetic */ C0584p() {
        this(null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0584p)) {
            return false;
        }
        C0584p c0584p = (C0584p) obj;
        return AbstractC1276k.b(this.a, c0584p.a) && AbstractC1276k.b(this.f7838b, c0584p.f7838b) && AbstractC1276k.b(this.f7839c, c0584p.f7839c) && AbstractC1276k.b(this.f7840d, c0584p.f7840d) && AbstractC1276k.b(this.f7841e, c0584p.f7841e) && AbstractC1276k.b(this.f7842f, c0584p.f7842f) && AbstractC1276k.b(this.f7843g, c0584p.f7843g) && AbstractC1276k.b(this.f7844h, c0584p.f7844h);
    }

    public final int hashCode() {
        o0.s sVar = this.a;
        int hashCode = (sVar == null ? 0 : Long.hashCode(sVar.a)) * 31;
        o0.s sVar2 = this.f7838b;
        int hashCode2 = (hashCode + (sVar2 == null ? 0 : Long.hashCode(sVar2.a))) * 31;
        o0.s sVar3 = this.f7839c;
        int hashCode3 = (hashCode2 + (sVar3 == null ? 0 : Long.hashCode(sVar3.a))) * 31;
        Float f6 = this.f7840d;
        int hashCode4 = (hashCode3 + (f6 == null ? 0 : f6.hashCode())) * 31;
        Float f7 = this.f7841e;
        int hashCode5 = (hashCode4 + (f7 == null ? 0 : f7.hashCode())) * 31;
        Float f8 = this.f7842f;
        int hashCode6 = (hashCode5 + (f8 == null ? 0 : f8.hashCode())) * 31;
        Float f9 = this.f7843g;
        int hashCode7 = (hashCode6 + (f9 == null ? 0 : f9.hashCode())) * 31;
        Float f10 = this.f7844h;
        return hashCode7 + (f10 != null ? f10.hashCode() : 0);
    }

    public final String toString() {
        return "MarkdownBlockStyle(textColor=" + this.a + ", backgroundColor=" + this.f7838b + ", borderLeftColor=" + this.f7839c + ", borderLeftWidthDp=" + this.f7840d + ", borderRadiusDp=" + this.f7841e + ", paddingHorizontalDp=" + this.f7842f + ", paddingVerticalDp=" + this.f7843g + ", marginBottomDp=" + this.f7844h + ")";
    }

    public C0584p(o0.s sVar, o0.s sVar2, o0.s sVar3, Float f6, Float f7, Float f8, Float f9, Float f10) {
        this.a = sVar;
        this.f7838b = sVar2;
        this.f7839c = sVar3;
        this.f7840d = f6;
        this.f7841e = f7;
        this.f7842f = f8;
        this.f7843g = f9;
        this.f7844h = f10;
    }
}
