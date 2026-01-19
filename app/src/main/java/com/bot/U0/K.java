package u0;

import j1.AbstractC1135a;
import java.util.List;
import m4.AbstractC1276k;
import o0.AbstractC1404o;

/* loaded from: classes.dex */
public final class K extends I {

    /* renamed from: c, reason: collision with root package name */
    public final String f14990c;

    /* renamed from: e, reason: collision with root package name */
    public final List f14991e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14992f;

    /* renamed from: g, reason: collision with root package name */
    public final AbstractC1404o f14993g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14994h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC1404o f14995i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14996j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14997k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14998l;

    /* renamed from: m, reason: collision with root package name */
    public final int f14999m;

    /* renamed from: n, reason: collision with root package name */
    public final float f15000n;

    /* renamed from: o, reason: collision with root package name */
    public final float f15001o;

    /* renamed from: p, reason: collision with root package name */
    public final float f15002p;

    /* renamed from: q, reason: collision with root package name */
    public final float f15003q;

    public K(String str, List list, int i6, AbstractC1404o abstractC1404o, float f6, AbstractC1404o abstractC1404o2, float f7, float f8, int i7, int i8, float f9, float f10, float f11, float f12) {
        this.f14990c = str;
        this.f14991e = list;
        this.f14992f = i6;
        this.f14993g = abstractC1404o;
        this.f14994h = f6;
        this.f14995i = abstractC1404o2;
        this.f14996j = f7;
        this.f14997k = f8;
        this.f14998l = i7;
        this.f14999m = i8;
        this.f15000n = f9;
        this.f15001o = f10;
        this.f15002p = f11;
        this.f15003q = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && K.class == obj.getClass()) {
            K k3 = (K) obj;
            return AbstractC1276k.b(this.f14990c, k3.f14990c) && AbstractC1276k.b(this.f14993g, k3.f14993g) && this.f14994h == k3.f14994h && AbstractC1276k.b(this.f14995i, k3.f14995i) && this.f14996j == k3.f14996j && this.f14997k == k3.f14997k && this.f14998l == k3.f14998l && this.f14999m == k3.f14999m && this.f15000n == k3.f15000n && this.f15001o == k3.f15001o && this.f15002p == k3.f15002p && this.f15003q == k3.f15003q && this.f14992f == k3.f14992f && AbstractC1276k.b(this.f14991e, k3.f14991e);
        }
        return false;
    }

    public final int hashCode() {
        int e6 = AbstractC1135a.e(this.f14991e, this.f14990c.hashCode() * 31, 31);
        AbstractC1404o abstractC1404o = this.f14993g;
        int a = AbstractC1135a.a(this.f14994h, (e6 + (abstractC1404o != null ? abstractC1404o.hashCode() : 0)) * 31, 31);
        AbstractC1404o abstractC1404o2 = this.f14995i;
        return Integer.hashCode(this.f14992f) + AbstractC1135a.a(this.f15003q, AbstractC1135a.a(this.f15002p, AbstractC1135a.a(this.f15001o, AbstractC1135a.a(this.f15000n, AbstractC1135a.b(this.f14999m, AbstractC1135a.b(this.f14998l, AbstractC1135a.a(this.f14997k, AbstractC1135a.a(this.f14996j, (a + (abstractC1404o2 != null ? abstractC1404o2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
