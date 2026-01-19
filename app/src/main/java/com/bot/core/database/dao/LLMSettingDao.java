package com.bot.core.database.dao;

import b4.InterfaceC0905c;
import com.bot.core.database.entity.LLMSettingEntity;

/* loaded from: classes.dex */
public interface LLMSettingDao {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getById$default(LLMSettingDao lLMSettingDao, String str, InterfaceC0905c interfaceC0905c, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getById");
        }
        if ((i6 & 1) != 0) {
            str = "default";
        }
        return lLMSettingDao.getById(str, interfaceC0905c);
    }

    Object deleteById(String str, InterfaceC0905c interfaceC0905c);

    Object getActive(InterfaceC0905c interfaceC0905c);

    Object getAll(InterfaceC0905c interfaceC0905c);

    Object getById(String str, InterfaceC0905c interfaceC0905c);

    Object getMaxSortOrder(InterfaceC0905c interfaceC0905c);

    Object setActive(String str, InterfaceC0905c interfaceC0905c);

    Object updateSortOrder(String str, long j3, InterfaceC0905c interfaceC0905c);

    Object upsert(LLMSettingEntity lLMSettingEntity, InterfaceC0905c interfaceC0905c);
}
