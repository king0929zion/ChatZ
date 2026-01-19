package y0;

import B0.AbstractC0047x;
import n0.C1353b;

/* loaded from: classes.dex */
public final class b {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15959b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15960c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15961d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15962e;

    /* renamed from: f, reason: collision with root package name */
    public final long f15963f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15964g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15965h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15966i;

    public b(long j3, long j4, long j5, boolean z5, float f6, long j6, long j7, boolean z6) {
        this.a = j3;
        this.f15959b = j4;
        this.f15960c = j5;
        this.f15961d = z5;
        this.f15962e = f6;
        this.f15963f = j6;
        this.f15964g = j7;
        this.f15965h = z6;
    }

    public final String toString() {
        return "IndirectPointerInputChange(id=" + ((Object) AbstractC0047x.j(this.a)) + ", uptimeMillis=" + this.f15959b + ", position=" + ((Object) C1353b.h(this.f15960c)) + ", pressed=" + this.f15961d + ", pressure=" + this.f15962e + ", previousUptimeMillis=" + this.f15963f + ", previousPosition=" + ((Object) C1353b.h(this.f15964g)) + ", previousPressed=" + this.f15965h + ", isConsumed=" + this.f15966i + ')';
    }
}
