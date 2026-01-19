package v4;

import com.vladsch.flexmark.util.sequence.SequenceUtils;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import i4.AbstractC1121e;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: v4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1825a implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final long f15382e;

    /* renamed from: f, reason: collision with root package name */
    public static final long f15383f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f15384g = 0;

    /* renamed from: c, reason: collision with root package name */
    public final long f15385c;

    static {
        int i6 = AbstractC1826b.a;
        f15382e = AbstractC1120d.k(4611686018427387903L);
        f15383f = AbstractC1120d.k(-4611686018427387903L);
    }

    public static final long a(long j3, long j4) {
        long j5 = 1000000;
        long j6 = j4 / j5;
        long j7 = j3 + j6;
        if (-4611686018426L > j7 || j7 >= 4611686018427L) {
            return AbstractC1120d.k(AbstractC1117a.g(j7, -4611686018427387903L, 4611686018427387903L));
        }
        return AbstractC1120d.m((j7 * j5) + (j4 - (j6 * j5)));
    }

    public static final void b(StringBuilder sb, int i6, int i7, int i8, String str, boolean z5) {
        sb.append(i6);
        if (i7 != 0) {
            sb.append('.');
            String V5 = AbstractC1776n.V(i8, String.valueOf(i7));
            int i9 = -1;
            int length = V5.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (V5.charAt(length) != '0') {
                        i9 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (z5 || i11 >= 3) {
                sb.append((CharSequence) V5, 0, ((i9 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) V5, 0, i11);
            }
        }
        sb.append(str);
    }

    public static final int c(long j3) {
        if (d(j3)) {
            return 0;
        }
        return (int) ((((int) j3) & 1) == 1 ? ((j3 >> 1) % 1000) * 1000000 : (j3 >> 1) % 1000000000);
    }

    public static final boolean d(long j3) {
        return j3 == f15382e || j3 == f15383f;
    }

    public static final long e(long j3, long j4) {
        if (d(j3)) {
            if (!d(j4) || (j4 ^ j3) >= 0) {
                return j3;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (d(j4)) {
            return j4;
        }
        int i6 = ((int) j3) & 1;
        if (i6 != (((int) j4) & 1)) {
            return i6 == 1 ? a(j3 >> 1, j4 >> 1) : a(j4 >> 1, j3 >> 1);
        }
        long j5 = (j3 >> 1) + (j4 >> 1);
        return i6 == 0 ? (-4611686018426999999L > j5 || j5 >= 4611686018427000000L) ? AbstractC1120d.k(j5 / 1000000) : AbstractC1120d.m(j5) : AbstractC1120d.l(j5);
    }

    public static final long f(long j3, EnumC1827c enumC1827c) {
        AbstractC1276k.f(enumC1827c, "unit");
        if (j3 == f15382e) {
            return Long.MAX_VALUE;
        }
        if (j3 == f15383f) {
            return Long.MIN_VALUE;
        }
        return AbstractC1121e.j(j3 >> 1, (((int) j3) & 1) == 0 ? EnumC1827c.NANOSECONDS : EnumC1827c.MILLISECONDS, enumC1827c);
    }

    public static final long g(long j3) {
        long j4 = ((-(j3 >> 1)) << 1) + (((int) j3) & 1);
        int i6 = AbstractC1826b.a;
        return j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j3 = ((C1825a) obj).f15385c;
        long j4 = this.f15385c;
        long j5 = j4 ^ j3;
        if (j5 < 0 || (((int) j5) & 1) == 0) {
            return AbstractC1276k.h(j4, j3);
        }
        int i6 = (((int) j4) & 1) - (((int) j3) & 1);
        return j4 < 0 ? -i6 : i6;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1825a) {
            return this.f15385c == ((C1825a) obj).f15385c;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15385c);
    }

    public final String toString() {
        long j3;
        int f6;
        long j4 = this.f15385c;
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f15382e) {
            return "Infinity";
        }
        if (j4 == f15383f) {
            return "-Infinity";
        }
        int i6 = 0;
        boolean z5 = j4 < 0;
        StringBuilder sb = new StringBuilder();
        if (z5) {
            sb.append('-');
        }
        if (j4 < 0) {
            j4 = g(j4);
        }
        long f7 = f(j4, EnumC1827c.DAYS);
        int f8 = d(j4) ? 0 : (int) (f(j4, EnumC1827c.HOURS) % 24);
        if (d(j4)) {
            j3 = 0;
            f6 = 0;
        } else {
            j3 = 0;
            f6 = (int) (f(j4, EnumC1827c.MINUTES) % 60);
        }
        int f9 = d(j4) ? 0 : (int) (f(j4, EnumC1827c.SECONDS) % 60);
        int c6 = c(j4);
        boolean z6 = f7 != j3;
        boolean z7 = f8 != 0;
        boolean z8 = f6 != 0;
        boolean z9 = (f9 == 0 && c6 == 0) ? false : true;
        if (z6) {
            sb.append(f7);
            sb.append('d');
            i6 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i7 = i6 + 1;
            if (i6 > 0) {
                sb.append(SequenceUtils.SPC);
            }
            sb.append(f8);
            sb.append('h');
            i6 = i7;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i8 = i6 + 1;
            if (i6 > 0) {
                sb.append(SequenceUtils.SPC);
            }
            sb.append(f6);
            sb.append('m');
            i6 = i8;
        }
        if (z9) {
            int i9 = i6 + 1;
            if (i6 > 0) {
                sb.append(SequenceUtils.SPC);
            }
            if (f9 != 0 || z6 || z7 || z8) {
                b(sb, f9, c6, 9, "s", false);
            } else if (c6 >= 1000000) {
                b(sb, c6 / 1000000, c6 % 1000000, 6, "ms", false);
            } else if (c6 >= 1000) {
                b(sb, c6 / 1000, c6 % 1000, 3, "us", false);
            } else {
                sb.append(c6);
                sb.append("ns");
            }
            i6 = i9;
        }
        if (z5 && i6 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }
}
