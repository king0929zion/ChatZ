package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: M4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0259f implements KSerializer {
    public static final C0259f a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3464b = new g0("kotlin.Boolean", K4.e.f2950e);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.d());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3464b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.g(((Boolean) obj).booleanValue());
    }
}
