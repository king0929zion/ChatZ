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
import X3.f;
import Y3.v;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.builder.SegmentStats;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import v.AbstractC1787b;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class McpServer$$serializer implements C {
    public static final int $stable;
    public static final McpServer$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        McpServer$$serializer mcpServer$$serializer = new McpServer$$serializer();
        INSTANCE = mcpServer$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.McpServer", mcpServer$$serializer, 6);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l("is_enabled", false);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("transport_type", false);
        c0256c0.l("server_address", false);
        c0256c0.l("headers", true);
        descriptor = c0256c0;
    }

    private McpServer$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = McpServer.f11211g;
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, C0259f.a, n0Var, n0Var, n0Var, fVarArr[5].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final McpServer deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = McpServer.f11211g;
        int i6 = 0;
        boolean z5 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        boolean z6 = true;
        while (z6) {
            int s5 = b5.s(serialDescriptor);
            switch (s5) {
                case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                    z6 = false;
                    break;
                case 0:
                    str = b5.q(serialDescriptor, 0);
                    i6 |= 1;
                    break;
                case 1:
                    z5 = b5.o(serialDescriptor, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str2 = b5.q(serialDescriptor, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str3 = b5.q(serialDescriptor, 3);
                    i6 |= 8;
                    break;
                case 4:
                    str4 = b5.q(serialDescriptor, 4);
                    i6 |= 16;
                    break;
                case AbstractC1787b.f15290g /* 5 */:
                    list = (List) b5.x(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), list);
                    i6 |= 32;
                    break;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new McpServer(i6, str, z5, str2, str3, str4, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, McpServer mcpServer) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(mcpServer, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = McpServer.f11211g;
        String str = mcpServer.a;
        List list = mcpServer.f11216f;
        b5.x(serialDescriptor, 0, str);
        b5.q(serialDescriptor, 1, mcpServer.f11212b);
        b5.x(serialDescriptor, 2, mcpServer.f11213c);
        b5.x(serialDescriptor, 3, mcpServer.f11214d);
        b5.x(serialDescriptor, 4, mcpServer.f11215e);
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(list, v.f9812c)) {
            b5.w(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), list);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
