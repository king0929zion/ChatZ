package l2;

import Y3.j;
import Y3.q;
import com.vladsch.flexmark.util.html.Attribute;
import d5.G;
import d5.I;
import d5.n;
import d5.o;
import d5.u;
import d5.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;
import m4.AbstractC1289x;

/* renamed from: l2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1188c extends o {

    /* renamed from: b, reason: collision with root package name */
    public final o f12687b;

    public C1188c(o oVar) {
        AbstractC1276k.f(oVar, "delegate");
        this.f12687b = oVar;
    }

    @Override // d5.o
    public final G a(y yVar) {
        AbstractC1276k.f(yVar, "file");
        return this.f12687b.a(yVar);
    }

    @Override // d5.o
    public final void b(y yVar, y yVar2) {
        AbstractC1276k.f(yVar, "source");
        AbstractC1276k.f(yVar2, Attribute.TARGET_ATTR);
        this.f12687b.b(yVar, yVar2);
    }

    @Override // d5.o
    public final void c(y yVar) {
        this.f12687b.c(yVar);
    }

    @Override // d5.o
    public final void d(y yVar) {
        AbstractC1276k.f(yVar, "path");
        this.f12687b.d(yVar);
    }

    @Override // d5.o
    public final List g(y yVar) {
        List<y> g3 = this.f12687b.g(yVar);
        ArrayList arrayList = new ArrayList();
        for (y yVar2 : g3) {
            AbstractC1276k.f(yVar2, "path");
            arrayList.add(yVar2);
        }
        q.a0(arrayList);
        return arrayList;
    }

    @Override // d5.o
    public final n i(y yVar) {
        AbstractC1276k.f(yVar, "path");
        n i6 = this.f12687b.i(yVar);
        if (i6 == null) {
            return null;
        }
        y yVar2 = i6.f11491c;
        if (yVar2 == null) {
            return i6;
        }
        boolean z5 = i6.a;
        boolean z6 = i6.f11490b;
        Long l3 = i6.f11492d;
        Long l5 = i6.f11493e;
        Long l6 = i6.f11494f;
        Long l7 = i6.f11495g;
        Map map = i6.f11496h;
        AbstractC1276k.f(map, "extras");
        return new n(z5, z6, yVar2, l3, l5, l6, l7, map);
    }

    @Override // d5.o
    public final u j(y yVar) {
        return this.f12687b.j(yVar);
    }

    @Override // d5.o
    public final G k(y yVar) {
        y b5 = yVar.b();
        o oVar = this.f12687b;
        if (b5 != null) {
            j jVar = new j();
            while (b5 != null && !f(b5)) {
                jVar.addFirst(b5);
                b5 = b5.b();
            }
            Iterator<E> it = jVar.iterator();
            while (it.hasNext()) {
                y yVar2 = (y) it.next();
                AbstractC1276k.f(yVar2, "dir");
                oVar.c(yVar2);
            }
        }
        return oVar.k(yVar);
    }

    @Override // d5.o
    public final I l(y yVar) {
        AbstractC1276k.f(yVar, "file");
        return this.f12687b.l(yVar);
    }

    public final String toString() {
        return AbstractC1289x.a(C1188c.class).c() + '(' + this.f12687b + ')';
    }
}
