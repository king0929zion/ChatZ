package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.O;
import M4.n0;
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
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class MessageAttachment$$serializer implements C {
    public static final int $stable;
    public static final MessageAttachment$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MessageAttachment$$serializer messageAttachment$$serializer = new MessageAttachment$$serializer();
        INSTANCE = messageAttachment$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.MessageAttachment", messageAttachment$$serializer, 5);
        c0256c0.l("type", false);
        c0256c0.l("url", false);
        c0256c0.l(Attribute.NAME_ATTR, true);
        c0256c0.l("size", true);
        c0256c0.l("metadata", true);
        descriptor = c0256c0;
    }

    private MessageAttachment$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = MessageAttachment.f11222f;
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, n0Var, d.J(n0Var), d.J(O.a), d.J((KSerializer) fVarArr[4].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MessageAttachment deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = MessageAttachment.f11222f;
        int i6 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        Long l3 = null;
        Map map = null;
        boolean z5 = true;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else if (s5 == 0) {
                str = b5.q(serialDescriptor, 0);
                i6 |= 1;
            } else if (s5 == 1) {
                str2 = b5.q(serialDescriptor, 1);
                i6 |= 2;
            } else if (s5 == 2) {
                str3 = (String) b5.t(serialDescriptor, 2, n0.a, str3);
                i6 |= 4;
            } else if (s5 == 3) {
                l3 = (Long) b5.t(serialDescriptor, 3, O.a, l3);
                i6 |= 8;
            } else {
                if (s5 != 4) {
                    throw new i(s5);
                }
                map = (Map) b5.t(serialDescriptor, 4, (KSerializer) fVarArr[4].getValue(), map);
                i6 |= 16;
            }
        }
        b5.h(serialDescriptor);
        return new MessageAttachment(i6, str, str2, str3, l3, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MessageAttachment messageAttachment) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(messageAttachment, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = MessageAttachment.f11222f;
        String str = messageAttachment.a;
        Map map = messageAttachment.f11226e;
        Long l3 = messageAttachment.f11225d;
        String str2 = messageAttachment.f11224c;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, messageAttachment.f11223b);
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 2, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || l3 != null) {
            b5.v(serialDescriptor, 3, O.a, l3);
        }
        if (b5.z(serialDescriptor) || map != null) {
            b5.v(serialDescriptor, 4, (KSerializer) fVarArr[4].getValue(), map);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
