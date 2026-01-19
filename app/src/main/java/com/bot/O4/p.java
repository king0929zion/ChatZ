package O4;

import M4.AbstractC0252a0;
import Y3.B;
import Y3.F;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* loaded from: classes.dex */
public class p extends a {

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.serialization.json.c f4342f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor f4343g;

    /* renamed from: h, reason: collision with root package name */
    public int f4344h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4345i;

    public /* synthetic */ p(N4.c cVar, kotlinx.serialization.json.c cVar2, String str, int i6) {
        this(cVar, cVar2, (i6 & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // O4.a
    public kotlinx.serialization.json.b E(String str) {
        AbstractC1276k.f(str, "tag");
        return (kotlinx.serialization.json.b) B.Y(str, S());
    }

    @Override // O4.a
    public String Q(SerialDescriptor serialDescriptor, int i6) {
        Object obj;
        AbstractC1276k.f(serialDescriptor, "descriptor");
        N4.c cVar = this.f4328c;
        m.m(cVar, serialDescriptor);
        String g3 = serialDescriptor.g(i6);
        if (this.f4330e.f3905i && !S().f12633c.keySet().contains(g3)) {
            AbstractC1276k.f(cVar, "<this>");
            A3.c cVar2 = cVar.f3884c;
            D.r rVar = new D.r(12, serialDescriptor, cVar);
            cVar2.getClass();
            n nVar = m.a;
            Object l3 = cVar2.l(serialDescriptor, nVar);
            if (l3 == null) {
                l3 = rVar.b();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cVar2.f119e;
                Object obj2 = concurrentHashMap.get(serialDescriptor);
                if (obj2 == null) {
                    obj2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(serialDescriptor, obj2);
                }
                ((Map) obj2).put(nVar, l3);
            }
            Map map = (Map) l3;
            Iterator it = S().f12633c.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Integer num = (Integer) map.get((String) obj);
                if (num != null && num.intValue() == i6) {
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return g3;
    }

    @Override // O4.a
    /* renamed from: X, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.c S() {
        return this.f4342f;
    }

    @Override // O4.a, kotlinx.serialization.encoding.Decoder
    public final L4.a b(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        SerialDescriptor serialDescriptor2 = this.f4343g;
        if (serialDescriptor != serialDescriptor2) {
            return super.b(serialDescriptor);
        }
        kotlinx.serialization.json.b F5 = F();
        String a = serialDescriptor2.a();
        if (F5 instanceof kotlinx.serialization.json.c) {
            return new p(this.f4328c, (kotlinx.serialization.json.c) F5, this.f4329d, serialDescriptor2);
        }
        throw m.d(-1, F5.toString(), "Expected " + AbstractC1289x.a(kotlinx.serialization.json.c.class).c() + ", but had " + AbstractC1289x.a(F5.getClass()).c() + " as the serialized body of " + a + " at element: " + U());
    }

    @Override // O4.a, L4.a
    public void h(SerialDescriptor serialDescriptor) {
        Set p02;
        AbstractC1276k.f(serialDescriptor, "descriptor");
        N4.h hVar = this.f4330e;
        if (hVar.f3898b || (serialDescriptor.e() instanceof K4.d)) {
            return;
        }
        N4.c cVar = this.f4328c;
        m.m(cVar, serialDescriptor);
        if (hVar.f3905i) {
            Set b5 = AbstractC0252a0.b(serialDescriptor);
            AbstractC1276k.f(cVar, "<this>");
            Map map = (Map) cVar.f3884c.l(serialDescriptor, m.a);
            Set keySet = map != null ? map.keySet() : null;
            if (keySet == null) {
                keySet = Y3.x.f9814c;
            }
            p02 = F.p0(b5, keySet);
        } else {
            p02 = AbstractC0252a0.b(serialDescriptor);
        }
        for (String str : S().f12633c.keySet()) {
            if (!p02.contains(str) && !AbstractC1276k.b(str, this.f4329d)) {
                String cVar2 = S().toString();
                AbstractC1276k.f(str, "key");
                AbstractC1276k.f(cVar2, FlexmarkHtmlConverter.INPUT_NODE);
                StringBuilder t5 = B3.e.t("Encountered an unknown key '", str, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                t5.append((Object) m.l(-1, cVar2));
                throw m.e(-1, t5.toString());
            }
        }
    }

    @Override // O4.a, kotlinx.serialization.encoding.Decoder
    public final boolean r() {
        return !this.f4345i && super.r();
    }

    @Override // L4.a
    public int s(SerialDescriptor serialDescriptor) {
        AbstractC1276k.f(serialDescriptor, "descriptor");
        while (this.f4344h < serialDescriptor.f()) {
            int i6 = this.f4344h;
            this.f4344h = i6 + 1;
            String R5 = R(serialDescriptor, i6);
            int i7 = this.f4344h - 1;
            this.f4345i = false;
            if (!S().containsKey(R5)) {
                boolean z5 = (this.f4328c.a.f3901e || serialDescriptor.k(i7) || !serialDescriptor.j(i7).c()) ? false : true;
                this.f4345i = z5;
                if (z5) {
                }
            }
            this.f4330e.getClass();
            return i7;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(N4.c cVar, kotlinx.serialization.json.c cVar2, String str, SerialDescriptor serialDescriptor) {
        super(cVar, str);
        AbstractC1276k.f(cVar, "json");
        AbstractC1276k.f(cVar2, "value");
        this.f4342f = cVar2;
        this.f4343g = serialDescriptor;
    }
}
