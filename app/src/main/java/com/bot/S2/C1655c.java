package s2;

import android.graphics.Bitmap;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import t2.EnumC1720d;
import w2.AbstractC1835e;
import x4.AbstractC1898K;
import x4.AbstractC1939v;
import y4.C1998d;

/* renamed from: s2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1655c {
    public final AbstractC1939v a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1939v f14733b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1939v f14734c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC1939v f14735d;

    /* renamed from: e, reason: collision with root package name */
    public final v2.b f14736e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC1720d f14737f;

    /* renamed from: g, reason: collision with root package name */
    public final Bitmap.Config f14738g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14739h;

    /* renamed from: i, reason: collision with root package name */
    public final EnumC1654b f14740i;

    /* renamed from: j, reason: collision with root package name */
    public final EnumC1654b f14741j;

    /* renamed from: k, reason: collision with root package name */
    public final EnumC1654b f14742k;

    public C1655c() {
        E4.e eVar = AbstractC1898K.a;
        C1998d c1998d = C4.o.a.f16023i;
        E4.d dVar = E4.d.f1360f;
        Bitmap.Config config = AbstractC1835e.f15400b;
        this.a = c1998d;
        this.f14733b = dVar;
        this.f14734c = dVar;
        this.f14735d = dVar;
        this.f14736e = v2.b.a;
        this.f14737f = EnumC1720d.f14904f;
        this.f14738g = config;
        this.f14739h = true;
        EnumC1654b enumC1654b = EnumC1654b.ENABLED;
        this.f14740i = enumC1654b;
        this.f14741j = enumC1654b;
        this.f14742k = enumC1654b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1655c)) {
            return false;
        }
        C1655c c1655c = (C1655c) obj;
        return AbstractC1276k.b(this.a, c1655c.a) && AbstractC1276k.b(this.f14733b, c1655c.f14733b) && AbstractC1276k.b(this.f14734c, c1655c.f14734c) && AbstractC1276k.b(this.f14735d, c1655c.f14735d) && AbstractC1276k.b(this.f14736e, c1655c.f14736e) && this.f14737f == c1655c.f14737f && this.f14738g == c1655c.f14738g && this.f14739h == c1655c.f14739h && this.f14740i == c1655c.f14740i && this.f14741j == c1655c.f14741j && this.f14742k == c1655c.f14742k;
    }

    public final int hashCode() {
        int hashCode = (this.f14735d.hashCode() + ((this.f14734c.hashCode() + ((this.f14733b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        this.f14736e.getClass();
        return this.f14742k.hashCode() + ((this.f14741j.hashCode() + ((this.f14740i.hashCode() + AbstractC1135a.d(AbstractC1135a.d((this.f14738g.hashCode() + ((this.f14737f.hashCode() + ((v2.b.class.hashCode() + hashCode) * 31)) * 31)) * 31, 31, this.f14739h), 923521, false)) * 31)) * 31);
    }
}
