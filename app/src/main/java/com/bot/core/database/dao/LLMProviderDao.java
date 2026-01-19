package com.bot.core.database.dao;

import A4.InterfaceC0007h;
import b4.InterfaceC0905c;
import com.bot.core.database.entity.LLMProviderEntity;
import java.util.List;

/* loaded from: classes.dex */
public interface LLMProviderDao {
    Object count(InterfaceC0905c interfaceC0905c);

    Object delete(String str, InterfaceC0905c interfaceC0905c);

    Object getAll(InterfaceC0905c interfaceC0905c);

    Object getById(String str, InterfaceC0905c interfaceC0905c);

    InterfaceC0007h observeAll();

    Object updateApiKey(String str, String str2, InterfaceC0905c interfaceC0905c);

    Object updateEnabled(String str, boolean z5, InterfaceC0905c interfaceC0905c);

    Object updateEnabledModelIds(String str, String str2, InterfaceC0905c interfaceC0905c);

    Object updateSortOrder(String str, long j3, InterfaceC0905c interfaceC0905c);

    Object upsert(LLMProviderEntity lLMProviderEntity, InterfaceC0905c interfaceC0905c);

    Object upsertAll(List<LLMProviderEntity> list, InterfaceC0905c interfaceC0905c);
}
