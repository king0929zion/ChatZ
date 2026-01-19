package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class N extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final N f3432c = new f0(O.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC1276k.f(jArr, "<this>");
        return jArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        M m3 = (M) obj;
        AbstractC1276k.f(m3, "builder");
        long g3 = aVar.g(this.f3465b, i6);
        m3.b(m3.d() + 1);
        long[] jArr = m3.a;
        int i7 = m3.f3431b;
        m3.f3431b = i7 + 1;
        jArr[i7] = g3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.M, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        AbstractC1276k.f(jArr, "<this>");
        Object obj2 = new Object();
        obj2.a = jArr;
        obj2.f3431b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new long[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        long[] jArr = (long[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(jArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.u(this.f3465b, i7, jArr[i7]);
        }
    }
}
