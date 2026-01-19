package O;

import I0.X0;
import android.view.MotionEvent;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import j1.AbstractC1135a;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import u.AbstractC1734b;
import y.AbstractC1975o;
import y.C1969i;
import y.InterfaceC1980u;

/* renamed from: O.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0316k {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4139b;

    /* renamed from: c, reason: collision with root package name */
    public Object f4140c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4141d;

    public /* synthetic */ C0316k(int i6) {
        this.a = i6;
    }

    public void a(int i6, InterfaceC1980u interfaceC1980u) {
        if (i6 < 0) {
            AbstractC1734b.a("size should be >=0");
        }
        if (i6 == 0) {
            return;
        }
        C1969i c1969i = new C1969i(this.f4139b, i6, interfaceC1980u);
        this.f4139b += i6;
        ((V.e) this.f4140c).b(c1969i);
    }

    public C1969i b(int i6) {
        if (i6 < 0 || i6 >= this.f4139b) {
            StringBuilder k3 = AbstractC1135a.k("Index ", i6, ", size ");
            k3.append(this.f4139b);
            AbstractC1734b.e(k3.toString());
        }
        C1969i c1969i = (C1969i) this.f4141d;
        if (c1969i != null) {
            int i7 = c1969i.a;
            if (i6 < c1969i.f15876b + i7 && i7 <= i6) {
                return c1969i;
            }
        }
        V.e eVar = (V.e) this.f4140c;
        C1969i c1969i2 = (C1969i) eVar.f8759c[AbstractC1975o.e(i6, eVar)];
        this.f4141d = c1969i2;
        return c1969i2;
    }

    public int c(Object obj) {
        k.H h3 = (k.H) this.f4140c;
        int d6 = h3.d(obj);
        if (d6 >= 0) {
            return h3.f12462c[d6];
        }
        return -1;
    }

    public String d() {
        StringBuilder sb = new StringBuilder("$");
        int i6 = this.f4139b + 1;
        for (int i7 = 0; i7 < i6; i7++) {
            Object obj = ((Object[]) this.f4140c)[i7];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!AbstractC1276k.b(serialDescriptor.e(), K4.k.f2977f)) {
                    int i8 = ((int[]) this.f4141d)[i7];
                    if (i8 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i8));
                    }
                } else if (((int[]) this.f4141d)[i7] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f4141d)[i7]);
                    sb.append("]");
                }
            } else if (obj != O4.n.a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public void e(int i6, int i7, int i8, int i9, int i10, int i11, boolean z5, boolean z6, boolean z7, int i12) {
        long[] jArr = (long[]) this.f4140c;
        int i13 = this.f4139b;
        int i14 = i13 + 3;
        this.f4139b = i14;
        int length = jArr.length;
        if (length <= i14) {
            int max = Math.max(length * 2, i14);
            long[] copyOf = Arrays.copyOf(jArr, max);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f4140c = copyOf;
            long[] copyOf2 = Arrays.copyOf((long[]) this.f4141d, max);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f4141d = copyOf2;
        }
        long[] jArr2 = (long[]) this.f4140c;
        jArr2[i13] = (i7 << 32) | (i8 & 4294967295L);
        jArr2[i13 + 1] = (i9 << 32) | (i10 & 4294967295L);
        int i15 = i11 & 33554431;
        jArr2[i13 + 2] = ((z7 ? 1L : 0L) << 63) | ((z6 ? 1L : 0L) << 62) | ((z5 ? 1L : 0L) << 61) | (1 << 60) | (Math.min(0, 1023) << 50) | (i15 << 25) | (i6 & 33554431);
        if (i11 < 0) {
            return;
        }
        for (int i16 = i12 != -1 ? i12 : i13 - 3; i16 >= 0; i16 -= 3) {
            int i17 = i16 + 2;
            long j3 = jArr2[i17];
            if ((((int) j3) & 33554431) == i15) {
                jArr2[i17] = (j3 & Q0.a.a) | (Math.min((i13 - i16) / 3, 1023) << 50);
                return;
            }
        }
    }

    public void g(int i6, boolean z5) {
        int i7 = i6 & 33554431;
        long[] jArr = (long[]) this.f4140c;
        int i8 = this.f4139b;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            int i10 = i9 + 2;
            long j3 = jArr[i10];
            if ((((int) j3) & 33554431) == i7) {
                long j4 = z5 ? 1L : 0L;
                jArr[i10] = (j4 * Long.MIN_VALUE) | (8070450532247928831L & j3) | (1152921504606846976L * j4);
                return;
            }
        }
    }

    public void h(int i6, int i7, long j3) {
        int i8;
        char c6;
        char c7;
        long[] jArr = (long[]) this.f4140c;
        long[] jArr2 = (long[]) this.f4141d;
        jArr2[0] = j3;
        int i9 = 1;
        while (i9 > 0) {
            i9--;
            long j4 = jArr2[i9];
            int i10 = 33554431;
            int i11 = ((int) j4) & 33554431;
            char c8 = 25;
            int i12 = ((int) (j4 >> 25)) & 33554431;
            char c9 = '2';
            int i13 = ((int) (j4 >> 50)) & 1023;
            int i14 = i13 == 1023 ? this.f4139b : (i13 * 3) + i12;
            if (i12 < 0) {
                return;
            }
            while (i12 < jArr.length - 2 && i12 < i14) {
                int i15 = i12 + 2;
                long j5 = jArr[i15];
                if ((((int) (j5 >> c8)) & i10) == i11) {
                    long j6 = jArr[i12];
                    int i16 = i12 + 1;
                    i8 = i10;
                    c6 = c8;
                    long j7 = jArr[i16];
                    c7 = c9;
                    jArr[i12] = ((((int) j6) + i7) & 4294967295L) | ((((int) (j6 >> 32)) + i6) << 32);
                    jArr[i16] = ((((int) j7) + i7) & 4294967295L) | ((((int) (j7 >> 32)) + i6) << 32);
                    jArr[i15] = (((j5 >> 63) & 1) << 60) | j5;
                    if ((((int) (j5 >> c7)) & 1023) > 0) {
                        jArr2[i9] = (Q0.a.f6313b & j5) | (((i12 + 3) & i8) << c6);
                        i9++;
                    }
                } else {
                    i8 = i10;
                    c6 = c8;
                    c7 = c9;
                }
                i12 += 3;
                i10 = i8;
                c8 = c6;
                c9 = c7;
            }
        }
    }

    public void i(int i6, l4.g gVar) {
        int i7 = i6 & 33554431;
        long[] jArr = (long[]) this.f4140c;
        int i8 = this.f4139b;
        for (int i9 = 0; i9 < jArr.length - 2 && i9 < i8; i9 += 3) {
            if ((((int) jArr[i9 + 2]) & 33554431) == i7) {
                long j3 = jArr[i9];
                long j4 = jArr[i9 + 1];
                gVar.i(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) j3), Integer.valueOf((int) (j4 >> 32)), Integer.valueOf((int) j4));
                return;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return d();
            case 2:
            default:
                return super.toString();
            case 3:
                StringBuilder sb = new StringBuilder();
                if (((Q4.u) this.f4140c) == Q4.u.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(SequenceUtils.SPC);
                sb.append(this.f4139b);
                sb.append(SequenceUtils.SPC);
                sb.append((String) this.f4141d);
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
        }
    }

    public C0316k(Q4.u uVar, int i6, String str) {
        this.a = 3;
        this.f4140c = uVar;
        this.f4139b = i6;
        this.f4141d = str;
    }

    public C0316k(ArrayList arrayList, int i6, MotionEvent motionEvent) {
        this.a = 7;
        this.f4140c = arrayList;
        this.f4139b = i6;
        this.f4141d = motionEvent;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("changes cannot be empty");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cf, code lost:
    
        if (r9 == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0316k(r4.g r13, y.AbstractC1975o r14) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: O.C0316k.<init>(r4.g, y.o):void");
    }

    public C0316k() {
        this.a = 5;
        this.f4140c = new V.e(new C1969i[16]);
    }

    public C0316k(X0 x02) {
        this.a = 0;
        this.f4140c = x02;
    }
}
