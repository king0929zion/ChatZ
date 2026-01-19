package m;

import m4.AbstractC1277l;
import n.s0;

/* renamed from: m.O, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1208O extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1209P f12747f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1208O(C1209P c1209p, int i6) {
        super(1);
        this.f12746e = i6;
        this.f12747f = c1209p;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        b0 b0Var;
        switch (this.f12746e) {
            case 0:
                s0 s0Var = (s0) obj;
                EnumC1199F enumC1199F = EnumC1199F.f12714c;
                EnumC1199F enumC1199F2 = EnumC1199F.f12715e;
                boolean a = s0Var.a(enumC1199F, enumC1199F2);
                Object obj2 = null;
                C1209P c1209p = this.f12747f;
                if (a) {
                    C1197D c1197d = c1209p.f12756w.a.f12788c;
                    if (c1197d != null) {
                        obj2 = c1197d.f12710c;
                    }
                } else if (s0Var.a(enumC1199F2, EnumC1199F.f12716f)) {
                    C1197D c1197d2 = c1209p.f12757x.a.f12788c;
                    if (c1197d2 != null) {
                        obj2 = c1197d2.f12710c;
                    }
                } else {
                    obj2 = AbstractC1205L.f12738d;
                }
                return obj2 == null ? AbstractC1205L.f12738d : obj2;
            default:
                s0 s0Var2 = (s0) obj;
                EnumC1199F enumC1199F3 = EnumC1199F.f12714c;
                EnumC1199F enumC1199F4 = EnumC1199F.f12715e;
                boolean a6 = s0Var2.a(enumC1199F3, enumC1199F4);
                C1209P c1209p2 = this.f12747f;
                if (a6) {
                    b0 b0Var2 = c1209p2.f12756w.a.f12787b;
                    return b0Var2 != null ? b0Var2.f12770b : AbstractC1205L.f12737c;
                }
                if (s0Var2.a(enumC1199F4, EnumC1199F.f12716f) && (b0Var = c1209p2.f12757x.a.f12787b) != null) {
                    return b0Var.f12770b;
                }
                return AbstractC1205L.f12737c;
        }
    }
}
