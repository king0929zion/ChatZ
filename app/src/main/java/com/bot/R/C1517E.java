package r;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m4.AbstractC1276k;
import u.AbstractC1734b;

/* renamed from: r.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1517E {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f14010b;

    /* renamed from: c, reason: collision with root package name */
    public final int f14011c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [Y3.v] */
    public C1517E(List list, float[] fArr) {
        Object obj;
        this.a = list;
        this.f14010b = fArr;
        if (list.size() != fArr.length) {
            StringBuilder sb = new StringBuilder("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: ");
            sb.append(list);
            sb.append(" | Anchors: ");
            AbstractC1276k.f(fArr, "<this>");
            int length = fArr.length;
            if (length != 0) {
                if (length != 1) {
                    obj = new ArrayList(fArr.length);
                    for (float f6 : fArr) {
                        obj.add(Float.valueOf(f6));
                    }
                } else {
                    obj = Y4.l.H(Float.valueOf(fArr[0]));
                }
            } else {
                obj = Y3.v.f9812c;
            }
            sb.append(obj);
            AbstractC1734b.a(sb.toString());
        }
        this.f14011c = fArr.length;
    }

    public final Object a(float f6) {
        float[] fArr = this.f14010b;
        int length = fArr.length;
        float f7 = Float.POSITIVE_INFINITY;
        int i6 = 0;
        int i7 = -1;
        int i8 = 0;
        while (i6 < length) {
            int i9 = i8 + 1;
            float abs = Math.abs(f6 - fArr[i6]);
            if (abs <= f7) {
                i7 = i8;
                f7 = abs;
            }
            i6++;
            i8 = i9;
        }
        if (i7 == -1) {
            return null;
        }
        return this.a.get(i7);
    }

    public final Object b(float f6, boolean z5) {
        float[] fArr = this.f14010b;
        int length = fArr.length;
        int i6 = 0;
        int i7 = -1;
        float f7 = Float.POSITIVE_INFINITY;
        int i8 = 0;
        while (i6 < length) {
            float f8 = fArr[i6];
            int i9 = i8 + 1;
            float f9 = z5 ? f8 - f6 : f6 - f8;
            if (f9 < S.l.f7374V) {
                f9 = Float.POSITIVE_INFINITY;
            }
            if (f9 <= f7) {
                i7 = i8;
                f7 = f9;
            }
            i6++;
            i8 = i9;
        }
        if (i7 == -1) {
            return null;
        }
        return this.a.get(i7);
    }

    public final float c(Object obj) {
        int indexOf = this.a.indexOf(obj);
        if (indexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.f14010b;
        if (indexOf < fArr.length) {
            return fArr[indexOf];
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1517E)) {
            return false;
        }
        C1517E c1517e = (C1517E) obj;
        return AbstractC1276k.b(this.a, c1517e.a) && Arrays.equals(this.f14010b, c1517e.f14010b) && this.f14011c == c1517e.f14011c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f14010b) + (this.a.hashCode() * 31)) * 31) + this.f14011c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DraggableAnchors(anchors={"
            r0.<init>(r1)
            r1 = 0
        L8:
            int r2 = r6.f14011c
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List r4 = r6.a
            java.lang.Object r4 = Y3.m.r0(r4, r1)
            r3.append(r4)
            r4 = 61
            r3.append(r4)
            if (r1 < 0) goto L29
            float[] r4 = r6.f14010b
            int r5 = r4.length
            if (r1 >= r5) goto L29
            r4 = r4[r1]
            goto L2b
        L29:
            r4 = 2143289344(0x7fc00000, float:NaN)
        L2b:
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L3e
            java.lang.String r2 = ", "
            r0.append(r2)
        L3e:
            int r1 = r1 + 1
            goto L8
        L41:
            java.lang.String r1 = "})"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            m4.AbstractC1276k.e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r.C1517E.toString():java.lang.String");
    }
}
