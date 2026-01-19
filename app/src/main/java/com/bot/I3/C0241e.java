package I3;

import I0.AbstractC0173b;
import java.util.List;
import java.util.Locale;
import m4.AbstractC1276k;

/* renamed from: I3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0241e extends AbstractC0173b {

    /* renamed from: f, reason: collision with root package name */
    public static final C0241e f2741f = new C0241e("*", "*", Y3.v.f9812c);

    /* renamed from: d, reason: collision with root package name */
    public final String f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2743e;

    public C0241e(String str, String str2, String str3, List list) {
        super(str3, list);
        this.f2742d = str;
        this.f2743e = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0241e)) {
            return false;
        }
        C0241e c0241e = (C0241e) obj;
        return u4.u.x(this.f2742d, c0241e.f2742d, true) && u4.u.x(this.f2743e, c0241e.f2743e, true) && AbstractC1276k.b((List) this.f2280c, (List) c0241e.f2280c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r1 != null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(I3.C0241e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "pattern"
            m4.AbstractC1276k.f(r7, r0)
            java.lang.String r0 = r7.f2743e
            java.lang.String r1 = r7.f2742d
            java.lang.String r2 = "*"
            boolean r3 = m4.AbstractC1276k.b(r1, r2)
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L1c
            java.lang.String r3 = r6.f2742d
            boolean r1 = u4.u.x(r1, r3, r5)
            if (r1 != 0) goto L1c
            return r4
        L1c:
            boolean r1 = m4.AbstractC1276k.b(r0, r2)
            if (r1 != 0) goto L2b
            java.lang.String r1 = r6.f2743e
            boolean r0 = u4.u.x(r0, r1, r5)
            if (r0 != 0) goto L2b
            return r4
        L2b:
            java.lang.Object r7 = r7.f2280c
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L33:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r7.next()
            I3.j r0 = (I3.j) r0
            java.lang.String r1 = r0.a
            java.lang.String r0 = r0.f2748b
            boolean r3 = m4.AbstractC1276k.b(r1, r2)
            if (r3 == 0) goto L78
            boolean r1 = m4.AbstractC1276k.b(r0, r2)
            if (r1 == 0) goto L51
        L4f:
            r0 = r5
            goto L89
        L51:
            java.lang.Object r1 = r6.f2280c
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L5f
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L5f
        L5d:
            r0 = r4
            goto L89
        L5f:
            java.util.Iterator r1 = r1.iterator()
        L63:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L5d
            java.lang.Object r3 = r1.next()
            I3.j r3 = (I3.j) r3
            java.lang.String r3 = r3.f2748b
            boolean r3 = u4.u.x(r3, r0, r5)
            if (r3 == 0) goto L63
            goto L4f
        L78:
            java.lang.String r1 = r6.d(r1)
            boolean r3 = m4.AbstractC1276k.b(r0, r2)
            if (r3 == 0) goto L85
            if (r1 == 0) goto L5d
            goto L4f
        L85:
            boolean r0 = u4.u.x(r1, r0, r5)
        L89:
            if (r0 != 0) goto L33
            return r4
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0241e.f(I3.e):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (u4.u.x(r1.f2748b, r7, true) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final I3.C0241e g(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f2280c
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.String r2 = "charset"
            if (r1 == 0) goto L4f
            r3 = 1
            if (r1 == r3) goto L37
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L4f
        L16:
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r1.next()
            I3.j r4 = (I3.j) r4
            java.lang.String r5 = r4.a
            boolean r5 = u4.u.x(r5, r2, r3)
            if (r5 == 0) goto L1a
            java.lang.String r4 = r4.f2748b
            boolean r4 = u4.u.x(r4, r7, r3)
            if (r4 == 0) goto L1a
            goto L4e
        L37:
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            I3.j r1 = (I3.j) r1
            java.lang.String r4 = r1.a
            boolean r4 = u4.u.x(r4, r2, r3)
            if (r4 == 0) goto L4f
            java.lang.String r1 = r1.f2748b
            boolean r1 = u4.u.x(r1, r7, r3)
            if (r1 == 0) goto L4f
        L4e:
            return r6
        L4f:
            I3.e r1 = new I3.e
            java.lang.String r3 = r6.f2279b
            I3.j r4 = new I3.j
            r4.<init>(r2, r7)
            java.util.ArrayList r7 = Y3.m.A0(r0, r4)
            java.lang.String r0 = r6.f2742d
            java.lang.String r2 = r6.f2743e
            r1.<init>(r0, r2, r3, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.C0241e.g(java.lang.String):I3.e");
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f2742d.toLowerCase(locale);
        AbstractC1276k.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int hashCode = lowerCase.hashCode();
        String lowerCase2 = this.f2743e.toLowerCase(locale);
        AbstractC1276k.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return (((List) this.f2280c).hashCode() * 31) + lowerCase2.hashCode() + (hashCode * 31) + hashCode;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0241e(String str, String str2, List list) {
        this(str, str2, str + '/' + str2, list);
        AbstractC1276k.f(str, "contentType");
        AbstractC1276k.f(str2, "contentSubtype");
        AbstractC1276k.f(list, "parameters");
    }
}
