package r0;

import B0.G;
import H0.C0158m;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import e1.InterfaceC0961c;
import e1.m;
import java.util.concurrent.atomic.AtomicBoolean;
import m4.AbstractC1276k;
import o0.AbstractC1392c;
import o0.C1391b;
import o0.C1400k;
import o0.C1403n;
import o0.q;
import o0.r;
import o0.s;
import o0.y;
import o4.AbstractC1410a;
import q0.C1495a;
import q0.C1496b;

/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: A, reason: collision with root package name */
    public static final AtomicBoolean f14557A = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final r f14558b;

    /* renamed from: c, reason: collision with root package name */
    public final C1496b f14559c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f14560d;

    /* renamed from: e, reason: collision with root package name */
    public long f14561e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f14562f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f14563g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14564h;

    /* renamed from: i, reason: collision with root package name */
    public long f14565i;

    /* renamed from: j, reason: collision with root package name */
    public int f14566j;

    /* renamed from: k, reason: collision with root package name */
    public int f14567k;

    /* renamed from: l, reason: collision with root package name */
    public float f14568l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14569m;

    /* renamed from: n, reason: collision with root package name */
    public float f14570n;

    /* renamed from: o, reason: collision with root package name */
    public float f14571o;

    /* renamed from: p, reason: collision with root package name */
    public float f14572p;

    /* renamed from: q, reason: collision with root package name */
    public float f14573q;

    /* renamed from: r, reason: collision with root package name */
    public float f14574r;

    /* renamed from: s, reason: collision with root package name */
    public long f14575s;

    /* renamed from: t, reason: collision with root package name */
    public long f14576t;

    /* renamed from: u, reason: collision with root package name */
    public float f14577u;

    /* renamed from: v, reason: collision with root package name */
    public float f14578v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14579w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14580x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14581y;

    /* renamed from: z, reason: collision with root package name */
    public C1403n f14582z;

    public e(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, r rVar, C1496b c1496b) {
        this.f14558b = rVar;
        this.f14559c = c1496b;
        RenderNode create = RenderNode.create("Compose", viewTreeObserverOnGlobalLayoutListenerC0216x);
        this.f14560d = create;
        this.f14561e = 0L;
        this.f14565i = 0L;
        if (f14557A.getAndSet(false)) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                k.c(create, k.a(create));
                k.d(create, k.b(create));
            }
            j.a(create);
            create.setLayerType(0);
            create.setHasOverlappingRendering(create.hasOverlappingRendering());
        }
        create.setClipToBounds(false);
        Q(0);
        this.f14566j = 0;
        this.f14567k = 3;
        this.f14568l = 1.0f;
        this.f14570n = 1.0f;
        this.f14571o = 1.0f;
        long j3 = s.f13475b;
        this.f14575s = j3;
        this.f14576t = j3;
        this.f14578v = 8.0f;
    }

    @Override // r0.d
    public final void A(float f6) {
        this.f14570n = f6;
        this.f14560d.setScaleX(f6);
    }

    @Override // r0.d
    public final float B() {
        return this.f14578v;
    }

    @Override // r0.d
    public final float C() {
        return this.f14572p;
    }

    @Override // r0.d
    public final void D(boolean z5) {
        this.f14579w = z5;
        P();
    }

    @Override // r0.d
    public final float E() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final void F(int i6) {
        this.f14566j = i6;
        R();
    }

    @Override // r0.d
    public final void G(float f6) {
        this.f14572p = f6;
        this.f14560d.setTranslationX(f6);
    }

    @Override // r0.d
    public final void H(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14576t = j3;
            k.d(this.f14560d, y.B(j3));
        }
    }

    @Override // r0.d
    public final Matrix I() {
        Matrix matrix = this.f14563g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f14563g = matrix;
        }
        this.f14560d.getMatrix(matrix);
        return matrix;
    }

    @Override // r0.d
    public final void J(C1403n c1403n) {
        this.f14582z = c1403n;
    }

    @Override // r0.d
    public final void K(float f6) {
        this.f14578v = f6;
        this.f14560d.setCameraDistance(-f6);
    }

    @Override // r0.d
    public final float L() {
        return this.f14574r;
    }

    @Override // r0.d
    public final void M(q qVar) {
        DisplayListCanvas a = AbstractC1392c.a(qVar);
        AbstractC1276k.d(a, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        a.drawRenderNode(this.f14560d);
    }

    @Override // r0.d
    public final float N() {
        return this.f14571o;
    }

    @Override // r0.d
    public final int O() {
        return this.f14567k;
    }

    public final void P() {
        boolean z5 = this.f14579w;
        boolean z6 = false;
        boolean z7 = z5 && !this.f14564h;
        if (z5 && this.f14564h) {
            z6 = true;
        }
        if (z7 != this.f14580x) {
            this.f14580x = z7;
            this.f14560d.setClipToBounds(z7);
        }
        if (z6 != this.f14581y) {
            this.f14581y = z6;
            this.f14560d.setClipToOutline(z6);
        }
    }

    public final void Q(int i6) {
        RenderNode renderNode = this.f14560d;
        if (i6 == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f14562f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i6 == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f14562f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f14562f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i6 = this.f14566j;
        if (i6 != 1 && this.f14567k == 3) {
            Q(i6);
        } else {
            Q(1);
        }
    }

    @Override // r0.d
    public final float a() {
        return this.f14568l;
    }

    @Override // r0.d
    public final float b() {
        return this.f14570n;
    }

    @Override // r0.d
    public final void c(float f6) {
        this.f14574r = f6;
        this.f14560d.setElevation(f6);
    }

    @Override // r0.d
    public final C1403n d() {
        return this.f14582z;
    }

    @Override // r0.d
    public final void e(float f6) {
        this.f14577u = f6;
        this.f14560d.setRotation(f6);
    }

    @Override // r0.d
    public final void f(float f6) {
        this.f14573q = f6;
        this.f14560d.setTranslationY(f6);
    }

    @Override // r0.d
    public final void g(Outline outline, long j3) {
        this.f14565i = j3;
        this.f14560d.setOutline(outline);
        this.f14564h = outline != null;
        P();
    }

    @Override // r0.d
    public final void h(int i6) {
        if (this.f14567k == i6) {
            return;
        }
        this.f14567k = i6;
        Paint paint = this.f14562f;
        if (paint == null) {
            paint = new Paint();
            this.f14562f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(y.F(i6)));
        R();
    }

    @Override // r0.d
    public final void i() {
        j.a(this.f14560d);
    }

    @Override // r0.d
    public final int j() {
        return this.f14566j;
    }

    @Override // r0.d
    public final C1400k k() {
        return null;
    }

    @Override // r0.d
    public final void l(float f6) {
        this.f14571o = f6;
        this.f14560d.setScaleY(f6);
    }

    @Override // r0.d
    public final void m(InterfaceC0961c interfaceC0961c, m mVar, b bVar, G g3) {
        Canvas start = this.f14560d.start(Math.max((int) (this.f14561e >> 32), (int) (this.f14565i >> 32)), Math.max((int) (this.f14561e & 4294967295L), (int) (this.f14565i & 4294967295L)));
        try {
            C1391b c1391b = this.f14558b.a;
            Canvas canvas = c1391b.a;
            c1391b.a = start;
            C1496b c1496b = this.f14559c;
            C0158m c0158m = c1496b.f13944e;
            long S5 = AbstractC1410a.S(this.f14561e);
            C1495a c1495a = ((C1496b) c0158m.f1974g).f13943c;
            InterfaceC0961c interfaceC0961c2 = c1495a.a;
            m mVar2 = c1495a.f13940b;
            q g6 = c0158m.g();
            long j3 = c0158m.j();
            b bVar2 = (b) c0158m.f1973f;
            c0158m.q(interfaceC0961c);
            c0158m.r(mVar);
            c0158m.p(c1391b);
            c0158m.s(S5);
            c0158m.f1973f = bVar;
            c1391b.h();
            try {
                g3.f(c1496b);
                c1391b.p();
                c0158m.q(interfaceC0961c2);
                c0158m.r(mVar2);
                c0158m.p(g6);
                c0158m.s(j3);
                c0158m.f1973f = bVar2;
                c1391b.a = canvas;
                this.f14560d.end(start);
            } catch (Throwable th) {
                c1391b.p();
                C0158m c0158m2 = c1496b.f13944e;
                c0158m2.q(interfaceC0961c2);
                c0158m2.r(mVar2);
                c0158m2.p(g6);
                c0158m2.s(j3);
                c0158m2.f1973f = bVar2;
                throw th;
            }
        } catch (Throwable th2) {
            this.f14560d.end(start);
            throw th2;
        }
    }

    @Override // r0.d
    public final void n(int i6, int i7, long j3) {
        int i8 = (int) (j3 >> 32);
        int i9 = (int) (4294967295L & j3);
        this.f14560d.setLeftTopRightBottom(i6, i7, i6 + i8, i7 + i9);
        if (e1.l.b(this.f14561e, j3)) {
            return;
        }
        if (this.f14569m) {
            this.f14560d.setPivotX(i8 / 2.0f);
            this.f14560d.setPivotY(i9 / 2.0f);
        }
        this.f14561e = j3;
    }

    @Override // r0.d
    public final float o() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final boolean p() {
        return this.f14560d.isValid();
    }

    @Override // r0.d
    public final float q() {
        return this.f14577u;
    }

    @Override // r0.d
    public final void r(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f14569m = true;
            this.f14560d.setPivotX(((int) (this.f14561e >> 32)) / 2.0f);
            this.f14560d.setPivotY(((int) (4294967295L & this.f14561e)) / 2.0f);
        } else {
            this.f14569m = false;
            this.f14560d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f14560d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // r0.d
    public final long s() {
        return this.f14575s;
    }

    @Override // r0.d
    public final void t() {
        this.f14560d.setRotationX(S.l.f7374V);
    }

    @Override // r0.d
    public final void u(float f6) {
        this.f14568l = f6;
        this.f14560d.setAlpha(f6);
    }

    @Override // r0.d
    public final float v() {
        return this.f14573q;
    }

    @Override // r0.d
    public final void w() {
        this.f14560d.setRotationY(S.l.f7374V);
    }

    @Override // r0.d
    public final long x() {
        return this.f14576t;
    }

    @Override // r0.d
    public final void y(long j3) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f14575s = j3;
            k.c(this.f14560d, y.B(j3));
        }
    }

    @Override // r0.d
    public final void z() {
        R();
    }
}
