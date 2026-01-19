package T2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* renamed from: T2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0659o extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8467e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f8468f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f8469g;

    public C0659o(int i6, boolean z5, Integer num) {
        this.f8467e = i6;
        this.f8468f = z5;
        this.f8469g = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0659o)) {
            return false;
        }
        C0659o c0659o = (C0659o) obj;
        return this.f8467e == c0659o.f8467e && this.f8468f == c0659o.f8468f && AbstractC1276k.b(this.f8469g, c0659o.f8469g);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(Integer.hashCode(this.f8467e) * 31, 31, this.f8468f);
        Integer num = this.f8469g;
        return d6 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "InListItem(indent=" + this.f8467e + ", isOrdered=" + this.f8468f + ", number=" + this.f8469g + ")";
    }
}
