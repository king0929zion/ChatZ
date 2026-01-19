package N4;

import M4.C0255c;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class e implements KSerializer {
    public static final e a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final d f3887b = d.f3885b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        s4.j.h(decoder);
        return new kotlinx.serialization.json.a((List) new C0255c(k.a, 0).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3887b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kotlinx.serialization.json.a aVar = (kotlinx.serialization.json.a) obj;
        AbstractC1276k.f(aVar, "value");
        s4.j.f(encoder);
        new C0255c(k.a, 0).serialize(encoder, aVar);
    }
}
