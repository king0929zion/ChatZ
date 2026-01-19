package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class n0 implements KSerializer {
    public static final n0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3479b = new g0("kotlin.String", K4.e.f2958m);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return decoder.m();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3479b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        AbstractC1276k.f(str, "value");
        encoder.o(str);
    }
}
