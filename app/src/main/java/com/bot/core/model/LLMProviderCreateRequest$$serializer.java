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
import Y4.d;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.html.Attribute;
import com.vladsch.flexmark.util.sequence.builder.SegmentStats;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import v.AbstractC1787b;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class LLMProviderCreateRequest$$serializer implements C {
    public static final int $stable;
    public static final LLMProviderCreateRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LLMProviderCreateRequest$$serializer lLMProviderCreateRequest$$serializer = new LLMProviderCreateRequest$$serializer();
        INSTANCE = lLMProviderCreateRequest$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.LLMProviderCreateRequest", lLMProviderCreateRequest$$serializer, 10);
        c0256c0.l("provider_type", false);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("base_url", false);
        c0256c0.l("api_schema", true);
        c0256c0.l("openai_api_mode", true);
        c0256c0.l("google_api_mode", true);
        c0256c0.l("google_project_id", true);
        c0256c0.l("google_location", true);
        c0256c0.l("api_key", true);
        c0256c0.l("is_enabled", true);
        descriptor = c0256c0;
    }

    private LLMProviderCreateRequest$$serializer() {
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{n0Var, n0Var, n0Var, n0Var, n0Var, n0Var, d.J(n0Var), d.J(n0Var), d.J(n0Var), C0259f.a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final LLMProviderCreateRequest deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i6 = 0;
        boolean z5 = false;
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
                    str2 = b5.q(serialDescriptor, 1);
                    i6 |= 2;
                    break;
                case 2:
                    str3 = b5.q(serialDescriptor, 2);
                    i6 |= 4;
                    break;
                case 3:
                    str4 = b5.q(serialDescriptor, 3);
                    i6 |= 8;
                    break;
                case 4:
                    str5 = b5.q(serialDescriptor, 4);
                    i6 |= 16;
                    break;
                case AbstractC1787b.f15290g /* 5 */:
                    str6 = b5.q(serialDescriptor, 5);
                    i6 |= 32;
                    break;
                case 6:
                    str7 = (String) b5.t(serialDescriptor, 6, n0.a, str7);
                    i6 |= 64;
                    break;
                case 7:
                    str8 = (String) b5.t(serialDescriptor, 7, n0.a, str8);
                    i6 |= PegdownExtensions.FENCED_CODE_BLOCKS;
                    break;
                case 8:
                    str9 = (String) b5.t(serialDescriptor, 8, n0.a, str9);
                    i6 |= PegdownExtensions.WIKILINKS;
                    break;
                case AbstractC1787b.f15287d /* 9 */:
                    z5 = b5.o(serialDescriptor, 9);
                    i6 |= PegdownExtensions.STRIKETHROUGH;
                    break;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new LLMProviderCreateRequest(i6, str, str2, str3, str4, str5, str6, str7, str8, str9, z5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LLMProviderCreateRequest lLMProviderCreateRequest) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(lLMProviderCreateRequest, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        String str = lLMProviderCreateRequest.a;
        boolean z5 = lLMProviderCreateRequest.f11187j;
        String str2 = lLMProviderCreateRequest.f11186i;
        String str3 = lLMProviderCreateRequest.f11185h;
        String str4 = lLMProviderCreateRequest.f11184g;
        String str5 = lLMProviderCreateRequest.f11183f;
        String str6 = lLMProviderCreateRequest.f11182e;
        String str7 = lLMProviderCreateRequest.f11181d;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, lLMProviderCreateRequest.f11179b);
        b5.x(serialDescriptor, 2, lLMProviderCreateRequest.f11180c);
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str7, "openai")) {
            b5.x(serialDescriptor, 3, str7);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str6, "chat_completions")) {
            b5.x(serialDescriptor, 4, str6);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str5, "ai_studio")) {
            b5.x(serialDescriptor, 5, str5);
        }
        if (b5.z(serialDescriptor) || str4 != null) {
            b5.v(serialDescriptor, 6, n0.a, str4);
        }
        if (b5.z(serialDescriptor) || str3 != null) {
            b5.v(serialDescriptor, 7, n0.a, str3);
        }
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 8, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || !z5) {
            b5.q(serialDescriptor, 9, z5);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
