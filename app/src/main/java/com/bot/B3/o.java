package B3;

import B0.F;
import I3.C0241e;
import Y3.C;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import m4.AbstractC1276k;
import org.jsoup.helper.HttpConnection;
import u4.AbstractC1763a;
import u4.AbstractC1776n;
import x4.AbstractC1888A;
import x4.AbstractC1898K;
import x4.C1911Y;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final j f543e = new j(0);

    /* renamed from: f, reason: collision with root package name */
    public static final N3.a f544f = new N3.a("ClientLogging");
    public final g a;

    /* renamed from: b, reason: collision with root package name */
    public final int f545b;

    /* renamed from: c, reason: collision with root package name */
    public final List f546c;

    /* renamed from: d, reason: collision with root package name */
    public final List f547d;

    public o(g gVar, int i6, List list, List list2) {
        this.a = gVar;
        this.f545b = i6;
        this.f546c = list;
        this.f547d = list2;
    }

    public static final Object a(o oVar, E3.d dVar, A3.e eVar) {
        Charset charset;
        List list = oVar.f547d;
        Object obj = dVar.f1307d;
        AbstractC1276k.d(obj, "null cannot be cast to non-null type io.ktor.http.content.OutgoingContent");
        J3.d dVar2 = (J3.d) obj;
        d dVar3 = new d(oVar.a);
        dVar.f1309f.f(p.a, dVar3);
        StringBuilder sb = new StringBuilder();
        int i6 = oVar.f545b;
        if (e.c(i6)) {
            sb.append("REQUEST: " + Y4.l.k(dVar.a));
            sb.append('\n');
            sb.append("METHOD: " + dVar.f1305b);
            sb.append('\n');
        }
        if (e.b(i6)) {
            sb.append("COMMON HEADERS\n");
            C.E(sb, dVar.f1306c.a(), list);
            sb.append("CONTENT HEADERS");
            sb.append('\n');
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                throw new ClassCastException();
            }
            Long a = dVar2.a();
            if (a != null) {
                long longValue = a.longValue();
                List list2 = I3.r.a;
                C.D(sb, "Content-Length", String.valueOf(longValue));
            }
            C0241e b5 = dVar2.b();
            if (b5 != null) {
                List list3 = I3.r.a;
                C.D(sb, HttpConnection.CONTENT_TYPE, b5.toString());
            }
            C.E(sb, dVar2.c().a(), list);
        }
        String sb2 = sb.toString();
        AbstractC1276k.e(sb2, "StringBuilder().apply(builderAction).toString()");
        if (sb2.length() > 0) {
            String obj2 = AbstractC1776n.l0(sb2).toString();
            StringBuilder sb3 = dVar3.f516b;
            sb3.append(obj2);
            sb3.append('\n');
        }
        if (sb2.length() == 0 || !e.a(i6)) {
            dVar3.a();
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("BODY Content-Type: " + dVar2.b());
        sb4.append('\n');
        C0241e b6 = dVar2.b();
        if (b6 == null || (charset = Y4.l.q(b6)) == null) {
            charset = AbstractC1763a.a;
        }
        io.ktor.utils.io.t tVar = new io.ktor.utils.io.t(false, io.ktor.utils.io.internal.f.f12171c, 8);
        AbstractC1888A.y(C1911Y.f15677c, AbstractC1898K.f15658b, new l(tVar, charset, sb4, null), 2).S(new F(1, dVar3, sb4));
        return h5.e.b0(dVar2, tVar, eVar);
    }

    public static final void b(o oVar, StringBuilder sb, E3.b bVar, Throwable th) {
        if (e.c(oVar.f545b)) {
            sb.append("RESPONSE " + bVar.getUrl() + " failed with exception: " + th);
        }
    }
}
