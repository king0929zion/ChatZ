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
import com.vladsch.flexmark.parser.PegdownExtensions;
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
public final /* synthetic */ class MessageInfo$$serializer implements C {
    public static final int $stable;
    public static final MessageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        MessageInfo$$serializer messageInfo$$serializer = new MessageInfo$$serializer();
        INSTANCE = messageInfo$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.MessageInfo", messageInfo$$serializer, 8);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l("role", false);
        c0256c0.l("content", false);
        c0256c0.l("reasoning_content", true);
        c0256c0.l("reasoning_duration_ms", true);
        c0256c0.l("tool_calls", true);
        c0256c0.l("attachments", true);
        c0256c0.l("created_at", false);
        descriptor = c0256c0;
    }

    private MessageInfo$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = MessageInfo.f11227i;
        KSerializer J4 = d.J((KSerializer) fVarArr[3].getValue());
        KSerializer J5 = d.J(O.a);
        KSerializer J6 = d.J((KSerializer) fVarArr[5].getValue());
        KSerializer J7 = d.J((KSerializer) fVarArr[6].getValue());
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, n0Var, n0Var, J4, J5, J6, J7, n0Var};
    }

    @Override // kotlinx.serialization.KSerializer
    public final MessageInfo deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = MessageInfo.f11227i;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Long l3 = null;
        List list2 = null;
        List list3 = null;
        String str4 = null;
        int i6 = 0;
        boolean z5 = true;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            switch (s5) {
                case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    str = b5.q(serialDescriptor, 0);
                    i6 |= 1;
                    break;
                case 1:
                    str2 = b5.q(serialDescriptor, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str3 = b5.q(serialDescriptor, 2);
                    i6 |= 4;
                    break;
                case 3:
                    list = (List) b5.t(serialDescriptor, 3, (KSerializer) fVarArr[3].getValue(), list);
                    i6 |= 8;
                    break;
                case 4:
                    l3 = (Long) b5.t(serialDescriptor, 4, O.a, l3);
                    i6 |= 16;
                    break;
                case AbstractC1787b.f15290g /* 5 */:
                    list2 = (List) b5.t(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), list2);
                    i6 |= 32;
                    break;
                case 6:
                    list3 = (List) b5.t(serialDescriptor, 6, (KSerializer) fVarArr[6].getValue(), list3);
                    i6 |= 64;
                    break;
                case 7:
                    str4 = b5.q(serialDescriptor, 7);
                    i6 |= PegdownExtensions.FENCED_CODE_BLOCKS;
                    break;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new MessageInfo(i6, str, str2, str3, list, l3, list2, list3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, MessageInfo messageInfo) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(messageInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = MessageInfo.f11227i;
        String str = messageInfo.a;
        List list = messageInfo.f11233g;
        List list2 = messageInfo.f11232f;
        Long l3 = messageInfo.f11231e;
        List list3 = messageInfo.f11230d;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, messageInfo.f11228b);
        b5.x(serialDescriptor, 2, messageInfo.f11229c);
        if (b5.z(serialDescriptor) || list3 != null) {
            b5.v(serialDescriptor, 3, (KSerializer) fVarArr[3].getValue(), list3);
        }
        if (b5.z(serialDescriptor) || l3 != null) {
            b5.v(serialDescriptor, 4, O.a, l3);
        }
        if (b5.z(serialDescriptor) || list2 != null) {
            b5.v(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), list2);
        }
        if (b5.z(serialDescriptor) || list != null) {
            b5.v(serialDescriptor, 6, (KSerializer) fVarArr[6].getValue(), list);
        }
        b5.x(serialDescriptor, 7, messageInfo.f11234h);
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
