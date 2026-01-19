package n;

/* renamed from: n.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1323f0 implements InterfaceC1348w {
    public final int a;

    public C1323f0(int i6) {
        this.a = i6;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1323f0) && ((C1323f0) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    @Override // n.InterfaceC1334l
    public final H0 a(E0 e02) {
        return new M0(this.a);
    }
}
