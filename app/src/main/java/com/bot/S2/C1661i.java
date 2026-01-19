package s2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.lifecycle.O;
import j1.AbstractC1135a;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;
import t2.EnumC1720d;
import t2.EnumC1722f;
import t2.InterfaceC1724h;
import u2.InterfaceC1756a;
import x4.AbstractC1939v;

/* renamed from: s2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1661i {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f14766b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1756a f14767c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap.Config f14768d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC1720d f14769e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14770f;

    /* renamed from: g, reason: collision with root package name */
    public final v2.b f14771g;

    /* renamed from: h, reason: collision with root package name */
    public final Q4.n f14772h;

    /* renamed from: i, reason: collision with root package name */
    public final C1668p f14773i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14774j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14775k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f14776l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f14777m;

    /* renamed from: n, reason: collision with root package name */
    public final EnumC1654b f14778n;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC1654b f14779o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC1654b f14780p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1939v f14781q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC1939v f14782r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC1939v f14783s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC1939v f14784t;

    /* renamed from: u, reason: collision with root package name */
    public final O f14785u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC1724h f14786v;

    /* renamed from: w, reason: collision with root package name */
    public final EnumC1722f f14787w;

    /* renamed from: x, reason: collision with root package name */
    public final C1666n f14788x;

    /* renamed from: y, reason: collision with root package name */
    public final C1656d f14789y;

    /* renamed from: z, reason: collision with root package name */
    public final C1655c f14790z;

    public C1661i(Context context, Object obj, InterfaceC1756a interfaceC1756a, Bitmap.Config config, EnumC1720d enumC1720d, List list, v2.b bVar, Q4.n nVar, C1668p c1668p, boolean z5, boolean z6, boolean z7, boolean z8, EnumC1654b enumC1654b, EnumC1654b enumC1654b2, EnumC1654b enumC1654b3, AbstractC1939v abstractC1939v, AbstractC1939v abstractC1939v2, AbstractC1939v abstractC1939v3, AbstractC1939v abstractC1939v4, O o5, InterfaceC1724h interfaceC1724h, EnumC1722f enumC1722f, C1666n c1666n, C1656d c1656d, C1655c c1655c) {
        this.a = context;
        this.f14766b = obj;
        this.f14767c = interfaceC1756a;
        this.f14768d = config;
        this.f14769e = enumC1720d;
        this.f14770f = list;
        this.f14771g = bVar;
        this.f14772h = nVar;
        this.f14773i = c1668p;
        this.f14774j = z5;
        this.f14775k = z6;
        this.f14776l = z7;
        this.f14777m = z8;
        this.f14778n = enumC1654b;
        this.f14779o = enumC1654b2;
        this.f14780p = enumC1654b3;
        this.f14781q = abstractC1939v;
        this.f14782r = abstractC1939v2;
        this.f14783s = abstractC1939v3;
        this.f14784t = abstractC1939v4;
        this.f14785u = o5;
        this.f14786v = interfaceC1724h;
        this.f14787w = enumC1722f;
        this.f14788x = c1666n;
        this.f14789y = c1656d;
        this.f14790z = c1655c;
    }

    public static C1660h a(C1661i c1661i) {
        Context context = c1661i.a;
        c1661i.getClass();
        return new C1660h(c1661i, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661i)) {
            return false;
        }
        C1661i c1661i = (C1661i) obj;
        return AbstractC1276k.b(this.a, c1661i.a) && this.f14766b.equals(c1661i.f14766b) && AbstractC1276k.b(this.f14767c, c1661i.f14767c) && this.f14768d == c1661i.f14768d && this.f14769e == c1661i.f14769e && AbstractC1276k.b(this.f14770f, c1661i.f14770f) && AbstractC1276k.b(this.f14771g, c1661i.f14771g) && AbstractC1276k.b(this.f14772h, c1661i.f14772h) && this.f14773i.equals(c1661i.f14773i) && this.f14774j == c1661i.f14774j && this.f14775k == c1661i.f14775k && this.f14776l == c1661i.f14776l && this.f14777m == c1661i.f14777m && this.f14778n == c1661i.f14778n && this.f14779o == c1661i.f14779o && this.f14780p == c1661i.f14780p && AbstractC1276k.b(this.f14781q, c1661i.f14781q) && AbstractC1276k.b(this.f14782r, c1661i.f14782r) && AbstractC1276k.b(this.f14783s, c1661i.f14783s) && AbstractC1276k.b(this.f14784t, c1661i.f14784t) && AbstractC1276k.b(this.f14785u, c1661i.f14785u) && this.f14786v.equals(c1661i.f14786v) && this.f14787w == c1661i.f14787w && this.f14788x.equals(c1661i.f14788x) && this.f14789y.equals(c1661i.f14789y) && AbstractC1276k.b(this.f14790z, c1661i.f14790z);
    }

    public final int hashCode() {
        int hashCode = (this.f14766b.hashCode() + (this.a.hashCode() * 31)) * 31;
        InterfaceC1756a interfaceC1756a = this.f14767c;
        return this.f14790z.hashCode() + ((this.f14789y.hashCode() + ((this.f14788x.f14806c.hashCode() + ((this.f14787w.hashCode() + ((this.f14786v.hashCode() + ((this.f14785u.hashCode() + ((this.f14784t.hashCode() + ((this.f14783s.hashCode() + ((this.f14782r.hashCode() + ((this.f14781q.hashCode() + ((this.f14780p.hashCode() + ((this.f14779o.hashCode() + ((this.f14778n.hashCode() + AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d((this.f14773i.a.hashCode() + ((((this.f14771g.hashCode() + AbstractC1135a.e(this.f14770f, (this.f14769e.hashCode() + ((this.f14768d.hashCode() + ((hashCode + (interfaceC1756a != null ? interfaceC1756a.hashCode() : 0)) * 923521)) * 961)) * 29791, 31)) * 31) + Arrays.hashCode(this.f14772h.f6556c)) * 31)) * 31, 31, this.f14774j), 31, this.f14775k), 31, this.f14776l), 31, this.f14777m)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * (-1807454463))) * 31);
    }
}
