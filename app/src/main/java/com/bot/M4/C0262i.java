package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: M4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262i implements KSerializer {
    public static final C0262i a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3469b = new g0("kotlin.Byte", K4.e.f2951f);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.y());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3469b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.f(((Number) obj).byteValue());
    }
}
