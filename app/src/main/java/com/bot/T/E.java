package T;

import D.C0079l0;
import H0.C0158m;
import b0.C0875h;
import f0.AbstractC0973C;
import f0.AbstractC0974D;
import f0.AbstractC0983f;
import f0.AbstractC0992o;
import f0.AbstractC0997t;
import f0.InterfaceC0972B;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class E extends AbstractC0973C implements d1 {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC1193a f7944e;

    /* renamed from: f, reason: collision with root package name */
    public final R0 f7945f;

    /* renamed from: g, reason: collision with root package name */
    public D f7946g = new D(AbstractC0992o.j().g());

    public E(R0 r02, InterfaceC1193a interfaceC1193a) {
        this.f7944e = interfaceC1193a;
        this.f7945f = r02;
    }

    @Override // f0.InterfaceC0972B
    public final AbstractC0974D a() {
        return this.f7946g;
    }

    @Override // f0.InterfaceC0972B
    public final void d(AbstractC0974D abstractC0974D) {
        AbstractC1276k.d(abstractC0974D, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.f7946g = (D) abstractC0974D;
    }

    public final D g(D d6, AbstractC0983f abstractC0983f, boolean z5, InterfaceC1193a interfaceC1193a) {
        V.e q3;
        D d7;
        R0 r02;
        int i6;
        if (d6.c(this, abstractC0983f)) {
            if (z5) {
                q3 = r.q();
                Object[] objArr = q3.f8759c;
                int i7 = q3.f8761f;
                for (int i8 = 0; i8 < i7; i8++) {
                    ((C0624p) objArr[i8]).b();
                }
                try {
                    k.H h3 = d6.f7939e;
                    C0158m c0158m = S0.a;
                    C0875h c0875h = (C0875h) c0158m.e();
                    if (c0875h == null) {
                        c0875h = new C0875h();
                        c0158m.o(c0875h);
                    }
                    int i9 = c0875h.a;
                    Object[] objArr2 = h3.f12461b;
                    int[] iArr = h3.f12462c;
                    long[] jArr = h3.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j3 = jArr[i10];
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8;
                                int i12 = 8 - ((~(i10 - length)) >>> 31);
                                int i13 = 0;
                                while (i13 < i12) {
                                    if ((j3 & 255) < 128) {
                                        int i14 = (i10 << 3) + i13;
                                        i6 = i11;
                                        InterfaceC0972B interfaceC0972B = (InterfaceC0972B) objArr2[i14];
                                        c0875h.a = i9 + iArr[i14];
                                        l4.c e6 = abstractC0983f.e();
                                        if (e6 != null) {
                                            e6.f(interfaceC0972B);
                                        }
                                    } else {
                                        i6 = i11;
                                    }
                                    j3 >>= i6;
                                    i13++;
                                    i11 = i6;
                                }
                                if (i12 != i11) {
                                    break;
                                }
                            }
                            if (i10 == length) {
                                break;
                            }
                            i10++;
                        }
                    }
                    c0875h.a = i9;
                    Object[] objArr3 = q3.f8759c;
                    int i15 = q3.f8761f;
                    for (int i16 = 0; i16 < i15; i16++) {
                        ((C0624p) objArr3[i16]).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d6;
        }
        k.H h6 = new k.H();
        C0158m c0158m2 = S0.a;
        C0875h c0875h2 = (C0875h) c0158m2.e();
        if (c0875h2 == null) {
            c0875h2 = new C0875h();
            c0158m2.o(c0875h2);
        }
        int i17 = c0875h2.a;
        q3 = r.q();
        Object[] objArr4 = q3.f8759c;
        int i18 = q3.f8761f;
        for (int i19 = 0; i19 < i18; i19++) {
            ((C0624p) objArr4[i19]).b();
        }
        try {
            c0875h2.a = i17 + 1;
            Object j4 = AbstractC0997t.j(new C0079l0(this, c0875h2, h6, i17, 2), interfaceC1193a);
            c0875h2.a = i17;
            Object[] objArr5 = q3.f8759c;
            int i20 = q3.f8761f;
            for (int i21 = 0; i21 < i20; i21++) {
                ((C0624p) objArr5[i21]).a();
            }
            Object obj = AbstractC0992o.f11707c;
            synchronized (obj) {
                try {
                    AbstractC0983f j5 = AbstractC0992o.j();
                    Object obj2 = d6.f7940f;
                    if (obj2 == D.f7936h || (r02 = this.f7945f) == null || !r02.a(j4, obj2)) {
                        D d8 = this.f7946g;
                        synchronized (obj) {
                            AbstractC0974D m3 = AbstractC0992o.m(d8, this);
                            m3.a(d8);
                            m3.a = j5.g();
                            d7 = (D) m3;
                            d7.f7939e = h6;
                            d7.f7941g = d7.d(this, j5);
                            d7.f7940f = j4;
                        }
                        return d7;
                    }
                    d6.f7939e = h6;
                    d6.f7941g = d6.d(this, j5);
                    d7 = d6;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            C0875h c0875h3 = (C0875h) S0.a.e();
            if (c0875h3 == null || c0875h3.a != 0) {
                return d7;
            }
            AbstractC0992o.j().m();
            synchronized (obj) {
                AbstractC0983f j6 = AbstractC0992o.j();
                d7.f7937c = j6.g();
                d7.f7938d = j6.h();
                return d7;
            }
        } finally {
            Object[] objArr6 = q3.f8759c;
            int i22 = q3.f8761f;
            for (int i23 = 0; i23 < i22; i23++) {
                ((C0624p) objArr6[i23]).a();
            }
        }
    }

    @Override // T.d1
    public final Object getValue() {
        l4.c e6 = AbstractC0992o.j().e();
        if (e6 != null) {
            e6.f(this);
        }
        AbstractC0983f j3 = AbstractC0992o.j();
        return g((D) AbstractC0992o.i(this.f7946g, j3), j3, true, this.f7944e).f7940f;
    }

    public final D h() {
        AbstractC0983f j3 = AbstractC0992o.j();
        return g((D) AbstractC0992o.i(this.f7946g, j3), j3, false, this.f7944e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedState(value=");
        D d6 = (D) AbstractC0992o.h(this.f7946g);
        sb.append(d6.c(this, AbstractC0992o.j()) ? String.valueOf(d6.f7940f) : "<Not calculated>");
        sb.append(")@");
        sb.append(hashCode());
        return sb.toString();
    }
}
