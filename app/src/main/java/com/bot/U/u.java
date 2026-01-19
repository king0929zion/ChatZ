package U;

import T.AbstractC0629s;
import T.C0594a;
import T.InterfaceC0598c;
import T.L0;
import T.M0;
import b0.C0879l;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u extends J {

    /* renamed from: c, reason: collision with root package name */
    public static final u f8591c = new J(1, 0, 2);

    @Override // U.J
    public final void a(L l3, InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        C0594a c0594a;
        int c6;
        int c7 = l3.c(0);
        if (m02.f7998n != 0) {
            AbstractC0629s.a("Cannot move a group while inserting");
        }
        if (c7 < 0) {
            AbstractC0629s.a("Parameter offset is out of bounds");
        }
        if (c7 == 0) {
            return;
        }
        int i6 = m02.f8004t;
        int i7 = m02.f8006v;
        int i8 = m02.f8005u;
        int i9 = i6;
        while (c7 > 0) {
            i9 += m02.f7986b[(m02.r(i9) * 5) + 3];
            if (i9 > i8) {
                AbstractC0629s.a("Parameter offset is out of bounds");
            }
            c7--;
        }
        int i10 = m02.f7986b[(m02.r(i9) * 5) + 3];
        int g3 = m02.g(m02.f7986b, m02.r(m02.f8004t));
        int g6 = m02.g(m02.f7986b, m02.r(i9));
        int i11 = i9 + i10;
        int g7 = m02.g(m02.f7986b, m02.r(i11));
        int i12 = g7 - g6;
        m02.x(i12, Math.max(m02.f8004t - 1, 0));
        m02.w(i10);
        int[] iArr = m02.f7986b;
        int r5 = m02.r(i11) * 5;
        Y3.k.h0(iArr, iArr, m02.r(i6) * 5, r5, (i10 * 5) + r5);
        if (i12 > 0) {
            Object[] objArr = m02.f7987c;
            int h3 = m02.h(g6 + i12);
            System.arraycopy(objArr, h3, objArr, g3, m02.h(g7 + i12) - h3);
        }
        int i13 = g6 + i12;
        int i14 = i13 - g3;
        int i15 = m02.f7995k;
        int i16 = m02.f7996l;
        int length = m02.f7987c.length;
        int i17 = m02.f7997m;
        int i18 = i6 + i10;
        int i19 = i6;
        while (i19 < i18) {
            int r6 = m02.r(i19);
            int i20 = i14;
            int[] iArr2 = iArr;
            iArr2[(r6 * 5) + 4] = M0.i(M0.i(m02.g(iArr, r6) - i20, i17 < r6 ? 0 : i15, i16, length), m02.f7995k, m02.f7996l, m02.f7987c.length);
            i19++;
            i14 = i20;
            iArr = iArr2;
            i15 = i15;
        }
        int i21 = i11 + i10;
        int p5 = m02.p();
        int b5 = L0.b(m02.f7988d, i11, p5);
        ArrayList arrayList = new ArrayList();
        if (b5 >= 0) {
            while (b5 < m02.f7988d.size() && (c6 = m02.c((c0594a = (C0594a) m02.f7988d.get(b5)))) >= i11 && c6 < i21) {
                arrayList.add(c0594a);
            }
        }
        int i22 = i6 - i11;
        int size = arrayList.size();
        for (int i23 = 0; i23 < size; i23++) {
            C0594a c0594a2 = (C0594a) arrayList.get(i23);
            int c8 = m02.c(c0594a2) + i22;
            if (c8 >= m02.f7991g) {
                c0594a2.a = -(p5 - c8);
            } else {
                c0594a2.a = c8;
            }
            m02.f7988d.add(L0.b(m02.f7988d, c8, p5), c0594a2);
        }
        if (m02.I(i11, i10)) {
            AbstractC0629s.a("Unexpectedly removed anchors");
        }
        m02.m(i7, m02.f8005u, i6);
        if (i12 > 0) {
            m02.J(i13, i12, i11 - 1);
        }
    }
}
