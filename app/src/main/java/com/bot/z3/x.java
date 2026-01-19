package z3;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m4.AbstractC1276k;
import o4.AbstractC1410a;
import u4.AbstractC1763a;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final B3.j f16312d = new B3.j(4);

    /* renamed from: e, reason: collision with root package name */
    public static final N3.a f16313e = new N3.a("HttpPlainText");
    public final Charset a;

    /* renamed from: b, reason: collision with root package name */
    public final Charset f16314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16315c;

    public x(Set set, Map map, Charset charset) {
        AbstractC1276k.f(set, "charsets");
        AbstractC1276k.f(map, "charsetQuality");
        AbstractC1276k.f(charset, "responseCharsetFallback");
        this.a = charset;
        List<X3.i> G02 = Y3.m.G0(Y3.B.b0(map), new B3.q(11));
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((Charset) obj)) {
                arrayList.add(obj);
            }
        }
        List<Charset> G03 = Y3.m.G0(arrayList, new B3.q(10));
        StringBuilder sb = new StringBuilder();
        for (Charset charset2 : G03) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(T3.a.d(charset2));
        }
        for (X3.i iVar : G02) {
            Charset charset3 = (Charset) iVar.f9393c;
            float floatValue = ((Number) iVar.f9394e).floatValue();
            if (sb.length() > 0) {
                sb.append(",");
            }
            double d6 = floatValue;
            if (0.0d > d6 || d6 > 1.0d) {
                throw new IllegalStateException("Check failed.");
            }
            sb.append(T3.a.d(charset3) + ";q=" + (AbstractC1410a.K(100 * floatValue) / 100.0d));
        }
        if (sb.length() == 0) {
            sb.append(T3.a.d(this.a));
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        this.f16315c = sb2;
        Charset charset4 = (Charset) Y3.m.q0(G03);
        if (charset4 == null) {
            X3.i iVar2 = (X3.i) Y3.m.q0(G02);
            charset4 = iVar2 != null ? (Charset) iVar2.f9393c : null;
            if (charset4 == null) {
                charset4 = AbstractC1763a.a;
            }
        }
        this.f16314b = charset4;
    }
}
