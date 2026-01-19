package H0;

import m4.AbstractC1277l;
import v.AbstractC1787b;

/* renamed from: H0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144d extends AbstractC1277l implements l4.c {

    /* renamed from: f, reason: collision with root package name */
    public static final C0144d f1889f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0144d f1890g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0144d f1891h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0144d f1892i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0144d f1893j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0144d f1894k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0144d f1895l;

    /* renamed from: m, reason: collision with root package name */
    public static final C0144d f1896m;

    /* renamed from: n, reason: collision with root package name */
    public static final C0144d f1897n;

    /* renamed from: o, reason: collision with root package name */
    public static final C0144d f1898o;

    /* renamed from: p, reason: collision with root package name */
    public static final C0144d f1899p;

    /* renamed from: q, reason: collision with root package name */
    public static final C0144d f1900q;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1901e;

    static {
        int i6 = 1;
        f1889f = new C0144d(i6, 0);
        f1890g = new C0144d(i6, 1);
        f1891h = new C0144d(i6, 2);
        f1892i = new C0144d(i6, 3);
        f1893j = new C0144d(i6, 4);
        f1894k = new C0144d(i6, 5);
        f1895l = new C0144d(i6, 6);
        f1896m = new C0144d(i6, 7);
        f1897n = new C0144d(i6, 8);
        f1898o = new C0144d(i6, 9);
        f1899p = new C0144d(i6, 10);
        f1900q = new C0144d(i6, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0144d(int i6, int i7) {
        super(i6);
        this.f1901e = i7;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        switch (this.f1901e) {
            case 0:
                InterfaceC0152h interfaceC0152h = (InterfaceC0152h) obj;
                J j3 = interfaceC0152h instanceof J ? (J) interfaceC0152h : null;
                if (j3 == null || !j3.f1732U) {
                    return X3.y.a;
                }
                throw new IllegalStateException("Apply is called on deactivated node " + interfaceC0152h);
            case 1:
                v0 v0Var = (v0) obj;
                if (v0Var.u()) {
                    S s5 = v0Var.f2003e;
                    if (!s5.f1801n) {
                        l4.c f6 = v0Var.f2002c.f();
                        k.M m3 = s5.f1804q;
                        if (f6 != null) {
                            s5.y0(v0Var, 9223372034707292159L, 0L);
                            s5.f1797j = f6;
                        } else if (m3 != null) {
                            Object[] objArr = m3.f12486c;
                            long[] jArr = m3.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j4 = jArr[i6];
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((255 & j4) < 128) {
                                                s5.J0((k.N) objArr[(i6 << 3) + i8]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i7 != 8) {
                                        }
                                    }
                                    if (i6 != length) {
                                        i6++;
                                    }
                                }
                            }
                            m3.a();
                        }
                    }
                }
                return X3.y.a;
            case 2:
                q0 q0Var = ((i0) obj).f1952O;
                if (q0Var != null) {
                    q0Var.invalidate();
                }
                return X3.y.a;
            case 3:
                i0 i0Var = (i0) obj;
                J j5 = i0Var.f1954r;
                try {
                    if (i0Var.u()) {
                        i0Var.v1(true);
                    }
                    return X3.y.a;
                } catch (Throwable th) {
                    j5.a0(th);
                    throw null;
                }
            case 4:
                n0 n0Var = (n0) obj;
                if (n0Var.u()) {
                    n0Var.f1978c.i0();
                }
                return X3.y.a;
            case AbstractC1787b.f15290g /* 5 */:
                J j6 = (J) obj;
                if (j6.H()) {
                    j6.W(false);
                }
                return X3.y.a;
            case 6:
                J j7 = (J) obj;
                if (j7.H()) {
                    j7.W(false);
                }
                return X3.y.a;
            case 7:
                J j8 = (J) obj;
                if (j8.H()) {
                    j8.U(false);
                }
                return X3.y.a;
            case 8:
                J j9 = (J) obj;
                if (j9.H()) {
                    j9.U(false);
                }
                return X3.y.a;
            case AbstractC1787b.f15287d /* 9 */:
                J j10 = (J) obj;
                if (j10.H()) {
                    J.V(j10, false, 7);
                }
                return X3.y.a;
            case AbstractC1787b.f15289f /* 10 */:
                J j11 = (J) obj;
                if (j11.H()) {
                    J.X(j11, false, 7);
                }
                return X3.y.a;
            default:
                J j12 = (J) obj;
                if (j12.H()) {
                    j12.F();
                }
                return X3.y.a;
        }
    }
}
