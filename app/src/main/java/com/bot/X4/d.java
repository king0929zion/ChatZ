package X4;

import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import d5.C0949i;
import d5.C0952l;
import java.util.ArrayList;
import java.util.Arrays;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class d {
    public final C0949i a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9433c;

    /* renamed from: g, reason: collision with root package name */
    public int f9437g;

    /* renamed from: h, reason: collision with root package name */
    public int f9438h;

    /* renamed from: b, reason: collision with root package name */
    public int f9432b = TableCell.NOT_TRACKED;

    /* renamed from: d, reason: collision with root package name */
    public int f9434d = 4096;

    /* renamed from: e, reason: collision with root package name */
    public C0711b[] f9435e = new C0711b[8];

    /* renamed from: f, reason: collision with root package name */
    public int f9436f = 7;

    public d(C0949i c0949i) {
        this.a = c0949i;
    }

    public final void a(int i6) {
        int i7;
        if (i6 > 0) {
            int length = this.f9435e.length - 1;
            int i8 = 0;
            while (true) {
                i7 = this.f9436f;
                if (length < i7 || i6 <= 0) {
                    break;
                }
                C0711b c0711b = this.f9435e[length];
                AbstractC1276k.c(c0711b);
                i6 -= c0711b.f9425c;
                int i9 = this.f9438h;
                C0711b c0711b2 = this.f9435e[length];
                AbstractC1276k.c(c0711b2);
                this.f9438h = i9 - c0711b2.f9425c;
                this.f9437g--;
                i8++;
                length--;
            }
            C0711b[] c0711bArr = this.f9435e;
            int i10 = i7 + 1;
            System.arraycopy(c0711bArr, i10, c0711bArr, i10 + i8, this.f9437g);
            C0711b[] c0711bArr2 = this.f9435e;
            int i11 = this.f9436f + 1;
            Arrays.fill(c0711bArr2, i11, i11 + i8, (Object) null);
            this.f9436f += i8;
        }
    }

    public final void b(C0711b c0711b) {
        int i6 = c0711b.f9425c;
        int i7 = this.f9434d;
        if (i6 > i7) {
            C0711b[] c0711bArr = this.f9435e;
            Y3.k.o0(null, c0711bArr, 0, c0711bArr.length);
            this.f9436f = this.f9435e.length - 1;
            this.f9437g = 0;
            this.f9438h = 0;
            return;
        }
        a((this.f9438h + i6) - i7);
        int i8 = this.f9437g + 1;
        C0711b[] c0711bArr2 = this.f9435e;
        if (i8 > c0711bArr2.length) {
            C0711b[] c0711bArr3 = new C0711b[c0711bArr2.length * 2];
            System.arraycopy(c0711bArr2, 0, c0711bArr3, c0711bArr2.length, c0711bArr2.length);
            this.f9436f = this.f9435e.length - 1;
            this.f9435e = c0711bArr3;
        }
        int i9 = this.f9436f;
        this.f9436f = i9 - 1;
        this.f9435e[i9] = c0711b;
        this.f9437g++;
        this.f9438h += i6;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [d5.i, java.lang.Object] */
    public final void c(C0952l c0952l) {
        AbstractC1276k.f(c0952l, "data");
        int[] iArr = y.a;
        int d6 = c0952l.d();
        long j3 = 0;
        long j4 = 0;
        for (int i6 = 0; i6 < d6; i6++) {
            byte i7 = c0952l.i(i6);
            byte[] bArr = R4.b.a;
            j4 += y.f9536b[i7 & 255];
        }
        int i8 = (int) ((j4 + 7) >> 3);
        int d7 = c0952l.d();
        C0949i c0949i = this.a;
        if (i8 >= d7) {
            e(c0952l.d(), 127, 0);
            c0949i.N(c0952l);
            return;
        }
        Object obj = new Object();
        int[] iArr2 = y.a;
        int d8 = c0952l.d();
        int i9 = 0;
        for (int i10 = 0; i10 < d8; i10++) {
            byte i11 = c0952l.i(i10);
            byte[] bArr2 = R4.b.a;
            int i12 = i11 & 255;
            int i13 = y.a[i12];
            byte b5 = y.f9536b[i12];
            j3 = (j3 << b5) | i13;
            i9 += b5;
            while (i9 >= 8) {
                i9 -= 8;
                obj.S((int) (j3 >> i9));
            }
        }
        if (i9 > 0) {
            obj.S((int) ((j3 << (8 - i9)) | (255 >>> i9)));
        }
        C0952l k3 = obj.k(obj.f11482e);
        e(k3.d(), 127, PegdownExtensions.FENCED_CODE_BLOCKS);
        c0949i.N(k3);
    }

    public final void d(ArrayList arrayList) {
        int i6;
        int i7;
        if (this.f9433c) {
            int i8 = this.f9432b;
            if (i8 < this.f9434d) {
                e(i8, 31, 32);
            }
            this.f9433c = false;
            this.f9432b = TableCell.NOT_TRACKED;
            e(this.f9434d, 31, 32);
        }
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            C0711b c0711b = (C0711b) arrayList.get(i9);
            C0952l p5 = c0711b.a.p();
            C0952l c0952l = c0711b.f9424b;
            Integer num = (Integer) e.f9439b.get(p5);
            if (num != null) {
                int intValue = num.intValue();
                i7 = intValue + 1;
                if (2 <= i7 && i7 < 8) {
                    C0711b[] c0711bArr = e.a;
                    if (AbstractC1276k.b(c0711bArr[intValue].f9424b, c0952l)) {
                        i6 = i7;
                    } else if (AbstractC1276k.b(c0711bArr[i7].f9424b, c0952l)) {
                        i7 = intValue + 2;
                        i6 = i7;
                    }
                }
                i6 = i7;
                i7 = -1;
            } else {
                i6 = -1;
                i7 = -1;
            }
            if (i7 == -1) {
                int i10 = this.f9436f + 1;
                int length = this.f9435e.length;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    C0711b c0711b2 = this.f9435e[i10];
                    AbstractC1276k.c(c0711b2);
                    if (AbstractC1276k.b(c0711b2.a, p5)) {
                        C0711b c0711b3 = this.f9435e[i10];
                        AbstractC1276k.c(c0711b3);
                        if (AbstractC1276k.b(c0711b3.f9424b, c0952l)) {
                            i7 = e.a.length + (i10 - this.f9436f);
                            break;
                        } else if (i6 == -1) {
                            i6 = (i10 - this.f9436f) + e.a.length;
                        }
                    }
                    i10++;
                }
            }
            if (i7 != -1) {
                e(i7, 127, PegdownExtensions.FENCED_CODE_BLOCKS);
            } else if (i6 == -1) {
                this.a.S(64);
                c(p5);
                c(c0952l);
                b(c0711b);
            } else {
                C0952l c0952l2 = C0711b.f9418d;
                p5.getClass();
                AbstractC1276k.f(c0952l2, "prefix");
                if (!p5.l(0, c0952l2, c0952l2.d()) || AbstractC1276k.b(C0711b.f9423i, p5)) {
                    e(i6, 63, 64);
                    c(c0952l);
                    b(c0711b);
                } else {
                    e(i6, 15, 0);
                    c(c0952l);
                }
            }
        }
    }

    public final void e(int i6, int i7, int i8) {
        C0949i c0949i = this.a;
        if (i6 < i7) {
            c0949i.S(i6 | i8);
            return;
        }
        c0949i.S(i8 | i7);
        int i9 = i6 - i7;
        while (i9 >= 128) {
            c0949i.S(128 | (i9 & 127));
            i9 >>>= 7;
        }
        c0949i.S(i9);
    }
}
