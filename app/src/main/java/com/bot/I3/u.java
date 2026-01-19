package I3;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public static final u f2754b;

    /* renamed from: c, reason: collision with root package name */
    public static final u f2755c;

    /* renamed from: d, reason: collision with root package name */
    public static final u f2756d;
    public final String a;

    static {
        u uVar = new u("GET");
        f2754b = uVar;
        u uVar2 = new u("POST");
        f2755c = uVar2;
        u uVar3 = new u("PUT");
        u uVar4 = new u("PATCH");
        u uVar5 = new u("DELETE");
        u uVar6 = new u("HEAD");
        f2756d = uVar6;
        Y4.l.I(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, new u("OPTIONS"));
    }

    public u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && AbstractC1276k.b(this.a, ((u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return B3.e.r(new StringBuilder("HttpMethod(value="), this.a, ')');
    }
}
