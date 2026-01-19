package com.bot.core.model;

import I4.i;
import L4.a;
import M4.AbstractC0252a0;
import M4.C;
import M4.C0256c0;
import M4.C0259f;
import M4.O;
import M4.n0;
import O4.w;
import X3.c;
import X3.f;
import Y3.v;
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
public final /* synthetic */ class LLMProvider$$serializer implements C {
    public static final int $stable;
    public static final LLMProvider$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        LLMProvider$$serializer lLMProvider$$serializer = new LLMProvider$$serializer();
        INSTANCE = lLMProvider$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.LLMProvider", lLMProvider$$serializer, 14);
        c0256c0.l(Attribute.ID_ATTR, false);
        c0256c0.l("provider_type", false);
        c0256c0.l(Attribute.NAME_ATTR, false);
        c0256c0.l("base_url", false);
        c0256c0.l("api_schema", true);
        c0256c0.l("openai_api_mode", true);
        c0256c0.l("google_api_mode", true);
        c0256c0.l("google_project_id", true);
        c0256c0.l("google_location", true);
        c0256c0.l("is_builtin", true);
        c0256c0.l("is_enabled", true);
        c0256c0.l("api_key", true);
        c0256c0.l("enabled_model_ids", true);
        c0256c0.l("sort_order", true);
        descriptor = c0256c0;
    }

    private LLMProvider$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = LLMProvider.f11165o;
        n0 n0Var = n0.a;
        C0259f c0259f = C0259f.a;
        return new KSerializer[]{n0Var, n0Var, n0Var, n0Var, n0Var, n0Var, n0Var, d.J(n0Var), d.J(n0Var), c0259f, c0259f, d.J(n0Var), fVarArr[12].getValue(), O.a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002c. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final LLMProvider deserialize(Decoder decoder) {
        f[] fVarArr;
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr2 = LLMProvider.f11165o;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        long j3 = 0;
        int i6 = 0;
        boolean z5 = true;
        boolean z6 = false;
        boolean z7 = false;
        String str9 = null;
        String str10 = null;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            switch (s5) {
                case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                    z5 = false;
                case 0:
                    fVarArr = fVarArr2;
                    str2 = b5.q(serialDescriptor, 0);
                    i6 |= 1;
                    fVarArr2 = fVarArr;
                case 1:
                    fVarArr = fVarArr2;
                    str3 = b5.q(serialDescriptor, 1);
                    i6 |= 2;
                    fVarArr2 = fVarArr;
                case 2:
                    fVarArr = fVarArr2;
                    str4 = b5.q(serialDescriptor, 2);
                    i6 |= 4;
                    fVarArr2 = fVarArr;
                case 3:
                    fVarArr = fVarArr2;
                    str5 = b5.q(serialDescriptor, 3);
                    i6 |= 8;
                    fVarArr2 = fVarArr;
                case 4:
                    fVarArr = fVarArr2;
                    str6 = b5.q(serialDescriptor, 4);
                    i6 |= 16;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15290g /* 5 */:
                    fVarArr = fVarArr2;
                    str7 = b5.q(serialDescriptor, 5);
                    i6 |= 32;
                    fVarArr2 = fVarArr;
                case 6:
                    fVarArr = fVarArr2;
                    str8 = b5.q(serialDescriptor, 6);
                    i6 |= 64;
                    fVarArr2 = fVarArr;
                case 7:
                    fVarArr = fVarArr2;
                    str = (String) b5.t(serialDescriptor, 7, n0.a, str);
                    i6 |= PegdownExtensions.FENCED_CODE_BLOCKS;
                    fVarArr2 = fVarArr;
                case 8:
                    fVarArr = fVarArr2;
                    str9 = (String) b5.t(serialDescriptor, 8, n0.a, str9);
                    i6 |= PegdownExtensions.WIKILINKS;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15287d /* 9 */:
                    fVarArr = fVarArr2;
                    z6 = b5.o(serialDescriptor, 9);
                    i6 |= PegdownExtensions.STRIKETHROUGH;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15289f /* 10 */:
                    fVarArr = fVarArr2;
                    z7 = b5.o(serialDescriptor, 10);
                    i6 |= PegdownExtensions.ANCHORLINKS;
                    fVarArr2 = fVarArr;
                case 11:
                    fVarArr = fVarArr2;
                    str10 = (String) b5.t(serialDescriptor, 11, n0.a, str10);
                    i6 |= 2048;
                    fVarArr2 = fVarArr;
                case 12:
                    fVarArr = fVarArr2;
                    list = (List) b5.x(serialDescriptor, 12, (KSerializer) fVarArr2[12].getValue(), list);
                    i6 |= 4096;
                    fVarArr2 = fVarArr;
                case 13:
                    j3 = b5.g(serialDescriptor, 13);
                    i6 |= 8192;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new LLMProvider(i6, str2, str3, str4, str5, str6, str7, str8, str, str9, z6, z7, str10, list, j3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, LLMProvider lLMProvider) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(lLMProvider, "value");
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = LLMProvider.f11165o;
        String str = lLMProvider.a;
        long j3 = lLMProvider.f11178n;
        List list = lLMProvider.f11177m;
        String str2 = lLMProvider.f11176l;
        boolean z5 = lLMProvider.f11175k;
        boolean z6 = lLMProvider.f11174j;
        String str3 = lLMProvider.f11173i;
        String str4 = lLMProvider.f11172h;
        String str5 = lLMProvider.f11171g;
        String str6 = lLMProvider.f11170f;
        String str7 = lLMProvider.f11169e;
        b5.x(serialDescriptor, 0, str);
        b5.x(serialDescriptor, 1, lLMProvider.f11166b);
        b5.x(serialDescriptor, 2, lLMProvider.f11167c);
        b5.x(serialDescriptor, 3, lLMProvider.f11168d);
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str7, "openai")) {
            b5.x(serialDescriptor, 4, str7);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str6, "chat_completions")) {
            b5.x(serialDescriptor, 5, str6);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(str5, "ai_studio")) {
            b5.x(serialDescriptor, 6, str5);
        }
        if (b5.z(serialDescriptor) || str4 != null) {
            b5.v(serialDescriptor, 7, n0.a, str4);
        }
        if (b5.z(serialDescriptor) || str3 != null) {
            b5.v(serialDescriptor, 8, n0.a, str3);
        }
        if (b5.z(serialDescriptor) || z6) {
            b5.q(serialDescriptor, 9, z6);
        }
        if (b5.z(serialDescriptor) || !z5) {
            b5.q(serialDescriptor, 10, z5);
        }
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 11, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || !AbstractC1276k.b(list, v.f9812c)) {
            b5.w(serialDescriptor, 12, (KSerializer) fVarArr[12].getValue(), list);
        }
        if (b5.z(serialDescriptor) || j3 != 0) {
            b5.u(serialDescriptor, 13, j3);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
