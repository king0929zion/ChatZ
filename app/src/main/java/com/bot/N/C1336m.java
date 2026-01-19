package n;

import T.C0607g0;
import T.d1;

/* renamed from: n.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1336m implements d1 {

    /* renamed from: c, reason: collision with root package name */
    public final E0 f13185c;

    /* renamed from: e, reason: collision with root package name */
    public final C0607g0 f13186e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1343r f13187f;

    /* renamed from: g, reason: collision with root package name */
    public long f13188g;

    /* renamed from: h, reason: collision with root package name */
    public long f13189h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13190i;

    public /* synthetic */ C1336m(E0 e02, Object obj, AbstractC1343r abstractC1343r, int i6) {
        this(e02, obj, (i6 & 4) != 0 ? null : abstractC1343r, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final Object a() {
        return this.f13185c.f12988b.f(this.f13187f);
    }

    @Override // T.d1
    public final Object getValue() {
        return this.f13186e.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.f13186e.getValue() + ", velocity=" + a() + ", isRunning=" + this.f13190i + ", lastFrameTimeNanos=" + this.f13188g + ", finishedTimeNanos=" + this.f13189h + ')';
    }

    public C1336m(E0 e02, Object obj, AbstractC1343r abstractC1343r, long j3, long j4, boolean z5) {
        AbstractC1343r abstractC1343r2;
        this.f13185c = e02;
        this.f13186e = T.r.A(obj);
        if (abstractC1343r != null) {
            abstractC1343r2 = AbstractC1318d.k(abstractC1343r);
        } else {
            abstractC1343r2 = (AbstractC1343r) e02.a.f(obj);
            abstractC1343r2.d();
        }
        this.f13187f = abstractC1343r2;
        this.f13188g = j3;
        this.f13189h = j4;
        this.f13190i = z5;
    }
}
