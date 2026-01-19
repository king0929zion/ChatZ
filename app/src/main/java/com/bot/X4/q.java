package X4;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class q {
    public static int a(int i6, int i7, int i8) {
        if ((i7 & 8) != 0) {
            i6--;
        }
        if (i8 <= i6) {
            return i6 - i8;
        }
        throw new IOException(B3.e.k("PROTOCOL_ERROR padding ", i8, i6, " > remaining length "));
    }
}
