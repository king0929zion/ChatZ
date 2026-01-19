package com.bot.core.model;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class LLMProviderCreateRequest {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11179b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11180c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11181d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11182e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11183f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11184g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11185h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11186i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11187j;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return LLMProviderCreateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LLMProviderCreateRequest(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5) {
        if (7 != (i6 & 7)) {
            AbstractC0252a0.j(i6, 7, LLMProviderCreateRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11179b = str2;
        this.f11180c = str3;
        if ((i6 & 8) == 0) {
            this.f11181d = "openai";
        } else {
            this.f11181d = str4;
        }
        if ((i6 & 16) == 0) {
            this.f11182e = "chat_completions";
        } else {
            this.f11182e = str5;
        }
        if ((i6 & 32) == 0) {
            this.f11183f = "ai_studio";
        } else {
            this.f11183f = str6;
        }
        if ((i6 & 64) == 0) {
            this.f11184g = null;
        } else {
            this.f11184g = str7;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            this.f11185h = null;
        } else {
            this.f11185h = str8;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) == 0) {
            this.f11186i = null;
        } else {
            this.f11186i = str9;
        }
        if ((i6 & PegdownExtensions.STRIKETHROUGH) == 0) {
            this.f11187j = true;
        } else {
            this.f11187j = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMProviderCreateRequest)) {
            return false;
        }
        LLMProviderCreateRequest lLMProviderCreateRequest = (LLMProviderCreateRequest) obj;
        return AbstractC1276k.b(this.a, lLMProviderCreateRequest.a) && AbstractC1276k.b(this.f11179b, lLMProviderCreateRequest.f11179b) && AbstractC1276k.b(this.f11180c, lLMProviderCreateRequest.f11180c) && AbstractC1276k.b(this.f11181d, lLMProviderCreateRequest.f11181d) && AbstractC1276k.b(this.f11182e, lLMProviderCreateRequest.f11182e) && AbstractC1276k.b(this.f11183f, lLMProviderCreateRequest.f11183f) && AbstractC1276k.b(this.f11184g, lLMProviderCreateRequest.f11184g) && AbstractC1276k.b(this.f11185h, lLMProviderCreateRequest.f11185h) && AbstractC1276k.b(this.f11186i, lLMProviderCreateRequest.f11186i) && this.f11187j == lLMProviderCreateRequest.f11187j;
    }

    public final int hashCode() {
        int e6 = e.e(e.e(e.e(e.e(e.e(this.a.hashCode() * 31, 31, this.f11179b), 31, this.f11180c), 31, this.f11181d), 31, this.f11182e), 31, this.f11183f);
        String str = this.f11184g;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11185h;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11186i;
        return Boolean.hashCode(this.f11187j) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("LLMProviderCreateRequest(providerType=", this.a, ", name=", this.f11179b, ", baseUrl=");
        e.z(u5, this.f11180c, ", apiSchema=", this.f11181d, ", openAiApiMode=");
        e.z(u5, this.f11182e, ", googleApiMode=", this.f11183f, ", googleProjectId=");
        e.z(u5, this.f11184g, ", googleLocation=", this.f11185h, ", apiKey=");
        u5.append(this.f11186i);
        u5.append(", isEnabled=");
        u5.append(this.f11187j);
        u5.append(")");
        return u5.toString();
    }

    public LLMProviderCreateRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z5) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        AbstractC1276k.f(str2, "baseUrl");
        AbstractC1276k.f(str3, "apiSchema");
        AbstractC1276k.f(str4, "openAiApiMode");
        AbstractC1276k.f(str5, "googleApiMode");
        this.a = "custom";
        this.f11179b = str;
        this.f11180c = str2;
        this.f11181d = str3;
        this.f11182e = str4;
        this.f11183f = str5;
        this.f11184g = str6;
        this.f11185h = str7;
        this.f11186i = str8;
        this.f11187j = z5;
    }
}
