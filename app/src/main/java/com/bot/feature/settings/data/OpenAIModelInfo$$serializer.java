package com.bot.feature.settings.data;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
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
public final /* synthetic */ class OpenAIModelInfo$$serializer implements C {
    public static final int $stable;
    public static final OpenAIModelInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OpenAIModelInfo$$serializer openAIModelInfo$$serializer = new OpenAIModelInfo$$serializer();
        INSTANCE = openAIModelInfo$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.feature.settings.data.OpenAIModelInfo", openAIModelInfo$$serializer, 2);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l("owned_by", true);
        descriptor = c0256c0;
    }

    private OpenAIModelInfo$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, d.J(n0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final OpenAIModelInfo deserialize(Decoder decoder) {
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
                str2 = (String) b5.t(serialDescriptor, 1, n0.a, str2);
                i6 |= 2;
            }
        }
        b5.h(serialDescriptor);
        return new OpenAIModelInfo(str, i6, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OpenAIModelInfo openAIModelInfo) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(openAIModelInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        String str = openAIModelInfo.a;
        String str2 = openAIModelInfo.f11268b;
        b5.x(serialDescriptor, 0, str);
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 1, n0.a, str2);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
