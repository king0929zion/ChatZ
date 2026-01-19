package M4;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B0 implements KSerializer {

    /* renamed from: b, reason: collision with root package name */
    public static final B0 f3420b = new B0();
    public final /* synthetic */ Y a = new Y();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.a.deserialize(decoder);
        return X3.y.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        X3.y yVar = (X3.y) obj;
        AbstractC1276k.f(yVar, "value");
        this.a.serialize(encoder, yVar);
    }
}
