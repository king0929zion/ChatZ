package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class j extends c {

    /* renamed from: e, reason: collision with root package name */
    public static final j f9070e = new j(new Object[0]);

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f9071c;

    public j(Object[] objArr) {
        this.f9071c = objArr;
    }

    @Override // Y3.AbstractC0734a
    public final int a() {
        return this.f9071c.length;
    }

    @Override // X.c
    public final c b(int i6, Object obj) {
        Object[] objArr = this.f9071c;
        Y4.d.p(i6, objArr.length);
        if (i6 == objArr.length) {
            return c(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            Y3.k.l0(objArr, objArr2, 0, i6, 6);
            Y3.k.j0(objArr, objArr2, i6 + 1, i6, objArr.length);
            objArr2[i6] = obj;
            return new j(objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        Y3.k.j0(objArr, copyOf, i6 + 1, i6, objArr.length - 1);
        copyOf[i6] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new f(copyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // X.c
    public final c c(Object obj) {
        Object[] objArr = this.f9071c;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new f(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[objArr.length] = obj;
        return new j(copyOf);
    }

    @Override // X.c
    public final c d(Collection collection) {
        Object[] objArr = this.f9071c;
        if (collection.size() + objArr.length > 32) {
            g e6 = e();
            e6.addAll(collection);
            return e6.c();
        }
        Object[] copyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            copyOf[length] = it.next();
            length++;
        }
        return new j(copyOf);
    }

    @Override // X.c
    public final g e() {
        return new g(this, null, this.f9071c, 0);
    }

    @Override // X.c
    public final c f(b bVar) {
        Object[] objArr = this.f9071c;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArr2 = objArr;
        boolean z5 = false;
        for (int i6 = 0; i6 < length2; i6++) {
            Object obj = objArr[i6];
            if (((Boolean) bVar.f(obj)).booleanValue()) {
                if (!z5) {
                    objArr2 = Arrays.copyOf(objArr, objArr.length);
                    AbstractC1276k.e(objArr2, "copyOf(...)");
                    z5 = true;
                    length = i6;
                }
            } else if (z5) {
                objArr2[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? f9070e : new j(Y3.k.n0(objArr2, 0, length));
    }

    @Override // X.c
    public final c g(int i6) {
        Object[] objArr = this.f9071c;
        Y4.d.o(i6, objArr.length);
        if (objArr.length == 1) {
            return f9070e;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        Y3.k.j0(objArr, copyOf, i6, i6 + 1, objArr.length);
        return new j(copyOf);
    }

    @Override // java.util.List
    public final Object get(int i6) {
        Y4.d.o(i6, a());
        return this.f9071c[i6];
    }

    @Override // X.c
    public final c h(int i6, Object obj) {
        Object[] objArr = this.f9071c;
        Y4.d.o(i6, objArr.length);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC1276k.e(copyOf, "copyOf(...)");
        copyOf[i6] = obj;
        return new j(copyOf);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final int indexOf(Object obj) {
        return Y3.k.v0(obj, this.f9071c);
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f9071c;
        AbstractC1276k.f(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i6 < 0) {
                        break;
                    }
                    length = i6;
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i7 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    length2 = i7;
                }
            }
        }
        return -1;
    }

    @Override // Y3.AbstractC0737d, java.util.List
    public final ListIterator listIterator(int i6) {
        Object[] objArr = this.f9071c;
        Y4.d.p(i6, objArr.length);
        return new d(objArr, i6, objArr.length);
    }
}
