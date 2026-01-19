package X0;

import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: g, reason: collision with root package name */
    public static final k f9108g = new k(false, 0, true, 1, 1, Z0.b.f9854f);
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9109b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9110c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9111d;

    /* renamed from: e, reason: collision with root package name */
    public final int f9112e;

    /* renamed from: f, reason: collision with root package name */
    public final Z0.b f9113f;

    public k(boolean z5, int i6, boolean z6, int i7, int i8, Z0.b bVar) {
        this.a = z5;
        this.f9109b = i6;
        this.f9110c = z6;
        this.f9111d = i7;
        this.f9112e = i8;
        this.f9113f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.f9109b == kVar.f9109b && this.f9110c == kVar.f9110c && this.f9111d == kVar.f9111d && this.f9112e == kVar.f9112e && AbstractC1276k.b(this.f9113f, kVar.f9113f);
    }

    public final int hashCode() {
        return this.f9113f.f9855c.hashCode() + AbstractC1135a.b(this.f9112e, AbstractC1135a.b(this.f9111d, AbstractC1135a.d(AbstractC1135a.b(this.f9109b, Boolean.hashCode(this.a) * 31, 31), 31, this.f9110c), 31), 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.a);
        sb.append(", capitalization=");
        int i6 = this.f9109b;
        sb.append((Object) (i6 == -1 ? "Unspecified" : i6 == 0 ? "None" : i6 == 1 ? "Characters" : i6 == 2 ? "Words" : i6 == 3 ? "Sentences" : "Invalid"));
        sb.append(", autoCorrect=");
        sb.append(this.f9110c);
        sb.append(", keyboardType=");
        sb.append((Object) l.a(this.f9111d));
        sb.append(", imeAction=");
        sb.append((Object) j.a(this.f9112e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f9113f);
        sb.append(')');
        return sb.toString();
    }
}
