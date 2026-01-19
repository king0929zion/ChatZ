package X0;

/* loaded from: classes.dex */
public final class f implements g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9103b;

    public f(int i6, int i7) {
        this.a = i6;
        this.f9103b = i7;
        if (i6 >= 0 && i7 >= 0) {
            return;
        }
        Y0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i6 + " and " + i7 + " respectively.");
    }

    @Override // X0.g
    public final void a(h hVar) {
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i7 < this.a) {
                int i9 = i8 + 1;
                int i10 = hVar.f9104b;
                if (i10 <= i9) {
                    i8 = i10;
                    break;
                } else {
                    i8 = (Character.isHighSurrogate(hVar.b((i10 - i9) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f9104b - i9))) ? i8 + 2 : i9;
                    i7++;
                }
            } else {
                break;
            }
        }
        int i11 = 0;
        while (true) {
            if (i6 >= this.f9103b) {
                break;
            }
            int i12 = i11 + 1;
            int i13 = hVar.f9105c;
            U0.d dVar = hVar.a;
            if (i13 + i12 >= dVar.b()) {
                i11 = dVar.b() - hVar.f9105c;
                break;
            } else {
                i11 = (Character.isHighSurrogate(hVar.b((hVar.f9105c + i12) + (-1))) && Character.isLowSurrogate(hVar.b(hVar.f9105c + i12))) ? i11 + 2 : i12;
                i6++;
            }
        }
        int i14 = hVar.f9105c;
        hVar.a(i14, i11 + i14);
        int i15 = hVar.f9104b;
        hVar.a(i15 - i8, i15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && this.f9103b == fVar.f9103b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f9103b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return B3.e.q(sb, this.f9103b, ')');
    }
}
