package com.bot.feature.settings.data;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import O4.w;
import X3.c;
import X3.f;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ModelIdsResponse$$serializer implements C {
    public static final int $stable;
    public static final ModelIdsResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ModelIdsResponse$$serializer modelIdsResponse$$serializer = new ModelIdsResponse$$serializer();
        INSTANCE = modelIdsResponse$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.feature.settings.data.ModelIdsResponse", modelIdsResponse$$serializer, 1);
        c0256c0.l("model_ids", false);
        descriptor = c0256c0;
    }

    private ModelIdsResponse$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ModelIdsResponse.f11266b[0].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ModelIdsResponse deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = ModelIdsResponse.f11266b;
        List list = null;
        boolean z5 = true;
        int i6 = 0;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else {
                if (s5 != 0) {
                    throw new i(s5);
                }
                list = (List) b5.x(serialDescriptor, 0, (KSerializer) fVarArr[0].getValue(), list);
                i6 = 1;
            }
        }
        b5.h(serialDescriptor);
        return new ModelIdsResponse(list, i6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ModelIdsResponse modelIdsResponse) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(modelIdsResponse, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        b5.w(serialDescriptor, 0, (KSerializer) ModelIdsResponse.f11266b[0].getValue(), modelIdsResponse.a);
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
