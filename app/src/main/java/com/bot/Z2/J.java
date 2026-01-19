package Z2;

import Q.AbstractC0438m;
import T.C0616l;
import T.C0626q;
import b0.AbstractC0874g;
import b0.C0873f;
import java.util.Iterator;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import v.C1814u;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements l4.f {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10018c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f10019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l4.c f10020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ T.X f10021g;

    public /* synthetic */ J(List list, l4.c cVar, T.X x5, int i6) {
        this.f10018c = i6;
        this.f10019e = list;
        this.f10020f = cVar;
        this.f10021g = x5;
    }

    @Override // l4.f
    public final Object d(Object obj, Object obj2, Object obj3) {
        int i6 = this.f10018c;
        X3.y yVar = X3.y.a;
        Object obj4 = C0616l.a;
        final T.X x5 = this.f10021g;
        final l4.c cVar = this.f10020f;
        List<String> list = this.f10019e;
        final int i7 = 1;
        final int i8 = 0;
        switch (i6) {
            case 0:
                C0626q c0626q = (C0626q) obj2;
                int intValue = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ExposedDropdownMenu");
                if (c0626q.S(intValue & 1, (intValue & 17) != 16)) {
                    for (final String str : list) {
                        C0873f c6 = AbstractC0874g.c(-13255502, new K(str, 0, (byte) 0), c0626q);
                        boolean f6 = c0626q.f(cVar) | c0626q.f(str);
                        Object P5 = c0626q.P();
                        if (f6 || P5 == obj4) {
                            P5 = new InterfaceC1193a() { // from class: Z2.E
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i8) {
                                        case 0:
                                            cVar.f(str);
                                            x5.setValue(Boolean.FALSE);
                                            break;
                                        case 1:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str);
                                            break;
                                        case 2:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str);
                                            break;
                                        default:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q.m0(P5);
                        }
                        float f7 = Q.F0.a;
                        C0626q c0626q2 = c0626q;
                        AbstractC0438m.a(c6, (InterfaceC1193a) P5, null, false, Q.F0.a(((Q.N) c0626q.j(Q.O.a)).f5427q, c0626q), null, c0626q2, 6);
                        c0626q = c0626q2;
                    }
                } else {
                    c0626q.V();
                }
                return yVar;
            case 1:
                C0626q c0626q3 = (C0626q) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ExposedDropdownMenu");
                if (c0626q3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        X3.i iVar = (X3.i) it.next();
                        final String str2 = (String) iVar.f9393c;
                        C0873f c7 = AbstractC0874g.c(95516961, new K((String) iVar.f9394e, 8, (byte) 0), c0626q3);
                        boolean f8 = c0626q3.f(cVar) | c0626q3.f(str2);
                        Object P6 = c0626q3.P();
                        if (f8 || P6 == obj4) {
                            P6 = new InterfaceC1193a() { // from class: Z2.E
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i7) {
                                        case 0:
                                            cVar.f(str2);
                                            x5.setValue(Boolean.FALSE);
                                            break;
                                        case 1:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str2);
                                            break;
                                        case 2:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str2);
                                            break;
                                        default:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str2);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q3.m0(P6);
                        }
                        float f9 = Q.F0.a;
                        C0626q c0626q4 = c0626q3;
                        AbstractC0438m.a(c7, (InterfaceC1193a) P6, null, false, Q.F0.a(((Q.N) c0626q3.j(Q.O.a)).f5427q, c0626q3), null, c0626q4, 6);
                        c0626q3 = c0626q4;
                    }
                } else {
                    c0626q3.V();
                }
                return yVar;
            case 2:
                C0626q c0626q5 = (C0626q) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ExposedDropdownMenu");
                if (c0626q5.S(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        X3.i iVar2 = (X3.i) it2.next();
                        final String str3 = (String) iVar2.f9393c;
                        C0873f c8 = AbstractC0874g.c(398789582, new K((String) iVar2.f9394e, 9, (byte) 0), c0626q5);
                        boolean f10 = c0626q5.f(cVar) | c0626q5.f(str3);
                        Object P7 = c0626q5.P();
                        if (f10 || P7 == obj4) {
                            final int i9 = 2;
                            P7 = new InterfaceC1193a() { // from class: Z2.E
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i9) {
                                        case 0:
                                            cVar.f(str3);
                                            x5.setValue(Boolean.FALSE);
                                            break;
                                        case 1:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str3);
                                            break;
                                        case 2:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str3);
                                            break;
                                        default:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str3);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q5.m0(P7);
                        }
                        float f11 = Q.F0.a;
                        C0626q c0626q6 = c0626q5;
                        AbstractC0438m.a(c8, (InterfaceC1193a) P7, null, false, Q.F0.a(((Q.N) c0626q5.j(Q.O.a)).f5427q, c0626q5), null, c0626q6, 6);
                        c0626q5 = c0626q6;
                    }
                } else {
                    c0626q5.V();
                }
                return yVar;
            default:
                C0626q c0626q7 = (C0626q) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                AbstractC1276k.f((C1814u) obj, "$this$ExposedDropdownMenu");
                if (c0626q7.S(intValue4 & 1, (intValue4 & 17) != 16)) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        X3.i iVar3 = (X3.i) it3.next();
                        final String str4 = (String) iVar3.f9393c;
                        C0873f c9 = AbstractC0874g.c(-967671648, new K((String) iVar3.f9394e, 10, (byte) 0), c0626q7);
                        boolean f12 = c0626q7.f(cVar) | c0626q7.f(str4);
                        Object P8 = c0626q7.P();
                        if (f12 || P8 == obj4) {
                            final int i10 = 3;
                            P8 = new InterfaceC1193a() { // from class: Z2.E
                                @Override // l4.InterfaceC1193a
                                public final Object b() {
                                    switch (i10) {
                                        case 0:
                                            cVar.f(str4);
                                            x5.setValue(Boolean.FALSE);
                                            break;
                                        case 1:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str4);
                                            break;
                                        case 2:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str4);
                                            break;
                                        default:
                                            x5.setValue(Boolean.FALSE);
                                            cVar.f(str4);
                                            break;
                                    }
                                    return X3.y.a;
                                }
                            };
                            c0626q7.m0(P8);
                        }
                        float f13 = Q.F0.a;
                        C0626q c0626q8 = c0626q7;
                        AbstractC0438m.a(c9, (InterfaceC1193a) P8, null, false, Q.F0.a(((Q.N) c0626q7.j(Q.O.a)).f5427q, c0626q7), null, c0626q8, 6);
                        c0626q7 = c0626q8;
                    }
                } else {
                    c0626q7.V();
                }
                return yVar;
        }
    }
}
