package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: M4.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0268o implements KSerializer {
    public static final C0268o a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3480b = new g0("kotlin.Char", K4.e.f2952g);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.e());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3480b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(((Character) obj).charValue());
    }
}
