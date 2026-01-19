package X;

import T.AbstractC0619m0;
import Y3.AbstractC0739f;
import a0.C0792b;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m4.AbstractC1276k;
import n4.InterfaceC1373b;

/* loaded from: classes.dex */
public final class g extends AbstractC0739f implements Collection, InterfaceC1373b {

    /* renamed from: c, reason: collision with root package name */
    public c f9056c;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f9057e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f9058f;

    /* renamed from: g, reason: collision with root package name */
    public int f9059g;

    /* renamed from: h, reason: collision with root package name */
    public C0792b f9060h = new Object();

    /* renamed from: i, reason: collision with root package name */
    public Object[] f9061i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f9062j;

    /* renamed from: k, reason: collision with root package name */
    public int f9063k;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, a0.b] */
    public g(c cVar, Object[] objArr, Object[] objArr2, int i6) {
        this.f9056c = cVar;
        this.f9057e = objArr;
        this.f9058f = objArr2;
        this.f9059g = i6;
        this.f9061i = objArr;
        this.f9062j = objArr2;
        this.f9063k = cVar.a();
    }

    public static void d(Object[] objArr, int i6, Iterator it) {
        while (i6 < 32 && it.hasNext()) {
            objArr[i6] = it.next();
            i6++;
        }
    }

    public final Object A(Object[] objArr, int i6, int i7, int i8) {
        int i9 = this.f9063k - i6;
        if (i9 == 1) {
            Object obj = this.f9062j[0];
            q(objArr, i6, i7);
            return obj;
        }
        Object[] objArr2 = this.f9062j;
        Object obj2 = objArr2[i8];
        Object[] k3 = k(objArr2);
        Y3.k.j0(objArr2, k3, i8, i8 + 1, i9);
        k3[i9 - 1] = null;
        this.f9061i = objArr;
        this.f9062j = k3;
        this.f9063k = (i6 + i9) - 1;
        this.f9059g = i7;
        return obj2;
    }

    public final int B() {
        int i6 = this.f9063k;
        if (i6 <= 32) {
            return 0;
        }
        return (i6 - 1) & (-32);
    }

    public final Object[] C(Object[] objArr, int i6, int i7, Object obj, e eVar) {
        int Z5 = h5.e.Z(i7, i6);
        Object[] k3 = k(objArr);
        if (i6 != 0) {
            Object obj2 = k3[Z5];
            AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            k3[Z5] = C((Object[]) obj2, i6 - 5, i7, obj, eVar);
            return k3;
        }
        if (k3 != objArr) {
            ((AbstractList) this).modCount++;
        }
        eVar.a = k3[Z5];
        k3[Z5] = obj;
        return k3;
    }

    public final void D(Collection collection, int i6, Object[] objArr, int i7, Object[][] objArr2, int i8, Object[] objArr3) {
        Object[] m3;
        if (i8 < 1) {
            AbstractC0619m0.a("requires at least one nullBuffer");
        }
        Object[] k3 = k(objArr);
        objArr2[0] = k3;
        int i9 = i6 & 31;
        int size = ((collection.size() + i6) - 1) & 31;
        int i10 = (i7 - i9) + size;
        if (i10 < 32) {
            Y3.k.j0(k3, objArr3, size + 1, i9, i7);
        } else {
            int i11 = i10 - 31;
            if (i8 == 1) {
                m3 = k3;
            } else {
                m3 = m();
                i8--;
                objArr2[i8] = m3;
            }
            int i12 = i7 - i11;
            Y3.k.j0(k3, objArr3, 0, i12, i7);
            Y3.k.j0(k3, m3, size + 1, i9, i12);
            objArr3 = m3;
        }
        Iterator it = collection.iterator();
        d(k3, i9, it);
        for (int i13 = 1; i13 < i8; i13++) {
            Object[] m5 = m();
            d(m5, 0, it);
            objArr2[i13] = m5;
        }
        d(objArr3, 0, it);
    }

    public final int E() {
        int i6 = this.f9063k;
        return i6 <= 32 ? i6 : i6 - ((i6 - 1) & (-32));
    }

    @Override // Y3.AbstractC0739f
    public final int a() {
        return this.f9063k;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i6, Object obj) {
        Y4.d.p(i6, a());
        if (i6 == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int B5 = B();
        if (i6 >= B5) {
            h(obj, this.f9061i, i6 - B5);
            return;
        }
        e eVar = new e(null);
        Object[] objArr = this.f9061i;
        AbstractC1276k.c(objArr);
        h(eVar.a, g(objArr, this.f9059g, i6, obj, eVar), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i6, Collection collection) {
        Collection collection2;
        g gVar;
        Object[] m3;
        Y4.d.p(i6, this.f9063k);
        if (i6 == this.f9063k) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i7 = (i6 >> 5) << 5;
        int size = ((collection.size() + (this.f9063k - i7)) - 1) / 32;
        if (size == 0) {
            int i8 = i6 & 31;
            int size2 = ((collection.size() + i6) - 1) & 31;
            Object[] objArr = this.f9062j;
            Object[] k3 = k(objArr);
            Y3.k.j0(objArr, k3, size2 + 1, i8, E());
            d(k3, i8, collection.iterator());
            this.f9062j = k3;
            this.f9063k = collection.size() + this.f9063k;
            return true;
        }
        Object[][] objArr2 = new Object[size];
        int E5 = E();
        int size3 = collection.size() + this.f9063k;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i6 >= B()) {
            m3 = m();
            collection2 = collection;
            D(collection2, i6, this.f9062j, E5, objArr2, size, m3);
            gVar = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            gVar = this;
            if (size3 > E5) {
                int i9 = size3 - E5;
                Object[] l3 = l(gVar.f9062j, i9);
                gVar.f(collection2, i6, i9, objArr2, size, l3);
                objArr2 = objArr2;
                m3 = l3;
            } else {
                Object[] objArr3 = gVar.f9062j;
                m3 = m();
                int i10 = E5 - size3;
                Y3.k.j0(objArr3, m3, 0, i10, E5);
                int i11 = 32 - i10;
                Object[] l5 = l(gVar.f9062j, i11);
                int i12 = size - 1;
                objArr2[i12] = l5;
                gVar.f(collection2, i6, i11, objArr2, i12, l5);
                collection2 = collection2;
            }
        }
        gVar.f9061i = s(gVar.f9061i, i7, objArr2);
        gVar.f9062j = m3;
        gVar.f9063k = collection2.size() + gVar.f9063k;
        return true;
    }

    @Override // Y3.AbstractC0739f
    public final Object b(int i6) {
        Y4.d.o(i6, a());
        ((AbstractList) this).modCount++;
        int B5 = B();
        if (i6 >= B5) {
            return A(this.f9061i, B5, this.f9059g, i6 - B5);
        }
        e eVar = new e(this.f9062j[0]);
        Object[] objArr = this.f9061i;
        AbstractC1276k.c(objArr);
        A(z(objArr, this.f9059g, i6, eVar), B5, this.f9059g, 0);
        return eVar.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, a0.b] */
    public final c c() {
        c fVar;
        Object[] objArr = this.f9061i;
        if (objArr == this.f9057e && this.f9062j == this.f9058f) {
            fVar = this.f9056c;
        } else {
            this.f9060h = new Object();
            this.f9057e = objArr;
            Object[] objArr2 = this.f9062j;
            this.f9058f = objArr2;
            if (objArr != null) {
                fVar = new f(objArr, objArr2, this.f9063k, this.f9059g);
            } else if (objArr2.length == 0) {
                fVar = j.f9070e;
            } else {
                Object[] copyOf = Arrays.copyOf(objArr2, this.f9063k);
                AbstractC1276k.e(copyOf, "copyOf(...)");
                fVar = new j(copyOf);
            }
        }
        this.f9056c = fVar;
        return fVar;
    }

    public final int e() {
        return ((AbstractList) this).modCount;
    }

    public final void f(Collection collection, int i6, int i7, Object[][] objArr, int i8, Object[] objArr2) {
        if (this.f9061i == null) {
            throw new IllegalStateException("root is null");
        }
        int i9 = i6 >> 5;
        a j3 = j(B() >> 5);
        int i10 = i8;
        Object[] objArr3 = objArr2;
        while (j3.f9046c - 1 != i9) {
            Object[] objArr4 = (Object[]) j3.previous();
            Y3.k.j0(objArr4, objArr3, 0, 32 - i7, 32);
            objArr3 = l(objArr4, i7);
            i10--;
            objArr[i10] = objArr3;
        }
        Object[] objArr5 = (Object[]) j3.previous();
        int B5 = i8 - (((B() >> 5) - 1) - i9);
        if (B5 < i8) {
            objArr2 = objArr[B5];
            AbstractC1276k.c(objArr2);
        }
        D(collection, i6, objArr5, 32, objArr, B5, objArr2);
    }

    public final Object[] g(Object[] objArr, int i6, int i7, Object obj, e eVar) {
        Object obj2;
        int Z5 = h5.e.Z(i7, i6);
        if (i6 == 0) {
            eVar.a = objArr[31];
            Object[] k3 = k(objArr);
            Y3.k.j0(objArr, k3, Z5 + 1, Z5, 31);
            k3[Z5] = obj;
            return k3;
        }
        Object[] k5 = k(objArr);
        int i8 = i6 - 5;
        Object obj3 = k5[Z5];
        AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        k5[Z5] = g((Object[]) obj3, i8, i7, obj, eVar);
        while (true) {
            Z5++;
            if (Z5 >= 32 || (obj2 = k5[Z5]) == null) {
                break;
            }
            k5[Z5] = g((Object[]) obj2, i8, 0, eVar.a, eVar);
        }
        return k5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i6) {
        Object[] objArr;
        Y4.d.o(i6, a());
        if (B() <= i6) {
            objArr = this.f9062j;
        } else {
            objArr = this.f9061i;
            AbstractC1276k.c(objArr);
            for (int i7 = this.f9059g; i7 > 0; i7 -= 5) {
                Object obj = objArr[h5.e.Z(i6, i7)];
                AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i6 & 31];
    }

    public final void h(Object obj, Object[] objArr, int i6) {
        int E5 = E();
        Object[] k3 = k(this.f9062j);
        if (E5 < 32) {
            Y3.k.j0(this.f9062j, k3, i6 + 1, i6, E5);
            k3[i6] = obj;
            this.f9061i = objArr;
            this.f9062j = k3;
            this.f9063k++;
            return;
        }
        Object[] objArr2 = this.f9062j;
        Object obj2 = objArr2[31];
        Y3.k.j0(objArr2, k3, i6 + 1, i6, 31);
        k3[i6] = obj;
        t(objArr, k3, n(obj2));
    }

    public final boolean i(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f9060h;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final a j(int i6) {
        Object[] objArr = this.f9061i;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int B5 = B() >> 5;
        Y4.d.p(i6, B5);
        int i7 = this.f9059g;
        return i7 == 0 ? new d(objArr, i6) : new k(objArr, i6, B5, i7 / 5);
    }

    public final Object[] k(Object[] objArr) {
        if (objArr == null) {
            return m();
        }
        if (i(objArr)) {
            return objArr;
        }
        Object[] m3 = m();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        Y3.k.l0(objArr, m3, 0, length, 6);
        return m3;
    }

    public final Object[] l(Object[] objArr, int i6) {
        if (i(objArr)) {
            Y3.k.j0(objArr, objArr, i6, 0, 32 - i6);
            return objArr;
        }
        Object[] m3 = m();
        Y3.k.j0(objArr, m3, i6, 0, 32 - i6);
        return m3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i6) {
        Y4.d.p(i6, this.f9063k);
        return new i(this, i6);
    }

    public final Object[] m() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f9060h;
        return objArr;
    }

    public final Object[] n(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f9060h;
        return objArr;
    }

    public final Object[] o(Object[] objArr, int i6, int i7) {
        if (i7 < 0) {
            AbstractC0619m0.a("shift should be positive");
        }
        if (i7 == 0) {
            return objArr;
        }
        int Z5 = h5.e.Z(i6, i7);
        Object obj = objArr[Z5];
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object o5 = o((Object[]) obj, i6, i7 - 5);
        if (Z5 < 31) {
            int i8 = Z5 + 1;
            if (objArr[i8] != null) {
                if (i(objArr)) {
                    Arrays.fill(objArr, i8, 32, (Object) null);
                }
                Object[] m3 = m();
                Y3.k.j0(objArr, m3, 0, 0, i8);
                objArr = m3;
            }
        }
        if (o5 == objArr[Z5]) {
            return objArr;
        }
        Object[] k3 = k(objArr);
        k3[Z5] = o5;
        return k3;
    }

    public final Object[] p(Object[] objArr, int i6, int i7, e eVar) {
        Object[] p5;
        int Z5 = h5.e.Z(i7 - 1, i6);
        if (i6 == 5) {
            eVar.a = objArr[Z5];
            p5 = null;
        } else {
            Object obj = objArr[Z5];
            AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            p5 = p((Object[]) obj, i6 - 5, i7, eVar);
        }
        if (p5 == null && Z5 == 0) {
            return null;
        }
        Object[] k3 = k(objArr);
        k3[Z5] = p5;
        return k3;
    }

    public final void q(Object[] objArr, int i6, int i7) {
        if (i7 == 0) {
            this.f9061i = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f9062j = objArr;
            this.f9063k = i6;
            this.f9059g = i7;
            return;
        }
        e eVar = new e(null);
        AbstractC1276k.c(objArr);
        Object[] p5 = p(objArr, i7, i6, eVar);
        AbstractC1276k.c(p5);
        Object obj = eVar.a;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f9062j = (Object[]) obj;
        this.f9063k = i6;
        if (p5[1] == null) {
            this.f9061i = (Object[]) p5[0];
            this.f9059g = i7 - 5;
        } else {
            this.f9061i = p5;
            this.f9059g = i7;
        }
    }

    public final Object[] r(Object[] objArr, int i6, int i7, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0619m0.a("invalid buffersIterator");
        }
        if (!(i7 >= 0)) {
            AbstractC0619m0.a("negative shift");
        }
        if (i7 == 0) {
            return (Object[]) it.next();
        }
        Object[] k3 = k(objArr);
        int Z5 = h5.e.Z(i6, i7);
        int i8 = i7 - 5;
        k3[Z5] = r((Object[]) k3[Z5], i6, i8, it);
        while (true) {
            Z5++;
            if (Z5 >= 32 || !it.hasNext()) {
                break;
            }
            k3[Z5] = r((Object[]) k3[Z5], 0, i8, it);
        }
        return k3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return y(new b(1, collection));
    }

    public final Object[] s(Object[] objArr, int i6, Object[][] objArr2) {
        K4.h i7 = AbstractC1276k.i(objArr2);
        int i8 = i6 >> 5;
        int i9 = this.f9059g;
        Object[] r5 = i8 < (1 << i9) ? r(objArr, i6, i9, i7) : k(objArr);
        while (i7.hasNext()) {
            this.f9059g += 5;
            r5 = n(r5);
            int i10 = this.f9059g;
            r(r5, 1 << i10, i10, i7);
        }
        return r5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i6, Object obj) {
        Y4.d.o(i6, a());
        if (B() > i6) {
            e eVar = new e(null);
            Object[] objArr = this.f9061i;
            AbstractC1276k.c(objArr);
            this.f9061i = C(objArr, this.f9059g, i6, obj, eVar);
            return eVar.a;
        }
        Object[] k3 = k(this.f9062j);
        if (k3 != this.f9062j) {
            ((AbstractList) this).modCount++;
        }
        int i7 = i6 & 31;
        Object obj2 = k3[i7];
        k3[i7] = obj;
        this.f9062j = k3;
        return obj2;
    }

    public final void t(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i6 = this.f9063k;
        int i7 = i6 >> 5;
        int i8 = this.f9059g;
        if (i7 > (1 << i8)) {
            this.f9061i = u(this.f9059g + 5, n(objArr), objArr2);
            this.f9062j = objArr3;
            this.f9059g += 5;
            this.f9063k++;
            return;
        }
        if (objArr == null) {
            this.f9061i = objArr2;
            this.f9062j = objArr3;
            this.f9063k = i6 + 1;
        } else {
            this.f9061i = u(i8, objArr, objArr2);
            this.f9062j = objArr3;
            this.f9063k++;
        }
    }

    public final Object[] u(int i6, Object[] objArr, Object[] objArr2) {
        int Z5 = h5.e.Z(a() - 1, i6);
        Object[] k3 = k(objArr);
        if (i6 == 5) {
            k3[Z5] = objArr2;
            return k3;
        }
        k3[Z5] = u(i6 - 5, (Object[]) k3[Z5], objArr2);
        return k3;
    }

    public final int v(l4.c cVar, Object[] objArr, int i6, int i7, e eVar, ArrayList arrayList, ArrayList arrayList2) {
        if (i(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = eVar.a;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj2 = objArr[i8];
            if (!((Boolean) cVar.f(obj2)).booleanValue()) {
                if (i7 == 32) {
                    objArr3 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m();
                    i7 = 0;
                }
                objArr3[i7] = obj2;
                i7++;
            }
        }
        eVar.a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i7;
    }

    public final int w(l4.c cVar, Object[] objArr, int i6, e eVar) {
        Object[] objArr2 = objArr;
        int i7 = i6;
        boolean z5 = false;
        for (int i8 = 0; i8 < i6; i8++) {
            Object obj = objArr[i8];
            if (((Boolean) cVar.f(obj)).booleanValue()) {
                if (!z5) {
                    objArr2 = k(objArr);
                    z5 = true;
                    i7 = i8;
                }
            } else if (z5) {
                objArr2[i7] = obj;
                i7++;
            }
        }
        eVar.a = objArr2;
        return i7;
    }

    public final int x(l4.c cVar, int i6, e eVar) {
        int w5 = w(cVar, this.f9062j, i6, eVar);
        if (w5 == i6) {
            return i6;
        }
        Object obj = eVar.a;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, w5, i6, (Object) null);
        this.f9062j = objArr;
        this.f9063k -= i6 - w5;
        return w5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r0 != r8) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0016, code lost:
    
        if (x(r1, r8, r5) != r8) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(l4.c r16) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.g.y(l4.c):boolean");
    }

    public final Object[] z(Object[] objArr, int i6, int i7, e eVar) {
        int Z5 = h5.e.Z(i7, i6);
        if (i6 == 0) {
            Object obj = objArr[Z5];
            Object[] k3 = k(objArr);
            Y3.k.j0(objArr, k3, Z5, Z5 + 1, 32);
            k3[31] = eVar.a;
            eVar.a = obj;
            return k3;
        }
        int Z6 = objArr[31] == null ? h5.e.Z(B() - 1, i6) : 31;
        Object[] k5 = k(objArr);
        int i8 = i6 - 5;
        int i9 = Z5 + 1;
        if (i9 <= Z6) {
            while (true) {
                Object obj2 = k5[Z6];
                AbstractC1276k.d(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                k5[Z6] = z((Object[]) obj2, i8, 0, eVar);
                if (Z6 == i9) {
                    break;
                }
                Z6--;
            }
        }
        Object obj3 = k5[Z5];
        AbstractC1276k.d(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        k5[Z5] = z((Object[]) obj3, i8, i7, eVar);
        return k5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int E5 = E();
        if (E5 < 32) {
            Object[] k3 = k(this.f9062j);
            k3[E5] = obj;
            this.f9062j = k3;
            this.f9063k = a() + 1;
        } else {
            t(this.f9061i, this.f9062j, n(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int E5 = E();
        Iterator it = collection.iterator();
        if (32 - E5 >= collection.size()) {
            Object[] k3 = k(this.f9062j);
            d(k3, E5, it);
            this.f9062j = k3;
            this.f9063k = collection.size() + this.f9063k;
            return true;
        }
        int size = ((collection.size() + E5) - 1) / 32;
        Object[][] objArr = new Object[size];
        Object[] k5 = k(this.f9062j);
        d(k5, E5, it);
        objArr[0] = k5;
        for (int i6 = 1; i6 < size; i6++) {
            Object[] m3 = m();
            d(m3, 0, it);
            objArr[i6] = m3;
        }
        this.f9061i = s(this.f9061i, B(), objArr);
        Object[] m5 = m();
        d(m5, 0, it);
        this.f9062j = m5;
        this.f9063k = collection.size() + this.f9063k;
        return true;
    }
}
