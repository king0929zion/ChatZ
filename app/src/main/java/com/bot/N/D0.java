package n;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class D0 implements InterfaceC1348w {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12984b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1349x f12985c;

    public D0(int i6, int i7, InterfaceC1349x interfaceC1349x) {
        this.a = i6;
        this.f12984b = i7;
        this.f12985c = interfaceC1349x;
    }

    @Override // n.InterfaceC1334l
    public final F0 a(E0 e02) {
        return new B3.s(this.a, this.f12984b, this.f12985c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D0) {
            D0 d02 = (D0) obj;
            if (d02.a == this.a && d02.f12984b == this.f12984b && AbstractC1276k.b(d02.f12985c, this.f12985c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f12985c.hashCode() + (this.a * 31)) * 31) + this.f12984b;
    }

    @Override // n.InterfaceC1348w, n.InterfaceC1334l
    public final H0 a(E0 e02) {
        return new B3.s(this.a, this.f12984b, this.f12985c);
    }
}
