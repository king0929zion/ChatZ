package com.bot.core.database.entity;

import B3.e;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import m4.AbstractC1271f;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class LLMProviderEntity {
    public static final int $stable = 0;
    private final String apiKey;
    private final String apiSchema;
    private final String baseUrl;
    private final String enabledModelIds;
    private final String googleApiMode;
    private final String googleLocation;
    private final String googleProjectId;
    private final String id;
    private final boolean isBuiltin;
    private final boolean isEnabled;
    private final String name;
    private final String openAiApiMode;
    private final String providerType;
    private final long sortOrder;

    public LLMProviderEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, String str11, long j3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "providerType");
        AbstractC1276k.f(str3, Attribute.NAME_ATTR);
        AbstractC1276k.f(str4, "baseUrl");
        AbstractC1276k.f(str5, "apiSchema");
        AbstractC1276k.f(str6, "openAiApiMode");
        AbstractC1276k.f(str7, "googleApiMode");
        this.id = str;
        this.providerType = str2;
        this.name = str3;
        this.baseUrl = str4;
        this.apiSchema = str5;
        this.openAiApiMode = str6;
        this.googleApiMode = str7;
        this.googleProjectId = str8;
        this.googleLocation = str9;
        this.isBuiltin = z5;
        this.isEnabled = z6;
        this.apiKey = str10;
        this.enabledModelIds = str11;
        this.sortOrder = j3;
    }

    public static /* synthetic */ LLMProviderEntity copy$default(LLMProviderEntity lLMProviderEntity, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, String str11, long j3, int i6, Object obj) {
        long j4;
        String str12;
        LLMProviderEntity lLMProviderEntity2;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z7;
        boolean z8;
        String str21;
        String str22;
        String str23 = (i6 & 1) != 0 ? lLMProviderEntity.id : str;
        String str24 = (i6 & 2) != 0 ? lLMProviderEntity.providerType : str2;
        String str25 = (i6 & 4) != 0 ? lLMProviderEntity.name : str3;
        String str26 = (i6 & 8) != 0 ? lLMProviderEntity.baseUrl : str4;
        String str27 = (i6 & 16) != 0 ? lLMProviderEntity.apiSchema : str5;
        String str28 = (i6 & 32) != 0 ? lLMProviderEntity.openAiApiMode : str6;
        String str29 = (i6 & 64) != 0 ? lLMProviderEntity.googleApiMode : str7;
        String str30 = (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? lLMProviderEntity.googleProjectId : str8;
        String str31 = (i6 & PegdownExtensions.WIKILINKS) != 0 ? lLMProviderEntity.googleLocation : str9;
        boolean z9 = (i6 & PegdownExtensions.STRIKETHROUGH) != 0 ? lLMProviderEntity.isBuiltin : z5;
        boolean z10 = (i6 & PegdownExtensions.ANCHORLINKS) != 0 ? lLMProviderEntity.isEnabled : z6;
        String str32 = (i6 & 2048) != 0 ? lLMProviderEntity.apiKey : str10;
        String str33 = (i6 & 4096) != 0 ? lLMProviderEntity.enabledModelIds : str11;
        if ((i6 & 8192) != 0) {
            str12 = str23;
            j4 = lLMProviderEntity.sortOrder;
            str13 = str24;
            str14 = str25;
            str15 = str26;
            str16 = str27;
            str17 = str28;
            str18 = str29;
            str19 = str30;
            str20 = str31;
            z7 = z9;
            z8 = z10;
            str21 = str32;
            str22 = str33;
            lLMProviderEntity2 = lLMProviderEntity;
        } else {
            j4 = j3;
            str12 = str23;
            lLMProviderEntity2 = lLMProviderEntity;
            str13 = str24;
            str14 = str25;
            str15 = str26;
            str16 = str27;
            str17 = str28;
            str18 = str29;
            str19 = str30;
            str20 = str31;
            z7 = z9;
            z8 = z10;
            str21 = str32;
            str22 = str33;
        }
        return lLMProviderEntity2.copy(str12, str13, str14, str15, str16, str17, str18, str19, str20, z7, z8, str21, str22, j4);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component10() {
        return this.isBuiltin;
    }

    public final boolean component11() {
        return this.isEnabled;
    }

    public final String component12() {
        return this.apiKey;
    }

    public final String component13() {
        return this.enabledModelIds;
    }

    public final long component14() {
        return this.sortOrder;
    }

    public final String component2() {
        return this.providerType;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.baseUrl;
    }

    public final String component5() {
        return this.apiSchema;
    }

    public final String component6() {
        return this.openAiApiMode;
    }

    public final String component7() {
        return this.googleApiMode;
    }

    public final String component8() {
        return this.googleProjectId;
    }

    public final String component9() {
        return this.googleLocation;
    }

    public final LLMProviderEntity copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, String str11, long j3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "providerType");
        AbstractC1276k.f(str3, Attribute.NAME_ATTR);
        AbstractC1276k.f(str4, "baseUrl");
        AbstractC1276k.f(str5, "apiSchema");
        AbstractC1276k.f(str6, "openAiApiMode");
        AbstractC1276k.f(str7, "googleApiMode");
        return new LLMProviderEntity(str, str2, str3, str4, str5, str6, str7, str8, str9, z5, z6, str10, str11, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMProviderEntity)) {
            return false;
        }
        LLMProviderEntity lLMProviderEntity = (LLMProviderEntity) obj;
        return AbstractC1276k.b(this.id, lLMProviderEntity.id) && AbstractC1276k.b(this.providerType, lLMProviderEntity.providerType) && AbstractC1276k.b(this.name, lLMProviderEntity.name) && AbstractC1276k.b(this.baseUrl, lLMProviderEntity.baseUrl) && AbstractC1276k.b(this.apiSchema, lLMProviderEntity.apiSchema) && AbstractC1276k.b(this.openAiApiMode, lLMProviderEntity.openAiApiMode) && AbstractC1276k.b(this.googleApiMode, lLMProviderEntity.googleApiMode) && AbstractC1276k.b(this.googleProjectId, lLMProviderEntity.googleProjectId) && AbstractC1276k.b(this.googleLocation, lLMProviderEntity.googleLocation) && this.isBuiltin == lLMProviderEntity.isBuiltin && this.isEnabled == lLMProviderEntity.isEnabled && AbstractC1276k.b(this.apiKey, lLMProviderEntity.apiKey) && AbstractC1276k.b(this.enabledModelIds, lLMProviderEntity.enabledModelIds) && this.sortOrder == lLMProviderEntity.sortOrder;
    }

    public final String getApiKey() {
        return this.apiKey;
    }

    public final String getApiSchema() {
        return this.apiSchema;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final String getEnabledModelIds() {
        return this.enabledModelIds;
    }

    public final String getGoogleApiMode() {
        return this.googleApiMode;
    }

    public final String getGoogleLocation() {
        return this.googleLocation;
    }

    public final String getGoogleProjectId() {
        return this.googleProjectId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOpenAiApiMode() {
        return this.openAiApiMode;
    }

    public final String getProviderType() {
        return this.providerType;
    }

    public final long getSortOrder() {
        return this.sortOrder;
    }

    public int hashCode() {
        int e6 = e.e(e.e(e.e(e.e(e.e(e.e(this.id.hashCode() * 31, 31, this.providerType), 31, this.name), 31, this.baseUrl), 31, this.apiSchema), 31, this.openAiApiMode), 31, this.googleApiMode);
        String str = this.googleProjectId;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.googleLocation;
        int d6 = AbstractC1135a.d(AbstractC1135a.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.isBuiltin), 31, this.isEnabled);
        String str3 = this.apiKey;
        int hashCode2 = (d6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.enabledModelIds;
        return Long.hashCode(this.sortOrder) + ((hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final boolean isBuiltin() {
        return this.isBuiltin;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.providerType;
        String str3 = this.name;
        String str4 = this.baseUrl;
        String str5 = this.apiSchema;
        String str6 = this.openAiApiMode;
        String str7 = this.googleApiMode;
        String str8 = this.googleProjectId;
        String str9 = this.googleLocation;
        boolean z5 = this.isBuiltin;
        boolean z6 = this.isEnabled;
        String str10 = this.apiKey;
        String str11 = this.enabledModelIds;
        long j3 = this.sortOrder;
        StringBuilder u5 = e.u("LLMProviderEntity(id=", str, ", providerType=", str2, ", name=");
        e.z(u5, str3, ", baseUrl=", str4, ", apiSchema=");
        e.z(u5, str5, ", openAiApiMode=", str6, ", googleApiMode=");
        e.z(u5, str7, ", googleProjectId=", str8, ", googleLocation=");
        u5.append(str9);
        u5.append(", isBuiltin=");
        u5.append(z5);
        u5.append(", isEnabled=");
        u5.append(z6);
        u5.append(", apiKey=");
        u5.append(str10);
        u5.append(", enabledModelIds=");
        u5.append(str11);
        u5.append(", sortOrder=");
        u5.append(j3);
        u5.append(")");
        return u5.toString();
    }

    public /* synthetic */ LLMProviderEntity(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, String str11, long j3, int i6, AbstractC1271f abstractC1271f) {
        this(str, str2, str3, str4, (i6 & 16) != 0 ? "openai" : str5, (i6 & 32) != 0 ? "chat_completions" : str6, (i6 & 64) != 0 ? "ai_studio" : str7, (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? null : str8, (i6 & PegdownExtensions.WIKILINKS) != 0 ? null : str9, z5, z6, str10, (i6 & 4096) != 0 ? null : str11, (i6 & 8192) != 0 ? 0L : j3);
    }
}
