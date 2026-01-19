package R2;

import com.bot.core.model.ConversationInfo;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: R2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0528h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Long valueOf;
        Iterator it = ((List) ((X3.i) obj2).f9394e).iterator();
        Long l3 = null;
        if (it.hasNext()) {
            ConversationInfo conversationInfo = (ConversationInfo) it.next();
            DateTimeFormatter dateTimeFormatter = AbstractC0529i.a;
            Long a = AbstractC0529i.a(conversationInfo.f11160i);
            valueOf = Long.valueOf(a != null ? a.longValue() : 0L);
            while (it.hasNext()) {
                ConversationInfo conversationInfo2 = (ConversationInfo) it.next();
                DateTimeFormatter dateTimeFormatter2 = AbstractC0529i.a;
                Long a6 = AbstractC0529i.a(conversationInfo2.f11160i);
                Long valueOf2 = Long.valueOf(a6 != null ? a6.longValue() : 0L);
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        Long valueOf3 = Long.valueOf(valueOf != null ? valueOf.longValue() : 0L);
        Iterator it2 = ((List) ((X3.i) obj).f9394e).iterator();
        if (it2.hasNext()) {
            ConversationInfo conversationInfo3 = (ConversationInfo) it2.next();
            DateTimeFormatter dateTimeFormatter3 = AbstractC0529i.a;
            Long a7 = AbstractC0529i.a(conversationInfo3.f11160i);
            Long valueOf4 = Long.valueOf(a7 != null ? a7.longValue() : 0L);
            loop0: while (true) {
                l3 = valueOf4;
                while (it2.hasNext()) {
                    ConversationInfo conversationInfo4 = (ConversationInfo) it2.next();
                    DateTimeFormatter dateTimeFormatter4 = AbstractC0529i.a;
                    Long a8 = AbstractC0529i.a(conversationInfo4.f11160i);
                    valueOf4 = Long.valueOf(a8 != null ? a8.longValue() : 0L);
                    if (l3.compareTo(valueOf4) < 0) {
                        break;
                    }
                }
            }
        }
        return h5.e.J(valueOf3, Long.valueOf(l3 != null ? l3.longValue() : 0L));
    }
}
