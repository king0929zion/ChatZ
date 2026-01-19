package u0;

import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* loaded from: classes.dex */
public final class G extends I implements Iterable, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final String f14974c;

    /* renamed from: e, reason: collision with root package name */
    public final float f14975e;

    /* renamed from: f, reason: collision with root package name */
    public final float f14976f;

    /* renamed from: g, reason: collision with root package name */
    public final float f14977g;

    /* renamed from: h, reason: collision with root package name */
    public final float f14978h;

    /* renamed from: i, reason: collision with root package name */
    public final float f14979i;

    /* renamed from: j, reason: collision with root package name */
    public final float f14980j;

    /* renamed from: k, reason: collision with root package name */
    public final float f14981k;

    /* renamed from: l, reason: collision with root package name */
    public final List f14982l;

    /* renamed from: m, reason: collision with root package name */
    public final List f14983m;

    public G(String str, float f6, float f7, float f8, float f9, float f10, float f11, float f12, List list, ArrayList arrayList) {
        this.f14974c = str;
        this.f14975e = f6;
        this.f14976f = f7;
        this.f14977g = f8;
        this.f14978h = f9;
        this.f14979i = f10;
        this.f14980j = f11;
        this.f14981k = f12;
        this.f14982l = list;
        this.f14983m = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof G)) {
            G g3 = (G) obj;
            return AbstractC1276k.b(this.f14974c, g3.f14974c) && this.f14975e == g3.f14975e && this.f14976f == g3.f14976f && this.f14977g == g3.f14977g && this.f14978h == g3.f14978h && this.f14979i == g3.f14979i && this.f14980j == g3.f14980j && this.f14981k == g3.f14981k && AbstractC1276k.b(this.f14982l, g3.f14982l) && AbstractC1276k.b(this.f14983m, g3.f14983m);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14983m.hashCode() + AbstractC1135a.e(this.f14982l, AbstractC1135a.a(this.f14981k, AbstractC1135a.a(this.f14980j, AbstractC1135a.a(this.f14979i, AbstractC1135a.a(this.f14978h, AbstractC1135a.a(this.f14977g, AbstractC1135a.a(this.f14976f, AbstractC1135a.a(this.f14975e, this.f14974c.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new Y.h(this);
    }
}
