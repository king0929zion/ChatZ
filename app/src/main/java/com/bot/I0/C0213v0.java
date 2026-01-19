package I0;

import l4.InterfaceC1193a;
import m4.AbstractC1277l;

/* renamed from: I0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213v0 extends AbstractC1277l implements InterfaceC1193a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2391e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ M.q f2392f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f2393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0213v0(boolean z5, M.q qVar, String str) {
        super(0);
        this.f2391e = z5;
        this.f2392f = qVar;
        this.f2393g = str;
    }

    @Override // l4.InterfaceC1193a
    public final Object b() {
        if (this.f2391e) {
            M.q qVar = this.f2392f;
            String str = this.f2393g;
            W1.a aVar = (W1.a) qVar.f3179e;
            synchronized (aVar.f8852c) {
            }
        }
        return X3.y.a;
    }
}
