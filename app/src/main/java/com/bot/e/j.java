package e;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new C0953a(1);

    /* renamed from: c, reason: collision with root package name */
    public final IntentSender f11534c;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f11535e;

    /* renamed from: f, reason: collision with root package name */
    public final int f11536f;

    /* renamed from: g, reason: collision with root package name */
    public final int f11537g;

    public j(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        AbstractC1276k.c(readParcelable);
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        this.f11534c = (IntentSender) readParcelable;
        this.f11535e = intent;
        this.f11536f = readInt;
        this.f11537g = readInt2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        AbstractC1276k.f(parcel, "dest");
        parcel.writeParcelable(this.f11534c, i6);
        parcel.writeParcelable(this.f11535e, i6);
        parcel.writeInt(this.f11536f);
        parcel.writeInt(this.f11537g);
    }
}
