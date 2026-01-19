package com.bot.core.model;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.c;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class McpTool {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11217b;

    /* renamed from: c, reason: collision with root package name */
    public final c f11218c;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return McpTool$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ McpTool(int i6, String str, String str2, c cVar) {
        if (1 != (i6 & 1)) {
            AbstractC0252a0.j(i6, 1, McpTool$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i6 & 2) == 0) {
            this.f11217b = null;
        } else {
            this.f11217b = str2;
        }
        if ((i6 & 4) == 0) {
            this.f11218c = null;
        } else {
            this.f11218c = cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McpTool)) {
            return false;
        }
        McpTool mcpTool = (McpTool) obj;
        return AbstractC1276k.b(this.a, mcpTool.a) && AbstractC1276k.b(this.f11217b, mcpTool.f11217b) && AbstractC1276k.b(this.f11218c, mcpTool.f11218c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.f11217b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        c cVar = this.f11218c;
        return hashCode2 + (cVar != null ? cVar.f12633c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u5 = e.u("McpTool(name=", this.a, ", description=", this.f11217b, ", inputSchema=");
        u5.append(this.f11218c);
        u5.append(")");
        return u5.toString();
    }

    public McpTool(String str, String str2, c cVar) {
        this.a = str;
        this.f11217b = str2;
        this.f11218c = cVar;
    }
}
