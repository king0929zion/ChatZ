package com.bot.core.model;

import D2.b;
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
import com.vladsch.flexmark.util.sequence.builder.SegmentStats;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import v.AbstractC1787b;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ReasoningRule$$serializer implements C {
    public static final int $stable;
    public static final ReasoningRule$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReasoningRule$$serializer reasoningRule$$serializer = new ReasoningRule$$serializer();
        INSTANCE = reasoningRule$$serializer;
        $stable = 8;
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ReasoningRule", reasoningRule$$serializer, 11);
        c0256c0.l("host", true);
        c0256c0.l("provider_type", true);
        c0256c0.l("api_schema", true);
        c0256c0.l("model_id", true);
        c0256c0.l("model_id_regex", true);
        c0256c0.l("strategy", true);
        c0256c0.l("params", true);
        c0256c0.l("supports_effort", true);
        c0256c0.l("max_budget", true);
        c0256c0.l("force_enabled", true);
        c0256c0.l("append_reasoning_on_tool_call", true);
        descriptor = c0256c0;
    }

    private ReasoningRule$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M4.C
    public final KSerializer[] childSerializers() {
        f[] fVarArr = ReasoningRule.f11245l;
        n0 n0Var = n0.a;
        C0259f c0259f = C0259f.a;
        return new KSerializer[]{d.J(n0Var), d.J(n0Var), d.J(n0Var), d.J(n0Var), d.J(n0Var), fVarArr[5].getValue(), d.J(ReasoningParams$$serializer.INSTANCE), d.J(c0259f), d.J(J.a), d.J(c0259f), d.J(c0259f)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0023. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final ReasoningRule deserialize(Decoder decoder) {
        f[] fVarArr;
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        a b5 = decoder.b(serialDescriptor);
        f[] fVarArr2 = ReasoningRule.f11245l;
        Integer num = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        b bVar = null;
        ReasoningParams reasoningParams = null;
        Boolean bool3 = null;
        int i6 = 0;
        boolean z5 = true;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            switch (s5) {
                case SegmentStats.NULL_REPEATED_CHAR /* -1 */:
                    z5 = false;
                case 0:
                    fVarArr = fVarArr2;
                    str = (String) b5.t(serialDescriptor, 0, n0.a, str);
                    i6 |= 1;
                    fVarArr2 = fVarArr;
                case 1:
                    fVarArr = fVarArr2;
                    str2 = (String) b5.t(serialDescriptor, 1, n0.a, str2);
                    i6 |= 2;
                    fVarArr2 = fVarArr;
                case 2:
                    fVarArr = fVarArr2;
                    str3 = (String) b5.t(serialDescriptor, 2, n0.a, str3);
                    i6 |= 4;
                    fVarArr2 = fVarArr;
                case 3:
                    fVarArr = fVarArr2;
                    str4 = (String) b5.t(serialDescriptor, 3, n0.a, str4);
                    i6 |= 8;
                    fVarArr2 = fVarArr;
                case 4:
                    fVarArr = fVarArr2;
                    str5 = (String) b5.t(serialDescriptor, 4, n0.a, str5);
                    i6 |= 16;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15290g /* 5 */:
                    fVarArr = fVarArr2;
                    bVar = (b) b5.x(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), bVar);
                    i6 |= 32;
                    fVarArr2 = fVarArr;
                case 6:
                    fVarArr = fVarArr2;
                    reasoningParams = (ReasoningParams) b5.t(serialDescriptor, 6, ReasoningParams$$serializer.INSTANCE, reasoningParams);
                    i6 |= 64;
                    fVarArr2 = fVarArr;
                case 7:
                    fVarArr = fVarArr2;
                    bool3 = (Boolean) b5.t(serialDescriptor, 7, C0259f.a, bool3);
                    i6 |= PegdownExtensions.FENCED_CODE_BLOCKS;
                    fVarArr2 = fVarArr;
                case 8:
                    fVarArr = fVarArr2;
                    num = (Integer) b5.t(serialDescriptor, 8, J.a, num);
                    i6 |= PegdownExtensions.WIKILINKS;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15287d /* 9 */:
                    fVarArr = fVarArr2;
                    bool = (Boolean) b5.t(serialDescriptor, 9, C0259f.a, bool);
                    i6 |= PegdownExtensions.STRIKETHROUGH;
                    fVarArr2 = fVarArr;
                case AbstractC1787b.f15289f /* 10 */:
                    fVarArr = fVarArr2;
                    bool2 = (Boolean) b5.t(serialDescriptor, 10, C0259f.a, bool2);
                    i6 |= PegdownExtensions.ANCHORLINKS;
                    fVarArr2 = fVarArr;
                default:
                    throw new i(s5);
            }
        }
        b5.h(serialDescriptor);
        return new ReasoningRule(i6, str, str2, str3, str4, str5, bVar, reasoningParams, bool3, num, bool, bool2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReasoningRule reasoningRule) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(reasoningRule, "value");
        Boolean bool = reasoningRule.f11255k;
        Boolean bool2 = reasoningRule.f11254j;
        Integer num = reasoningRule.f11253i;
        Boolean bool3 = reasoningRule.f11252h;
        ReasoningParams reasoningParams = reasoningRule.f11251g;
        b bVar = reasoningRule.f11250f;
        String str = reasoningRule.f11249e;
        String str2 = reasoningRule.f11248d;
        String str3 = reasoningRule.f11247c;
        String str4 = reasoningRule.f11246b;
        String str5 = reasoningRule.a;
        SerialDescriptor serialDescriptor = descriptor;
        w b5 = encoder.b(serialDescriptor);
        f[] fVarArr = ReasoningRule.f11245l;
        if (b5.z(serialDescriptor) || str5 != null) {
            b5.v(serialDescriptor, 0, n0.a, str5);
        }
        if (b5.z(serialDescriptor) || str4 != null) {
            b5.v(serialDescriptor, 1, n0.a, str4);
        }
        if (b5.z(serialDescriptor) || str3 != null) {
            b5.v(serialDescriptor, 2, n0.a, str3);
        }
        if (b5.z(serialDescriptor) || str2 != null) {
            b5.v(serialDescriptor, 3, n0.a, str2);
        }
        if (b5.z(serialDescriptor) || str != null) {
            b5.v(serialDescriptor, 4, n0.a, str);
        }
        if (b5.z(serialDescriptor) || bVar != b.f1267e) {
            b5.w(serialDescriptor, 5, (KSerializer) fVarArr[5].getValue(), bVar);
        }
        if (b5.z(serialDescriptor) || reasoningParams != null) {
            b5.v(serialDescriptor, 6, ReasoningParams$$serializer.INSTANCE, reasoningParams);
        }
        if (b5.z(serialDescriptor) || bool3 != null) {
            b5.v(serialDescriptor, 7, C0259f.a, bool3);
        }
        if (b5.z(serialDescriptor) || num != null) {
            b5.v(serialDescriptor, 8, J.a, num);
        }
        if (b5.z(serialDescriptor) || bool2 != null) {
            b5.v(serialDescriptor, 9, C0259f.a, bool2);
        }
        if (b5.z(serialDescriptor) || bool != null) {
            b5.v(serialDescriptor, 10, C0259f.a, bool);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC0252a0.f3444b;
    }
}
