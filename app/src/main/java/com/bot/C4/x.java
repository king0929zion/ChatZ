package C4;

import b4.InterfaceC0909g;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class x implements InterfaceC0909g {

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal f721c;

    public x(ThreadLocal threadLocal) {
        this.f721c = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && AbstractC1276k.b(this.f721c, ((x) obj).f721c);
    }

    public final int hashCode() {
        return this.f721c.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f721c + ')';
    }
}
