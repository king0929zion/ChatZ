package U;

import T.C0594a;
import T.InterfaceC0598c;
import T.M0;
import b0.C0879l;
import com.vladsch.flexmark.parser.PegdownExtensions;

/* loaded from: classes.dex */
public final class M extends s4.j {

    /* renamed from: d, reason: collision with root package name */
    public int f8551d;

    /* renamed from: f, reason: collision with root package name */
    public int f8553f;

    /* renamed from: h, reason: collision with root package name */
    public int f8555h;

    /* renamed from: c, reason: collision with root package name */
    public J[] f8550c = new J[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f8552e = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public Object[] f8554g = new Object[16];

    public final void S() {
        this.f8551d = 0;
        this.f8553f = 0;
        Y3.k.o0(null, this.f8554g, 0, this.f8555h);
        this.f8555h = 0;
    }

    public final void T(InterfaceC0598c interfaceC0598c, M0 m02, C0879l c0879l, K k3) {
        if (V()) {
            L l3 = new L(this);
            M m3 = (M) l3.f8549e;
            while (true) {
                J j3 = m3.f8550c[l3.f8546b];
                C0594a b5 = j3.b(l3);
                InterfaceC0598c interfaceC0598c2 = interfaceC0598c;
                M0 m03 = m02;
                C0879l c0879l2 = c0879l;
                K k5 = k3;
                try {
                    j3.a(l3, interfaceC0598c2, m03, c0879l2, k5);
                    int i6 = l3.f8546b;
                    int i7 = m3.f8551d;
                    if (i6 < i7) {
                        J j4 = m3.f8550c[i6];
                        l3.f8547c += j4.a;
                        l3.f8548d += j4.f8545b;
                        int i8 = i6 + 1;
                        l3.f8546b = i8;
                        if (i8 >= i7) {
                            break;
                        }
                        interfaceC0598c = interfaceC0598c2;
                        m02 = m03;
                        c0879l = c0879l2;
                        k3 = k5;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        S();
    }

    public final boolean U() {
        return this.f8551d == 0;
    }

    public final boolean V() {
        return this.f8551d != 0;
    }

    public final void W(J j3) {
        int i6 = this.f8551d;
        J[] jArr = this.f8550c;
        int length = jArr.length;
        int i7 = PegdownExtensions.ANCHORLINKS;
        if (i6 == length) {
            J[] jArr2 = new J[(i6 > 1024 ? 1024 : i6) + i6];
            System.arraycopy(jArr, 0, jArr2, 0, i6);
            this.f8550c = jArr2;
        }
        int i8 = this.f8553f;
        int i9 = j3.a;
        int i10 = j3.f8545b;
        int i11 = i8 + i9;
        int[] iArr = this.f8552e;
        int length2 = iArr.length;
        if (i11 > length2) {
            int i12 = (length2 > 1024 ? 1024 : length2) + length2;
            if (i12 >= i11) {
                i11 = i12;
            }
            int[] iArr2 = new int[i11];
            Y3.k.h0(iArr, iArr2, 0, 0, length2);
            this.f8552e = iArr2;
        }
        int i13 = this.f8555h + i10;
        Object[] objArr = this.f8554g;
        int length3 = objArr.length;
        if (i13 > length3) {
            if (length3 <= 1024) {
                i7 = length3;
            }
            int i14 = i7 + length3;
            if (i14 >= i13) {
                i13 = i14;
            }
            Object[] objArr2 = new Object[i13];
            System.arraycopy(objArr, 0, objArr2, 0, length3);
            this.f8554g = objArr2;
        }
        J[] jArr3 = this.f8550c;
        int i15 = this.f8551d;
        this.f8551d = i15 + 1;
        jArr3[i15] = j3;
        this.f8553f += j3.a;
        this.f8555h += i10;
    }
}
