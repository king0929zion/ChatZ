package X2;

import b4.InterfaceC0905c;
import java.util.List;
import java.util.Map;
import m4.AbstractC1276k;
import z3.AbstractC2037g;
import z3.C2035e;
import z3.C2036f;

/* loaded from: classes.dex */
public final class H extends d4.i implements l4.f {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9184h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f9185i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f9186j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ H(int i6, int i7, InterfaceC0905c interfaceC0905c) {
        super(i6, interfaceC0905c);
        this.f9184h = i7;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        switch (this.f9184h) {
            case 0:
                H h3 = new H(3, 0, (InterfaceC0905c) obj3);
                h3.f9185i = (C0693h) obj;
                h3.f9186j = (X3.o) obj2;
                return h3.r(X3.y.a);
            case 1:
                H h6 = new H(3, 1, (InterfaceC0905c) obj3);
                h6.f9185i = (List) obj;
                h6.f9186j = (Y2.y) obj2;
                return h6.r(X3.y.a);
            default:
                H h7 = new H((C2036f) this.f9186j, (InterfaceC0905c) obj3);
                h7.f9185i = (Q3.f) obj;
                X3.y yVar = X3.y.a;
                h7.r(yVar);
                return yVar;
        }
    }

    @Override // d4.a
    public final Object r(Object obj) {
        switch (this.f9184h) {
            case 0:
                C0693h c0693h = (C0693h) this.f9185i;
                X3.o oVar = (X3.o) this.f9186j;
                X3.a.e(obj);
                X3.i iVar = (X3.i) oVar.f9403c;
                String str = (String) oVar.f9404e;
                long longValue = ((Number) oVar.f9405f).longValue();
                boolean booleanValue = ((Boolean) iVar.f9393c).booleanValue();
                R2.A a = (R2.A) iVar.f9394e;
                boolean z5 = c0693h.a;
                boolean z6 = c0693h.f9293b;
                boolean z7 = c0693h.f9294c;
                String str2 = c0693h.f9295d;
                S s5 = c0693h.f9296e;
                AbstractC1276k.f(str2, "currentChatId");
                AbstractC1276k.f(s5, "messagesLoadState");
                AbstractC1276k.f(a, "drawerMode");
                return new C0693h(z5, z6, z7, str2, s5, booleanValue, a, str, longValue);
            case 1:
                List list = (List) this.f9185i;
                Y2.y yVar = (Y2.y) this.f9186j;
                X3.a.e(obj);
                return new X3.i(list, yVar);
            default:
                X3.a.e(obj);
                Q3.f fVar = (Q3.f) this.f9185i;
                String b5 = ((E3.d) fVar.f6466c).a.toString();
                C2035e c2035e = new C2035e();
                C2036f c2036f = (C2036f) this.f9186j;
                E3.d dVar = (E3.d) fVar.f6466c;
                I3.n nVar = dVar.f1306c;
                I3.n nVar2 = c2035e.a;
                Y3.C.g(nVar2, nVar);
                c2036f.a.f(c2035e);
                I3.H b6 = c2035e.f16268b.b();
                I3.E e6 = b6.a;
                B3.j jVar = C2036f.f16270b;
                I3.B b7 = dVar.a;
                if (AbstractC1276k.b(b7.a, I3.E.f2715c)) {
                    AbstractC1276k.f(e6, "<set-?>");
                    b7.a = e6;
                }
                if (b7.f2705b.length() <= 0) {
                    I3.B b8 = new I3.B();
                    AbstractC1276k.f(e6, "<set-?>");
                    b8.a = e6;
                    String str3 = b6.f2721b;
                    AbstractC1276k.f(str3, "<set-?>");
                    b8.f2705b = str3;
                    int i6 = b6.f2722c;
                    Integer valueOf = Integer.valueOf(i6);
                    if (i6 == 0) {
                        valueOf = null;
                    }
                    b8.f2706c = valueOf != null ? valueOf.intValue() : e6.f2717b;
                    Y4.d.V(b8, (String) b6.f2728i.getValue());
                    b8.f2708e = (String) b6.f2730k.getValue();
                    b8.f2709f = (String) b6.f2731l.getValue();
                    I3.n nVar3 = new I3.n(1);
                    nVar3.f(s4.j.D((String) b6.f2729j.getValue()));
                    b8.f2712i = nVar3;
                    b8.f2713j = new I3.I(nVar3);
                    String str4 = (String) b6.f2732m.getValue();
                    AbstractC1276k.f(str4, "<set-?>");
                    b8.f2710g = str4;
                    b8.f2707d = b6.f2726g;
                    I3.E e7 = b7.a;
                    AbstractC1276k.f(e7, "<set-?>");
                    b8.a = e7;
                    int i7 = b7.f2706c;
                    if (i7 != 0) {
                        b8.f2706c = i7;
                    }
                    List list2 = b8.f2711h;
                    List list3 = b7.f2711h;
                    if (!list3.isEmpty()) {
                        if (list2.isEmpty() || ((CharSequence) Y3.m.o0(list3)).length() == 0) {
                            list2 = list3;
                        } else {
                            Z3.b bVar = new Z3.b((list3.size() + list2.size()) - 1);
                            int size = list2.size() - 1;
                            for (int i8 = 0; i8 < size; i8++) {
                                bVar.add(list2.get(i8));
                            }
                            bVar.addAll(list3);
                            list2 = Y4.l.p(bVar);
                        }
                    }
                    AbstractC1276k.f(list2, "<set-?>");
                    b8.f2711h = list2;
                    if (b7.f2710g.length() > 0) {
                        String str5 = b7.f2710g;
                        AbstractC1276k.f(str5, "<set-?>");
                        b8.f2710g = str5;
                    }
                    I3.n nVar4 = new I3.n(1);
                    Y3.C.g(nVar4, b8.f2712i);
                    I3.z zVar = b7.f2712i;
                    AbstractC1276k.f(zVar, "value");
                    b8.f2712i = zVar;
                    b8.f2713j = new I3.I(zVar);
                    for (Map.Entry entry : nVar4.a()) {
                        String str6 = (String) entry.getKey();
                        List list4 = (List) entry.getValue();
                        if (!b8.f2712i.contains(str6)) {
                            b8.f2712i.c(str6, list4);
                        }
                    }
                    Y4.l.S(b7, b8);
                }
                N3.j jVar2 = c2035e.f16269c;
                for (N3.a aVar : Y3.m.J0(jVar2.d().keySet())) {
                    if (!dVar.f1309f.b(aVar)) {
                        dVar.f1309f.f(aVar, jVar2.c(aVar));
                    }
                }
                dVar.f1306c.clear();
                dVar.f1306c.f(nVar2.t());
                f5.a aVar2 = AbstractC2037g.a;
                StringBuilder t5 = B3.e.t("Applied DefaultRequest to ", b5, ". New url: ");
                t5.append(dVar.a);
                aVar2.c(t5.toString());
                return X3.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(C2036f c2036f, InterfaceC0905c interfaceC0905c) {
        super(3, interfaceC0905c);
        this.f9184h = 2;
        this.f9186j = c2036f;
    }
}
