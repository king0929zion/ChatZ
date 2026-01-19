package Y1;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface b extends Closeable {
    a G();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z5);
}
