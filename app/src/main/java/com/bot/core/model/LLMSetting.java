package com.bot.core.model;

import B3.e;
import I4.d;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class LLMSetting {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11197b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11199d;

    /* renamed from: e, reason: collision with root package name */
    public final float f11200e;

    /* renamed from: f, reason: collision with root package name */
    public final float f11201f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f11202g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f11203h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11204i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11205j;

    /* renamed from: k, reason: collision with root package name */
    public final String f11206k;

    /* renamed from: l, reason: collision with root package name */
    public final long f11207l;

    /* renamed from: m, reason: collision with root package name */
    public final long f11208m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f11209n;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return LLMSetting$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LLMSetting(int i6, String str, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, long j3, long j4, boolean z5) {
        if ((i6 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i6 & 2) == 0) {
            this.f11197b = FlexmarkHtmlConverter.DEFAULT_NODE;
        } else {
            this.f11197b = str2;
        }
        if ((i6 & 4) == 0) {
            this.f11198c = null;
        } else {
            this.f11198c = str3;
        }
        if ((i6 & 8) == 0) {
            this.f11199d = null;
        } else {
            this.f11199d = str4;
        }
        if ((i6 & 16) == 0) {
            this.f11200e = 1.0f;
        } else {
            this.f11200e = f6;
        }
        if ((i6 & 32) == 0) {
            this.f11201f = 1.0f;
        } else {
            this.f11201f = f7;
        }
        if ((i6 & 64) == 0) {
            this.f11202g = null;
        } else {
            this.f11202g = num;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            this.f11203h = null;
        } else {
            this.f11203h = num2;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) == 0) {
            this.f11204i = null;
        } else {
            this.f11204i = str5;
        }
        if ((i6 & PegdownExtensions.STRIKETHROUGH) == 0) {
            this.f11205j = null;
        } else {
            this.f11205j = str6;
        }
        if ((i6 & PegdownExtensions.ANCHORLINKS) == 0) {
            this.f11206k = null;
        } else {
            this.f11206k = str7;
        }
        if ((i6 & 2048) == 0) {
            this.f11207l = 0L;
        } else {
            this.f11207l = j3;
        }
        if ((i6 & 4096) == 0) {
            this.f11208m = 0L;
        } else {
            this.f11208m = j4;
        }
        this.f11209n = (i6 & 8192) == 0 ? false : z5;
    }

    public static LLMSetting a(LLMSetting lLMSetting, String str, String str2, String str3, float f6, float f7, Integer num, Integer num2, String str4, String str5, String str6, long j3, int i6) {
        long j4;
        long j5;
        String str7 = (i6 & 1) != 0 ? lLMSetting.a : "new";
        String str8 = (i6 & 2) != 0 ? lLMSetting.f11197b : str;
        String str9 = (i6 & 4) != 0 ? lLMSetting.f11198c : str2;
        String str10 = (i6 & 8) != 0 ? lLMSetting.f11199d : str3;
        float f8 = (i6 & 16) != 0 ? lLMSetting.f11200e : f6;
        float f9 = (i6 & 32) != 0 ? lLMSetting.f11201f : f7;
        Integer num3 = (i6 & 64) != 0 ? lLMSetting.f11202g : num;
        Integer num4 = (i6 & PegdownExtensions.FENCED_CODE_BLOCKS) != 0 ? lLMSetting.f11203h : num2;
        String str11 = (i6 & PegdownExtensions.WIKILINKS) != 0 ? lLMSetting.f11204i : str4;
        String str12 = (i6 & PegdownExtensions.STRIKETHROUGH) != 0 ? lLMSetting.f11205j : str5;
        String str13 = (i6 & PegdownExtensions.ANCHORLINKS) != 0 ? lLMSetting.f11206k : str6;
        long j6 = lLMSetting.f11207l;
        if ((i6 & 4096) != 0) {
            j4 = j6;
            j5 = lLMSetting.f11208m;
        } else {
            j4 = j6;
            j5 = j3;
        }
        boolean z5 = (i6 & 8192) != 0 ? lLMSetting.f11209n : false;
        lLMSetting.getClass();
        AbstractC1276k.f(str8, Attribute.NAME_ATTR);
        return new LLMSetting(str7, str8, str9, str10, f8, f9, num3, num4, str11, str12, str13, j4, j5, z5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LLMSetting)) {
            return false;
        }
        LLMSetting lLMSetting = (LLMSetting) obj;
        return AbstractC1276k.b(this.a, lLMSetting.a) && AbstractC1276k.b(this.f11197b, lLMSetting.f11197b) && AbstractC1276k.b(this.f11198c, lLMSetting.f11198c) && AbstractC1276k.b(this.f11199d, lLMSetting.f11199d) && Float.compare(this.f11200e, lLMSetting.f11200e) == 0 && Float.compare(this.f11201f, lLMSetting.f11201f) == 0 && AbstractC1276k.b(this.f11202g, lLMSetting.f11202g) && AbstractC1276k.b(this.f11203h, lLMSetting.f11203h) && AbstractC1276k.b(this.f11204i, lLMSetting.f11204i) && AbstractC1276k.b(this.f11205j, lLMSetting.f11205j) && AbstractC1276k.b(this.f11206k, lLMSetting.f11206k) && this.f11207l == lLMSetting.f11207l && this.f11208m == lLMSetting.f11208m && this.f11209n == lLMSetting.f11209n;
    }

    public final int hashCode() {
        String str = this.a;
        int e6 = e.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f11197b);
        String str2 = this.f11198c;
        int hashCode = (e6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11199d;
        int a = AbstractC1135a.a(this.f11201f, AbstractC1135a.a(this.f11200e, (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        Integer num = this.f11202g;
        int hashCode2 = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f11203h;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f11204i;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11205j;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f11206k;
        return Boolean.hashCode(this.f11209n) + AbstractC1135a.c(AbstractC1135a.c((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.f11207l), 31, this.f11208m);
    }

    public final String toString() {
        StringBuilder u5 = e.u("LLMSetting(id=", this.a, ", name=", this.f11197b, ", defaultModel=");
        e.z(u5, this.f11198c, ", prompt=", this.f11199d, ", temperature=");
        u5.append(this.f11200e);
        u5.append(", topP=");
        u5.append(this.f11201f);
        u5.append(", maxOutputTokens=");
        u5.append(this.f11202g);
        u5.append(", reasoningBudgetTokens=");
        u5.append(this.f11203h);
        u5.append(", customHeadersJson=");
        e.z(u5, this.f11204i, ", customBodyJson=", this.f11205j, ", avatarUri=");
        u5.append(this.f11206k);
        u5.append(", createdAt=");
        u5.append(this.f11207l);
        u5.append(", sortOrder=");
        u5.append(this.f11208m);
        u5.append(", isActive=");
        u5.append(this.f11209n);
        u5.append(")");
        return u5.toString();
    }

    public LLMSetting(String str, String str2, String str3, String str4, float f6, float f7, Integer num, Integer num2, String str5, String str6, String str7, long j3, long j4, boolean z5) {
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        this.a = str;
        this.f11197b = str2;
        this.f11198c = str3;
        this.f11199d = str4;
        this.f11200e = f6;
        this.f11201f = f7;
        this.f11202g = num;
        this.f11203h = num2;
        this.f11204i = str5;
        this.f11205j = str6;
        this.f11206k = str7;
        this.f11207l = j3;
        this.f11208m = j4;
        this.f11209n = z5;
    }
}
