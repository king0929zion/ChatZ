package c;

import T.C0626q;
import T.r;
import X3.y;
import Y3.C;
import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* loaded from: classes.dex */
public final class g extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f11078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1193a f11079f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11080g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f11081h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z5, InterfaceC1193a interfaceC1193a, int i6, int i7) {
        super(2);
        this.f11078e = z5;
        this.f11079f = interfaceC1193a;
        this.f11080g = i6;
        this.f11081h = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int J4 = r.J(this.f11080g | 1);
        int i6 = this.f11081h;
        C.a(this.f11078e, this.f11079f, (C0626q) obj, J4, i6);
        return y.a;
    }
}
