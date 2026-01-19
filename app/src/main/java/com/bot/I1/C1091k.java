package i1;

import F0.InterfaceC0134w;
import android.os.Handler;
import android.os.Looper;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: i1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1091k extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f11995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1105y f11996f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1091k(C1105y c1105y, int i6) {
        super(1);
        this.f11995e = i6;
        this.f11996f = c1105y;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f11995e) {
            case 0:
                InterfaceC0134w I5 = ((InterfaceC0134w) obj).I();
                AbstractC1276k.c(I5);
                this.f11996f.n(I5);
                return X3.y.a;
            case 1:
                e1.l lVar = new e1.l(((e1.l) obj).a);
                C1105y c1105y = this.f11996f;
                c1105y.m15setPopupContentSizefhxjrPA(lVar);
                c1105y.o();
                return X3.y.a;
            default:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj;
                C1105y c1105y2 = this.f11996f;
                Handler handler = c1105y2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1193a.b();
                } else {
                    Handler handler2 = c1105y2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new I.c(5, interfaceC1193a));
                    }
                }
                return X3.y.a;
        }
    }
}
