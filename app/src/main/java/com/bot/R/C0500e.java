package R;

import java.util.concurrent.CancellationException;

/* renamed from: R.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0500e extends CancellationException {
    public C0500e() {
        super("Anchored drag finished");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(AbstractC0507l.f6800b);
        return this;
    }
}
