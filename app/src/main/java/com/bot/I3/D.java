package I3;

import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public abstract class D {
    public static final List a = Y4.l.H(FlexmarkHtmlConverter.DEFAULT_NODE);

    public static final int a(int i6, int i7, String str) {
        boolean z5 = false;
        while (i6 < i7) {
            char charAt = str.charAt(i6);
            if (charAt == '[') {
                z5 = true;
            } else if (charAt == ']') {
                z5 = false;
            } else if (charAt == ':' && !z5) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    public static final void b(B b5, String str) {
        AbstractC1276k.f(b5, "<this>");
        AbstractC1276k.f(str, "urlString");
        if (AbstractC1776n.Q(str)) {
            return;
        }
        try {
            c(b5, str);
        } catch (Throwable th) {
            throw new C("Fail to parse url: ".concat(str), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0111, code lost:
    
        if (r14 >= 128) goto L92;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e1 A[LOOP:3: B:58:0x00be->B:66:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00e9 A[EDGE_INSN: B:67:0x00e9->B:68:0x00e9 BREAK  A[LOOP:3: B:58:0x00be->B:66:0x00e1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011d A[LOOP:4: B:71:0x00ff->B:78:0x011d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0122 A[EDGE_INSN: B:79:0x0122->B:84:0x0122 BREAK  A[LOOP:4: B:71:0x00ff->B:78:0x011d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(I3.B r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I3.D.c(I3.B, java.lang.String):void");
    }
}
