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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ReasoningParams$$serializer implements C {
    public static final int $stable;
    public static final ReasoningParams$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReasoningParams$$serializer reasoningParams$$serializer = new ReasoningParams$$serializer();
        INSTANCE = reasoningParams$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ReasoningParams", reasoningParams$$serializer, 3);
        c0256c0.l("enabled_body", true);
        c0256c0.l("disabled_body", true);
        c0256c0.l("budget_key", true);
        descriptor = c0256c0;
    }

    private ReasoningParams$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        s sVar = s.a;
        return new KSerializer[]{d.J(sVar), d.J(sVar), d.J(n0.a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ReasoningParams deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        kotlinx.serialization.json.c cVar = null;
        boolean z5 = true;
        int i6 = 0;
        kotlinx.serialization.json.c cVar2 = null;
        String str = null;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else if (s5 == 0) {
                cVar = (kotlinx.serialization.json.c) b5.t(serialDescriptor, 0, s.a, cVar);
                i6 |= 1;
            } else if (s5 == 1) {
                cVar2 = (kotlinx.serialization.json.c) b5.t(serialDescriptor, 1, s.a, cVar2);
                i6 |= 2;
            } else {
                if (s5 != 2) {
                    throw new i(s5);
                }
                str = (String) b5.t(serialDescriptor, 2, n0.a, str);
                i6 |= 4;
            }
        }
        b5.h(serialDescriptor);
        return new ReasoningParams(i6, cVar, cVar2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReasoningParams reasoningParams) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(reasoningParams, "value");
        String str = reasoningParams.f11244c;
        kotlinx.serialization.json.c cVar = reasoningParams.f11243b;
        kotlinx.serialization.json.c cVar2 = reasoningParams.a;
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        if (b5.z(serialDescriptor) || cVar2 != null) {
            b5.v(serialDescriptor, 0, s.a, cVar2);
        }
        if (b5.z(serialDescriptor) || cVar != null) {
            b5.v(serialDescriptor, 1, s.a, cVar);
        }
        if (b5.z(serialDescriptor) || str != null) {
            b5.v(serialDescriptor, 2, n0.a, str);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
