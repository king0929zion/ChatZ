package Q4;

import java.util.LinkedHashMap;
import java.util.Map;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f6636b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6637c;

    /* renamed from: d, reason: collision with root package name */
    public Object f6638d;

    /* renamed from: e, reason: collision with root package name */
    public Object f6639e;

    /* renamed from: f, reason: collision with root package name */
    public Object f6640f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6641g;

    public v(p pVar, String str, n nVar, s4.j jVar, Map map) {
        AbstractC1276k.f(pVar, "url");
        AbstractC1276k.f(str, "method");
        this.f6637c = pVar;
        this.f6636b = str;
        this.f6638d = nVar;
        this.f6639e = jVar;
        this.f6640f = map;
    }

    public C0495c a() {
        C0495c c0495c = (C0495c) this.f6641g;
        if (c0495c != null) {
            return c0495c;
        }
        C0495c c0495c2 = C0495c.f6498n;
        C0495c C5 = s4.j.C((n) this.f6638d);
        this.f6641g = C5;
        return C5;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [E1.b, java.lang.Object] */
    public E1.b b() {
        ?? obj = new Object();
        obj.a = new LinkedHashMap();
        obj.f1292b = (p) this.f6637c;
        obj.f1293c = this.f6636b;
        obj.f1295e = (s4.j) this.f6639e;
        Map map = (Map) this.f6640f;
        obj.a = map.isEmpty() ? new LinkedHashMap() : Y3.B.e0(map);
        obj.f1294d = ((n) this.f6638d).c();
        return obj;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                Map map = (Map) this.f6640f;
                StringBuilder sb = new StringBuilder("Request{method=");
                sb.append(this.f6636b);
                sb.append(", url=");
                sb.append((p) this.f6637c);
                n nVar = (n) this.f6638d;
                if (nVar.size() != 0) {
                    sb.append(", headers=[");
                    int i6 = 0;
                    for (Object obj : nVar) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            Y4.l.U();
                            throw null;
                        }
                        X3.i iVar = (X3.i) obj;
                        String str = (String) iVar.f9393c;
                        String str2 = (String) iVar.f9394e;
                        if (i6 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        sb.append(str2);
                        i6 = i7;
                    }
                    sb.append(']');
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                String sb2 = sb.toString();
                AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            default:
                return super.toString();
        }
    }

    public v(T4.d dVar) {
        AbstractC1276k.f(dVar, "taskRunner");
        this.f6637c = dVar;
        this.f6641g = X4.h.a;
    }
}
