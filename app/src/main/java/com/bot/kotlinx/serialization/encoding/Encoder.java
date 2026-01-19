package kotlinx.serialization.encoding;

import F2.h;
import O4.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public interface Encoder {
    h a();

    w b(SerialDescriptor serialDescriptor);

    void c();

    void d(double d6);

    void e(short s5);

    void f(byte b5);

    void g(boolean z5);

    void h(float f6);

    void i(char c6);

    void j(SerialDescriptor serialDescriptor, int i6);

    void k(int i6);

    Encoder l(SerialDescriptor serialDescriptor);

    void m(KSerializer kSerializer, Object obj);

    void n(long j3);

    void o(String str);
}
