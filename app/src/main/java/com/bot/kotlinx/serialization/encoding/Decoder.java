package kotlinx.serialization.encoding;

import L4.a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Decoder {
    float A();

    double C();

    a b(SerialDescriptor serialDescriptor);

    boolean d();

    char e();

    int f(SerialDescriptor serialDescriptor);

    int k();

    String m();

    long n();

    Object p(KSerializer kSerializer);

    boolean r();

    Decoder u(SerialDescriptor serialDescriptor);

    byte y();

    short z();
}
