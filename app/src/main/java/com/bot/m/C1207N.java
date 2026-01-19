package m;

import h0.InterfaceC1028e;
import m4.AbstractC1276k;
import m4.AbstractC1277l;

/* renamed from: m.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1207N extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1209P f12744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1207N(C1209P c1209p, long j3, int i6) {
        super(1);
        this.f12743e = i6;
        this.f12744f = c1209p;
        this.f12745g = j3;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [m4.l, l4.c] */
    /* JADX WARN: Type inference failed for: r1v15, types: [m4.l, l4.c] */
    @Override // l4.c
    public final Object f(Object obj) {
        l4.c cVar;
        l4.c cVar2;
        long j3;
        int ordinal;
        switch (this.f12743e) {
            case 0:
                int ordinal2 = ((EnumC1199F) obj).ordinal();
                C1209P c1209p = this.f12744f;
                long j4 = this.f12745g;
                if (ordinal2 == 0) {
                    C1197D c1197d = c1209p.f12756w.a.f12788c;
                    if (c1197d != null && (cVar = c1197d.f12709b) != null) {
                        j4 = ((e1.l) cVar.f(new e1.l(j4))).a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        throw new RuntimeException();
                    }
                    C1197D c1197d2 = c1209p.f12757x.a.f12788c;
                    if (c1197d2 != null && (cVar2 = c1197d2.f12709b) != null) {
                        j4 = ((e1.l) cVar2.f(new e1.l(j4))).a;
                    }
                }
                return new e1.l(j4);
            case 1:
                EnumC1199F enumC1199F = (EnumC1199F) obj;
                C1209P c1209p2 = this.f12744f;
                if (c1209p2.f12749B != null && c1209p2.O0() != null && !AbstractC1276k.b(c1209p2.f12749B, c1209p2.O0()) && (ordinal = enumC1199F.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                    C1197D c1197d3 = c1209p2.f12757x.a.f12788c;
                    if (c1197d3 != null) {
                        l4.c cVar3 = c1197d3.f12709b;
                        long j5 = this.f12745g;
                        long j6 = ((e1.l) cVar3.f(new e1.l(j5))).a;
                        InterfaceC1028e O02 = c1209p2.O0();
                        AbstractC1276k.c(O02);
                        e1.m mVar = e1.m.f11576c;
                        long a = O02.a(j5, j6, mVar);
                        InterfaceC1028e interfaceC1028e = c1209p2.f12749B;
                        AbstractC1276k.c(interfaceC1028e);
                        j3 = e1.j.d(a, interfaceC1028e.a(j5, j6, mVar));
                        return new e1.j(j3);
                    }
                }
                j3 = 0;
                return new e1.j(j3);
            default:
                EnumC1199F enumC1199F2 = (EnumC1199F) obj;
                C1209P c1209p3 = this.f12744f;
                b0 b0Var = c1209p3.f12756w.a.f12787b;
                long j7 = this.f12745g;
                long j8 = 0;
                long j9 = b0Var != null ? ((e1.j) b0Var.a.f(new e1.l(j7))).a : 0L;
                b0 b0Var2 = c1209p3.f12757x.a.f12787b;
                long j10 = b0Var2 != null ? ((e1.j) b0Var2.a.f(new e1.l(j7))).a : 0L;
                int ordinal3 = enumC1199F2.ordinal();
                if (ordinal3 == 0) {
                    j8 = j9;
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        throw new RuntimeException();
                    }
                    j8 = j10;
                }
                return new e1.j(j8);
        }
    }
}
