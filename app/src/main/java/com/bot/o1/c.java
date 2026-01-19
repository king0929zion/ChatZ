package o1;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f13500e = new c(0, 0, 0, 0);
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13501b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13502c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13503d;

    public c(int i6, int i7, int i8, int i9) {
        this.a = i6;
        this.f13501b = i7;
        this.f13502c = i8;
        this.f13503d = i9;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.a, cVar2.a), Math.max(cVar.f13501b, cVar2.f13501b), Math.max(cVar.f13502c, cVar2.f13502c), Math.max(cVar.f13503d, cVar2.f13503d));
    }

    public static c b(int i6, int i7, int i8, int i9) {
        return (i6 == 0 && i7 == 0 && i8 == 0 && i9 == 0) ? f13500e : new c(i6, i7, i8, i9);
    }

    public static c c(Insets insets) {
        int i6;
        int i7;
        int i8;
        int i9;
        i6 = insets.left;
        i7 = insets.top;
        i8 = insets.right;
        i9 = insets.bottom;
        return b(i6, i7, i8, i9);
    }

    public final Insets d() {
        return L0.a.h(this.a, this.f13501b, this.f13502c, this.f13503d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f13503d == cVar.f13503d && this.a == cVar.a && this.f13502c == cVar.f13502c && this.f13501b == cVar.f13501b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.f13501b) * 31) + this.f13502c) * 31) + this.f13503d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.f13501b);
        sb.append(", right=");
        sb.append(this.f13502c);
        sb.append(", bottom=");
        return B3.e.q(sb, this.f13503d, '}');
    }
}
