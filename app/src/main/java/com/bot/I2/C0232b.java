package I2;

import m4.AbstractC1276k;

/* renamed from: I2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232b {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f2621b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f2622c;

    public C0232b() {
        StringBuilder sb = new StringBuilder();
        this.a = null;
        this.f2621b = null;
        this.f2622c = sb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0232b)) {
            return false;
        }
        C0232b c0232b = (C0232b) obj;
        return AbstractC1276k.b(this.a, c0232b.a) && AbstractC1276k.b(this.f2621b, c0232b.f2621b) && AbstractC1276k.b(this.f2622c, c0232b.f2622c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f2621b;
        return this.f2622c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("PendingToolCall(id=", this.a, ", name=", this.f2621b, ", arguments=");
        u5.append((Object) this.f2622c);
        u5.append(")");
        return u5.toString();
    }
}
