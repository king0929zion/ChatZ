package k;

import i4.AbstractC1117a;
import j1.AbstractC1135a;
import java.util.List;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I {
    public Object[] a;

    /* renamed from: b, reason: collision with root package name */
    public int f12466b;

    /* renamed from: c, reason: collision with root package name */
    public V.b f12467c;

    public I(int i6) {
        Object[] objArr;
        if (i6 == 0) {
            objArr = T.a;
        } else {
            objArr = new Object[i6];
        }
        this.a = objArr;
    }

    public final void a(Object obj) {
        int i6 = this.f12466b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i6) {
            m(objArr, i6);
        }
        Object[] objArr2 = this.a;
        int i7 = this.f12466b;
        objArr2[i7] = obj;
        this.f12466b = i7 + 1;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i6 = this.f12466b;
        int size = list.size() + i6;
        Object[] objArr = this.a;
        if (objArr.length < size) {
            m(objArr, size);
        }
        Object[] objArr2 = this.a;
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            objArr2[i7 + i6] = list.get(i7);
        }
        this.f12466b = list.size() + this.f12466b;
    }

    public final void c(I i6) {
        AbstractC1276k.f(i6, "elements");
        if (i6.h()) {
            return;
        }
        int i7 = this.f12466b + i6.f12466b;
        Object[] objArr = this.a;
        if (objArr.length < i7) {
            m(objArr, i7);
        }
        Y3.k.j0(i6.a, this.a, this.f12466b, 0, i6.f12466b);
        this.f12466b += i6.f12466b;
    }

    public final void d() {
        Y3.k.o0(null, this.a, 0, this.f12466b);
        this.f12466b = 0;
    }

    public final Object e() {
        if (!h()) {
            return this.a[0];
        }
        AbstractC1180a.e("ObjectList is empty.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            I i6 = (I) obj;
            int i7 = i6.f12466b;
            int i8 = this.f12466b;
            if (i7 == i8) {
                Object[] objArr = this.a;
                Object[] objArr2 = i6.a;
                r4.g z5 = AbstractC1117a.z(0, i8);
                int i9 = z5.f14679c;
                int i10 = z5.f14680e;
                if (i9 > i10) {
                    return true;
                }
                while (AbstractC1276k.b(objArr[i9], objArr2[i9])) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final Object f(int i6) {
        if (i6 >= 0 && i6 < this.f12466b) {
            return this.a[i6];
        }
        n(i6);
        throw null;
    }

    public final int g(Object obj) {
        int i6 = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i7 = this.f12466b;
            while (i6 < i7) {
                if (objArr[i6] == null) {
                    return i6;
                }
                i6++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i8 = this.f12466b;
        while (i6 < i8) {
            if (obj.equals(objArr2[i6])) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public final boolean h() {
        return this.f12466b == 0;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i6 = this.f12466b;
        int i7 = 0;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            i7 += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return i7;
    }

    public final boolean i() {
        return this.f12466b != 0;
    }

    public final boolean j(Object obj) {
        int g3 = g(obj);
        if (g3 < 0) {
            return false;
        }
        k(g3);
        return true;
    }

    public final Object k(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f12466b)) {
            n(i6);
            throw null;
        }
        Object[] objArr = this.a;
        Object obj = objArr[i6];
        if (i6 != i7 - 1) {
            Y3.k.j0(objArr, objArr, i6, i6 + 1, i7);
        }
        int i8 = this.f12466b - 1;
        this.f12466b = i8;
        objArr[i8] = null;
        return obj;
    }

    public final void l(int i6, int i7) {
        int i8;
        if (i6 < 0 || i6 > (i8 = this.f12466b) || i7 < 0 || i7 > i8) {
            StringBuilder j3 = AbstractC1135a.j(i6, "Start (", i7, ") and end (", ") must be in 0..");
            j3.append(this.f12466b);
            AbstractC1180a.d(j3.toString());
            throw null;
        }
        if (i7 < i6) {
            AbstractC1180a.c("Start (" + i6 + ") is more than end (" + i7 + ')');
            throw null;
        }
        if (i7 != i6) {
            if (i7 < i8) {
                Object[] objArr = this.a;
                Y3.k.j0(objArr, objArr, i6, i7, i8);
            }
            int i9 = this.f12466b;
            int i10 = i9 - (i7 - i6);
            Y3.k.o0(null, this.a, i10, i9);
            this.f12466b = i10;
        }
    }

    public final void m(Object[] objArr, int i6) {
        AbstractC1276k.f(objArr, "oldContent");
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i6, (length * 3) / 2)];
        Y3.k.j0(objArr, objArr2, 0, 0, length);
        this.a = objArr2;
    }

    public final void n(int i6) {
        StringBuilder k3 = AbstractC1135a.k("Index ", i6, " must be in 0..");
        k3.append(this.f12466b - 1);
        AbstractC1180a.d(k3.toString());
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i6 = this.f12466b;
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i7];
            if (i7 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i7 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i7++;
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ I() {
        this(16);
    }
}
