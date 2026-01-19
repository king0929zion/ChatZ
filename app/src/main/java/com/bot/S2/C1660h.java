package s2;

import Y3.B;
import Y3.v;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import i4.AbstractC1117a;
import java.util.LinkedHashMap;
import java.util.List;
import t2.C1719c;
import t2.EnumC1720d;
import t2.EnumC1722f;
import t2.InterfaceC1724h;
import t2.InterfaceC1725i;
import u2.InterfaceC1756a;
import w2.AbstractC1834d;
import w2.AbstractC1835e;
import x4.AbstractC1939v;

/* renamed from: s2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1660h {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public C1655c f14750b;

    /* renamed from: c, reason: collision with root package name */
    public Object f14751c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1756a f14752d;

    /* renamed from: e, reason: collision with root package name */
    public EnumC1720d f14753e;

    /* renamed from: f, reason: collision with root package name */
    public final List f14754f;

    /* renamed from: g, reason: collision with root package name */
    public v2.b f14755g;

    /* renamed from: h, reason: collision with root package name */
    public final Q4.m f14756h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f14757i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f14758j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f14759k;

    /* renamed from: l, reason: collision with root package name */
    public final F1.e f14760l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC1724h f14761m;

    /* renamed from: n, reason: collision with root package name */
    public EnumC1722f f14762n;

    /* renamed from: o, reason: collision with root package name */
    public O f14763o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC1724h f14764p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC1722f f14765q;

    public C1660h(Context context) {
        this.a = context;
        this.f14750b = AbstractC1834d.a;
        this.f14751c = null;
        this.f14752d = null;
        this.f14753e = null;
        this.f14754f = v.f9812c;
        this.f14755g = null;
        this.f14756h = null;
        this.f14757i = null;
        this.f14758j = true;
        this.f14759k = true;
        this.f14760l = null;
        this.f14761m = null;
        this.f14762n = null;
        this.f14763o = null;
        this.f14764p = null;
        this.f14765q = null;
    }

    public final C1661i a() {
        InterfaceC1724h interfaceC1724h;
        Object obj = this.f14751c;
        if (obj == null) {
            obj = C1663k.a;
        }
        Object obj2 = obj;
        InterfaceC1756a interfaceC1756a = this.f14752d;
        C1655c c1655c = this.f14750b;
        Bitmap.Config config = c1655c.f14738g;
        EnumC1720d enumC1720d = this.f14753e;
        if (enumC1720d == null) {
            enumC1720d = c1655c.f14737f;
        }
        EnumC1720d enumC1720d2 = enumC1720d;
        v2.b bVar = this.f14755g;
        if (bVar == null) {
            bVar = c1655c.f14736e;
        }
        v2.b bVar2 = bVar;
        Q4.m mVar = this.f14756h;
        Q4.n d6 = mVar != null ? mVar.d() : null;
        if (d6 == null) {
            d6 = AbstractC1835e.f15401c;
        } else {
            Bitmap.Config[] configArr = AbstractC1835e.a;
        }
        Q4.n nVar = d6;
        LinkedHashMap linkedHashMap = this.f14757i;
        C1668p c1668p = linkedHashMap != null ? new C1668p(AbstractC1117a.w(linkedHashMap)) : null;
        if (c1668p == null) {
            c1668p = C1668p.f14813b;
        }
        C1668p c1668p2 = c1668p;
        C1655c c1655c2 = this.f14750b;
        boolean z5 = c1655c2.f14739h;
        c1655c2.getClass();
        C1655c c1655c3 = this.f14750b;
        EnumC1654b enumC1654b = c1655c3.f14740i;
        EnumC1654b enumC1654b2 = c1655c3.f14741j;
        EnumC1654b enumC1654b3 = c1655c3.f14742k;
        AbstractC1939v abstractC1939v = c1655c3.a;
        AbstractC1939v abstractC1939v2 = c1655c3.f14733b;
        AbstractC1939v abstractC1939v3 = c1655c3.f14734c;
        AbstractC1939v abstractC1939v4 = c1655c3.f14735d;
        O o5 = this.f14763o;
        Context context = this.a;
        if (o5 == null) {
            Object obj3 = context;
            while (true) {
                if (obj3 instanceof InterfaceC0846u) {
                    o5 = ((InterfaceC0846u) obj3).g();
                    break;
                }
                if (!(obj3 instanceof ContextWrapper)) {
                    o5 = null;
                    break;
                }
                obj3 = ((ContextWrapper) obj3).getBaseContext();
            }
            if (o5 == null) {
                o5 = C1659g.f14748e;
            }
        }
        O o6 = o5;
        InterfaceC1724h interfaceC1724h2 = this.f14761m;
        if (interfaceC1724h2 == null) {
            InterfaceC1724h interfaceC1724h3 = this.f14764p;
            if (interfaceC1724h3 == null) {
                interfaceC1724h3 = new C1719c(context);
            }
            interfaceC1724h = interfaceC1724h3;
        } else {
            interfaceC1724h = interfaceC1724h2;
        }
        EnumC1722f enumC1722f = this.f14762n;
        if (enumC1722f == null && (enumC1722f = this.f14765q) == null) {
            if ((interfaceC1724h2 instanceof InterfaceC1725i ? (InterfaceC1725i) interfaceC1724h2 : null) != null) {
                throw null;
            }
            enumC1722f = EnumC1722f.f14907e;
        }
        EnumC1722f enumC1722f2 = enumC1722f;
        F1.e eVar = this.f14760l;
        C1666n c1666n = eVar != null ? new C1666n(AbstractC1117a.w(eVar.a)) : null;
        if (c1666n == null) {
            c1666n = C1666n.f14805e;
        }
        return new C1661i(context, obj2, interfaceC1756a, config, enumC1720d2, this.f14754f, bVar2, nVar, c1668p2, this.f14758j, z5, false, this.f14759k, enumC1654b, enumC1654b2, enumC1654b3, abstractC1939v, abstractC1939v2, abstractC1939v3, abstractC1939v4, o6, interfaceC1724h, enumC1722f2, c1666n, new C1656d(this.f14761m, this.f14762n, this.f14755g, this.f14753e), this.f14750b);
    }

    public C1660h(C1661i c1661i, Context context) {
        this.a = context;
        this.f14750b = c1661i.f14790z;
        this.f14751c = c1661i.f14766b;
        this.f14752d = c1661i.f14767c;
        C1656d c1656d = c1661i.f14789y;
        this.f14753e = c1656d.f14745d;
        this.f14754f = c1661i.f14770f;
        this.f14755g = c1656d.f14744c;
        this.f14756h = c1661i.f14772h.c();
        this.f14757i = B.e0(c1661i.f14773i.a);
        this.f14758j = c1661i.f14774j;
        this.f14759k = c1661i.f14777m;
        this.f14760l = new F1.e(c1661i.f14788x);
        this.f14761m = c1656d.a;
        this.f14762n = c1656d.f14743b;
        if (c1661i.a == context) {
            this.f14763o = c1661i.f14785u;
            this.f14764p = c1661i.f14786v;
            this.f14765q = c1661i.f14787w;
        } else {
            this.f14763o = null;
            this.f14764p = null;
            this.f14765q = null;
        }
    }
}
