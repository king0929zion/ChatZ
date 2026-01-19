package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.vladsch.flexmark.util.sequence.builder.SegmentStats;
import e2.AbstractC0962a;
import e2.C0963b;
import java.nio.charset.Charset;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC0962a abstractC0962a) {
        IconCompat iconCompat = new IconCompat();
        int i6 = iconCompat.a;
        if (abstractC0962a.e(1)) {
            i6 = ((C0963b) abstractC0962a).f11584e.readInt();
        }
        iconCompat.a = i6;
        byte[] bArr = iconCompat.f10798c;
        if (abstractC0962a.e(2)) {
            Parcel parcel = ((C0963b) abstractC0962a).f11584e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f10798c = bArr;
        iconCompat.f10799d = abstractC0962a.f(iconCompat.f10799d, 3);
        int i7 = iconCompat.f10800e;
        if (abstractC0962a.e(4)) {
            i7 = ((C0963b) abstractC0962a).f11584e.readInt();
        }
        iconCompat.f10800e = i7;
        int i8 = iconCompat.f10801f;
        if (abstractC0962a.e(5)) {
            i8 = ((C0963b) abstractC0962a).f11584e.readInt();
        }
        iconCompat.f10801f = i8;
        iconCompat.f10802g = (ColorStateList) abstractC0962a.f(iconCompat.f10802g, 6);
        String str = iconCompat.f10804i;
        if (abstractC0962a.e(7)) {
            str = ((C0963b) abstractC0962a).f11584e.readString();
        }
        iconCompat.f10804i = str;
        String str2 = iconCompat.f10805j;
        if (abstractC0962a.e(8)) {
            str2 = ((C0963b) abstractC0962a).f11584e.readString();
        }
        iconCompat.f10805j = str2;
        iconCompat.f10803h = PorterDuff.Mode.valueOf(iconCompat.f10804i);
        switch (iconCompat.a) {
            case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                Parcelable parcelable = iconCompat.f10799d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f10797b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case AbstractC1787b.f15290g /* 5 */:
                Parcelable parcelable2 = iconCompat.f10799d;
                if (parcelable2 != null) {
                    iconCompat.f10797b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f10798c;
                iconCompat.f10797b = bArr3;
                iconCompat.a = 3;
                iconCompat.f10800e = 0;
                iconCompat.f10801f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f10798c, Charset.forName("UTF-16"));
                iconCompat.f10797b = str3;
                if (iconCompat.a == 2 && iconCompat.f10805j == null) {
                    iconCompat.f10805j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f10797b = iconCompat.f10798c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC0962a abstractC0962a) {
        abstractC0962a.getClass();
        iconCompat.f10804i = iconCompat.f10803h.name();
        switch (iconCompat.a) {
            case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                iconCompat.f10799d = (Parcelable) iconCompat.f10797b;
                break;
            case 1:
            case AbstractC1787b.f15290g /* 5 */:
                iconCompat.f10799d = (Parcelable) iconCompat.f10797b;
                break;
            case 2:
                iconCompat.f10798c = ((String) iconCompat.f10797b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f10798c = (byte[]) iconCompat.f10797b;
                break;
            case 4:
            case 6:
                iconCompat.f10798c = iconCompat.f10797b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i6 = iconCompat.a;
        if (-1 != i6) {
            abstractC0962a.h(1);
            ((C0963b) abstractC0962a).f11584e.writeInt(i6);
        }
        byte[] bArr = iconCompat.f10798c;
        if (bArr != null) {
            abstractC0962a.h(2);
            Parcel parcel = ((C0963b) abstractC0962a).f11584e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f10799d;
        if (parcelable != null) {
            abstractC0962a.h(3);
            ((C0963b) abstractC0962a).f11584e.writeParcelable(parcelable, 0);
        }
        int i7 = iconCompat.f10800e;
        if (i7 != 0) {
            abstractC0962a.h(4);
            ((C0963b) abstractC0962a).f11584e.writeInt(i7);
        }
        int i8 = iconCompat.f10801f;
        if (i8 != 0) {
            abstractC0962a.h(5);
            ((C0963b) abstractC0962a).f11584e.writeInt(i8);
        }
        ColorStateList colorStateList = iconCompat.f10802g;
        if (colorStateList != null) {
            abstractC0962a.h(6);
            ((C0963b) abstractC0962a).f11584e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f10804i;
        if (str != null) {
            abstractC0962a.h(7);
            ((C0963b) abstractC0962a).f11584e.writeString(str);
        }
        String str2 = iconCompat.f10805j;
        if (str2 != null) {
            abstractC0962a.h(8);
            ((C0963b) abstractC0962a).f11584e.writeString(str2);
        }
    }
}
