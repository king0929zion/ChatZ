package T2;

import o4.AbstractC1410a;

/* renamed from: T2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661q extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8472e;

    public C0661q(int i6) {
        this.f8472e = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0661q) && this.f8472e == ((C0661q) obj).f8472e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8472e);
    }

    public final String toString() {
        return B3.e.l("InTableCell(cellIndex=", this.f8472e, ")");
    }
}
