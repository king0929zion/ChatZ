package R3;

import java.lang.reflect.Type;
import m4.C1265A;
import m4.C1270e;

/* loaded from: classes.dex */
public final class a {
    public final C1270e a;

    /* renamed from: b, reason: collision with root package name */
    public final Type f7076b;

    /* renamed from: c, reason: collision with root package name */
    public final C1265A f7077c;

    public a(C1270e c1270e, Type type, C1265A c1265a) {
        this.a = c1270e;
        this.f7076b = type;
        this.f7077c = c1265a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.f7076b.equals(aVar.f7076b) && this.f7077c.equals(aVar.f7077c);
    }

    public final int hashCode() {
        return this.f7077c.hashCode() + ((this.f7076b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TypeInfo(type=" + this.a + ", reifiedType=" + this.f7076b + ", kotlinType=" + this.f7077c + ')';
    }
}
