package X;

import T.AbstractC0619m0;
import java.util.Arrays;
import java.util.ListIterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f extends c {

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9052c;

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f9053e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9054f;

    /* renamed from: g, reason: collision with root package name */
    public final int f9055g;

    public f(Object[] objArr, Object[] objArr2, int i6, int i7) {
        this.f9052c = objArr;
        this.f9053e = objArr2;
        this.f9054f = i6;
        this.f9055g = i7;
        if (!(a() > 32)) {
            AbstractC0619m0.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] i(Object[] objArr, int i6, int i7, Object obj, e eVar) {
        Object[] copyOf;
        int Z5 = h5.e.Z(i7, i6);
        if (i6 == 0) {
            if (Z5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC1276k.e(copyOf, "copyOf(...)");
            }
            Y3.k.j0(objArr, copyOf, Z5 + 1, Z5, 31);
            eVar.a = objArr[31];
            copyOf[Z5] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1276k.e(copyOf2, "copyOf(...)");
        int i8 = i6 - 5;
        Object obj2 = objArr[Z5];
        AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[Z5] = i((Object[]) obj2, i8, i7, obj, eVar);
        while (true) {
            Z5++;
            if (Z5 >= 32 || copyOf2[Z5] == null) {
                break;
            }
            Object obj3 = objArr[Z5];
            AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[Z5] = i((Object[]) obj3, i8, 0, eVar.a, eVar);
        }
        return copyOf2;
    }

    public static Object[] k(Object[] objArr, int i6, int i7, e eVar) {
        Object[] k3;
        int Z5 = h5.e.Z(i7, i6);
        if (i6 == 5) {
            eVar.a = objArr[Z5];
            k3 = null;
        } else {
            Object obj = objArr[Z5];
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            k3 = k((Object[]) obj, i6 - 5, i7, eVar);
        }
        if (k3 == null && Z5 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[Z5] = k3;
        return copyOf;
    }

    public static Object[] q(Object obj, Object[] objArr, int i6, int i7) {
        int Z5 = h5.e.Z(i7, i6);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        if (i6 == 0) {
            copyOf[Z5] = obj;
            return copyOf;
        }
        Object obj2 = copyOf[Z5];
        AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf[Z5] = q(obj, (Object[]) obj2, i6 - 5, i7);
        return copyOf;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        return this.f9054f;
    }

    @Override // X.c
    public final c b(int i6, Object obj) {
        int i7 = this.f9054f;
        Y4.d.p(i6, i7);
        if (i6 == i7) {
            return c(obj);
        }
        int p5 = p();
        Object[] objArr = this.f9052c;
        if (i6 >= p5) {
            return j(obj, objArr, i6 - p5);
        }
        e eVar = new e(null);
        return j(eVar.a, i(objArr, this.f9055g, i6, obj, eVar), 0);
    }

    @Override // X.c
    public final c c(Object obj) {
        int p5 = p();
        int i6 = this.f9054f;
        int i7 = i6 - p5;
        Object[] objArr = this.f9052c;
        Object[] objArr2 = this.f9053e;
        if (i7 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return l(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[i7] = obj;
        return new f(objArr, copyOf, i6 + 1, this.f9055g);
    }

    @Override // X.c
    public final g e() {
        return new g(this, this.f9052c, this.f9053e, this.f9055g);
    }

    @Override // X.c
    public final c f(b bVar) {
        g gVar = new g(this, this.f9052c, this.f9053e, this.f9055g);
        gVar.y(bVar);
        return gVar.c();
    }

    @Override // X.c
    public final c g(int i6) {
        Y4.d.o(i6, this.f9054f);
        int p5 = p();
        Object[] objArr = this.f9052c;
        int i7 = this.f9055g;
        return i6 >= p5 ? o(objArr, p5, i7, i6 - p5) : o(n(objArr, i7, i6, new e(this.f9053e[0])), p5, i7, 0);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Object[] objArr;
        Y4.d.o(i6, a());
        if (p() <= i6) {
            objArr = this.f9053e;
        } else {
            objArr = this.f9052c;
            for (int i7 = this.f9055g; i7 > 0; i7 -= 5) {
                Object obj = objArr[h5.e.Z(i6, i7)];
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i6 & 31];
    }

    @Override // X.c
    public final c h(int i6, Object obj) {
        int i7 = this.f9054f;
        Y4.d.o(i6, i7);
        int p5 = p();
        Object[] objArr = this.f9052c;
        Object[] objArr2 = this.f9053e;
        int i8 = this.f9055g;
        if (p5 > i6) {
            return new f(q(obj, objArr, i8, i6), objArr2, i7, i8);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[i6 & 31] = obj;
        return new f(objArr, copyOf, i7, i8);
    }

    public final f j(Object obj, Object[] objArr, int i6) {
        int p5 = p();
        int i7 = this.f9054f;
        int i8 = i7 - p5;
        Object[] objArr2 = this.f9053e;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        if (i8 < 32) {
            Y3.k.j0(objArr2, copyOf, i6 + 1, i6, i8);
            copyOf[i6] = obj;
            return new f(objArr, copyOf, i7 + 1, this.f9055g);
        }
        Object obj2 = objArr2[31];
        Y3.k.j0(objArr2, copyOf, i6 + 1, i6, i8 - 1);
        copyOf[i6] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return l(objArr, copyOf, objArr3);
    }

    public final f l(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i6 = this.f9054f;
        int i7 = i6 >> 5;
        int i8 = this.f9055g;
        if (i7 <= (1 << i8)) {
            return new f(m(i8, objArr, objArr2), objArr3, i6 + 1, i8);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i9 = i8 + 5;
        return new f(m(i9, objArr4, objArr2), objArr3, i6 + 1, i9);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final ListIterator listIterator(int i6) {
        Y4.d.p(i6, this.f9054f);
        return new h(this.f9052c, this.f9053e, i6, this.f9054f, (this.f9055g / 5) + 1);
    }

    public final Object[] m(int i6, Object[] objArr, Object[] objArr2) {
        Object[] objArr3;
        int Z5 = h5.e.Z(a() - 1, i6);
        if (objArr != null) {
            objArr3 = Arrays.copyOf(objArr, 32);
            AbstractC1276k.e(objArr3, "copyOf(...)");
        } else {
            objArr3 = new Object[32];
        }
        if (i6 == 5) {
            objArr3[Z5] = objArr2;
            return objArr3;
        }
        objArr3[Z5] = m(i6 - 5, (Object[]) objArr3[Z5], objArr2);
        return objArr3;
    }

    public final Object[] n(Object[] objArr, int i6, int i7, e eVar) {
        Object[] copyOf;
        int Z5 = h5.e.Z(i7, i6);
        if (i6 == 0) {
            if (Z5 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                AbstractC1276k.e(copyOf, "copyOf(...)");
            }
            Y3.k.j0(objArr, copyOf, Z5, Z5 + 1, 32);
            copyOf[31] = eVar.a;
            eVar.a = objArr[Z5];
            return copyOf;
        }
        int Z6 = objArr[31] == null ? h5.e.Z(p() - 1, i6) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        AbstractC1276k.e(copyOf2, "copyOf(...)");
        int i8 = i6 - 5;
        int i9 = Z5 + 1;
        if (i9 <= Z6) {
            while (true) {
                Object obj = copyOf2[Z6];
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[Z6] = n((Object[]) obj, i8, 0, eVar);
                if (Z6 == i9) {
                    break;
                }
                Z6--;
            }
        }
        Object obj2 = copyOf2[Z5];
        AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[Z5] = n((Object[]) obj2, i8, i7, eVar);
        return copyOf2;
    }

    public final c o(Object[] objArr, int i6, int i7, int i8) {
        int i9 = this.f9054f - i6;
        if (i9 != 1) {
            Object[] objArr2 = this.f9053e;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            int i10 = i9 - 1;
            if (i8 < i10) {
                Y3.k.j0(objArr2, copyOf, i8, i8 + 1, i9);
            }
            copyOf[i10] = null;
            return new f(objArr, copyOf, (i6 + i9) - 1, i7);
        }
        if (i7 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                AbstractC1276k.e(objArr, "copyOf(...)");
            }
            return new j(objArr);
        }
        e eVar = new e(null);
        Object[] k3 = k(objArr, i7, i6 - 1, eVar);
        AbstractC1276k.c(k3);
        Object obj = eVar.a;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (k3[1] != null) {
            return new f(k3, objArr3, i6, i7);
        }
        Object obj2 = k3[0];
        AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new f((Object[]) obj2, objArr3, i6, i7 - 5);
    }

    public final int p() {
        return (this.f9054f - 1) & (-32);
    }
}
