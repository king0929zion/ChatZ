package S2;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: S2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0583o {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7834b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f7835c;

    public C0583o(String str, int i6, Integer num) {
        AbstractC1276k.f(str, "content");
        this.a = str;
        this.f7834b = i6;
        this.f7835c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0583o)) {
            return false;
        }
        C0583o c0583o = (C0583o) obj;
        return AbstractC1276k.b(this.a, c0583o.a) && this.f7834b == c0583o.f7834b && AbstractC1276k.b(this.f7835c, c0583o.f7835c);
    }

    public final int hashCode() {
        int b5 = AbstractC1135a.b(this.f7834b, this.a.hashCode() * 31, 31);
        Integer num = this.f7835c;
        return b5 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ListItem(content=" + this.a + ", indentLevel=" + this.f7834b + ", originalNumber=" + this.f7835c + ")";
    }
}
