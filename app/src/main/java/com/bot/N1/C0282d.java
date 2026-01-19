package N1;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: N1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0282d implements InterfaceC0283e {

    /* renamed from: c, reason: collision with root package name */
    public IBinder f3740c;

    @Override // N1.InterfaceC0283e
    public final void a(String[] strArr) {
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0283e.a);
            obtain.writeStringArray(strArr);
            this.f3740c.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3740c;
    }
}
