package X0;

import i4.AbstractC1117a;

/* loaded from: classes.dex */
public final class s implements g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9122b;

    public s(int i6, int i7) {
        this.a = i6;
        this.f9122b = i7;
    }

    @Override // X0.g
    public final void a(h hVar) {
        boolean z5 = hVar.f9106d != -1;
        U0.d dVar = hVar.a;
        if (z5) {
            hVar.f9106d = -1;
            hVar.f9107e = -1;
        }
        int f6 = AbstractC1117a.f(this.a, 0, dVar.b());
        int f7 = AbstractC1117a.f(this.f9122b, 0, dVar.b());
        if (f6 != f7) {
            if (f6 < f7) {
                hVar.e(f6, f7);
            } else {
                hVar.e(f7, f6);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.f9122b == sVar.f9122b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f9122b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.a);
        sb.append(", end=");
        return B3.e.q(sb, this.f9122b, ')');
    }
}
