package com.bot.core.database.data;

import A2.c;
import N1.v;
import Y4.l;
import com.bot.core.database.dao.ConversationDao;
import com.bot.core.database.dao.LLMProviderDao;
import com.bot.core.database.dao.LLMSettingDao;
import com.bot.core.database.dao.McpServerDao;
import com.bot.core.database.dao.MessageDao;
import java.util.List;

/* loaded from: classes.dex */
public abstract class AppDatabase implements v,   {

    /* renamed from: j, reason: collision with root package name */
    public static volatile AppDatabase f11139j;
    public static final c Companion = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final List f11140k = l.I("bot_database", "bot_hub_database");

    public abstract ConversationDao j();

    public abstract LLMProviderDao k();

    public abstract LLMSettingDao l();

    public abstract McpServerDao m();

    public abstract MessageDao n();
}
