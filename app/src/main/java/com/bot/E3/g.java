package E3;

import I3.v;
import I3.w;
import b4.InterfaceC0910h;
import m4.AbstractC1276k;
import x3.C1885i;

/* loaded from: classes.dex */
public final class g {
    public final w a;

    /* renamed from: b, reason: collision with root package name */
    public final P3.b f1328b;

    /* renamed from: c, reason: collision with root package name */
    public final C1885i f1329c;

    /* renamed from: d, reason: collision with root package name */
    public final v f1330d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1331e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0910h f1332f;

    /* renamed from: g, reason: collision with root package name */
    public final P3.b f1333g;

    public g(w wVar, P3.b bVar, C1885i c1885i, v vVar, Object obj, InterfaceC0910h interfaceC0910h) {
        AbstractC1276k.f(bVar, "requestTime");
        AbstractC1276k.f(vVar, "version");
        AbstractC1276k.f(obj, "body");
        AbstractC1276k.f(interfaceC0910h, "callContext");
        this.a = wVar;
        this.f1328b = bVar;
        this.f1329c = c1885i;
        this.f1330d = vVar;
        this.f1331e = obj;
        this.f1332f = interfaceC0910h;
        this.f1333g = P3.a.a(null);
    }

    public final String toString() {
        return "HttpResponseData=(statusCode=" + this.a + ')';
    }
}
