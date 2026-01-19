package F0;

import java.util.Map;

/* loaded from: classes.dex */
public final class K implements W {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W f1429b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Q f1430c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ W f1432e;

    public /* synthetic */ K(W w5, Q q3, int i6, W w6, int i7) {
        this.a = i7;
        this.f1430c = q3;
        this.f1431d = i6;
        this.f1432e = w6;
        this.f1429b = w5;
    }

    @Override // F0.W
    public final Map b() {
        switch (this.a) {
            case 0:
                return this.f1429b.b();
            default:
                return this.f1429b.b();
        }
    }

    @Override // F0.W
    public final void c() {
        int i6;
        switch (this.a) {
            case 0:
                int i7 = this.f1431d;
                Q q3 = this.f1430c;
                q3.f1446h = i7;
                this.f1432e.c();
                V.e eVar = q3.f1454p;
                k.M m3 = q3.f1453o;
                long[] jArr = m3.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j3 = jArr[i8];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8;
                            int i10 = 8 - ((~(i8 - length)) >>> 31);
                            int i11 = 0;
                            while (i11 < i10) {
                                if ((255 & j3) < 128) {
                                    int i12 = (i8 << 3) + i11;
                                    Object obj = m3.f12485b[i12];
                                    t0 t0Var = (t0) m3.f12486c[i12];
                                    int i13 = eVar.i(obj);
                                    i6 = i9;
                                    if (i13 < 0 || i13 >= q3.f1446h) {
                                        if (i13 >= 0) {
                                            Object[] objArr = eVar.f8759c;
                                            Object obj2 = objArr[i13];
                                            objArr[i13] = AbstractC0137z.f1543b;
                                        }
                                        if (q3.f1451m.b(obj)) {
                                            t0Var.dispose();
                                        }
                                        m3.l(i12);
                                    }
                                } else {
                                    i6 = i9;
                                }
                                j3 >>= i6;
                                i11++;
                                i9 = i6;
                            }
                            if (i10 != i9) {
                            }
                        }
                        if (i8 != length) {
                            i8++;
                        }
                    }
                }
                q3.g(q3.f1445g);
                return;
            default:
                int i14 = this.f1431d;
                Q q5 = this.f1430c;
                q5.f1445g = i14;
                this.f1432e.c();
                if (q5.f1442c.f1741l == null) {
                    q5.g(q5.f1445g);
                    return;
                }
                return;
        }
    }

    @Override // F0.W
    public final int d() {
        switch (this.a) {
            case 0:
                return this.f1429b.d();
            default:
                return this.f1429b.d();
        }
    }

    @Override // F0.W
    public final int e() {
        switch (this.a) {
            case 0:
                return this.f1429b.e();
            default:
                return this.f1429b.e();
        }
    }

    @Override // F0.W
    public final l4.c f() {
        switch (this.a) {
            case 0:
                return this.f1429b.f();
            default:
                return this.f1429b.f();
        }
    }
}
