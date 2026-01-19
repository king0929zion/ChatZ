package m4;

/* renamed from: m4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1280o implements InterfaceC1269d {
    public final Class a;

    public C1280o(Class cls) {
        this.a = cls;
    }

    @Override // m4.InterfaceC1269d
    public final Class a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1280o) {
            return AbstractC1276k.b(this.a, ((C1280o) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + " (Kotlin reflection is not available)";
    }
}
