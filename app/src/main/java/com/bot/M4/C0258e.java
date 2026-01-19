package M4;

import m4.AbstractC1276k;

/* renamed from: M4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0258e extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0258e f3462c = new f0(C0259f.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC1276k.f(zArr, "<this>");
        return zArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        C0257d c0257d = (C0257d) obj;
        AbstractC1276k.f(c0257d, "builder");
        boolean o5 = aVar.o(this.f3465b, i6);
        c0257d.b(c0257d.d() + 1);
        boolean[] zArr = c0257d.a;
        int i7 = c0257d.f3461b;
        c0257d.f3461b = i7 + 1;
        zArr[i7] = o5;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, M4.d] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC1276k.f(zArr, "<this>");
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.f3461b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new boolean[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        boolean[] zArr = (boolean[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(zArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.q(this.f3465b, i7, zArr[i7]);
        }
    }
}
