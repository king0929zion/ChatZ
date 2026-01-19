package D;

import F0.InterfaceC0134w;
import S0.C0545g;
import T.C0607g0;
import T.C0627q0;
import T.C0639x;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class Q implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f868c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0098v0 f869e;

    public /* synthetic */ Q(C0098v0 c0098v0, int i6) {
        this.f868c = i6;
        this.f869e = c0098v0;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f868c) {
            case 0:
                InterfaceC0134w interfaceC0134w = (InterfaceC0134w) obj;
                d1 d6 = this.f869e.d();
                if (d6 != null) {
                    d6.f1003c = interfaceC0134w;
                }
                return X3.y.a;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f869e.f1198q.setValue(bool);
                return X3.y.a;
            case 2:
                C0098v0 c0098v0 = this.f869e;
                C0607g0 c0607g0 = c0098v0.f1201t;
                X0.v vVar = (X0.v) obj;
                String str = vVar.a.f7630e;
                C0545g c0545g = c0098v0.f1191j;
                if (!AbstractC1276k.b(str, c0545g != null ? c0545g.f7630e : null)) {
                    c0098v0.f1192k.setValue(EnumC0075j0.f1042c);
                    if (((Boolean) c0607g0.getValue()).booleanValue()) {
                        c0607g0.setValue(Boolean.FALSE);
                    } else {
                        c0098v0.f1200s.setValue(Boolean.FALSE);
                    }
                }
                long j3 = S0.O.f7610b;
                c0098v0.f(j3);
                c0098v0.e(j3);
                c0098v0.f1202u.f(vVar);
                C0627q0 c0627q0 = c0098v0.f1183b;
                C0639x c0639x = c0627q0.a;
                if (c0639x != null) {
                    c0639x.s(c0627q0, null);
                }
                return X3.y.a;
            case 3:
                this.f869e.f1199r.b(((X0.j) obj).a);
                return X3.y.a;
            default:
                return Boolean.valueOf(this.f869e.f1199r.b(((X0.j) obj).a));
        }
    }
}
