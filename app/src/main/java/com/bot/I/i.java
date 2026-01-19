package I;

import A4.C0013n;
import X3.y;
import android.view.ActionMode;
import android.view.View;
import c4.EnumC0927a;
import f0.C1001x;
import l4.InterfaceC1193a;
import p.A0;
import p.C0;
import p.x0;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public final class i implements K.f {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f2086b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1193a f2087c;

    /* renamed from: d, reason: collision with root package name */
    public final C0 f2088d = new C0();

    /* renamed from: e, reason: collision with root package name */
    public final C1001x f2089e = new C1001x(new a(this, 0));

    /* renamed from: f, reason: collision with root package name */
    public final a f2090f = new a(this, 1);

    /* renamed from: g, reason: collision with root package name */
    public final a f2091g = new a(this, 2);

    /* renamed from: h, reason: collision with root package name */
    public ActionMode f2092h;

    /* renamed from: i, reason: collision with root package name */
    public g f2093i;

    /* renamed from: j, reason: collision with root package name */
    public Runnable f2094j;

    public i(View view, l4.c cVar, InterfaceC1193a interfaceC1193a) {
        this.a = view;
        this.f2086b = cVar;
        this.f2087c = interfaceC1193a;
    }

    @Override // K.f
    public final Object a(K.e eVar, d4.i iVar) {
        C0013n c0013n = new C0013n(this, eVar, null, 1);
        C0 c02 = this.f2088d;
        c02.getClass();
        Object l3 = AbstractC1888A.l(new A0(x0.f13823c, c02, c0013n, null), iVar);
        return l3 == EnumC0927a.f11114c ? l3 : y.a;
    }
}
