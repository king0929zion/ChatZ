package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class A extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final A f3417c = new f0(B.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC1276k.f(fArr, "<this>");
        return fArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        C0278z c0278z = (C0278z) obj;
        AbstractC1276k.f(c0278z, "builder");
        float B5 = aVar.B(this.f3465b, i6);
        c0278z.b(c0278z.d() + 1);
        float[] fArr = c0278z.a;
        int i7 = c0278z.f3508b;
        c0278z.f3508b = i7 + 1;
        fArr[i7] = B5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.z, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        AbstractC1276k.f(fArr, "<this>");
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.f3508b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new float[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        float[] fArr = (float[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(fArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            float f6 = fArr[i7];
            e0 e0Var = this.f3465b;
            AbstractC1276k.f(e0Var, "descriptor");
            wVar.r(e0Var, i7);
            wVar.h(f6);
        }
    }
}
