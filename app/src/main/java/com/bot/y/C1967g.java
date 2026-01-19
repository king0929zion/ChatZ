package y;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: y.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1967g implements Parcelable {
    public static final Parcelable.Creator<C1967g> CREATOR = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final int f15861c;

    public C1967g(int i6) {
        this.f15861c = i6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1967g) && this.f15861c == ((C1967g) obj).f15861c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15861c);
    }

    public final String toString() {
        return B3.e.q(new StringBuilder("DefaultLazyKey(index="), this.f15861c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeInt(this.f15861c);
    }
}
