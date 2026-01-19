package T2;

import o4.AbstractC1410a;

/* renamed from: T2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654j extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8453e;

    public C0654j(int i6) {
        this.f8453e = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0654j) && this.f8453e == ((C0654j) obj).f8453e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8453e);
    }

    public final String toString() {
        return B3.e.l("InHeading(level=", this.f8453e, ")");
    }
}
