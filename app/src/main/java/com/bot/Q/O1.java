package Q;

import S2.AbstractC0565e;
import T.C0626q;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final /* synthetic */ class O1 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5454c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5455e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f5457g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5458h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5459i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5460j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5461k;

    public /* synthetic */ O1(String str, InterfaceC1041r interfaceC1041r, boolean z5, S0.P p5, boolean z6, int i6, int i7) {
        this.f5454c = 2;
        this.f5460j = str;
        this.f5456f = interfaceC1041r;
        this.f5455e = z5;
        this.f5461k = p5;
        this.f5457g = z6;
        this.f5458h = i6;
        this.f5459i = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5454c) {
            case 0:
                ((Integer) obj2).getClass();
                P1.a(this.f5455e, (InterfaceC1193a) this.f5460j, this.f5456f, this.f5457g, (N1) this.f5461k, (C0626q) obj, T.r.J(this.f5458h | 1), this.f5459i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                a3.a(this.f5455e, (l4.c) this.f5460j, this.f5456f, this.f5457g, (Y2) this.f5461k, (C0626q) obj, T.r.J(this.f5458h | 1), this.f5459i);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0565e.c((String) this.f5460j, this.f5456f, this.f5455e, (S0.P) this.f5461k, this.f5457g, (C0626q) obj, T.r.J(this.f5458h | 1), this.f5459i);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ O1(boolean z5, X3.e eVar, InterfaceC1041r interfaceC1041r, boolean z6, Object obj, int i6, int i7, int i8) {
        this.f5454c = i8;
        this.f5455e = z5;
        this.f5460j = eVar;
        this.f5456f = interfaceC1041r;
        this.f5457g = z6;
        this.f5461k = obj;
        this.f5458h = i6;
        this.f5459i = i7;
    }
}
