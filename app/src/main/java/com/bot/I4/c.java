package I4;

import O4.w;
import j1.AbstractC1135a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import s4.InterfaceC1672b;

/* loaded from: classes.dex */
public final class c implements KSerializer {
    public final InterfaceC1672b a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2773b;

    public c(InterfaceC1672b interfaceC1672b) {
        AbstractC1276k.f(interfaceC1672b, "baseClass");
        this.a = interfaceC1672b;
        this.f2773b = X3.a.c(X3.g.f9390c, new A.b(this, 11));
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        L4.a b5 = decoder.b(getDescriptor());
        String str = null;
        while (true) {
            int s5 = b5.s(getDescriptor());
            if (s5 == -1) {
                throw new IllegalArgumentException(AbstractC1135a.f("Polymorphic value has not been read for class ", str).toString());
            }
            if (s5 != 0) {
                if (s5 == 1) {
                    if (str == null) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    h5.e.T(this, b5, str);
                    throw null;
                }
                StringBuilder sb = new StringBuilder("Invalid index in polymorphic deserialization of ");
                if (str == null) {
                    str = "unknown class";
                }
                sb.append(str);
                sb.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                sb.append(s5);
                throw new IllegalArgumentException(sb.toString());
            }
            str = b5.q(getDescriptor(), s5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X3.f] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f2773b.getValue();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC1276k.f(obj, "value");
        h5.e.U(this, (w) encoder, obj);
        throw null;
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.a + ')';
    }
}
