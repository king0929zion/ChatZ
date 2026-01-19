package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class u0 implements KSerializer {
    public static final u0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F f3493b = AbstractC0252a0.a("kotlin.UInt", J.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new X3.r(decoder.u(f3493b).k());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3493b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(f3493b).k(((X3.r) obj).f9408c);
    }
}
