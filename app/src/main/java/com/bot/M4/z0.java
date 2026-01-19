package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class z0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f3509c = new f0(A0.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        short[] sArr = ((X3.x) obj).f9413c;
        AbstractC1276k.f(sArr, "$this$collectionSize");
        return sArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        y0 y0Var = (y0) obj;
        AbstractC1276k.f(y0Var, "builder");
        short z5 = aVar.c(this.f3465b, i6).z();
        y0Var.b(y0Var.d() + 1);
        short[] sArr = y0Var.a;
        int i7 = y0Var.f3507b;
        y0Var.f3507b = i7 + 1;
        sArr[i7] = z5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, M4.y0] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        short[] sArr = ((X3.x) obj).f9413c;
        AbstractC1276k.f(sArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.f3507b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new X3.x(new short[0]);
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        short[] sArr = ((X3.x) obj).f9413c;
        AbstractC1276k.f(wVar, "encoder");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.s(this.f3465b, i7).e(sArr[i7]);
        }
    }
}
