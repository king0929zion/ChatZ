package u4;

import java.nio.charset.Charset;
import m4.AbstractC1276k;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1763a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        AbstractC1276k.e(forName, "forName(...)");
        a = forName;
        AbstractC1276k.e(Charset.forName("UTF-16"), "forName(...)");
        AbstractC1276k.e(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC1276k.e(Charset.forName("UTF-16LE"), "forName(...)");
        AbstractC1276k.e(Charset.forName("US-ASCII"), "forName(...)");
        AbstractC1276k.e(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
