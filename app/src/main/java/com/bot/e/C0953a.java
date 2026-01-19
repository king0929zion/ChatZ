package e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import q2.C1501a;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0953a implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                AbstractC1276k.f(parcel, "parcel");
                return new C0954b(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                AbstractC1276k.f(parcel, "inParcel");
                return new j(parcel);
            case 2:
                return new ParcelImpl(parcel);
            default:
                String readString = parcel.readString();
                AbstractC1276k.c(readString);
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
                for (int i6 = 0; i6 < readInt; i6++) {
                    String readString2 = parcel.readString();
                    AbstractC1276k.c(readString2);
                    String readString3 = parcel.readString();
                    AbstractC1276k.c(readString3);
                    linkedHashMap.put(readString2, readString3);
                }
                return new C1501a(readString, linkedHashMap);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i6) {
        switch (this.a) {
            case 0:
                return new C0954b[i6];
            case 1:
                return new j[i6];
            case 2:
                return new ParcelImpl[i6];
            default:
                return new C1501a[i6];
        }
    }
}
