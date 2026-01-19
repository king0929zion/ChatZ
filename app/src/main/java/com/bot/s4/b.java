package S4;

import Q4.A;
import Q4.n;
import Q4.q;
import Q4.u;
import Q4.v;
import Q4.x;
import Q4.y;
import V4.f;
import com.vladsch.flexmark.util.html.Attribute;
import java.util.ArrayList;
import m4.AbstractC1276k;
import org.jsoup.helper.HttpConnection;
import u4.AbstractC1776n;

/* loaded from: classes.dex */
public final class b implements q {
    @Override // Q4.q
    public final y a(f fVar) {
        Throwable th;
        int i6;
        System.currentTimeMillis();
        v vVar = fVar.f8813e;
        AbstractC1276k.f(vVar, "request");
        Throwable th2 = null;
        M.q qVar = new M.q(21, vVar, th2);
        if (vVar.a().f6508j) {
            qVar = new M.q(21, th2, th2);
        }
        v vVar2 = (v) qVar.f3179e;
        y yVar = (y) qVar.f3180f;
        if (vVar2 == null && yVar == null) {
            ArrayList arrayList = new ArrayList(20);
            return new y(vVar, u.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new n((String[]) arrayList.toArray(new String[0])), R4.b.f7080c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (vVar2 == null) {
            AbstractC1276k.c(yVar);
            x d6 = yVar.d();
            y a = a.a(yVar);
            x.b(a, "cacheResponse");
            d6.f6652i = a;
            return d6.a();
        }
        y b5 = fVar.b(vVar2);
        if (yVar != null) {
            if (b5.f6660g == 304) {
                x d7 = yVar.d();
                n nVar = yVar.f6662i;
                n nVar2 = b5.f6662i;
                ArrayList arrayList2 = new ArrayList(20);
                int size = nVar.size();
                int i7 = 0;
                while (true) {
                    th = th2;
                    if (i7 >= size) {
                        break;
                    }
                    String b6 = nVar.b(i7);
                    int i8 = size;
                    String d8 = nVar.d(i7);
                    n nVar3 = nVar;
                    if ("Warning".equalsIgnoreCase(b6)) {
                        i6 = i7;
                        if (u4.u.D(d8, "1", false)) {
                            i7 = i6 + 1;
                            size = i8;
                            th2 = th;
                            nVar = nVar3;
                        }
                    } else {
                        i6 = i7;
                    }
                    if ("Content-Length".equalsIgnoreCase(b6) || HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(b6) || HttpConnection.CONTENT_TYPE.equalsIgnoreCase(b6) || !a.b(b6) || nVar2.a(b6) == null) {
                        AbstractC1276k.f(b6, Attribute.NAME_ATTR);
                        AbstractC1276k.f(d8, "value");
                        arrayList2.add(b6);
                        arrayList2.add(AbstractC1776n.l0(d8).toString());
                    }
                    i7 = i6 + 1;
                    size = i8;
                    th2 = th;
                    nVar = nVar3;
                }
                int size2 = nVar2.size();
                for (int i9 = 0; i9 < size2; i9++) {
                    String b7 = nVar2.b(i9);
                    if (!"Content-Length".equalsIgnoreCase(b7) && !HttpConnection.CONTENT_ENCODING.equalsIgnoreCase(b7) && !HttpConnection.CONTENT_TYPE.equalsIgnoreCase(b7) && a.b(b7)) {
                        String d9 = nVar2.d(i9);
                        AbstractC1276k.f(b7, Attribute.NAME_ATTR);
                        AbstractC1276k.f(d9, "value");
                        arrayList2.add(b7);
                        arrayList2.add(AbstractC1776n.l0(d9).toString());
                    }
                }
                d7.f6649f = new n((String[]) arrayList2.toArray(new String[0])).c();
                d7.f6654k = b5.f6667n;
                d7.f6655l = b5.f6668o;
                y a6 = a.a(yVar);
                x.b(a6, "cacheResponse");
                d7.f6652i = a6;
                y a7 = a.a(b5);
                x.b(a7, "networkResponse");
                d7.f6651h = a7;
                d7.a();
                A a8 = b5.f6663j;
                AbstractC1276k.c(a8);
                a8.close();
                AbstractC1276k.c(th);
                throw th;
            }
            A a9 = yVar.f6663j;
            if (a9 != null) {
                R4.b.d(a9);
            }
        }
        x d10 = b5.d();
        y a10 = a.a(yVar);
        x.b(a10, "cacheResponse");
        d10.f6652i = a10;
        y a11 = a.a(b5);
        x.b(a11, "networkResponse");
        d10.f6651h = a11;
        return d10.a();
    }
}
