package Q;

import T.C0626q;
import X2.C0692g;
import b0.C0873f;
import h0.InterfaceC1041r;
import l4.InterfaceC1193a;

/* renamed from: Q.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0435l0 implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5960c = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f5961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5965i;

    public /* synthetic */ C0435l0(String str, boolean z5, X2.L l3, C0692g c0692g, int i6) {
        this.f5962f = str;
        this.f5961e = z5;
        this.f5964h = l3;
        this.f5965i = c0692g;
        this.f5963g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5960c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0451p0.a(this.f5961e, (l4.c) this.f5962f, (InterfaceC1041r) this.f5964h, (C0873f) this.f5965i, (C0626q) obj, T.r.J(this.f5963g | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                Y4.l.f(this.f5961e, (InterfaceC1193a) this.f5964h, (X2.L) this.f5965i, (l4.c) this.f5962f, (C0626q) obj, T.r.J(this.f5963g | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                Y4.l.a((String) this.f5962f, this.f5961e, (X2.L) this.f5964h, (C0692g) this.f5965i, (C0626q) obj, T.r.J(this.f5963g | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ C0435l0(boolean z5, InterfaceC1193a interfaceC1193a, X2.L l3, l4.c cVar, int i6) {
        this.f5961e = z5;
        this.f5964h = interfaceC1193a;
        this.f5965i = l3;
        this.f5962f = cVar;
        this.f5963g = i6;
    }

    public /* synthetic */ C0435l0(boolean z5, l4.c cVar, InterfaceC1041r interfaceC1041r, C0873f c0873f, int i6) {
        this.f5961e = z5;
        this.f5962f = cVar;
        this.f5964h = interfaceC1041r;
        this.f5965i = c0873f;
        this.f5963g = i6;
    }
}
