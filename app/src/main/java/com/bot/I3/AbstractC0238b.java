package I3;

import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import m4.AbstractC1276k;
import r4.AbstractC1635a;
import u4.AbstractC1763a;

/* renamed from: I3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0238b {
    public static final Set a;

    /* renamed from: b, reason: collision with root package name */
    public static final Set f2737b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2738c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f2739d;

    /* JADX WARN: Type inference failed for: r0v18, types: [r4.a, r4.c] */
    /* JADX WARN: Type inference failed for: r0v22, types: [r4.a, r4.c] */
    /* JADX WARN: Type inference failed for: r0v26, types: [r4.a, r4.c] */
    /* JADX WARN: Type inference failed for: r10v1, types: [r4.a, r4.c] */
    /* JADX WARN: Type inference failed for: r12v0, types: [r4.a, r4.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [r4.a, r4.c] */
    static {
        ArrayList z02 = Y3.m.z0(Y3.m.B0(new AbstractC1635a('a', 'z'), new AbstractC1635a('A', 'Z')), new AbstractC1635a('0', '9'));
        ArrayList arrayList = new ArrayList(Y3.n.Z(z02, 10));
        int size = z02.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = z02.get(i6);
            i6++;
            arrayList.add(Byte.valueOf((byte) ((Character) obj).charValue()));
        }
        a = Y3.m.N0(arrayList);
        f2737b = Y3.m.N0(Y3.m.z0(Y3.m.B0(new AbstractC1635a('a', 'z'), new AbstractC1635a('A', 'Z')), new AbstractC1635a('0', '9')));
        Y3.m.N0(Y3.m.z0(Y3.m.B0(new AbstractC1635a('a', 'f'), new AbstractC1635a('A', 'F')), new AbstractC1635a('0', '9')));
        Set C02 = Y3.k.C0(new Character[]{':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+'});
        ArrayList arrayList2 = new ArrayList(Y3.n.Z(C02, 10));
        Iterator it = C02.iterator();
        while (it.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        f2738c = arrayList2;
        Y3.k.C0(new Character[]{':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~'});
        Y3.F.p0(f2737b, Y3.k.C0(new Character[]{'!', '#', '$', '&', '+', '-', '.', '^', '_', '`', Character.valueOf(WikiNode.SEPARATOR_CHAR), '~'}));
        List I5 = Y4.l.I('-', '.', '_', '~');
        ArrayList arrayList3 = new ArrayList(Y3.n.Z(I5, 10));
        Iterator it2 = I5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        f2739d = arrayList3;
    }

    public static final String a(byte b5) {
        int i6 = (b5 & 255) >> 4;
        int i7 = b5 & 15;
        return new String(new char[]{'%', (char) ((i6 < 0 || i6 >= 10) ? ((char) (i6 + 65)) - '\n' : i6 + 48), (char) ((i7 < 0 || i7 >= 10) ? ((char) (i7 + 65)) - '\n' : i7 + 48)});
    }

    public static final int b(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        if ('a' > c6 || c6 >= 'g') {
            return -1;
        }
        return c6 - 'W';
    }

    public static final String c(String str, int i6, int i7, boolean z5, Charset charset) {
        int i8 = i6;
        while (i8 < i7) {
            char charAt = str.charAt(i8);
            if (charAt == '%' || (z5 && charAt == '+')) {
                int i9 = i7 - i6;
                if (i9 > 255) {
                    i9 /= 3;
                }
                StringBuilder sb = new StringBuilder(i9);
                if (i8 > i6) {
                    sb.append((CharSequence) str, i6, i8);
                }
                byte[] bArr = null;
                while (i8 < i7) {
                    char charAt2 = str.charAt(i8);
                    if (z5 && charAt2 == '+') {
                        sb.append(SequenceUtils.SPC);
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i7 - i8) / 3];
                        }
                        int i10 = 0;
                        while (i8 < i7 && str.charAt(i8) == '%') {
                            int i11 = i8 + 2;
                            if (i11 >= i7) {
                                throw new A3.a("Incomplete trailing HEX escape: " + str.subSequence(i8, str.length()).toString() + ", in " + ((Object) str) + " at " + i8, 2);
                            }
                            int i12 = i8 + 1;
                            int b5 = b(str.charAt(i12));
                            int b6 = b(str.charAt(i11));
                            if (b5 == -1 || b6 == -1) {
                                throw new A3.a("Wrong HEX escape: %" + str.charAt(i12) + str.charAt(i11) + ", in " + ((Object) str) + ", at " + i8, 2);
                            }
                            bArr[i10] = (byte) ((b5 * 16) + b6);
                            i8 += 3;
                            i10++;
                        }
                        sb.append(new String(bArr, 0, i10, charset));
                    } else {
                        sb.append(charAt2);
                    }
                    i8++;
                }
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "sb.toString()");
                return sb2;
            }
            i8++;
        }
        if (i6 == 0 && i7 == str.length()) {
            return str.toString();
        }
        String substring = str.substring(i6, i7);
        AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String d(String str) {
        int length = str.length();
        Charset charset = AbstractC1763a.a;
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(charset, "charset");
        return c(str, 0, length, false, charset);
    }

    public static String e(int i6, int i7, int i8, String str) {
        if ((i8 & 1) != 0) {
            i6 = 0;
        }
        if ((i8 & 2) != 0) {
            i7 = str.length();
        }
        boolean z5 = (i8 & 4) == 0;
        Charset charset = AbstractC1763a.a;
        AbstractC1276k.f(str, "<this>");
        AbstractC1276k.f(charset, "charset");
        return c(str, i6, i7, z5, charset);
    }

    public static final String f(String str, boolean z5) {
        AbstractC1276k.f(str, "<this>");
        StringBuilder sb = new StringBuilder();
        CharsetEncoder newEncoder = AbstractC1763a.a.newEncoder();
        AbstractC1276k.e(newEncoder, "UTF_8.newEncoder()");
        g(Y4.d.B(newEncoder, str, 0, str.length()), new C0237a(sb, z5));
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x002b, code lost:
    
        throw new java.io.EOFException("No readable bytes available.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(U3.d r4, l4.c r5) {
        /*
            r0 = 1
            V3.b r1 = V3.c.d(r4, r0)
            if (r1 != 0) goto L8
            goto L32
        L8:
            int r2 = r1.f8663c     // Catch: java.lang.Throwable -> L22
            int r3 = r1.f8662b     // Catch: java.lang.Throwable -> L22
            if (r2 <= r3) goto L2c
            if (r3 == r2) goto L24
            int r2 = r3 + 1
            r1.f8662b = r2     // Catch: java.lang.Throwable -> L22
            java.nio.ByteBuffer r2 = r1.a     // Catch: java.lang.Throwable -> L22
            byte r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch: java.lang.Throwable -> L22
            r5.f(r2)     // Catch: java.lang.Throwable -> L22
            goto L8
        L22:
            r5 = move-exception
            goto L35
        L24:
            java.io.EOFException r5 = new java.io.EOFException     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = "No readable bytes available."
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L22
            throw r5     // Catch: java.lang.Throwable -> L22
        L2c:
            V3.b r1 = V3.c.e(r4, r1)     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L8
        L32:
            return
        L33:
            r5 = move-exception
            r0 = 0
        L35:
            if (r0 == 0) goto L3a
            V3.c.a(r4, r1)
        L3a:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.AbstractC0238b.g(U3.d, l4.c):void");
    }
}
