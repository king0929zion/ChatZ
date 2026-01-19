package k;

import java.util.Arrays;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1173u implements Cloneable {

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f12572c;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ long[] f12573e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object[] f12574f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ int f12575g;

    public C1173u(int i6) {
        if (i6 == 0) {
            this.f12573e = AbstractC1180a.f12634b;
            this.f12574f = AbstractC1180a.f12635c;
            return;
        }
        int i7 = i6 * 8;
        int i8 = 4;
        while (true) {
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (i7 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 8;
        this.f12573e = new long[i10];
        this.f12574f = new Object[i10];
    }

    public final Object a(long j3) {
        Object obj;
        int b5 = AbstractC1180a.b(this.f12573e, this.f12575g, j3);
        if (b5 < 0 || (obj = this.f12574f[b5]) == AbstractC1174v.a) {
            return null;
        }
        return obj;
    }

    public final long b(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f12575g)) {
            AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
            throw null;
        }
        if (this.f12572c) {
            long[] jArr = this.f12573e;
            Object[] objArr = this.f12574f;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC1174v.a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f12572c = false;
            this.f12575g = i8;
        }
        return this.f12573e[i6];
    }

    public final void c(long j3, Object obj) {
        Object obj2 = AbstractC1174v.a;
        int b5 = AbstractC1180a.b(this.f12573e, this.f12575g, j3);
        if (b5 >= 0) {
            this.f12574f[b5] = obj;
            return;
        }
        int i6 = ~b5;
        int i7 = this.f12575g;
        if (i6 < i7) {
            Object[] objArr = this.f12574f;
            if (objArr[i6] == obj2) {
                this.f12573e[i6] = j3;
                objArr[i6] = obj;
                return;
            }
        }
        if (this.f12572c) {
            long[] jArr = this.f12573e;
            if (i7 >= jArr.length) {
                Object[] objArr2 = this.f12574f;
                int i8 = 0;
                for (int i9 = 0; i9 < i7; i9++) {
                    Object obj3 = objArr2[i9];
                    if (obj3 != obj2) {
                        if (i9 != i8) {
                            jArr[i8] = jArr[i9];
                            objArr2[i8] = obj3;
                            objArr2[i9] = null;
                        }
                        i8++;
                    }
                }
                this.f12572c = false;
                this.f12575g = i8;
                i6 = ~AbstractC1180a.b(this.f12573e, i8, j3);
            }
        }
        int i10 = this.f12575g;
        if (i10 >= this.f12573e.length) {
            int i11 = (i10 + 1) * 8;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 8;
            long[] copyOf = Arrays.copyOf(this.f12573e, i14);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f12573e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12574f, i14);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f12574f = copyOf2;
        }
        int i15 = this.f12575g;
        if (i15 - i6 != 0) {
            long[] jArr2 = this.f12573e;
            int i16 = i6 + 1;
            Y3.k.i0(jArr2, jArr2, i16, i6, i15);
            Object[] objArr3 = this.f12574f;
            Y3.k.j0(objArr3, objArr3, i16, i6, this.f12575g);
        }
        this.f12573e[i6] = j3;
        this.f12574f[i6] = obj;
        this.f12575g++;
    }

    public final Object clone() {
        Object clone = super.clone();
        AbstractC1276k.d(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C1173u c1173u = (C1173u) clone;
        c1173u.f12573e = (long[]) this.f12573e.clone();
        c1173u.f12574f = (Object[]) this.f12574f.clone();
        return c1173u;
    }

    public final void d(long j3) {
        int b5 = AbstractC1180a.b(this.f12573e, this.f12575g, j3);
        if (b5 >= 0) {
            Object[] objArr = this.f12574f;
            Object obj = objArr[b5];
            Object obj2 = AbstractC1174v.a;
            if (obj != obj2) {
                objArr[b5] = obj2;
                this.f12572c = true;
            }
        }
    }

    public final int e() {
        if (this.f12572c) {
            int i6 = this.f12575g;
            long[] jArr = this.f12573e;
            Object[] objArr = this.f12574f;
            int i7 = 0;
            for (int i8 = 0; i8 < i6; i8++) {
                Object obj = objArr[i8];
                if (obj != AbstractC1174v.a) {
                    if (i8 != i7) {
                        jArr[i7] = jArr[i8];
                        objArr[i7] = obj;
                        objArr[i8] = null;
                    }
                    i7++;
                }
            }
            this.f12572c = false;
            this.f12575g = i7;
        }
        return this.f12575g;
    }

    public final Object f(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f12575g)) {
            AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
            throw null;
        }
        if (this.f12572c) {
            long[] jArr = this.f12573e;
            Object[] objArr = this.f12574f;
            int i8 = 0;
            for (int i9 = 0; i9 < i7; i9++) {
                Object obj = objArr[i9];
                if (obj != AbstractC1174v.a) {
                    if (i9 != i8) {
                        jArr[i8] = jArr[i9];
                        objArr[i8] = obj;
                        objArr[i9] = null;
                    }
                    i8++;
                }
            }
            this.f12572c = false;
            this.f12575g = i8;
        }
        return this.f12574f[i6];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12575g * 28);
        sb.append('{');
        int i6 = this.f12575g;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            sb.append(b(i7));
            sb.append('=');
            Object f6 = f(i7);
            if (f6 != sb) {
                sb.append(f6);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    public /* synthetic */ C1173u(Object obj) {
        this(10);
    }
}
