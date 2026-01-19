package U2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8658b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8659c;

    public o(String str, String str2, String str3) {
        this.a = str;
        this.f8658b = str2;
        this.f8659c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC1276k.b(this.a, oVar.a) && AbstractC1276k.b(this.f8658b, oVar.f8658b) && AbstractC1276k.b(this.f8659c, oVar.f8659c);
    }

    public final int hashCode() {
        return this.f8659c.hashCode() + B3.e.e(this.a.hashCode() * 31, 31, this.f8658b);
    }

    public final String toString() {
        return B3.e.s(B3.e.u("ToolSearchResult(url=", this.a, ", title=", this.f8658b, ", content="), this.f8659c, ")");
    }
}
