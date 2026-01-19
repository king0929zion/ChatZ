package N1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import m4.AbstractC1276k;

/* renamed from: N1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0287i extends Binder implements InterfaceC0284f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f3750c;

    public BinderC0287i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f3750c = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC0284f.f3741b);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // N1.InterfaceC0284f
    public final void b(int i6, String[] strArr) {
        AbstractC1276k.f(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3750c;
        synchronized (multiInstanceInvalidationService.f10894f) {
            String str = (String) multiInstanceInvalidationService.f10893e.get(Integer.valueOf(i6));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.f10894f.beginBroadcast();
            for (int i7 = 0; i7 < beginBroadcast; i7++) {
                try {
                    Object broadcastCookie = multiInstanceInvalidationService.f10894f.getBroadcastCookie(i7);
                    AbstractC1276k.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                    Integer num = (Integer) broadcastCookie;
                    int intValue = num.intValue();
                    String str2 = (String) multiInstanceInvalidationService.f10893e.get(num);
                    if (i6 != intValue && str.equals(str2)) {
                        try {
                            ((InterfaceC0283e) multiInstanceInvalidationService.f10894f.getBroadcastItem(i7)).a(strArr);
                        } catch (RemoteException e6) {
                            Log.w("ROOM", "Error invoking a remote callback", e6);
                        }
                    }
                } finally {
                    multiInstanceInvalidationService.f10894f.finishBroadcast();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, N1.d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, N1.d] */
    @Override // android.os.Binder
    public final boolean onTransact(int i6, Parcel parcel, Parcel parcel2, int i7) {
        String str = InterfaceC0284f.f3741b;
        if (i6 >= 1 && i6 <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i6 == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC0283e interfaceC0283e = null;
        InterfaceC0283e interfaceC0283e2 = null;
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    return super.onTransact(i6, parcel, parcel2, i7);
                }
                b(parcel.readInt(), parcel.createStringArray());
                return true;
            }
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(InterfaceC0283e.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof InterfaceC0283e)) {
                    Object obj = new Object();
                    obj.f3740c = readStrongBinder;
                    interfaceC0283e2 = obj;
                } else {
                    interfaceC0283e2 = (InterfaceC0283e) queryLocalInterface;
                }
            }
            int readInt = parcel.readInt();
            AbstractC1276k.f(interfaceC0283e2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.f3750c;
            synchronized (multiInstanceInvalidationService.f10894f) {
                multiInstanceInvalidationService.f10894f.unregister(interfaceC0283e2);
            }
            parcel2.writeNoException();
            return true;
        }
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(InterfaceC0283e.a);
            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof InterfaceC0283e)) {
                Object obj2 = new Object();
                obj2.f3740c = readStrongBinder2;
                interfaceC0283e = obj2;
            } else {
                interfaceC0283e = (InterfaceC0283e) queryLocalInterface2;
            }
        }
        String readString = parcel.readString();
        AbstractC1276k.f(interfaceC0283e, "callback");
        int i8 = 0;
        if (readString != null) {
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.f3750c;
            synchronized (multiInstanceInvalidationService2.f10894f) {
                try {
                    int i9 = multiInstanceInvalidationService2.f10892c + 1;
                    multiInstanceInvalidationService2.f10892c = i9;
                    if (multiInstanceInvalidationService2.f10894f.register(interfaceC0283e, Integer.valueOf(i9))) {
                        multiInstanceInvalidationService2.f10893e.put(Integer.valueOf(i9), readString);
                        i8 = i9;
                    } else {
                        multiInstanceInvalidationService2.f10892c--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        parcel2.writeInt(i8);
        return true;
    }
}
