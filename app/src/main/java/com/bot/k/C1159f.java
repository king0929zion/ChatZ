package k;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import l.AbstractC1180a;
import m4.AbstractC1276k;

/* renamed from: k.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1159f implements Map {

    /* renamed from: c, reason: collision with root package name */
    public int[] f12537c;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f12538e;

    /* renamed from: f, reason: collision with root package name */
    public int f12539f;

    /* renamed from: g, reason: collision with root package name */
    public C1154a f12540g;

    /* renamed from: h, reason: collision with root package name */
    public C1156c f12541h;

    /* renamed from: i, reason: collision with root package name */
    public C1158e f12542i;

    public C1159f(int i6) {
        this.f12537c = i6 == 0 ? AbstractC1180a.a : new int[i6];
        this.f12538e = i6 == 0 ? AbstractC1180a.f12635c : new Object[i6 << 1];
    }

    public final int a(Object obj) {
        int i6 = this.f12539f * 2;
        Object[] objArr = this.f12538e;
        if (obj == null) {
            for (int i7 = 1; i7 < i6; i7 += 2) {
                if (objArr[i7] == null) {
                    return i7 >> 1;
                }
            }
            return -1;
        }
        for (int i8 = 1; i8 < i6; i8 += 2) {
            if (obj.equals(objArr[i8])) {
                return i8 >> 1;
            }
        }
        return -1;
    }

    public final boolean b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f12539f > 0) {
            this.f12537c = AbstractC1180a.a;
            this.f12538e = AbstractC1180a.f12635c;
            this.f12539f = 0;
        }
        if (this.f12539f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d(int i6, Object obj) {
        int i7 = this.f12539f;
        if (i7 == 0) {
            return -1;
        }
        int a = AbstractC1180a.a(this.f12537c, i7, i6);
        if (a < 0 || AbstractC1276k.b(obj, this.f12538e[a << 1])) {
            return a;
        }
        int i8 = a + 1;
        while (i8 < i7 && this.f12537c[i8] == i6) {
            if (AbstractC1276k.b(obj, this.f12538e[i8 << 1])) {
                return i8;
            }
            i8++;
        }
        for (int i9 = a - 1; i9 >= 0 && this.f12537c[i9] == i6; i9--) {
            if (AbstractC1276k.b(obj, this.f12538e[i9 << 1])) {
                return i9;
            }
        }
        return ~i8;
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1154a c1154a = this.f12540g;
        if (c1154a != null) {
            return c1154a;
        }
        C1154a c1154a2 = new C1154a(this);
        this.f12540g = c1154a2;
        return c1154a2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C1159f) {
                int i6 = this.f12539f;
                if (i6 != ((C1159f) obj).f12539f) {
                    return false;
                }
                C1159f c1159f = (C1159f) obj;
                for (int i7 = 0; i7 < i6; i7++) {
                    Object g3 = g(i7);
                    Object k3 = k(i7);
                    Object obj2 = c1159f.get(g3);
                    if (k3 == null) {
                        if (obj2 != null || !c1159f.containsKey(g3)) {
                            return false;
                        }
                    } else if (!k3.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f12539f != ((Map) obj).size()) {
                return false;
            }
            int i8 = this.f12539f;
            for (int i9 = 0; i9 < i8; i9++) {
                Object g6 = g(i9);
                Object k5 = k(i9);
                Object obj3 = ((Map) obj).get(g6);
                if (k5 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(g6)) {
                        return false;
                    }
                } else if (!k5.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int f() {
        int i6 = this.f12539f;
        if (i6 == 0) {
            return -1;
        }
        int a = AbstractC1180a.a(this.f12537c, i6, 0);
        if (a < 0 || this.f12538e[a << 1] == null) {
            return a;
        }
        int i7 = a + 1;
        while (i7 < i6 && this.f12537c[i7] == 0) {
            if (this.f12538e[i7 << 1] == null) {
                return i7;
            }
            i7++;
        }
        for (int i8 = a - 1; i8 >= 0 && this.f12537c[i8] == 0; i8--) {
            if (this.f12538e[i8 << 1] == null) {
                return i8;
            }
        }
        return ~i7;
    }

    public final Object g(int i6) {
        boolean z5 = false;
        if (i6 >= 0 && i6 < this.f12539f) {
            z5 = true;
        }
        if (z5) {
            return this.f12538e[i6 << 1];
        }
        AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
        throw null;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return this.f12538e[(e6 << 1) + 1];
        }
        return null;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int e6 = e(obj);
        return e6 >= 0 ? this.f12538e[(e6 << 1) + 1] : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return i(e6);
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int[] iArr = this.f12537c;
        Object[] objArr = this.f12538e;
        int i6 = this.f12539f;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            i9 += (obj != null ? obj.hashCode() : 0) ^ iArr[i8];
            i8++;
            i7 += 2;
        }
        return i9;
    }

    public final Object i(int i6) {
        int i7;
        if (i6 < 0 || i6 >= (i7 = this.f12539f)) {
            AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
            throw null;
        }
        Object[] objArr = this.f12538e;
        int i8 = i6 << 1;
        Object obj = objArr[i8 + 1];
        if (i7 <= 1) {
            clear();
            return obj;
        }
        int i9 = i7 - 1;
        int[] iArr = this.f12537c;
        if (iArr.length <= 8 || i7 >= iArr.length / 3) {
            if (i6 < i9) {
                int i10 = i6 + 1;
                Y3.k.h0(iArr, iArr, i6, i10, i7);
                Object[] objArr2 = this.f12538e;
                Y3.k.j0(objArr2, objArr2, i8, i10 << 1, i7 << 1);
            }
            Object[] objArr3 = this.f12538e;
            int i11 = i9 << 1;
            objArr3[i11] = null;
            objArr3[i11 + 1] = null;
        } else {
            int i12 = i7 > 8 ? i7 + (i7 >> 1) : 8;
            int[] copyOf = Arrays.copyOf(iArr, i12);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f12537c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12538e, i12 << 1);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f12538e = copyOf2;
            if (i7 != this.f12539f) {
                throw new ConcurrentModificationException();
            }
            if (i6 > 0) {
                Y3.k.h0(iArr, this.f12537c, 0, 0, i6);
                Y3.k.j0(objArr, this.f12538e, 0, 0, i8);
            }
            if (i6 < i9) {
                int i13 = i6 + 1;
                Y3.k.h0(iArr, this.f12537c, i6, i13, i7);
                Y3.k.j0(objArr, this.f12538e, i8, i13 << 1, i7 << 1);
            }
        }
        if (i7 != this.f12539f) {
            throw new ConcurrentModificationException();
        }
        this.f12539f = i9;
        return obj;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f12539f <= 0;
    }

    public final Object j(int i6, Object obj) {
        boolean z5 = false;
        if (i6 >= 0 && i6 < this.f12539f) {
            z5 = true;
        }
        if (!z5) {
            AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
            throw null;
        }
        int i7 = (i6 << 1) + 1;
        Object[] objArr = this.f12538e;
        Object obj2 = objArr[i7];
        objArr[i7] = obj;
        return obj2;
    }

    public final Object k(int i6) {
        boolean z5 = false;
        if (i6 >= 0 && i6 < this.f12539f) {
            z5 = true;
        }
        if (z5) {
            return this.f12538e[(i6 << 1) + 1];
        }
        AbstractC1180a.c("Expected index to be within 0..size()-1, but was " + i6);
        throw null;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1156c c1156c = this.f12541h;
        if (c1156c != null) {
            return c1156c;
        }
        C1156c c1156c2 = new C1156c(this);
        this.f12541h = c1156c2;
        return c1156c2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i6 = this.f12539f;
        int hashCode = obj != null ? obj.hashCode() : 0;
        int d6 = obj != null ? d(hashCode, obj) : f();
        if (d6 >= 0) {
            int i7 = (d6 << 1) + 1;
            Object[] objArr = this.f12538e;
            Object obj3 = objArr[i7];
            objArr[i7] = obj2;
            return obj3;
        }
        int i8 = ~d6;
        int[] iArr = this.f12537c;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f12537c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12538e, i9 << 1);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f12538e = copyOf2;
            if (i6 != this.f12539f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr2 = this.f12537c;
            int i10 = i8 + 1;
            Y3.k.h0(iArr2, iArr2, i10, i8, i6);
            Object[] objArr2 = this.f12538e;
            Y3.k.j0(objArr2, objArr2, i10 << 1, i8 << 1, this.f12539f << 1);
        }
        int i11 = this.f12539f;
        if (i6 == i11) {
            int[] iArr3 = this.f12537c;
            if (i8 < iArr3.length) {
                iArr3[i8] = hashCode;
                Object[] objArr3 = this.f12538e;
                int i12 = i8 << 1;
                objArr3[i12] = obj;
                objArr3[i12 + 1] = obj2;
                this.f12539f = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f12539f;
        int i6 = this.f12539f;
        int[] iArr = this.f12537c;
        if (iArr.length < size) {
            int[] copyOf = Arrays.copyOf(iArr, size);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f12537c = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12538e, size * 2);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f12538e = copyOf2;
        }
        if (this.f12539f != i6) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        int e6 = e(obj);
        if (e6 >= 0) {
            return j(e6, obj2);
        }
        return null;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f12539f;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12539f * 28);
        sb.append('{');
        int i6 = this.f12539f;
        for (int i7 = 0; i7 < i6; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object g3 = g(i7);
            if (g3 != sb) {
                sb.append(g3);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object k3 = k(i7);
            if (k3 != sb) {
                sb.append(k3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        C1158e c1158e = this.f12542i;
        if (c1158e != null) {
            return c1158e;
        }
        C1158e c1158e2 = new C1158e(this);
        this.f12542i = c1158e2;
        return c1158e2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int e6 = e(obj);
        if (e6 < 0 || !AbstractC1276k.b(obj2, k(e6))) {
            return false;
        }
        i(e6);
        return true;
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int e6 = e(obj);
        if (e6 < 0 || !AbstractC1276k.b(obj2, k(e6))) {
            return false;
        }
        j(e6, obj3);
        return true;
    }
}
