package I2;

import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class F {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2617b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f2618c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2619d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2620e;

    public F(String str, String str2, Map map, Object obj, boolean z5) {
        AbstractC1276k.f(str2, "toolName");
        AbstractC1276k.f(map, "arguments");
        this.a = str;
        this.f2617b = str2;
        this.f2618c = map;
        this.f2619d = obj;
        this.f2620e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        return AbstractC1276k.b(this.a, f6.a) && AbstractC1276k.b(this.f2617b, f6.f2617b) && AbstractC1276k.b(this.f2618c, f6.f2618c) && AbstractC1276k.b(this.f2619d, f6.f2619d) && this.f2620e == f6.f2620e;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.f2618c.hashCode() + B3.e.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f2617b)) * 31;
        Object obj = this.f2619d;
        return Boolean.hashCode(this.f2620e) + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u5 = B3.e.u("ToolResultData(toolCallId=", this.a, ", toolName=", this.f2617b, ", arguments=");
        u5.append(this.f2618c);
        u5.append(", result=");
        u5.append(this.f2619d);
        u5.append(", success=");
        u5.append(this.f2620e);
        u5.append(")");
        return u5.toString();
    }
}
