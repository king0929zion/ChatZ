package L1;

import H0.C0158m;
import I1.v;
import I1.x;
import O.C0316k;
import O4.m;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import k.X;
import m4.AbstractC1276k;
import t4.C1729a;
import u4.AbstractC1776n;
import u4.u;

/* loaded from: classes.dex */
public class l {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public int f3045b;

    /* renamed from: c, reason: collision with root package name */
    public String f3046c;

    /* renamed from: d, reason: collision with root package name */
    public String f3047d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3048e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3049f;

    public l(String str) {
        this.a = 1;
        AbstractC1276k.f(str, "source");
        this.a = 1;
        C0316k c0316k = new C0316k(1);
        c0316k.f4140c = new Object[8];
        int[] iArr = new int[8];
        for (int i6 = 0; i6 < 8; i6++) {
            iArr[i6] = -1;
        }
        c0316k.f4141d = iArr;
        c0316k.f4139b = -1;
        this.f3048e = c0316k;
        this.f3049f = new StringBuilder();
        this.f3047d = str;
    }

    public static /* synthetic */ void p(l lVar, String str, int i6, String str2, int i7) {
        if ((i7 & 2) != 0) {
            i6 = lVar.f3045b;
        }
        if ((i7 & 4) != 0) {
            str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        }
        lVar.o(str, i6, str2);
        throw null;
    }

    public static /* synthetic */ void r(l lVar, byte b5) {
        lVar.q(b5, true);
        throw null;
    }

    public String A(boolean z5) {
        String j3;
        byte z6 = z();
        if (z5) {
            if (z6 != 1 && z6 != 0) {
                return null;
            }
            j3 = k();
        } else {
            if (z6 != 1) {
                return null;
            }
            j3 = j();
        }
        this.f3046c = j3;
        return j3;
    }

    public int B(int i6) {
        if (i6 < this.f3047d.length()) {
            return i6;
        }
        return -1;
    }

    public int C() {
        char charAt;
        int i6 = this.f3045b;
        if (i6 == -1) {
            return i6;
        }
        String str = this.f3047d;
        while (i6 < str.length() && ((charAt = str.charAt(i6)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i6++;
        }
        this.f3045b = i6;
        return i6;
    }

    public String D(int i6, int i7) {
        return w().subSequence(i6, i7).toString();
    }

    public boolean E() {
        int C5 = C();
        CharSequence w5 = w();
        if (C5 >= w5.length() || C5 == -1 || w5.charAt(C5) != ',') {
            return false;
        }
        this.f3045b++;
        return true;
    }

    public void F(char c6) {
        int i6 = this.f3045b;
        if (i6 > 0 && c6 == '\"') {
            try {
                this.f3045b = i6 - 1;
                String k3 = k();
                this.f3045b = i6;
                if (AbstractC1276k.b(k3, "null")) {
                    o("Expected string literal but 'null' literal was found", this.f3045b - 1, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.f3045b = i6;
                throw th;
            }
        }
        r(this, m.g(c6));
        throw null;
    }

    public int a(int i6, CharSequence charSequence) {
        int i7 = i6 + 4;
        if (i7 < charSequence.length()) {
            ((StringBuilder) this.f3049f).append((char) (v(i6 + 3, charSequence) + (v(i6, charSequence) << 12) + (v(i6 + 1, charSequence) << 8) + (v(i6 + 2, charSequence) << 4)));
            return i7;
        }
        this.f3045b = i6;
        if (this.f3045b + 4 < charSequence.length()) {
            return a(this.f3045b, charSequence);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i6, int i7) {
        ((StringBuilder) this.f3049f).append(w(), i6, i7);
    }

    public boolean c() {
        int i6 = this.f3045b;
        if (i6 == -1) {
            return false;
        }
        String str = this.f3047d;
        while (i6 < str.length()) {
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f3045b = i6;
                return (charAt == ',' || charAt == ':' || charAt == ']' || charAt == '}') ? false : true;
            }
            i6++;
        }
        this.f3045b = i6;
        return false;
    }

    public void d(int i6, String str) {
        if (w().length() - i6 < str.length()) {
            p(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i7 = 0; i7 < length; i7++) {
            if (str.charAt(i7) != (w().charAt(i6 + i7) | SequenceUtils.SPC)) {
                p(this, "Expected valid boolean literal prefix, but had '" + k() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f3045b = str.length() + i6;
    }

    public String e() {
        String str = this.f3047d;
        h('\"');
        int i6 = this.f3045b;
        int N5 = AbstractC1776n.N(str, '\"', i6, 4);
        if (N5 == -1) {
            k();
            q((byte) 1, false);
            throw null;
        }
        int i7 = i6;
        while (i7 < N5) {
            if (str.charAt(i7) == '\\') {
                int i8 = this.f3045b;
                AbstractC1276k.f(str, "source");
                char charAt = str.charAt(i7);
                boolean z5 = false;
                while (charAt != '\"') {
                    if (charAt == '\\') {
                        b(i8, i7);
                        int B5 = B(i7 + 1);
                        if (B5 == -1) {
                            p(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int i9 = B5 + 1;
                        char charAt2 = w().charAt(B5);
                        if (charAt2 == 'u') {
                            i9 = a(i9, w());
                        } else {
                            char c6 = charAt2 < 'u' ? O4.e.a[charAt2] : (char) 0;
                            if (c6 == 0) {
                                p(this, "Invalid escaped char '" + charAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            ((StringBuilder) this.f3049f).append(c6);
                        }
                        i8 = B(i9);
                        if (i8 == -1) {
                            p(this, "Unexpected EOF", i8, null, 4);
                            throw null;
                        }
                    } else {
                        i7++;
                        if (i7 >= str.length()) {
                            b(i8, i7);
                            i8 = B(i7);
                            if (i8 == -1) {
                                p(this, "Unexpected EOF", i8, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                            charAt = str.charAt(i7);
                        }
                    }
                    i7 = i8;
                    z5 = true;
                    charAt = str.charAt(i7);
                }
                String D4 = !z5 ? D(i8, i7) : m(i8, i7);
                this.f3045b = i7 + 1;
                return D4;
            }
            i7++;
        }
        this.f3045b = N5 + 1;
        String substring = str.substring(i6, N5);
        AbstractC1276k.e(substring, "substring(...)");
        return substring;
    }

    public byte f() {
        String str = this.f3047d;
        int i6 = this.f3045b;
        while (i6 != -1 && i6 < str.length()) {
            int i7 = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f3045b = i7;
                return m.g(charAt);
            }
            i6 = i7;
        }
        this.f3045b = str.length();
        return (byte) 10;
    }

    public byte g(byte b5) {
        byte f6 = f();
        if (f6 == b5) {
            return f6;
        }
        r(this, b5);
        throw null;
    }

    public void h(char c6) {
        int i6 = this.f3045b;
        if (i6 == -1) {
            F(c6);
            throw null;
        }
        String str = this.f3047d;
        while (i6 < str.length()) {
            int i7 = i6 + 1;
            char charAt = str.charAt(i6);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f3045b = i7;
                if (charAt == c6) {
                    return;
                }
                F(c6);
                throw null;
            }
            i6 = i7;
        }
        this.f3045b = -1;
        F(c6);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        p(r21, "Can't convert " + r1 + " to Long", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01aa, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ab, code lost:
    
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0173, code lost:
    
        if (r8 != 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0175, code lost:
    
        r5 = java.lang.Math.pow(10.0d, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b8, code lost:
    
        if (r13 == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ba, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01bf, code lost:
    
        if (r14 == Long.MIN_VALUE) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c2, code lost:
    
        return -r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01c3, code lost:
    
        p(r21, "Numeric value overflow", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c9, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ca, code lost:
    
        p(r21, "Expected numeric literal", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cf, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0130, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x010e, code lost:
    
        p(r21, "Unexpected symbol '" + r7 + "' in numeric literal", r6, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0127, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
    
        if (r11 == r1) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0131, code lost:
    
        if (r1 == r11) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r13 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0137, code lost:
    
        if (r1 == (r11 - 1)) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x013f, code lost:
    
        if (r19 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0141, code lost:
    
        if (r2 == false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x014d, code lost:
    
        if (w().charAt(r11) != '\"') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014f, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0152, code lost:
    
        p(r21, "Expected closing quotation mark", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015b, code lost:
    
        p(r21, "EOF", 0, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0161, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
    
        r21.f3045b = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0164, code lost:
    
        if (r20 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0166, code lost:
    
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0169, code lost:
    
        if (r8 != 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x016b, code lost:
    
        r5 = java.lang.Math.pow(10.0d, -r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017a, code lost:
    
        r1 = r1 * r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x017f, code lost:
    
        if (r1 > 9.223372036854776E18d) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0185, code lost:
    
        if (r1 < (-9.223372036854776E18d)) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018d, code lost:
    
        if (java.lang.Math.floor(r1) != r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        r14 = (long) r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long i() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.l.i():long");
    }

    public String j() {
        String str = this.f3046c;
        if (str == null) {
            return e();
        }
        AbstractC1276k.c(str);
        this.f3046c = null;
        return str;
    }

    public String k() {
        String str = this.f3046c;
        if (str != null) {
            AbstractC1276k.c(str);
            this.f3046c = null;
            return str;
        }
        int C5 = C();
        if (C5 >= w().length() || C5 == -1) {
            p(this, "EOF", C5, null, 4);
            throw null;
        }
        byte g3 = m.g(w().charAt(C5));
        if (g3 == 1) {
            return j();
        }
        if (g3 != 0) {
            p(this, "Expected beginning of the string, but got " + w().charAt(C5), 0, null, 6);
            throw null;
        }
        boolean z5 = false;
        while (m.g(w().charAt(C5)) == 0) {
            C5++;
            if (C5 >= w().length()) {
                b(this.f3045b, C5);
                int B5 = B(C5);
                if (B5 == -1) {
                    this.f3045b = C5;
                    return m(0, 0);
                }
                C5 = B5;
                z5 = true;
            }
        }
        String D4 = !z5 ? D(this.f3045b, C5) : m(this.f3045b, C5);
        this.f3045b = C5;
        return D4;
    }

    public String l() {
        String k3 = k();
        if (!AbstractC1276k.b(k3, "null") || w().charAt(this.f3045b - 1) == '\"') {
            return k3;
        }
        p(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public String m(int i6, int i7) {
        b(i6, i7);
        StringBuilder sb = (StringBuilder) this.f3049f;
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "toString(...)");
        sb.setLength(0);
        return sb2;
    }

    public void n() {
    }

    public void o(String str, int i6, String str2) {
        AbstractC1276k.f(str, "message");
        AbstractC1276k.f(str2, "hint");
        throw m.d(i6, w(), str + " at path: " + ((C0316k) this.f3048e).d() + (str2.length() == 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : SequenceUtils.EOL.concat(str2)));
    }

    public void q(byte b5, boolean z5) {
        String p5 = m.p(b5);
        int i6 = z5 ? this.f3045b - 1 : this.f3045b;
        p(this, B3.e.o("Expected ", p5, ", but had '", (this.f3045b == w().length() || i6 < 0) ? "EOF" : String.valueOf(w().charAt(i6)), "' instead"), i6, null, 4);
        throw null;
    }

    public v s(int i6) {
        return u(i6, (x) this.f3048e, null, false);
    }

    public v t(String str, boolean z5) {
        Object obj;
        x xVar;
        AbstractC1276k.f(str, "route");
        X x5 = (X) this.f3049f;
        AbstractC1276k.f(x5, "<this>");
        Iterator it = ((C1729a) t4.j.p(new K4.h(x5, 6))).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            v vVar = (v) obj;
            if (u.x((String) vVar.f2592e.f2018e, str, false) || vVar.f2592e.b(str) != null) {
                break;
            }
        }
        v vVar2 = (v) obj;
        if (vVar2 != null) {
            return vVar2;
        }
        if (!z5 || (xVar = ((x) this.f3048e).f2593f) == null) {
            return null;
        }
        l lVar = xVar.f2600i;
        lVar.getClass();
        if (AbstractC1776n.Q(str)) {
            return null;
        }
        return lVar.t(str, true);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append((Object) w());
                sb.append("', currentPosition=");
                return B3.e.q(sb, this.f3045b, ')');
            default:
                return super.toString();
        }
    }

    public v u(int i6, v vVar, v vVar2, boolean z5) {
        x xVar = (x) this.f3048e;
        X x5 = (X) this.f3049f;
        v vVar3 = (v) x5.c(i6);
        if (vVar2 != null) {
            if (AbstractC1276k.b(vVar3, vVar2) && AbstractC1276k.b(vVar3.f2593f, vVar2.f2593f)) {
                return vVar3;
            }
            vVar3 = null;
        } else if (vVar3 != null) {
            return vVar3;
        }
        if (z5) {
            Iterator it = ((C1729a) t4.j.p(new K4.h(x5, 6))).iterator();
            while (true) {
                if (!it.hasNext()) {
                    vVar3 = null;
                    break;
                }
                v vVar4 = (v) it.next();
                vVar3 = (!(vVar4 instanceof x) || AbstractC1276k.b(vVar4, vVar)) ? null : ((x) vVar4).f2600i.u(i6, xVar, vVar2, true);
                if (vVar3 != null) {
                    break;
                }
            }
        }
        if (vVar3 != null) {
            return vVar3;
        }
        x xVar2 = xVar.f2593f;
        if (xVar2 == null || xVar2.equals(vVar)) {
            return null;
        }
        x xVar3 = xVar.f2593f;
        AbstractC1276k.c(xVar3);
        return xVar3.f2600i.u(i6, xVar, vVar2, z5);
    }

    public int v(int i6, CharSequence charSequence) {
        char charAt = charSequence.charAt(i6);
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        if ('a' <= charAt && charAt < 'g') {
            return charAt - 'W';
        }
        if ('A' <= charAt && charAt < 'G') {
            return charAt - '7';
        }
        p(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public CharSequence w() {
        return this.f3047d;
    }

    public I1.u x(I1.u uVar, C0158m c0158m, boolean z5, v vVar) {
        I1.u uVar2;
        x xVar = (x) this.f3048e;
        ArrayList arrayList = new ArrayList();
        Iterator it = xVar.iterator();
        while (true) {
            k kVar = (k) it;
            if (!kVar.hasNext()) {
                break;
            }
            v vVar2 = (v) kVar.next();
            uVar2 = AbstractC1276k.b(vVar2, vVar) ? null : vVar2.c(c0158m);
            if (uVar2 != null) {
                arrayList.add(uVar2);
            }
        }
        I1.u uVar3 = (I1.u) Y3.m.y0(arrayList);
        x xVar2 = xVar.f2593f;
        if (xVar2 != null && z5 && !xVar2.equals(vVar)) {
            uVar2 = xVar2.d(c0158m, xVar);
        }
        return (I1.u) Y3.m.y0(Y3.k.r0(new I1.u[]{uVar, uVar3, uVar2}));
    }

    public String y(String str, boolean z5) {
        AbstractC1276k.f(str, "keyToMatch");
        int i6 = this.f3045b;
        try {
            if (f() == 6 && AbstractC1276k.b(A(z5), str)) {
                this.f3046c = null;
                if (f() == 5) {
                    return A(z5);
                }
            }
            return null;
        } finally {
            this.f3045b = i6;
            this.f3046c = null;
        }
    }

    public byte z() {
        CharSequence w5 = w();
        int i6 = this.f3045b;
        while (true) {
            int B5 = B(i6);
            if (B5 == -1) {
                this.f3045b = B5;
                return (byte) 10;
            }
            char charAt = w5.charAt(B5);
            if (charAt != '\t' && charAt != '\n' && charAt != '\r' && charAt != ' ') {
                this.f3045b = B5;
                return m.g(charAt);
            }
            i6 = B5 + 1;
        }
    }

    public l(x xVar) {
        this.a = 0;
        this.f3048e = xVar;
        this.f3049f = new X(0);
    }
}
