package com.bot.feature.settings.data;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.n0;
import O4.w;
import X3.c;
import X3.f;
import Y4.d;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class VendorConfig$$serializer implements C {
    public static final int $stable;
    public static final VendorConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VendorConfig$$serializer vendorConfig$$serializer = new VendorConfig$$serializer();
        INSTANCE = vendorConfig$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.feature.settings.data.VendorConfig", vendorConfig$$serializer, 3);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l("display_name", false);
        c0256c0.l("models", false);
        descriptor = c0256c0;
    }

    private VendorConfig$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = VendorConfig.f11270d;
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, d.J(n0Var), fVarArr[2].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final VendorConfig deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = VendorConfig.f11270d;
        String str = null;
        boolean z5 = true;
        int i6 = 0;
        String str2 = null;
        List list = null;
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
                list = (List) b5.x(serialDescriptor, 2, (KSerializer) fVarArr[2].getValue(), list);
                i6 |= 4;
            }
        }
        b5.h(serialDescriptor);
        return new VendorConfig(i6, str, str2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VendorConfig vendorConfig) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(vendorConfig, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = VendorConfig.f11270d;
        b5.x(serialDescriptor, 0, vendorConfig.a);
        b5.v(serialDescriptor, 1, n0.a, vendorConfig.f11271b);
        b5.w(serialDescriptor, 2, (KSerializer) fVarArr[2].getValue(), vendorConfig.f11272c);
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
