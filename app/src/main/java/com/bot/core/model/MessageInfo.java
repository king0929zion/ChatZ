package com.bot.core.model;

import B3.e;
import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class MessageInfo {
    public static final Companion Companion = new Object();

    /* renamed from: i, reason: collision with root package name */
    public static final f[] f11227i;
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11228b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11229c;

    /* renamed from: d, reason: collision with root package name */
    public final List f11230d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f11231e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11232f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11233g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11234h;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return MessageInfo$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.bot.core.model.MessageInfo$Companion] */
    static {
        C0080m c0080m = new C0080m(10);
        g gVar = g.f9390c;
        f11227i = new f[]{null, null, null, a.c(gVar, c0080m), null, a.c(gVar, new C0080m(11)), a.c(gVar, new C0080m(12)), null};
    }

    public /* synthetic */ MessageInfo(int i6, String str, String str2, String str3, List list, Long l3, List list2, List list3, String str4) {
        if (135 != (i6 & 135)) {
            AbstractC0252a0.j(i6, 135, MessageInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11228b = str2;
        this.f11229c = str3;
        if ((i6 & 8) == 0) {
            this.f11230d = null;
        } else {
            this.f11230d = list;
        }
        if ((i6 & 16) == 0) {
            this.f11231e = null;
        } else {
            this.f11231e = l3;
        }
        if ((i6 & 32) == 0) {
            this.f11232f = null;
        } else {
            this.f11232f = list2;
        }
        if ((i6 & 64) == 0) {
            this.f11233g = null;
        } else {
            this.f11233g = list3;
        }
        this.f11234h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageInfo)) {
            return false;
        }
        MessageInfo messageInfo = (MessageInfo) obj;
        return AbstractC1276k.b(this.a, messageInfo.a) && AbstractC1276k.b(this.f11228b, messageInfo.f11228b) && AbstractC1276k.b(this.f11229c, messageInfo.f11229c) && AbstractC1276k.b(this.f11230d, messageInfo.f11230d) && AbstractC1276k.b(this.f11231e, messageInfo.f11231e) && AbstractC1276k.b(this.f11232f, messageInfo.f11232f) && AbstractC1276k.b(this.f11233g, messageInfo.f11233g) && AbstractC1276k.b(this.f11234h, messageInfo.f11234h);
    }

    public final int hashCode() {
        int e6 = e.e(e.e(this.a.hashCode() * 31, 31, this.f11228b), 31, this.f11229c);
        List list = this.f11230d;
        int hashCode = (e6 + (list == null ? 0 : list.hashCode())) * 31;
        Long l3 = this.f11231e;
        int hashCode2 = (hashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        List list2 = this.f11232f;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f11233g;
        return this.f11234h.hashCode() + ((hashCode3 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("MessageInfo(id=", this.a, ", role=", this.f11228b, ", content=");
        u5.append(this.f11229c);
        u5.append(", reasoningContent=");
        u5.append(this.f11230d);
        u5.append(", reasoningDurationMs=");
        u5.append(this.f11231e);
        u5.append(", toolCalls=");
        u5.append(this.f11232f);
        u5.append(", attachments=");
        u5.append(this.f11233g);
        u5.append(", createdAt=");
        u5.append(this.f11234h);
        u5.append(")");
        return u5.toString();
    }

    public MessageInfo(String str, String str2, String str3, List list, Long l3, List list2, List list3, String str4) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, "role");
        AbstractC1276k.f(str3, "content");
        AbstractC1276k.f(str4, "createdAt");
        this.a = str;
        this.f11228b = str2;
        this.f11229c = str3;
        this.f11230d = list;
        this.f11231e = l3;
        this.f11232f = list2;
        this.f11233g = list3;
        this.f11234h = str4;
    }
}
