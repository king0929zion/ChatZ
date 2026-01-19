package T;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597b0 implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new C0599c0(parcel.readFloat());
            case 1:
                return new C0601d0(parcel.readInt());
            default:
                return new C0603e0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.a) {
            case 0:
                return new C0599c0[i6];
            case 1:
                return new C0601d0[i6];
            default:
                return new C0603e0[i6];
        }
    }
}
