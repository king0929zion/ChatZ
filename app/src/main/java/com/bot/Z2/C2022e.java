package z2;

import X3.y;
import com.bot.core.database.dao.LLMSettingDao_Impl;
import com.bot.core.database.dao.McpServerDao_Impl;
import com.bot.core.database.dao.MessageDao_Impl;
import com.bot.core.database.entity.LLMSettingEntity;
import com.bot.core.database.entity.McpServerEntity;
import com.bot.core.database.entity.MessageEntity;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2022e implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f16232c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16233e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16234f;

    public /* synthetic */ C2022e(int i6, Object obj, Object obj2) {
        this.f16232c = i6;
        this.f16233e = obj;
        this.f16234f = obj2;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        y upsert$lambda$0;
        switch (this.f16232c) {
            case 0:
                upsert$lambda$0 = LLMSettingDao_Impl.upsert$lambda$0((LLMSettingDao_Impl) this.f16233e, (LLMSettingEntity) this.f16234f, (X1.a) obj);
                return upsert$lambda$0;
            case 1:
                return McpServerDao_Impl.a((McpServerDao_Impl) this.f16233e, (McpServerEntity) this.f16234f, (X1.a) obj);
            default:
                return MessageDao_Impl.c((MessageDao_Impl) this.f16233e, (MessageEntity) this.f16234f, (X1.a) obj);
        }
    }
}
