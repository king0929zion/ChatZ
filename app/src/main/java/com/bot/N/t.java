package N;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public String f3624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3625c = false;

    /* renamed from: d, reason: collision with root package name */
    public e f3626d = null;

    public t(String str, String str2) {
        this.a = str;
        this.f3624b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return AbstractC1276k.b(this.a, tVar.a) && AbstractC1276k.b(this.f3624b, tVar.f3624b) && this.f3625c == tVar.f3625c && AbstractC1276k.b(this.f3626d, tVar.f3626d);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(B3.e.e(this.a.hashCode() * 31, 31, this.f3624b), 31, this.f3625c);
        e eVar = this.f3626d;
        return d6 + (eVar == null ? 0 : eVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f3626d + ", isShowingSubstitution=" + this.f3625c + ')';
    }
}
