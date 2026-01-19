package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import m4.AbstractC1276k;

/* renamed from: e.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0954b implements Parcelable {
    public static final Parcelable.Creator<C0954b> CREATOR = new C0953a(0);

    /* renamed from: c, reason: collision with root package name */
    public final int f11521c;

    /* renamed from: e, reason: collision with root package name */
    public final Intent f11522e;

    public C0954b(Intent intent, int i6) {
        this.f11521c = i6;
        this.f11522e = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i6 = this.f11521c;
        sb.append(i6 != -1 ? i6 != 0 ? String.valueOf(i6) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f11522e);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        AbstractC1276k.f(parcel, "dest");
        parcel.writeInt(this.f11521c);
        Intent intent = this.f11522e;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i6);
        }
    }
}
