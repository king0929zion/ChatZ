package I;

import D.Y;
import X3.y;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2068c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f2069e;

    public /* synthetic */ a(i iVar, int i6) {
        this.f2068c = i6;
        this.f2069e = iVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f2068c) {
            case 0:
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) obj;
                View view = this.f2069e.a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1193a.b();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new c(0, interfaceC1193a));
                    }
                }
                return y.a;
            case 1:
                ActionMode actionMode = this.f2069e.f2092h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return y.a;
            case 2:
                ActionMode actionMode2 = this.f2069e.f2092h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return y.a;
            default:
                i iVar = this.f2069e;
                iVar.f2089e.e();
                return new Y(iVar, 1);
        }
    }
}
