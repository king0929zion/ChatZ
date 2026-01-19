package q2;

import android.os.Parcel;
import android.os.Parcelable;
import e.C0953a;
import java.util.Map;
import m4.AbstractC1276k;

/* renamed from: q2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<C1501a> CREATOR = new C0953a(3);

    /* renamed from: c, reason: collision with root package name */
    public final String f13950c;

    /* renamed from: e, reason: collision with root package name */
    public final Map f13951e;

    public C1501a(String str, Map map) {
        this.f13950c = str;
        this.f13951e = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1501a)) {
            return false;
        }
        C1501a c1501a = (C1501a) obj;
        return AbstractC1276k.b(this.f13950c, c1501a.f13950c) && AbstractC1276k.b(this.f13951e, c1501a.f13951e);
    }

    public final int hashCode() {
        return this.f13951e.hashCode() + (this.f13950c.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f13950c + ", extras=" + this.f13951e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this.f13950c);
        Map map = this.f13951e;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
