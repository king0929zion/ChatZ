package T2;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class B {
    private static final A Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public int f8373b;

    /* renamed from: f, reason: collision with root package name */
    public int f8377f;

    /* renamed from: g, reason: collision with root package name */
    public int f8378g;

    /* renamed from: i, reason: collision with root package name */
    public int f8380i;

    /* renamed from: k, reason: collision with root package name */
    public String f8382k;

    /* renamed from: l, reason: collision with root package name */
    public int f8383l;

    /* renamed from: n, reason: collision with root package name */
    public int f8385n;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8389r;

    /* renamed from: s, reason: collision with root package name */
    public int f8390s;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8396y;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC1410a f8374c = C0662s.f8476e;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8375d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f8376e = new StringBuilder();

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f8379h = new StringBuilder();

    /* renamed from: j, reason: collision with root package name */
    public final StringBuilder f8381j = new StringBuilder();

    /* renamed from: m, reason: collision with root package name */
    public boolean f8384m = true;

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f8386o = new StringBuilder();

    /* renamed from: p, reason: collision with root package name */
    public final StringBuilder f8387p = new StringBuilder();

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f8388q = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final StringBuilder f8391t = new StringBuilder();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f8392u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f8393v = new ArrayList();

    /* renamed from: w, reason: collision with root package name */
    public final StringBuilder f8394w = new StringBuilder();

    /* renamed from: x, reason: collision with root package name */
    public Object f8395x = Y3.v.f9812c;

    /* renamed from: z, reason: collision with root package name */
    public final StringBuilder f8397z = new StringBuilder();

    /* renamed from: A, reason: collision with root package name */
    public final StringBuilder f8369A = new StringBuilder();

    /* renamed from: B, reason: collision with root package name */
    public final StringBuilder f8370B = new StringBuilder();

    /* renamed from: C, reason: collision with root package name */
    public String f8371C = FlexmarkHtmlConverter.DEFAULT_NODE;

    /* renamed from: D, reason: collision with root package name */
    public final StringBuilder f8372D = new StringBuilder();

    public B(String str) {
        this.a = str;
    }

    public final void a() {
        StringBuilder sb = this.f8376e;
        if (sb.length() == 0) {
            return;
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        this.f8375d.addAll(new y0(sb2).e());
        u4.r.s(sb);
    }

    public final void b() {
        ArrayList arrayList = this.f8388q;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z5 = this.f8389r;
        ArrayList arrayList2 = this.f8375d;
        if (z5) {
            arrayList2.add(new S2.P(Y3.m.J0(arrayList)));
        } else {
            arrayList2.add(new S2.W(Y3.m.J0(arrayList)));
        }
        arrayList.clear();
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.List, java.lang.Object] */
    public final void c() {
        ArrayList arrayList = this.f8392u;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        ArrayList arrayList2 = this.f8375d;
        Y3.v vVar = Y3.v.f9812c;
        if (size >= 1 && this.f8396y) {
            arrayList2.add(new S2.U((List) Y3.m.o0(arrayList), arrayList.size() > 1 ? Y3.m.k0(arrayList) : vVar, this.f8395x));
        } else if (arrayList.size() >= 1) {
            arrayList2.add(new S2.U((List) Y3.m.o0(arrayList), arrayList.size() > 1 ? Y3.m.k0(arrayList) : vVar, vVar));
        }
        arrayList.clear();
        this.f8395x = vVar;
        this.f8396y = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (r1 == r6) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.B.d():void");
    }

    public final boolean e(char c6) {
        char charAt;
        if (c6 != '-' && c6 != '*' && c6 != '_') {
            return false;
        }
        int i6 = this.f8373b;
        int i7 = 0;
        while (true) {
            String str = this.a;
            if (i6 >= str.length() || (charAt = str.charAt(i6)) == '\n' || charAt == '\r') {
                break;
            }
            if (charAt == c6) {
                i7++;
            } else if (charAt != ' ' && charAt != '\t') {
                return false;
            }
            i6++;
        }
        return i7 >= 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0089, code lost:
    
        if (r1 != '_') goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
    
        r8 = g(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r8 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
    
        if (r8.charValue() != ' ') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r8 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if (r8.charValue() != '\t') goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (e(r1) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if (r7.charValue() == ' ') goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e9, code lost:
    
        if (r7.charValue() == '\t') goto L63;
     */
    /* JADX WARN: Type inference failed for: r1v115, types: [java.lang.Object, o4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f() {
        /*
            Method dump skipped, instructions count: 3507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.B.f():java.util.ArrayList");
    }

    public final Character g(int i6) {
        int i7 = this.f8373b + i6;
        if (i7 < 0) {
            return null;
        }
        String str = this.a;
        if (i7 < str.length()) {
            return Character.valueOf(str.charAt(i7));
        }
        return null;
    }

    public final void h() {
        this.f8377f = 0;
        this.f8374c = C0662s.f8476e;
    }
}
