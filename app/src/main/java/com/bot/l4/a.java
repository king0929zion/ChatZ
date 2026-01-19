package L4;

import F2.h;
import M4.e0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* loaded from: classes.dex */
public interface a {
    float B(SerialDescriptor serialDescriptor, int i6);

    double D(e0 e0Var, int i6);

    h a();

    Decoder c(e0 e0Var, int i6);

    long g(SerialDescriptor serialDescriptor, int i6);

    void h(SerialDescriptor serialDescriptor);

    byte j(e0 e0Var, int i6);

    int l(SerialDescriptor serialDescriptor, int i6);

    boolean o(SerialDescriptor serialDescriptor, int i6);

    String q(SerialDescriptor serialDescriptor, int i6);

    int s(SerialDescriptor serialDescriptor);

    Object t(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj);

    char v(e0 e0Var, int i6);

    short w(e0 e0Var, int i6);

    Object x(SerialDescriptor serialDescriptor, int i6, KSerializer kSerializer, Object obj);
}
