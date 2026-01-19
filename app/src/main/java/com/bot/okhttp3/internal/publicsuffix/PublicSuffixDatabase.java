package okhttp3.internal.publicsuffix;

import Y3.m;
import Y4.l;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import d5.AbstractC0942b;
import d5.C;
import d5.s;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13518e = {42};

    /* renamed from: f, reason: collision with root package name */
    public static final List f13519f = l.H("*");

    /* renamed from: g, reason: collision with root package name */
    public static final PublicSuffixDatabase f13520g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f13521b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public byte[] f13522c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13523d;

    public static List c(String str) {
        List b02 = AbstractC1776n.b0(str, new char[]{'.'}, 6);
        return AbstractC1276k.b(m.w0(b02), FlexmarkHtmlConverter.DEFAULT_NODE) ? m.l0(b02) : b02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r2 <= 1) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a1, code lost:
    
        r6 = (byte[][]) r5.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
    
        if (r11 >= r10) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
    
        r6[r11] = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f13518e;
        r12 = r13.f13522c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        if (r12 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b4, code lost:
    
        r12 = androidx.lifecycle.N.b(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r12 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if (r12 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c5, code lost:
    
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
    
        if (r6 >= r2) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c9, code lost:
    
        r7 = r13.f13523d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if (r7 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cd, code lost:
    
        r7 = androidx.lifecycle.N.b(r7, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
    
        if (r7 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d4, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e1, code lost:
    
        if (r7 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e3, code lost:
    
        r1 = u4.AbstractC1776n.b0("!".concat(r7), new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r0.size() != r1.size()) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0132, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013d, code lost:
    
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0147, code lost:
    
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0153, code lost:
    
        r14 = Y3.m.h0(c(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x015b, code lost:
    
        if (r0 < 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015d, code lost:
    
        if (r0 != 0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
    
        if ((r14 instanceof t4.InterfaceC1731c) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0164, code lost:
    
        r14 = ((t4.InterfaceC1731c) r14).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016b, code lost:
    
        r14 = new t4.C1730b(r14, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0177, code lost:
    
        return t4.j.r(r14, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0189, code lost:
    
        throw new java.lang.IllegalArgumentException(B3.e.l("Requested element count ", r0, " is less than zero.").toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0149, code lost:
    
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        if (r9 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f4, code lost:
    
        if (r12 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
    
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f13519f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f9, code lost:
    
        if (r9 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00fb, code lost:
    
        r6 = u4.AbstractC1776n.b0(r9, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0105, code lost:
    
        if (r12 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0107, code lost:
    
        r1 = u4.AbstractC1776n.b0(r12, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        if (r6.size() <= r1.size()) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0119, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0104, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00d7, code lost:
    
        m4.AbstractC1276k.k("publicSuffixExceptionListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00dc, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00dd, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00be, code lost:
    
        m4.AbstractC1276k.k("publicSuffixListBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00c1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00c2, code lost:
    
        r12 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                C c6 = AbstractC0942b.c(new s(AbstractC0942b.h(resourceAsStream)));
                try {
                    long readInt = c6.readInt();
                    c6.a0(readInt);
                    byte[] r5 = c6.f11445e.r(readInt);
                    long readInt2 = c6.readInt();
                    c6.a0(readInt2);
                    byte[] r6 = c6.f11445e.r(readInt2);
                    c6.close();
                    synchronized (this) {
                        this.f13522c = r5;
                        this.f13523d = r6;
                    }
                } finally {
                }
            }
        } finally {
            this.f13521b.countDown();
        }
    }
}
