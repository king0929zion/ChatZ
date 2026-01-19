package com.bot.core.model;

import B3.e;
import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import Y3.v;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import java.util.List;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class McpServer {
    public static final Companion Companion = new Object();

    /* renamed from: g, reason: collision with root package name */
    public static final f[] f11211g = {null, null, null, null, null, a.c(g.f9390c, new C0080m(8))};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11212b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11213c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11214d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11215e;

    /* renamed from: f, reason: collision with root package name */
    public final List f11216f;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return McpServer$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ McpServer(int i6, String str, boolean z5, String str2, String str3, String str4, List list) {
        if (31 != (i6 & 31)) {
            AbstractC0252a0.j(i6, 31, McpServer$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11212b = z5;
        this.f11213c = str2;
        this.f11214d = str3;
        this.f11215e = str4;
        if ((i6 & 32) == 0) {
            this.f11216f = v.f9812c;
        } else {
            this.f11216f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McpServer)) {
            return false;
        }
        McpServer mcpServer = (McpServer) obj;
        return AbstractC1276k.b(this.a, mcpServer.a) && this.f11212b == mcpServer.f11212b && AbstractC1276k.b(this.f11213c, mcpServer.f11213c) && AbstractC1276k.b(this.f11214d, mcpServer.f11214d) && AbstractC1276k.b(this.f11215e, mcpServer.f11215e) && AbstractC1276k.b(this.f11216f, mcpServer.f11216f);
    }

    public final int hashCode() {
        return this.f11216f.hashCode() + e.e(e.e(e.e(AbstractC1135a.d(this.a.hashCode() * 31, 31, this.f11212b), 31, this.f11213c), 31, this.f11214d), 31, this.f11215e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("McpServer(id=");
        sb.append(this.a);
        sb.append(", isEnabled=");
        sb.append(this.f11212b);
        sb.append(", name=");
        e.z(sb, this.f11213c, ", transportType=", this.f11214d, ", serverAddress=");
        sb.append(this.f11215e);
        sb.append(", headers=");
        sb.append(this.f11216f);
        sb.append(")");
        return sb.toString();
    }

    public McpServer(String str, boolean z5, String str2, String str3, String str4, List list) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        AbstractC1276k.f(str3, "transportType");
        AbstractC1276k.f(str4, "serverAddress");
        AbstractC1276k.f(list, "headers");
        this.a = str;
        this.f11212b = z5;
        this.f11213c = str2;
        this.f11214d = str3;
        this.f11215e = str4;
        this.f11216f = list;
    }
}
