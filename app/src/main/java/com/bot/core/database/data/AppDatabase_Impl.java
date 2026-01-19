package com.bot.core.database.data;

import A2.e;
import N1.C0286h;
import N1.w;
import X3.a;
import X3.n;
import com.bot.core.database.dao.ConversationDao;
import com.bot.core.database.dao.ConversationDao_Impl;
import com.bot.core.database.dao.LLMProviderDao;
import com.bot.core.database.dao.LLMProviderDao_Impl;
import com.bot.core.database.dao.LLMSettingDao;
import com.bot.core.database.dao.LLMSettingDao_Impl;
import com.bot.core.database.dao.McpServerDao;
import com.bot.core.database.dao.McpServerDao_Impl;
import com.bot.core.database.dao.MessageDao;
import com.bot.core.database.dao.MessageDao_Impl;
import com.bot.core.database.data.AppDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l4.InterfaceC1193a;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public final class AppDatabase_Impl extends AppDatabase {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f11141q = 0;

    /* renamed from: l, reason: collision with root package name */
    public final n f11142l;

    /* renamed from: m, reason: collision with root package name */
    public final n f11143m;

    /* renamed from: n, reason: collision with root package name */
    public final n f11144n;

    /* renamed from: o, reason: collision with root package name */
    public final n f11145o;

    /* renamed from: p, reason: collision with root package name */
    public final n f11146p;

    public AppDatabase_Impl() {
        final int i6 = 0;
        this.f11142l = a.d(new InterfaceC1193a(this) { // from class: A2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f114e;

            {
                this.f114e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i7 = i6;
                AppDatabase_Impl appDatabase_Impl = this.f114e;
                switch (i7) {
                    case 0:
                        int i8 = AppDatabase_Impl.f11141q;
                        return new ConversationDao_Impl(appDatabase_Impl);
                    case 1:
                        int i9 = AppDatabase_Impl.f11141q;
                        return new MessageDao_Impl(appDatabase_Impl);
                    case 2:
                        int i10 = AppDatabase_Impl.f11141q;
                        return new LLMProviderDao_Impl(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.f11141q;
                        return new LLMSettingDao_Impl(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.f11141q;
                        return new McpServerDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i7 = 1;
        this.f11143m = a.d(new InterfaceC1193a(this) { // from class: A2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f114e;

            {
                this.f114e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72 = i7;
                AppDatabase_Impl appDatabase_Impl = this.f114e;
                switch (i72) {
                    case 0:
                        int i8 = AppDatabase_Impl.f11141q;
                        return new ConversationDao_Impl(appDatabase_Impl);
                    case 1:
                        int i9 = AppDatabase_Impl.f11141q;
                        return new MessageDao_Impl(appDatabase_Impl);
                    case 2:
                        int i10 = AppDatabase_Impl.f11141q;
                        return new LLMProviderDao_Impl(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.f11141q;
                        return new LLMSettingDao_Impl(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.f11141q;
                        return new McpServerDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i8 = 2;
        this.f11144n = a.d(new InterfaceC1193a(this) { // from class: A2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f114e;

            {
                this.f114e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72 = i8;
                AppDatabase_Impl appDatabase_Impl = this.f114e;
                switch (i72) {
                    case 0:
                        int i82 = AppDatabase_Impl.f11141q;
                        return new ConversationDao_Impl(appDatabase_Impl);
                    case 1:
                        int i9 = AppDatabase_Impl.f11141q;
                        return new MessageDao_Impl(appDatabase_Impl);
                    case 2:
                        int i10 = AppDatabase_Impl.f11141q;
                        return new LLMProviderDao_Impl(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.f11141q;
                        return new LLMSettingDao_Impl(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.f11141q;
                        return new McpServerDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i9 = 3;
        this.f11145o = a.d(new InterfaceC1193a(this) { // from class: A2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f114e;

            {
                this.f114e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72 = i9;
                AppDatabase_Impl appDatabase_Impl = this.f114e;
                switch (i72) {
                    case 0:
                        int i82 = AppDatabase_Impl.f11141q;
                        return new ConversationDao_Impl(appDatabase_Impl);
                    case 1:
                        int i92 = AppDatabase_Impl.f11141q;
                        return new MessageDao_Impl(appDatabase_Impl);
                    case 2:
                        int i10 = AppDatabase_Impl.f11141q;
                        return new LLMProviderDao_Impl(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.f11141q;
                        return new LLMSettingDao_Impl(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.f11141q;
                        return new McpServerDao_Impl(appDatabase_Impl);
                }
            }
        });
        final int i10 = 4;
        this.f11146p = a.d(new InterfaceC1193a(this) { // from class: A2.d

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ AppDatabase_Impl f114e;

            {
                this.f114e = this;
            }

            @Override // l4.InterfaceC1193a
            public final Object b() {
                int i72 = i10;
                AppDatabase_Impl appDatabase_Impl = this.f114e;
                switch (i72) {
                    case 0:
                        int i82 = AppDatabase_Impl.f11141q;
                        return new ConversationDao_Impl(appDatabase_Impl);
                    case 1:
                        int i92 = AppDatabase_Impl.f11141q;
                        return new MessageDao_Impl(appDatabase_Impl);
                    case 2:
                        int i102 = AppDatabase_Impl.f11141q;
                        return new LLMProviderDao_Impl(appDatabase_Impl);
                    case 3:
                        int i11 = AppDatabase_Impl.f11141q;
                        return new LLMSettingDao_Impl(appDatabase_Impl);
                    default:
                        int i12 = AppDatabase_Impl.f11141q;
                        return new McpServerDao_Impl(appDatabase_Impl);
                }
            }
        });
    }

    @Override // N1.v
    public final List a(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // N1.v
    public final C0286h b() {
        return new C0286h(this, new LinkedHashMap(), new LinkedHashMap(), "conversations", "messages", "llm_providers", "bot", "mcp_servers");
    }

    @Override // N1.v
    public final w c() {
        return new e(this);
    }

    @Override // N1.v
    public final Set e() {
        return new LinkedHashSet();
    }

    @Override // N1.v
    public final LinkedHashMap f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AbstractC1289x.a(ConversationDao.class), ConversationDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC1289x.a(MessageDao.class), MessageDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC1289x.a(LLMProviderDao.class), LLMProviderDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC1289x.a(LLMSettingDao.class), LLMSettingDao_Impl.Companion.getRequiredConverters());
        linkedHashMap.put(AbstractC1289x.a(McpServerDao.class), McpServerDao_Impl.Companion.getRequiredConverters());
        return linkedHashMap;
    }

    @Override // com.bot.core.database.data.AppDatabase
    public final ConversationDao j() {
        return (ConversationDao) this.f11142l.getValue();
    }

    @Override // com.bot.core.database.data.AppDatabase
    public final LLMProviderDao k() {
        return (LLMProviderDao) this.f11144n.getValue();
    }

    @Override // com.bot.core.database.data.AppDatabase
    public final LLMSettingDao l() {
        return (LLMSettingDao) this.f11145o.getValue();
    }

    @Override // com.bot.core.database.data.AppDatabase
    public final McpServerDao m() {
        return (McpServerDao) this.f11146p.getValue();
    }

    @Override // com.bot.core.database.data.AppDatabase
    public final MessageDao n() {
        return (MessageDao) this.f11143m.getValue();
    }
}
