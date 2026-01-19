package D;

import H0.AbstractC0157l;
import I0.AbstractC0204q0;
import O.AbstractC0336u0;
import Q.C0439m0;
import Q.C0447o0;
import Q.C0449o2;
import Q.C0488y2;
import Q.C2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b4.InterfaceC0905c;
import c4.EnumC0927a;
import l4.InterfaceC1193a;
import p.C1458t;
import p.C1459u;
import r.AbstractC1573i;
import r.C1598q0;
import r.a2;
import r.f2;
import v.AbstractC1787b;
import w0.InterfaceC1830a;
import x4.AbstractC1888A;
import z.C2004b;
import z.C2007e;

/* renamed from: D.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0057a0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f975b;

    public /* synthetic */ C0057a0(Object obj, int i6) {
        this.a = i6;
        this.f975b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(B0.D d6, InterfaceC0905c interfaceC0905c) {
        l4.c cVar;
        int i6 = this.a;
        X3.y yVar = X3.y.a;
        EnumC0927a enumC0927a = EnumC0927a.f11114c;
        Object obj = this.f975b;
        switch (i6) {
            case 0:
                O.N0 n02 = (O.N0) obj;
                Object n3 = AbstractC0336u0.n(d6, n02.f4017z, n02.f4016y, interfaceC0905c);
                return n3 == enumC0927a ? n3 : yVar;
            case 1:
                Object h3 = AbstractC1573i.h(d6, new H.b(null, new P0(1, (J.h) obj, J.h.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 0, 1)), interfaceC0905c);
                if (h3 != enumC0927a) {
                    h3 = yVar;
                }
                return h3 == enumC0927a ? h3 : yVar;
            case 2:
                Object h6 = AbstractC1573i.h(d6, new L.c((L.d) obj, null), interfaceC0905c);
                return h6 == enumC0927a ? h6 : yVar;
            case 3:
                Object h7 = AbstractC1573i.h(d6, new C0447o0((C0439m0) obj, null), interfaceC0905c);
                return h7 == enumC0927a ? h7 : yVar;
            case 4:
                C2 c22 = (C2) obj;
                Object e6 = f2.e(d6, null, new C0488y2(c22, null), new C0449o2(c22, 2), interfaceC0905c, 3);
                return e6 == enumC0927a ? e6 : yVar;
            case AbstractC1787b.f15290g /* 5 */:
                Object h8 = AbstractC1573i.h(d6, new C1458t((C1459u) obj, null), interfaceC0905c);
                return h8 == enumC0927a ? h8 : yVar;
            case 6:
                final p.S s5 = (p.S) obj;
                if (!s5.f13786y || s5.f13645P == null) {
                    cVar = null;
                } else {
                    final int i7 = 0;
                    cVar = new l4.c() { // from class: p.O
                        @Override // l4.c
                        public final Object f(Object obj2) {
                            switch (i7) {
                                case 0:
                                    S s6 = s5;
                                    InterfaceC1193a interfaceC1193a = s6.f13645P;
                                    if (interfaceC1193a != null) {
                                        interfaceC1193a.b();
                                    }
                                    if (s6.f13646Q) {
                                        ((InterfaceC1830a) AbstractC0157l.h(s6, AbstractC0204q0.f2362l)).a(0);
                                    }
                                    return X3.y.a;
                                default:
                                    S s7 = s5;
                                    if (s7.f13786y) {
                                        s7.f13787z.b();
                                    }
                                    return X3.y.a;
                            }
                        }
                    };
                }
                p.P p5 = new p.P(s5, null);
                final int i8 = 1;
                l4.c cVar2 = new l4.c() { // from class: p.O
                    @Override // l4.c
                    public final Object f(Object obj2) {
                        switch (i8) {
                            case 0:
                                S s6 = s5;
                                InterfaceC1193a interfaceC1193a = s6.f13645P;
                                if (interfaceC1193a != null) {
                                    interfaceC1193a.b();
                                }
                                if (s6.f13646Q) {
                                    ((InterfaceC1830a) AbstractC0157l.h(s6, AbstractC0204q0.f2362l)).a(0);
                                }
                                return X3.y.a;
                            default:
                                S s7 = s5;
                                if (s7.f13786y) {
                                    s7.f13787z.b();
                                }
                                return X3.y.a;
                        }
                    }
                };
                C1598q0 c1598q0 = f2.a;
                Object l3 = AbstractC1888A.l(new a2(d6, p5, cVar, null, cVar2, null), interfaceC0905c);
                if (l3 != enumC0927a) {
                    l3 = yVar;
                }
                return l3 == enumC0927a ? l3 : yVar;
            default:
                Object l5 = AbstractC1888A.l(new C2007e(d6, (C2004b) obj, null), interfaceC0905c);
                return l5 == enumC0927a ? l5 : yVar;
        }
    }
}
