package T2;

import o4.AbstractC1410a;

/* renamed from: T2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649e extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final int f8439e;

    public C0649e(int i6) {
        this.f8439e = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0649e) && this.f8439e == ((C0649e) obj).f8439e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f8439e);
    }

    public final String toString() {
        return B3.e.l("HeadingHashes(count=", this.f8439e, ")");
    }
}
