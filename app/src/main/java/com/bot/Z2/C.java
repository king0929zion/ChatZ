package Z2;

import com.vladsch.flexmark.util.html.Attribute;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class C {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9899b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9900c;

    public C(String str, String str2, String str3) {
        AbstractC1276k.f(str2, "key");
        AbstractC1276k.f(str3, "value");
        this.a = str;
        this.f9899b = str2;
        this.f9900c = str3;
    }

    public static C a(C c6, String str, String str2, int i6) {
        String str3 = c6.a;
        if ((i6 & 2) != 0) {
            str = c6.f9899b;
        }
        if ((i6 & 4) != 0) {
            str2 = c6.f9900c;
        }
        c6.getClass();
        AbstractC1276k.f(str3, Attribute.ID_ATTR);
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(str2, "value");
        return new C(str3, str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c6 = (C) obj;
        return AbstractC1276k.b(this.a, c6.a) && AbstractC1276k.b(this.f9899b, c6.f9899b) && AbstractC1276k.b(this.f9900c, c6.f9900c);
    }

    public final int hashCode() {
        return this.f9900c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f9899b);
    }

    public final String toString() {
        return B3.e.s(B3.e.u("HeaderEntry(id=", this.a, ", key=", this.f9899b, ", value="), this.f9900c, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C(java.lang.String r4, int r5, java.lang.String r6) {
        /*
            r3 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            m4.AbstractC1276k.e(r0, r1)
            r1 = r5 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L14
            r4 = r2
        L14:
            r5 = r5 & 4
            if (r5 == 0) goto L19
            r6 = r2
        L19:
            r3.<init>(r0, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.C.<init>(java.lang.String, int, java.lang.String):void");
    }
}
