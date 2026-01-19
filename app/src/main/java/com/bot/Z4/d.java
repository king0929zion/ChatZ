package Z4;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class d extends Handler {
    public static final d a = new Handler();

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        AbstractC1276k.f(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = logRecord.getLoggerName();
        AbstractC1276k.e(loggerName, "record.loggerName");
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i6 = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        AbstractC1276k.e(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f10545b.get(loggerName);
        if (str == null) {
            str = AbstractC1776n.j0(23, loggerName);
        }
        if (Log.isLoggable(str, i6)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i7 = 0;
            while (i7 < length) {
                int N5 = AbstractC1776n.N(message, '\n', i7, 4);
                if (N5 == -1) {
                    N5 = length;
                }
                while (true) {
                    min = Math.min(N5, i7 + 4000);
                    String substring = message.substring(i7, min);
                    AbstractC1276k.e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i6, str, substring);
                    if (min >= N5) {
                        break;
                    } else {
                        i7 = min;
                    }
                }
                i7 = min + 1;
            }
        }
    }
}
