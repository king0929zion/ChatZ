package T;

/* loaded from: classes.dex */
public final class I implements g1 {
    public final C0607g0 a;

    public I(C0607g0 c0607g0) {
        this.a = c0607g0;
    }

    @Override // T.g1
    public final Object a(InterfaceC0617l0 interfaceC0617l0) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof I) && this.a.equals(((I) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
