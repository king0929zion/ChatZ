package O4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class y {
    public static final String[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4380b;

    static {
        String[] strArr = new String[93];
        for (int i6 = 0; i6 < 32; i6++) {
            strArr[i6] = "\\u" + b(i6 >> 12) + b(i6 >> 8) + b(i6 >> 4) + b(i6);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        a = strArr;
        byte[] bArr = new byte[93];
        for (int i7 = 0; i7 < 32; i7++) {
            bArr[i7] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f4380b = bArr;
    }

    public static final void a(String str, StringBuilder sb) {
        AbstractC1276k.f(str, "value");
        sb.append('\"');
        int length = str.length();
        int i6 = 0;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt = str.charAt(i7);
            String[] strArr = a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) str, i6, i7);
                sb.append(strArr[charAt]);
                i6 = i7 + 1;
            }
        }
        if (i6 != 0) {
            sb.append((CharSequence) str, i6, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final char b(int i6) {
        int i7 = i6 & 15;
        return (char) (i7 < 10 ? i7 + 48 : i7 + 87);
    }
}
