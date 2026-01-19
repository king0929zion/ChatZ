package C4;

import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: c, reason: collision with root package name */
    public final transient InterfaceC0910h f687c;

    public e(InterfaceC0910h interfaceC0910h) {
        this.f687c = interfaceC0910h;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f687c.toString();
    }
}
