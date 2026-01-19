package j;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1130a implements Iterable {

    /* renamed from: c, reason: collision with root package name */
    public C1132c f12300c;

    /* renamed from: e, reason: collision with root package name */
    public C1132c f12301e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f12302f = new WeakHashMap();

    /* renamed from: g, reason: collision with root package name */
    public int f12303g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f12304h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((j.C1131b) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof j.C1130a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j.a r7 = (j.C1130a) r7
            int r1 = r6.f12303g
            int r3 = r7.f12303g
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            j.b r3 = (j.C1131b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            j.b r4 = (j.C1131b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            j.b r7 = (j.C1131b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            return r0
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C1130a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i6 = 0;
        while (true) {
            C1131b c1131b = (C1131b) it;
            if (!c1131b.hasNext()) {
                return i6;
            }
            i6 += ((Map.Entry) c1131b.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C1131b c1131b = new C1131b(this.f12300c, this.f12301e, 0);
        this.f12302f.put(c1131b, Boolean.FALSE);
        return c1131b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C1131b c1131b = (C1131b) it;
            if (!c1131b.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c1131b.next()).toString());
            if (c1131b.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
