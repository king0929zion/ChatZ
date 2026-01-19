package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class r0 implements KSerializer {
    public static final r0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F f3487b = AbstractC0252a0.a("kotlin.UByte", C0262i.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new X3.p(decoder.u(f3487b).y());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3487b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(f3487b).f(((X3.p) obj).f9406c);
    }
}
