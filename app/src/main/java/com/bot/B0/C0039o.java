package B0;

import F0.InterfaceC0134w;
import k.C1173u;

/* renamed from: B0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0039o {
    public final V.e a = new V.e(new C0038n[16]);

    /* renamed from: b, reason: collision with root package name */
    public final k.I f469b = new k.I(10);

    public boolean a(C1173u c1173u, InterfaceC0134w interfaceC0134w, C0033i c0033i, boolean z5) {
        V.e eVar = this.a;
        Object[] objArr = eVar.f8759c;
        int i6 = eVar.f8761f;
        boolean z6 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            z6 = ((C0038n) objArr[i7]).a(c1173u, interfaceC0134w, c0033i, z5) || z6;
        }
        return z6;
    }

    public void b(C0033i c0033i) {
        V.e eVar = this.a;
        int i6 = eVar.f8761f;
        while (true) {
            i6--;
            if (-1 >= i6) {
                return;
            }
            if (((C0038n) eVar.f8759c[i6]).f462d.f648b == 0) {
                eVar.k(i6);
            }
        }
    }
}
