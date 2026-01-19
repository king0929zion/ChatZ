package d5;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface G extends Closeable, Flushable {
    void T(long j3, C0949i c0949i);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    K timeout();
}
