package X0;

/* loaded from: classes.dex */
public final class e implements g {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9102b;

    public e(int i6, int i7) {
        this.a = i6;
        this.f9102b = i7;
        if (i6 >= 0 && i7 >= 0) {
            return;
        }
        Y0.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i6 + " and " + i7 + " respectively.");
    }

    @Override // X0.g
    public final void a(h hVar) {
        int i6 = hVar.f9105c;
        U0.d dVar = hVar.a;
        int i7 = this.f9102b;
        int i8 = i6 + i7;
        if (((i6 ^ i8) & (i7 ^ i8)) < 0) {
            i8 = dVar.b();
        }
        hVar.a(hVar.f9105c, Math.min(i8, dVar.b()));
        int i9 = hVar.f9104b;
        int i10 = this.a;
        int i11 = i9 - i10;
        if (((i9 ^ i11) & (i10 ^ i9)) < 0) {
            i11 = 0;
        }
        hVar.a(Math.max(0, i11), hVar.f9104b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a == eVar.a && this.f9102b == eVar.f9102b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.f9102b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.a);
        sb.append(", lengthAfterCursor=");
        return B3.e.q(sb, this.f9102b, ')');
    }
}
