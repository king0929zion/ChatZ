package n;

import m4.AbstractC1276k;

/* renamed from: n.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1329i0 implements InterfaceC1334l {
    public final InterfaceC1334l a;

    /* renamed from: b, reason: collision with root package name */
    public final long f13164b;

    public C1329i0(InterfaceC1351z interfaceC1351z, long j3) {
        this.a = interfaceC1351z;
        this.f13164b = j3;
    }

    @Override // n.InterfaceC1334l
    public final F0 a(E0 e02) {
        return new C1331j0(this.a.a(e02), this.f13164b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1329i0)) {
            return false;
        }
        C1329i0 c1329i0 = (C1329i0) obj;
        return c1329i0.f13164b == this.f13164b && AbstractC1276k.b(c1329i0.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.f13164b) + (this.a.hashCode() * 31);
    }
}
