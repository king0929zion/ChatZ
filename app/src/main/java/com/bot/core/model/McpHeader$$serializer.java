package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.n0;
import O4.w;
import X3.c;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class McpHeader$$serializer implements C {
    public static final int $stable;
    public static final McpHeader$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        McpHeader$$serializer mcpHeader$$serializer = new McpHeader$$serializer();
        INSTANCE = mcpHeader$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.McpHeader", mcpHeader$$serializer, 2);
        c0256c0.l("key", false);
        c0256c0.l("value", false);
        descriptor = c0256c0;
    }

    private McpHeader$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, n0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final McpHeader deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        String str = null;
        boolean z5 = true;
        int i6 = 0;
        String str2 = null;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else if (s5 == 0) {
                str = b5.q(serialDescriptor, 0);
                i6 |= 1;
            } else {
                if (s5 != 1) {
                    throw new i(s5);
                }
                str2 = b5.q(serialDescriptor, 1);
                i6 |= 2;
            }
        }
        b5.h(serialDescriptor);
        return new McpHeader(str, i6, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, McpHeader mcpHeader) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(mcpHeader, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        b5.x(serialDescriptor, 0, mcpHeader.a);
        b5.x(serialDescriptor, 1, mcpHeader.f11210b);
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
