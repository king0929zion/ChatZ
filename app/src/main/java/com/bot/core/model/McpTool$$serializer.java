package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.n0;
import N4.s;
import O4.w;
import X3.c;
import Y4.d;
import com.vladsch.flexmark.util.html.Attribute;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class McpTool$$serializer implements C {
    public static final int $stable;
    public static final McpTool$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        McpTool$$serializer mcpTool$$serializer = new McpTool$$serializer();
        INSTANCE = mcpTool$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.McpTool", mcpTool$$serializer, 3);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("description", true);
        c0256c0.l("inputSchema", true);
        descriptor = c0256c0;
    }

    private McpTool$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, d.J(n0Var), d.J(s.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final McpTool deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        String str = null;
        boolean z5 = true;
        int i6 = 0;
        String str2 = null;
        kotlinx.serialization.json.c cVar = null;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else if (s5 == 0) {
                str = b5.q(serialDescriptor, 0);
                i6 |= 1;
            } else if (s5 == 1) {
                str2 = (String) b5.t(serialDescriptor, 1, n0.a, str2);
                i6 |= 2;
            } else {
                if (s5 != 2) {
                    throw new i(s5);
                }
                cVar = (kotlinx.serialization.json.c) b5.t(serialDescriptor, 2, s.a, cVar);
                i6 |= 4;
            }
        }
        b5.h(serialDescriptor);
        return new McpTool(i6, str, str2, cVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, McpTool mcpTool) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(mcpTool, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        String str = mcpTool.a;
        kotlinx.serialization.json.c cVar = mcpTool.f11218c;
        String str2 = mcpTool.f11217b;
        b5.x(serialDescriptor, 0, str);
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 1, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || cVar != null) {
            b5.v(serialDescriptor, 2, s.a, cVar);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
