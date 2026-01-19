package N4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q implements KSerializer {
    public static final q a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final K4.g f3911b = Y4.d.m("kotlinx.serialization.json.JsonNull", K4.j.f2975f, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        s4.j.h(decoder);
        if (decoder.r()) {
            throw new IllegalArgumentException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3911b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC1276k.f((JsonNull) obj, "value");
        s4.j.f(encoder);
        encoder.c();
    }
}
