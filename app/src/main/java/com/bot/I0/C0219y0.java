package I0;

import android.view.ViewParent;
import com.vladsch.flexmark.util.format.TableCell;
import e1.InterfaceC0961c;
import i4.AbstractC1120d;
import l4.InterfaceC1193a;
import n0.C1353b;
import o0.C1382D;
import o4.AbstractC1410a;
import q0.C1496b;

/* renamed from: I0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219y0 implements H0.q0 {

    /* renamed from: c, reason: collision with root package name */
    public r0.b f2491c;

    /* renamed from: e, reason: collision with root package name */
    public final o0.w f2492e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f2493f;

    /* renamed from: g, reason: collision with root package name */
    public l4.e f2494g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC1193a f2495h;

    /* renamed from: i, reason: collision with root package name */
    public long f2496i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2497j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f2498k;

    /* renamed from: l, reason: collision with root package name */
    public float[] f2499l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2500m;

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC0961c f2501n;

    /* renamed from: o, reason: collision with root package name */
    public e1.m f2502o;

    /* renamed from: p, reason: collision with root package name */
    public final C1496b f2503p;

    /* renamed from: q, reason: collision with root package name */
    public int f2504q;

    /* renamed from: r, reason: collision with root package name */
    public long f2505r;

    /* renamed from: s, reason: collision with root package name */
    public o0.y f2506s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2507t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2508u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2509v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2510w;

    /* renamed from: x, reason: collision with root package name */
    public final B0.G f2511x;

    public C0219y0(r0.b bVar, o0.w wVar, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, l4.e eVar, InterfaceC1193a interfaceC1193a) {
        this.f2491c = bVar;
        this.f2492e = wVar;
        this.f2493f = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f2494g = eVar;
        this.f2495h = interfaceC1193a;
        long j3 = TableCell.NOT_TRACKED;
        this.f2496i = (j3 & 4294967295L) | (j3 << 32);
        this.f2498k = C1382D.a();
        this.f2501n = Y4.d.c();
        this.f2502o = e1.m.f11576c;
        this.f2503p = new C1496b();
        this.f2505r = o0.O.f13454b;
        this.f2509v = true;
        this.f2511x = new B0.G(this, 10);
    }

    public final float[] a() {
        float[] fArr = this.f2499l;
        if (fArr == null) {
            fArr = C1382D.a();
            this.f2499l = fArr;
        }
        if (this.f2508u) {
            this.f2508u = false;
            float[] b5 = b();
            if (this.f2509v) {
                return b5;
            }
            if (!K.l(b5, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z5 = this.f2507t;
        float[] fArr = this.f2498k;
        if (z5) {
            r0.b bVar = this.f2491c;
            long j3 = bVar.f14554v;
            r0.d dVar = bVar.a;
            if ((9223372034707292159L & j3) == 9205357640488583168L) {
                j3 = AbstractC1120d.p(AbstractC1410a.S(this.f2496i));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            float C5 = dVar.C();
            float v5 = dVar.v();
            float E5 = dVar.E();
            float o5 = dVar.o();
            float q3 = dVar.q();
            float b5 = dVar.b();
            float N5 = dVar.N();
            double d6 = E5 * 0.017453292519943295d;
            float sin = (float) Math.sin(d6);
            float cos = (float) Math.cos(d6);
            float f6 = -sin;
            float f7 = (v5 * cos) - (S.l.f7374V * sin);
            float f8 = (S.l.f7374V * cos) + (v5 * sin);
            double d7 = o5 * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d7);
            float cos2 = (float) Math.cos(d7);
            float f9 = -sin2;
            float f10 = sin * sin2;
            float f11 = sin * cos2;
            float f12 = cos * sin2;
            float f13 = cos * cos2;
            float f14 = (f8 * sin2) + (C5 * cos2);
            float f15 = (f8 * cos2) + ((-C5) * sin2);
            double d8 = q3 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d8);
            float cos3 = (float) Math.cos(d8);
            float f16 = -sin3;
            float f17 = (cos3 * f10) + (f16 * cos2);
            float f18 = ((f10 * sin3) + (cos2 * cos3)) * b5;
            float f19 = sin3 * cos * b5;
            float f20 = ((sin3 * f11) + (cos3 * f9)) * b5;
            float f21 = f17 * N5;
            float f22 = cos * cos3 * N5;
            float f23 = ((cos3 * f11) + (f16 * f9)) * N5;
            float f24 = f12 * 1.0f;
            float f25 = f6 * 1.0f;
            float f26 = f13 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f18;
                fArr[1] = f19;
                fArr[2] = f20;
                fArr[3] = 0.0f;
                fArr[4] = f21;
                fArr[5] = f22;
                fArr[6] = f23;
                fArr[7] = 0.0f;
                fArr[8] = f24;
                fArr[9] = f25;
                fArr[10] = f26;
                fArr[11] = 0.0f;
                float f27 = -intBitsToFloat;
                fArr[12] = ((f18 * f27) - (intBitsToFloat2 * f21)) + f14 + intBitsToFloat;
                fArr[13] = ((f19 * f27) - (intBitsToFloat2 * f22)) + f7 + intBitsToFloat2;
                fArr[14] = ((f27 * f20) - (intBitsToFloat2 * f23)) + f15;
                fArr[15] = 1.0f;
            }
            this.f2507t = false;
            this.f2509v = o0.y.r(fArr);
        }
        return fArr;
    }

    public final long c(long j3, boolean z5) {
        float[] b5;
        if (z5) {
            b5 = a();
            if (b5 == null) {
                return 9187343241974906880L;
            }
        } else {
            b5 = b();
        }
        return this.f2509v ? j3 : C1382D.b(j3, b5);
    }

    public final void d(long j3) {
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2493f;
        if (viewTreeObserverOnGlobalLayoutListenerC0216x.f2465o) {
            viewTreeObserverOnGlobalLayoutListenerC0216x.P(-4.0f);
        }
        r0.b bVar = this.f2491c;
        if (!e1.j.c(bVar.f14552t, j3)) {
            bVar.f14552t = j3;
            bVar.a.n((int) (j3 >> 32), (int) (j3 & 4294967295L), bVar.f14553u);
        }
        ViewParent parent = viewTreeObserverOnGlobalLayoutListenerC0216x.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(viewTreeObserverOnGlobalLayoutListenerC0216x, viewTreeObserverOnGlobalLayoutListenerC0216x);
        }
    }

    public final void e(long j3) {
        if (e1.l.b(j3, this.f2496i)) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2493f;
        if (viewTreeObserverOnGlobalLayoutListenerC0216x.f2465o) {
            viewTreeObserverOnGlobalLayoutListenerC0216x.P(-4.0f);
        }
        this.f2496i = j3;
        if (this.f2500m || this.f2497j) {
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC0216x.invalidate();
        if (true != this.f2500m) {
            this.f2500m = true;
            viewTreeObserverOnGlobalLayoutListenerC0216x.z(this, true);
        }
    }

    public final void f() {
        if (this.f2500m) {
            if (!o0.O.a(this.f2505r, o0.O.f13454b) && !e1.l.b(this.f2491c.f14553u, this.f2496i)) {
                r0.b bVar = this.f2491c;
                float b5 = o0.O.b(this.f2505r) * ((int) (this.f2496i >> 32));
                float c6 = o0.O.c(this.f2505r) * ((int) (this.f2496i & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c6) & 4294967295L) | (Float.floatToRawIntBits(b5) << 32);
                if (!C1353b.c(bVar.f14554v, floatToRawIntBits)) {
                    bVar.f14554v = floatToRawIntBits;
                    bVar.a.r(floatToRawIntBits);
                }
            }
            r0.b bVar2 = this.f2491c;
            InterfaceC0961c interfaceC0961c = this.f2501n;
            e1.m mVar = this.f2502o;
            long j3 = this.f2496i;
            long j4 = bVar2.f14553u;
            r0.d dVar = bVar2.a;
            if (!e1.l.b(j4, j3)) {
                bVar2.f14553u = j3;
                long j5 = bVar2.f14552t;
                dVar.n((int) (j5 >> 32), (int) (4294967295L & j5), j3);
                if (bVar2.f14541i == 9205357640488583168L) {
                    bVar2.f14539g = true;
                    bVar2.a();
                }
            }
            bVar2.f14534b = interfaceC0961c;
            bVar2.f14535c = mVar;
            bVar2.f14536d = this.f2511x;
            dVar.m(interfaceC0961c, mVar, bVar2, bVar2.f14537e);
            if (this.f2500m) {
                this.f2500m = false;
                this.f2493f.z(this, false);
            }
        }
    }

    @Override // H0.q0
    public final void invalidate() {
        if (this.f2500m || this.f2497j) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.f2493f;
        viewTreeObserverOnGlobalLayoutListenerC0216x.invalidate();
        if (true != this.f2500m) {
            this.f2500m = true;
            viewTreeObserverOnGlobalLayoutListenerC0216x.z(this, true);
        }
    }
}
