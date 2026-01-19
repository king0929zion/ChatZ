package Q4;

import java.net.InetSocketAddress;
import java.net.Proxy;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B {
    public final C0493a a;

    /* renamed from: b, reason: collision with root package name */
    public final Proxy f6478b;

    /* renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f6479c;

    public B(C0493a c0493a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        AbstractC1276k.f(inetSocketAddress, "socketAddress");
        this.a = c0493a;
        this.f6478b = proxy;
        this.f6479c = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        B b5 = (B) obj;
        return AbstractC1276k.b(b5.a, this.a) && AbstractC1276k.b(b5.f6478b, this.f6478b) && AbstractC1276k.b(b5.f6479c, this.f6479c);
    }

    public final int hashCode() {
        return this.f6479c.hashCode() + ((this.f6478b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f6479c + '}';
    }
}
