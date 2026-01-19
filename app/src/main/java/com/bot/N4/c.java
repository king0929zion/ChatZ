package N4;

import I3.I;
import O4.v;
import O4.w;
import O4.z;
import com.vladsch.flexmark.parser.PegdownExtensions;
import kotlinx.serialization.KSerializer;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: d, reason: collision with root package name */
    public static final b f3882d = new c(new h(false, false, false, false, true, "    ", "type", false, true, a.f3880e), P4.a.a);
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final F2.h f3883b;

    /* renamed from: c, reason: collision with root package name */
    public final A3.c f3884c = new A3.c(16, (byte) 0);

    public c(h hVar, F2.h hVar2) {
        this.a = hVar;
        this.f3883b = hVar2;
    }

    public final Object a(String str, KSerializer kSerializer) {
        AbstractC1276k.f(kSerializer, "deserializer");
        AbstractC1276k.f(str, "string");
        L1.l lVar = new L1.l(str);
        Object p5 = new v(this, z.f4381f, lVar, kSerializer.getDescriptor()).p(kSerializer);
        if (lVar.f() == 10) {
            return p5;
        }
        L1.l.p(lVar, "Expected EOF after parsing, but had " + lVar.w().charAt(lVar.f3045b - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(KSerializer kSerializer, Object obj) {
        char[] cArr;
        AbstractC1276k.f(kSerializer, "serializer");
        C0.c cVar = new C0.c((char) 0, 2);
        O4.c cVar2 = O4.c.f4331f;
        synchronized (cVar2) {
            Y3.j jVar = (Y3.j) cVar2.f4333e;
            cArr = null;
            char[] cArr2 = (char[]) (jVar.isEmpty() ? null : jVar.removeLast());
            if (cArr2 != null) {
                cVar2.f4332c -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[PegdownExtensions.FENCED_CODE_BLOCKS];
        }
        cVar.f649c = cArr;
        try {
            new w(new I(cVar), this, z.f4381f, new w[z.f4386k.a()]).m(kSerializer, obj);
            return cVar.toString();
        } finally {
            cVar.h();
        }
    }

    public final kotlinx.serialization.json.b c(String str) {
        AbstractC1276k.f(str, "string");
        return (kotlinx.serialization.json.b) a(str, k.a);
    }
}
