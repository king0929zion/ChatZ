package B0;

import java.util.ArrayList;
import n0.C1353b;

/* loaded from: classes.dex */
public final class y {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f482b;

    /* renamed from: c, reason: collision with root package name */
    public final long f483c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f484d;

    /* renamed from: e, reason: collision with root package name */
    public final float f485e;

    /* renamed from: f, reason: collision with root package name */
    public final long f486f;

    /* renamed from: g, reason: collision with root package name */
    public final long f487g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f488h;

    /* renamed from: i, reason: collision with root package name */
    public final int f489i;

    /* renamed from: j, reason: collision with root package name */
    public final long f490j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f491k;

    /* renamed from: l, reason: collision with root package name */
    public final long f492l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f493m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f494n;

    /* renamed from: o, reason: collision with root package name */
    public y f495o;

    public y(long j3, long j4, long j5, boolean z5, float f6, long j6, long j7, boolean z6, boolean z7, int i6, long j8) {
        this.a = j3;
        this.f482b = j4;
        this.f483c = j5;
        this.f484d = z5;
        this.f485e = f6;
        this.f486f = j6;
        this.f487g = j7;
        this.f488h = z6;
        this.f489i = i6;
        this.f490j = j8;
        this.f492l = 0L;
        this.f493m = z7;
        this.f494n = z7;
    }

    public final void a() {
        y yVar = this.f495o;
        if (yVar == null) {
            this.f493m = true;
            this.f494n = true;
        } else if (yVar != null) {
            yVar.a();
        }
    }

    public final boolean b() {
        y yVar = this.f495o;
        return yVar != null ? yVar.b() : this.f493m || this.f494n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) AbstractC0047x.j(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.f482b);
        sb.append(", position=");
        sb.append((Object) C1353b.h(this.f483c));
        sb.append(", pressed=");
        sb.append(this.f484d);
        sb.append(", pressure=");
        sb.append(this.f485e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f486f);
        sb.append(", previousPosition=");
        sb.append((Object) C1353b.h(this.f487g));
        sb.append(", previousPressed=");
        sb.append(this.f488h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) L.a(this.f489i));
        sb.append(", historical=");
        Object obj = this.f491k;
        if (obj == null) {
            obj = Y3.v.f9812c;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C1353b.h(this.f490j));
        sb.append(')');
        return sb.toString();
    }

    public y(long j3, long j4, long j5, boolean z5, float f6, long j6, long j7, boolean z6, int i6, ArrayList arrayList, long j8, long j9) {
        this(j3, j4, j5, z5, f6, j6, j7, z6, false, i6, j8);
        this.f491k = arrayList;
        this.f492l = j9;
    }
}
