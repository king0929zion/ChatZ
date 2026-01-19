package Q;

import R2.AbstractC0530j;
import T.C0626q;
import l4.InterfaceC1193a;

/* renamed from: Q.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0458r0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6067c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f6068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6069f;

    public /* synthetic */ C0458r0(int i6, int i7, InterfaceC1193a interfaceC1193a) {
        this.f6067c = i7;
        this.f6068e = interfaceC1193a;
        this.f6069f = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        Integer num = (Integer) obj2;
        switch (this.f6067c) {
            case 0:
                num.getClass();
                R1.j(this.f6068e, c0626q, T.r.J(this.f6069f | 1));
                break;
            default:
                num.intValue();
                AbstractC0530j.f(this.f6068e, c0626q, T.r.J(this.f6069f | 1));
                break;
        }
        return X3.y.a;
    }
}
