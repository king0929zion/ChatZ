package S0;

import java.util.ArrayList;
import java.util.List;
import k.AbstractC1166m;
import k.C1178z;
import m4.AbstractC1276k;

/* renamed from: S0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0545g implements CharSequence {

    /* renamed from: c, reason: collision with root package name */
    public final List f7629c;

    /* renamed from: e, reason: collision with root package name */
    public final String f7630e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f7631f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7632g;

    static {
        e0.k kVar = E.a;
    }

    public C0545g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f7629c = list;
        this.f7630e = str;
        int i6 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i7 = 0; i7 < size; i7++) {
                C0543e c0543e = (C0543e) list.get(i7);
                Object obj = c0543e.a;
                if (obj instanceof G) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c0543e);
                } else if (obj instanceof u) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c0543e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f7631f = arrayList;
        this.f7632g = arrayList2;
        List G02 = arrayList2 != null ? Y3.m.G0(arrayList2, new C0544f(i6)) : null;
        if (G02 == null || G02.isEmpty()) {
            return;
        }
        int i8 = ((C0543e) Y3.m.o0(G02)).f7627c;
        C1178z c1178z = AbstractC1166m.a;
        C1178z c1178z2 = new C1178z(1);
        c1178z2.a(i8);
        int size2 = G02.size();
        for (int i9 = 1; i9 < size2; i9++) {
            C0543e c0543e2 = (C0543e) G02.get(i9);
            while (true) {
                if (c1178z2.f12592b != 0) {
                    int d6 = c1178z2.d();
                    int i10 = c0543e2.f7626b;
                    int i11 = c0543e2.f7627c;
                    if (i10 >= d6) {
                        c1178z2.e(c1178z2.f12592b - 1);
                    } else if (i11 > d6) {
                        Y0.a.a("Paragraph overlap not allowed, end " + i11 + " should be less than or equal to " + d6);
                    }
                }
            }
            c1178z2.a(c0543e2.f7627c);
        }
    }

    public final List a(int i6) {
        List list = this.f7629c;
        if (list == null) {
            return Y3.v.f9812c;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Object obj = list.get(i7);
            C0543e c0543e = (C0543e) obj;
            if ((c0543e.a instanceof AbstractC0552n) && AbstractC0546h.b(0, i6, c0543e.f7626b, c0543e.f7627c)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final C0545g b(l4.c cVar) {
        C0542d c0542d = new C0542d(this);
        ArrayList arrayList = c0542d.f7625f;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            C0543e c0543e = (C0543e) cVar.f(((C0541c) arrayList.get(i6)).a(Integer.MIN_VALUE));
            arrayList.set(i6, new C0541c(c0543e.a, c0543e.f7626b, c0543e.f7627c, c0543e.f7628d));
        }
        return c0542d.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final S0.C0545g subSequence(int r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            if (r11 > r12) goto L5
            r1 = 1
            goto L6
        L5:
            r1 = r0
        L6:
            r2 = 41
            java.lang.String r3 = "start ("
            if (r1 != 0) goto L26
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r11)
            java.lang.String r4 = ") should be less or equal to end ("
            r1.append(r4)
            r1.append(r12)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            Y0.a.a(r1)
        L26:
            java.lang.String r1 = r10.f7630e
            if (r11 != 0) goto L31
            int r4 = r1.length()
            if (r12 != r4) goto L31
            return r10
        L31:
            java.lang.String r1 = r1.substring(r11, r12)
            java.lang.String r4 = "substring(...)"
            m4.AbstractC1276k.e(r1, r4)
            S0.g r4 = S0.AbstractC0546h.a
            if (r11 > r12) goto L3f
            goto L59
        L3f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r11)
            java.lang.String r3 = ") should be less than or equal to end ("
            r4.append(r3)
            r4.append(r12)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            Y0.a.a(r2)
        L59:
            java.util.List r2 = r10.f7629c
            if (r2 != 0) goto L5e
            goto L9e
        L5e:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            int r4 = r2.size()
        L6b:
            if (r0 >= r4) goto L98
            java.lang.Object r5 = r2.get(r0)
            S0.e r5 = (S0.C0543e) r5
            int r6 = r5.f7626b
            int r7 = r5.f7627c
            boolean r6 = S0.AbstractC0546h.b(r11, r12, r6, r7)
            if (r6 == 0) goto L95
            S0.e r6 = new S0.e
            java.lang.Object r8 = r5.a
            int r9 = r5.f7626b
            int r9 = java.lang.Math.max(r11, r9)
            int r9 = r9 - r11
            int r7 = java.lang.Math.min(r12, r7)
            int r7 = r7 - r11
            java.lang.String r5 = r5.f7628d
            r6.<init>(r8, r9, r7, r5)
            r3.add(r6)
        L95:
            int r0 = r0 + 1
            goto L6b
        L98:
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L9f
        L9e:
            r3 = 0
        L9f:
            S0.g r11 = new S0.g
            r11.<init>(r3, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.C0545g.subSequence(int, int):S0.g");
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i6) {
        return this.f7630e.charAt(i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0545g)) {
            return false;
        }
        C0545g c0545g = (C0545g) obj;
        return AbstractC1276k.b(this.f7630e, c0545g.f7630e) && AbstractC1276k.b(this.f7629c, c0545g.f7629c);
    }

    public final int hashCode() {
        int hashCode = this.f7630e.hashCode() * 31;
        List list = this.f7629c;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f7630e.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f7630e;
    }

    public /* synthetic */ C0545g(String str) {
        this(str, Y3.v.f9812c);
    }

    public C0545g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
