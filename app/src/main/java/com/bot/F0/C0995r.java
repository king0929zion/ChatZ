package f0;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0995r implements Parcelable.ClassLoaderCreator {
    public static C0996s a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = C0995r.class.getClassLoader();
        }
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new C0996s();
        }
        X.g e6 = X.j.f9070e.e();
        for (int i6 = 0; i6 < readInt; i6++) {
            e6.add(parcel.readValue(classLoader));
        }
        return new C0996s(e6.c());
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        return new C0996s[i6];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
