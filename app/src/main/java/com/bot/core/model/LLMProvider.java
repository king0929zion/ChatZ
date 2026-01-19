package com.bot.core.model;

import B3.e;
import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import Y3.v;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class LLMProvider {
    public static final Companion Companion = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final f[] f11165o = {null, null, null, null, null, null, null, null, null, null, null, null, a.c(g.f9390c, new C0080m(6)), null};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11166b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11167c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11168d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11169e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11170f;

    /* renamed from: g, reason: collision with root package name */
    public final String f11171g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11172h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11173i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f11174j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f11175k;

    /* renamed from: l, reason: collision with root package name */
    public final String f11176l;

    /* renamed from: m, reason: collision with root package name */
    public final List f11177m;

    /* renamed from: n, reason: collision with root package name */
    public final long f11178n;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return LLMProvider$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LLMProvider(int i6, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, List list, long j3) {
        if (15 != (i6 & 15)) {
            AbstractC0252a0.j(i6, 15, LLMProvider$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11166b = str2;
        this.f11167c = str3;
        this.f11168d = str4;
        if ((i6 & 16) == 0) {
            this.f11169e = "openai";
        } else {
            this.f11169e = str5;
        }
        if ((i6 & 32) == 0) {
            this.f11170f = "chat_completions";
        } else {
            this.f11170f = str6;
        }
        if ((i6 & 64) == 0) {
            this.f11171g = "ai_studio";
        } else {
            this.f11171g = str7;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            this.f11172h = null;
        } else {
            this.f11172h = str8;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) == 0) {
            this.f11173i = null;
        } else {
            this.f11173i = str9;
        }
        if ((i6 & PegdownExtensions.STRIKETHROUGH) == 0) {
            this.f11174j = false;
        } else {
            this.f11174j = z5;
        }
        if ((i6 & PegdownExtensions.ANCHORLINKS) == 0) {
            this.f11175k = true;
        } else {
            this.f11175k = z6;
        }
        if ((i6 & 2048) == 0) {
            this.f11176l = null;
        } else {
            this.f11176l = str10;
        }
        this.f11177m = (i6 & 4096) == 0 ? v.f9812c : list;
        this.f11178n = (i6 & 8192) == 0 ? 0L : j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMProvider)) {
            return false;
        }
        LLMProvider lLMProvider = (LLMProvider) obj;
        return AbstractC1276k.b(this.a, lLMProvider.a) && AbstractC1276k.b(this.f11166b, lLMProvider.f11166b) && AbstractC1276k.b(this.f11167c, lLMProvider.f11167c) && AbstractC1276k.b(this.f11168d, lLMProvider.f11168d) && AbstractC1276k.b(this.f11169e, lLMProvider.f11169e) && AbstractC1276k.b(this.f11170f, lLMProvider.f11170f) && AbstractC1276k.b(this.f11171g, lLMProvider.f11171g) && AbstractC1276k.b(this.f11172h, lLMProvider.f11172h) && AbstractC1276k.b(this.f11173i, lLMProvider.f11173i) && this.f11174j == lLMProvider.f11174j && this.f11175k == lLMProvider.f11175k && AbstractC1276k.b(this.f11176l, lLMProvider.f11176l) && AbstractC1276k.b(this.f11177m, lLMProvider.f11177m) && this.f11178n == lLMProvider.f11178n;
    }

    public final int hashCode() {
        int e6 = e.e(e.e(e.e(e.e(e.e(e.e(this.a.hashCode() * 31, 31, this.f11166b), 31, this.f11167c), 31, this.f11168d), 31, this.f11169e), 31, this.f11170f), 31, this.f11171g);
        String str = this.f11172h;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f11173i;
        int d6 = AbstractC1135a.d(AbstractC1135a.d((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f11174j), 31, this.f11175k);
        String str3 = this.f11176l;
        return Long.hashCode(this.f11178n) + AbstractC1135a.e(this.f11177m, (d6 + (str3 != null ? str3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("LLMProvider(id=", this.a, ", providerType=", this.f11166b, ", name=");
        e.z(u5, this.f11167c, ", baseUrl=", this.f11168d, ", apiSchema=");
        e.z(u5, this.f11169e, ", openAiApiMode=", this.f11170f, ", googleApiMode=");
        e.z(u5, this.f11171g, ", googleProjectId=", this.f11172h, ", googleLocation=");
        u5.append(this.f11173i);
        u5.append(", isBuiltin=");
        u5.append(this.f11174j);
        u5.append(", isEnabled=");
        u5.append(this.f11175k);
        u5.append(", apiKey=");
        u5.append(this.f11176l);
        u5.append(", enabledModelIds=");
        u5.append(this.f11177m);
        u5.append(", sortOrder=");
        u5.append(this.f11178n);
        u5.append(")");
        return u5.toString();
    }

    public LLMProvider(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z5, boolean z6, String str10, List list, long j3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "providerType");
        AbstractC1276k.f(str3, Attribute.NAME_ATTR);
        AbstractC1276k.f(str4, "baseUrl");
        AbstractC1276k.f(str5, "apiSchema");
        AbstractC1276k.f(str6, "openAiApiMode");
        AbstractC1276k.f(str7, "googleApiMode");
        AbstractC1276k.f(list, "enabledModelIds");
        this.a = str;
        this.f11166b = str2;
        this.f11167c = str3;
        this.f11168d = str4;
        this.f11169e = str5;
        this.f11170f = str6;
        this.f11171g = str7;
        this.f11172h = str8;
        this.f11173i = str9;
        this.f11174j = z5;
        this.f11175k = z6;
        this.f11176l = str10;
        this.f11177m = list;
        this.f11178n = j3;
    }
}
