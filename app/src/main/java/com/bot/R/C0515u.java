package R;

import T.C0626q;
import b3.AbstractC0888d;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;

/* renamed from: R.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0515u implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6838c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6841g;

    public /* synthetic */ C0515u(int i6, int i7, Object obj, boolean z5) {
        this.f6838c = i7;
        this.f6839e = z5;
        this.f6841g = obj;
        this.f6840f = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f6838c) {
            case 0:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(this.f6840f | 1);
                AbstractC0507l.a(this.f6839e, (InterfaceC1193a) this.f6841g, (C0626q) obj, J4);
                break;
            default:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) this.f6841g;
                ((Integer) obj2).getClass();
                AbstractC0888d.f(T.r.J(this.f6840f | 1), (C0626q) obj, interfaceC1041r, this.f6839e);
                break;
        }
        return X3.y.a;
    }
}
