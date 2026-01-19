package com.bot.core.database.dao;

import b4.InterfaceC0905c;
import com.bot.core.database.entity.ConversationEntity;

/* loaded from: classes.dex */
public interface ConversationDao {
    Object deleteConversation(String str, InterfaceC0905c interfaceC0905c);

    Object getConversation(String str, InterfaceC0905c interfaceC0905c);

    Object getConversations(int i6, int i7, InterfaceC0905c interfaceC0905c);

    Object searchConversations(String str, int i6, int i7, InterfaceC0905c interfaceC0905c);

    Object updateStats(String str, String str2, String str3, int i6, InterfaceC0905c interfaceC0905c);

    Object updateTitle(String str, String str2, String str3, InterfaceC0905c interfaceC0905c);

    Object upsert(ConversationEntity conversationEntity, InterfaceC0905c interfaceC0905c);
}
