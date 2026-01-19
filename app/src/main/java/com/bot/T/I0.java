package T;

import H0.C0166v;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class I0 {
    public final J0 a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7954c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f7955d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7956e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7957f;

    /* renamed from: g, reason: collision with root package name */
    public int f7958g;

    /* renamed from: h, reason: collision with root package name */
    public int f7959h;

    /* renamed from: i, reason: collision with root package name */
    public int f7960i;

    /* renamed from: j, reason: collision with root package name */
    public final C0166v f7961j;

    /* renamed from: k, reason: collision with root package name */
    public int f7962k;

    /* renamed from: l, reason: collision with root package name */
    public int f7963l;

    /* renamed from: m, reason: collision with root package name */
    public int f7964m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7965n;

    public I0(J0 j02) {
        this.a = j02;
        this.f7953b = j02.f7966c;
        int i6 = j02.f7967e;
        this.f7954c = i6;
        this.f7955d = j02.f7968f;
        this.f7956e = j02.f7969g;
        this.f7959h = i6;
        this.f7960i = -1;
        this.f7961j = new C0166v();
    }

    public final C0594a a(int i6) {
        ArrayList arrayList = this.a.f7974l;
        int e6 = L0.e(arrayList, i6, this.f7954c);
        if (e6 >= 0) {
            return (C0594a) arrayList.get(e6);
        }
        C0594a c0594a = new C0594a(i6);
        arrayList.add(-(e6 + 1), c0594a);
        return c0594a;
    }

    public final Object b(int[] iArr, int i6) {
        int i7 = i6 * 5;
        int i8 = iArr[i7 + 1];
        if ((268435456 & i8) != 0) {
            return this.f7955d[i7 >= iArr.length ? iArr.length : iArr[i7 + 4] + Integer.bitCount(i8 >> 29)];
        }
        return C0616l.a;
    }

    public final void c() {
        this.f7957f = true;
        J0 j02 = this.a;
        j02.getClass();
        if (this.a != j02 || j02.f7970h <= 0) {
            AbstractC0629s.a("Unexpected reader close()");
        }
        j02.f7970h--;
        this.f7955d = new Object[0];
    }

    public final boolean d(int i6) {
        return (this.f7953b[(i6 * 5) + 1] & PegdownExtensions.MULTI_LINE_IMAGE_URLS) != 0;
    }

    public final void e() {
        if (this.f7962k == 0) {
            if (!(this.f7958g == this.f7959h)) {
                AbstractC0629s.a("endGroup() not called at the end of a group");
            }
            int i6 = (this.f7960i * 5) + 2;
            int[] iArr = this.f7953b;
            int i7 = iArr[i6];
            this.f7960i = i7;
            int i8 = this.f7954c;
            this.f7959h = i7 < 0 ? i8 : L0.a(iArr, i7) + i7;
            int b5 = this.f7961j.b();
            if (b5 < 0) {
                this.f7963l = 0;
                this.f7964m = 0;
            } else {
                this.f7963l = b5;
                this.f7964m = i7 >= i8 - 1 ? this.f7956e : iArr[((i7 + 1) * 5) + 4];
            }
        }
    }

    public final Object f() {
        int i6 = this.f7958g;
        if (i6 < this.f7959h) {
            return b(this.f7953b, i6);
        }
        return 0;
    }

    public final int g() {
        int i6 = this.f7958g;
        if (i6 >= this.f7959h) {
            return 0;
        }
        return this.f7953b[i6 * 5];
    }

    public final Object h(int i6, int i7) {
        int[] iArr = this.f7953b;
        int c6 = L0.c(iArr, i6);
        int i8 = i6 + 1;
        int i9 = c6 + i7;
        return i9 < (i8 < this.f7954c ? iArr[(i8 * 5) + 4] : this.f7956e) ? this.f7955d[i9] : C0616l.a;
    }

    public final int i(int i6) {
        return this.f7953b[i6 * 5];
    }

    public final boolean j(int i6) {
        return (this.f7953b[(i6 * 5) + 1] & PegdownExtensions.SUPERSCRIPT) != 0;
    }

    public final boolean k(int i6) {
        return (this.f7953b[(i6 * 5) + 1] & PegdownExtensions.NOT_USED) != 0;
    }

    public final boolean l(int i6) {
        return (this.f7953b[(i6 * 5) + 1] & 1073741824) != 0;
    }

    public final Object m() {
        int i6;
        if (this.f7962k > 0 || (i6 = this.f7963l) >= this.f7964m) {
            this.f7965n = false;
            return C0616l.a;
        }
        this.f7965n = true;
        Object[] objArr = this.f7955d;
        this.f7963l = i6 + 1;
        return objArr[i6];
    }

    public final Object n(int i6) {
        int i7 = i6 * 5;
        int[] iArr = this.f7953b;
        int i8 = iArr[i7 + 1] & 1073741824;
        if (i8 != 0) {
            return i8 != 0 ? this.f7955d[iArr[i7 + 4]] : C0616l.a;
        }
        return null;
    }

    public final int o(int i6) {
        return this.f7953b[(i6 * 5) + 1] & 67108863;
    }

    public final Object p(int[] iArr, int i6) {
        int i7 = i6 * 5;
        int i8 = iArr[i7 + 1];
        if ((536870912 & i8) == 0) {
            return null;
        }
        return this.f7955d[Integer.bitCount(i8 >> 30) + iArr[i7 + 4]];
    }

    public final int q(int i6) {
        return this.f7953b[(i6 * 5) + 2];
    }

    public final void r(int i6) {
        if (!(this.f7962k == 0)) {
            AbstractC0629s.a("Cannot reposition while in an empty region");
        }
        this.f7958g = i6;
        int[] iArr = this.f7953b;
        int i7 = this.f7954c;
        int i8 = i6 < i7 ? iArr[(i6 * 5) + 2] : -1;
        if (i8 != this.f7960i) {
            this.f7960i = i8;
            if (i8 < 0) {
                this.f7959h = i7;
            } else {
                this.f7959h = L0.a(iArr, i8) + i8;
            }
            this.f7963l = 0;
            this.f7964m = 0;
        }
    }

    public final int s() {
        if (!(this.f7962k == 0)) {
            AbstractC0629s.a("Cannot skip while in an empty region");
        }
        int i6 = this.f7958g;
        int[] iArr = this.f7953b;
        int i7 = (iArr[(i6 * 5) + 1] & 1073741824) == 0 ? iArr[(i6 * 5) + 1] & 67108863 : 1;
        this.f7958g = L0.a(iArr, i6) + i6;
        return i7;
    }

    public final void t() {
        if (!(this.f7962k == 0)) {
            AbstractC0629s.a("Cannot skip the enclosing group while in an empty region");
        }
        this.f7958g = this.f7959h;
        this.f7963l = 0;
        this.f7964m = 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlotReader(current=");
        sb.append(this.f7958g);
        sb.append(", key=");
        sb.append(g());
        sb.append(", parent=");
        sb.append(this.f7960i);
        sb.append(", end=");
        return B3.e.q(sb, this.f7959h, ')');
    }

    public final void u() {
        if (this.f7962k <= 0) {
            int i6 = this.f7960i;
            int i7 = this.f7958g;
            int[] iArr = this.f7953b;
            if (!(iArr[(i7 * 5) + 2] == i6)) {
                AbstractC0619m0.a("Invalid slot table detected");
            }
            int i8 = this.f7963l;
            int i9 = this.f7964m;
            C0166v c0166v = this.f7961j;
            if (i8 == 0 && i9 == 0) {
                c0166v.c(-1);
            } else {
                c0166v.c(i8);
            }
            this.f7960i = i7;
            this.f7959h = L0.a(iArr, i7) + i7;
            int i10 = i7 + 1;
            this.f7958g = i10;
            this.f7963l = L0.c(iArr, i7);
            this.f7964m = i7 >= this.f7954c - 1 ? this.f7956e : iArr[(i10 * 5) + 4];
        }
    }
}
