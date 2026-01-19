package com.bot.core.model;

import B3.e;
import D.C0080m;
import D2.b;
import I4.d;
import X3.a;
import X3.f;
import X3.g;
import com.vladsch.flexmark.parser.PegdownExtensions;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ReasoningRule {
    public static final Companion Companion = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final f[] f11245l = {null, null, null, null, null, a.c(g.f9390c, new C0080m(15)), null, null, null, null, null};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11248d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11249e;

    /* renamed from: f, reason: collision with root package name */
    public final b f11250f;

    /* renamed from: g, reason: collision with root package name */
    public final ReasoningParams f11251g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f11252h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f11253i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f11254j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f11255k;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ReasoningRule$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ReasoningRule(int i6, String str, String str2, String str3, String str4, String str5, b bVar, ReasoningParams reasoningParams, Boolean bool, Integer num, Boolean bool2, Boolean bool3) {
        if ((i6 & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i6 & 2) == 0) {
            this.f11246b = null;
        } else {
            this.f11246b = str2;
        }
        if ((i6 & 4) == 0) {
            this.f11247c = null;
        } else {
            this.f11247c = str3;
        }
        if ((i6 & 8) == 0) {
            this.f11248d = null;
        } else {
            this.f11248d = str4;
        }
        if ((i6 & 16) == 0) {
            this.f11249e = null;
        } else {
            this.f11249e = str5;
        }
        if ((i6 & 32) == 0) {
            this.f11250f = b.f1267e;
        } else {
            this.f11250f = bVar;
        }
        if ((i6 & 64) == 0) {
            this.f11251g = null;
        } else {
            this.f11251g = reasoningParams;
        }
        if ((i6 & PegdownExtensions.FENCED_CODE_BLOCKS) == 0) {
            this.f11252h = null;
        } else {
            this.f11252h = bool;
        }
        if ((i6 & PegdownExtensions.WIKILINKS) == 0) {
            this.f11253i = null;
        } else {
            this.f11253i = num;
        }
        if ((i6 & PegdownExtensions.STRIKETHROUGH) == 0) {
            this.f11254j = null;
        } else {
            this.f11254j = bool2;
        }
        if ((i6 & PegdownExtensions.ANCHORLINKS) == 0) {
            this.f11255k = null;
        } else {
            this.f11255k = bool3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReasoningRule)) {
            return false;
        }
        ReasoningRule reasoningRule = (ReasoningRule) obj;
        return AbstractC1276k.b(this.a, reasoningRule.a) && AbstractC1276k.b(this.f11246b, reasoningRule.f11246b) && AbstractC1276k.b(this.f11247c, reasoningRule.f11247c) && AbstractC1276k.b(this.f11248d, reasoningRule.f11248d) && AbstractC1276k.b(this.f11249e, reasoningRule.f11249e) && this.f11250f == reasoningRule.f11250f && AbstractC1276k.b(this.f11251g, reasoningRule.f11251g) && AbstractC1276k.b(this.f11252h, reasoningRule.f11252h) && AbstractC1276k.b(this.f11253i, reasoningRule.f11253i) && AbstractC1276k.b(this.f11254j, reasoningRule.f11254j) && AbstractC1276k.b(this.f11255k, reasoningRule.f11255k);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11246b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f11247c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f11248d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f11249e;
        int hashCode5 = (this.f11250f.hashCode() + ((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        ReasoningParams reasoningParams = this.f11251g;
        int hashCode6 = (hashCode5 + (reasoningParams == null ? 0 : reasoningParams.hashCode())) * 31;
        Boolean bool = this.f11252h;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f11253i;
        int hashCode8 = (hashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f11254j;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f11255k;
        return hashCode9 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = e.u("ReasoningRule(host=", this.a, ", providerType=", this.f11246b, ", apiSchema=");
        e.z(u5, this.f11247c, ", modelId=", this.f11248d, ", modelIdRegex=");
        u5.append(this.f11249e);
        u5.append(", strategy=");
        u5.append(this.f11250f);
        u5.append(", params=");
        u5.append(this.f11251g);
        u5.append(", supportsEffort=");
        u5.append(this.f11252h);
        u5.append(", maxBudget=");
        u5.append(this.f11253i);
        u5.append(", forceEnabled=");
        u5.append(this.f11254j);
        u5.append(", appendReasoningOnToolCall=");
        u5.append(this.f11255k);
        u5.append(")");
        return u5.toString();
    }

    public ReasoningRule(b bVar) {
        this.a = null;
        this.f11246b = null;
        this.f11247c = null;
        this.f11248d = null;
        this.f11249e = null;
        this.f11250f = bVar;
        this.f11251g = null;
        this.f11252h = null;
        this.f11253i = null;
        this.f11254j = null;
        this.f11255k = null;
    }
}
