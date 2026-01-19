package B0;

import j1.AbstractC1135a;
import java.util.ArrayList;
import n0.C1353b;

/* loaded from: classes.dex */
public final class A {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f368b;

    /* renamed from: c, reason: collision with root package name */
    public final long f369c;

    /* renamed from: d, reason: collision with root package name */
    public final long f370d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f371e;

    /* renamed from: f, reason: collision with root package name */
    public final float f372f;

    /* renamed from: g, reason: collision with root package name */
    public final int f373g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f374h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f375i;

    /* renamed from: j, reason: collision with root package name */
    public final long f376j;

    /* renamed from: k, reason: collision with root package name */
    public final long f377k;

    public A(long j3, long j4, long j5, long j6, boolean z5, float f6, int i6, boolean z6, ArrayList arrayList, long j7, long j8) {
        this.a = j3;
        this.f368b = j4;
        this.f369c = j5;
        this.f370d = j6;
        this.f371e = z5;
        this.f372f = f6;
        this.f373g = i6;
        this.f374h = z6;
        this.f375i = arrayList;
        this.f376j = j7;
        this.f377k = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return AbstractC0047x.e(this.a, a.a) && this.f368b == a.f368b && C1353b.c(this.f369c, a.f369c) && C1353b.c(this.f370d, a.f370d) && this.f371e == a.f371e && Float.compare(this.f372f, a.f372f) == 0 && this.f373g == a.f373g && this.f374h == a.f374h && this.f375i.equals(a.f375i) && C1353b.c(this.f376j, a.f376j) && C1353b.c(this.f377k, a.f377k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f377k) + AbstractC1135a.c((this.f375i.hashCode() + AbstractC1135a.d(AbstractC1135a.b(this.f373g, AbstractC1135a.a(this.f372f, AbstractC1135a.d(AbstractC1135a.c(AbstractC1135a.c(AbstractC1135a.c(Long.hashCode(this.a) * 31, 31, this.f368b), 31, this.f369c), 31, this.f370d), 31, this.f371e), 31), 31), 31, this.f374h)) * 31, 31, this.f376j);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) AbstractC0047x.j(this.a)) + ", uptime=" + this.f368b + ", positionOnScreen=" + ((Object) C1353b.h(this.f369c)) + ", position=" + ((Object) C1353b.h(this.f370d)) + ", down=" + this.f371e + ", pressure=" + this.f372f + ", type=" + ((Object) L.a(this.f373g)) + ", activeHover=" + this.f374h + ", historical=" + this.f375i + ", scrollDelta=" + ((Object) C1353b.h(this.f376j)) + ", originalEventPosition=" + ((Object) C1353b.h(this.f377k)) + ')';
    }
}
