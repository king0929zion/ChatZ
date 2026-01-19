package M4;

import D.C0056a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class o0 implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f3481b;

    /* renamed from: c, reason: collision with root package name */
    public final KSerializer f3482c;

    /* renamed from: d, reason: collision with root package name */
    public final K4.g f3483d = Y4.d.k("kotlin.Triple", new SerialDescriptor[0], new C0056a(this, 16));

    public o0(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.a = kSerializer;
        this.f3481b = kSerializer2;
        this.f3482c = kSerializer3;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        K4.g gVar = this.f3483d;
        L4.a b5 = decoder.b(gVar);
        Object obj = AbstractC0252a0.f3445c;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int s5 = b5.s(gVar);
            if (s5 == -1) {
                b5.h(gVar);
                if (obj2 == obj) {
                    throw new IllegalArgumentException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new IllegalArgumentException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new X3.o(obj2, obj3, obj4);
                }
                throw new IllegalArgumentException("Element 'third' is missing");
            }
            if (s5 == 0) {
                obj2 = b5.x(gVar, 0, this.a, null);
            } else if (s5 == 1) {
                obj3 = b5.x(gVar, 1, this.f3481b, null);
            } else {
                if (s5 != 2) {
                    throw new IllegalArgumentException(B3.e.h(s5, "Unexpected index "));
                }
                obj4 = b5.x(gVar, 2, this.f3482c, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.f3483d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        X3.o oVar = (X3.o) obj;
        AbstractC1276k.f(oVar, "value");
        K4.g gVar = this.f3483d;
        O4.w b5 = encoder.b(gVar);
        b5.w(gVar, 0, this.a, oVar.f9403c);
        b5.w(gVar, 1, this.f3481b, oVar.f9404e);
        b5.w(gVar, 2, this.f3482c, oVar.f9405f);
        b5.y(gVar);
    }
}
