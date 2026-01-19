package O;

import D.AbstractC0090r0;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class H {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3950b = 0;
    public final /* synthetic */ int a;

    /* JADX WARN: Type inference failed for: r3v10, types: [m4.r, java.lang.Object] */
    public final G a(InterfaceC0307f0 interfaceC0307f0) {
        F k3;
        F f6;
        boolean z5;
        G a;
        switch (this.a) {
            case 0:
                return new G(interfaceC0307f0.k().a(interfaceC0307f0.k().f3924c), interfaceC0307f0.g().a(interfaceC0307f0.g().f3925d), interfaceC0307f0.h() == EnumC0318l.f4145c);
            case 1:
                return AbstractC0336u0.h(interfaceC0307f0, I.f3952c);
            case 2:
                return AbstractC0336u0.h(interfaceC0307f0, I.f3951b);
            default:
                G c6 = interfaceC0307f0.c();
                if (c6 == null) {
                    return AbstractC0336u0.h(interfaceC0307f0, I.f3952c);
                }
                F f7 = c6.f3945b;
                F f8 = c6.a;
                if (interfaceC0307f0.a()) {
                    f6 = AbstractC0336u0.k(interfaceC0307f0, interfaceC0307f0.k(), f8);
                    k3 = f7;
                    f7 = f8;
                    f8 = f6;
                } else {
                    k3 = AbstractC0336u0.k(interfaceC0307f0, interfaceC0307f0.g(), f7);
                    f6 = k3;
                }
                if (AbstractC1276k.b(f6, f7)) {
                    return c6;
                }
                G g3 = new G(f8, k3, interfaceC0307f0.h() == EnumC0318l.f4145c || (interfaceC0307f0.h() == EnumC0318l.f4147f && f8.f3941b > k3.f3941b));
                boolean z6 = false;
                F f9 = g3.a;
                long j3 = f9.f3942c;
                F f10 = g3.f3945b;
                if (j3 == f10.f3942c) {
                    if (f9.f3941b == f10.f3941b) {
                        z5 = true;
                    }
                    z5 = false;
                } else {
                    boolean z7 = g3.f3946c;
                    if ((z7 ? f9 : f10).f3941b == 0) {
                        if (z7) {
                            f9 = f10;
                        }
                        if (interfaceC0307f0.d().f3927f.a.a.f7630e.length() == f9.f3941b) {
                            ?? obj = new Object();
                            obj.f12968c = true;
                            interfaceC0307f0.j(new C0311h0(obj, 0));
                            z5 = obj.f12968c;
                        }
                    }
                    z5 = false;
                }
                if (z5) {
                    String str = interfaceC0307f0.b().f3927f.a.a.f7630e;
                    if (interfaceC0307f0.m() <= 1 && interfaceC0307f0.c() != null) {
                        if (!(str.length() == 0)) {
                            D b5 = interfaceC0307f0.b();
                            String str2 = b5.f3927f.a.a.f7630e;
                            int i6 = b5.f3924c;
                            int length = str2.length();
                            if (i6 == 0) {
                                int s5 = AbstractC0090r0.s(0, str2);
                                a = interfaceC0307f0.a() ? G.a(g3, AbstractC0336u0.o(g3.a, b5, s5), null, true, 2) : G.a(g3, null, AbstractC0336u0.o(g3.f3945b, b5, s5), false, 1);
                            } else if (i6 == length) {
                                int v5 = AbstractC0090r0.v(length, str2);
                                a = interfaceC0307f0.a() ? G.a(g3, AbstractC0336u0.o(g3.a, b5, v5), null, false, 2) : G.a(g3, null, AbstractC0336u0.o(g3.f3945b, b5, v5), true, 1);
                            } else {
                                G c7 = interfaceC0307f0.c();
                                if (c7 != null && c7.f3946c) {
                                    z6 = true;
                                }
                                int v6 = interfaceC0307f0.a() ^ z6 ? AbstractC0090r0.v(i6, str2) : AbstractC0090r0.s(i6, str2);
                                a = interfaceC0307f0.a() ? G.a(g3, AbstractC0336u0.o(g3.a, b5, v6), null, z6, 2) : G.a(g3, null, AbstractC0336u0.o(g3.f3945b, b5, v6), z6, 1);
                            }
                            return a;
                        }
                    }
                }
                return g3;
        }
    }
}
