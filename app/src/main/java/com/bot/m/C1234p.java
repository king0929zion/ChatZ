package m;

import T.d1;
import m4.AbstractC1276k;
import m4.AbstractC1277l;
import n.AbstractC1318d;
import n.InterfaceC1351z;
import n.s0;

/* renamed from: m.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1234p extends AbstractC1277l implements l4.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C1235q f12823f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f12824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1234p(C1235q c1235q, long j3, int i6) {
        super(1);
        this.f12822e = i6;
        this.f12823f = c1235q;
        this.f12824g = j3;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        long j3;
        InterfaceC1351z interfaceC1351z;
        long j4;
        switch (this.f12822e) {
            case 0:
                s0 s0Var = (s0) obj;
                Object b5 = s0Var.b();
                C1235q c1235q = this.f12823f;
                if (AbstractC1276k.b(b5, c1235q.f12827u.b())) {
                    j3 = e1.l.b(c1235q.f12828v, AbstractC1227i.a) ? this.f12824g : c1235q.f12828v;
                } else {
                    d1 d1Var = (d1) c1235q.f12827u.f12834e.g(s0Var.b());
                    j3 = d1Var != null ? ((e1.l) d1Var.getValue()).a : 0L;
                }
                d1 d1Var2 = (d1) c1235q.f12827u.f12834e.g(s0Var.c());
                long j5 = d1Var2 != null ? ((e1.l) d1Var2.getValue()).a : 0L;
                a0 a0Var = (a0) c1235q.f12826t.getValue();
                return (a0Var == null || (interfaceC1351z = (InterfaceC1351z) a0Var.a.m(new e1.l(j3), new e1.l(j5))) == null) ? AbstractC1318d.r(S.l.f7374V, 400.0f, null, 5) : interfaceC1351z;
            default:
                C1235q c1235q2 = this.f12823f;
                if (AbstractC1276k.b(obj, c1235q2.f12827u.b())) {
                    j4 = e1.l.b(c1235q2.f12828v, AbstractC1227i.a) ? this.f12824g : c1235q2.f12828v;
                } else {
                    d1 d1Var3 = (d1) c1235q2.f12827u.f12834e.g(obj);
                    j4 = d1Var3 != null ? ((e1.l) d1Var3.getValue()).a : 0L;
                }
                return new e1.l(j4);
        }
    }
}
