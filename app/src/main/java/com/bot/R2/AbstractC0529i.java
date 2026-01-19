package R2;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import m4.AbstractC1276k;

/* renamed from: R2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0529i {
    public static final DateTimeFormatter a;

    static {
        DateTimeFormatter withZone = DateTimeFormatter.ofPattern("yyyy年M月", Locale.getDefault()).withZone(ZoneId.systemDefault());
        AbstractC1276k.e(withZone, "withZone(...)");
        a = withZone;
    }

    public static Long a(String str) {
        try {
            return Long.valueOf(Instant.parse(str).toEpochMilli());
        } catch (Exception unused) {
            return null;
        }
    }
}
