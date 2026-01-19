package T;

import f0.AbstractC0992o;
import f0.C0982e;
import f0.C0989l;

/* loaded from: classes.dex */
public final class U implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8033c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.c f8034e;

    public /* synthetic */ U(l4.c cVar, int i6) {
        this.f8033c = i6;
        this.f8034e = cVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        long j3;
        switch (this.f8033c) {
            case 0:
                return this.f8034e.f(Long.valueOf(((Number) obj).longValue() / 1000000));
            default:
                C0989l c0989l = (C0989l) obj;
                synchronized (AbstractC0992o.f11707c) {
                    j3 = AbstractC0992o.f11709e;
                    AbstractC0992o.f11709e = 1 + j3;
                }
                return new C0982e(j3, c0989l, this.f8034e);
        }
    }
}
