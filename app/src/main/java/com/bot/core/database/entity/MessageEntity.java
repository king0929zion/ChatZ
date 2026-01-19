package com.bot.core.database.entity;

import B3.e;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class MessageEntity {
    public static final int $stable = 0;
    private final String attachmentsJson;
    private final String content;
    private final String conversationId;
    private final String createdAt;
    private final String id;
    private final String reasoningContent;
    private final Long reasoningDurationMs;
    private final String role;
    private final String toolCallsJson;

    public MessageEntity(String str, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "conversationId");
        AbstractC1276k.f(str3, "role");
        AbstractC1276k.f(str4, "content");
        AbstractC1276k.f(str8, "createdAt");
        this.id = str;
        this.conversationId = str2;
        this.role = str3;
        this.content = str4;
        this.reasoningContent = str5;
        this.reasoningDurationMs = l3;
        this.attachmentsJson = str6;
        this.toolCallsJson = str7;
        this.createdAt = str8;
    }

    public static /* synthetic */ MessageEntity copy$default(MessageEntity messageEntity, String str, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = messageEntity.id;
        }
        if ((i6 & 2) != 0) {
            str2 = messageEntity.conversationId;
        }
        if ((i6 & 4) != 0) {
            str3 = messageEntity.role;
        }
        if ((i6 & 8) != 0) {
            str4 = messageEntity.content;
        }
        if ((i6 & 16) != 0) {
            str5 = messageEntity.reasoningContent;
        }
        if ((i6 & 32) != 0) {
            l3 = messageEntity.reasoningDurationMs;
        }
        if ((i6 & 64) != 0) {
            str6 = messageEntity.attachmentsJson;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0) {
            str7 = messageEntity.toolCallsJson;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) != 0) {
            str8 = messageEntity.createdAt;
        }
        String str9 = str7;
        String str10 = str8;
        Long l5 = l3;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return messageEntity.copy(str, str2, str13, str4, str12, l5, str11, str9, str10);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.conversationId;
    }

    public final String component3() {
        return this.role;
    }

    public final String component4() {
        return this.content;
    }

    public final String component5() {
        return this.reasoningContent;
    }

    public final Long component6() {
        return this.reasoningDurationMs;
    }

    public final String component7() {
        return this.attachmentsJson;
    }

    public final String component8() {
        return this.toolCallsJson;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final MessageEntity copy(String str, String str2, String str3, String str4, String str5, Long l3, String str6, String str7, String str8) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "conversationId");
        AbstractC1276k.f(str3, "role");
        AbstractC1276k.f(str4, "content");
        AbstractC1276k.f(str8, "createdAt");
        return new MessageEntity(str, str2, str3, str4, str5, l3, str6, str7, str8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageEntity)) {
            return false;
        }
        MessageEntity messageEntity = (MessageEntity) obj;
        return AbstractC1276k.b(this.id, messageEntity.id) && AbstractC1276k.b(this.conversationId, messageEntity.conversationId) && AbstractC1276k.b(this.role, messageEntity.role) && AbstractC1276k.b(this.content, messageEntity.content) && AbstractC1276k.b(this.reasoningContent, messageEntity.reasoningContent) && AbstractC1276k.b(this.reasoningDurationMs, messageEntity.reasoningDurationMs) && AbstractC1276k.b(this.attachmentsJson, messageEntity.attachmentsJson) && AbstractC1276k.b(this.toolCallsJson, messageEntity.toolCallsJson) && AbstractC1276k.b(this.createdAt, messageEntity.createdAt);
    }

    public final String getAttachmentsJson() {
        return this.attachmentsJson;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getId() {
        return this.id;
    }

    public final String getReasoningContent() {
        return this.reasoningContent;
    }

    public final Long getReasoningDurationMs() {
        return this.reasoningDurationMs;
    }

    public final String getRole() {
        return this.role;
    }

    public final String getToolCallsJson() {
        return this.toolCallsJson;
    }

    public int hashCode() {
        int e6 = e.e(e.e(e.e(this.id.hashCode() * 31, 31, this.conversationId), 31, this.role), 31, this.content);
        String str = this.reasoningContent;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.reasoningDurationMs;
        int hashCode2 = (hashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.attachmentsJson;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.toolCallsJson;
        return this.createdAt.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.conversationId;
        String str3 = this.role;
        String str4 = this.content;
        String str5 = this.reasoningContent;
        Long l3 = this.reasoningDurationMs;
        String str6 = this.attachmentsJson;
        String str7 = this.toolCallsJson;
        String str8 = this.createdAt;
        StringBuilder u5 = e.u("MessageEntity(id=", str, ", conversationId=", str2, ", role=");
        e.z(u5, str3, ", content=", str4, ", reasoningContent=");
        u5.append(str5);
        u5.append(", reasoningDurationMs=");
        u5.append(l3);
        u5.append(", attachmentsJson=");
        e.z(u5, str6, ", toolCallsJson=", str7, ", createdAt=");
        return e.s(u5, str8, ")");
    }
}
