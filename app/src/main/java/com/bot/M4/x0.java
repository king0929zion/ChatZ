package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class x0 implements KSerializer {
    public static final x0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F f3505b = AbstractC0252a0.a("kotlin.ULong", O.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new X3.t(decoder.u(f3505b).n());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3505b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(f3505b).n(((X3.t) obj).f9410c);
    }
}
