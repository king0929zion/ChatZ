package Q;

import R.AbstractC0507l;
import R2.AbstractC0530j;
import T.C0626q;
import b0.C0873f;
import h0.InterfaceC1041r;
import i1.InterfaceC1078B;
import l4.InterfaceC1193a;
import q.AbstractC1494f;
import q.C1491c;
import t.C1682j;
import v.AbstractC1787b;
import v.InterfaceC1802i0;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final /* synthetic */ class L implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5345c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f5348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f5349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f5350i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f5351j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f5352k;

    public /* synthetic */ L(C0873f c0873f, InterfaceC1193a interfaceC1193a, InterfaceC1041r interfaceC1041r, boolean z5, G0 g02, InterfaceC1802i0 interfaceC1802i0, int i6) {
        this.f5345c = 1;
        this.f5349h = c0873f;
        this.f5350i = interfaceC1193a;
        this.f5346e = interfaceC1041r;
        this.f5347f = z5;
        this.f5351j = g02;
        this.f5352k = interfaceC1802i0;
        this.f5348g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5345c) {
            case 0:
                ((Integer) obj2).getClass();
                M.b(this.f5347f, (R0.a) this.f5349h, (InterfaceC1041r) this.f5346e, (G) this.f5350i, (q0.h) this.f5351j, (q0.h) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                K0.b((C0873f) this.f5349h, (InterfaceC1193a) this.f5350i, (InterfaceC1041r) this.f5346e, this.f5347f, (G0) this.f5351j, (InterfaceC1802i0) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0492z2.d((InterfaceC1041r) this.f5346e, (C2) this.f5349h, this.f5347f, (C1682j) this.f5350i, (C0873f) this.f5351j, (C0873f) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                o3.b((InterfaceC1078B) this.f5349h, (C0873f) this.f5350i, (s3) this.f5351j, (InterfaceC1041r) this.f5346e, this.f5347f, (C0873f) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC0507l.e((InterfaceC1078B) this.f5349h, (s3) this.f5346e, (InterfaceC1942y) this.f5350i, this.f5347f, (T.X) this.f5351j, (C0873f) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            case AbstractC1787b.f15290g /* 5 */:
                ((Integer) obj2).getClass();
                AbstractC0530j.k((String) this.f5349h, (l4.c) this.f5346e, (R2.A) this.f5350i, this.f5347f, (l4.c) this.f5351j, (InterfaceC1193a) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1494f.c((String) this.f5349h, this.f5347f, (C1491c) this.f5350i, (InterfaceC1041r) this.f5346e, (l4.f) this.f5351j, (InterfaceC1193a) this.f5352k, (C0626q) obj, T.r.J(this.f5348g | 1));
                break;
        }
        return X3.y.a;
    }

    public /* synthetic */ L(InterfaceC1041r interfaceC1041r, C2 c22, boolean z5, C1682j c1682j, C0873f c0873f, C0873f c0873f2, int i6) {
        this.f5345c = 2;
        this.f5346e = interfaceC1041r;
        this.f5349h = c22;
        this.f5347f = z5;
        this.f5350i = c1682j;
        this.f5351j = c0873f;
        this.f5352k = c0873f2;
        this.f5348g = i6;
    }

    public /* synthetic */ L(InterfaceC1078B interfaceC1078B, C0873f c0873f, s3 s3Var, InterfaceC1041r interfaceC1041r, boolean z5, C0873f c0873f2, int i6) {
        this.f5345c = 3;
        this.f5349h = interfaceC1078B;
        this.f5350i = c0873f;
        this.f5351j = s3Var;
        this.f5346e = interfaceC1041r;
        this.f5347f = z5;
        this.f5352k = c0873f2;
        this.f5348g = i6;
    }

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, boolean z5, Object obj4, X3.e eVar, int i6, int i7) {
        this.f5345c = i7;
        this.f5349h = obj;
        this.f5346e = obj2;
        this.f5350i = obj3;
        this.f5347f = z5;
        this.f5351j = obj4;
        this.f5352k = eVar;
        this.f5348g = i6;
    }

    public /* synthetic */ L(String str, boolean z5, C1491c c1491c, InterfaceC1041r interfaceC1041r, l4.f fVar, InterfaceC1193a interfaceC1193a, int i6) {
        this.f5345c = 6;
        this.f5349h = str;
        this.f5347f = z5;
        this.f5350i = c1491c;
        this.f5346e = interfaceC1041r;
        this.f5351j = fVar;
        this.f5352k = interfaceC1193a;
        this.f5348g = i6;
    }

    public /* synthetic */ L(boolean z5, R0.a aVar, InterfaceC1041r interfaceC1041r, G g3, q0.h hVar, q0.h hVar2, int i6) {
        this.f5345c = 0;
        this.f5347f = z5;
        this.f5349h = aVar;
        this.f5346e = interfaceC1041r;
        this.f5350i = g3;
        this.f5351j = hVar;
        this.f5352k = hVar2;
        this.f5348g = i6;
    }
}
