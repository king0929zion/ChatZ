package M4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class E extends AbstractC0251a {
    public final KSerializer a;

    /* renamed from: b, reason: collision with root package name */
    public final KSerializer f3424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3425c;

    /* renamed from: d, reason: collision with root package name */
    public final D f3426d;

    public E(KSerializer kSerializer, KSerializer kSerializer2, byte b5) {
        this.a = kSerializer;
        this.f3424b = kSerializer2;
    }

    @Override // M4.AbstractC0251a
    public final Object a() {
        switch (this.f3425c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // M4.AbstractC0251a
    public final int b(Object obj) {
        int size;
        switch (this.f3425c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                AbstractC1276k.f(hashMap, "<this>");
                size = hashMap.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC1276k.f(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // M4.AbstractC0251a
    public final Iterator c(Object obj) {
        switch (this.f3425c) {
            case 0:
                Map map = (Map) obj;
                AbstractC1276k.f(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj;
                AbstractC1276k.f(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        switch (this.f3425c) {
            case 0:
                Map map = (Map) obj;
                AbstractC1276k.f(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj;
                AbstractC1276k.f(map2, "<this>");
                return map2.size();
        }
    }

    @Override // M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        Map map = (Map) obj;
        AbstractC1276k.f(map, "builder");
        Object x5 = aVar.x(getDescriptor(), i6, this.a, null);
        int s5 = aVar.s(getDescriptor());
        if (s5 != i6 + 1) {
            throw new IllegalArgumentException(B3.e.k("Value must follow key in a map, index for key: ", i6, s5, ", returned index for value: ").toString());
        }
        boolean containsKey = map.containsKey(x5);
        KSerializer kSerializer = this.f3424b;
        map.put(x5, (!containsKey || (kSerializer.getDescriptor().e() instanceof K4.f)) ? aVar.x(getDescriptor(), s5, kSerializer, null) : aVar.x(getDescriptor(), s5, kSerializer, Y3.B.Y(x5, map)));
    }

    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        switch (this.f3425c) {
            case 0:
                AbstractC1276k.f(null, "<this>");
                return new HashMap((Map) null);
            default:
                AbstractC1276k.f(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        switch (this.f3425c) {
            case 0:
                return this.f3426d;
            default:
                return this.f3426d;
        }
    }

    @Override // M4.AbstractC0251a
    public final Object h(Object obj) {
        switch (this.f3425c) {
            case 0:
                HashMap hashMap = (HashMap) obj;
                AbstractC1276k.f(hashMap, "<this>");
                return hashMap;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
                AbstractC1276k.f(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d(obj);
        SerialDescriptor descriptor = getDescriptor();
        O4.w p5 = ((O4.w) encoder).p(descriptor);
        Iterator c6 = c(obj);
        int i6 = 0;
        while (c6.hasNext()) {
            Map.Entry entry = (Map.Entry) c6.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i7 = i6 + 1;
            p5.w(getDescriptor(), i6, this.a, key);
            i6 += 2;
            p5.w(getDescriptor(), i7, this.f3424b, value);
        }
        p5.y(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(KSerializer kSerializer, KSerializer kSerializer2, int i6) {
        this(kSerializer, kSerializer2, (byte) 0);
        this.f3425c = i6;
        switch (i6) {
            case 1:
                AbstractC1276k.f(kSerializer, "kSerializer");
                AbstractC1276k.f(kSerializer2, "vSerializer");
                this(kSerializer, kSerializer2, (byte) 0);
                SerialDescriptor descriptor = kSerializer.getDescriptor();
                SerialDescriptor descriptor2 = kSerializer2.getDescriptor();
                AbstractC1276k.f(descriptor, "keyDesc");
                AbstractC1276k.f(descriptor2, "valueDesc");
                this.f3426d = new D("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
                return;
            default:
                AbstractC1276k.f(kSerializer, "kSerializer");
                AbstractC1276k.f(kSerializer2, "vSerializer");
                SerialDescriptor descriptor3 = kSerializer.getDescriptor();
                SerialDescriptor descriptor4 = kSerializer2.getDescriptor();
                AbstractC1276k.f(descriptor3, "keyDesc");
                AbstractC1276k.f(descriptor4, "valueDesc");
                this.f3426d = new D("kotlin.collections.HashMap", descriptor3, descriptor4);
                return;
        }
    }
}
