package r1;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f14643b;

    /* renamed from: c, reason: collision with root package name */
    public List f14644c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Objects.equals(this.a, aVar.a) && Objects.equals(this.f14643b, aVar.f14643b) && Objects.equals(this.f14644c, aVar.f14644c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.f14643b, this.f14644c);
    }
}
