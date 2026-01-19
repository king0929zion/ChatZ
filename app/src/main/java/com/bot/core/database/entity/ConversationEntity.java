package com.bot.core.database.entity;

import B3.e;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class ConversationEntity {
    public static final int $stable = 0;
    private final String createdAt;
    private final String id;
    private final boolean isArchived;
    private final boolean isFavorited;
    private final String lastMessageAt;
    private final int messageCount;
    private final String modelName;
    private final String systemPrompt;
    private final String title;
    private final int totalTokens;
    private final String updatedAt;

    public ConversationEntity(String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, String str6, String str7, int i6, int i7) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.TITLE_ATTR);
        AbstractC1276k.f(str3, "modelName");
        AbstractC1276k.f(str5, "createdAt");
        AbstractC1276k.f(str6, "updatedAt");
        this.id = str;
        this.title = str2;
        this.modelName = str3;
        this.systemPrompt = str4;
        this.isArchived = z5;
        this.isFavorited = z6;
        this.createdAt = str5;
        this.updatedAt = str6;
        this.lastMessageAt = str7;
        this.messageCount = i6;
        this.totalTokens = i7;
    }

    public static /* synthetic */ ConversationEntity copy$default(ConversationEntity conversationEntity, String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, String str6, String str7, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = conversationEntity.id;
        }
        if ((i8 & 2) != 0) {
            str2 = conversationEntity.title;
        }
        if ((i8 & 4) != 0) {
            str3 = conversationEntity.modelName;
        }
        if ((i8 & 8) != 0) {
            str4 = conversationEntity.systemPrompt;
        }
        if ((i8 & 16) != 0) {
            z5 = conversationEntity.isArchived;
        }
        if ((i8 & 32) != 0) {
            z6 = conversationEntity.isFavorited;
        }
        if ((i8 & 64) != 0) {
            str5 = conversationEntity.createdAt;
        }
        if ((i8 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            str6 = conversationEntity.updatedAt;
        }
        if ((i8 & PegdownExtensions.WIKILINKS) != 0) {
            str7 = conversationEntity.lastMessageAt;
        }
        if ((i8 & PegdownExtensions.STRIKETHROUGH) != 0) {
            i6 = conversationEntity.messageCount;
        }
        if ((i8 & PegdownExtensions.ANCHORLINKS) != 0) {
            i7 = conversationEntity.totalTokens;
        }
        int i9 = i6;
        int i10 = i7;
        String str8 = str6;
        String str9 = str7;
        boolean z7 = z6;
        String str10 = str5;
        boolean z8 = z5;
        String str11 = str3;
        return conversationEntity.copy(str, str2, str11, str4, z8, z7, str10, str8, str9, i9, i10);
    }

    public final String component1() {
        return this.id;
    }

    public final int component10() {
        return this.messageCount;
    }

    public final int component11() {
        return this.totalTokens;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.modelName;
    }

    public final String component4() {
        return this.systemPrompt;
    }

    public final boolean component5() {
        return this.isArchived;
    }

    public final boolean component6() {
        return this.isFavorited;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final String component9() {
        return this.lastMessageAt;
    }

    public final ConversationEntity copy(String str, String str2, String str3, String str4, boolean z5, boolean z6, String str5, String str6, String str7, int i6, int i7) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.TITLE_ATTR);
        AbstractC1276k.f(str3, "modelName");
        AbstractC1276k.f(str5, "createdAt");
        AbstractC1276k.f(str6, "updatedAt");
        return new ConversationEntity(str, str2, str3, str4, z5, z6, str5, str6, str7, i6, i7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationEntity)) {
            return false;
        }
        ConversationEntity conversationEntity = (ConversationEntity) obj;
        return AbstractC1276k.b(this.id, conversationEntity.id) && AbstractC1276k.b(this.title, conversationEntity.title) && AbstractC1276k.b(this.modelName, conversationEntity.modelName) && AbstractC1276k.b(this.systemPrompt, conversationEntity.systemPrompt) && this.isArchived == conversationEntity.isArchived && this.isFavorited == conversationEntity.isFavorited && AbstractC1276k.b(this.createdAt, conversationEntity.createdAt) && AbstractC1276k.b(this.updatedAt, conversationEntity.updatedAt) && AbstractC1276k.b(this.lastMessageAt, conversationEntity.lastMessageAt) && this.messageCount == conversationEntity.messageCount && this.totalTokens == conversationEntity.totalTokens;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastMessageAt() {
        return this.lastMessageAt;
    }

    public final int getMessageCount() {
        return this.messageCount;
    }

    public final String getModelName() {
        return this.modelName;
    }

    public final String getSystemPrompt() {
        return this.systemPrompt;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotalTokens() {
        return this.totalTokens;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int e6 = e.e(e.e(this.id.hashCode() * 31, 31, this.title), 31, this.modelName);
        String str = this.systemPrompt;
        int e7 = e.e(e.e(AbstractC1135a.d(AbstractC1135a.d((e6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.isArchived), 31, this.isFavorited), 31, this.createdAt), 31, this.updatedAt);
        String str2 = this.lastMessageAt;
        return Integer.hashCode(this.totalTokens) + AbstractC1135a.b(this.messageCount, (e7 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final boolean isArchived() {
        return this.isArchived;
    }

    public final boolean isFavorited() {
        return this.isFavorited;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.modelName;
        String str4 = this.systemPrompt;
        boolean z5 = this.isArchived;
        boolean z6 = this.isFavorited;
        String str5 = this.createdAt;
        String str6 = this.updatedAt;
        String str7 = this.lastMessageAt;
        int i6 = this.messageCount;
        int i7 = this.totalTokens;
        StringBuilder u5 = e.u("ConversationEntity(id=", str, ", title=", str2, ", modelName=");
        e.z(u5, str3, ", systemPrompt=", str4, ", isArchived=");
        u5.append(z5);
        u5.append(", isFavorited=");
        u5.append(z6);
        u5.append(", createdAt=");
        e.z(u5, str5, ", updatedAt=", str6, ", lastMessageAt=");
        u5.append(str7);
        u5.append(", messageCount=");
        u5.append(i6);
        u5.append(", totalTokens=");
        return AbstractC1135a.i(u5, i7, ")");
    }
}
