package r0;

import X3.y;
import m4.AbstractC1277l;
import o0.s;
import q0.InterfaceC1498d;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1627a extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1627a f14531f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1627a f14532g;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f14533e;

    static {
        int i6 = 1;
        f14531f = new C1627a(i6, 0);
        f14532g = new C1627a(i6, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1627a(int i6, int i7) {
        super(i6);
        this.f14533e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f14533e) {
            case 0:
                return y.a;
            default:
                InterfaceC1498d.n0((InterfaceC1498d) obj, s.f13480g, 0L, 0L, S.l.f7374V, 126);
                return y.a;
        }
    }
}
