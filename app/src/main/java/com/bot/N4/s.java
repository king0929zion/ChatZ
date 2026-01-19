package N4;

import M4.E;
import M4.n0;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class s implements KSerializer {
    public static final s a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final r f3914b = r.f3912b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        s4.j.h(decoder);
        return new kotlinx.serialization.json.c((Map) new E(n0.a, k.a, 1).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3914b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.c cVar = (kotlinx.serialization.json.c) obj;
        AbstractC1276k.f(cVar, "value");
        s4.j.f(encoder);
        new E(n0.a, k.a, 1).serialize(encoder, cVar);
    }
}
