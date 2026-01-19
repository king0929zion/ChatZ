package com.bot.core.model;

import I4.i;
import L4.a;
import M4.C;
import M4.C0256c0;
import M4.C0259f;
import M4.J;
import M4.n0;
import O4.w;
import X3.c;
import Y4.d;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class ApiResponse$$serializer<T> implements C {
    public static final int $stable = 8;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private ApiResponse$$serializer() {
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.ApiResponse", this, 5);
        c0256c0.l("success", false);
        c0256c0.l("message", false);
        c0256c0.l("data", true);
        c0256c0.l(FlexmarkHtmlConverter.CODE_NODE, true);
        c0256c0.l("timestamp", true);
        this.descriptor = c0256c0;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        n0 n0Var = n0.a;
        return new KSerializer[]{C0259f.a, n0Var, d.J(this.typeSerial0), J.a, d.J(n0Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ApiResponse<T> deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = this.descriptor;
        a b5 = decoder.b(serialDescriptor);
        int i6 = 0;
        boolean z5 = false;
        int i7 = 0;
        String str = null;
        Object obj = null;
        String str2 = null;
        boolean z6 = true;
        while (z6) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z6 = false;
            } else if (s5 == 0) {
                z5 = b5.o(serialDescriptor, 0);
                i6 |= 1;
            } else if (s5 == 1) {
                str = b5.q(serialDescriptor, 1);
                i6 |= 2;
            } else if (s5 == 2) {
                obj = b5.t(serialDescriptor, 2, this.typeSerial0, obj);
                i6 |= 4;
            } else if (s5 == 3) {
                i7 = b5.l(serialDescriptor, 3);
                i6 |= 8;
            } else {
                if (s5 != 4) {
                    throw new i(s5);
                }
                str2 = (String) b5.t(serialDescriptor, 4, n0.a, str2);
                i6 |= 16;
            }
        }
        b5.h(serialDescriptor);
        return new ApiResponse<>(i6, z5, str, obj, i7, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ApiResponse<T> apiResponse) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(apiResponse, "value");
        SerialDescriptor serialDescriptor = this.descriptor;
        w b5 = encoder.b(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        boolean z5 = apiResponse.a;
        String str = apiResponse.f11151e;
        int i6 = apiResponse.f11150d;
        Object obj = apiResponse.f11149c;
        b5.q(serialDescriptor, 0, z5);
        b5.x(serialDescriptor, 1, apiResponse.f11148b);
        if (b5.z(serialDescriptor) || obj != null) {
            b5.v(serialDescriptor, 2, kSerializer, obj);
        }
        if (b5.z(serialDescriptor) || i6 != 200) {
            b5.t(3, i6, serialDescriptor);
        }
        if (b5.z(serialDescriptor) || str != null) {
            b5.v(serialDescriptor, 4, n0.a, str);
        }
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApiResponse$$serializer(KSerializer kSerializer) {
        this();
        AbstractC1276k.f(kSerializer, "typeSerial0");
        this.typeSerial0 = kSerializer;
    }
}
