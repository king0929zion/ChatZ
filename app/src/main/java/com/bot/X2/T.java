package X2;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class T {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9227b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9228c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9229d;

    public T(String str, String str2, String str3, String str4) {
        this.a = str;
        this.f9227b = str2;
        this.f9228c = str3;
        this.f9229d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T)) {
            return false;
        }
        T t5 = (T) obj;
        return AbstractC1276k.b(this.a, t5.a) && AbstractC1276k.b(this.f9227b, t5.f9227b) && AbstractC1276k.b(this.f9228c, t5.f9228c) && AbstractC1276k.b(this.f9229d, t5.f9229d);
    }

    public final int hashCode() {
        return this.f9229d.hashCode() + B3.e.e(B3.e.e(this.a.hashCode() * 31, 31, this.f9227b), 31, this.f9228c);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("PendingTitleGeneration(conversationId=", this.a, ", userMessage=", this.f9227b, ", fallbackTitle=");
        u5.append(this.f9228c);
        u5.append(", modelId=");
        u5.append(this.f9229d);
        u5.append(")");
        return u5.toString();
    }
}
