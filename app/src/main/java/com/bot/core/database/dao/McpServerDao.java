package com.bot.core.database.dao;

import b4.InterfaceC0905c;
import com.bot.core.database.entity.McpServerEntity;

/* loaded from: classes.dex */
public interface McpServerDao {
    Object clear(InterfaceC0905c interfaceC0905c);

    Object delete(String str, InterfaceC0905c interfaceC0905c);

    Object getAll(InterfaceC0905c interfaceC0905c);

    Object getById(String str, InterfaceC0905c interfaceC0905c);

    Object upsert(McpServerEntity mcpServerEntity, InterfaceC0905c interfaceC0905c);
}
