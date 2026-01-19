package H0;

import I0.AbstractC0204q0;
import I0.X0;
import T.InterfaceC0643z;
import T.e1;
import b0.C0878k;
import e1.InterfaceC0961c;
import h0.AbstractC1040q;
import h0.InterfaceC1041r;
import m4.AbstractC1277l;
import org.jsoup.internal.SharedConstants;

/* renamed from: H0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146e extends AbstractC1277l implements l4.e {

    /* renamed from: f, reason: collision with root package name */
    public static final C0146e f1907f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0146e f1908g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0146e f1909h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0146e f1910i;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1911e;

    static {
        int i6 = 2;
        f1907f = new C0146e(i6, 0);
        f1908g = new C0146e(i6, 1);
        f1909h = new C0146e(i6, 2);
        f1910i = new C0146e(i6, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0146e(int i6, int i7) {
        super(i6);
        this.f1911e = i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
                                                                                            @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        switch (this.f1911e) {
            case 0:
                ((Number) obj2).intValue();
                ((InterfaceC0152h) obj).getClass();
                return X3.y.a;
            case 1:
                ((J) ((InterfaceC0152h) obj)).e0((F0.V) obj2);
                return X3.y.a;
            case 2:
                ((J) ((InterfaceC0152h) obj)).f0((InterfaceC1041r) obj2);
                return X3.y.a;
            default:
                InterfaceC0643z interfaceC0643z = (InterfaceC0643z) obj2;
                J j3 = (J) ((InterfaceC0152h) obj);
                j3.f1717F = interfaceC0643z;
                C0149f0 c0149f0 = j3.f1721J;
                e1 e1Var = AbstractC0204q0.f2358h;
                C0878k c0878k = (C0878k) interfaceC0643z;
                c0878k.getClass();
                j3.b0((InterfaceC0961c) T.r.B(c0878k, e1Var));
                e1.m mVar = (e1.m) T.r.B(c0878k, AbstractC0204q0.f2364n);
                if (j3.f1715D != mVar) {
                    j3.f1715D = mVar;
                    j3.E();
                    J v5 = j3.v();
                    if (v5 != null) {
                        v5.C();
                    }
                    j3.D();
                    for (AbstractC1040q abstractC1040q = c0149f0.f1919f; abstractC1040q != null; abstractC1040q = abstractC1040q.f11811i) {
                        abstractC1040q.U();
                    }
                }
                j3.g0((X0) T.r.B(c0878k, AbstractC0204q0.f2369s));
                AbstractC1040q abstractC1040q2 = c0149f0.f1919f;
                if ((abstractC1040q2.f11809g & SharedConstants.DefaultBufferSize) != 0) {
                    while (abstractC1040q2 != null) {
                        if ((abstractC1040q2.f11808f & SharedConstants.DefaultBufferSize) != 0) {
                            AbstractC0156k abstractC0156k = abstractC1040q2;
                            int r22 = 0;
                            while (abstractC0156k != 0) {
                                if (abstractC0156k instanceof InterfaceC0154i) {
                                    AbstractC1040q abstractC1040q3 = ((AbstractC1040q) ((InterfaceC0154i) abstractC0156k)).f11806c;
                                    if (abstractC1040q3.f11819q) {
                                        j0.c(abstractC1040q3);
                                    } else {
                                        abstractC1040q3.f11815m = true;
                                    }
                                } else if ((abstractC0156k.f11808f & SharedConstants.DefaultBufferSize) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                    AbstractC1040q abstractC1040q4 = abstractC0156k.f1964s;
                                    int i6 = 0;
                                    abstractC0156k = abstractC0156k;
                                    r22 = r22;
                                    while (abstractC1040q4 != null) {
                                        if ((abstractC1040q4.f11808f & SharedConstants.DefaultBufferSize) != 0) {
                                            i6++;
                                            r22 = r22;
                                            if (i6 == 1) {
                                                abstractC0156k = abstractC1040q4;
                                            } else {
                                                if (r22 == 0) {
                                                    r22 = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC0156k != 0) {
                                                    r22.b(abstractC0156k);
                                                    abstractC0156k = 0;
                                                }
                                                r22.b(abstractC1040q4);
                                            }
                                        }
                                        abstractC1040q4 = abstractC1040q4.f11811i;
                                        abstractC0156k = abstractC0156k;
                                        r22 = r22;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC0156k = AbstractC0157l.e(r22);
                            }
                        }
                        if ((abstractC1040q2.f11809g & SharedConstants.DefaultBufferSize) != 0) {
                            abstractC1040q2 = abstractC1040q2.f11811i;
                        }
                    }
                }
                return X3.y.a;
        }
    }
}
