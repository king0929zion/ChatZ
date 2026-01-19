package Q;

import R.C0498c;
import R.C0499d;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.InterfaceC0961c;
import h0.AbstractC1024a;
import h0.C1026c;
import h0.C1031h;
import h0.C1032i;
import i1.InterfaceC1078B;
import java.util.List;

/* renamed from: Q.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0455q0 implements InterfaceC1078B {

    /* renamed from: c, reason: collision with root package name */
    public final int f6041c;

    /* renamed from: e, reason: collision with root package name */
    public final T.X f6042e;

    /* renamed from: f, reason: collision with root package name */
    public final C0415g0 f6043f;

    /* renamed from: g, reason: collision with root package name */
    public final C0498c f6044g;

    /* renamed from: h, reason: collision with root package name */
    public final C0498c f6045h;

    /* renamed from: i, reason: collision with root package name */
    public final R.n0 f6046i;

    /* renamed from: j, reason: collision with root package name */
    public final R.n0 f6047j;

    /* renamed from: k, reason: collision with root package name */
    public final C0499d f6048k;

    /* renamed from: l, reason: collision with root package name */
    public final C0499d f6049l;

    /* renamed from: m, reason: collision with root package name */
    public final R.o0 f6050m;

    /* renamed from: n, reason: collision with root package name */
    public final R.o0 f6051n;

    public C0455q0(InterfaceC0961c interfaceC0961c, int i6, T.X x5, C0415g0 c0415g0) {
        int l02 = interfaceC0961c.l0(K0.a);
        this.f6041c = i6;
        this.f6042e = x5;
        this.f6043f = c0415g0;
        C1031h c1031h = C1026c.f11798p;
        this.f6044g = new C0498c(c1031h, c1031h);
        C1031h c1031h2 = C1026c.f11800r;
        this.f6045h = new C0498c(c1031h2, c1031h2);
        this.f6046i = new R.n0(AbstractC1024a.f11784c);
        this.f6047j = new R.n0(AbstractC1024a.f11785d);
        C1032i c1032i = C1026c.f11795m;
        C1032i c1032i2 = C1026c.f11797o;
        this.f6048k = new C0499d(c1032i, c1032i2);
        this.f6049l = new C0499d(c1032i2, c1032i);
        this.f6050m = new R.o0(c1032i, l02);
        this.f6051n = new R.o0(c1032i2, l02);
    }

    @Override // i1.InterfaceC1078B
    public final long g(e1.k kVar, long j3, e1.m mVar, long j4) {
        e1.k kVar2;
        char c6;
        long j5;
        int i6;
        T.X x5 = this.f6042e;
        if (x5 != null) {
            x5.getValue();
        }
        char c7 = SequenceUtils.SPC;
        long j6 = 4294967295L;
        long j7 = (((int) (j3 >> 32)) << 32) | ((((int) (j3 & 4294967295L)) + this.f6041c) & 4294967295L);
        int i7 = (int) (j7 >> 32);
        int i8 = 0;
        List I5 = Y4.l.I(this.f6044g, this.f6045h, ((int) (kVar.a() >> 32)) < i7 / 2 ? this.f6046i : this.f6047j);
        int size = I5.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                kVar2 = kVar;
                c6 = c7;
                j5 = j6;
                i6 = 0;
                break;
            }
            c6 = c7;
            j5 = j6;
            int i10 = (int) (j4 >> c6);
            int i11 = size;
            int i12 = i9;
            kVar2 = kVar;
            List list = I5;
            i6 = ((R.X) I5.get(i9)).a(kVar2, j7, i10, mVar);
            if (i12 == Y4.l.C(list) || (i6 >= 0 && i10 + i6 <= i7)) {
                break;
            }
            i9 = i12 + 1;
            I5 = list;
            size = i11;
            c7 = c6;
            j6 = j5;
        }
        int i13 = (int) (j7 & j5);
        List I6 = Y4.l.I(this.f6048k, this.f6049l, ((int) (kVar2.a() & j5)) < i13 / 2 ? this.f6050m : this.f6051n);
        int size2 = I6.size();
        for (int i14 = 0; i14 < size2; i14++) {
            int i15 = (int) (j4 & j5);
            int a = ((R.Y) I6.get(i14)).a(kVar2, j7, i15);
            if (i14 == Y4.l.C(I6) || (a >= 0 && i15 + a <= i13)) {
                i8 = a;
                break;
            }
        }
        long j8 = (i6 << c6) | (i8 & j5);
        this.f6043f.m(kVar2, h5.e.E(j8, j4));
        return j8;
    }
}
