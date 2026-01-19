package F0;

import e1.C0959a;

/* renamed from: F0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0122j implements U {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1480c;

    /* renamed from: e, reason: collision with root package name */
    public final U f1481e;

    /* renamed from: f, reason: collision with root package name */
    public final Enum f1482f;

    /* renamed from: g, reason: collision with root package name */
    public final Enum f1483g;

    public /* synthetic */ C0122j(U u5, Enum r22, Enum r32, int i6) {
        this.f1480c = i6;
        this.f1481e = u5;
        this.f1482f = r22;
        this.f1483g = r32;
    }

    @Override // F0.U
    public final Object H() {
        switch (this.f1480c) {
            case 0:
                return this.f1481e.H();
            case 1:
                return this.f1481e.H();
            default:
                return this.f1481e.H();
        }
    }

    @Override // F0.U
    public final int a0(int i6) {
        switch (this.f1480c) {
            case 0:
                return this.f1481e.a0(i6);
            case 1:
                return this.f1481e.a0(i6);
            default:
                return this.f1481e.a0(i6);
        }
    }

    @Override // F0.U
    public final int d(int i6) {
        switch (this.f1480c) {
            case 0:
                return this.f1481e.d(i6);
            case 1:
                return this.f1481e.d(i6);
            default:
                return this.f1481e.d(i6);
        }
    }

    @Override // F0.U
    public final int o(int i6) {
        switch (this.f1480c) {
            case 0:
                return this.f1481e.o(i6);
            case 1:
                return this.f1481e.o(i6);
            default:
                return this.f1481e.o(i6);
        }
    }

    @Override // F0.U
    public final int q(int i6) {
        switch (this.f1480c) {
            case 0:
                return this.f1481e.q(i6);
            case 1:
                return this.f1481e.q(i6);
            default:
                return this.f1481e.q(i6);
        }
    }

    @Override // F0.U
    public final k0 w(long j3) {
        switch (this.f1480c) {
            case 0:
                EnumC0130s enumC0130s = (EnumC0130s) this.f1482f;
                EnumC0131t enumC0131t = (EnumC0131t) this.f1483g;
                EnumC0131t enumC0131t2 = EnumC0131t.f1527c;
                EnumC0130s enumC0130s2 = EnumC0130s.f1520e;
                U u5 = this.f1481e;
                if (enumC0131t == enumC0131t2) {
                    return new C0124l(enumC0130s == enumC0130s2 ? u5.q(C0959a.g(j3)) : u5.o(C0959a.g(j3)), C0959a.c(j3) ? C0959a.g(j3) : 32767, 0);
                }
                return new C0124l(C0959a.d(j3) ? C0959a.h(j3) : 32767, enumC0130s == enumC0130s2 ? u5.d(C0959a.h(j3)) : u5.a0(C0959a.h(j3)), 0);
            case 1:
                Y y5 = (Y) this.f1482f;
                Z z5 = (Z) this.f1483g;
                Z z6 = Z.f1464c;
                Y y6 = Y.f1462e;
                U u6 = this.f1481e;
                if (z5 == z6) {
                    return new C0124l(y5 == y6 ? u6.q(C0959a.g(j3)) : u6.o(C0959a.g(j3)), C0959a.c(j3) ? C0959a.g(j3) : 32767, 1);
                }
                return new C0124l(C0959a.d(j3) ? C0959a.h(j3) : 32767, y5 == y6 ? u6.d(C0959a.h(j3)) : u6.a0(C0959a.h(j3)), 1);
            default:
                H0.k0 k0Var = (H0.k0) this.f1482f;
                H0.l0 l0Var = (H0.l0) this.f1483g;
                H0.l0 l0Var2 = H0.l0.f1968c;
                H0.k0 k0Var2 = H0.k0.f1966e;
                U u7 = this.f1481e;
                if (l0Var == l0Var2) {
                    return new C0124l(k0Var == k0Var2 ? u7.q(C0959a.g(j3)) : u7.o(C0959a.g(j3)), C0959a.c(j3) ? C0959a.g(j3) : 32767, 2);
                }
                return new C0124l(C0959a.d(j3) ? C0959a.h(j3) : 32767, k0Var == k0Var2 ? u7.d(C0959a.h(j3)) : u7.a0(C0959a.h(j3)), 2);
        }
    }
}
