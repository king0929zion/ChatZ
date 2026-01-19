package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class l0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final l0 f3475c = new f0(m0.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC1276k.f(sArr, "<this>");
        return sArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        k0 k0Var = (k0) obj;
        AbstractC1276k.f(k0Var, "builder");
        short w5 = aVar.w(this.f3465b, i6);
        k0Var.b(k0Var.d() + 1);
        short[] sArr = k0Var.a;
        int i7 = k0Var.f3474b;
        k0Var.f3474b = i7 + 1;
        sArr[i7] = w5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.k0, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        AbstractC1276k.f(sArr, "<this>");
        Object obj2 = new Object();
        obj2.a = sArr;
        obj2.f3474b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new short[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        short[] sArr = (short[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(sArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            short s5 = sArr[i7];
            e0 e0Var = this.f3465b;
            AbstractC1276k.f(e0Var, "descriptor");
            wVar.r(e0Var, i7);
            wVar.e(s5);
        }
    }
}
