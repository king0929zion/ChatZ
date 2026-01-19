package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0581m implements InterfaceC0582n {
    public final String a;

    public C0581m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0581m) && AbstractC1276k.b(this.a, ((C0581m) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1135a.s("Text(value=", this.a, ")");
    }
}
