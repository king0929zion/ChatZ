package Q;

import T.C0626q;
import b0.C0873f;
import h0.C1032i;
import h0.InterfaceC1041r;
import v.AbstractC1787b;
import v.InterfaceC1793e;
import v.InterfaceC1797g;

/* loaded from: classes.dex */
public final /* synthetic */ class D implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5198c = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1041r f5199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0873f f5202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5203i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5204j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5205k;

    public /* synthetic */ D(InterfaceC1041r interfaceC1041r, o0.L l3, B b5, C c6, C0873f c0873f, int i6, int i7) {
        this.f5199e = interfaceC1041r;
        this.f5203i = l3;
        this.f5204j = b5;
        this.f5205k = c6;
        this.f5202h = c0873f;
        this.f5200f = i6;
        this.f5201g = i7;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5198c) {
            case 0:
                ((Integer) obj2).getClass();
                R1.c(this.f5199e, (o0.L) this.f5203i, (B) this.f5204j, (C) this.f5205k, this.f5202h, (C0626q) obj, T.r.J(this.f5200f | 1), this.f5201g);
                break;
            default:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(1572871);
                AbstractC1787b.b(this.f5199e, (InterfaceC1793e) this.f5203i, (InterfaceC1797g) this.f5204j, (C1032i) this.f5205k, this.f5200f, this.f5201g, this.f5202h, (C0626q) obj, J4);
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ D(InterfaceC1041r interfaceC1041r, InterfaceC1793e interfaceC1793e, InterfaceC1797g interfaceC1797g, C1032i c1032i, int i6, int i7, C0873f c0873f, int i8) {
        this.f5199e = interfaceC1041r;
        this.f5203i = interfaceC1793e;
        this.f5204j = interfaceC1797g;
        this.f5205k = c1032i;
        this.f5200f = i6;
        this.f5201g = i7;
        this.f5202h = c0873f;
    }
}
