package T;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: T.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0605f0 implements Parcelable.ClassLoaderCreator {
    public static C0607g0 a(Parcel parcel, ClassLoader classLoader) {
        C0602e c0602e;
        if (classLoader == null) {
            classLoader = C0605f0.class.getClassLoader();
        }
        Object readValue = parcel.readValue(classLoader);
        int readInt = parcel.readInt();
        if (readInt == 0) {
            c0602e = C0602e.f8080g;
        } else if (readInt == 1) {
            c0602e = C0602e.f8083j;
        } else {
            if (readInt != 2) {
                throw new IllegalStateException(B3.e.l("Unsupported MutableState policy ", readInt, " was restored"));
            }
            c0602e = C0602e.f8081h;
        }
        return new C0607g0(readValue, c0602e);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        return new C0607g0[i6];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
