package r;

/* renamed from: r.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1579k implements InterfaceC1563e1 {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f14357c;

    public /* synthetic */ C1579k(int i6, Object obj, Object obj2) {
        this.a = i6;
        this.f14356b = obj;
        this.f14357c = obj2;
    }

    @Override // r.InterfaceC1563e1
    public final float a(float f6) {
        switch (this.a) {
            case 0:
                C1588n c1588n = (C1588n) this.f14356b;
                float c6 = c1588n.f14392L.c(f6);
                float g3 = c6 - c1588n.f14392L.f14472f.g();
                ((C1603s) this.f14357c).a(c6, S.l.f7374V);
                return g3;
            default:
                E1 e12 = (E1) this.f14356b;
                if (Math.abs(f6) == S.l.f7374V || ((Boolean) e12.f14019h.b()).booleanValue()) {
                    return e12.d(e12.g(((B1) this.f14357c).a(e12.e(e12.h(f6)), 2)));
                }
                throw new E0.b("The fling animation was cancelled", 2);
        }
    }
}
