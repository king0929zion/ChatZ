package O;

/* loaded from: classes.dex */
public final class D {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3924c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3925d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3926e;

    /* renamed from: f, reason: collision with root package name */
    public final S0.L f3927f;

    public D(long j3, int i6, int i7, int i8, int i9, S0.L l3) {
        this.a = j3;
        this.f3923b = i6;
        this.f3924c = i7;
        this.f3925d = i8;
        this.f3926e = i9;
        this.f3927f = l3;
    }

    public final F a(int i6) {
        return new F(AbstractC0336u0.u(this.f3927f, i6), i6, this.a);
    }

    public final EnumC0318l b() {
        int i6 = this.f3924c;
        int i7 = this.f3925d;
        return i6 < i7 ? EnumC0318l.f4146e : i6 > i7 ? EnumC0318l.f4145c : EnumC0318l.f4147f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.a);
        sb.append(", range=(");
        int i6 = this.f3924c;
        sb.append(i6);
        sb.append('-');
        S0.L l3 = this.f3927f;
        sb.append(AbstractC0336u0.u(l3, i6));
        sb.append(',');
        int i7 = this.f3925d;
        sb.append(i7);
        sb.append('-');
        sb.append(AbstractC0336u0.u(l3, i7));
        sb.append("), prevOffset=");
        return B3.e.q(sb, this.f3926e, ')');
    }
}
