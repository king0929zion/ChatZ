package com.bot.core.model;

import B3.e;
import I4.d;
import com.vladsch.flexmark.parser.PegdownExtensions;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class LLMProviderUpdateRequest {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11188b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11189c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11190d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11191e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11192f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11193g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11194h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f11195i;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return LLMProviderUpdateRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LLMProviderUpdateRequest(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        if ((i6 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i6 & 2) == 0) {
            this.f11188b = null;
        } else {
            this.f11188b = str2;
        }
        if ((i6 & 4) == 0) {
            this.f11189c = null;
        } else {
            this.f11189c = str3;
        }
        if ((i6 & 8) == 0) {
            this.f11190d = null;
        } else {
            this.f11190d = str4;
        }
        if ((i6 & 16) == 0) {
            this.f11191e = null;
        } else {
            this.f11191e = str5;
        }
        if ((i6 & 32) == 0) {
            this.f11192f = null;
        } else {
            this.f11192f = str6;
        }
        if ((i6 & 64) == 0) {
            this.f11193g = null;
        } else {
            this.f11193g = str7;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            this.f11194h = null;
        } else {
            this.f11194h = str8;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) == 0) {
            this.f11195i = null;
        } else {
            this.f11195i = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMProviderUpdateRequest)) {
            return false;
        }
        LLMProviderUpdateRequest lLMProviderUpdateRequest = (LLMProviderUpdateRequest) obj;
        return AbstractC1276k.b(this.a, lLMProviderUpdateRequest.a) && AbstractC1276k.b(this.f11188b, lLMProviderUpdateRequest.f11188b) && AbstractC1276k.b(this.f11189c, lLMProviderUpdateRequest.f11189c) && AbstractC1276k.b(this.f11190d, lLMProviderUpdateRequest.f11190d) && AbstractC1276k.b(this.f11191e, lLMProviderUpdateRequest.f11191e) && AbstractC1276k.b(this.f11192f, lLMProviderUpdateRequest.f11192f) && AbstractC1276k.b(this.f11193g, lLMProviderUpdateRequest.f11193g) && AbstractC1276k.b(this.f11194h, lLMProviderUpdateRequest.f11194h) && AbstractC1276k.b(this.f11195i, lLMProviderUpdateRequest.f11195i);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11188b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11189c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11190d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11191e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11192f;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f11193g;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f11194h;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.f11195i;
        return hashCode8 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = e.u("LLMProviderUpdateRequest(name=", this.a, ", baseUrl=", this.f11188b, ", apiSchema=");
        e.z(u5, this.f11189c, ", openAiApiMode=", this.f11190d, ", googleApiMode=");
        e.z(u5, this.f11191e, ", googleProjectId=", this.f11192f, ", googleLocation=");
        e.z(u5, this.f11193g, ", apiKey=", this.f11194h, ", isEnabled=");
        u5.append(this.f11195i);
        u5.append(")");
        return u5.toString();
    }

    public LLMProviderUpdateRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool) {
        this.a = str;
        this.f11188b = str2;
        this.f11189c = str3;
        this.f11190d = str4;
        this.f11191e = str5;
        this.f11192f = str6;
        this.f11193g = str7;
        this.f11194h = str8;
        this.f11195i = bool;
    }
}
