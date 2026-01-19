package A2;

import H0.C0162q;
import I3.I;
import N1.C0286h;
import N1.C0290l;
import N1.Q;
import N1.w;
import T1.f;
import T1.h;
import T1.i;
import Y3.C;
import Y4.l;
import com.bot.core.database.data.AppDatabase_Impl;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.util.html.Attribute;
import i4.AbstractC1120d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;
import m4.AbstractC1276k;
import u4.u;

/* loaded from: classes.dex */
public final class e extends w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppDatabase_Impl f115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AppDatabase_Impl appDatabase_Impl) {
        super("caf1c67d70aaf0012ff7f4d715f1467f", 35, "12b76c3743d2e2503ea6313bcf017b67");
        this.f115d = appDatabase_Impl;
    }

    @Override // N1.w
    public final void a(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        h5.e.S("CREATE TABLE IF NOT EXISTS `conversations` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `modelName` TEXT NOT NULL, `systemPrompt` TEXT, `isArchived` INTEGER NOT NULL, `isFavorited` INTEGER NOT NULL, `createdAt` TEXT NOT NULL, `updatedAt` TEXT NOT NULL, `lastMessageAt` TEXT, `messageCount` INTEGER NOT NULL, `totalTokens` INTEGER NOT NULL, PRIMARY KEY(`id`))", aVar);
        h5.e.S("CREATE TABLE IF NOT EXISTS `messages` (`id` TEXT NOT NULL, `conversationId` TEXT NOT NULL, `role` TEXT NOT NULL, `content` TEXT NOT NULL, `reasoningContent` TEXT, `reasoningDurationMs` INTEGER, `attachmentsJson` TEXT, `toolCallsJson` TEXT, `createdAt` TEXT NOT NULL, PRIMARY KEY(`id`))", aVar);
        h5.e.S("CREATE INDEX IF NOT EXISTS `index_messages_conversationId` ON `messages` (`conversationId`)", aVar);
        h5.e.S("CREATE INDEX IF NOT EXISTS `index_messages_createdAt` ON `messages` (`createdAt`)", aVar);
        h5.e.S("CREATE TABLE IF NOT EXISTS `llm_providers` (`id` TEXT NOT NULL, `providerType` TEXT NOT NULL, `name` TEXT NOT NULL, `baseUrl` TEXT NOT NULL, `apiSchema` TEXT NOT NULL, `openAiApiMode` TEXT NOT NULL, `googleApiMode` TEXT NOT NULL, `googleProjectId` TEXT, `googleLocation` TEXT, `isBuiltin` INTEGER NOT NULL, `isEnabled` INTEGER NOT NULL, `apiKey` TEXT, `enabledModelIds` TEXT, `sortOrder` INTEGER NOT NULL, PRIMARY KEY(`id`))", aVar);
        h5.e.S("CREATE TABLE IF NOT EXISTS `bot` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `defaultModel` TEXT, `prompt` TEXT, `temperature` REAL NOT NULL, `topP` REAL NOT NULL, `maxOutputTokens` INTEGER, `reasoningBudgetTokens` INTEGER, `customHeadersJson` TEXT, `customBodyJson` TEXT, `avatarUri` TEXT, `createdAt` INTEGER NOT NULL, `sortOrder` INTEGER NOT NULL, `isActive` INTEGER NOT NULL, PRIMARY KEY(`id`))", aVar);
        h5.e.S("CREATE TABLE IF NOT EXISTS `mcp_servers` (`id` TEXT NOT NULL, `isEnabled` INTEGER NOT NULL, `name` TEXT NOT NULL, `transportType` TEXT NOT NULL, `serverAddress` TEXT NOT NULL, `headersJson` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, PRIMARY KEY(`id`))", aVar);
        h5.e.S("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", aVar);
        h5.e.S("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'caf1c67d70aaf0012ff7f4d715f1467f')", aVar);
    }

    @Override // N1.w
    public final void b(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        h5.e.S("DROP TABLE IF EXISTS `conversations`", aVar);
        h5.e.S("DROP TABLE IF EXISTS `messages`", aVar);
        h5.e.S("DROP TABLE IF EXISTS `llm_providers`", aVar);
        h5.e.S("DROP TABLE IF EXISTS `bot`", aVar);
        h5.e.S("DROP TABLE IF EXISTS `mcp_servers`", aVar);
    }

    @Override // N1.w
    public final void c(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
    }

    @Override // N1.w
    public final void d(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        AppDatabase_Impl appDatabase_Impl = this.f115d;
        int i6 = AppDatabase_Impl.f11141q;
        C0286h d6 = appDatabase_Impl.d();
        Q q3 = d6.f3744b;
        q3.getClass();
        X1.c c02 = aVar.c0("PRAGMA query_only");
        try {
            c02.Z();
            boolean z5 = c02.getLong(0) != 0;
            AbstractC1120d.h(c02, null);
            if (!z5) {
                h5.e.S("PRAGMA temp_store = MEMORY", aVar);
                h5.e.S("PRAGMA recursive_triggers = 1", aVar);
                h5.e.S("DROP TABLE IF EXISTS room_table_modification_log", aVar);
                if (q3.f3711d) {
                    h5.e.S("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", aVar);
                } else {
                    h5.e.S(u.B("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", FlexmarkHtmlConverter.DEFAULT_NODE, false), aVar);
                }
                C0290l c0290l = q3.f3715h;
                ReentrantLock reentrantLock = (ReentrantLock) c0290l.f3755b;
                reentrantLock.lock();
                try {
                    c0290l.a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (d6.f3749g) {
            }
        } finally {
        }
    }

    @Override // N1.w
    public final void e(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
    }

    @Override // N1.w
    public final void f(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        Z3.b w5 = l.w();
        X1.c c02 = aVar.c0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (c02.Z()) {
            try {
                w5.add(c02.M(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1120d.h(c02, th);
                    throw th2;
                }
            }
        }
        AbstractC1120d.h(c02, null);
        ListIterator listIterator = l.p(w5).listIterator(0);
        while (true) {
            C0162q c0162q = (C0162q) listIterator;
            if (!c0162q.hasNext()) {
                return;
            }
            String str = (String) c0162q.next();
            if (u.D(str, "room_fts_content_sync_", false)) {
                h5.e.S("DROP TRIGGER IF EXISTS ".concat(str), aVar);
            }
        }
    }

    @Override // N1.w
    public final I g(X1.a aVar) {
        AbstractC1276k.f(aVar, "connection");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Attribute.ID_ATTR, new f(Attribute.ID_ATTR, "TEXT", true, 1, null, 1));
        linkedHashMap.put(Attribute.TITLE_ATTR, new f(Attribute.TITLE_ATTR, "TEXT", true, 0, null, 1));
        linkedHashMap.put("modelName", new f("modelName", "TEXT", true, 0, null, 1));
        linkedHashMap.put("systemPrompt", new f("systemPrompt", "TEXT", false, 0, null, 1));
        linkedHashMap.put("isArchived", new f("isArchived", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("isFavorited", new f("isFavorited", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("createdAt", new f("createdAt", "TEXT", true, 0, null, 1));
        linkedHashMap.put("updatedAt", new f("updatedAt", "TEXT", true, 0, null, 1));
        linkedHashMap.put("lastMessageAt", new f("lastMessageAt", "TEXT", false, 0, null, 1));
        linkedHashMap.put("messageCount", new f("messageCount", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("totalTokens", new f("totalTokens", "INTEGER", true, 0, null, 1));
        i iVar = new i("conversations", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        i P5 = C.P("conversations", aVar);
        if (!iVar.equals(P5)) {
            return new I("conversations(com.bot.core.database.entity.ConversationEntity).\n Expected:\n" + iVar + "\n Found:\n" + P5, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put(Attribute.ID_ATTR, new f(Attribute.ID_ATTR, "TEXT", true, 1, null, 1));
        linkedHashMap2.put("conversationId", new f("conversationId", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("role", new f("role", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("content", new f("content", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("reasoningContent", new f("reasoningContent", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("reasoningDurationMs", new f("reasoningDurationMs", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("attachmentsJson", new f("attachmentsJson", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("toolCallsJson", new f("toolCallsJson", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("createdAt", new f("createdAt", "TEXT", true, 0, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new h("index_messages_conversationId", false, l.H("conversationId"), l.H("ASC")));
        linkedHashSet2.add(new h("index_messages_createdAt", false, l.H("createdAt"), l.H("ASC")));
        i iVar2 = new i("messages", linkedHashMap2, linkedHashSet, linkedHashSet2);
        i P6 = C.P("messages", aVar);
        if (!iVar2.equals(P6)) {
            return new I("messages(com.bot.core.database.entity.MessageEntity).\n Expected:\n" + iVar2 + "\n Found:\n" + P6, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(Attribute.ID_ATTR, new f(Attribute.ID_ATTR, "TEXT", true, 1, null, 1));
        linkedHashMap3.put("providerType", new f("providerType", "TEXT", true, 0, null, 1));
        linkedHashMap3.put(Attribute.NAME_ATTR, new f(Attribute.NAME_ATTR, "TEXT", true, 0, null, 1));
        linkedHashMap3.put("baseUrl", new f("baseUrl", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("apiSchema", new f("apiSchema", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("openAiApiMode", new f("openAiApiMode", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("googleApiMode", new f("googleApiMode", "TEXT", true, 0, null, 1));
        linkedHashMap3.put("googleProjectId", new f("googleProjectId", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("googleLocation", new f("googleLocation", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("isBuiltin", new f("isBuiltin", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("isEnabled", new f("isEnabled", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("apiKey", new f("apiKey", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("enabledModelIds", new f("enabledModelIds", "TEXT", false, 0, null, 1));
        linkedHashMap3.put("sortOrder", new f("sortOrder", "INTEGER", true, 0, null, 1));
        i iVar3 = new i("llm_providers", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        i P7 = C.P("llm_providers", aVar);
        if (!iVar3.equals(P7)) {
            return new I("llm_providers(com.bot.core.database.entity.LLMProviderEntity).\n Expected:\n" + iVar3 + "\n Found:\n" + P7, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put(Attribute.ID_ATTR, new f(Attribute.ID_ATTR, "TEXT", true, 1, null, 1));
        linkedHashMap4.put(Attribute.NAME_ATTR, new f(Attribute.NAME_ATTR, "TEXT", true, 0, null, 1));
        linkedHashMap4.put("defaultModel", new f("defaultModel", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("prompt", new f("prompt", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("temperature", new f("temperature", "REAL", true, 0, null, 1));
        linkedHashMap4.put("topP", new f("topP", "REAL", true, 0, null, 1));
        linkedHashMap4.put("maxOutputTokens", new f("maxOutputTokens", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("reasoningBudgetTokens", new f("reasoningBudgetTokens", "INTEGER", false, 0, null, 1));
        linkedHashMap4.put("customHeadersJson", new f("customHeadersJson", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("customBodyJson", new f("customBodyJson", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("avatarUri", new f("avatarUri", "TEXT", false, 0, null, 1));
        linkedHashMap4.put("createdAt", new f("createdAt", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("sortOrder", new f("sortOrder", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("isActive", new f("isActive", "INTEGER", true, 0, null, 1));
        i iVar4 = new i("bot", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        i P8 = C.P("bot", aVar);
        if (!iVar4.equals(P8)) {
            return new I("bot(com.bot.core.database.entity.LLMSettingEntity).\n Expected:\n" + iVar4 + "\n Found:\n" + P8, false);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put(Attribute.ID_ATTR, new f(Attribute.ID_ATTR, "TEXT", true, 1, null, 1));
        linkedHashMap5.put("isEnabled", new f("isEnabled", "INTEGER", true, 0, null, 1));
        linkedHashMap5.put(Attribute.NAME_ATTR, new f(Attribute.NAME_ATTR, "TEXT", true, 0, null, 1));
        linkedHashMap5.put("transportType", new f("transportType", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("serverAddress", new f("serverAddress", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("headersJson", new f("headersJson", "TEXT", true, 0, null, 1));
        linkedHashMap5.put("createdAt", new f("createdAt", "INTEGER", true, 0, null, 1));
        i iVar5 = new i("mcp_servers", linkedHashMap5, new LinkedHashSet(), new LinkedHashSet());
        i P9 = C.P("mcp_servers", aVar);
        if (iVar5.equals(P9)) {
            return new I(null, true);
        }
        return new I("mcp_servers(com.bot.core.database.entity.McpServerEntity).\n Expected:\n" + iVar5 + "\n Found:\n" + P9, false);
    }
}
