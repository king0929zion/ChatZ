package com.bot.core.database.dao;

import A4.InterfaceC0007h;
import M2.b;
import N1.AbstractC0281c;
import N1.v;
import Q.C0453p2;
import X1.a;
import X1.c;
import X3.y;
import Y4.d;
import Z2.X;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.entity.LLMProviderEntity;
import com.vladsch.flexmark.util.html.Attribute;
import h5.e;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1271f;
import m4.AbstractC1276k;
import p.O0;
import s4.InterfaceC1672b;
import z2.C2020c;
import z2.C2021d;

/* loaded from: classes.dex */
public final class LLMProviderDao_Impl implements LLMProviderDao {
    private final v __db;
    private final AbstractC0281c __insertAdapterOfLLMProviderEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.bot.core.database.dao.LLMProviderDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0281c {
        @Override // N1.AbstractC0281c
        public String createQuery() {
            return "INSERT OR REPLACE INTO `llm_providers` (`id`,`providerType`,`name`,`baseUrl`,`apiSchema`,`openAiApiMode`,`googleApiMode`,`googleProjectId`,`googleLocation`,`isBuiltin`,`isEnabled`,`apiKey`,`enabledModelIds`,`sortOrder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // N1.AbstractC0281c
        public void bind(c cVar, LLMProviderEntity lLMProviderEntity) {
            AbstractC1276k.f(cVar, "statement");
            AbstractC1276k.f(lLMProviderEntity, "entity");
            cVar.z(1, lLMProviderEntity.getId());
            cVar.z(2, lLMProviderEntity.getProviderType());
            cVar.z(3, lLMProviderEntity.getName());
            cVar.z(4, lLMProviderEntity.getBaseUrl());
            cVar.z(5, lLMProviderEntity.getApiSchema());
            cVar.z(6, lLMProviderEntity.getOpenAiApiMode());
            cVar.z(7, lLMProviderEntity.getGoogleApiMode());
            String googleProjectId = lLMProviderEntity.getGoogleProjectId();
            if (googleProjectId == null) {
                cVar.e(8);
            } else {
                cVar.z(8, googleProjectId);
            }
            String googleLocation = lLMProviderEntity.getGoogleLocation();
            if (googleLocation == null) {
                cVar.e(9);
            } else {
                cVar.z(9, googleLocation);
            }
            cVar.a(lLMProviderEntity.isBuiltin() ? 1L : 0L, 10);
            cVar.a(lLMProviderEntity.isEnabled() ? 1L : 0L, 11);
            String apiKey = lLMProviderEntity.getApiKey();
            if (apiKey == null) {
                cVar.e(12);
            } else {
                cVar.z(12, apiKey);
            }
            String enabledModelIds = lLMProviderEntity.getEnabledModelIds();
            if (enabledModelIds == null) {
                cVar.e(13);
            } else {
                cVar.z(13, enabledModelIds);
            }
            cVar.a(lLMProviderEntity.getSortOrder(), 14);
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

    public LLMProviderDao_Impl(v vVar) {
        AbstractC1276k.f(vVar, "__db");
        this.__db = vVar;
        this.__insertAdapterOfLLMProviderEntity = new AbstractC0281c() { // from class: com.bot.core.database.dao.LLMProviderDao_Impl.1
            @Override // N1.AbstractC0281c
            public String createQuery() {
                return "INSERT OR REPLACE INTO `llm_providers` (`id`,`providerType`,`name`,`baseUrl`,`apiSchema`,`openAiApiMode`,`googleApiMode`,`googleProjectId`,`googleLocation`,`isBuiltin`,`isEnabled`,`apiKey`,`enabledModelIds`,`sortOrder`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // N1.AbstractC0281c
            public void bind(c cVar, LLMProviderEntity lLMProviderEntity) {
                AbstractC1276k.f(cVar, "statement");
                AbstractC1276k.f(lLMProviderEntity, "entity");
                cVar.z(1, lLMProviderEntity.getId());
                cVar.z(2, lLMProviderEntity.getProviderType());
                cVar.z(3, lLMProviderEntity.getName());
                cVar.z(4, lLMProviderEntity.getBaseUrl());
                cVar.z(5, lLMProviderEntity.getApiSchema());
                cVar.z(6, lLMProviderEntity.getOpenAiApiMode());
                cVar.z(7, lLMProviderEntity.getGoogleApiMode());
                String googleProjectId = lLMProviderEntity.getGoogleProjectId();
                if (googleProjectId == null) {
                    cVar.e(8);
                } else {
                    cVar.z(8, googleProjectId);
                }
                String googleLocation = lLMProviderEntity.getGoogleLocation();
                if (googleLocation == null) {
                    cVar.e(9);
                } else {
                    cVar.z(9, googleLocation);
                }
                cVar.a(lLMProviderEntity.isBuiltin() ? 1L : 0L, 10);
                cVar.a(lLMProviderEntity.isEnabled() ? 1L : 0L, 11);
                String apiKey = lLMProviderEntity.getApiKey();
                if (apiKey == null) {
                    cVar.e(12);
                } else {
                    cVar.z(12, apiKey);
                }
                String enabledModelIds = lLMProviderEntity.getEnabledModelIds();
                if (enabledModelIds == null) {
                    cVar.e(13);
                } else {
                    cVar.z(13, enabledModelIds);
                }
                cVar.a(lLMProviderEntity.getSortOrder(), 14);
            }
        };
    }

    public static final int count$lambda$5(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            return c02.Z() ? (int) c02.getLong(0) : 0;
        } finally {
            c02.close();
        }
    }

    public static final y delete$lambda$10(String str, String str2, a aVar) {
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

    public static final List getAll$lambda$2(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "providerType");
            int H6 = d.H(c02, Attribute.NAME_ATTR);
            int H7 = d.H(c02, "baseUrl");
            int H8 = d.H(c02, "apiSchema");
            int H9 = d.H(c02, "openAiApiMode");
            int H10 = d.H(c02, "googleApiMode");
            int H11 = d.H(c02, "googleProjectId");
            int H12 = d.H(c02, "googleLocation");
            int H13 = d.H(c02, "isBuiltin");
            int H14 = d.H(c02, "isEnabled");
            int H15 = d.H(c02, "apiKey");
            int H16 = d.H(c02, "enabledModelIds");
            int H17 = d.H(c02, "sortOrder");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                String M5 = c02.M(H3);
                String M6 = c02.M(H5);
                int i6 = H5;
                int i7 = H6;
                int i8 = H7;
                arrayList.add(new LLMProviderEntity(M5, M6, c02.M(H6), c02.M(H7), c02.M(H8), c02.M(H9), c02.M(H10), c02.isNull(H11) ? null : c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), ((int) c02.getLong(H13)) != 0, ((int) c02.getLong(H14)) != 0, c02.isNull(H15) ? null : c02.M(H15), c02.isNull(H16) ? null : c02.M(H16), c02.getLong(H17)));
                H6 = i7;
                H7 = i8;
                H5 = i6;
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final LLMProviderEntity getById$lambda$4(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "providerType");
            int H6 = d.H(c02, Attribute.NAME_ATTR);
            int H7 = d.H(c02, "baseUrl");
            int H8 = d.H(c02, "apiSchema");
            int H9 = d.H(c02, "openAiApiMode");
            int H10 = d.H(c02, "googleApiMode");
            int H11 = d.H(c02, "googleProjectId");
            int H12 = d.H(c02, "googleLocation");
            int H13 = d.H(c02, "isBuiltin");
            int H14 = d.H(c02, "isEnabled");
            int H15 = d.H(c02, "apiKey");
            int H16 = d.H(c02, "enabledModelIds");
            int H17 = d.H(c02, "sortOrder");
            LLMProviderEntity lLMProviderEntity = null;
            if (c02.Z()) {
                lLMProviderEntity = new LLMProviderEntity(c02.M(H3), c02.M(H5), c02.M(H6), c02.M(H7), c02.M(H8), c02.M(H9), c02.M(H10), c02.isNull(H11) ? null : c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), ((int) c02.getLong(H13)) != 0, ((int) c02.getLong(H14)) != 0, c02.isNull(H15) ? null : c02.M(H15), c02.isNull(H16) ? null : c02.M(H16), c02.getLong(H17));
            }
            return lLMProviderEntity;
        } finally {
            c02.close();
        }
    }

    public static final List observeAll$lambda$3(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "providerType");
            int H6 = d.H(c02, Attribute.NAME_ATTR);
            int H7 = d.H(c02, "baseUrl");
            int H8 = d.H(c02, "apiSchema");
            int H9 = d.H(c02, "openAiApiMode");
            int H10 = d.H(c02, "googleApiMode");
            int H11 = d.H(c02, "googleProjectId");
            int H12 = d.H(c02, "googleLocation");
            int H13 = d.H(c02, "isBuiltin");
            int H14 = d.H(c02, "isEnabled");
            int H15 = d.H(c02, "apiKey");
            int H16 = d.H(c02, "enabledModelIds");
            int H17 = d.H(c02, "sortOrder");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                String M5 = c02.M(H3);
                String M6 = c02.M(H5);
                int i6 = H5;
                int i7 = H6;
                int i8 = H7;
                arrayList.add(new LLMProviderEntity(M5, M6, c02.M(H6), c02.M(H7), c02.M(H8), c02.M(H9), c02.M(H10), c02.isNull(H11) ? null : c02.M(H11), c02.isNull(H12) ? null : c02.M(H12), ((int) c02.getLong(H13)) != 0, ((int) c02.getLong(H14)) != 0, c02.isNull(H15) ? null : c02.M(H15), c02.isNull(H16) ? null : c02.M(H16), c02.getLong(H17)));
                H6 = i7;
                H7 = i8;
                H5 = i6;
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final y updateApiKey$lambda$6(String str, String str2, String str3, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            if (str2 == null) {
                c02.e(1);
            } else {
                c02.z(1, str2);
            }
            c02.z(2, str3);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y updateEnabled$lambda$7(String str, boolean z5, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.a(z5 ? 1L : 0L, 1);
            c02.z(2, str2);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y updateEnabledModelIds$lambda$8(String str, String str2, String str3, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            if (str2 == null) {
                c02.e(1);
            } else {
                c02.z(1, str2);
            }
            c02.z(2, str3);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y updateSortOrder$lambda$9(String str, long j3, String str2, a aVar) {
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

    public static final y upsert$lambda$0(LLMProviderDao_Impl lLMProviderDao_Impl, LLMProviderEntity lLMProviderEntity, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        lLMProviderDao_Impl.__insertAdapterOfLLMProviderEntity.insert(aVar, lLMProviderEntity);
        return y.a;
    }

    public static final y upsertAll$lambda$1(LLMProviderDao_Impl lLMProviderDao_Impl, List list, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        lLMProviderDao_Impl.__insertAdapterOfLLMProviderEntity.insert(aVar, (Iterable<Object>) list);
        return y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object count(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(18), true, false);
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object delete(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 14), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object getAll(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(17), true, false);
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object getById(String str, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new b(str, 13), true, false);
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public InterfaceC0007h observeAll() {
        return e.P(this.__db, new String[]{"llm_providers"}, new O0(19));
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object updateApiKey(String str, String str2, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2021d(str2, 0, str), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object updateEnabled(String str, boolean z5, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C0453p2(z5, str, 1), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object updateEnabledModelIds(String str, String str2, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2021d(str2, 1, str), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object updateSortOrder(String str, long j3, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2020c(j3, str, 0), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object upsert(LLMProviderEntity lLMProviderEntity, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new X(29, this, lLMProviderEntity), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.LLMProviderDao
    public Object upsertAll(List<LLMProviderEntity> list, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new X(28, this, list), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }
}
