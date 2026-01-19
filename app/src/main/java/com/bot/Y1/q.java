package y1;

import java.nio.ByteBuffer;
import z1.C2016a;

/* loaded from: classes.dex */
public final class q {
    public int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final t f15989b;

    /* renamed from: c, reason: collision with root package name */
    public t f15990c;

    /* renamed from: d, reason: collision with root package name */
    public t f15991d;

    /* renamed from: e, reason: collision with root package name */
    public int f15992e;

    /* renamed from: f, reason: collision with root package name */
    public int f15993f;

    public q(t tVar) {
        this.f15989b = tVar;
        this.f15990c = tVar;
    }

    public final void a() {
        this.a = 1;
        this.f15990c = this.f15989b;
        this.f15993f = 0;
    }

    public final boolean b() {
        C2016a b5 = this.f15990c.f16002b.b();
        int a = b5.a(6);
        return !(a == 0 || ((ByteBuffer) b5.f10524g).get(a + b5.f10521c) == 0) || this.f15992e == 65039;
    }
}
