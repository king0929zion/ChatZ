package y;

import android.os.Build;
import java.util.Locale;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class t0 {
    public static final s0 a;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        s0 s0Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC1276k.e(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("robolectric")) {
                s0Var = new Object();
                a = s0Var;
            }
        }
        s0Var = null;
        a = s0Var;
    }
}
