package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.C0259f;
import M4.J;
import M4.n0;
import O4.w;
import X3.c;
import X3.f;
import Y4.d;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.builder.SegmentStats;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import v.AbstractC1787b;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ConversationInfo$$serializer implements C {
    public static final int $stable;
    public static final ConversationInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConversationInfo$$serializer conversationInfo$$serializer = new ConversationInfo$$serializer();
        INSTANCE = conversationInfo$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ConversationInfo", conversationInfo$$serializer, 13);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l(Attribute.TITLE_ATTR, false);
        c0256c0.l("model_name", false);
        c0256c0.l("system_prompt", true);
        c0256c0.l("is_archived", true);
        c0256c0.l("is_favorited", true);
        c0256c0.l("is_shared", true);
        c0256c0.l("created_at", false);
        c0256c0.l("updated_at", false);
        c0256c0.l("last_message_at", true);
        c0256c0.l("settings", true);
        c0256c0.l("message_count", true);
        c0256c0.l("total_tokens", true);
        descriptor = c0256c0;
    }

    private ConversationInfo$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = ConversationInfo.f11152n;
        n0 n0Var = n0.a;
        KSerializer J4 = d.J(n0Var);
        KSerializer J5 = d.J(n0Var);
        KSerializer J6 = d.J((KSerializer) fVarArr[10].getValue());
        C0259f c0259f = C0259f.a;
        J j3 = J.a;
        return new KSerializer[]{n0Var, n0Var, n0Var, J4, c0259f, c0259f, c0259f, n0Var, n0Var, J5, J6, j3, j3};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConversationInfo deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr = ConversationInfo.f11152n;
        String str = null;
        Map map = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z5 = true;
        int i6 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int i7 = 0;
        int i8 = 0;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            switch (s5) {
                case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                    z5 = false;
                    break;
                case 0:
                    str2 = b5.q(serialDescriptor, 0);
                    i6 |= 1;
                    break;
                case 1:
                    str3 = b5.q(serialDescriptor, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str4 = b5.q(serialDescriptor, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str5 = (String) b5.t(serialDescriptor, 3, n0.a, str5);
                    i6 |= 8;
                    break;
                case 4:
                    z6 = b5.o(serialDescriptor, 4);
                    i6 |= 16;
                    break;
                case AbstractC1787b.f15290g /* 5 */:
                    z7 = b5.o(serialDescriptor, 5);
                    i6 |= 32;
                    break;
                case 6:
                    z8 = b5.o(serialDescriptor, 6);
                    i6 |= 64;
                    break;
                case 7:
                    str6 = b5.q(serialDescriptor, 7);
                    i6 |= PegdownExtensions.FENCED_CODE_BLOCKS;
                    break;
                case 8:
                    str7 = b5.q(serialDescriptor, 8);
                    i6 |= PegdownExtensions.WIKILINKS;
                    break;
                case AbstractC1787b.f15287d /* 9 */:
                    str = (String) b5.t(serialDescriptor, 9, n0.a, str);
                    i6 |= PegdownExtensions.STRIKETHROUGH;
                    break;
                case AbstractC1787b.f15289f /* 10 */:
                    map = (Map) b5.t(serialDescriptor, 10, (KSerializer) fVarArr[10].getValue(), map);
                    i6 |= PegdownExtensions.ANCHORLINKS;
                    break;
                case 11:
                    i7 = b5.l(serialDescriptor, 11);
                    i6 |= 2048;
                    break;
                case 12:
                    i8 = b5.l(serialDescriptor, 12);
                    i6 |= 4096;
                    break;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new ConversationInfo(i6, str2, str3, str4, str5, z6, z7, z8, str6, str7, str, map, i7, i8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConversationInfo conversationInfo) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(conversationInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = ConversationInfo.f11152n;
        String str = conversationInfo.a;
        int i6 = conversationInfo.f11164m;
        int i7 = conversationInfo.f11163l;
        Map map = conversationInfo.f11162k;
        String str2 = conversationInfo.f11161j;
        boolean z5 = conversationInfo.f11158g;
        boolean z6 = conversationInfo.f11157f;
        boolean z7 = conversationInfo.f11156e;
        String str3 = conversationInfo.f11155d;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, conversationInfo.f11153b);
        b5.x(serialDescriptor, 2, conversationInfo.f11154c);
        if (b5.z(serialDescriptor) || str3 != null) {
            b5.v(serialDescriptor, 3, n0.a, str3);
        }
        if (b5.z(serialDescriptor) || z7) {
            b5.q(serialDescriptor, 4, z7);
        }
        if (b5.z(serialDescriptor) || z6) {
            b5.q(serialDescriptor, 5, z6);
        }
        if (b5.z(serialDescriptor) || z5) {
            b5.q(serialDescriptor, 6, z5);
        }
        b5.x(serialDescriptor, 7, conversationInfo.f11159h);
        b5.x(serialDescriptor, 8, conversationInfo.f11160i);
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 9, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(map, Y3.w.f9813c)) {
            b5.v(serialDescriptor, 10, (KSerializer) fVarArr[10].getValue(), map);
        }
        if (b5.z(serialDescriptor) || i7 != 0) {
            b5.t(11, i7, serialDescriptor);
        }
        if (b5.z(serialDescriptor) || i6 != 0) {
            b5.t(12, i6, serialDescriptor);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
