package X0;

import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class u implements g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9124b;

    public u(int i6, int i7) {
        this.a = i6;
        this.f9124b = i7;
    }

    @Override // X0.g
    public final void a(h hVar) {
        int f6 = AbstractC1117a.f(this.a, 0, hVar.a.b());
        int f7 = AbstractC1117a.f(this.f9124b, 0, hVar.a.b());
        if (f6 < f7) {
            hVar.f(f6, f7);
        } else {
            hVar.f(f7, f6);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.f9124b == uVar.f9124b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f9124b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return B3.e.q(sb, this.f9124b, ')');
    }
}
