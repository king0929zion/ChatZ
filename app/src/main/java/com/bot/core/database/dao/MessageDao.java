package com.bot.core.database.dao;

import A4.InterfaceC0007h;
import b4.InterfaceC0905c;
import com.bot.core.database.entity.MessageEntity;

/* loaded from: classes.dex */
public interface MessageDao {
    Object countMessages(String str, InterfaceC0905c interfaceC0905c);

    Object deleteByConversationId(String str, InterfaceC0905c interfaceC0905c);

    Object getMessages(String str, int i6, int i7, InterfaceC0905c interfaceC0905c);

    Object insert(MessageEntity messageEntity, InterfaceC0905c interfaceC0905c);

    InterfaceC0007h observeMessages(String str);

    Object updateMessage(String str, String str2, String str3, Long l3, String str4, InterfaceC0905c interfaceC0905c);
}
