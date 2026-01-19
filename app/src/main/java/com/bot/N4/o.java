package N4;

import M4.g0;
import M4.h0;
import M4.x0;
import i4.AbstractC1117a;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import u4.AbstractC1776n;
import u4.u;

/* loaded from: classes.dex */
public final class o implements KSerializer {
    public static final o a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final g0 f3910b;

    /* JADX WARN: Type inference failed for: r0v0, types: [N4.o, java.lang.Object] */
    static {
        K4.e eVar = K4.e.f2958m;
        if (AbstractC1776n.Q("kotlinx.serialization.json.JsonLiteral")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        Object it = ((Y.j) h0.a.values()).iterator();
        while (((Z3.e) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((Z3.c) it).next();
            if ("kotlinx.serialization.json.JsonLiteral".equals(kSerializer.getDescriptor().a())) {
                throw new IllegalArgumentException(u4.o.q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exists " + AbstractC1289x.a(kSerializer.getClass()).c() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
        f3910b = new g0("kotlinx.serialization.json.JsonLiteral", eVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        kotlinx.serialization.json.b i6 = s4.j.h(decoder).i();
        if (i6 instanceof n) {
            return (n) i6;
        }
        throw O4.m.d(-1, i6.toString(), "Unexpected JSON element, expected JsonLiteral, had " + AbstractC1289x.a(i6.getClass()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3910b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        AbstractC1276k.f(nVar, "value");
        String str = nVar.f3909e;
        s4.j.f(encoder);
        if (nVar.f3908c) {
            encoder.o(str);
            return;
        }
        AbstractC1276k.f(str, "<this>");
        Long F5 = u.F(10, str);
        if (F5 != null) {
            encoder.n(F5.longValue());
            return;
        }
        X3.t y5 = AbstractC1117a.y(str);
        if (y5 != null) {
            encoder.l(x0.f3505b).n(y5.f9410c);
            return;
        }
        Double u5 = u4.t.u(str);
        if (u5 != null) {
            encoder.d(u5.doubleValue());
            return;
        }
        Boolean bool = str.equals("true") ? Boolean.TRUE : str.equals("false") ? Boolean.FALSE : null;
        if (bool != null) {
            encoder.g(bool.booleanValue());
        } else {
            encoder.o(str);
        }
    }
}
