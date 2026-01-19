package k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import m4.AbstractC1275j;
import m4.AbstractC1276k;
import n4.InterfaceC1372a;
import n4.InterfaceC1377f;

/* loaded from: classes.dex */
public final class L implements InterfaceC1377f, Set, InterfaceC1372a {

    /* renamed from: c, reason: collision with root package name */
    public final J f12483c;

    /* renamed from: e, reason: collision with root package name */
    public final J f12484e;

    public L(J j3) {
        AbstractC1276k.f(j3, "parent");
        this.f12483c = j3;
        this.f12484e = j3;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f12484e.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        J j3 = this.f12484e;
        j3.getClass();
        int i6 = j3.f12473g;
        for (Object obj : collection) {
            int d6 = j3.d(obj);
            j3.f12468b[d6] = obj;
            long[] jArr = j3.f12469c;
            int i7 = j3.f12470d;
            jArr[d6] = (i7 & 2147483647L) | 4611686016279904256L;
            if (i7 != Integer.MAX_VALUE) {
                jArr[i7] = ((d6 & 2147483647L) << 31) | (jArr[i7] & (-4611686016279904257L));
            }
            j3.f12470d = d6;
            if (j3.f12471e == Integer.MAX_VALUE) {
                j3.f12471e = d6;
            }
        }
        return i6 != j3.f12473g;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f12484e.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f12483c.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f12483c.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || L.class != obj.getClass()) {
            return false;
        }
        return AbstractC1276k.b(this.f12483c, ((L) obj).f12483c);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f12483c.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f12483c.f12473g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Z.c(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f12484e.g(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0093, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.String r1 = "elements"
            m4.AbstractC1276k.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            k.J r2 = r1.f12484e
            r2.getClass()
            int r3 = r2.f12473g
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La4
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L29
            int r7 = r4.hashCode()
            goto L2a
        L29:
            r7 = r6
        L2a:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f12472f
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L38:
            long[] r10 = r2.a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L66:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L89
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f12468b
            r12 = r12[r14]
            boolean r12 = m4.AbstractC1276k.b(r12, r4)
            if (r12 == 0) goto L81
            goto L96
        L81:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L66
        L89:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9d
            r14 = -1
        L96:
            if (r14 < 0) goto L16
            r2.h(r14)
            goto L16
        L9d:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L38
        La4:
            r21 = r5
            int r0 = r2.f12473g
            if (r3 == r0) goto Lab
            return r21
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k.L.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        AbstractC1276k.f(collection, "elements");
        return this.f12484e.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f12483c.f12473g;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1275j.a(this);
    }

    public final String toString() {
        return this.f12483c.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1276k.f(objArr, "array");
        return AbstractC1275j.b(this, objArr);
    }
}
