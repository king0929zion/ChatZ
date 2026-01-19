package I2;

import com.bot.core.model.ReasoningRule;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* renamed from: I2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0233c {
    public final ReasoningRule a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f2624c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2625d;

    public C0233c(ReasoningRule reasoningRule, boolean z5, Integer num, String str) {
        AbstractC1276k.f(str, "modelId");
        this.a = reasoningRule;
        this.f2623b = z5;
        this.f2624c = num;
        this.f2625d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0233c)) {
            return false;
        }
        C0233c c0233c = (C0233c) obj;
        return AbstractC1276k.b(this.a, c0233c.a) && this.f2623b == c0233c.f2623b && AbstractC1276k.b(this.f2624c, c0233c.f2624c) && AbstractC1276k.b(this.f2625d, c0233c.f2625d);
    }

    public final int hashCode() {
        int d6 = AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f2623b);
        Integer num = this.f2624c;
        return this.f2625d.hashCode() + ((d6 + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "ReasoningContext(rule=" + this.a + ", enabled=" + this.f2623b + ", budgetTokens=" + this.f2624c + ", modelId=" + this.f2625d + ")";
    }
}
