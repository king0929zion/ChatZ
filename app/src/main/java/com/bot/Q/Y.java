package Q;

import H0.AbstractC0157l;

/* loaded from: classes.dex */
public final class Y implements o0.t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5592c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5593e;

    public /* synthetic */ Y(Object obj, int i6) {
        this.f5592c = i6;
        this.f5593e = obj;
    }

    @Override // o0.t
    public final long a() {
        switch (this.f5592c) {
            case 0:
                Z z5 = (Z) this.f5593e;
                long a = z5.f5633w.a();
                if (a != 16) {
                    return a;
                }
                Q1 q12 = (Q1) AbstractC0157l.h(z5, S1.a);
                if (q12 != null) {
                    long j3 = q12.a;
                    if (j3 != 16) {
                        return j3;
                    }
                }
                return ((o0.s) AbstractC0157l.h(z5, U.a)).a;
            default:
                return ((T1) this.f5593e).f5524c;
        }
    }
}
