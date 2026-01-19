package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class X implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f3443b;

    public X(KSerializer kSerializer) {
        AbstractC1276k.f(kSerializer, "serializer");
        this.a = kSerializer;
        this.f3443b = new j0(kSerializer.getDescriptor());
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        if (decoder.r()) {
            return decoder.p(this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && X.class == obj.getClass() && AbstractC1276k.b(this.a, ((X) obj).a);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f3443b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        if (obj != null) {
            encoder.m(this.a, obj);
        } else {
            encoder.c();
        }
    }
}
