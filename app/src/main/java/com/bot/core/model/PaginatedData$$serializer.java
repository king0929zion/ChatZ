package com.bot.core.model;

import I4.i;
import L4.a;
import M4.C;
import M4.C0255c;
import M4.C0256c0;
import M4.J;
import O4.w;
import X3.c;
import com.bot.core.model.PaginatedData;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

@c
/* loaded from: classes.dex */
public final /* synthetic */ class PaginatedData$$serializer<T> implements C {
    public static final int $stable = 8;
    private final SerialDescriptor descriptor;
    private final /* synthetic */ KSerializer typeSerial0;

    private PaginatedData$$serializer() {
        C0256c0 c0256c0 = new C0256c0("com.bot.core.model.PaginatedData", this, 5);
        c0256c0.l("items", false);
        c0256c0.l("total", false);
        c0256c0.l("page", false);
        c0256c0.l("page_size", false);
        c0256c0.l("total_pages", false);
        this.descriptor = c0256c0;
    }

    private final /* synthetic */ KSerializer getTypeSerial0() {
        return this.typeSerial0;
    }

    @Override // M4.C
    public final KSerializer[] childSerializers() {
        C0255c c0255c = new C0255c(this.typeSerial0, 0);
        J j3 = J.a;
        return new KSerializer[]{c0255c, j3, j3, j3, j3};
    }

    @Override // kotlinx.serialization.KSerializer
    public final PaginatedData<T> deserialize(Decoder decoder) {
        AbstractC1276k.f(decoder, "decoder");
        SerialDescriptor serialDescriptor = this.descriptor;
        a b5 = decoder.b(serialDescriptor);
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        List list = null;
        boolean z5 = true;
        while (z5) {
            int s5 = b5.s(serialDescriptor);
            if (s5 == -1) {
                z5 = false;
            } else if (s5 == 0) {
                list = (List) b5.x(serialDescriptor, 0, new C0255c(this.typeSerial0, 0), list);
                i6 |= 1;
            } else if (s5 == 1) {
                i7 = b5.l(serialDescriptor, 1);
                i6 |= 2;
            } else if (s5 == 2) {
                i8 = b5.l(serialDescriptor, 2);
                i6 |= 4;
            } else if (s5 == 3) {
                i9 = b5.l(serialDescriptor, 3);
                i6 |= 8;
            } else {
                if (s5 != 4) {
                    throw new i(s5);
                }
                i10 = b5.l(serialDescriptor, 4);
                i6 |= 16;
            }
        }
        b5.h(serialDescriptor);
        return new PaginatedData<>(i6, list, i7, i8, i9, i10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, PaginatedData<T> paginatedData) {
        AbstractC1276k.f(encoder, "encoder");
        AbstractC1276k.f(paginatedData, "value");
        SerialDescriptor serialDescriptor = this.descriptor;
        w b5 = encoder.b(serialDescriptor);
        KSerializer kSerializer = this.typeSerial0;
        PaginatedData.Companion companion = PaginatedData.Companion;
        b5.w(serialDescriptor, 0, new C0255c(kSerializer, 0), paginatedData.a);
        b5.t(1, paginatedData.f11236b, serialDescriptor);
        b5.t(2, paginatedData.f11237c, serialDescriptor);
        b5.t(3, paginatedData.f11238d, serialDescriptor);
        b5.t(4, paginatedData.f11239e, serialDescriptor);
        b5.y(serialDescriptor);
    }

    @Override // M4.C
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.typeSerial0};
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaginatedData$$serializer(KSerializer kSerializer) {
        this();
        AbstractC1276k.f(kSerializer, "typeSerial0");
        this.typeSerial0 = kSerializer;
    }
}
