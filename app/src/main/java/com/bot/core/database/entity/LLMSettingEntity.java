package com.bot.core.database.entity;

import B3.e;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import m4.AbstractC1271f;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class LLMSettingEntity {
    public static final int $stable = 0;
    private final String avatarUri;
    private final long createdAt;
    private final String customBodyJson;
    private final String customHeadersJson;
    private final String defaultModel;
    private final String id;
    private final boolean isActive;
    private final Integer maxOutputTokens;
    private final String name;
    private final String prompt;
    private final Integer reasoningBudgetTokens;
    private final long sortOrder;
    private final float temperature;
    private final float topP;

    public LLMSettingEntity(String str, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, long j3, long j4, boolean z5) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        this.id = str;
        this.name = str2;
        this.defaultModel = str3;
        this.prompt = str4;
        this.temperature = f6;
        this.topP = f7;
        this.maxOutputTokens = num;
        this.reasoningBudgetTokens = num2;
        this.customHeadersJson = str5;
        this.customBodyJson = str6;
        this.avatarUri = str7;
        this.createdAt = j3;
        this.sortOrder = j4;
        this.isActive = z5;
    }

    public final String component1() {
        return this.id;
    }

    public final String component10() {
        return this.customBodyJson;
    }

    public final String component11() {
        return this.avatarUri;
    }

    public final long component12() {
        return this.createdAt;
    }

    public final long component13() {
        return this.sortOrder;
    }

    public final boolean component14() {
        return this.isActive;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.defaultModel;
    }

    public final String component4() {
        return this.prompt;
    }

    public final float component5() {
        return this.temperature;
    }

    public final float component6() {
        return this.topP;
    }

    public final Integer component7() {
        return this.maxOutputTokens;
    }

    public final Integer component8() {
        return this.reasoningBudgetTokens;
    }

    public final String component9() {
        return this.customHeadersJson;
    }

    public final LLMSettingEntity copy(String str, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, long j3, long j4, boolean z5) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        return new LLMSettingEntity(str, str2, str3, str4, f6, f7, num, num2, str5, str6, str7, j3, j4, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMSettingEntity)) {
            return false;
        }
        LLMSettingEntity lLMSettingEntity = (LLMSettingEntity) obj;
        return AbstractC1276k.b(this.id, lLMSettingEntity.id) && AbstractC1276k.b(this.name, lLMSettingEntity.name) && AbstractC1276k.b(this.defaultModel, lLMSettingEntity.defaultModel) && AbstractC1276k.b(this.prompt, lLMSettingEntity.prompt) && Float.compare(this.temperature, lLMSettingEntity.temperature) == 0 && Float.compare(this.topP, lLMSettingEntity.topP) == 0 && AbstractC1276k.b(this.maxOutputTokens, lLMSettingEntity.maxOutputTokens) && AbstractC1276k.b(this.reasoningBudgetTokens, lLMSettingEntity.reasoningBudgetTokens) && AbstractC1276k.b(this.customHeadersJson, lLMSettingEntity.customHeadersJson) && AbstractC1276k.b(this.customBodyJson, lLMSettingEntity.customBodyJson) && AbstractC1276k.b(this.avatarUri, lLMSettingEntity.avatarUri) && this.createdAt == lLMSettingEntity.createdAt && this.sortOrder == lLMSettingEntity.sortOrder && this.isActive == lLMSettingEntity.isActive;
    }

    public final String getAvatarUri() {
        return this.avatarUri;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getCustomBodyJson() {
        return this.customBodyJson;
    }

    public final String getCustomHeadersJson() {
        return this.customHeadersJson;
    }

    public final String getDefaultModel() {
        return this.defaultModel;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getMaxOutputTokens() {
        return this.maxOutputTokens;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final Integer getReasoningBudgetTokens() {
        return this.reasoningBudgetTokens;
    }

    public final long getSortOrder() {
        return this.sortOrder;
    }

    public final float getTemperature() {
        return this.temperature;
    }

    public final float getTopP() {
        return this.topP;
    }

    public int hashCode() {
        int e6 = e.e(this.id.hashCode() * 31, 31, this.name);
        String str = this.defaultModel;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.prompt;
        int a = AbstractC1135a.a(this.topP, AbstractC1135a.a(this.temperature, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Integer num = this.maxOutputTokens;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.reasoningBudgetTokens;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.customHeadersJson;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customBodyJson;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.avatarUri;
        return Boolean.hashCode(this.isActive) + AbstractC1135a.c(AbstractC1135a.c((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.createdAt), 31, this.sortOrder);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.defaultModel;
        String str4 = this.prompt;
        float f6 = this.temperature;
        float f7 = this.topP;
        Integer num = this.maxOutputTokens;
        Integer num2 = this.reasoningBudgetTokens;
        String str5 = this.customHeadersJson;
        String str6 = this.customBodyJson;
        String str7 = this.avatarUri;
        long j3 = this.createdAt;
        long j4 = this.sortOrder;
        boolean z5 = this.isActive;
        StringBuilder u5 = e.u("LLMSettingEntity(id=", str, ", name=", str2, ", defaultModel=");
        e.z(u5, str3, ", prompt=", str4, ", temperature=");
        u5.append(f6);
        u5.append(", topP=");
        u5.append(f7);
        u5.append(", maxOutputTokens=");
        u5.append(num);
        u5.append(", reasoningBudgetTokens=");
        u5.append(num2);
        u5.append(", customHeadersJson=");
        e.z(u5, str5, ", customBodyJson=", str6, ", avatarUri=");
        u5.append(str7);
        u5.append(", createdAt=");
        u5.append(j3);
        u5.append(", sortOrder=");
        u5.append(j4);
        u5.append(", isActive=");
        u5.append(z5);
        u5.append(")");
        return u5.toString();
    }

    public /* synthetic */ LLMSettingEntity(String str, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, long j3, long j4, boolean z5, int i6, AbstractC1271f abstractC1271f) {
        this((i6 & 1) != 0 ? "default" : str, str2, str3, str4, f6, f7, num, num2, str5, str6, str7, j3, j4, z5);
    }
}
