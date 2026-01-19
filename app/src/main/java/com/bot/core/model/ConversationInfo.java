package com.bot.core.model;

import B3.e;
import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import Y3.w;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ConversationInfo {
    public static final Companion Companion = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final f[] f11152n = {null, null, null, null, null, null, null, null, null, null, a.c(g.f9390c, new C0080m(5)), null, null};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11153b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11154c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11155d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11156e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11157f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11158g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11159h;

    /* renamed from: i, reason: collision with root package name */
    public final String f11160i;

    /* renamed from: j, reason: collision with root package name */
    public final String f11161j;

    /* renamed from: k, reason: collision with root package name */
    public final Map f11162k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11163l;

    /* renamed from: m, reason: collision with root package name */
    public final int f11164m;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ConversationInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ConversationInfo(int i6, String str, String str2, String str3, String str4, boolean z5, boolean z6, boolean z7, String str5, String str6, String str7, Map map, int i7, int i8) {
        if (391 != (i6 & 391)) {
            AbstractC0252a0.j(i6, 391, ConversationInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11153b = str2;
        this.f11154c = str3;
        if ((i6 & 8) == 0) {
            this.f11155d = null;
        } else {
            this.f11155d = str4;
        }
        if ((i6 & 16) == 0) {
            this.f11156e = false;
        } else {
            this.f11156e = z5;
        }
        if ((i6 & 32) == 0) {
            this.f11157f = false;
        } else {
            this.f11157f = z6;
        }
        if ((i6 & 64) == 0) {
            this.f11158g = false;
        } else {
            this.f11158g = z7;
        }
        this.f11159h = str5;
        this.f11160i = str6;
        if ((i6 & PegdownExtensions.STRIKETHROUGH) == 0) {
            this.f11161j = null;
        } else {
            this.f11161j = str7;
        }
        if ((i6 & PegdownExtensions.ANCHORLINKS) == 0) {
            this.f11162k = w.f9813c;
        } else {
            this.f11162k = map;
        }
        if ((i6 & 2048) == 0) {
            this.f11163l = 0;
        } else {
            this.f11163l = i7;
        }
        if ((i6 & 4096) == 0) {
            this.f11164m = 0;
        } else {
            this.f11164m = i8;
        }
    }

    public static ConversationInfo a(ConversationInfo conversationInfo, String str) {
        String str2 = conversationInfo.a;
        String str3 = conversationInfo.f11154c;
        String str4 = conversationInfo.f11155d;
        boolean z5 = conversationInfo.f11156e;
        boolean z6 = conversationInfo.f11157f;
        boolean z7 = conversationInfo.f11158g;
        String str5 = conversationInfo.f11159h;
        String str6 = conversationInfo.f11160i;
        String str7 = conversationInfo.f11161j;
        Map map = conversationInfo.f11162k;
        int i6 = conversationInfo.f11163l;
        int i7 = conversationInfo.f11164m;
        AbstractC1276k.f(str2, Attribute.ID_ATTR);
        AbstractC1276k.f(str3, "modelName");
        AbstractC1276k.f(str5, "createdAt");
        AbstractC1276k.f(str6, "updatedAt");
        return new ConversationInfo(str2, str, str3, str4, z5, z6, z7, str5, str6, str7, map, i6, i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConversationInfo)) {
            return false;
        }
        ConversationInfo conversationInfo = (ConversationInfo) obj;
        return AbstractC1276k.b(this.a, conversationInfo.a) && AbstractC1276k.b(this.f11153b, conversationInfo.f11153b) && AbstractC1276k.b(this.f11154c, conversationInfo.f11154c) && AbstractC1276k.b(this.f11155d, conversationInfo.f11155d) && this.f11156e == conversationInfo.f11156e && this.f11157f == conversationInfo.f11157f && this.f11158g == conversationInfo.f11158g && AbstractC1276k.b(this.f11159h, conversationInfo.f11159h) && AbstractC1276k.b(this.f11160i, conversationInfo.f11160i) && AbstractC1276k.b(this.f11161j, conversationInfo.f11161j) && AbstractC1276k.b(this.f11162k, conversationInfo.f11162k) && this.f11163l == conversationInfo.f11163l && this.f11164m == conversationInfo.f11164m;
    }

    public final int hashCode() {
        int e6 = e.e(e.e(this.a.hashCode() * 31, 31, this.f11153b), 31, this.f11154c);
        String str = this.f11155d;
        int e7 = e.e(e.e(AbstractC1135a.d(AbstractC1135a.d(AbstractC1135a.d((e6 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f11156e), 31, this.f11157f), 31, this.f11158g), 31, this.f11159h), 31, this.f11160i);
        String str2 = this.f11161j;
        int hashCode = (e7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f11162k;
        return Integer.hashCode(this.f11164m) + AbstractC1135a.b(this.f11163l, (hashCode + (map != null ? map.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("ConversationInfo(id=", this.a, ", title=", this.f11153b, ", modelName=");
        e.z(u5, this.f11154c, ", systemPrompt=", this.f11155d, ", isArchived=");
        u5.append(this.f11156e);
        u5.append(", isFavorited=");
        u5.append(this.f11157f);
        u5.append(", isShared=");
        u5.append(this.f11158g);
        u5.append(", createdAt=");
        u5.append(this.f11159h);
        u5.append(", updatedAt=");
        e.z(u5, this.f11160i, ", lastMessageAt=", this.f11161j, ", settings=");
        u5.append(this.f11162k);
        u5.append(", messageCount=");
        u5.append(this.f11163l);
        u5.append(", totalTokens=");
        return AbstractC1135a.i(u5, this.f11164m, ")");
    }

    public ConversationInfo(String str, String str2, String str3, String str4, boolean z5, boolean z6, boolean z7, String str5, String str6, String str7, Map map, int i6, int i7) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.TITLE_ATTR);
        AbstractC1276k.f(str3, "modelName");
        AbstractC1276k.f(str5, "createdAt");
        AbstractC1276k.f(str6, "updatedAt");
        this.a = str;
        this.f11153b = str2;
        this.f11154c = str3;
        this.f11155d = str4;
        this.f11156e = z5;
        this.f11157f = z6;
        this.f11158g = z7;
        this.f11159h = str5;
        this.f11160i = str6;
        this.f11161j = str7;
        this.f11162k = map;
        this.f11163l = i6;
        this.f11164m = i7;
    }
}
