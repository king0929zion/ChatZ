package Q4;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Comparator;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC1276k.f(str, FlexmarkHtmlConverter.A_NODE);
        AbstractC1276k.f(str2, FlexmarkHtmlConverter.B_NODE);
        int min = Math.min(str.length(), str2.length());
        for (int i6 = 4; i6 < min; i6++) {
            char charAt = str.charAt(i6);
            char charAt2 = str2.charAt(i6);
            if (charAt != charAt2) {
                return AbstractC1276k.g(charAt, charAt2) < 0 ? -1 : 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length != length2) {
            return length < length2 ? -1 : 1;
        }
        return 0;
    }
}
