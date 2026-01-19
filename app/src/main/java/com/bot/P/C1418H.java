package p;

import H0.AbstractC0141b0;
import h0.AbstractC1040q;
import j1.AbstractC1135a;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import t.C1682j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: p.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418H extends AbstractC0141b0 {
    public final C1682j a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1455r0 f13582b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f13583c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13584d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13585e;

    /* renamed from: f, reason: collision with root package name */
    public final P0.i f13586f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1193a f13587g;

    public C1418H(C1682j c1682j, InterfaceC1455r0 interfaceC1455r0, boolean z5, boolean z6, String str, P0.i iVar, InterfaceC1193a interfaceC1193a) {
        this.a = c1682j;
        this.f13582b = interfaceC1455r0;
        this.f13583c = z5;
        this.f13584d = z6;
        this.f13585e = str;
        this.f13586f = iVar;
        this.f13587g = interfaceC1193a;
    }

    @Override // H0.AbstractC0141b0
    public final AbstractC1040q e() {
        return new r(this.a, this.f13582b, this.f13583c, this.f13584d, this.f13585e, this.f13586f, this.f13587g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1418H.class != obj.getClass()) {
            return false;
        }
        C1418H c1418h = (C1418H) obj;
        return AbstractC1276k.b(this.a, c1418h.a) && AbstractC1276k.b(this.f13582b, c1418h.f13582b) && this.f13583c == c1418h.f13583c && this.f13584d == c1418h.f13584d && AbstractC1276k.b(this.f13585e, c1418h.f13585e) && AbstractC1276k.b(this.f13586f, c1418h.f13586f) && this.f13587g == c1418h.f13587g;
    }

    @Override // H0.AbstractC0141b0
    public final void g(AbstractC1040q abstractC1040q) {
        ((C1420J) abstractC1040q).a1(this.a, this.f13582b, this.f13583c, this.f13584d, this.f13585e, this.f13586f, this.f13587g);
    }

    public final int hashCode() {
        C1682j c1682j = this.a;
        int hashCode = (c1682j != null ? c1682j.hashCode() : 0) * 31;
        InterfaceC1455r0 interfaceC1455r0 = this.f13582b;
        int d6 = AbstractC1135a.d(AbstractC1135a.d((hashCode + (interfaceC1455r0 != null ? interfaceC1455r0.hashCode() : 0)) * 31, 31, this.f13583c), 31, this.f13584d);
        String str = this.f13585e;
        int hashCode2 = (d6 + (str != null ? str.hashCode() : 0)) * 31;
        P0.i iVar = this.f13586f;
        return this.f13587g.hashCode() + ((hashCode2 + (iVar != null ? Integer.hashCode(iVar.a) : 0)) * 31);
    }
}
