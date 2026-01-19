package g1;

import P2.D0;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1016a {
    public static String a(List list, String str, D0 d02, int i6) {
        if ((i6 & 1) != 0) {
            str = ", ";
        }
        int i7 = i6 & 2;
        String str2 = FlexmarkHtmlConverter.DEFAULT_NODE;
        String str3 = i7 != 0 ? FlexmarkHtmlConverter.DEFAULT_NODE : "[\n\t";
        if ((i6 & 4) == 0) {
            str2 = "\n]";
        }
        if ((i6 & 32) != 0) {
            d02 = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str3);
        int size = list.size();
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            Object obj = list.get(i9);
            i8++;
            if (i8 > 1) {
                sb.append((CharSequence) str);
            }
            if (d02 != null) {
                sb.append((CharSequence) d02.f(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) str2);
        return sb.toString();
    }

    public static final Void b(String str) {
        throw new NoSuchElementException(str);
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException(str);
    }
}
