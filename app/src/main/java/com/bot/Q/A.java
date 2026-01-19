package Q;

import R.AbstractC0507l;
import T.C0626q;
import b0.AbstractC0874g;
import v.InterfaceC1802i0;

/* loaded from: classes.dex */
public final class A implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5123c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f5124e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f5125f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X3.e f5126g;

    public /* synthetic */ A(long j3, Object obj, X3.e eVar, int i6) {
        this.f5123c = i6;
        this.f5124e = j3;
        this.f5125f = obj;
        this.f5126g = eVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f5123c) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC0507l.d(this.f5124e, ((t3) c0626q.j(u3.a)).f6132m, AbstractC0874g.c(417635459, new J1.m(3, (InterfaceC1802i0) this.f5125f, (l4.f) this.f5126g), c0626q), c0626q, 384);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
            default:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    R.l0.b(this.f5124e, (S0.P) this.f5125f, (l4.e) this.f5126g, c0626q2, 0);
                } else {
                    c0626q2.V();
                }
                return X3.y.a;
        }
    }
}
