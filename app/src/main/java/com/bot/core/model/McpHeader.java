package com.bot.core.model;

import B3.e;
import I4.d;
import M4.AbstractC0252a0;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class McpHeader {
    public static final Companion Companion = new Object();
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11210b;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return McpHeader$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ McpHeader(String str, int i6, String str2) {
        if (3 != (i6 & 3)) {
            AbstractC0252a0.j(i6, 3, McpHeader$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.f11210b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McpHeader)) {
            return false;
        }
        McpHeader mcpHeader = (McpHeader) obj;
        return AbstractC1276k.b(this.a, mcpHeader.a) && AbstractC1276k.b(this.f11210b, mcpHeader.f11210b);
    }

    public final int hashCode() {
        return this.f11210b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return e.o("McpHeader(key=", this.a, ", value=", this.f11210b, ")");
    }

    public McpHeader(String str, String str2) {
        AbstractC1276k.f(str, "key");
        AbstractC1276k.f(str2, "value");
        this.a = str;
        this.f11210b = str2;
    }
}
