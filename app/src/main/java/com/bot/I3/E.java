package I3;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: c, reason: collision with root package name */
    public static final E f2715c;

    /* renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f2716d;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2717b;

    static {
        E e6 = new E("http", 80);
        f2715c = e6;
        List I5 = Y4.l.I(e6, new E("https", 443), new E("ws", 80), new E("wss", 443), new E("socks", 1080));
        int H3 = Y3.C.H(Y3.n.Z(I5, 10));
        if (H3 < 16) {
            H3 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(H3);
        for (Object obj : I5) {
            linkedHashMap.put(((E) obj).a, obj);
        }
        f2716d = linkedHashMap;
    }

    public E(String str, int i6) {
        this.a = str;
        this.f2717b = i6;
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.toLowerCase(charAt) != charAt) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e6 = (E) obj;
        return this.a.equals(e6.a) && this.f2717b == e6.f2717b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f2717b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.a);
        sb.append(", defaultPort=");
        return B3.e.q(sb, this.f2717b, ')');
    }
}
