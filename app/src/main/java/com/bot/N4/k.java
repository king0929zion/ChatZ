package N4;

import I2.x;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class k implements KSerializer {
    public static final k a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final K4.g f3907b = Y4.d.l("kotlinx.serialization.json.JsonElement", K4.c.f2949f, new SerialDescriptor[0], new x(21));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return s4.j.h(decoder).i();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3907b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) obj;
        AbstractC1276k.f(bVar, "value");
        s4.j.f(encoder);
        if (bVar instanceof kotlinx.serialization.json.d) {
            encoder.m(t.a, bVar);
        } else if (bVar instanceof kotlinx.serialization.json.c) {
            encoder.m(s.a, bVar);
        } else {
            if (!(bVar instanceof kotlinx.serialization.json.a)) {
                throw new RuntimeException();
            }
            encoder.m(e.a, bVar);
        }
    }
}
