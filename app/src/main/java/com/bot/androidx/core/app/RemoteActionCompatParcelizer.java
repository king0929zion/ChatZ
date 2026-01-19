package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import e2.AbstractC0962a;
import e2.C0963b;
import e2.c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC0962a abstractC0962a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.a;
        boolean z5 = true;
        if (abstractC0962a.e(1)) {
            cVar = abstractC0962a.g();
        }
        remoteActionCompat.a = (IconCompat) cVar;
        CharSequence charSequence = remoteActionCompat.f10785b;
        if (abstractC0962a.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0963b) abstractC0962a).f11584e);
        }
        remoteActionCompat.f10785b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f10786c;
        if (abstractC0962a.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C0963b) abstractC0962a).f11584e);
        }
        remoteActionCompat.f10786c = charSequence2;
        remoteActionCompat.f10787d = (PendingIntent) abstractC0962a.f(remoteActionCompat.f10787d, 4);
        boolean z6 = remoteActionCompat.f10788e;
        if (abstractC0962a.e(5)) {
            z6 = ((C0963b) abstractC0962a).f11584e.readInt() != 0;
        }
        remoteActionCompat.f10788e = z6;
        boolean z7 = remoteActionCompat.f10789f;
        if (!abstractC0962a.e(6)) {
            z5 = z7;
        } else if (((C0963b) abstractC0962a).f11584e.readInt() == 0) {
            z5 = false;
        }
        remoteActionCompat.f10789f = z5;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0962a abstractC0962a) {
        abstractC0962a.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        abstractC0962a.h(1);
        abstractC0962a.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f10785b;
        abstractC0962a.h(2);
        Parcel parcel = ((C0963b) abstractC0962a).f11584e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f10786c;
        abstractC0962a.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f10787d;
        abstractC0962a.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z5 = remoteActionCompat.f10788e;
        abstractC0962a.h(5);
        parcel.writeInt(z5 ? 1 : 0);
        boolean z6 = remoteActionCompat.f10789f;
        abstractC0962a.h(6);
        parcel.writeInt(z6 ? 1 : 0);
    }
}
