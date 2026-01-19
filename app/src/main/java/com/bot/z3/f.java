package Z3;

import Y.j;
import com.vladsch.flexmark.util.format.TableCell;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import m4.AbstractC1276k;
import n4.InterfaceC1376e;

/* loaded from: classes.dex */
public final class f implements Map, Serializable, InterfaceC1376e {

    /* renamed from: q, reason: collision with root package name */
    public static final f f10525q;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f10526c;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f10527e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f10528f;

    /* renamed from: g, reason: collision with root package name */
    public int[] f10529g;

    /* renamed from: h, reason: collision with root package name */
    public int f10530h;

    /* renamed from: i, reason: collision with root package name */
    public int f10531i;

    /* renamed from: j, reason: collision with root package name */
    public int f10532j;

    /* renamed from: k, reason: collision with root package name */
    public int f10533k;

    /* renamed from: l, reason: collision with root package name */
    public int f10534l;

    /* renamed from: m, reason: collision with root package name */
    public g f10535m;

    /* renamed from: n, reason: collision with root package name */
    public j f10536n;

    /* renamed from: o, reason: collision with root package name */
    public g f10537o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10538p;

    static {
        f fVar = new f(0);
        fVar.f10538p = true;
        f10525q = fVar;
    }

    public f() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int j3 = j(obj);
            int i6 = this.f10530h * 2;
            int length = this.f10529g.length / 2;
            if (i6 > length) {
                i6 = length;
            }
            int i7 = 0;
            while (true) {
                int[] iArr = this.f10529g;
                int i8 = iArr[j3];
                if (i8 <= 0) {
                    int i9 = this.f10531i;
                    Object[] objArr = this.f10526c;
                    if (i9 < objArr.length) {
                        int i10 = i9 + 1;
                        this.f10531i = i10;
                        objArr[i9] = obj;
                        this.f10528f[i9] = j3;
                        iArr[j3] = i10;
                        this.f10534l++;
                        this.f10533k++;
                        if (i7 > this.f10530h) {
                            this.f10530h = i7;
                        }
                        return i9;
                    }
                    g(1);
                } else {
                    if (AbstractC1276k.b(this.f10526c[i8 - 1], obj)) {
                        return -i8;
                    }
                    i7++;
                    if (i7 > i6) {
                        k(this.f10529g.length * 2);
                        break;
                    }
                    j3 = j3 == 0 ? this.f10529g.length - 1 : j3 - 1;
                }
            }
        }
    }

    public final f b() {
        c();
        this.f10538p = true;
        if (this.f10534l > 0) {
            return this;
        }
        f fVar = f10525q;
        AbstractC1276k.d(fVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return fVar;
    }

    public final void c() {
        if (this.f10538p) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i6 = this.f10531i - 1;
        if (i6 >= 0) {
            int i7 = 0;
            while (true) {
                int[] iArr = this.f10528f;
                int i8 = iArr[i7];
                if (i8 >= 0) {
                    this.f10529g[i8] = 0;
                    iArr[i7] = -1;
                }
                if (i7 == i6) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        s4.j.G(this.f10526c, 0, this.f10531i);
        Object[] objArr = this.f10527e;
        if (objArr != null) {
            s4.j.G(objArr, 0, this.f10531i);
        }
        this.f10534l = 0;
        this.f10531i = 0;
        this.f10533k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d(boolean z5) {
        int i6;
        Object[] objArr = this.f10527e;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i6 = this.f10531i;
            if (i7 >= i6) {
                break;
            }
            int[] iArr = this.f10528f;
            int i9 = iArr[i7];
            if (i9 >= 0) {
                Object[] objArr2 = this.f10526c;
                objArr2[i8] = objArr2[i7];
                if (objArr != null) {
                    objArr[i8] = objArr[i7];
                }
                if (z5) {
                    iArr[i8] = i9;
                    this.f10529g[i9] = i8 + 1;
                }
                i8++;
            }
            i7++;
        }
        s4.j.G(this.f10526c, i8, i6);
        if (objArr != null) {
            s4.j.G(objArr, i8, this.f10531i);
        }
        this.f10531i = i8;
    }

    public final boolean e(Collection collection) {
        AbstractC1276k.f(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        g gVar = this.f10537o;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 0);
        this.f10537o = gVar2;
        return gVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f10534l == map.size() && e(map.entrySet());
    }

    public final boolean f(Map.Entry entry) {
        AbstractC1276k.f(entry, "entry");
        int h3 = h(entry.getKey());
        if (h3 < 0) {
            return false;
        }
        Object[] objArr = this.f10527e;
        AbstractC1276k.c(objArr);
        return AbstractC1276k.b(objArr[h3], entry.getValue());
    }

    public final void g(int i6) {
        Object[] objArr;
        Object[] objArr2 = this.f10526c;
        int length = objArr2.length;
        int i7 = this.f10531i;
        int i8 = length - i7;
        int i9 = i7 - this.f10534l;
        if (i8 < i6 && i8 + i9 >= i6 && i9 >= objArr2.length / 4) {
            d(true);
            return;
        }
        int i10 = i7 + i6;
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > objArr2.length) {
            int length2 = objArr2.length;
            int i11 = length2 + (length2 >> 1);
            if (i11 - i10 < 0) {
                i11 = i10;
            }
            if (i11 - 2147483639 > 0) {
                i11 = i10 > 2147483639 ? TableCell.NOT_TRACKED : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr2, i11);
            AbstractC1276k.e(copyOf, "copyOf(...)");
            this.f10526c = copyOf;
            Object[] objArr3 = this.f10527e;
            if (objArr3 != null) {
                objArr = Arrays.copyOf(objArr3, i11);
                AbstractC1276k.e(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f10527e = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f10528f, i11);
            AbstractC1276k.e(copyOf2, "copyOf(...)");
            this.f10528f = copyOf2;
            int highestOneBit = Integer.highestOneBit((i11 >= 1 ? i11 : 1) * 3);
            if (highestOneBit > this.f10529g.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f10527e;
        AbstractC1276k.c(objArr);
        return objArr[h3];
    }

    public final int h(Object obj) {
        int j3 = j(obj);
        int i6 = this.f10530h;
        while (true) {
            int i7 = this.f10529g[j3];
            if (i7 == 0) {
                return -1;
            }
            if (i7 > 0) {
                int i8 = i7 - 1;
                if (AbstractC1276k.b(this.f10526c[i8], obj)) {
                    return i8;
                }
            }
            i6--;
            if (i6 < 0) {
                return -1;
            }
            j3 = j3 == 0 ? this.f10529g.length - 1 : j3 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        c cVar = new c(this, 0);
        int i6 = 0;
        while (cVar.hasNext()) {
            int i7 = cVar.f10521c;
            f fVar = (f) cVar.f10524g;
            if (i7 >= fVar.f10531i) {
                throw new NoSuchElementException();
            }
            cVar.f10521c = i7 + 1;
            cVar.f10522e = i7;
            Object obj = fVar.f10526c[i7];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fVar.f10527e;
            AbstractC1276k.c(objArr);
            Object obj2 = objArr[cVar.f10522e];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cVar.c();
            i6 += hashCode ^ hashCode2;
        }
        return i6;
    }

    public final int i(Object obj) {
        int i6 = this.f10531i;
        while (true) {
            i6--;
            if (i6 < 0) {
                return -1;
            }
            if (this.f10528f[i6] >= 0) {
                Object[] objArr = this.f10527e;
                AbstractC1276k.c(objArr);
                if (AbstractC1276k.b(objArr[i6], obj)) {
                    return i6;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f10534l == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f10532j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f10528f[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r6) {
        /*
            r5 = this;
            int r0 = r5.f10533k
            int r0 = r0 + 1
            r5.f10533k = r0
            int r0 = r5.f10531i
            int r1 = r5.f10534l
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f10529g = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f10532j = r6
        L1c:
            int r6 = r5.f10531i
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f10526c
            r0 = r0[r2]
            int r0 = r5.j(r0)
            int r1 = r5.f10530h
        L2c:
            int[] r3 = r5.f10529g
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f10528f
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.f.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        g gVar = this.f10535m;
        if (gVar != null) {
            return gVar;
        }
        g gVar2 = new g(this, 1);
        this.f10535m = gVar2;
        return gVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0024->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f10526c
            java.lang.String r1 = "<this>"
            m4.AbstractC1276k.f(r0, r1)
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.f10527e
            if (r0 == 0) goto L10
            r0[r12] = r1
        L10:
            int[] r0 = r11.f10528f
            r0 = r0[r12]
            int r1 = r11.f10530h
            int r1 = r1 * 2
            int[] r2 = r11.f10529g
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L20
            r1 = r2
        L20:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L24:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2e
            int[] r0 = r11.f10529g
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2f
        L2e:
            r0 = r5
        L2f:
            int r4 = r4 + 1
            int r5 = r11.f10530h
            r6 = -1
            if (r4 <= r5) goto L3b
            int[] r0 = r11.f10529g
            r0[r1] = r2
            goto L6c
        L3b:
            int[] r5 = r11.f10529g
            r7 = r5[r0]
            if (r7 != 0) goto L44
            r5[r1] = r2
            goto L6c
        L44:
            if (r7 >= 0) goto L4b
            r5[r1] = r6
        L48:
            r1 = r0
            r4 = r2
            goto L65
        L4b:
            java.lang.Object[] r5 = r11.f10526c
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f10529g
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L65
            r9[r1] = r7
            int[] r4 = r11.f10528f
            r4[r8] = r1
            goto L48
        L65:
            int r3 = r3 + r6
            if (r3 >= 0) goto L24
            int[] r0 = r11.f10529g
            r0[r1] = r6
        L6c:
            int[] r0 = r11.f10528f
            r0[r12] = r6
            int r12 = r11.f10534l
            int r12 = r12 + r6
            r11.f10534l = r12
            int r12 = r11.f10533k
            int r12 = r12 + 1
            r11.f10533k = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z3.f.l(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a = a(obj);
        Object[] objArr = this.f10527e;
        if (objArr == null) {
            int length = this.f10526c.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f10527e = objArr;
        }
        if (a >= 0) {
            objArr[a] = obj2;
            return null;
        }
        int i6 = (-a) - 1;
        Object obj3 = objArr[i6];
        objArr[i6] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC1276k.f(map, "from");
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a = a(entry.getKey());
            Object[] objArr = this.f10527e;
            if (objArr == null) {
                int length = this.f10526c.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f10527e = objArr;
            }
            if (a >= 0) {
                objArr[a] = entry.getValue();
            } else {
                int i6 = (-a) - 1;
                if (!AbstractC1276k.b(entry.getValue(), objArr[i6])) {
                    objArr[i6] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int h3 = h(obj);
        if (h3 < 0) {
            return null;
        }
        Object[] objArr = this.f10527e;
        AbstractC1276k.c(objArr);
        Object obj2 = objArr[h3];
        l(h3);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f10534l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f10534l * 3) + 2);
        sb.append("{");
        int i6 = 0;
        c cVar = new c(this, 0);
        while (cVar.hasNext()) {
            if (i6 > 0) {
                sb.append(", ");
            }
            int i7 = cVar.f10521c;
            f fVar = (f) cVar.f10524g;
            if (i7 >= fVar.f10531i) {
                throw new NoSuchElementException();
            }
            cVar.f10521c = i7 + 1;
            cVar.f10522e = i7;
            Object obj = fVar.f10526c[i7];
            if (obj == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fVar.f10527e;
            AbstractC1276k.c(objArr);
            Object obj2 = objArr[cVar.f10522e];
            if (obj2 == fVar) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cVar.c();
            i6++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f10536n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f10536n = jVar2;
        return jVar2;
    }

    public f(int i6) {
        if (i6 >= 0) {
            Object[] objArr = new Object[i6];
            int[] iArr = new int[i6];
            int highestOneBit = Integer.highestOneBit((i6 < 1 ? 1 : i6) * 3);
            this.f10526c = objArr;
            this.f10527e = null;
            this.f10528f = iArr;
            this.f10529g = new int[highestOneBit];
            this.f10530h = 2;
            this.f10531i = 0;
            this.f10532j = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }
}
