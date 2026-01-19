package com.bot.core.database.dao;

import M2.b;
import N1.AbstractC0281c;
import N1.v;
import X1.a;
import X1.c;
import X3.y;
import Y4.d;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import com.bot.core.database.entity.McpServerEntity;
import com.vladsch.flexmark.util.html.Attribute;
import h5.e;
import java.util.ArrayList;
import java.util.List;
import m4.AbstractC1271f;
import m4.AbstractC1276k;
import p.O0;
import s4.InterfaceC1672b;
import z2.C2022e;

/* loaded from: classes.dex */
public final class McpServerDao_Impl implements McpServerDao {
    private final v __db;
    private final AbstractC0281c __insertAdapterOfMcpServerEntity;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: com.bot.core.database.dao.McpServerDao_Impl$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC0281c {
        @Override // N1.AbstractC0281c
        public String createQuery() {
            return "INSERT OR REPLACE INTO `mcp_servers` (`id`,`isEnabled`,`name`,`transportType`,`serverAddress`,`headersJson`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
        }

        @Override // N1.AbstractC0281c
        public void bind(c cVar, McpServerEntity mcpServerEntity) {
            AbstractC1276k.f(cVar, "statement");
            AbstractC1276k.f(mcpServerEntity, "entity");
            cVar.z(1, mcpServerEntity.getId());
            cVar.a(mcpServerEntity.isEnabled() ? 1L : 0L, 2);
            cVar.z(3, mcpServerEntity.getName());
            cVar.z(4, mcpServerEntity.getTransportType());
            cVar.z(5, mcpServerEntity.getServerAddress());
            cVar.z(6, mcpServerEntity.getHeadersJson());
            cVar.a(mcpServerEntity.getCreatedAt(), 7);
        }
    }

    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1271f abstractC1271f) {
            this();
        }

        public final List<InterfaceC1672b> getRequiredConverters() {
            return Y3.v.f9812c;
        }

        private Companion() {
        }
    }

    public McpServerDao_Impl(v vVar) {
        AbstractC1276k.f(vVar, "__db");
        this.__db = vVar;
        this.__insertAdapterOfMcpServerEntity = new AbstractC0281c() { // from class: com.bot.core.database.dao.McpServerDao_Impl.1
            @Override // N1.AbstractC0281c
            public String createQuery() {
                return "INSERT OR REPLACE INTO `mcp_servers` (`id`,`isEnabled`,`name`,`transportType`,`serverAddress`,`headersJson`,`createdAt`) VALUES (?,?,?,?,?,?,?)";
            }

            @Override // N1.AbstractC0281c
            public void bind(c cVar, McpServerEntity mcpServerEntity) {
                AbstractC1276k.f(cVar, "statement");
                AbstractC1276k.f(mcpServerEntity, "entity");
                cVar.z(1, mcpServerEntity.getId());
                cVar.a(mcpServerEntity.isEnabled() ? 1L : 0L, 2);
                cVar.z(3, mcpServerEntity.getName());
                cVar.z(4, mcpServerEntity.getTransportType());
                cVar.z(5, mcpServerEntity.getServerAddress());
                cVar.z(6, mcpServerEntity.getHeadersJson());
                cVar.a(mcpServerEntity.getCreatedAt(), 7);
            }
        };
    }

    public static final y clear$lambda$4(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final y delete$lambda$3(String str, String str2, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            c02.Z();
            c02.close();
            return y.a;
        } catch (Throwable th) {
            c02.close();
            throw th;
        }
    }

    public static final List getAll$lambda$1(String str, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "isEnabled");
            int H6 = d.H(c02, Attribute.NAME_ATTR);
            int H7 = d.H(c02, "transportType");
            int H8 = d.H(c02, "serverAddress");
            int H9 = d.H(c02, "headersJson");
            int H10 = d.H(c02, "createdAt");
            ArrayList arrayList = new ArrayList();
            while (c02.Z()) {
                arrayList.add(new McpServerEntity(c02.M(H3), ((int) c02.getLong(H5)) != 0, c02.M(H6), c02.M(H7), c02.M(H8), c02.M(H9), c02.getLong(H10)));
            }
            return arrayList;
        } finally {
            c02.close();
        }
    }

    public static final McpServerEntity getById$lambda$2(String str, String str2, a aVar) {
        McpServerEntity mcpServerEntity;
        AbstractC1276k.f(aVar, "_connection");
        c c02 = aVar.c0(str);
        try {
            c02.z(1, str2);
            int H3 = d.H(c02, Attribute.ID_ATTR);
            int H5 = d.H(c02, "isEnabled");
            int H6 = d.H(c02, Attribute.NAME_ATTR);
            int H7 = d.H(c02, "transportType");
            int H8 = d.H(c02, "serverAddress");
            int H9 = d.H(c02, "headersJson");
            int H10 = d.H(c02, "createdAt");
            if (c02.Z()) {
                mcpServerEntity = new McpServerEntity(c02.M(H3), ((int) c02.getLong(H5)) != 0, c02.M(H6), c02.M(H7), c02.M(H8), c02.M(H9), c02.getLong(H10));
            } else {
                mcpServerEntity = null;
            }
            return mcpServerEntity;
        } finally {
            c02.close();
        }
    }

    public static final y upsert$lambda$0(McpServerDao_Impl mcpServerDao_Impl, McpServerEntity mcpServerEntity, a aVar) {
        AbstractC1276k.f(aVar, "_connection");
        mcpServerDao_Impl.__insertAdapterOfMcpServerEntity.insert(aVar, mcpServerEntity);
        return y.a;
    }

    @Override // com.bot.core.database.dao.McpServerDao
    public Object clear(InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new O0(23), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.McpServerDao
    public Object delete(String str, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new b(str, 19), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }

    @Override // com.bot.core.database.dao.McpServerDao
    public Object getAll(InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new O0(24), true, false);
    }

    @Override // com.bot.core.database.dao.McpServerDao
    public Object getById(String str, InterfaceC0905c interfaceC0905c) {
        return e.c0(this.__db, interfaceC0905c, new b(str, 18), true, false);
    }

    @Override // com.bot.core.database.dao.McpServerDao
    public Object upsert(McpServerEntity mcpServerEntity, InterfaceC0905c interfaceC0905c) {
        Object c02 = e.c0(this.__db, interfaceC0905c, new C2022e(1, this, mcpServerEntity), false, true);
        return c02 == EnumC0927a.f11114c ? c02 : y.a;
    }
}
