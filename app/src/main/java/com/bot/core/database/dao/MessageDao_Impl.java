package com.bot.core.database.dao;

import A4.InterfaceC0007h;
import D.J0;
import M2.b;
import N1.AbstractC0281c;
import N1.v;
import X1.a;
import X1.c;
import X3.y;
import Y4.d;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.entity.MessageEntity;
import com.vladsch.flexmark.util.html.Attribute;
import h5.e;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1271f;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;
import z2.C2018a;
import z2.C2022e;

/* loaded from: classes.dex */
public final class MessageDao_Impl implements MessageDao {
    private final v __db;
    private final AbstractC0281c __insertAdapterOfMessageEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.bot.core.database.dao.MessageDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0281c {
        @Override // N1.AbstractC0281c
        public String createQuery() {
            return "INSERT OR REPLACE INTO `messages` (`id`,`conversationId`,`role`,`content`,`reasoningContent`,`reasoningDurationMs`,`attachmentsJson`,`toolCallsJson`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?)";
        }

        @Override // N1.AbstractC0281c
        public void bind(c cVar, MessageEntity messageEntity) {
            AbstractC1276k.f(cVar, "statement");
            AbstractC1276k.f(messageEntity, "entity");
            cVar.z(1, messageEntity.getId());
            cVar.z(2, messageEntity.getConversationId());
            cVar.z(3, messageEntity.getRole());
            cVar.z(4, messageEntity.getContent());
            String reasoningContent = messageEntity.getReasoningContent();
            if (reasoningContent == null) {
                cVar.e(5);
            } else {
                cVar.z(5, reasoningContent);
            }
            Long reasoningDurationMs = messageEntity.getReasoningDurationMs();
            if (reasoningDurationMs == null) {
                cVar.e(6);
            } else {
                cVar.a(reasoningDurationMs.longValue(), 6);
            }
            String attachmentsJson = messageEntity.getAttachmentsJson();
            if (attachmentsJson == null) {
                cVar.e(7);
            } else {
                cVar.z(7, attachmentsJson);
            }
            String toolCallsJson = messageEntity.getToolCallsJson();
            if (toolCallsJson == null) {
                cVar.e(8);
            } else {
                cVar.z(8, toolCallsJson);
            }
            cVar.z(9, messageEntity.getCreatedAt());
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1271f abstractC1271f) {
            this();
        }

        public final List<InterfaceC1672b> getRequiredConverters() {
            return Y3.v.f9812c;
        }

        private Companion() {
        }
    }

    public MessageDao_Impl(v vVar) {
        AbstractC1276k.f(vVar, "__db");
        this.__db = vVar;
        this.__insertAdapterOfMessageEntity = new AbstractC0281c() { // from class: com.bot.core.database.dao.MessageDao_Impl.1
            @Override // N1.AbstractC0281c
            public String createQuery() {
                return "INSERT OR REPLACE INTO `messages` (`id`,`conversationId`,`role`,`content`,`reasoningContent`,`reasoningDurationMs`,`attachmentsJson`,`toolCallsJson`,`createdAt`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            @Override // N1.AbstractC0281c
            public void bind(c cVar, MessageEntity messageEntity) {
                AbstractC1276k.f(cVar, "statement");
                AbstractC1276k.f(messageEntity, "entity");
                cVar.z(1, messageEntity.getId());
                cVar.z(2, messageEntity.getConversationId());
                cVar.z(3, messageEntity.getRole());
                cVar.z(4, messageEntity.getContent());
                String reasoningContent = messageEntity.getReasoningContent();
                if (reasoningContent == null) {
                    cVar.e(5);
                } else {
                    cVar.z(5, reasoningContent);
                }
                Long reasoningDurationMs = messageEntity.getReasoningDurationMs();
                if (reasoningDurationMs == null) {
                    cVar.e(6);
                } else {
                    cVar.a(reasoningDurationMs.longValue(), 6);
                }
                String attachmentsJson = messageEntity.getAttachmentsJson();
                if (attachmentsJson == null) {
                    cVar.e(7);
                } else {
                    cVar.z(7, attachmentsJson);
                }
                String toolCallsJson = messageEntity.getToolCallsJson();
                if (toolCallsJson == null) {
                    cVar.e(8);
                } else {
                    cVar.z(8, toolCallsJson);
                }
                cVar.z(9, messageEntity.getCreatedAt());
            }
        };
    }

    public static final int countMessages$lambda$3(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            return c02.Z() ? (int) c02.getLong(0) : 0;
        } finally {
            c02.close();
        }
    }

    public static final y deleteByConversationId$lambda$4(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final List getMessages$lambda$1(String str, String str2, int i6, int i7, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            c02.a(i6, 2);
            c02.a(i7, 3);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "conversationId");
            int H6 = d.H(c02, "role");
            int H7 = d.H(c02, "content");
            int H8 = d.H(c02, "reasoningContent");
            int H9 = d.H(c02, "reasoningDurationMs");
            int H10 = d.H(c02, "attachmentsJson");
            int H11 = d.H(c02, "toolCallsJson");
            int H12 = d.H(c02, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                arrayList.add(new MessageEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.M(H7), c02.isNull(H8) ? null : c02.M(H8), c02.isNull(H9) ? null : Long.valueOf(c02.getLong(H9)), c02.isNull(H10) ? null : c02.M(H10), c02.isNull(H11) ? null : c02.M(H11), c02.M(H12)));
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final y insert$lambda$0(MessageDao_Impl messageDao_Impl, MessageEntity messageEntity, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        messageDao_Impl.__insertAdapterOfMessageEntity.insert(aVar, messageEntity);
        return y.a;
    }

    public static final List observeMessages$lambda$2(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "conversationId");
            int H6 = d.H(c02, "role");
            int H7 = d.H(c02, "content");
            int H8 = d.H(c02, "reasoningContent");
            int H9 = d.H(c02, "reasoningDurationMs");
            int H10 = d.H(c02, "attachmentsJson");
            int H11 = d.H(c02, "toolCallsJson");
            int H12 = d.H(c02, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                arrayList.add(new MessageEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.M(H7), c02.isNull(H8) ? null : c02.M(H8), c02.isNull(H9) ? null : Long.valueOf(c02.getLong(H9)), c02.isNull(H10) ? null : c02.M(H10), c02.isNull(H11) ? null : c02.M(H11), c02.M(H12)));
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final y updateMessage$lambda$5(String str, String str2, String str3, Long l3, String str4, String str5, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            if (str3 == null) {
                c02.e(2);
            } else {
                c02.z(2, str3);
            }
            if (l3 == null) {
                c02.e(3);
            } else {
                c02.a(l3.longValue(), 3);
            }
            if (str4 == null) {
                c02.e(4);
            } else {
                c02.z(4, str4);
            }
            c02.z(5, str5);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    @Override // com.bot.core.database.dao.MessageDao
    public Object countMessages(String str, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new b(str, 21), true, false);
    }

    @Override // com.bot.core.database.dao.MessageDao
    public Object deleteByConversationId(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 22), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.MessageDao
    public Object getMessages(String str, int i6, int i7, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new C2018a(str, i6, i7, 1), true, false);
    }

    @Override // com.bot.core.database.dao.MessageDao
    public Object insert(MessageEntity messageEntity, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2022e(2, this, messageEntity), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.MessageDao
    public InterfaceC0007h observeMessages(String str) {
        AbstractC1276k.f(str, "conversationId");
        return e.P(this.__db, new String[]{"messages"}, new b(str, 20));
    }

    @Override // com.bot.core.database.dao.MessageDao
    public Object updateMessage(String str, String str2, String str3, Long l3, String str4, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new J0(str2, str3, l3, str4, str, 5), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }
}
