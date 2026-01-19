package N2;

import S.l;
import X3.y;
import Z2.B;
import Z2.Z0;
import android.os.Handler;
import android.webkit.WebView;
import m4.AbstractC1276k;
import n0.C1353b;
import w0.InterfaceC1830a;

/* loaded from: classes.dex */
public final class e implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3816c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3818f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3819g;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i6) {
        this.f3816c = i6;
        this.f3817e = obj;
        this.f3818f = obj2;
        this.f3819g = obj3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f3816c) {
            case 0:
                ((Handler) this.f3817e).removeCallbacks((C4.g) this.f3818f);
                ((WebView) this.f3819g).destroy();
                return y.a;
            case 1:
                long j3 = ((C1353b) obj).a;
                ((InterfaceC1830a) this.f3817e).a(0);
                B b5 = (B) this.f3818f;
                String str = (String) this.f3819g;
                b5.getClass();
                b5.f9893f.setValue(str);
                b5.a(l.f7374V);
                b5.f9895h = false;
                return y.a;
            default:
                long j4 = ((C1353b) obj).a;
                ((InterfaceC1830a) this.f3817e).a(0);
                Z0 z02 = (Z0) this.f3818f;
                String str2 = (String) this.f3819g;
                z02.getClass();
                AbstractC1276k.f(str2, "providerId");
                z02.f10137f.setValue(str2);
                z02.f10138g.h(l.f7374V);
                z02.f10139h = false;
                return y.a;
        }
    }
}
