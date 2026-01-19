package X4;

import androidx.lifecycle.N;
import com.vladsch.flexmark.ext.wikilink.WikiNode;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import d5.C0952l;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class f {
    public static final C0952l a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f9440b;

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f9441c;

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f9442d;

    static {
        C0952l c0952l = C0952l.f11483g;
        a = N.q("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f9440b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f9441c = new String[64];
        String[] strArr = new String[PegdownExtensions.WIKILINKS];
        for (int i6 = 0; i6 < 256; i6++) {
            String binaryString = Integer.toBinaryString(i6);
            AbstractC1276k.e(binaryString, "toBinaryString(it)");
            String replace = R4.b.i("%8s", binaryString).replace(SequenceUtils.SPC, '0');
            AbstractC1276k.e(replace, "replace(...)");
            strArr[i6] = replace;
        }
        f9442d = strArr;
        String[] strArr2 = f9441c;
        strArr2[0] = FlexmarkHtmlConverter.DEFAULT_NODE;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i7 = iArr[0];
        strArr2[i7 | 8] = B3.e.s(new StringBuilder(), strArr2[i7], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i8 = 0; i8 < 3; i8++) {
            int i9 = iArr2[i8];
            int i10 = iArr[0];
            String[] strArr3 = f9441c;
            int i11 = i10 | i9;
            strArr3[i11] = strArr3[i10] + WikiNode.SEPARATOR_CHAR + strArr3[i9];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i10]);
            sb.append(WikiNode.SEPARATOR_CHAR);
            strArr3[i11 | 8] = B3.e.s(sb, strArr3[i9], "|PADDED");
        }
        int length = f9441c.length;
        for (int i12 = 0; i12 < length; i12++) {
            String[] strArr4 = f9441c;
            if (strArr4[i12] == null) {
                strArr4[i12] = f9442d[i12];
            }
        }
    }

    public static String a(boolean z5, int i6, int i7, int i8, int i9) {
        String str;
        String str2;
        String[] strArr = f9440b;
        String i10 = i8 < strArr.length ? strArr[i8] : R4.b.i("0x%02x", Integer.valueOf(i8));
        if (i9 == 0) {
            str = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            String[] strArr2 = f9442d;
            if (i8 != 2 && i8 != 3) {
                if (i8 == 4 || i8 == 6) {
                    str = i9 == 1 ? "ACK" : strArr2[i9];
                } else if (i8 != 7 && i8 != 8) {
                    String[] strArr3 = f9441c;
                    if (i9 < strArr3.length) {
                        str2 = strArr3[i9];
                        AbstractC1276k.c(str2);
                    } else {
                        str2 = strArr2[i9];
                    }
                    str = (i8 != 5 || (i9 & 4) == 0) ? (i8 != 0 || (i9 & 32) == 0) ? str2 : u4.u.B(str2, "PRIORITY", "COMPRESSED", false) : u4.u.B(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr2[i9];
        }
        return R4.b.i("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i6), Integer.valueOf(i7), i10, str);
    }
}
