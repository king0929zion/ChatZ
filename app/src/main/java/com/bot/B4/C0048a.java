package B4;

import A4.InterfaceC0008i;
import java.util.concurrent.CancellationException;

/* renamed from: B4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0048a extends CancellationException {

    /* renamed from: c, reason: collision with root package name */
    public final transient Object f574c;

    public C0048a(InterfaceC0008i interfaceC0008i) {
        super("Flow was aborted, no more elements needed");
        this.f574c = interfaceC0008i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
