package M4;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class S implements KSerializer {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f3439b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3440c;

    /* renamed from: d, reason: collision with root package name */
    public final K4.g f3441d;

    public S(KSerializer kSerializer, KSerializer kSerializer2, byte b5) {
        this.a = kSerializer;
        this.f3439b = kSerializer2;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object q3;
        Object obj = AbstractC0252a0.f3445c;
        SerialDescriptor descriptor = getDescriptor();
        L4.a b5 = decoder.b(descriptor);
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int s5 = b5.s(getDescriptor());
            if (s5 == -1) {
                if (obj2 == obj) {
                    throw new IllegalArgumentException("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new IllegalArgumentException("Element 'value' is missing");
                }
                switch (this.f3440c) {
                    case 0:
                        q3 = new Q(obj2, obj3);
                        break;
                    default:
                        q3 = new X3.i(obj2, obj3);
                        break;
                }
                b5.h(descriptor);
                return q3;
            }
            if (s5 == 0) {
                obj2 = b5.x(getDescriptor(), 0, this.a, null);
            } else {
                if (s5 != 1) {
                    throw new IllegalArgumentException(B3.e.h(s5, "Invalid index: "));
                }
                obj3 = b5.x(getDescriptor(), 1, this.f3439b, null);
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f3440c) {
            case 0:
                return this.f3441d;
            default:
                return this.f3441d;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        O4.w b5 = encoder.b(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.a;
        switch (this.f3440c) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                AbstractC1276k.f(entry, "<this>");
                key = entry.getKey();
                break;
            default:
                X3.i iVar = (X3.i) obj;
                AbstractC1276k.f(iVar, "<this>");
                key = iVar.f9393c;
                break;
        }
        b5.w(descriptor, 0, kSerializer, key);
        SerialDescriptor descriptor2 = getDescriptor();
        KSerializer kSerializer2 = this.f3439b;
        switch (this.f3440c) {
            case 0:
                Map.Entry entry2 = (Map.Entry) obj;
                AbstractC1276k.f(entry2, "<this>");
                value = entry2.getValue();
                break;
            default:
                X3.i iVar2 = (X3.i) obj;
                AbstractC1276k.f(iVar2, "<this>");
                value = iVar2.f9394e;
                break;
        }
        b5.w(descriptor2, 1, kSerializer2, value);
        b5.y(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(final KSerializer kSerializer, final KSerializer kSerializer2, int i6) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f3440c = i6;
        switch (i6) {
            case 1:
                this(kSerializer, kSerializer2, (byte) 0);
                final int i7 = 1;
                this.f3441d = Y4.d.k("kotlin.Pair", new SerialDescriptor[0], new l4.c() { // from class: M4.P
                    @Override // l4.c
                    public final Object f(Object obj) {
                        K4.a aVar = (K4.a) obj;
                        switch (i7) {
                            case 0:
                                AbstractC1276k.f(aVar, "$this$buildSerialDescriptor");
                                K4.a.a(aVar, "key", kSerializer.getDescriptor());
                                K4.a.a(aVar, "value", kSerializer2.getDescriptor());
                                break;
                            default:
                                AbstractC1276k.f(aVar, "$this$buildClassSerialDescriptor");
                                K4.a.a(aVar, "first", kSerializer.getDescriptor());
                                K4.a.a(aVar, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return X3.y.a;
                    }
                });
                return;
            default:
                final int i8 = 0;
                this.f3441d = Y4.d.l("kotlin.collections.Map.Entry", K4.k.f2978g, new SerialDescriptor[0], new l4.c() { // from class: M4.P
                    @Override // l4.c
                    public final Object f(Object obj) {
                        K4.a aVar = (K4.a) obj;
                        switch (i8) {
                            case 0:
                                AbstractC1276k.f(aVar, "$this$buildSerialDescriptor");
                                K4.a.a(aVar, "key", kSerializer.getDescriptor());
                                K4.a.a(aVar, "value", kSerializer2.getDescriptor());
                                break;
                            default:
                                AbstractC1276k.f(aVar, "$this$buildClassSerialDescriptor");
                                K4.a.a(aVar, "first", kSerializer.getDescriptor());
                                K4.a.a(aVar, "second", kSerializer2.getDescriptor());
                                break;
                        }
                        return X3.y.a;
                    }
                });
                return;
        }
    }
}
