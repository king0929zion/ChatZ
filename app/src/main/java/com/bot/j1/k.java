package J1;

import D.V0;
import P2.S;
import Q.I2;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import b0.C0873f;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import x.C1856g;
import x4.AbstractC1888A;
import x4.InterfaceC1942y;
import z.C2004b;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2836c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f2837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2839g;

    public /* synthetic */ k(I1.j jVar, List list, boolean z5) {
        this.f2836c = 0;
        this.f2838f = jVar;
        this.f2837e = z5;
        this.f2839g = list;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        int i6 = this.f2836c;
        final int i7 = 0;
        X3.y yVar = X3.y.a;
        final int i8 = 3;
        final int i9 = 1;
        Object obj2 = this.f2839g;
        Object obj3 = this.f2838f;
        final boolean z5 = this.f2837e;
        switch (i6) {
            case 0:
                final I1.j jVar = (I1.j) obj3;
                final List list = (List) obj2;
                InterfaceC0844s interfaceC0844s = new InterfaceC0844s() { // from class: J1.l
                    @Override // androidx.lifecycle.InterfaceC0844s
                    public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
                        boolean z6 = z5;
                        List list2 = list;
                        I1.j jVar2 = jVar;
                        if (z6 && !list2.contains(jVar2)) {
                            list2.add(jVar2);
                        }
                        if (enumC0841o == EnumC0841o.ON_START && !list2.contains(jVar2)) {
                            list2.add(jVar2);
                        }
                        if (enumC0841o == EnumC0841o.ON_STOP) {
                            list2.remove(jVar2);
                        }
                    }
                };
                jVar.f2550k.f2998j.a(interfaceC0844s);
                return new V0(4, jVar, interfaceC0844s);
            case 1:
                String str = (String) obj3;
                I2 i22 = (I2) obj2;
                P0.x xVar = (P0.x) obj;
                if (z5) {
                    s4.e[] eVarArr = P0.v.a;
                    P0.w wVar = P0.t.f4531j;
                    s4.e eVar = P0.v.a[3];
                    xVar.a(wVar, new P0.f(0));
                }
                A.b bVar = new A.b(i22, 28);
                s4.e[] eVarArr2 = P0.v.a;
                xVar.a(P0.l.f4487v, new P0.a(null, bVar));
                P0.v.d(xVar, str);
                return yVar;
            case 2:
                List list2 = (List) obj2;
                C1856g c1856g = (C1856g) obj;
                AbstractC1276k.f(c1856g, "$this$LazyColumn");
                C1856g.n(c1856g, null, new C0873f(new R2.q((String) obj3, i9), true, 307755826), 3);
                c1856g.o(list2.size(), null, new S(list2, 5), new C0873f(new U2.g(list2, list2, z5), true, 2039820996));
                return yVar;
            default:
                final C2004b c2004b = (C2004b) obj3;
                final InterfaceC1942y interfaceC1942y = (InterfaceC1942y) obj2;
                P0.x xVar2 = (P0.x) obj;
                if (z5) {
                    InterfaceC1193a interfaceC1193a = new InterfaceC1193a() { // from class: z.n
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            boolean z6;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            switch (i7) {
                                case 0:
                                    C2004b c2004b2 = c2004b;
                                    if (c2004b2.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b2, null), 3);
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    return Boolean.valueOf(z6);
                                case 1:
                                    C2004b c2004b3 = c2004b;
                                    if (c2004b3.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b3, null), 3);
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    C2004b c2004b4 = c2004b;
                                    if (c2004b4.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b4, null), 3);
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    return Boolean.valueOf(z8);
                                default:
                                    C2004b c2004b5 = c2004b;
                                    if (c2004b5.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b5, null), 3);
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    return Boolean.valueOf(z9);
                            }
                        }
                    };
                    s4.e[] eVarArr3 = P0.v.a;
                    xVar2.a(P0.l.f4490y, new P0.a(null, interfaceC1193a));
                    xVar2.a(P0.l.f4464A, new P0.a(null, new InterfaceC1193a() { // from class: z.n
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            boolean z6;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            switch (i9) {
                                case 0:
                                    C2004b c2004b2 = c2004b;
                                    if (c2004b2.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b2, null), 3);
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    return Boolean.valueOf(z6);
                                case 1:
                                    C2004b c2004b3 = c2004b;
                                    if (c2004b3.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b3, null), 3);
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    C2004b c2004b4 = c2004b;
                                    if (c2004b4.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b4, null), 3);
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    return Boolean.valueOf(z8);
                                default:
                                    C2004b c2004b5 = c2004b;
                                    if (c2004b5.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b5, null), 3);
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    return Boolean.valueOf(z9);
                            }
                        }
                    }));
                } else {
                    final int i10 = 2;
                    InterfaceC1193a interfaceC1193a2 = new InterfaceC1193a() { // from class: z.n
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            boolean z6;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            switch (i10) {
                                case 0:
                                    C2004b c2004b2 = c2004b;
                                    if (c2004b2.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b2, null), 3);
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    return Boolean.valueOf(z6);
                                case 1:
                                    C2004b c2004b3 = c2004b;
                                    if (c2004b3.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b3, null), 3);
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    C2004b c2004b4 = c2004b;
                                    if (c2004b4.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b4, null), 3);
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    return Boolean.valueOf(z8);
                                default:
                                    C2004b c2004b5 = c2004b;
                                    if (c2004b5.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b5, null), 3);
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    return Boolean.valueOf(z9);
                            }
                        }
                    };
                    s4.e[] eVarArr4 = P0.v.a;
                    xVar2.a(P0.l.f4491z, new P0.a(null, interfaceC1193a2));
                    xVar2.a(P0.l.f4465B, new P0.a(null, new InterfaceC1193a() { // from class: z.n
                        @Override // l4.InterfaceC1193a
                        public final Object b() {
                            boolean z6;
                            boolean z7;
                            boolean z8;
                            boolean z9;
                            switch (i8) {
                                case 0:
                                    C2004b c2004b2 = c2004b;
                                    if (c2004b2.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b2, null), 3);
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    return Boolean.valueOf(z6);
                                case 1:
                                    C2004b c2004b3 = c2004b;
                                    if (c2004b3.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b3, null), 3);
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    return Boolean.valueOf(z7);
                                case 2:
                                    C2004b c2004b4 = c2004b;
                                    if (c2004b4.c()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new o(c2004b4, null), 3);
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    return Boolean.valueOf(z8);
                                default:
                                    C2004b c2004b5 = c2004b;
                                    if (c2004b5.d()) {
                                        AbstractC1888A.y(interfaceC1942y, null, new p(c2004b5, null), 3);
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    return Boolean.valueOf(z9);
                            }
                        }
                    }));
                }
                return yVar;
        }
    }

    public /* synthetic */ k(String str, List list, boolean z5) {
        this.f2836c = 2;
        this.f2839g = list;
        this.f2838f = str;
        this.f2837e = z5;
    }

    public /* synthetic */ k(boolean z5, Object obj, Object obj2, int i6) {
        this.f2836c = i6;
        this.f2837e = z5;
        this.f2838f = obj;
        this.f2839g = obj2;
    }
}
