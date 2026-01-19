package Q4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o {
    public String a;

    /* renamed from: d, reason: collision with root package name */
    public String f6559d;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f6561f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f6562g;

    /* renamed from: h, reason: collision with root package name */
    public String f6563h;

    /* renamed from: b, reason: collision with root package name */
    public String f6557b = FlexmarkHtmlConverter.DEFAULT_NODE;

    /* renamed from: c, reason: collision with root package name */
    public String f6558c = FlexmarkHtmlConverter.DEFAULT_NODE;

    /* renamed from: e, reason: collision with root package name */
    public int f6560e = -1;

    public o() {
        ArrayList arrayList = new ArrayList();
        this.f6561f = arrayList;
        arrayList.add(FlexmarkHtmlConverter.DEFAULT_NODE);
    }

    public final p a() {
        ArrayList arrayList;
        String str = this.a;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String e6 = C0494b.e(0, 0, 7, this.f6557b);
        String e7 = C0494b.e(0, 0, 7, this.f6558c);
        String str2 = this.f6559d;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int b5 = b();
        ArrayList arrayList2 = this.f6561f;
        ArrayList arrayList3 = new ArrayList(Y3.n.Z(arrayList2, 10));
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList2.get(i6);
            i6++;
            arrayList3.add(C0494b.e(0, 0, 7, (String) obj));
        }
        ArrayList arrayList4 = this.f6562g;
        if (arrayList4 != null) {
            arrayList = new ArrayList(Y3.n.Z(arrayList4, 10));
            int size2 = arrayList4.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList4.get(i7);
                i7++;
                String str3 = (String) obj2;
                arrayList.add(str3 != null ? C0494b.e(0, 0, 3, str3) : null);
            }
        } else {
            arrayList = null;
        }
        String str4 = this.f6563h;
        return new p(str, e6, e7, str2, b5, arrayList3, arrayList, str4 != null ? C0494b.e(0, 0, 7, str4) : null, toString());
    }

    public final int b() {
        int i6 = this.f6560e;
        if (i6 != -1) {
            return i6;
        }
        String str = this.a;
        AbstractC1276k.c(str);
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0208, code lost:
    
        if (r9 < 65536) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        if (r12 == ':') goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(Q4.p r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.o.c(Q4.p, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r1 != r3) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L12
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            goto L17
        L12:
            java.lang.String r1 = "//"
            r0.append(r1)
        L17:
            java.lang.String r1 = r6.f6557b
            int r1 = r1.length()
            r2 = 58
            if (r1 <= 0) goto L22
            goto L2a
        L22:
            java.lang.String r1 = r6.f6558c
            int r1 = r1.length()
            if (r1 <= 0) goto L44
        L2a:
            java.lang.String r1 = r6.f6557b
            r0.append(r1)
            java.lang.String r1 = r6.f6558c
            int r1 = r1.length()
            if (r1 <= 0) goto L3f
            r0.append(r2)
            java.lang.String r1 = r6.f6558c
            r0.append(r1)
        L3f:
            r1 = 64
            r0.append(r1)
        L44:
            java.lang.String r1 = r6.f6559d
            if (r1 == 0) goto L63
            boolean r1 = u4.AbstractC1776n.H(r1, r2)
            if (r1 == 0) goto L5e
            r1 = 91
            r0.append(r1)
            java.lang.String r1 = r6.f6559d
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            goto L63
        L5e:
            java.lang.String r1 = r6.f6559d
            r0.append(r1)
        L63:
            int r1 = r6.f6560e
            r3 = -1
            if (r1 != r3) goto L6c
            java.lang.String r1 = r6.a
            if (r1 == 0) goto L91
        L6c:
            int r1 = r6.b()
            java.lang.String r4 = r6.a
            if (r4 == 0) goto L8b
            java.lang.String r5 = "http"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L7f
            r3 = 80
            goto L89
        L7f:
            java.lang.String r5 = "https"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L89
            r3 = 443(0x1bb, float:6.21E-43)
        L89:
            if (r1 == r3) goto L91
        L8b:
            r0.append(r2)
            r0.append(r1)
        L91:
            java.lang.String r1 = "<this>"
            java.util.ArrayList r2 = r6.f6561f
            m4.AbstractC1276k.f(r2, r1)
            int r1 = r2.size()
            r3 = 0
        L9d:
            if (r3 >= r1) goto Lb0
            r4 = 47
            r0.append(r4)
            java.lang.Object r4 = r2.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            int r3 = r3 + 1
            goto L9d
        Lb0:
            java.util.ArrayList r1 = r6.f6562g
            if (r1 == 0) goto Lc1
            r1 = 63
            r0.append(r1)
            java.util.ArrayList r1 = r6.f6562g
            m4.AbstractC1276k.c(r1)
            Q4.C0494b.g(r1, r0)
        Lc1:
            java.lang.String r1 = r6.f6563h
            if (r1 == 0) goto Lcf
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.f6563h
            r0.append(r1)
        Lcf:
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            m4.AbstractC1276k.e(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Q4.o.toString():java.lang.String");
    }
}
