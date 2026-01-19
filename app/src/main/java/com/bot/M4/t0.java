package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class t0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final t0 f3491c = new f0(u0.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        int[] iArr = ((X3.s) obj).f9409c;
        AbstractC1276k.f(iArr, "$this$collectionSize");
        return iArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        s0 s0Var = (s0) obj;
        AbstractC1276k.f(s0Var, "builder");
        int k3 = aVar.c(this.f3465b, i6).k();
        s0Var.b(s0Var.d() + 1);
        int[] iArr = s0Var.a;
        int i7 = s0Var.f3489b;
        s0Var.f3489b = i7 + 1;
        iArr[i7] = k3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.s0, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        int[] iArr = ((X3.s) obj).f9409c;
        AbstractC1276k.f(iArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.f3489b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new X3.s(new int[0]);
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        int[] iArr = ((X3.s) obj).f9409c;
        AbstractC1276k.f(wVar, "encoder");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.s(this.f3465b, i7).k(iArr[i7]);
        }
    }
}
