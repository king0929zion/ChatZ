package U2;

import T.C0626q;
import T.d1;
import T.r;
import X2.C0692g;
import X3.y;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8615c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f8617f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8618g;

    public /* synthetic */ c(long j3, C0692g c0692g, int i6) {
        this.f8615c = 2;
        this.f8617f = j3;
        this.f8616e = c0692g;
        this.f8618g = i6;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f8615c) {
            case 0:
                ((Integer) obj2).intValue();
                int J4 = r.J(this.f8618g | 1);
                a.a((d1) this.f8616e, this.f8617f, (C0626q) obj, J4);
                break;
            case 1:
                ((Integer) obj2).intValue();
                int J5 = r.J(this.f8618g | 1);
                a.a((d1) this.f8616e, this.f8617f, (C0626q) obj, J5);
                break;
            default:
                ((Integer) obj2).intValue();
                int J6 = r.J(this.f8618g | 1);
                Y4.l.c(this.f8617f, (C0692g) this.f8616e, (C0626q) obj, J6);
                break;
        }
        return y.a;
    }

    public /* synthetic */ c(d1 d1Var, long j3, int i6, int i7) {
        this.f8615c = i7;
        this.f8616e = d1Var;
        this.f8617f = j3;
        this.f8618g = i6;
    }
}
