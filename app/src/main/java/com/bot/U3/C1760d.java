package u3;

import I3.m;
import I3.r;
import java.util.List;
import m4.C1270e;
import org.jsoup.helper.HttpConnection;
import u4.o;

/* renamed from: u3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1760d extends UnsupportedOperationException {

    /* renamed from: c, reason: collision with root package name */
    public final String f15164c;

    public C1760d(F3.c cVar, C1270e c1270e, C1270e c1270e2) {
        StringBuilder sb = new StringBuilder("\n        Expected response body of the type '");
        sb.append(c1270e2);
        sb.append("' but was '");
        sb.append(c1270e);
        sb.append("'\n        In response from `");
        sb.append(cVar.b().d().getUrl());
        sb.append("`\n        Response status `");
        sb.append(cVar.g());
        sb.append("`\n        Response header `ContentType: ");
        m a = cVar.a();
        List list = r.a;
        sb.append(a.d(HttpConnection.CONTENT_TYPE));
        sb.append("` \n        Request header `Accept: ");
        sb.append(cVar.b().d().a().d("Accept"));
        sb.append("`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
        this.f15164c = o.q(sb.toString());
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f15164c;
    }
}
