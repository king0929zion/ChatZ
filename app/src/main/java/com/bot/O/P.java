package O;

import Q.AbstractC0426j;
import Q.D2;
import Q.L2;
import Q.s3;
import R.AbstractC0507l;
import T.C0626q;
import Z2.AbstractC0783w;
import a3.C0808F;
import a3.C0809G;
import a3.C0810H;
import b0.C0873f;
import b3.AbstractC0902r;
import h0.InterfaceC1041r;
import i1.C1102v;
import i1.InterfaceC1078B;
import l4.InterfaceC1193a;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class P implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4022c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4023e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4024f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4025g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f4026h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4027i;

    public /* synthetic */ P(C0808F c0808f, String str, InterfaceC1193a interfaceC1193a, l4.c cVar, int i6) {
        this.f4022c = 3;
        this.f4023e = c0808f;
        this.f4026h = str;
        this.f4024f = interfaceC1193a;
        this.f4027i = cVar;
        this.f4025g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f4022c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0336u0.b((InterfaceC1041r) this.f4023e, (G) this.f4026h, (l4.c) this.f4027i, (C0873f) this.f4024f, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0426j.d((InterfaceC1193a) this.f4026h, (InterfaceC1041r) this.f4023e, (C1102v) this.f4027i, (C0873f) this.f4024f, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0507l.b((InterfaceC1078B) this.f4023e, (C0873f) this.f4024f, (s3) this.f4026h, (C0873f) this.f4027i, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0783w.C((C0808F) this.f4023e, (String) this.f4026h, (InterfaceC1193a) this.f4024f, (l4.c) this.f4027i, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC0783w.G((C0810H) this.f4023e, (C0809G) this.f4026h, (l4.e) this.f4027i, (l4.e) this.f4024f, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).intValue();
                ((C0873f) this.f4024f).k(this.f4023e, this.f4026h, this.f4027i, (C0626q) obj, T.r.J(this.f4025g) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0902r.a((L2) this.f4023e, (String) this.f4026h, (InterfaceC1193a) this.f4027i, (D2) this.f4024f, (C0626q) obj, T.r.J(this.f4025g | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ P(C0873f c0873f, Object obj, Object obj2, Object obj3, int i6) {
        this.f4022c = 5;
        this.f4024f = c0873f;
        this.f4023e = obj;
        this.f4026h = obj2;
        this.f4027i = obj3;
        this.f4025g = i6;
    }

    public /* synthetic */ P(InterfaceC1078B interfaceC1078B, C0873f c0873f, s3 s3Var, C0873f c0873f2, int i6) {
        this.f4022c = 2;
        this.f4023e = interfaceC1078B;
        this.f4024f = c0873f;
        this.f4026h = s3Var;
        this.f4027i = c0873f2;
        this.f4025g = i6;
    }

    public /* synthetic */ P(Object obj, Object obj2, X3.e eVar, Object obj3, int i6, int i7) {
        this.f4022c = i7;
        this.f4023e = obj;
        this.f4026h = obj2;
        this.f4027i = eVar;
        this.f4024f = obj3;
        this.f4025g = i6;
    }

    public /* synthetic */ P(InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, C1102v c1102v, C0873f c0873f, int i6) {
        this.f4022c = 1;
        this.f4026h = interfaceC1193a;
        this.f4023e = interfaceC1041r;
        this.f4027i = c1102v;
        this.f4024f = c0873f;
        this.f4025g = i6;
    }
}
