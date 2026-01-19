package I2;

import M4.C0255c;
import M4.n0;
import com.bot.core.database.dao.ConversationDao;
import com.bot.core.database.dao.MessageDao;
import com.bot.core.database.entity.ConversationEntity;
import com.bot.core.database.entity.MessageEntity;
import com.bot.core.model.ConversationInfo;
import com.bot.core.model.MessageAttachment;
import com.bot.core.model.MessageInfo;
import com.bot.core.model.ToolCallInfo;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class v extends H2.g {
    public static final o Companion = new Object();
    public final ConversationDao a;

    /* renamed from: b, reason: collision with root package name */
    public final MessageDao f2687b;

    public v(ConversationDao conversationDao, MessageDao messageDao) {
        this.a = conversationDao;
        this.f2687b = messageDao;
    }

    public static final String f(v vVar) {
        vVar.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date());
        AbstractC1276k.e(format, "format(...)");
        return format;
    }

    public static final ConversationInfo g(v vVar, ConversationEntity conversationEntity) {
        vVar.getClass();
        return new ConversationInfo(conversationEntity.getId(), conversationEntity.getTitle(), conversationEntity.getModelName(), conversationEntity.getSystemPrompt(), conversationEntity.isArchived(), conversationEntity.isFavorited(), false, conversationEntity.getCreatedAt(), conversationEntity.getUpdatedAt(), conversationEntity.getLastMessageAt(), Y3.w.f9813c, conversationEntity.getMessageCount(), conversationEntity.getTotalTokens());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X3.k] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList] */
    public static final MessageInfo h(v vVar, MessageEntity messageEntity) {
        List list;
        List list2;
        Object b5;
        Object b6;
        Object b7;
        Object b8;
        MessageAttachment messageAttachment;
        vVar.getClass();
        N4.m mVar = J2.a.a;
        String attachmentsJson = messageEntity.getAttachmentsJson();
        N4.m mVar2 = J2.a.a;
        String str = null;
        List list3 = Y3.v.f9812c;
        if (attachmentsJson == null || AbstractC1776n.Q(attachmentsJson)) {
            list = list3;
        } else {
            try {
                Object c6 = mVar2.c(attachmentsJson);
                if (c6 instanceof kotlinx.serialization.json.a) {
                    b7 = new ArrayList();
                    for (kotlinx.serialization.json.b bVar : (Iterable) c6) {
                        if (bVar instanceof kotlinx.serialization.json.d) {
                            if (((kotlinx.serialization.json.d) bVar).b() && !AbstractC1776n.Q(((kotlinx.serialization.json.d) bVar).a())) {
                                messageAttachment = new MessageAttachment(((kotlinx.serialization.json.d) bVar).a());
                            }
                            messageAttachment = null;
                        } else {
                            if (bVar instanceof kotlinx.serialization.json.c) {
                                try {
                                    KSerializer serializer = MessageAttachment.Companion.serializer();
                                    kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) bVar;
                                    AbstractC1276k.f(serializer, "deserializer");
                                    AbstractC1276k.f(cVar, "element");
                                    b8 = (MessageAttachment) new O4.p(mVar2, cVar, str, 12).p(serializer);
                                } catch (Throwable th) {
                                    b8 = X3.a.b(th);
                                }
                                if (b8 instanceof X3.k) {
                                    b8 = null;
                                }
                                messageAttachment = (MessageAttachment) b8;
                            }
                            messageAttachment = null;
                        }
                        if (messageAttachment != null) {
                            b7.add(messageAttachment);
                        }
                    }
                } else {
                    b7 = list3;
                }
            } catch (Throwable th2) {
                b7 = X3.a.b(th2);
            }
            Throwable a = X3.l.a(b7);
            List list4 = b7;
            if (a != null) {
                list4 = list3;
            }
            list = list4;
        }
        N4.m mVar3 = J2.a.a;
        String toolCallsJson = messageEntity.getToolCallsJson();
        if (toolCallsJson == null || AbstractC1776n.Q(toolCallsJson)) {
            list2 = null;
        } else {
            try {
                N4.m mVar4 = J2.a.a;
                mVar4.getClass();
                b6 = (List) mVar4.a(toolCallsJson, new C0255c(ToolCallInfo.Companion.serializer(), 0));
            } catch (Throwable th3) {
                b6 = X3.a.b(th3);
            }
            if (b6 instanceof X3.k) {
                b6 = null;
            }
            list2 = (List) b6;
        }
        N4.m mVar5 = L2.g.a;
        String reasoningContent = messageEntity.getReasoningContent();
        if (reasoningContent != null && reasoningContent.length() != 0) {
            String obj = AbstractC1776n.l0(reasoningContent).toString();
            if (u4.u.D(obj, "[", false)) {
                try {
                    N4.m mVar6 = L2.g.a;
                    mVar6.getClass();
                    b5 = (List) mVar6.a(obj, new C0255c(n0.a, 0));
                } catch (Throwable th4) {
                    b5 = X3.a.b(th4);
                }
                if (b5 instanceof X3.k) {
                    b5 = null;
                }
                List list5 = (List) b5;
                list3 = list5 == null ? Y4.l.H(reasoningContent) : list5;
            } else {
                list3 = Y4.l.H(reasoningContent);
            }
        }
        return new MessageInfo(messageEntity.getId(), messageEntity.getRole(), messageEntity.getContent(), list3, messageEntity.getReasoningDurationMs(), list2, list.isEmpty() ? null : list, messageEntity.getCreatedAt());
    }

    public static Object i(v vVar, String str, String str2, String str3, List list, List list2, String str4, d4.c cVar, int i6) {
        int i7 = i6 & 8;
        Y3.v vVar2 = Y3.v.f9812c;
        Y3.v vVar3 = i7 != 0 ? null : vVar2;
        List list3 = (i6 & 32) != 0 ? vVar2 : list;
        List list4 = (i6 & 64) != 0 ? vVar2 : list2;
        String str5 = (i6 & PegdownExtensions.WIKILINKS) != 0 ? null : str4;
        vVar.getClass();
        return vVar.c(cVar, new p(vVar, vVar3, str5, str, str2, str3, list3, list4, vVar2, null));
    }

    public static Object j(v vVar, int i6, int i7, d4.i iVar) {
        vVar.getClass();
        return vVar.c(iVar, new s(vVar, i6, i7, null));
    }
}
