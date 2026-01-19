package com.bot.core.model;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import com.vladsch.flexmark.util.html.Attribute;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class McpToolParameter {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11219b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11220c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11221d;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return McpToolParameter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ McpToolParameter(String str, int i6, String str2, String str3, boolean z5) {
        if (3 != (i6 & 3)) {
            AbstractC0252a0.j(i6, 3, McpToolParameter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11219b = str2;
        if ((i6 & 4) == 0) {
            this.f11220c = null;
        } else {
            this.f11220c = str3;
        }
        if ((i6 & 8) == 0) {
            this.f11221d = false;
        } else {
            this.f11221d = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McpToolParameter)) {
            return false;
        }
        McpToolParameter mcpToolParameter = (McpToolParameter) obj;
        return AbstractC1276k.b(this.a, mcpToolParameter.a) && AbstractC1276k.b(this.f11219b, mcpToolParameter.f11219b) && AbstractC1276k.b(this.f11220c, mcpToolParameter.f11220c) && this.f11221d == mcpToolParameter.f11221d;
    }

    public final int hashCode() {
        int e6 = e.e(this.a.hashCode() * 31, 31, this.f11219b);
        String str = this.f11220c;
        return Boolean.hashCode(this.f11221d) + ((e6 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder u5 = e.u("McpToolParameter(name=", this.a, ", type=", this.f11219b, ", description=");
        u5.append(this.f11220c);
        u5.append(", required=");
        u5.append(this.f11221d);
        u5.append(")");
        return u5.toString();
    }

    public McpToolParameter(String str, String str2, String str3, boolean z5) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        this.a = str;
        this.f11219b = str2;
        this.f11220c = str3;
        this.f11221d = z5;
    }
}
