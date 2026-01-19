package Q0;

import H0.AbstractC0157l;
import H0.C0149f0;
import H0.J;
import H0.M;
import H0.i0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import Y3.C;
import Z2.X;
import k.C1147A;
import y.C1964d;

/* loaded from: classes.dex */
public final class d {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final C1964d f6330b;

    /* renamed from: c, reason: collision with root package name */
    public final X f6331c;

    /* renamed from: d, reason: collision with root package name */
    public d f6332d;

    /* renamed from: e, reason: collision with root package name */
    public long f6333e;

    /* renamed from: f, reason: collision with root package name */
    public long f6334f;

    /* renamed from: g, reason: collision with root package name */
    public long f6335g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f6336h;

    public d(e eVar, int i6, C1964d c1964d, X x5) {
        this.f6336h = eVar;
        this.a = i6;
        this.f6330b = c1964d;
        this.f6331c = x5;
    }

    public final void a(long j3, long j4, long j5, long j6, float[] fArr) {
        c cVar;
        c cVar2;
        long j7 = this.f6336h.f6341f;
        C1964d c1964d = this.f6330b;
        i0 t5 = AbstractC0157l.t(c1964d, 2);
        J v5 = AbstractC0157l.v(c1964d);
        boolean I5 = v5.I();
        C0149f0 c0149f0 = v5.f1721J;
        if (I5) {
            if (c0149f0.f1917d != t5) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j3 >> 32)) << 32);
                long j8 = t5.f1487f;
                i0 i0Var = c0149f0.f1917d;
                i0Var.getClass();
                cVar = new c(C.Q(i0Var.l(t5, floatToRawIntBits)), (4294967295L & (((int) (r2 & 4294967295L)) + ((int) (j8 & 4294967295L)))) | ((((int) (r2 >> 32)) + ((int) (j8 >> 32))) << 32), j5, j6, j7, fArr, c1964d);
            } else {
                cVar = new c(j3, j4, j5, j6, j7, fArr, c1964d);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f6331c.f(cVar2);
    }

    public final void b() {
        e eVar = this.f6336h;
        C1147A c1147a = eVar.a;
        int i6 = this.a;
        d dVar = (d) c1147a.g(i6);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.f6332d;
                this.f6332d = null;
                if (dVar2 == null) {
                    J v5 = AbstractC0157l.v(this.f6330b.f11806c);
                    if (v5.f1740k) {
                        ((ViewTreeObserverOnGlobalLayoutListenerC0216x) M.a(v5)).getRectManager().a.g(v5.f1734e, false);
                        return;
                    }
                    return;
                }
                int d6 = c1147a.d(i6);
                Object[] objArr = c1147a.f12559c;
                Object obj = objArr[d6];
                c1147a.f12558b[d6] = i6;
                objArr[d6] = dVar2;
                return;
            }
            int d7 = c1147a.d(i6);
            Object[] objArr2 = c1147a.f12559c;
            Object obj2 = objArr2[d7];
            c1147a.f12558b[d7] = i6;
            objArr2[d7] = dVar;
            while (true) {
                d dVar3 = dVar.f6332d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f6332d = this.f6332d;
                    this.f6332d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.f6337b;
        if (dVar4 == this) {
            eVar.f6337b = dVar4.f6332d;
            this.f6332d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f6332d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f6332d = dVar4.f6332d;
                }
                this.f6332d = null;
                return;
            }
            dVar5 = dVar4.f6332d;
        }
    }
}
