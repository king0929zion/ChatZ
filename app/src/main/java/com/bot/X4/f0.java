package x4;

import java.util.concurrent.CancellationException;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class f0 extends CancellationException implements InterfaceC1937t {

    /* renamed from: c, reason: collision with root package name */
    public final transient l0 f15693c;

    public f0(String str, Throwable th, l0 l0Var) {
        super(str);
        this.f15693c = l0Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // x4.InterfaceC1937t
    public final /* bridge */ /* synthetic */ Throwable a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return AbstractC1276k.b(f0Var.getMessage(), getMessage()) && AbstractC1276k.b(f0Var.f15693c, this.f15693c) && AbstractC1276k.b(f0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        AbstractC1276k.c(message);
        int hashCode = (this.f15693c.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f15693c;
    }
}
