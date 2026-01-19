package P3;

import M1.d;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class a {
    public static final TimeZone a = TimeZone.getTimeZone("GMT");

    public static final b a(Long l3) {
        Calendar calendar = Calendar.getInstance(a, Locale.ROOT);
        AbstractC1276k.c(calendar);
        if (l3 != null) {
            calendar.setTimeInMillis(l3.longValue());
        }
        return new b(calendar.get(13), calendar.get(12), calendar.get(11), d.b(7)[(calendar.get(7) + 5) % 7], calendar.get(5), calendar.get(6), d.b(12)[calendar.get(2)], calendar.get(1), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }
}
