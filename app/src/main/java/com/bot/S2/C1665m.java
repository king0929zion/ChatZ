package s2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import j1.AbstractC1135a;
import java.util.Arrays;
import m4.AbstractC1276k;
import t2.C1723g;
import t2.EnumC1722f;

/* renamed from: s2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1665m {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f14791b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f14792c;

    /* renamed from: d, reason: collision with root package name */
    public final C1723g f14793d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1722f f14794e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f14795f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f14796g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f14797h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14798i;

    /* renamed from: j, reason: collision with root package name */
    public final Q4.n f14799j;

    /* renamed from: k, reason: collision with root package name */
    public final C1668p f14800k;

    /* renamed from: l, reason: collision with root package name */
    public final C1666n f14801l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC1654b f14802m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC1654b f14803n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC1654b f14804o;

    public C1665m(Context context, Bitmap.Config config, ColorSpace colorSpace, C1723g c1723g, EnumC1722f enumC1722f, boolean z5, boolean z6, boolean z7, String str, Q4.n nVar, C1668p c1668p, C1666n c1666n, EnumC1654b enumC1654b, EnumC1654b enumC1654b2, EnumC1654b enumC1654b3) {
        this.a = context;
        this.f14791b = config;
        this.f14792c = colorSpace;
        this.f14793d = c1723g;
        this.f14794e = enumC1722f;
        this.f14795f = z5;
        this.f14796g = z6;
        this.f14797h = z7;
        this.f14798i = str;
        this.f14799j = nVar;
        this.f14800k = c1668p;
        this.f14801l = c1666n;
        this.f14802m = enumC1654b;
        this.f14803n = enumC1654b2;
        this.f14804o = enumC1654b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665m)) {
            return false;
        }
        C1665m c1665m = (C1665m) obj;
        return AbstractC1276k.b(this.a, c1665m.a) && this.f14791b == c1665m.f14791b && AbstractC1276k.b(this.f14792c, c1665m.f14792c) && AbstractC1276k.b(this.f14793d, c1665m.f14793d) && this.f14794e == c1665m.f14794e && this.f14795f == c1665m.f14795f && this.f14796g == c1665m.f14796g && this.f14797h == c1665m.f14797h && AbstractC1276k.b(this.f14798i, c1665m.f14798i) && AbstractC1276k.b(this.f14799j, c1665m.f14799j) && AbstractC1276k.b(this.f14800k, c1665m.f14800k) && AbstractC1276k.b(this.f14801l, c1665m.f14801l) && this.f14802m == c1665m.f14802m && this.f14803n == c1665m.f14803n && this.f14804o == c1665m.f14804o;
    }

    public final int hashCode() {
        int hashCode = (this.f14791b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f14792c;
        int d6 = AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d((this.f14794e.hashCode() + ((this.f14793d.hashCode() + ((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f14795f), 31, this.f14796g), 31, this.f14797h);
        String str = this.f14798i;
        return this.f14804o.hashCode() + ((this.f14803n.hashCode() + ((this.f14802m.hashCode() + ((this.f14801l.f14806c.hashCode() + ((this.f14800k.a.hashCode() + ((((d6 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f14799j.f6556c)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
