package M4;

import m4.AbstractC1276k;

/* renamed from: M4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271s extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0271s f3488c = new f0(C0272t.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC1276k.f(dArr, "<this>");
        return dArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        r rVar = (r) obj;
        AbstractC1276k.f(rVar, "builder");
        double D4 = aVar.D(this.f3465b, i6);
        rVar.b(rVar.d() + 1);
        double[] dArr = rVar.a;
        int i7 = rVar.f3486b;
        rVar.f3486b = i7 + 1;
        dArr[i7] = D4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.r, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        AbstractC1276k.f(dArr, "<this>");
        Object obj2 = new Object();
        obj2.a = dArr;
        obj2.f3486b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new double[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        double[] dArr = (double[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(dArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            double d6 = dArr[i7];
            e0 e0Var = this.f3465b;
            AbstractC1276k.f(e0Var, "descriptor");
            wVar.r(e0Var, i7);
            wVar.d(d6);
        }
    }
}
