package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class w0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final w0 f3502c = new f0(x0.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        long[] jArr = ((X3.u) obj).f9411c;
        AbstractC1276k.f(jArr, "$this$collectionSize");
        return jArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        v0 v0Var = (v0) obj;
        AbstractC1276k.f(v0Var, "builder");
        long n3 = aVar.c(this.f3465b, i6).n();
        v0Var.b(v0Var.d() + 1);
        long[] jArr = v0Var.a;
        int i7 = v0Var.f3498b;
        v0Var.f3498b = i7 + 1;
        jArr[i7] = n3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.v0, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        long[] jArr = ((X3.u) obj).f9411c;
        AbstractC1276k.f(jArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.f3498b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new X3.u(new long[0]);
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        long[] jArr = ((X3.u) obj).f9411c;
        AbstractC1276k.f(wVar, "encoder");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.s(this.f3465b, i7).n(jArr[i7]);
        }
    }
}
