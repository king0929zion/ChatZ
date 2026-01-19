package com.bot.core.model;

import B3.e;
import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class MessageAttachment {
    public static final Companion Companion = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final f[] f11222f = {null, null, null, null, a.c(g.f9390c, new C0080m(9))};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11223b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11224c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f11225d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f11226e;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return MessageAttachment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MessageAttachment(int i6, String str, String str2, String str3, Long l3, Map map) {
        if (3 != (i6 & 3)) {
            AbstractC0252a0.j(i6, 3, MessageAttachment$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11223b = str2;
        if ((i6 & 4) == 0) {
            this.f11224c = null;
        } else {
            this.f11224c = str3;
        }
        if ((i6 & 8) == 0) {
            this.f11225d = null;
        } else {
            this.f11225d = l3;
        }
        if ((i6 & 16) == 0) {
            this.f11226e = null;
        } else {
            this.f11226e = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageAttachment)) {
            return false;
        }
        MessageAttachment messageAttachment = (MessageAttachment) obj;
        return AbstractC1276k.b(this.a, messageAttachment.a) && AbstractC1276k.b(this.f11223b, messageAttachment.f11223b) && AbstractC1276k.b(this.f11224c, messageAttachment.f11224c) && AbstractC1276k.b(this.f11225d, messageAttachment.f11225d) && AbstractC1276k.b(this.f11226e, messageAttachment.f11226e);
    }

    public final int hashCode() {
        int e6 = e.e(this.a.hashCode() * 31, 31, this.f11223b);
        String str = this.f11224c;
        int hashCode = (e6 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.f11225d;
        int hashCode2 = (hashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        Map map = this.f11226e;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = e.u("MessageAttachment(type=", this.a, ", url=", this.f11223b, ", name=");
        u5.append(this.f11224c);
        u5.append(", size=");
        u5.append(this.f11225d);
        u5.append(", metadata=");
        u5.append(this.f11226e);
        u5.append(")");
        return u5.toString();
    }

    public /* synthetic */ MessageAttachment(String str) {
        this("image", str, null, null, null);
    }

    public MessageAttachment(String str, String str2, String str3, Long l3, Map map) {
        AbstractC1276k.f(str2, "url");
        this.a = str;
        this.f11223b = str2;
        this.f11224c = str3;
        this.f11225d = l3;
        this.f11226e = map;
    }
}
