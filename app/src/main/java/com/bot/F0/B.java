package F0;

import H0.C0148f;
import H0.C0150g;
import H0.InterfaceC0152h;
import I0.AbstractC0171a;
import I0.C0202p0;
import T.C0616l;
import T.C0626q;
import com.vladsch.flexmark.util.html.Attribute;
import h0.AbstractC1024a;
import h0.C1036m;
import h0.C1038o;
import h0.InterfaceC1039p;
import h0.InterfaceC1041r;
import i1.AbstractC1087g;
import i1.C1084d;
import i1.C1101u;
import i1.C1105y;
import java.util.Iterator;
import java.util.List;
import m.C1211S;
import m.EnumC1199F;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import m4.AbstractC1291z;
import org.jsoup.helper.HttpConnection;
import v.AbstractC1787b;

/* loaded from: classes.dex */
public final class B extends AbstractC1277l implements l4.e {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(AbstractC0171a abstractC0171a, int i6, int i7) {
        super(2);
        this.f1381e = i7;
        this.f1382f = abstractC0171a;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f1381e;
        C1038o c1038o = C1038o.a;
        boolean z5 = false;
        X3.y yVar = X3.y.a;
        Object obj3 = this.f1382f;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Number) obj2).intValue();
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    List list = (List) obj3;
                    int size = list.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        l4.e eVar = (l4.e) list.get(i7);
                        int hashCode = Long.hashCode(c0626q.f8164T);
                        InterfaceC0152h.a.getClass();
                        C0148f c0148f = C0150g.f1925c;
                        c0626q.f0();
                        if (c0626q.f8163S) {
                            c0626q.k(c0148f);
                        } else {
                            c0626q.p0();
                        }
                        T.r.x(c0626q, Integer.valueOf(hashCode), C0150g.f1929g);
                        eVar.m(c0626q, 0);
                        c0626q.p(true);
                    }
                } else {
                    c0626q.V();
                }
                return yVar;
            case 1:
                C0626q c0626q2 = (C0626q) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c0626q2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((AbstractC0171a) obj3).b(0, c0626q2);
                } else {
                    c0626q2.V();
                }
                return yVar;
            case 2:
                ((Number) obj2).intValue();
                ((C0202p0) obj3).b(T.r.J(1), (C0626q) obj);
                return yVar;
            case 3:
                String str = (String) obj;
                List list2 = (List) obj2;
                AbstractC1276k.f(str, "key");
                AbstractC1276k.f(list2, "values");
                ((I3.B) obj3).f2712i.c(str, list2);
                return yVar;
            case 4:
                String str2 = (String) obj;
                List list3 = (List) obj2;
                AbstractC1276k.f(str2, Attribute.NAME_ATTR);
                AbstractC1276k.f(list3, "values");
                ((N3.s) obj3).c(str2, list3);
                return yVar;
            case AbstractC1787b.f15290g /* 5 */:
                InterfaceC1041r interfaceC1041r = (InterfaceC1041r) obj;
                InterfaceC1041r interfaceC1041r2 = (InterfaceC1039p) obj2;
                C0626q c0626q3 = (C0626q) obj3;
                if (interfaceC1041r2 instanceof C1036m) {
                    l4.f fVar = ((C1036m) interfaceC1041r2).a;
                    AbstractC1291z.b(3, fVar);
                    interfaceC1041r2 = AbstractC1024a.b(c0626q3, (InterfaceC1041r) fVar.d(c1038o, c0626q3, 0));
                }
                return interfaceC1041r.c(interfaceC1041r2);
            case 6:
                C0626q c0626q4 = (C0626q) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c0626q4.S(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Object P5 = c0626q4.P();
                    if (P5 == C0616l.a) {
                        P5 = C1084d.f11973f;
                        c0626q4.m0(P5);
                    }
                    AbstractC1087g.e(P0.n.a(c1038o, false, (l4.c) P5), (l4.e) ((T.X) obj3).getValue(), c0626q4, 0);
                } else {
                    c0626q4.V();
                }
                return yVar;
            case 7:
                ((Number) obj2).intValue();
                ((C1101u) obj3).b(T.r.J(1), (C0626q) obj);
                return yVar;
            case 8:
                ((Number) obj2).intValue();
                ((C1105y) obj3).b(T.r.J(1), (C0626q) obj);
                return yVar;
            case AbstractC1787b.f15287d /* 9 */:
                EnumC1199F enumC1199F = (EnumC1199F) obj;
                EnumC1199F enumC1199F2 = (EnumC1199F) obj2;
                EnumC1199F enumC1199F3 = EnumC1199F.f12716f;
                if (enumC1199F == enumC1199F3 && enumC1199F2 == enumC1199F3 && !((C1211S) obj3).a.f12790e) {
                    z5 = true;
                }
                return Boolean.valueOf(z5);
            case AbstractC1787b.f15289f /* 10 */:
                String str3 = (String) obj;
                List list4 = (List) obj2;
                B b5 = (B) obj3;
                AbstractC1276k.f(str3, "key");
                AbstractC1276k.f(list4, "values");
                List list5 = I3.r.a;
                if (!"Content-Length".equals(str3) && !HttpConnection.CONTENT_TYPE.equals(str3)) {
                    if (w3.k.a.contains(str3)) {
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            b5.m(str3, (String) it.next());
                        }
                    } else {
                        b5.m(str3, Y3.m.v0(list4, "Cookie".equals(str3) ? "; " : ",", null, null, null, 62));
                    }
                }
                return yVar;
            default:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                AbstractC1276k.f(str4, "key");
                AbstractC1276k.f(str5, "value");
                List list6 = I3.r.a;
                if (!str4.equals("Content-Length")) {
                    Q4.m mVar = (Q4.m) ((E1.b) obj3).f1294d;
                    mVar.getClass();
                    Y3.C.h(str4);
                    Y3.C.i(str5, str4);
                    mVar.a(str4, str5);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(Object obj, int i6) {
        super(2);
        this.f1381e = i6;
        this.f1382f = obj;
    }
}
