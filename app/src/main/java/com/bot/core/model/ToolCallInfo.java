package com.bot.core.model;

import D.C0080m;
import I4.d;
import M4.AbstractC0252a0;
import X3.a;
import X3.f;
import X3.g;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import m4.AbstractC1276k;

@d
/* loaded from: classes.dex */
public final class ToolCallInfo {
    public static final Companion Companion = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final f[] f11256e = {null, a.c(g.f9390c, new C0080m(17)), null, null};
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f11257b;

    /* renamed from: c, reason: collision with root package name */
    public final b f11258c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11259d;

    /* loaded from: classes.dex */
    public static final class Companion {
        public final KSerializer serializer() {
            return ToolCallInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ToolCallInfo(int i6, String str, Map map, b bVar, boolean z5) {
        if (1 != (i6 & 1)) {
            AbstractC0252a0.j(i6, 1, ToolCallInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i6 & 2) == 0) {
            this.f11257b = null;
        } else {
            this.f11257b = map;
        }
        if ((i6 & 4) == 0) {
            this.f11258c = null;
        } else {
            this.f11258c = bVar;
        }
        if ((i6 & 8) == 0) {
            this.f11259d = true;
        } else {
            this.f11259d = z5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ToolCallInfo)) {
            return false;
        }
        ToolCallInfo toolCallInfo = (ToolCallInfo) obj;
        return AbstractC1276k.b(this.a, toolCallInfo.a) && AbstractC1276k.b(this.f11257b, toolCallInfo.f11257b) && AbstractC1276k.b(this.f11258c, toolCallInfo.f11258c) && this.f11259d == toolCallInfo.f11259d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Map map = this.f11257b;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        b bVar = this.f11258c;
        return Boolean.hashCode(this.f11259d) + ((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ToolCallInfo(name=" + this.a + ", arguments=" + this.f11257b + ", result=" + this.f11258c + ", success=" + this.f11259d + ")";
    }

    public ToolCallInfo(String str, LinkedHashMap linkedHashMap, kotlinx.serialization.json.d dVar, boolean z5) {
        AbstractC1276k.f(str, Attribute.NAME_ATTR);
        this.a = str;
        this.f11257b = linkedHashMap;
        this.f11258c = dVar;
        this.f11259d = z5;
    }
}
