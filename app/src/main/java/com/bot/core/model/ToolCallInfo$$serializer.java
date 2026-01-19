package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.C0259f;
import M4.n0;
import N4.k;
import O4.w;
import X3.c;
import X3.f;
import Y4.d;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ToolCallInfo$$serializer implements C {
    public static final int $stable;
    public static final ToolCallInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ToolCallInfo$$serializer toolCallInfo$$serializer = new ToolCallInfo$$serializer();
        INSTANCE = toolCallInfo$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ToolCallInfo", toolCallInfo$$serializer, 4);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("arguments", true);
        c0256c0.l("result", true);
        c0256c0.l("success", true);
        descriptor = c0256c0;
    }

    private ToolCallInfo$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{n0.a, d.J((KSerializer) ToolCallInfo.f11256e[1].getValue()), d.J(k.a), C0259f.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ToolCallInfo deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = ToolCallInfo.f11256e;
        int i6 = 0;
        boolean z5 = false;
        String str = null;
        Map map = null;
        b bVar = null;
        boolean z6 = true;
        while (z6) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z6 = false;
            } else if (s5 == 0) {
                str = b5.q(serialDescriptor, 0);
                i6 |= 1;
            } else if (s5 == 1) {
                map = (Map) b5.t(serialDescriptor, 1, (KSerializer) fVarArr[1].getValue(), map);
                i6 |= 2;
            } else if (s5 == 2) {
                bVar = (b) b5.t(serialDescriptor, 2, k.a, bVar);
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
        return new ToolCallInfo(i6, str, map, bVar, z5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ToolCallInfo toolCallInfo) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(toolCallInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = ToolCallInfo.f11256e;
        String str = toolCallInfo.a;
        boolean z5 = toolCallInfo.f11259d;
        b bVar = toolCallInfo.f11258c;
        Map map = toolCallInfo.f11257b;
        b5.x(serialDescriptor, 0, str);
        if (b5.z(serialDescriptor) || map != null) {
            b5.v(serialDescriptor, 1, (KSerializer) fVarArr[1].getValue(), map);
        }
        if (b5.z(serialDescriptor) || bVar != null) {
            b5.v(serialDescriptor, 2, k.a, bVar);
        }
        if (b5.z(serialDescriptor) || !z5) {
            b5.q(serialDescriptor, 3, z5);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
