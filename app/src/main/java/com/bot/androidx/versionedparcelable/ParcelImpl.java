package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import e.C0953a;
import e2.C0963b;
import e2.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0953a(2);

    /* renamed from: c, reason: collision with root package name */
    public final c f10896c;

    public ParcelImpl(Parcel parcel) {
        this.f10896c = new C0963b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        new C0963b(parcel).i(this.f10896c);
    }
}
