package W0;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final k f8845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8847d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8848e;

    public q(p pVar, k kVar, int i6, int i7, Object obj) {
        this.a = pVar;
        this.f8845b = kVar;
        this.f8846c = i6;
        this.f8847d = i7;
        this.f8848e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return AbstractC1276k.b(this.a, qVar.a) && AbstractC1276k.b(this.f8845b, qVar.f8845b) && this.f8846c == qVar.f8846c && this.f8847d == qVar.f8847d && AbstractC1276k.b(this.f8848e, qVar.f8848e);
    }

    public final int hashCode() {
        p pVar = this.a;
        int b5 = AbstractC1135a.b(this.f8847d, AbstractC1135a.b(this.f8846c, (((pVar == null ? 0 : pVar.hashCode()) * 31) + this.f8845b.f8840c) * 31, 31), 31);
        Object obj = this.f8848e;
        return b5 + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.a);
        sb.append(", fontWeight=");
        sb.append(this.f8845b);
        sb.append(", fontStyle=");
        String str = "Invalid";
        int i6 = this.f8846c;
        sb.append((Object) (i6 == 0 ? "Normal" : i6 == 1 ? "Italic" : "Invalid"));
        sb.append(", fontSynthesis=");
        int i7 = this.f8847d;
        if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Weight";
        } else if (i7 == 2) {
            str = "Style";
        } else if (i7 == 65535) {
            str = "All";
        }
        sb.append((Object) str);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f8848e);
        sb.append(')');
        return sb.toString();
    }
}
