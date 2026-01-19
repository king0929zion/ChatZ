package com.bot.core.database.dao;

import M2.b;
import N1.AbstractC0281c;
import N1.v;
import X1.a;
import X1.c;
import X3.y;
import Y4.d;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.entity.LLMSettingEntity;
import com.vladsch.flexmark.util.html.Attribute;
import h5.e;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1271f;
import m4.AbstractC1276k;
import p.O0;
import s4.InterfaceC1672b;
import z2.C2020c;
import z2.C2022e;

/* loaded from: classes.dex */
public final class LLMSettingDao_Impl implements LLMSettingDao {
    private final v __db;
    private final AbstractC0281c __insertAdapterOfLLMSettingEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.bot.core.database.dao.LLMSettingDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0281c {
        @Override // N1.AbstractC0281c
        public String createQuery() {
            return "INSERT OR REPLACE INTO `bot` (`id`,`name`,`defaultModel`,`prompt`,`temperature`,`topP`,`maxOutputTokens`,`reasoningBudgetTokens`,`customHeadersJson`,`customBodyJson`,`avatarUri`,`createdAt`,`sortOrder`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // N1.AbstractC0281c
        public void bind(c cVar, LLMSettingEntity lLMSettingEntity) {
            AbstractC1276k.f(cVar, "statement");
            AbstractC1276k.f(lLMSettingEntity, "entity");
            cVar.z(1, lLMSettingEntity.getId());
            cVar.z(2, lLMSettingEntity.getName());
            String defaultModel = lLMSettingEntity.getDefaultModel();
            if (defaultModel == null) {
                cVar.e(3);
            } else {
                cVar.z(3, defaultModel);
            }
            String prompt = lLMSettingEntity.getPrompt();
            if (prompt == null) {
                cVar.e(4);
            } else {
                cVar.z(4, prompt);
            }
            cVar.b(lLMSettingEntity.getTemperature(), 5);
            cVar.b(lLMSettingEntity.getTopP(), 6);
            if (lLMSettingEntity.getMaxOutputTokens() == null) {
                cVar.e(7);
            } else {
                cVar.a(r0.intValue(), 7);
            }
            if (lLMSettingEntity.getReasoningBudgetTokens() == null) {
                cVar.e(8);
            } else {
                cVar.a(r0.intValue(), 8);
            }
            String customHeadersJson = lLMSettingEntity.getCustomHeadersJson();
            if (customHeadersJson == null) {
                cVar.e(9);
            } else {
                cVar.z(9, customHeadersJson);
            }
            String customBodyJson = lLMSettingEntity.getCustomBodyJson();
            if (customBodyJson == null) {
                cVar.e(10);
            } else {
                cVar.z(10, customBodyJson);
            }
            String avatarUri = lLMSettingEntity.getAvatarUri();
            if (avatarUri == null) {
                cVar.e(11);
            } else {
                cVar.z(11, avatarUri);
            }
            cVar.a(lLMSettingEntity.getCreatedAt(), 12);
            cVar.a(lLMSettingEntity.getSortOrder(), 13);
            cVar.a(lLMSettingEntity.isActive() ? 1L : 0L, 14);
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

    public LLMSettingDao_Impl(v vVar) {
        AbstractC1276k.f(vVar, "__db");
        this.__db = vVar;
        this.__insertAdapterOfLLMSettingEntity = new AbstractC0281c() { // from class: com.bot.core.database.dao.LLMSettingDao_Impl.1
            @Override // N1.AbstractC0281c
            public String createQuery() {
                return "INSERT OR REPLACE INTO `bot` (`id`,`name`,`defaultModel`,`prompt`,`temperature`,`topP`,`maxOutputTokens`,`reasoningBudgetTokens`,`customHeadersJson`,`customBodyJson`,`avatarUri`,`createdAt`,`sortOrder`,`isActive`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // N1.AbstractC0281c
            public void bind(c cVar, LLMSettingEntity lLMSettingEntity) {
                AbstractC1276k.f(cVar, "statement");
                AbstractC1276k.f(lLMSettingEntity, "entity");
                cVar.z(1, lLMSettingEntity.getId());
                cVar.z(2, lLMSettingEntity.getName());
                String defaultModel = lLMSettingEntity.getDefaultModel();
                if (defaultModel == null) {
                    cVar.e(3);
                } else {
                    cVar.z(3, defaultModel);
                }
                String prompt = lLMSettingEntity.getPrompt();
                if (prompt == null) {
                    cVar.e(4);
                } else {
                    cVar.z(4, prompt);
                }
                cVar.b(lLMSettingEntity.getTemperature(), 5);
                cVar.b(lLMSettingEntity.getTopP(), 6);
                if (lLMSettingEntity.getMaxOutputTokens() == null) {
                    cVar.e(7);
                } else {
                    cVar.a(r0.intValue(), 7);
                }
                if (lLMSettingEntity.getReasoningBudgetTokens() == null) {
                    cVar.e(8);
                } else {
                    cVar.a(r0.intValue(), 8);
                }
                String customHeadersJson = lLMSettingEntity.getCustomHeadersJson();
                if (customHeadersJson == null) {
                    cVar.e(9);
                } else {
                    cVar.z(9, customHeadersJson);
                }
                String customBodyJson = lLMSettingEntity.getCustomBodyJson();
                if (customBodyJson == null) {
                    cVar.e(10);
                } else {
                    cVar.z(10, customBodyJson);
                }
                String avatarUri = lLMSettingEntity.getAvatarUri();
                if (avatarUri == null) {
                    cVar.e(11);
                } else {
                    cVar.z(11, avatarUri);
                }
                cVar.a(lLMSettingEntity.getCreatedAt(), 12);
                cVar.a(lLMSettingEntity.getSortOrder(), 13);
                cVar.a(lLMSettingEntity.isActive() ? 1L : 0L, 14);
            }
        };
    }

    public static final y deleteById$lambda$6(String str, String str2, a aVar) {
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

    public static final LLMSettingEntity getActive$lambda$2(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.NAME_ATTR);
            int H6 = d.H(c02, "defaultModel");
            int H7 = d.H(c02, "prompt");
            int H8 = d.H(c02, "temperature");
            int H9 = d.H(c02, "topP");
            int H10 = d.H(c02, "maxOutputTokens");
            int H11 = d.H(c02, "reasoningBudgetTokens");
            int H12 = d.H(c02, "customHeadersJson");
            int H13 = d.H(c02, "customBodyJson");
            int H14 = d.H(c02, "avatarUri");
            int H15 = d.H(c02, "createdAt");
            int H16 = d.H(c02, "sortOrder");
            int H17 = d.H(c02, "isActive");
            LLMSettingEntity lLMSettingEntity = null;
            if (c02.Z()) {
                lLMSettingEntity = new LLMSettingEntity(c02.M(H3), c02.M(H5), c02.isNull(H6) ? null : c02.M(H6), c02.isNull(H7) ? null : c02.M(H7), (float) c02.getDouble(H8), (float) c02.getDouble(H9), c02.isNull(H10) ? null : Integer.valueOf((int) c02.getLong(H10)), c02.isNull(H11) ? null : Integer.valueOf((int) c02.getLong(H11)), c02.isNull(H12) ? null : c02.M(H12), c02.isNull(H13) ? null : c02.M(H13), c02.isNull(H14) ? null : c02.M(H14), c02.getLong(H15), c02.getLong(H16), ((int) c02.getLong(H17)) != 0);
            }
            return lLMSettingEntity;
        } finally {
            c02.close();
        }
    }

    public static final List getAll$lambda$3(String str, a aVar) {
        float f6;
        Integer valueOf;
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.NAME_ATTR);
            int H6 = d.H(c02, "defaultModel");
            int H7 = d.H(c02, "prompt");
            int H8 = d.H(c02, "temperature");
            int H9 = d.H(c02, "topP");
            int H10 = d.H(c02, "maxOutputTokens");
            int H11 = d.H(c02, "reasoningBudgetTokens");
            int H12 = d.H(c02, "customHeadersJson");
            int H13 = d.H(c02, "customBodyJson");
            int H14 = d.H(c02, "avatarUri");
            int H15 = d.H(c02, "createdAt");
            int H16 = d.H(c02, "sortOrder");
            int H17 = d.H(c02, "isActive");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                String M5 = c02.M(H3);
                String M6 = c02.M(H5);
                String M7 = c02.isNull(H6) ? null : c02.M(H6);
                String M8 = c02.isNull(H7) ? null : c02.M(H7);
                int i6 = H5;
                int i7 = H6;
                float f7 = (float) c02.getDouble(H8);
                float f8 = (float) c02.getDouble(H9);
                if (c02.isNull(H10)) {
                    f6 = f8;
                    valueOf = null;
                } else {
                    f6 = f8;
                    valueOf = Integer.valueOf((int) c02.getLong(H10));
                }
                arrayList.add(new LLMSettingEntity(M5, M6, M7, M8, f7, f6, valueOf, c02.isNull(H11) ? null : Integer.valueOf((int) c02.getLong(H11)), c02.isNull(H12) ? null : c02.M(H12), c02.isNull(H13) ? null : c02.M(H13), c02.isNull(H14) ? null : c02.M(H14), c02.getLong(H15), c02.getLong(H16), ((int) c02.getLong(H17)) != 0));
                H5 = i6;
                H6 = i7;
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final LLMSettingEntity getById$lambda$1(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, Attribute.NAME_ATTR);
            int H6 = d.H(c02, "defaultModel");
            int H7 = d.H(c02, "prompt");
            int H8 = d.H(c02, "temperature");
            int H9 = d.H(c02, "topP");
            int H10 = d.H(c02, "maxOutputTokens");
            int H11 = d.H(c02, "reasoningBudgetTokens");
            int H12 = d.H(c02, "customHeadersJson");
            int H13 = d.H(c02, "customBodyJson");
            int H14 = d.H(c02, "avatarUri");
            int H15 = d.H(c02, "createdAt");
            int H16 = d.H(c02, "sortOrder");
            int H17 = d.H(c02, "isActive");
            LLMSettingEntity lLMSettingEntity = null;
            if (c02.Z()) {
                lLMSettingEntity = new LLMSettingEntity(c02.M(H3), c02.M(H5), c02.isNull(H6) ? null : c02.M(H6), c02.isNull(H7) ? null : c02.M(H7), (float) c02.getDouble(H8), (float) c02.getDouble(H9), c02.isNull(H10) ? null : Integer.valueOf((int) c02.getLong(H10)), c02.isNull(H11) ? null : Integer.valueOf((int) c02.getLong(H11)), c02.isNull(H12) ? null : c02.M(H12), c02.isNull(H13) ? null : c02.M(H13), c02.isNull(H14) ? null : c02.M(H14), c02.getLong(H15), c02.getLong(H16), ((int) c02.getLong(H17)) != 0);
            }
            return lLMSettingEntity;
        } finally {
            c02.close();
        }
    }

    public static final Long getMaxSortOrder$lambda$4(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            Long l3 = null;
            if (c02.Z() && !c02.isNull(0)) {
                l3 = Long.valueOf(c02.getLong(0));
            }
            return l3;
        } finally {
            c02.close();
        }
    }

    public static final y setActive$lambda$5(String str, String str2, a aVar) {
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

    public static final y updateSortOrder$lambda$7(String str, long j3, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.a(j3, 1);
            c02.z(2, str2);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y upsert$lambda$0(LLMSettingDao_Impl lLMSettingDao_Impl, LLMSettingEntity lLMSettingEntity, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        lLMSettingDao_Impl.__insertAdapterOfLLMSettingEntity.insert(aVar, lLMSettingEntity);
        return y.a;
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object deleteById(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 16), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object getActive(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(20), true, false);
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object getAll(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(21), true, false);
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object getById(String str, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new b(str, 17), true, false);
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object getMaxSortOrder(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(22), true, false);
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object setActive(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 15), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object updateSortOrder(String str, long j3, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2020c(j3, str, 1), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMSettingDao
    public Object upsert(LLMSettingEntity lLMSettingEntity, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2022e(0, this, lLMSettingEntity), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }
}
