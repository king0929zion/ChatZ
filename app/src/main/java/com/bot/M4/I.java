package M4;

import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class I extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final I f3429c = new f0(J.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC1276k.f(iArr, "<this>");
        return iArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        H h3 = (H) obj;
        AbstractC1276k.f(h3, "builder");
        int l3 = aVar.l(this.f3465b, i6);
        h3.b(h3.d() + 1);
        int[] iArr = h3.a;
        int i7 = h3.f3428b;
        h3.f3428b = i7 + 1;
        iArr[i7] = l3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.H, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        AbstractC1276k.f(iArr, "<this>");
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.f3428b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new int[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        int[] iArr = (int[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(iArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            wVar.t(i7, iArr[i7], this.f3465b);
        }
    }
}
