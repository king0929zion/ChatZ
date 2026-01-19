package T2;

import S2.AbstractC0558a0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.core.BlockQuoteParser;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.util.ArrayList;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class y0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public int f8492b;

    /* renamed from: c, reason: collision with root package name */
    public s4.j f8493c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8494d;

    /* renamed from: e, reason: collision with root package name */
    public final StringBuilder f8495e;

    /* renamed from: f, reason: collision with root package name */
    public final StringBuilder f8496f;

    /* renamed from: g, reason: collision with root package name */
    public final StringBuilder f8497g;

    /* renamed from: h, reason: collision with root package name */
    public final StringBuilder f8498h;

    /* renamed from: i, reason: collision with root package name */
    public final StringBuilder f8499i;

    /* renamed from: j, reason: collision with root package name */
    public final StringBuilder f8500j;

    /* renamed from: k, reason: collision with root package name */
    public final StringBuilder f8501k;

    /* renamed from: l, reason: collision with root package name */
    public final StringBuilder f8502l;

    /* renamed from: m, reason: collision with root package name */
    public final StringBuilder f8503m;

    /* renamed from: n, reason: collision with root package name */
    public final StringBuilder f8504n;

    /* renamed from: o, reason: collision with root package name */
    public final StringBuilder f8505o;

    /* renamed from: p, reason: collision with root package name */
    public final StringBuilder f8506p;

    /* renamed from: q, reason: collision with root package name */
    public final StringBuilder f8507q;

    /* renamed from: r, reason: collision with root package name */
    public final StringBuilder f8508r;

    /* renamed from: s, reason: collision with root package name */
    public final StringBuilder f8509s;

    /* renamed from: t, reason: collision with root package name */
    public final StringBuilder f8510t;

    /* renamed from: u, reason: collision with root package name */
    public int f8511u;

    public y0(String str) {
        AbstractC1276k.f(str, FlexmarkHtmlConverter.INPUT_NODE);
        this.a = str;
        this.f8493c = n0.f8466c;
        this.f8494d = new ArrayList();
        this.f8495e = new StringBuilder();
        this.f8496f = new StringBuilder();
        this.f8497g = new StringBuilder();
        this.f8498h = new StringBuilder();
        this.f8499i = new StringBuilder();
        this.f8500j = new StringBuilder();
        this.f8501k = new StringBuilder();
        this.f8502l = new StringBuilder();
        this.f8503m = new StringBuilder();
        this.f8504n = new StringBuilder();
        this.f8505o = new StringBuilder();
        this.f8506p = new StringBuilder();
        this.f8507q = new StringBuilder();
        this.f8508r = new StringBuilder();
        this.f8509s = new StringBuilder();
        this.f8510t = new StringBuilder();
        new Y3.j();
    }

    public static String d(String str) {
        return AbstractC1776n.N(str, '&', 0, 6) >= 0 ? AbstractC0558a0.e(str) : str;
    }

    public static Character f(y0 y0Var) {
        String str = y0Var.a;
        int i6 = y0Var.f8492b + 1;
        if (i6 < 0 || i6 >= str.length()) {
            return null;
        }
        return Character.valueOf(str.charAt(i6));
    }

    public final void a() {
        X3.i iVar;
        s4.j jVar = this.f8493c;
        if (jVar instanceof n0) {
            b();
            return;
        }
        boolean z5 = jVar instanceof E;
        int i6 = 0;
        StringBuilder sb = this.f8495e;
        if (z5) {
            b();
            int i7 = ((E) jVar).f8402c;
            while (i6 < i7) {
                sb.append('`');
                i6++;
            }
            b();
            return;
        }
        boolean z6 = jVar instanceof X;
        StringBuilder sb2 = this.f8496f;
        if (z6) {
            b();
            sb.append(u4.u.A("`", this.f8511u));
            sb.append((CharSequence) sb2);
            b();
            return;
        }
        if (jVar instanceof h0) {
            b();
            sb.append(u4.u.A("`", this.f8511u));
            sb.append((CharSequence) sb2);
            int i8 = ((h0) jVar).f8448d;
            while (i6 < i8) {
                sb.append('`');
                i6++;
            }
            b();
            return;
        }
        if (jVar instanceof D) {
            b();
            sb.append('*');
            b();
            return;
        }
        if (jVar instanceof K) {
            b();
            sb.append("**");
            b();
            return;
        }
        boolean z7 = jVar instanceof Q;
        StringBuilder sb3 = this.f8497g;
        if (z7) {
            b();
            sb.append("**");
            sb.append((CharSequence) sb3);
            b();
            return;
        }
        if (jVar instanceof F) {
            b();
            sb.append("**");
            sb.append((CharSequence) sb3);
            sb.append('*');
            b();
            return;
        }
        boolean z8 = jVar instanceof S;
        StringBuilder sb4 = this.f8498h;
        if (z8) {
            b();
            sb.append("***");
            sb.append((CharSequence) sb4);
            b();
            return;
        }
        if (jVar instanceof G) {
            b();
            sb.append("***");
            sb.append((CharSequence) sb4);
            sb.append('*');
            b();
            return;
        }
        if (jVar instanceof H) {
            b();
            sb.append("***");
            sb.append((CharSequence) sb4);
            sb.append("**");
            b();
            return;
        }
        boolean z9 = jVar instanceof Z;
        StringBuilder sb5 = this.f8499i;
        if (z9) {
            b();
            sb.append('*');
            sb.append((CharSequence) sb5);
            b();
            return;
        }
        if (jVar instanceof p0) {
            b();
            sb.append('_');
            b();
            return;
        }
        if (jVar instanceof a0) {
            b();
            sb.append('_');
            sb.append((CharSequence) sb5);
            b();
            return;
        }
        if (jVar instanceof o0) {
            b();
            sb.append('~');
            b();
            return;
        }
        boolean z10 = jVar instanceof d0;
        StringBuilder sb6 = this.f8500j;
        if (z10) {
            b();
            sb.append("~~");
            sb.append((CharSequence) sb6);
            b();
            return;
        }
        if (jVar instanceof m0) {
            b();
            sb.append("~~");
            sb.append((CharSequence) sb6);
            sb.append('~');
            b();
            return;
        }
        if (jVar instanceof e0) {
            b();
            sb.append('~');
            sb.append((CharSequence) this.f8501k);
            b();
            return;
        }
        if (jVar instanceof I) {
            b();
            sb.append('^');
            b();
            return;
        }
        if (jVar instanceof f0) {
            b();
            sb.append('^');
            sb.append((CharSequence) this.f8502l);
            b();
            return;
        }
        if (jVar instanceof L) {
            b();
            sb.append('=');
            b();
            return;
        }
        if (jVar instanceof T) {
            b();
            sb.append("==");
            sb.append((CharSequence) this.f8503m);
            b();
            return;
        }
        if (jVar instanceof O) {
            b();
            sb.append("==");
            sb.append((CharSequence) this.f8503m);
            sb.append('=');
            b();
            return;
        }
        if (jVar instanceof J) {
            b();
            sb.append('$');
            b();
            return;
        }
        if (jVar instanceof Y) {
            b();
            sb.append('$');
            sb.append((CharSequence) this.f8504n);
            b();
            return;
        }
        if (jVar instanceof N) {
            b();
            sb.append('!');
            b();
            return;
        }
        if (jVar instanceof l0) {
            b();
            if (((l0) jVar).f8462c) {
                sb.append('!');
            }
            sb.append('[');
            b();
            return;
        }
        if (jVar instanceof b0) {
            b();
            if (((b0) jVar).f8429c) {
                sb.append('!');
            }
            sb.append('[');
            sb.append((CharSequence) this.f8505o);
            b();
            return;
        }
        if (jVar instanceof k0) {
            b();
            k0 k0Var = (k0) jVar;
            if (k0Var.f8459c) {
                sb.append('!');
            }
            sb.append('[');
            sb.append(k0Var.f8460d);
            sb.append(']');
            b();
            return;
        }
        boolean z11 = jVar instanceof j0;
        if (z11 || (jVar instanceof c0)) {
            if (z11) {
                j0 j0Var = (j0) jVar;
                iVar = new X3.i(Boolean.valueOf(j0Var.f8454c), j0Var.f8455d);
            } else if (jVar instanceof c0) {
                c0 c0Var = (c0) jVar;
                iVar = new X3.i(Boolean.valueOf(c0Var.f8434c), c0Var.f8435d);
            } else {
                iVar = new X3.i(Boolean.FALSE, FlexmarkHtmlConverter.DEFAULT_NODE);
            }
            boolean booleanValue = ((Boolean) iVar.f9393c).booleanValue();
            String str = (String) iVar.f9394e;
            b();
            if (booleanValue) {
                sb.append('!');
            }
            sb.append('[');
            sb.append(str);
            sb.append("](");
            sb.append((CharSequence) this.f8506p);
            b();
            return;
        }
        if (jVar instanceof i0) {
            b();
            sb.append('<');
            b();
            return;
        }
        if (jVar instanceof W) {
            b();
            sb.append('<');
            if (((W) jVar).f8422c) {
                sb.append('/');
            }
            sb.append((CharSequence) this.f8507q);
            b();
            return;
        }
        if (jVar instanceof U) {
            b();
            sb.append('<');
            sb.append(((U) jVar).f8419c);
            sb.append(SequenceUtils.SPC);
            sb.append((CharSequence) this.f8508r);
            b();
            return;
        }
        if (jVar instanceof V) {
            b();
            sb.append('<');
            V v5 = (V) jVar;
            String str2 = v5.f8420c;
            String str3 = v5.f8421d;
            sb.append(str2);
            if (str3.length() > 0) {
                sb.append(SequenceUtils.SPC);
                sb.append(str3);
            }
            sb.append(BlockQuoteParser.MARKER_CHAR);
            sb.append((CharSequence) this.f8509s);
            b();
            return;
        }
        if (jVar instanceof P) {
            b();
            sb.append('<');
            P p5 = (P) jVar;
            String str4 = p5.f8413c;
            String str5 = p5.f8414d;
            sb.append(str4);
            if (str5.length() > 0) {
                sb.append(SequenceUtils.SPC);
                sb.append(str5);
            }
            sb.append(BlockQuoteParser.MARKER_CHAR);
            sb.append(p5.f8415e);
            sb.append("</");
            sb.append((CharSequence) this.f8507q);
            b();
            return;
        }
        if ((jVar instanceof r0) || (jVar instanceof s0) || (jVar instanceof t0) || (jVar instanceof u0) || (jVar instanceof v0) || (jVar instanceof q0) || (jVar instanceof w0) || (jVar instanceof x0)) {
            b();
            sb.append((CharSequence) this.f8510t);
            b();
            return;
        }
        if (!(jVar instanceof g0)) {
            if (!(jVar instanceof M)) {
                throw new RuntimeException();
            }
            b();
            sb.append('\\');
            b();
            return;
        }
        String sb7 = this.f8510t.toString();
        AbstractC1276k.e(sb7, "toString(...)");
        if (sb7.length() > 8) {
            this.f8494d.add(new S2.N(sb7, sb7));
        } else {
            sb.append(sb7);
            b();
        }
    }

    public final void b() {
        StringBuilder sb = this.f8495e;
        if (sb.length() > 0) {
            String sb2 = sb.toString();
            AbstractC1276k.e(sb2, "toString(...)");
            this.f8494d.add(new S2.V(d(sb2)));
            u4.r.s(sb);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x024b, code lost:
    
        if (r8.equals("background") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0127, code lost:
    
        if (r8.equals("background-color") == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x024f, code lost:
    
        r4 = S2.AbstractC0558a0.h(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0253, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0255, code lost:
    
        r28 = r3;
        r12 = new o0.s(r4.a);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ec. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0340  */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(char r30) {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.y0.c(char):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:460:0x07dd, code lost:
    
        if (r1.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.B_NODE) == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x07fa, code lost:
    
        if (r2 != false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x07fc, code lost:
    
        u4.r.s(r12);
        r21.f8493c = new T2.V(r1, "font-weight: bold");
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0808, code lost:
    
        r14.append("</");
        r14.append(r1);
        r14.append(">");
        r21.f8493c = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x07e4, code lost:
    
        if (r1.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.STRONG_NODE) == false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x089a, code lost:
    
        if (r2.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.SPAN_NODE) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x08d4, code lost:
    
        u4.r.s(r4);
        r21.f8493c = new T2.U(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x08b6, code lost:
    
        if (r2.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.B_NODE) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x08bd, code lost:
    
        if (r2.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.STRONG_NODE) == false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x092a, code lost:
    
        if (r1.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.B_NODE) == false) goto L442;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0940, code lost:
    
        u4.r.s(r12);
        r21.f8493c = new T2.V(r1, "font-weight: bold");
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0931, code lost:
    
        if (r1.equals(com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter.STRONG_NODE) == false) goto L442;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList e() {
        /*
            Method dump skipped, instructions count: 2786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: T2.y0.e():java.util.ArrayList");
    }
}
