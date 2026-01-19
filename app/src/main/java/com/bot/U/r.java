package U;

import T.C0;
import T.C0594a;
import T.C0627q0;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class r extends J {

    /* renamed from: d, reason: collision with root package name */
    public static final r f8584d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f8585e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f8586f;

    /* renamed from: g, reason: collision with root package name */
    public static final r f8587g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8588c;

    static {
        int i6 = 1;
        f8584d = new r(i6, 2, 0);
        int i7 = 1;
        f8585e = new r(i7, i7, 1);
        f8586f = new r(i6, 2, 2);
        int i8 = 1;
        f8587g = new r(i8, i8, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i6, int i7, int i8) {
        super(i6, i7);
        this.f8588c = i8;
    }

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        switch (this.f8588c) {
            case 0:
                Object b5 = ((InterfaceC1193a) l3.d(0)).b();
                C0594a c0594a = (C0594a) l3.d(1);
                int c6 = l3.c(0);
                c0594a.getClass();
                m02.U(m02.c(c0594a), b5);
                interfaceC0598c.m(c6, b5);
                interfaceC0598c.d(b5);
                return;
            case 1:
                C0594a c0594a2 = (C0594a) l3.d(0);
                int c7 = l3.c(0);
                interfaceC0598c.j();
                c0594a2.getClass();
                interfaceC0598c.c(c7, m02.D(m02.c(c0594a2)));
                return;
            case 2:
                Object d6 = l3.d(0);
                C0594a c0594a3 = (C0594a) l3.d(1);
                int c8 = l3.c(0);
                if (d6 instanceof C0) {
                    C0 c02 = (C0) d6;
                    c0879l.f10992e.b(c02);
                    c0879l.f10991d.a(c02);
                }
                Object K2 = m02.K(m02.c(c0594a3), c8, d6);
                if (K2 instanceof C0) {
                    c0879l.e((C0) K2);
                    return;
                } else {
                    if (K2 instanceof C0627q0) {
                        ((C0627q0) K2).d();
                        return;
                    }
                    return;
                }
            default:
                Object d7 = l3.d(0);
                int c9 = l3.c(0);
                if (d7 instanceof C0) {
                    C0 c03 = (C0) d7;
                    c0879l.f10992e.b(c03);
                    c0879l.f10991d.a(c03);
                }
                Object K5 = m02.K(m02.f8004t, c9, d7);
                if (K5 instanceof C0) {
                    c0879l.e((C0) K5);
                    return;
                } else {
                    if (K5 instanceof C0627q0) {
                        ((C0627q0) K5).d();
                        return;
                    }
                    return;
                }
        }
    }

    @Override // U.J
    public C0594a b(L l3) {
        switch (this.f8588c) {
            case 0:
                return (C0594a) l3.d(1);
            case 1:
                return (C0594a) l3.d(0);
            default:
                return super.b(l3);
        }
    }
}
