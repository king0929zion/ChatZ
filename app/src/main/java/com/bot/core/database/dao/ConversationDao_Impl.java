package com.bot.core.database.dao;

import D.C0079l0;
import D.C0091s;
import M2.b;
import N1.AbstractC0281c;
import N1.v;
import X1.a;
import X1.c;
import X3.y;
import Y4.d;
import Z2.X;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.bot.core.database.entity.ConversationEntity;
import com.vladsch.flexmark.util.html.Attribute;
import h5.e;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1271f;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;
import z2.C2018a;

/* loaded from: classes.dex */
public final class ConversationDao_Impl implements ConversationDao {
    private final v __db;
    private final AbstractC0281c __insertAdapterOfConversationEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.bot.core.database.dao.ConversationDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0281c {
        @Override // N1.AbstractC0281c
        public String createQuery() {
            return "INSERT OR REPLACE INTO `conversations` (`id`,`title`,`modelName`,`systemPrompt`,`isArchived`,`isFavorited`,`createdAt`,`updatedAt`,`lastMessageAt`,`messageCount`,`totalTokens`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // N1.AbstractC0281c
        public void bind(c cVar, ConversationEntity conversationEntity) {
            AbstractC1276k.f(cVar, "statement");
            AbstractC1276k.f(conversationEntity, "entity");
            cVar.z(1, conversationEntity.getId());
            cVar.z(2, conversationEntity.getTitle());
            cVar.z(3, conversationEntity.getModelName());
            String systemPrompt = conversationEntity.getSystemPrompt();
            if (systemPrompt == null) {
                cVar.e(4);
            } else {
                cVar.z(4, systemPrompt);
            }
            cVar.a(conversationEntity.isArchived() ? 1L : 0L, 5);
            cVar.a(conversationEntity.isFavorited() ? 1L : 0L, 6);
            cVar.z(7, conversationEntity.getCreatedAt());
            cVar.z(8, conversationEntity.getUpdatedAt());
            String lastMessageAt = conversationEntity.getLastMessageAt();
            if (lastMessageAt == null) {
                cVar.e(9);
            } else {
                cVar.z(9, lastMessageAt);
            }
            cVar.a(conversationEntity.getMessageCount(), 10);
            cVar.a(conversationEntity.getTotalTokens(), 11);
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

    public ConversationDao_Impl(v vVar) {
        AbstractC1276k.f(vVar, "__db");
        this.__db = vVar;
        this.__insertAdapterOfConversationEntity = new AbstractC0281c() { // from class: com.bot.core.database.dao.ConversationDao_Impl.1
            @Override // N1.AbstractC0281c
            public String createQuery() {
                return "INSERT OR REPLACE INTO `conversations` (`id`,`title`,`modelName`,`systemPrompt`,`isArchived`,`isFavorited`,`createdAt`,`updatedAt`,`lastMessageAt`,`messageCount`,`totalTokens`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // N1.AbstractC0281c
            public void bind(c cVar, ConversationEntity conversationEntity) {
                AbstractC1276k.f(cVar, "statement");
                AbstractC1276k.f(conversationEntity, "entity");
                cVar.z(1, conversationEntity.getId());
                cVar.z(2, conversationEntity.getTitle());
                cVar.z(3, conversationEntity.getModelName());
                String systemPrompt = conversationEntity.getSystemPrompt();
                if (systemPrompt == null) {
                    cVar.e(4);
                } else {
                    cVar.z(4, systemPrompt);
                }
                cVar.a(conversationEntity.isArchived() ? 1L : 0L, 5);
                cVar.a(conversationEntity.isFavorited() ? 1L : 0L, 6);
                cVar.z(7, conversationEntity.getCreatedAt());
                cVar.z(8, conversationEntity.getUpdatedAt());
                String lastMessageAt = conversationEntity.getLastMessageAt();
                if (lastMessageAt == null) {
                    cVar.e(9);
                } else {
                    cVar.z(9, lastMessageAt);
                }
                cVar.a(conversationEntity.getMessageCount(), 10);
                cVar.a(conversationEntity.getTotalTokens(), 11);
            }
        };
    }

    public static final y deleteConversation$lambda$6(String str, String str2, a aVar) {
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

    public static final ConversationEntity getConversation$lambda$2(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.TITLE_ATTR);
            int H6 = d.H(c02, "modelName");
            int H7 = d.H(c02, "systemPrompt");
            int H8 = d.H(c02, "isArchived");
            int H9 = d.H(c02, "isFavorited");
            int H10 = d.H(c02, "createdAt");
            int H11 = d.H(c02, "updatedAt");
            int H12 = d.H(c02, "lastMessageAt");
            int H13 = d.H(c02, "messageCount");
            int H14 = d.H(c02, "totalTokens");
            ConversationEntity conversationEntity = null;
            if (c02.Z()) {
                conversationEntity = new ConversationEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.isNull(H7) ? null : c02.M(H7), ((int) c02.getLong(H8)) != 0, ((int) c02.getLong(H9)) != 0, c02.M(H10), c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), (int) c02.getLong(H13), (int) c02.getLong(H14));
            }
            return conversationEntity;
        } finally {
            c02.close();
        }
    }

    public static final List getConversations$lambda$1(String str, int i6, int i7, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.a(i6, 1);
            c02.a(i7, 2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.TITLE_ATTR);
            int H6 = d.H(c02, "modelName");
            int H7 = d.H(c02, "systemPrompt");
            int H8 = d.H(c02, "isArchived");
            int H9 = d.H(c02, "isFavorited");
            int H10 = d.H(c02, "createdAt");
            int H11 = d.H(c02, "updatedAt");
            int H12 = d.H(c02, "lastMessageAt");
            int H13 = d.H(c02, "messageCount");
            int H14 = d.H(c02, "totalTokens");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                int i8 = H3;
                int i9 = H5;
                int i10 = H6;
                arrayList.add(new ConversationEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.isNull(H7) ? null : c02.M(H7), ((int) c02.getLong(H8)) != 0, ((int) c02.getLong(H9)) != 0, c02.M(H10), c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), (int) c02.getLong(H13), (int) c02.getLong(H14)));
                H3 = i8;
                H5 = i9;
                H6 = i10;
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final List searchConversations$lambda$3(String str, String str2, int i6, int i7, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            c02.z(2, str2);
            c02.a(i6, 3);
            c02.a(i7, 4);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.TITLE_ATTR);
            int H6 = d.H(c02, "modelName");
            int H7 = d.H(c02, "systemPrompt");
            int H8 = d.H(c02, "isArchived");
            int H9 = d.H(c02, "isFavorited");
            int H10 = d.H(c02, "createdAt");
            int H11 = d.H(c02, "updatedAt");
            int H12 = d.H(c02, "lastMessageAt");
            int H13 = d.H(c02, "messageCount");
            int H14 = d.H(c02, "totalTokens");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                int i8 = H5;
                int i9 = H6;
                arrayList.add(new ConversationEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.isNull(H7) ? null : c02.M(H7), ((int) c02.getLong(H8)) != 0, ((int) c02.getLong(H9)) != 0, c02.M(H10), c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), (int) c02.getLong(H13), (int) c02.getLong(H14)));
                H5 = i8;
                H6 = i9;
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final y updateStats$lambda$5(String str, String str2, String str3, int i6, String str4, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            if (str2 == null) {
                c02.e(1);
            } else {
                c02.z(1, str2);
            }
            c02.z(2, str3);
            c02.a(i6, 3);
            c02.z(4, str4);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y updateTitle$lambda$4(String str, String str2, String str3, String str4, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            c02.z(2, str3);
            c02.z(3, str4);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y upsert$lambda$0(ConversationDao_Impl conversationDao_Impl, ConversationEntity conversationEntity, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        conversationDao_Impl.__insertAdapterOfConversationEntity.insert(aVar, conversationEntity);
        return y.a;
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object deleteConversation(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 11), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object getConversation(String str, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new b(str, 12), true, false);
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object getConversations(final int i6, final int i7, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new l4.c() { // from class: z2.b
            @Override // l4.c
            public final Object f(Object obj) {
                List conversations$lambda$1;
                conversations$lambda$1 = ConversationDao_Impl.getConversations$lambda$1("SELECT * FROM conversations ORDER BY updatedAt DESC LIMIT ? OFFSET ?", i6, i7, (X1.a) obj);
                return conversations$lambda$1;
            }
        }, true, false);
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object searchConversations(String str, int i6, int i7, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new C2018a(str, i6, i7, 0), true, false);
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object updateStats(String str, String str2, String str3, int i6, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C0079l0(str2, str3, i6, str, 4), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object updateTitle(String str, String str2, String str3, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C0091s(str2, str3, str, 24), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.ConversationDao
    public Object upsert(ConversationEntity conversationEntity, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new X(27, this, conversationEntity), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }
}
