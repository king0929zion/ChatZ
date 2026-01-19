package com.bot.core.database.entity;

import B3.e;
import com.vladsch.flexmark.util.html.Attribute;
import j1.AbstractC1135a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class McpServerEntity {
    public static final int $stable = 0;
    private final long createdAt;
    private final String headersJson;
    private final String id;
    private final boolean isEnabled;
    private final String name;
    private final String serverAddress;
    private final String transportType;

    public McpServerEntity(String str, boolean z5, String str2, String str3, String str4, String str5, long j3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        AbstractC1276k.f(str3, "transportType");
        AbstractC1276k.f(str4, "serverAddress");
        AbstractC1276k.f(str5, "headersJson");
        this.id = str;
        this.isEnabled = z5;
        this.name = str2;
        this.transportType = str3;
        this.serverAddress = str4;
        this.headersJson = str5;
        this.createdAt = j3;
    }

    public static /* synthetic */ McpServerEntity copy$default(McpServerEntity mcpServerEntity, String str, boolean z5, String str2, String str3, String str4, String str5, long j3, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = mcpServerEntity.id;
        }
        if ((i6 & 2) != 0) {
            z5 = mcpServerEntity.isEnabled;
        }
        if ((i6 & 4) != 0) {
            str2 = mcpServerEntity.name;
        }
        if ((i6 & 8) != 0) {
            str3 = mcpServerEntity.transportType;
        }
        if ((i6 & 16) != 0) {
            str4 = mcpServerEntity.serverAddress;
        }
        if ((i6 & 32) != 0) {
            str5 = mcpServerEntity.headersJson;
        }
        if ((i6 & 64) != 0) {
            j3 = mcpServerEntity.createdAt;
        }
        long j4 = j3;
        String str6 = str4;
        String str7 = str5;
        return mcpServerEntity.copy(str, z5, str2, str3, str6, str7, j4);
    }

    public final String component1() {
        return this.id;
    }

    public final boolean component2() {
        return this.isEnabled;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.transportType;
    }

    public final String component5() {
        return this.serverAddress;
    }

    public final String component6() {
        return this.headersJson;
    }

    public final long component7() {
        return this.createdAt;
    }

    public final McpServerEntity copy(String str, boolean z5, String str2, String str3, String str4, String str5, long j3) {
        AbstractC1276k.f(str, Attribute.ID_ATTR);
        AbstractC1276k.f(str2, Attribute.NAME_ATTR);
        AbstractC1276k.f(str3, "transportType");
        AbstractC1276k.f(str4, "serverAddress");
        AbstractC1276k.f(str5, "headersJson");
        return new McpServerEntity(str, z5, str2, str3, str4, str5, j3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof McpServerEntity)) {
            return false;
        }
        McpServerEntity mcpServerEntity = (McpServerEntity) obj;
        return AbstractC1276k.b(this.id, mcpServerEntity.id) && this.isEnabled == mcpServerEntity.isEnabled && AbstractC1276k.b(this.name, mcpServerEntity.name) && AbstractC1276k.b(this.transportType, mcpServerEntity.transportType) && AbstractC1276k.b(this.serverAddress, mcpServerEntity.serverAddress) && AbstractC1276k.b(this.headersJson, mcpServerEntity.headersJson) && this.createdAt == mcpServerEntity.createdAt;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final String getHeadersJson() {
        return this.headersJson;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getServerAddress() {
        return this.serverAddress;
    }

    public final String getTransportType() {
        return this.transportType;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + e.e(e.e(e.e(e.e(AbstractC1135a.d(this.id.hashCode() * 31, 31, this.isEnabled), 31, this.name), 31, this.transportType), 31, this.serverAddress), 31, this.headersJson);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        String str = this.id;
        boolean z5 = this.isEnabled;
        String str2 = this.name;
        String str3 = this.transportType;
        String str4 = this.serverAddress;
        String str5 = this.headersJson;
        long j3 = this.createdAt;
        StringBuilder sb = new StringBuilder("McpServerEntity(id=");
        sb.append(str);
        sb.append(", isEnabled=");
        sb.append(z5);
        sb.append(", name=");
        e.z(sb, str2, ", transportType=", str3, ", serverAddress=");
        e.z(sb, str4, ", headersJson=", str5, ", createdAt=");
        sb.append(j3);
        sb.append(")");
        return sb.toString();
    }
}
