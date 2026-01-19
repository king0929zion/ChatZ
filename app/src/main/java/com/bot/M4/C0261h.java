package M4;

import m4.AbstractC1276k;

/* renamed from: M4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261h extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C0261h f3468c = new f0(C0262i.a);

    @Override // M4.AbstractC0251a
    public final int d(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC1276k.f(bArr, "<this>");
        return bArr.length;
    }

    @Override // M4.AbstractC0270q, M4.AbstractC0251a
    public final void f(L4.a aVar, int i6, Object obj) {
        C0260g c0260g = (C0260g) obj;
        AbstractC1276k.f(c0260g, "builder");
        byte j3 = aVar.j(this.f3465b, i6);
        c0260g.b(c0260g.d() + 1);
        byte[] bArr = c0260g.a;
        int i7 = c0260g.f3466b;
        c0260g.f3466b = i7 + 1;
        bArr[i7] = j3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [M4.g, java.lang.Object] */
    @Override // M4.AbstractC0251a
    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        AbstractC1276k.f(bArr, "<this>");
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.f3466b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // M4.f0
    public final Object j() {
        return new byte[0];
    }

    @Override // M4.f0
    public final void k(O4.w wVar, Object obj, int i6) {
        byte[] bArr = (byte[]) obj;
        AbstractC1276k.f(wVar, "encoder");
        AbstractC1276k.f(bArr, "content");
        for (int i7 = 0; i7 < i6; i7++) {
            byte b5 = bArr[i7];
            e0 e0Var = this.f3465b;
            AbstractC1276k.f(e0Var, "descriptor");
            wVar.r(e0Var, i7);
            wVar.f(b5);
        }
    }
}
