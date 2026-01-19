package P3;

import M1.d;
import j1.AbstractC1135a;
import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class b implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public final int f5114c;

    /* renamed from: e, reason: collision with root package name */
    public final int f5115e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5116f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5117g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5118h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5119i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5120j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5121k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5122l;

    static {
        a.a(0L);
    }

    public b(int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, long j3) {
        AbstractC1135a.o(i9, "dayOfWeek");
        AbstractC1135a.o(i12, "month");
        this.f5114c = i6;
        this.f5115e = i7;
        this.f5116f = i8;
        this.f5117g = i9;
        this.f5118h = i10;
        this.f5119i = i11;
        this.f5120j = i12;
        this.f5121k = i13;
        this.f5122l = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        AbstractC1276k.f(bVar, "other");
        return AbstractC1276k.h(this.f5122l, bVar.f5122l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5114c == bVar.f5114c && this.f5115e == bVar.f5115e && this.f5116f == bVar.f5116f && this.f5117g == bVar.f5117g && this.f5118h == bVar.f5118h && this.f5119i == bVar.f5119i && this.f5120j == bVar.f5120j && this.f5121k == bVar.f5121k && this.f5122l == bVar.f5122l;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5122l) + AbstractC1135a.b(this.f5121k, (d.a(this.f5120j) + AbstractC1135a.b(this.f5119i, AbstractC1135a.b(this.f5118h, (d.a(this.f5117g) + AbstractC1135a.b(this.f5116f, AbstractC1135a.b(this.f5115e, Integer.hashCode(this.f5114c) * 31, 31), 31)) * 31, 31), 31)) * 31, 31);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("GMTDate(seconds=");
        sb.append(this.f5114c);
        sb.append(", minutes=");
        sb.append(this.f5115e);
        sb.append(", hours=");
        sb.append(this.f5116f);
        sb.append(", dayOfWeek=");
        switch (this.f5117g) {
            case 1:
                str = "MONDAY";
                break;
            case 2:
                str = "TUESDAY";
                break;
            case 3:
                str = "WEDNESDAY";
                break;
            case 4:
                str = "THURSDAY";
                break;
            case AbstractC1787b.f15290g /* 5 */:
                str = "FRIDAY";
                break;
            case 6:
                str = "SATURDAY";
                break;
            case 7:
                str = "SUNDAY";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", dayOfMonth=");
        sb.append(this.f5118h);
        sb.append(", dayOfYear=");
        sb.append(this.f5119i);
        sb.append(", month=");
        switch (this.f5120j) {
            case 1:
                str2 = "JANUARY";
                break;
            case 2:
                str2 = "FEBRUARY";
                break;
            case 3:
                str2 = "MARCH";
                break;
            case 4:
                str2 = "APRIL";
                break;
            case AbstractC1787b.f15290g /* 5 */:
                str2 = "MAY";
                break;
            case 6:
                str2 = "JUNE";
                break;
            case 7:
                str2 = "JULY";
                break;
            case 8:
                str2 = "AUGUST";
                break;
            case AbstractC1787b.f15287d /* 9 */:
                str2 = "SEPTEMBER";
                break;
            case AbstractC1787b.f15289f /* 10 */:
                str2 = "OCTOBER";
                break;
            case 11:
                str2 = "NOVEMBER";
                break;
            case 12:
                str2 = "DECEMBER";
                break;
            default:
                str2 = "null";
                break;
        }
        sb.append(str2);
        sb.append(", year=");
        sb.append(this.f5121k);
        sb.append(", timestamp=");
        sb.append(this.f5122l);
        sb.append(')');
        return sb.toString();
    }
}
