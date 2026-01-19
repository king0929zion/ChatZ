package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class q0 extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f3485c = new f0(r0.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        byte[] bArr = ((X3.q) obj).f9407c;
        AbstractC1276k.f(bArr, "$this$collectionSize");
        return bArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        p0 p0Var = (p0) obj;
        AbstractC1276k.f(p0Var, "builder");
        byte y5 = aVar.c(this.f3465b, i6).y();
        p0Var.b(p0Var.d() + 1);
        byte[] bArr = p0Var.a;
        int i7 = p0Var.f3484b;
        p0Var.f3484b = i7 + 1;
        bArr[i7] = y5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.p0, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        byte[] bArr = ((X3.q) obj).f9407c;
        AbstractC1276k.f(bArr, "$this$toBuilder");
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.f3484b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new X3.q(new byte[0]);
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        byte[] bArr = ((X3.q) obj).f9407c;
        AbstractC1276k.f(wVar, "encoder");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.s(this.f3465b, i7).f(bArr[i7]);
        }
    }
}
