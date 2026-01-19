package f0;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import i1.AbstractC1087g;
import java.util.ArrayList;
import java.util.Iterator;
import k.C1150D;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0989l implements Iterable, InterfaceC1372a {

    /* renamed from: h, reason: collision with root package name */
    public static final C0989l f11697h = new C0989l(0, 0, 0, null);

    /* renamed from: c, reason: collision with root package name */
    public final long f11698c;

    /* renamed from: e, reason: collision with root package name */
    public final long f11699e;

    /* renamed from: f, reason: collision with root package name */
    public final long f11700f;

    /* renamed from: g, reason: collision with root package name */
    public final long[] f11701g;

    public C0989l(long j3, long j4, long j5, long[] jArr) {
        this.f11698c = j3;
        this.f11699e = j4;
        this.f11700f = j5;
        this.f11701g = jArr;
    }

    public final C0989l a(C0989l c0989l) {
        C0989l c0989l2;
        long j3;
        long[] jArr;
        C0989l c0989l3 = f11697h;
        if (c0989l == c0989l3) {
            return this;
        }
        if (this == c0989l3) {
            return c0989l3;
        }
        long j4 = c0989l.f11700f;
        long j5 = c0989l.f11700f;
        long[] jArr2 = c0989l.f11701g;
        long j6 = c0989l.f11699e;
        long j7 = c0989l.f11698c;
        long j8 = this.f11700f;
        if (j4 == j8 && jArr2 == (jArr = this.f11701g)) {
            return new C0989l(this.f11698c & (~j7), this.f11699e & (~j6), j8, jArr);
        }
        if (jArr2 != null) {
            c0989l2 = this;
            for (long j9 : jArr2) {
                c0989l2 = c0989l2.b(j9);
            }
        } else {
            c0989l2 = this;
        }
        long j10 = 0;
        if (j6 != 0) {
            int i6 = 0;
            while (i6 < 64) {
                if (((1 << i6) & j6) != j10) {
                    j3 = j10;
                    c0989l2 = c0989l2.b(i6 + j5);
                } else {
                    j3 = j10;
                }
                i6++;
                j10 = j3;
            }
        }
        long j11 = j10;
        if (j7 != j11) {
            for (int i7 = 0; i7 < 64; i7++) {
                if (((1 << i7) & j7) != j11) {
                    c0989l2 = c0989l2.b(i7 + j5 + 64);
                }
            }
        }
        return c0989l2;
    }

    public final C0989l b(long j3) {
        long[] jArr;
        int c6;
        long[] jArr2;
        long j4 = j3 - this.f11700f;
        long j5 = 0;
        if (AbstractC1276k.h(j4, j5) >= 0 && AbstractC1276k.h(j4, 64) < 0) {
            long j6 = 1 << ((int) j4);
            long j7 = this.f11699e;
            if ((j7 & j6) != 0) {
                return new C0989l(this.f11698c, j7 & (~j6), this.f11700f, this.f11701g);
            }
        } else if (AbstractC1276k.h(j4, 64) >= 0 && AbstractC1276k.h(j4, PegdownExtensions.FENCED_CODE_BLOCKS) < 0) {
            long j8 = 1 << (((int) j4) - 64);
            long j9 = this.f11698c;
            if ((j9 & j8) != 0) {
                return new C0989l(j9 & (~j8), this.f11699e, this.f11700f, this.f11701g);
            }
        } else if (AbstractC1276k.h(j4, j5) < 0 && (jArr = this.f11701g) != null && (c6 = AbstractC0997t.c(jArr, j3)) >= 0) {
            int length = jArr.length;
            int i6 = length - 1;
            if (i6 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i6];
                if (c6 > 0) {
                    Y3.k.i0(jArr, jArr3, 0, 0, c6);
                }
                if (c6 < i6) {
                    Y3.k.i0(jArr, jArr3, c6, c6 + 1, length);
                }
                jArr2 = jArr3;
            }
            return new C0989l(this.f11698c, this.f11699e, this.f11700f, jArr2);
        }
        return this;
    }

    public final boolean c(long j3) {
        long[] jArr;
        long j4 = j3 - this.f11700f;
        long j5 = 0;
        return (AbstractC1276k.h(j4, j5) < 0 || AbstractC1276k.h(j4, (long) 64) >= 0) ? (AbstractC1276k.h(j4, (long) 64) < 0 || AbstractC1276k.h(j4, (long) PegdownExtensions.FENCED_CODE_BLOCKS) >= 0) ? AbstractC1276k.h(j4, j5) <= 0 && (jArr = this.f11701g) != null && AbstractC0997t.c(jArr, j3) >= 0 : ((1 << (((int) j4) - 64)) & this.f11698c) != 0 : ((1 << ((int) j4)) & this.f11699e) != 0;
    }

    public final C0989l d(C0989l c0989l) {
        C0989l c0989l2;
        C0989l c0989l3;
        long[] jArr;
        C0989l c0989l4 = f11697h;
        if (c0989l == c0989l4) {
            return this;
        }
        if (this == c0989l4) {
            return c0989l;
        }
        long j3 = c0989l.f11700f;
        long j4 = c0989l.f11700f;
        long[] jArr2 = c0989l.f11701g;
        long j5 = c0989l.f11699e;
        long j6 = c0989l.f11698c;
        long j7 = this.f11700f;
        long j8 = this.f11699e;
        long j9 = this.f11698c;
        if (j3 == j7 && jArr2 == (jArr = this.f11701g)) {
            return new C0989l(j9 | j6, j8 | j5, j7, jArr);
        }
        int i6 = 0;
        long[] jArr3 = this.f11701g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                c0989l2 = this;
                for (long j10 : jArr2) {
                    c0989l2 = c0989l2.e(j10);
                }
            } else {
                c0989l2 = this;
            }
            if (j5 != 0) {
                for (int i7 = 0; i7 < 64; i7++) {
                    if (((1 << i7) & j5) != 0) {
                        c0989l2 = c0989l2.e(i7 + j4);
                    }
                }
            }
            if (j6 != 0) {
                while (i6 < 64) {
                    if (((1 << i6) & j6) != 0) {
                        c0989l2 = c0989l2.e(i6 + j4 + 64);
                    }
                    i6++;
                }
            }
            return c0989l2;
        }
        if (jArr3 != null) {
            c0989l3 = c0989l;
            for (long j11 : jArr3) {
                c0989l3 = c0989l3.e(j11);
            }
        } else {
            c0989l3 = c0989l;
        }
        long j12 = this.f11700f;
        if (j8 != 0) {
            for (int i8 = 0; i8 < 64; i8++) {
                if (((1 << i8) & j8) != 0) {
                    c0989l3 = c0989l3.e(i8 + j12);
                }
            }
        }
        if (j9 != 0) {
            while (i6 < 64) {
                if (((1 << i6) & j9) != 0) {
                    c0989l3 = c0989l3.e(i6 + j12 + 64);
                }
                i6++;
            }
        }
        return c0989l3;
    }

    public final C0989l e(long j3) {
        long[] jArr;
        long j4;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j5 = this.f11700f;
        long j6 = j3 - j5;
        long j7 = 0;
        int h3 = AbstractC1276k.h(j6, j7);
        long j8 = this.f11699e;
        int i6 = 64;
        long j9 = 0;
        if (h3 < 0 || AbstractC1276k.h(j6, 64) >= 0) {
            long j10 = 64;
            int h6 = AbstractC1276k.h(j6, j10);
            long j11 = this.f11698c;
            if (h6 < 0 || AbstractC1276k.h(j6, PegdownExtensions.FENCED_CODE_BLOCKS) >= 0) {
                long j12 = PegdownExtensions.FENCED_CODE_BLOCKS;
                int h7 = AbstractC1276k.h(j6, j12);
                long[] jArr5 = this.f11701g;
                if (h7 < 0) {
                    if (jArr5 == null) {
                        return new C0989l(this.f11698c, this.f11699e, this.f11700f, new long[]{j3});
                    }
                    int c6 = AbstractC0997t.c(jArr5, j3);
                    if (c6 < 0) {
                        int i7 = -(c6 + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        Y3.k.i0(jArr5, jArr6, 0, 0, i7);
                        Y3.k.i0(jArr5, jArr6, i7 + 1, i7, length);
                        jArr6[i7] = j3;
                        return new C0989l(this.f11698c, this.f11699e, this.f11700f, jArr6);
                    }
                } else if (!c(j3)) {
                    long j13 = 1;
                    long j14 = ((j3 + j13) / j10) * j10;
                    if (AbstractC1276k.h(j14, j7) < 0) {
                        j14 = (Long.MAX_VALUE - j12) + j13;
                    }
                    long j15 = j5;
                    long j16 = j11;
                    C0987j c0987j = null;
                    while (true) {
                        if (AbstractC1276k.h(j15, j14) >= 0) {
                            jArr = jArr5;
                            j4 = j15;
                            j9 = j8;
                            break;
                        }
                        if (j8 != 0) {
                            if (c0987j == null) {
                                c0987j = new C0987j(jArr5);
                            }
                            int i8 = 0;
                            while (i8 < i6) {
                                if ((j8 & (1 << i8)) != 0) {
                                    jArr4 = jArr5;
                                    ((C1150D) c0987j.f11690e).a(i8 + j15);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i8++;
                                jArr5 = jArr4;
                                i6 = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j16 == 0) {
                            j4 = j14;
                            jArr = jArr7;
                            break;
                        }
                        j15 += j10;
                        jArr5 = jArr7;
                        j8 = j16;
                        i6 = 64;
                        j16 = 0;
                    }
                    if (c0987j != null) {
                        C1150D c1150d = (C1150D) c0987j.f11690e;
                        int i9 = c1150d.f12446b;
                        if (i9 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i9];
                            long[] jArr9 = c1150d.a;
                            for (int i10 = 0; i10 < i9; i10++) {
                                jArr8[i10] = jArr9[i10];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                            return new C0989l(j16, j9, j4, jArr2).e(j3);
                        }
                    }
                    jArr2 = jArr;
                    return new C0989l(j16, j9, j4, jArr2).e(j3);
                }
            } else {
                long j17 = 1 << (((int) j6) - 64);
                if ((j11 & j17) == 0) {
                    return new C0989l(j11 | j17, this.f11699e, this.f11700f, this.f11701g);
                }
            }
        } else {
            long j18 = 1 << ((int) j6);
            if ((j8 & j18) == 0) {
                return new C0989l(this.f11698c, j8 | j18, this.f11700f, this.f11701g);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return AbstractC1087g.m(new C0988k(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(Y3.n.Z(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE);
        int size = arrayList.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = arrayList.get(i7);
            i6++;
            if (i6 > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) FlexmarkHtmlConverter.DEFAULT_NODE);
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
