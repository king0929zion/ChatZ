package X2;

import com.bot.core.model.ConversationInfo;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class M extends N {
    public final ConversationInfo a;

    static {
        ConversationInfo.Companion companion = ConversationInfo.Companion;
    }

    public M(ConversationInfo conversationInfo) {
        AbstractC1276k.f(conversationInfo, "conversation");
        this.a = conversationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof M) && AbstractC1276k.b(this.a, ((M) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Upsert(conversation=" + this.a + ")";
    }
}
