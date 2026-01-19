package Q0;

import k.AbstractC1168o;
import k.C1147A;

/* loaded from: classes.dex */
public final class e {
    public final C1147A a;

    /* renamed from: b, reason: collision with root package name */
    public d f6337b;

    /* renamed from: c, reason: collision with root package name */
    public long f6338c;

    /* renamed from: d, reason: collision with root package name */
    public long f6339d;

    /* renamed from: e, reason: collision with root package name */
    public long f6340e;

    /* renamed from: f, reason: collision with root package name */
    public long f6341f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f6342g;

    public e() {
        C1147A c1147a = AbstractC1168o.a;
        this.a = new C1147A();
        this.f6338c = -1L;
        this.f6339d = 0L;
        this.f6340e = 0L;
    }

    public final void a(d dVar, long j3, long j4, float[] fArr, long j5) {
        long j6 = dVar.f6335g;
        if (j5 - j6 > 0 || j6 == Long.MIN_VALUE) {
            dVar.f6335g = j5;
            dVar.a(dVar.f6333e, dVar.f6334f, j3, j4, fArr);
        }
    }
}
