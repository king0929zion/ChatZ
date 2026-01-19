package D;

import O.AbstractC0336u0;
import O.C0327p0;
import O.C0332s0;
import T.C0602e;
import T.C0616l;
import T.C0626q;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import b0.C0873f;
import h0.C1038o;
import java.util.List;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class H implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f778c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0332s0 f779e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0873f f780f;

    public /* synthetic */ H(C0332s0 c0332s0, C0873f c0873f, int i6, int i7) {
        this.f778c = i7;
        this.f779e = c0332s0;
        this.f780f = c0873f;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        boolean z5;
        O.F f6;
        O.r c6;
        O.F f7;
        O.r c7;
        switch (this.f778c) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0090r0.c(this.f779e, this.f780f, (C0626q) obj, T.r.J(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC0090r0.e(this.f779e, this.f780f, (C0626q) obj, T.r.J(49));
                break;
            default:
                C0626q c0626q = (C0626q) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z6 = false;
                if (c0626q.S(intValue & 1, (intValue & 3) != 2)) {
                    this.f780f.m(c0626q, 0);
                    C0332s0 c0332s0 = this.f779e;
                    if (c0332s0.g() && ((Boolean) c0332s0.f4198i.getValue()).booleanValue()) {
                        O.G f8 = c0332s0.f();
                        if (!(f8 != null ? AbstractC1276k.b(f8.a, f8.f3945b) : true)) {
                            c0626q.b0(-1736224054);
                            O.G f9 = c0332s0.f();
                            if (f9 == null) {
                                c0626q.b0(2011629175);
                                c0626q.p(false);
                                z5 = false;
                            } else {
                                c0626q.b0(2011629176);
                                c0626q.b0(-1736222526);
                                List I5 = Y4.l.I(Boolean.TRUE, Boolean.FALSE);
                                int size = I5.size();
                                int i6 = 0;
                                while (i6 < size) {
                                    boolean booleanValue = ((Boolean) I5.get(i6)).booleanValue();
                                    boolean g3 = c0626q.g(booleanValue);
                                    Object P5 = c0626q.P();
                                    C0602e c0602e = C0616l.a;
                                    if (g3 || P5 == c0602e) {
                                        P5 = new C0327p0(booleanValue, c0332s0);
                                        c0626q.m0(P5);
                                    }
                                    H0 h02 = (H0) P5;
                                    boolean g6 = c0626q.g(booleanValue);
                                    Object P6 = c0626q.P();
                                    if (g6 || P6 == c0602e) {
                                        P6 = booleanValue ? new O.L(c0332s0, 1) : new O.L(c0332s0, 0);
                                        c0626q.m0(P6);
                                    }
                                    InterfaceC1193a interfaceC1193a = (InterfaceC1193a) P6;
                                    d1.j jVar = booleanValue ? f9.a.a : f9.f3945b.a;
                                    float f10 = S.l.f7374V;
                                    if (booleanValue) {
                                        O.G f11 = c0332s0.f();
                                        if (f11 != null && (c7 = c0332s0.c((f7 = f11.a))) != null) {
                                            int i7 = f7.f3941b;
                                            S0.L l3 = (S0.L) c7.f4182c.b();
                                            if (l3 != null) {
                                                f10 = AbstractC0090r0.x(l3, i7);
                                            }
                                        }
                                    } else {
                                        O.G f12 = c0332s0.f();
                                        if (f12 != null && (c6 = c0332s0.c((f6 = f12.f3945b))) != null) {
                                            int i8 = f6.f3941b;
                                            S0.L l5 = (S0.L) c6.f4182c.b();
                                            if (l5 != null) {
                                                f10 = AbstractC0090r0.x(l5, i8);
                                            }
                                        }
                                    }
                                    int i9 = i6;
                                    O.T t5 = new O.T(interfaceC1193a);
                                    boolean z7 = f9.f3946c;
                                    boolean h3 = c0626q.h(h02);
                                    Object P7 = c0626q.P();
                                    if (h3 || P7 == c0602e) {
                                        P7 = new O.S(h02, 0);
                                        c0626q.m0(P7);
                                    }
                                    AbstractC0336u0.d(t5, booleanValue, jVar, z7, 0L, f10, B0.Q.a(C1038o.a, h02, (PointerInputEventHandler) P7), c0626q, 0);
                                    i6 = i9 + 1;
                                    z6 = false;
                                }
                                z5 = z6;
                                c0626q.p(z5);
                                c0626q.p(z5);
                            }
                            c0626q.p(z5);
                        }
                    }
                    z5 = false;
                    c0626q.b0(2005806539);
                    c0626q.p(z5);
                } else {
                    c0626q.V();
                }
                return X3.y.a;
        }
        return X3.y.a;
    }

    public /* synthetic */ H(C0873f c0873f, C0332s0 c0332s0) {
        this.f778c = 2;
        this.f780f = c0873f;
        this.f779e = c0332s0;
    }
}
