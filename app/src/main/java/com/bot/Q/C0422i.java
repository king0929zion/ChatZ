package Q;

import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;

/* renamed from: Q.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0422i implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l4.e f5855c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l4.e f5856e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0.L f5857f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f5858g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f5859h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f5860i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f5861j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f5862k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l4.e f5863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0873f f5864m;

    public C0422i(l4.e eVar, l4.e eVar2, o0.L l3, long j3, float f6, long j4, long j5, long j6, l4.e eVar3, C0873f c0873f) {
        this.f5855c = eVar;
        this.f5856e = eVar2;
        this.f5857f = l3;
        this.f5858g = j3;
        this.f5859h = f6;
        this.f5860i = j4;
        this.f5861j = j5;
        this.f5862k = j6;
        this.f5863l = eVar3;
        this.f5864m = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        C0626q c0626q = (C0626q) obj;
        int intValue = ((Number) obj2).intValue();
        if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
            AbstractC0426j.a(AbstractC0874g.c(1367541877, new C0418h(this.f5863l, this.f5864m, 1), c0626q), null, this.f5855c, this.f5856e, this.f5857f, this.f5858g, this.f5859h, O.d(S.g.a, c0626q), this.f5860i, this.f5861j, this.f5862k, c0626q, 6);
        } else {
            c0626q.V();
        }
        return X3.y.a;
    }
}
