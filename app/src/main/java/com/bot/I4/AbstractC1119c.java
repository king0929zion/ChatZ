package i4;

import java.io.File;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* renamed from: i4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1119c implements AbstractC1120d,   {
    public static File v(File file) {
        int length;
        int N5;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        AbstractC1276k.e(path, "getPath(...)");
        char c6 = File.separatorChar;
        int N6 = AbstractC1776n.N(path, c6, 0, 4);
        if (N6 != 0) {
            length = (N6 <= 0 || path.charAt(N6 + (-1)) != ':') ? (N6 == -1 && AbstractC1776n.K(path, ':')) ? path.length() : 0 : N6 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c6 || (N5 = AbstractC1776n.N(path, c6, 2, 4)) < 0) {
            length = 1;
        } else {
            int N7 = AbstractC1776n.N(path, c6, N5 + 1, 4);
            length = N7 >= 0 ? N7 + 1 : path.length();
        }
        if (length > 0) {
            return file2;
        }
        String file3 = file.toString();
        AbstractC1276k.e(file3, "toString(...)");
        if ((file3.length() == 0) || AbstractC1776n.K(file3, c6)) {
            return new File(file3 + file2);
        }
        return new File(file3 + c6 + file2);
    }
}
