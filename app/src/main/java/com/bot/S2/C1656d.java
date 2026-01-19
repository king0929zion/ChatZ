package s2;

import m4.AbstractC1276k;
import t2.EnumC1720d;
import t2.EnumC1722f;
import t2.InterfaceC1724h;

/* renamed from: s2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656d {
    public final InterfaceC1724h a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1722f f14743b;

    /* renamed from: c, reason: collision with root package name */
    public final v2.b f14744c;

    /* renamed from: d, reason: collision with root package name */
    public final EnumC1720d f14745d;

    public C1656d(InterfaceC1724h interfaceC1724h, EnumC1722f enumC1722f, v2.b bVar, EnumC1720d enumC1720d) {
        this.a = interfaceC1724h;
        this.f14743b = enumC1722f;
        this.f14744c = bVar;
        this.f14745d = enumC1720d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1656d)) {
            return false;
        }
        C1656d c1656d = (C1656d) obj;
        c1656d.getClass();
        return AbstractC1276k.b(this.a, c1656d.a) && this.f14743b == c1656d.f14743b && AbstractC1276k.b(this.f14744c, c1656d.f14744c) && this.f14745d == c1656d.f14745d;
    }

    public final int hashCode() {
        InterfaceC1724h interfaceC1724h = this.a;
        int hashCode = (interfaceC1724h != null ? interfaceC1724h.hashCode() : 0) * 31;
        EnumC1722f enumC1722f = this.f14743b;
        int hashCode2 = (hashCode + (enumC1722f != null ? enumC1722f.hashCode() : 0)) * 28629151;
        v2.b bVar = this.f14744c;
        int hashCode3 = (hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        EnumC1720d enumC1720d = this.f14745d;
        return (hashCode3 + (enumC1720d != null ? enumC1720d.hashCode() : 0)) * 887503681;
    }
}
