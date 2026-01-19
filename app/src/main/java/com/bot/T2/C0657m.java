package T2;

import o4.AbstractC1410a;

/* renamed from: T2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0657m extends AbstractC1410a {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f8463e;

    public C0657m(boolean z5) {
        this.f8463e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0657m) && this.f8463e == ((C0657m) obj).f8463e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8463e);
    }

    public final String toString() {
        return "InHtmlTagName(isClosing=" + this.f8463e + ")";
    }
}
