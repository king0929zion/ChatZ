package N4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public final class t implements KSerializer {
    public static final t a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final K4.g f3915b = Y4.d.m("kotlinx.serialization.json.JsonPrimitive", K4.e.f2958m, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b i6 = s4.j.h(decoder).i();
        if (i6 instanceof kotlinx.serialization.json.d) {
            return (kotlinx.serialization.json.d) i6;
        }
        throw O4.m.d(-1, i6.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC1289x.a(i6.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3915b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) obj;
        AbstractC1276k.f(dVar, "value");
        s4.j.f(encoder);
        if (dVar instanceof JsonNull) {
            encoder.m(q.a, JsonNull.INSTANCE);
        } else {
            encoder.m(o.a, (n) dVar);
        }
    }
}
