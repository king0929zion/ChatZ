package n;

import m4.AbstractC1276k;

/* renamed from: n.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1296E implements InterfaceC1334l {
    public final InterfaceC1348w a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC1310T f12986b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12987c;

    public C1296E(InterfaceC1348w interfaceC1348w, EnumC1310T enumC1310T, long j3) {
        this.a = interfaceC1348w;
        this.f12986b = enumC1310T;
        this.f12987c = j3;
    }

    @Override // n.InterfaceC1334l
    public final F0 a(E0 e02) {
        return new N.l(this.a.a(e02), this.f12986b, this.f12987c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1296E) {
            C1296E c1296e = (C1296E) obj;
            if (AbstractC1276k.b(c1296e.a, this.a) && c1296e.f12986b == this.f12986b && c1296e.f12987c == this.f12987c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12987c) + ((this.f12986b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
