package P2;

/* renamed from: P2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0344b {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4827b;

    public C0344b(boolean z5, boolean z6) {
        this.a = z5;
        this.f4827b = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0344b)) {
            return false;
        }
        C0344b c0344b = (C0344b) obj;
        return this.a == c0344b.a && this.f4827b == c0344b.f4827b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4827b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AtBottomMemory(whenImeHidden=" + this.a + ", whenImeVisible=" + this.f4827b + ")";
    }
}
