package n;

import T.C0607g0;
import l4.InterfaceC1193a;

/* renamed from: n.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332k {
    public final E0 a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13168b;

    /* renamed from: c, reason: collision with root package name */
    public final long f13169c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1193a f13170d;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f13171e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1343r f13172f;

    /* renamed from: g, reason: collision with root package name */
    public long f13173g;

    /* renamed from: h, reason: collision with root package name */
    public long f13174h = Long.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public final C0607g0 f13175i = T.r.A(Boolean.TRUE);

    public C1332k(Object obj, E0 e02, AbstractC1343r abstractC1343r, long j3, Object obj2, long j4, InterfaceC1193a interfaceC1193a) {
        this.a = e02;
        this.f13168b = obj2;
        this.f13169c = j4;
        this.f13170d = interfaceC1193a;
        this.f13171e = T.r.A(obj);
        this.f13172f = AbstractC1318d.k(abstractC1343r);
        this.f13173g = j3;
    }

    public final void a() {
        this.f13175i.setValue(Boolean.FALSE);
        this.f13170d.b();
    }
}
