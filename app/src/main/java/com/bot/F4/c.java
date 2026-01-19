package F4;

import C4.s;
import C4.u;
import x4.InterfaceC1900M;

/* loaded from: classes.dex */
public final class c {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.f f1608b;

    /* renamed from: c, reason: collision with root package name */
    public final l4.f f1609c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1610d;

    /* renamed from: e, reason: collision with root package name */
    public final d4.i f1611e;

    /* renamed from: f, reason: collision with root package name */
    public final l4.f f1612f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1613g;

    /* renamed from: h, reason: collision with root package name */
    public int f1614h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f1615i;

    public c(e eVar, Object obj, l4.f fVar, l4.f fVar2, u uVar, d4.i iVar, l4.f fVar3) {
        this.f1615i = eVar;
        this.a = obj;
        this.f1608b = fVar;
        this.f1609c = fVar2;
        this.f1610d = uVar;
        this.f1611e = iVar;
        this.f1612f = fVar3;
    }

    public final void a() {
        Object obj = this.f1613g;
        if (obj instanceof s) {
            ((s) obj).h(this.f1614h, this.f1615i.f1621c);
            return;
        }
        InterfaceC1900M interfaceC1900M = obj instanceof InterfaceC1900M ? (InterfaceC1900M) obj : null;
        if (interfaceC1900M != null) {
            interfaceC1900M.dispose();
        }
    }
}
