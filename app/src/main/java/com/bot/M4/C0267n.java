package M4;

import m4.AbstractC1276k;

/* renamed from: M4.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267n extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0267n f3478c = new f0(C0268o.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC1276k.f(cArr, "<this>");
        return cArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        C0266m c0266m = (C0266m) obj;
        AbstractC1276k.f(c0266m, "builder");
        char v5 = aVar.v(this.f3465b, i6);
        c0266m.b(c0266m.d() + 1);
        char[] cArr = c0266m.a;
        int i7 = c0266m.f3476b;
        c0266m.f3476b = i7 + 1;
        cArr[i7] = v5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.m, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        AbstractC1276k.f(cArr, "<this>");
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.f3476b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new char[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        char[] cArr = (char[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(cArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            char c6 = cArr[i7];
            e0 e0Var = this.f3465b;
            AbstractC1276k.f(e0Var, "descriptor");
            wVar.r(e0Var, i7);
            wVar.i(c6);
        }
    }
}
