package B0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class r extends CancellationException {
    public r(long j3) {
        super("Timed out waiting for " + j3 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC0047x.f481d);
        return this;
    }
}
