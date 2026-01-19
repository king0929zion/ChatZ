package r0;

import B0.G;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import e1.InterfaceC0961c;
import e1.m;
import o0.AbstractC1392c;
import o0.C1391b;
import o0.C1400k;
import o0.C1403n;
import o0.q;
import o0.r;
import o0.s;
import o0.y;
import q0.C1496b;
import s0.AbstractC1650a;

/* loaded from: classes.dex */
public final class i implements d {

    /* renamed from: A, reason: collision with root package name */
    public static final h f14606A = new Canvas();

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1650a f14607b;

    /* renamed from: c, reason: collision with root package name */
    public final r f14608c;

    /* renamed from: d, reason: collision with root package name */
    public final l f14609d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f14610e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f14611f;

    /* renamed from: g, reason: collision with root package name */
    public Paint f14612g;

    /* renamed from: h, reason: collision with root package name */
    public int f14613h;

    /* renamed from: i, reason: collision with root package name */
    public int f14614i;

    /* renamed from: j, reason: collision with root package name */
    public long f14615j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f14616k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f14617l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14618m;

    /* renamed from: n, reason: collision with root package name */
    public int f14619n;

    /* renamed from: o, reason: collision with root package name */
    public int f14620o;

    /* renamed from: p, reason: collision with root package name */
    public float f14621p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14622q;

    /* renamed from: r, reason: collision with root package name */
    public float f14623r;

    /* renamed from: s, reason: collision with root package name */
    public float f14624s;

    /* renamed from: t, reason: collision with root package name */
    public float f14625t;

    /* renamed from: u, reason: collision with root package name */
    public float f14626u;

    /* renamed from: v, reason: collision with root package name */
    public float f14627v;

    /* renamed from: w, reason: collision with root package name */
    public long f14628w;

    /* renamed from: x, reason: collision with root package name */
    public long f14629x;

    /* renamed from: y, reason: collision with root package name */
    public float f14630y;

    /* renamed from: z, reason: collision with root package name */
    public C1403n f14631z;

    public i(AbstractC1650a abstractC1650a) {
        r rVar = new r();
        C1496b c1496b = new C1496b();
        this.f14607b = abstractC1650a;
        this.f14608c = rVar;
        l lVar = new l(abstractC1650a, rVar, c1496b);
        this.f14609d = lVar;
        this.f14610e = abstractC1650a.getResources();
        this.f14611f = new Rect();
        abstractC1650a.addView(lVar);
        lVar.setClipBounds(null);
        this.f14615j = 0L;
        View.generateViewId();
        this.f14619n = 3;
        this.f14620o = 0;
        this.f14621p = 1.0f;
        this.f14623r = 1.0f;
        this.f14624s = 1.0f;
        long j3 = s.f13475b;
        this.f14628w = j3;
        this.f14629x = j3;
    }

    @Override // r0.d
    public final void A(float f6) {
        this.f14623r = f6;
        this.f14609d.setScaleX(f6);
    }

    @Override // r0.d
    public final float B() {
        return this.f14609d.getCameraDistance() / this.f14610e.getDisplayMetrics().densityDpi;
    }

    @Override // r0.d
    public final float C() {
        return this.f14625t;
    }

    @Override // r0.d
    public final void D(boolean z5) {
        boolean z6 = false;
        this.f14618m = z5 && !this.f14617l;
        this.f14616k = true;
        if (z5 && this.f14617l) {
            z6 = true;
        }
        this.f14609d.setClipToOutline(z6);
    }

    @Override // r0.d
    public final float E() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final void F(int i6) {
        this.f14620o = i6;
        Q();
    }

    @Override // r0.d
    public final void G(float f6) {
        this.f14625t = f6;
        this.f14609d.setTranslationX(f6);
    }

    @Override // r0.d
    public final void H(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14629x = j3;
            this.f14609d.setOutlineSpotShadowColor(y.B(j3));
        }
    }

    @Override // r0.d
    public final Matrix I() {
        return this.f14609d.getMatrix();
    }

    @Override // r0.d
    public final void J(C1403n c1403n) {
        this.f14631z = c1403n;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14609d.setRenderEffect(c1403n != null ? c1403n.a() : null);
        }
    }

    @Override // r0.d
    public final void K(float f6) {
        this.f14609d.setCameraDistance(f6 * this.f14610e.getDisplayMetrics().densityDpi);
    }

    @Override // r0.d
    public final float L() {
        return this.f14627v;
    }

    @Override // r0.d
    public final void M(q qVar) {
        Rect rect;
        boolean z5 = this.f14616k;
        l lVar = this.f14609d;
        if (z5) {
            if ((this.f14618m || lVar.getClipToOutline()) && !this.f14617l) {
                rect = this.f14611f;
                rect.left = 0;
                rect.top = 0;
                rect.right = lVar.getWidth();
                rect.bottom = lVar.getHeight();
            } else {
                rect = null;
            }
            lVar.setClipBounds(rect);
        }
        if (AbstractC1392c.a(qVar).isHardwareAccelerated()) {
            this.f14607b.a(qVar, lVar, lVar.getDrawingTime());
        }
    }

    @Override // r0.d
    public final float N() {
        return this.f14624s;
    }

    @Override // r0.d
    public final int O() {
        return this.f14619n;
    }

    public final void P(int i6) {
        l lVar = this.f14609d;
        boolean z5 = true;
        if (i6 == 1) {
            lVar.setLayerType(2, this.f14612g);
        } else if (i6 == 2) {
            lVar.setLayerType(0, this.f14612g);
            z5 = false;
        } else {
            lVar.setLayerType(0, this.f14612g);
        }
        lVar.setCanUseCompositingLayer$ui_graphics(z5);
    }

    public final void Q() {
        int i6 = this.f14620o;
        if (i6 != 1 && this.f14619n == 3) {
            P(i6);
        } else {
            P(1);
        }
    }

    @Override // r0.d
    public final float a() {
        return this.f14621p;
    }

    @Override // r0.d
    public final float b() {
        return this.f14623r;
    }

    @Override // r0.d
    public final void c(float f6) {
        this.f14627v = f6;
        this.f14609d.setElevation(f6);
    }

    @Override // r0.d
    public final C1403n d() {
        return this.f14631z;
    }

    @Override // r0.d
    public final void e(float f6) {
        this.f14630y = f6;
        this.f14609d.setRotation(f6);
    }

    @Override // r0.d
    public final void f(float f6) {
        this.f14626u = f6;
        this.f14609d.setTranslationY(f6);
    }

    @Override // r0.d
    public final void g(Outline outline, long j3) {
        l lVar = this.f14609d;
        lVar.f14637h = outline;
        lVar.invalidateOutline();
        if ((this.f14618m || lVar.getClipToOutline()) && outline != null) {
            lVar.setClipToOutline(true);
            if (this.f14618m) {
                this.f14618m = false;
                this.f14616k = true;
            }
        }
        this.f14617l = outline != null;
    }

    @Override // r0.d
    public final void h(int i6) {
        this.f14619n = i6;
        Paint paint = this.f14612g;
        if (paint == null) {
            paint = new Paint();
            this.f14612g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(y.F(i6)));
        Q();
    }

    @Override // r0.d
    public final void i() {
        this.f14607b.removeViewInLayout(this.f14609d);
    }

    @Override // r0.d
    public final int j() {
        return this.f14620o;
    }

    @Override // r0.d
    public final C1400k k() {
        return null;
    }

    @Override // r0.d
    public final void l(float f6) {
        this.f14624s = f6;
        this.f14609d.setScaleY(f6);
    }

    @Override // r0.d
    public final void m(InterfaceC0961c interfaceC0961c, m mVar, b bVar, G g3) {
        l lVar = this.f14609d;
        ViewParent parent = lVar.getParent();
        AbstractC1650a abstractC1650a = this.f14607b;
        if (parent == null) {
            abstractC1650a.addView(lVar);
        }
        lVar.f14639j = interfaceC0961c;
        lVar.f14640k = mVar;
        lVar.f14641l = g3;
        lVar.f14642m = bVar;
        if (lVar.isAttachedToWindow()) {
            lVar.setVisibility(4);
            lVar.setVisibility(0);
            try {
                r rVar = this.f14608c;
                h hVar = f14606A;
                C1391b c1391b = rVar.a;
                Canvas canvas = c1391b.a;
                c1391b.a = hVar;
                abstractC1650a.a(c1391b, lVar, lVar.getDrawingTime());
                rVar.a.a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // r0.d
    public final void n(int i6, int i7, long j3) {
        boolean b5 = e1.l.b(this.f14615j, j3);
        l lVar = this.f14609d;
        if (b5) {
            int i8 = this.f14613h;
            if (i8 != i6) {
                lVar.offsetLeftAndRight(i6 - i8);
            }
            int i9 = this.f14614i;
            if (i9 != i7) {
                lVar.offsetTopAndBottom(i7 - i9);
            }
        } else {
            if (this.f14618m || lVar.getClipToOutline()) {
                this.f14616k = true;
            }
            int i10 = (int) (j3 >> 32);
            int i11 = (int) (4294967295L & j3);
            lVar.layout(i6, i7, i6 + i10, i7 + i11);
            this.f14615j = j3;
            if (this.f14622q) {
                lVar.setPivotX(i10 / 2.0f);
                lVar.setPivotY(i11 / 2.0f);
            }
        }
        this.f14613h = i6;
        this.f14614i = i7;
    }

    @Override // r0.d
    public final float o() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final float q() {
        return this.f14630y;
    }

    @Override // r0.d
    public final void r(long j3) {
        long j4 = 9223372034707292159L & j3;
        l lVar = this.f14609d;
        if (j4 != 9205357640488583168L) {
            this.f14622q = false;
            lVar.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            lVar.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                lVar.resetPivot();
                return;
            }
            this.f14622q = true;
            lVar.setPivotX(((int) (this.f14615j >> 32)) / 2.0f);
            lVar.setPivotY(((int) (this.f14615j & 4294967295L)) / 2.0f);
        }
    }

    @Override // r0.d
    public final long s() {
        return this.f14628w;
    }

    @Override // r0.d
    public final void t() {
        this.f14609d.setRotationX(S.l.f7374V);
    }

    @Override // r0.d
    public final void u(float f6) {
        this.f14621p = f6;
        this.f14609d.setAlpha(f6);
    }

    @Override // r0.d
    public final float v() {
        return this.f14626u;
    }

    @Override // r0.d
    public final void w() {
        this.f14609d.setRotationY(S.l.f7374V);
    }

    @Override // r0.d
    public final long x() {
        return this.f14629x;
    }

    @Override // r0.d
    public final void y(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14628w = j3;
            this.f14609d.setOutlineAmbientShadowColor(y.B(j3));
        }
    }

    @Override // r0.d
    public final void z() {
        Paint paint = this.f14612g;
        if (paint == null) {
            paint = new Paint();
            this.f14612g = paint;
        }
        paint.setColorFilter(null);
        Q();
    }
}
