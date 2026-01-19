package M2;

import java.util.ArrayList;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w extends y {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3407b;

    public w(String str, ArrayList arrayList) {
        AbstractC1276k.f(str, "conversationId");
        this.a = str;
        this.f3407b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return AbstractC1276k.b(this.a, wVar.a) && this.f3407b.equals(wVar.f3407b);
    }

    public final int hashCode() {
        return this.f3407b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ToolCallsReceived(conversationId=" + this.a + ", toolCalls=" + this.f3407b + ")";
    }
}
