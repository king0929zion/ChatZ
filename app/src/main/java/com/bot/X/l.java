package x;

import F0.W;
import e1.InterfaceC0961c;
import java.util.List;
import java.util.Map;
import r.X0;
import x4.InterfaceC1942y;
import y.C1948E;
import y.C1952I;

/* loaded from: classes.dex */
public final class l implements W {
    public final m a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15492b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15493c;

    /* renamed from: d, reason: collision with root package name */
    public final float f15494d;

    /* renamed from: e, reason: collision with root package name */
    public final W f15495e;

    /* renamed from: f, reason: collision with root package name */
    public final float f15496f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15497g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1942y f15498h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0961c f15499i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15500j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f15501k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15502l;

    /* renamed from: m, reason: collision with root package name */
    public final int f15503m;

    /* renamed from: n, reason: collision with root package name */
    public final int f15504n;

    /* renamed from: o, reason: collision with root package name */
    public final X0 f15505o;

    /* renamed from: p, reason: collision with root package name */
    public final int f15506p;

    /* renamed from: q, reason: collision with root package name */
    public final int f15507q;

    public l(m mVar, int i6, boolean z5, float f6, W w5, float f7, boolean z6, InterfaceC1942y interfaceC1942y, InterfaceC0961c interfaceC0961c, long j3, List list, int i7, int i8, int i9, X0 x02, int i10, int i11) {
        this.a = mVar;
        this.f15492b = i6;
        this.f15493c = z5;
        this.f15494d = f6;
        this.f15495e = w5;
        this.f15496f = f7;
        this.f15497g = z6;
        this.f15498h = interfaceC1942y;
        this.f15499i = interfaceC0961c;
        this.f15500j = j3;
        this.f15501k = list;
        this.f15502l = i7;
        this.f15503m = i8;
        this.f15504n = i9;
        this.f15505o = x02;
        this.f15506p = i10;
        this.f15507q = i11;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public final l a(int i6, boolean z5) {
        m mVar;
        int i7;
        int i8;
        int i9;
        if (this.f15497g) {
            return null;
        }
        ?? r22 = this.f15501k;
        if (r22.isEmpty() || (mVar = this.a) == null) {
            return null;
        }
        int i10 = mVar.f15523q;
        int i11 = this.f15492b - i6;
        if (i11 < 0 || i11 >= i10) {
            return null;
        }
        m mVar2 = (m) Y3.m.o0(r22);
        m mVar3 = (m) Y3.m.w0(r22);
        if (mVar2.f15525s || mVar3.f15525s) {
            return null;
        }
        int i12 = this.f15503m;
        int i13 = this.f15502l;
        if (i6 < 0) {
            if (Math.min((mVar2.f15521o + mVar2.f15523q) - i13, (mVar3.f15521o + mVar3.f15523q) - i12) <= (-i6)) {
                return null;
            }
        } else if (Math.min(i13 - mVar2.f15521o, i12 - mVar3.f15521o) <= i6) {
            return null;
        }
        int size = r22.size();
        int i14 = 0;
        while (i14 < size) {
            m mVar4 = (m) r22.get(i14);
            boolean z6 = mVar4.f15509c;
            int[] iArr = mVar4.f15529w;
            if (!mVar4.f15525s) {
                mVar4.f15521o += i6;
                int length = iArr.length;
                for (int i15 = 0; i15 < length; i15++) {
                    int i16 = i15 & 1;
                    if ((z6 && i16 != 0) || (!z6 && i16 == 0)) {
                        iArr[i15] = iArr[i15] + i6;
                    }
                }
                if (z5) {
                    int size2 = mVar4.f15508b.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        C1952I c1952i = (C1952I) mVar4.f15519m.a.g(mVar4.f15517k);
                        C1948E c1948e = c1952i != null ? c1952i.a[i17] : null;
                        if (c1948e != null) {
                            long j3 = c1948e.f15767l;
                            if (z6) {
                                i7 = size;
                                i8 = (int) (j3 >> 32);
                                i9 = ((int) (j3 & 4294967295L)) + i6;
                            } else {
                                i7 = size;
                                i8 = ((int) (j3 >> 32)) + i6;
                                i9 = (int) (j3 & 4294967295L);
                            }
                            c1948e.f15767l = (i9 & 4294967295L) | (i8 << 32);
                        } else {
                            i7 = size;
                        }
                        i17++;
                        size = i7;
                    }
                }
            }
            i14++;
            size = size;
        }
        return new l(this.a, i11, this.f15493c || i6 > 0, i6, this.f15495e, this.f15496f, this.f15497g, this.f15498h, this.f15499i, this.f15500j, r22, this.f15502l, this.f15503m, this.f15504n, this.f15505o, this.f15506p, this.f15507q);
    }

    @Override // F0.W
    public final Map b() {
        return this.f15495e.b();
    }

    @Override // F0.W
    public final void c() {
        this.f15495e.c();
    }

    @Override // F0.W
    public final int d() {
        return this.f15495e.d();
    }

    @Override // F0.W
    public final int e() {
        return this.f15495e.e();
    }

    @Override // F0.W
    public final l4.c f() {
        return this.f15495e.f();
    }

    public final long g() {
        W w5 = this.f15495e;
        return (w5.e() << 32) | (w5.d() & 4294967295L);
    }
}
