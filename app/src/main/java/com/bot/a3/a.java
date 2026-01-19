package A3;

import m4.AbstractC1276k;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, int i6) {
        super(str);
        switch (i6) {
            case AbstractC1787b.f15290g /* 5 */:
                AbstractC1276k.f(str, "message");
                super(str);
                return;
            case 6:
                AbstractC1276k.f(str, "message");
                super(str, null);
                return;
            default:
                AbstractC1276k.f(str, "message");
                return;
        }
    }
}
