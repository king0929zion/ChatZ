package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes.dex */
public final class A0 implements KSerializer {
    public static final A0 a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final F f3418b = AbstractC0252a0.a("kotlin.UShort", m0.a);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new X3.w(decoder.u(f3418b).z());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3418b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.l(f3418b).e(((X3.w) obj).f9412c);
    }
}
