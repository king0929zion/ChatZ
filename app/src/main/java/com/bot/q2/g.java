package Q2;

import S0.P;
import S2.AbstractC0565e;
import S2.C0584p;
import T.C0626q;
import T.d1;
import T.r;
import X3.y;
import Z2.AbstractC0783w;
import com.bot.core.model.LLMSetting;
import h0.InterfaceC1041r;
import java.util.List;
import l4.InterfaceC1193a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6405c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f6407f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6408g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f6409h;

    public /* synthetic */ g(Object obj, boolean z5, Object obj2, Object obj3, int i6, int i7) {
        this.f6405c = i7;
        this.f6406e = obj;
        this.f6407f = z5;
        this.f6408g = obj2;
        this.f6409h = obj3;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6405c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = r.J(1);
                a.a((String) this.f6406e, (String) this.f6408g, this.f6407f, (InterfaceC1193a) this.f6409h, (C0626q) obj, J4);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int J5 = r.J(1);
                AbstractC0565e.u((String) this.f6406e, (P) this.f6408g, (InterfaceC1041r) this.f6409h, this.f6407f, (C0626q) obj, J5);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int J6 = r.J(1);
                AbstractC0565e.j((String) this.f6406e, (C0584p) this.f6408g, (P) this.f6409h, this.f6407f, (C0626q) obj, J6);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int J7 = r.J(1);
                AbstractC0565e.p((String) this.f6406e, (String) this.f6408g, (P) this.f6409h, this.f6407f, (C0626q) obj, J7);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int J8 = r.J(3073);
                U2.a.d((List) this.f6406e, this.f6407f, (d1) this.f6408g, (InterfaceC1041r) this.f6409h, (C0626q) obj, J8);
                break;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                int J9 = r.J(1);
                AbstractC0783w.b((LLMSetting) this.f6406e, this.f6407f, (InterfaceC1041r) this.f6408g, (InterfaceC1193a) this.f6409h, (C0626q) obj, J9);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int J10 = r.J(3073);
                AbstractC0783w.i((String) this.f6406e, this.f6407f, (InterfaceC1193a) this.f6409h, (InterfaceC1193a) this.f6408g, (C0626q) obj, J10);
                break;
            default:
                ((Integer) obj2).getClass();
                int J11 = r.J(1);
                AbstractC0783w.J((InterfaceC1041r) this.f6406e, this.f6407f, (InterfaceC1193a) this.f6409h, (InterfaceC1193a) this.f6408g, (C0626q) obj, J11);
                break;
        }
        return y.a;
    }

    public /* synthetic */ g(Object obj, boolean z5, InterfaceC1193a interfaceC1193a, InterfaceC1193a interfaceC1193a2, int i6, int i7) {
        this.f6405c = i7;
        this.f6406e = obj;
        this.f6407f = z5;
        this.f6409h = interfaceC1193a;
        this.f6408g = interfaceC1193a2;
    }

    public /* synthetic */ g(String str, Object obj, Object obj2, boolean z5, int i6, int i7) {
        this.f6405c = i7;
        this.f6406e = str;
        this.f6408g = obj;
        this.f6409h = obj2;
        this.f6407f = z5;
    }

    public /* synthetic */ g(String str, String str2, boolean z5, InterfaceC1193a interfaceC1193a, int i6) {
        this.f6405c = 0;
        this.f6406e = str;
        this.f6408g = str2;
        this.f6407f = z5;
        this.f6409h = interfaceC1193a;
    }
}
