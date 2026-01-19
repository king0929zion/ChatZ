package M4;

import D.C0080m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class Y implements KSerializer {
    public final Object a = X3.a.c(X3.g.f9390c, new C0080m(this));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        L4.a b5 = decoder.b(descriptor);
        int s5 = b5.s(getDescriptor());
        if (s5 != -1) {
            throw new IllegalArgumentException(B3.e.h(s5, "Unexpected index "));
        }
        b5.h(descriptor);
        return X3.y.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.f] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.a.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC1276k.f(obj, "value");
        encoder.b(getDescriptor()).y(getDescriptor());
    }
}
