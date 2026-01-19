package V;

import Y4.l;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e implements RandomAccess {

    /* renamed from: c, reason: collision with root package name */
    public Object[] f8759c;

    /* renamed from: e, reason: collision with root package name */
    public b f8760e;

    /* renamed from: f, reason: collision with root package name */
    public int f8761f = 0;

    public e(Object[] objArr) {
        this.f8759c = objArr;
    }

    public final void a(int i6, Object obj) {
        int i7 = this.f8761f + 1;
        if (this.f8759c.length < i7) {
            m(i7);
        }
        Object[] objArr = this.f8759c;
        int i8 = this.f8761f;
        if (i6 != i8) {
            System.arraycopy(objArr, i6, objArr, i6 + 1, i8 - i6);
        }
        objArr[i6] = obj;
        this.f8761f++;
    }

    public final void b(Object obj) {
        int i6 = this.f8761f + 1;
        if (this.f8759c.length < i6) {
            m(i6);
        }
        Object[] objArr = this.f8759c;
        int i7 = this.f8761f;
        objArr[i7] = obj;
        this.f8761f = i7 + 1;
    }

    public final void c(int i6, e eVar) {
        int i7 = eVar.f8761f;
        if (i7 == 0) {
            return;
        }
        int i8 = this.f8761f + i7;
        if (this.f8759c.length < i8) {
            m(i8);
        }
        Object[] objArr = this.f8759c;
        int i9 = this.f8761f;
        if (i6 != i9) {
            System.arraycopy(objArr, i6, objArr, i6 + i7, i9 - i6);
        }
        System.arraycopy(eVar.f8759c, 0, objArr, i6, i7);
        this.f8761f += i7;
    }

    public final void d(List list, int i6) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i7 = this.f8761f + size;
        if (this.f8759c.length < i7) {
            m(i7);
        }
        Object[] objArr = this.f8759c;
        int i8 = this.f8761f;
        if (i6 != i8) {
            System.arraycopy(objArr, i6, objArr, i6 + size, i8 - i6);
        }
        int size2 = list.size();
        for (int i9 = 0; i9 < size2; i9++) {
            objArr[i6 + i9] = list.get(i9);
        }
        this.f8761f += size;
    }

    public final boolean e(int i6, Collection collection) {
        int i7 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i8 = this.f8761f + size;
        if (this.f8759c.length < i8) {
            m(i8);
        }
        Object[] objArr = this.f8759c;
        int i9 = this.f8761f;
        if (i6 != i9) {
            System.arraycopy(objArr, i6, objArr, i6 + size, i9 - i6);
        }
        for (Object obj : collection) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                l.U();
                throw null;
            }
            objArr[i7 + i6] = obj;
            i7 = i10;
        }
        this.f8761f += size;
        return true;
    }

    public final List f() {
        b bVar = this.f8760e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this, 0);
        this.f8760e = bVar2;
        return bVar2;
    }

    public final void g() {
        Object[] objArr = this.f8759c;
        int i6 = this.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            objArr[i7] = null;
        }
        this.f8761f = 0;
    }

    public final boolean h(Object obj) {
        int i6 = this.f8761f - 1;
        if (i6 >= 0) {
            for (int i7 = 0; !AbstractC1276k.b(this.f8759c[i7], obj); i7++) {
                if (i7 != i6) {
                }
            }
            return true;
        }
        return false;
    }

    public final int i(Object obj) {
        Object[] objArr = this.f8759c;
        int i6 = this.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            if (AbstractC1276k.b(obj, objArr[i7])) {
                return i7;
            }
        }
        return -1;
    }

    public final boolean j(Object obj) {
        int i6 = i(obj);
        if (i6 < 0) {
            return false;
        }
        k(i6);
        return true;
    }

    public final Object k(int i6) {
        Object[] objArr = this.f8759c;
        Object obj = objArr[i6];
        int i7 = this.f8761f;
        if (i6 != i7 - 1) {
            int i8 = i6 + 1;
            System.arraycopy(objArr, i8, objArr, i6, i7 - i8);
        }
        int i9 = this.f8761f - 1;
        this.f8761f = i9;
        objArr[i9] = null;
        return obj;
    }

    public final void l(int i6, int i7) {
        if (i7 > i6) {
            int i8 = this.f8761f;
            if (i7 < i8) {
                Object[] objArr = this.f8759c;
                System.arraycopy(objArr, i7, objArr, i6, i8 - i7);
            }
            int i9 = this.f8761f;
            int i10 = i9 - (i7 - i6);
            int i11 = i9 - 1;
            if (i10 <= i11) {
                int i12 = i10;
                while (true) {
                    this.f8759c[i12] = null;
                    if (i12 == i11) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f8761f = i10;
        }
    }

    public final void m(int i6) {
        Object[] objArr = this.f8759c;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i6, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f8759c = objArr2;
    }
}
