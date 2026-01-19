package m;

import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1028e;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;
import n.y0;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1225g extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12802e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0 f12803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l4.c f12804g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f12805h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C0873f f12806i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f12807j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f12808k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f12809l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225g(y0 y0Var, InterfaceC1041r interfaceC1041r, l4.c cVar, InterfaceC1028e interfaceC1028e, l4.c cVar2, C0873f c0873f, int i6) {
        super(2);
        this.f12803f = y0Var;
        this.f12805h = interfaceC1041r;
        this.f12804g = cVar;
        this.f12809l = interfaceC1028e;
        this.f12808k = cVar2;
        this.f12806i = c0873f;
        this.f12807j = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f12802e) {
            case 0:
                ((Number) obj2).intValue();
                InterfaceC1028e interfaceC1028e = (InterfaceC1028e) this.f12809l;
                l4.c cVar = (l4.c) this.f12808k;
                AbstractC1227i.b(this.f12803f, this.f12805h, this.f12804g, interfaceC1028e, cVar, this.f12806i, (C0626q) obj, T.r.J(this.f12807j | 1));
                return X3.y.a;
            default:
                ((Number) obj2).intValue();
                C1210Q c1210q = (C1210Q) this.f12808k;
                C1211S c1211s = (C1211S) this.f12809l;
                AbstractC1244z.d(this.f12803f, this.f12804g, this.f12805h, c1210q, c1211s, this.f12806i, (C0626q) obj, T.r.J(this.f12807j | 1));
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225g(y0 y0Var, l4.c cVar, InterfaceC1041r interfaceC1041r, C1210Q c1210q, C1211S c1211s, C0873f c0873f, int i6) {
        super(2);
        this.f12803f = y0Var;
        this.f12804g = cVar;
        this.f12805h = interfaceC1041r;
        this.f12808k = c1210q;
        this.f12809l = c1211s;
        this.f12806i = c0873f;
        this.f12807j = i6;
    }
}
