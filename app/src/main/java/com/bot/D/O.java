package D;

import Q.C0413f2;
import Q.C0445n2;
import S2.AbstractC0565e;
import T.C0626q;
import h0.InterfaceC1041r;
import n0.C1353b;
import q0.InterfaceC1498d;

/* loaded from: classes.dex */
public final /* synthetic */ class O implements l4.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f850c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f852f;

    public /* synthetic */ O(int i6, int i7, Object obj, boolean z5) {
        this.f850c = i7;
        this.f852f = obj;
        this.f851e = z5;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        int i6 = this.f850c;
        X3.y yVar = X3.y.a;
        boolean z5 = this.f851e;
        Object obj3 = this.f852f;
        switch (i6) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC0090r0.j((O.N0) obj3, z5, (C0626q) obj, T.r.J(1));
                return yVar;
            case 1:
                ((Integer) obj2).getClass();
                Y3.C.d(z5, (l4.e) obj3, (C0626q) obj, T.r.J(1));
                return yVar;
            case 2:
                InterfaceC1498d interfaceC1498d = (InterfaceC1498d) obj;
                C0445n2 c0445n2 = C0445n2.a;
                long a = ((C0413f2) obj3).a(z5, true);
                float f6 = C0445n2.f6013b;
                InterfaceC1498d.c0(interfaceC1498d, a, interfaceC1498d.e0(f6) / 2.0f, ((C1353b) obj2).a, null, 120);
                return yVar;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC0565e.q((String) obj3, z5, (C0626q) obj, T.r.J(1));
                return yVar;
            default:
                ((Integer) obj2).getClass();
                int J4 = T.r.J(1);
                AbstractC0565e.i(J4, (C0626q) obj, (InterfaceC1041r) obj3, z5);
                return yVar;
        }
    }

    public /* synthetic */ O(C0413f2 c0413f2, boolean z5) {
        this.f850c = 2;
        this.f852f = c0413f2;
        this.f851e = z5;
    }

    public /* synthetic */ O(boolean z5, l4.e eVar, int i6) {
        this.f850c = 1;
        this.f851e = z5;
        this.f852f = eVar;
    }
}
