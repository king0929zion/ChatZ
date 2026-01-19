package X2;

import android.content.Intent;
import b4.InterfaceC0905c;
import com.bot.feature.chat.data.ChatService;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class I extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ L f9187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(L l3, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f9187h = l3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        I i6 = (I) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj);
        X3.y yVar = X3.y.a;
        i6.r(yVar);
        return yVar;
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new I(this.f9187h, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        L l3 = this.f9187h;
        X3.a.e(obj);
        try {
            Intent intent = new Intent(l3.f9212m, (Class<?>) ChatService.class);
            intent.setAction("SHOW_NOTIFICATION");
            l3.f9212m.startService(intent);
        } catch (Exception unused) {
        }
        return X3.y.a;
    }
}
