package M2;

import S2.C0588u;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.bot.core.database.dao.LLMProviderDao_Impl;
import com.bot.core.database.dao.LLMSettingDao_Impl;
import com.bot.core.database.dao.McpServerDao_Impl;
import com.bot.core.database.dao.MessageDao_Impl;
import com.bot.core.database.entity.ConversationEntity;
import com.bot.core.database.entity.LLMProviderEntity;
import com.bot.core.database.entity.LLMSettingEntity;
import com.bot.core.database.entity.McpServerEntity;
import com.vladsch.flexmark.parser.PegdownExtensions;
import java.util.List;
import m4.AbstractC1276k;
import u4.AbstractC1776n;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3279c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f3280e;

    public /* synthetic */ b(String str, int i6) {
        this.f3279c = i6;
        this.f3280e = str;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        X3.y deleteConversation$lambda$6;
        ConversationEntity conversation$lambda$2;
        LLMProviderEntity byId$lambda$4;
        X3.y delete$lambda$10;
        X3.y active$lambda$5;
        X3.y deleteById$lambda$6;
        LLMSettingEntity byId$lambda$1;
        McpServerEntity byId$lambda$2;
        X3.y delete$lambda$3;
        List observeMessages$lambda$2;
        int countMessages$lambda$3;
        X3.y deleteByConversationId$lambda$4;
        int i6 = this.f3279c;
        X3.y yVar = X3.y.a;
        String str = this.f3280e;
        switch (i6) {
            case 0:
                AbstractC1276k.f((A) obj, "it");
                return new A(str, 494);
            case 1:
                P0.v.c((P0.x) obj, str);
                return yVar;
            case 2:
                P0.v.d((P0.x) obj, str);
                return yVar;
            case 3:
                P0.x xVar = (P0.x) obj;
                P0.v.c(xVar, str);
                P0.v.e(xVar, 5);
                return yVar;
            case 4:
                P0.x xVar2 = (P0.x) obj;
                P0.v.d(xVar2, str);
                P0.w wVar = P0.t.f4541t;
                s4.e eVar = P0.v.a[11];
                xVar2.a(wVar, Float.valueOf(S.l.f7374V));
                return yVar;
            case AbstractC1787b.f15290g /* 5 */:
                P0.x xVar3 = (P0.x) obj;
                s4.e[] eVarArr = P0.v.a;
                P0.w wVar2 = P0.t.f4531j;
                s4.e eVar2 = P0.v.a[3];
                xVar3.a(wVar2, new P0.f(1));
                P0.v.d(xVar3, str);
                return yVar;
            case 6:
                s4.e[] eVarArr2 = P0.v.a;
                ((P0.x) obj).a(P0.t.f4518L, str);
                return yVar;
            case 7:
                C0588u c0588u = (C0588u) obj;
                AbstractC1276k.f(c0588u, "webView");
                Object tag = c0588u.getTag();
                String str2 = this.f3280e;
                if (!AbstractC1276k.b(tag, str2)) {
                    c0588u.setTag(str2);
                    c0588u.loadDataWithBaseURL("file:///android_asset/", str2, "text/html", "utf-8", null);
                }
                return yVar;
            case 8:
                P0.x xVar4 = (P0.x) obj;
                P0.v.c(xVar4, str);
                P0.v.e(xVar4, 5);
                return yVar;
            case AbstractC1787b.f15287d /* 9 */:
                P0.x xVar5 = (P0.x) obj;
                P0.v.c(xVar5, str);
                P0.v.e(xVar5, 5);
                return yVar;
            case AbstractC1787b.f15289f /* 10 */:
                String str3 = (String) obj;
                AbstractC1276k.f(str3, "it");
                return AbstractC1776n.Q(str3) ? str3.length() < str.length() ? str : str3 : B3.e.n(str, str3);
            case 11:
                deleteConversation$lambda$6 = ConversationDao_Impl.deleteConversation$lambda$6("DELETE FROM conversations WHERE id = ?", str, (X1.a) obj);
                return deleteConversation$lambda$6;
            case 12:
                conversation$lambda$2 = ConversationDao_Impl.getConversation$lambda$2("SELECT * FROM conversations WHERE id = ? LIMIT 1", str, (X1.a) obj);
                return conversation$lambda$2;
            case 13:
                byId$lambda$4 = LLMProviderDao_Impl.getById$lambda$4("SELECT * FROM llm_providers WHERE id = ? LIMIT 1", str, (X1.a) obj);
                return byId$lambda$4;
            case 14:
                delete$lambda$10 = LLMProviderDao_Impl.delete$lambda$10("DELETE FROM llm_providers WHERE id = ?", str, (X1.a) obj);
                return delete$lambda$10;
            case 15:
                active$lambda$5 = LLMSettingDao_Impl.setActive$lambda$5("UPDATE bot SET isActive = CASE WHEN id = ? THEN 1 ELSE 0 END", str, (X1.a) obj);
                return active$lambda$5;
            case PegdownExtensions.AUTOLINKS /* 16 */:
                deleteById$lambda$6 = LLMSettingDao_Impl.deleteById$lambda$6("DELETE FROM bot WHERE id = ?", str, (X1.a) obj);
                return deleteById$lambda$6;
            case 17:
                byId$lambda$1 = LLMSettingDao_Impl.getById$lambda$1("SELECT * FROM bot WHERE id = ? LIMIT 1", str, (X1.a) obj);
                return byId$lambda$1;
            case 18:
                byId$lambda$2 = McpServerDao_Impl.getById$lambda$2("SELECT * FROM mcp_servers WHERE id = ? LIMIT 1", str, (X1.a) obj);
                return byId$lambda$2;
            case 19:
                delete$lambda$3 = McpServerDao_Impl.delete$lambda$3("DELETE FROM mcp_servers WHERE id = ?", str, (X1.a) obj);
                return delete$lambda$3;
            case 20:
                observeMessages$lambda$2 = MessageDao_Impl.observeMessages$lambda$2("\n        SELECT * FROM messages\n        WHERE conversationId = ?\n        ORDER BY createdAt ASC\n    ", str, (X1.a) obj);
                return observeMessages$lambda$2;
            case 21:
                countMessages$lambda$3 = MessageDao_Impl.countMessages$lambda$3("SELECT COUNT(*) FROM messages WHERE conversationId = ?", str, (X1.a) obj);
                return Integer.valueOf(countMessages$lambda$3);
            default:
                deleteByConversationId$lambda$4 = MessageDao_Impl.deleteByConversationId$lambda$4("DELETE FROM messages WHERE conversationId = ?", str, (X1.a) obj);
                return deleteByConversationId$lambda$4;
        }
    }
}
