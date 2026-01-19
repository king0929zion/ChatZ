package k;

import java.util.Arrays;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class X implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f12509c;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ int[] f12510e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f12511f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f12512g;

    public X(int i6) {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f12510e = new int[i10];
        this.f12511f = new Object[i10];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final X clone() {
        Object clone = super.clone();
        AbstractC1276k.d(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        X x5 = (X) clone;
        x5.f12510e = (int[]) this.f12510e.clone();
        x5.f12511f = (Object[]) this.f12511f.clone();
        return x5;
    }

    public final boolean b(int i6) {
        if (this.f12509c) {
            AbstractC1174v.a(this);
        }
        return AbstractC1180a.a(this.f12510e, this.f12512g, i6) >= 0;
    }

    public final Object c(int i6) {
        Object obj;
        int a = AbstractC1180a.a(this.f12510e, this.f12512g, i6);
        if (a < 0 || (obj = this.f12511f[a]) == AbstractC1174v.f12577c) {
            return null;
        }
        return obj;
    }

    public final int d(int i6) {
        if (this.f12509c) {
            AbstractC1174v.a(this);
        }
        return this.f12510e[i6];
    }

    public final void e(int i6, Object obj) {
        int a = AbstractC1180a.a(this.f12510e, this.f12512g, i6);
        if (a >= 0) {
            this.f12511f[a] = obj;
            return;
        }
        int i7 = ~a;
        int i8 = this.f12512g;
        if (i7 < i8) {
            Object[] objArr = this.f12511f;
            if (objArr[i7] == AbstractC1174v.f12577c) {
                this.f12510e[i7] = i6;
                objArr[i7] = obj;
                return;
            }
        }
        if (this.f12509c && i8 >= this.f12510e.length) {
            AbstractC1174v.a(this);
            i7 = ~AbstractC1180a.a(this.f12510e, this.f12512g, i6);
        }
        int i9 = this.f12512g;
        if (i9 >= this.f12510e.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f12510e, i13);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f12510e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12511f, i13);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f12511f = copyOf2;
        }
        int i14 = this.f12512g;
        if (i14 - i7 != 0) {
            int[] iArr = this.f12510e;
            int i15 = i7 + 1;
            Y3.k.h0(iArr, iArr, i15, i7, i14);
            Object[] objArr2 = this.f12511f;
            Y3.k.j0(objArr2, objArr2, i15, i7, this.f12512g);
        }
        this.f12510e[i7] = i6;
        this.f12511f[i7] = obj;
        this.f12512g++;
    }

    public final int f() {
        if (this.f12509c) {
            AbstractC1174v.a(this);
        }
        return this.f12512g;
    }

    public final Object g(int i6) {
        if (this.f12509c) {
            AbstractC1174v.a(this);
        }
        Object[] objArr = this.f12511f;
        if (i6 < objArr.length) {
            return objArr[i6];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12512g * 28);
        sb.append('{');
        int i6 = this.f12512g;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(d(i7));
            sb.append('=');
            Object g3 = g(i7);
            if (g3 != this) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }
}
