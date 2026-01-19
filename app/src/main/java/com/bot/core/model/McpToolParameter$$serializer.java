package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.C0259f;
import M4.n0;
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
public final /* synthetic */ class McpToolParameter$$serializer implements C {
    public static final int $stable;
    public static final McpToolParameter$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        McpToolParameter$$serializer mcpToolParameter$$serializer = new McpToolParameter$$serializer();
        INSTANCE = mcpToolParameter$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.McpToolParameter", mcpToolParameter$$serializer, 4);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("type", false);
        c0256c0.l("description", true);
        c0256c0.l("required", true);
        descriptor = c0256c0;
    }

    private McpToolParameter$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, n0Var, d.J(n0Var), C0259f.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final McpToolParameter deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        int i6 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z6 = true;
        while (z6) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z6 = false;
            } else if (s5 == 0) {
                str = b5.q(serialDescriptor, 0);
                i6 |= 1;
            } else if (s5 == 1) {
                str2 = b5.q(serialDescriptor, 1);
                i6 |= 2;
            } else if (s5 == 2) {
                str3 = (String) b5.t(serialDescriptor, 2, n0.a, str3);
                i6 |= 4;
            } else {
                if (s5 != 3) {
                    throw new i(s5);
                }
                z5 = b5.o(serialDescriptor, 3);
                i6 |= 8;
            }
        }
        b5.h(serialDescriptor);
        return new McpToolParameter(str, i6, str2, str3, z5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, McpToolParameter mcpToolParameter) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(mcpToolParameter, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        String str = mcpToolParameter.a;
        boolean z5 = mcpToolParameter.f11221d;
        String str2 = mcpToolParameter.f11220c;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, mcpToolParameter.f11219b);
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 2, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || z5) {
            b5.q(serialDescriptor, 3, z5);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
