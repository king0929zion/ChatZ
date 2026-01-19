package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: M4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272t implements KSerializer {
    public static final C0272t a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3490b = new g0("kotlin.Double", K4.e.f2953h);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.C());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3490b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.d(((Number) obj).doubleValue());
    }
}
