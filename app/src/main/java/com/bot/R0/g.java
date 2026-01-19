package r0;

import B0.G;
import H0.C0158m;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
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
import o4.AbstractC1410a;
import q0.C1496b;

/* loaded from: classes.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    public final r f14583b;

    /* renamed from: c, reason: collision with root package name */
    public final C1496b f14584c;

    /* renamed from: d, reason: collision with root package name */
    public final RenderNode f14585d;

    /* renamed from: e, reason: collision with root package name */
    public long f14586e;

    /* renamed from: f, reason: collision with root package name */
    public Paint f14587f;

    /* renamed from: g, reason: collision with root package name */
    public Matrix f14588g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14589h;

    /* renamed from: i, reason: collision with root package name */
    public float f14590i;

    /* renamed from: j, reason: collision with root package name */
    public int f14591j;

    /* renamed from: k, reason: collision with root package name */
    public float f14592k;

    /* renamed from: l, reason: collision with root package name */
    public float f14593l;

    /* renamed from: m, reason: collision with root package name */
    public float f14594m;

    /* renamed from: n, reason: collision with root package name */
    public float f14595n;

    /* renamed from: o, reason: collision with root package name */
    public float f14596o;

    /* renamed from: p, reason: collision with root package name */
    public long f14597p;

    /* renamed from: q, reason: collision with root package name */
    public long f14598q;

    /* renamed from: r, reason: collision with root package name */
    public float f14599r;

    /* renamed from: s, reason: collision with root package name */
    public float f14600s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f14601t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f14602u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f14603v;

    /* renamed from: w, reason: collision with root package name */
    public C1403n f14604w;

    /* renamed from: x, reason: collision with root package name */
    public int f14605x;

    public g() {
        r rVar = new r();
        C1496b c1496b = new C1496b();
        this.f14583b = rVar;
        this.f14584c = c1496b;
        RenderNode o5 = o1.b.o();
        this.f14585d = o5;
        this.f14586e = 0L;
        o5.setClipToBounds(false);
        Q(o5, 0);
        this.f14590i = 1.0f;
        this.f14591j = 3;
        this.f14592k = 1.0f;
        this.f14593l = 1.0f;
        long j3 = s.f13475b;
        this.f14597p = j3;
        this.f14598q = j3;
        this.f14600s = 8.0f;
        this.f14605x = 0;
    }

    @Override // r0.d
    public final void A(float f6) {
        this.f14592k = f6;
        this.f14585d.setScaleX(f6);
    }

    @Override // r0.d
    public final float B() {
        return this.f14600s;
    }

    @Override // r0.d
    public final float C() {
        return this.f14594m;
    }

    @Override // r0.d
    public final void D(boolean z5) {
        this.f14601t = z5;
        P();
    }

    @Override // r0.d
    public final float E() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final void F(int i6) {
        this.f14605x = i6;
        R();
    }

    @Override // r0.d
    public final void G(float f6) {
        this.f14594m = f6;
        this.f14585d.setTranslationX(f6);
    }

    @Override // r0.d
    public final void H(long j3) {
        this.f14598q = j3;
        this.f14585d.setSpotShadowColor(y.B(j3));
    }

    @Override // r0.d
    public final Matrix I() {
        Matrix matrix = this.f14588g;
        if (matrix == null) {
            matrix = new Matrix();
            this.f14588g = matrix;
        }
        this.f14585d.getMatrix(matrix);
        return matrix;
    }

    @Override // r0.d
    public final void J(C1403n c1403n) {
        this.f14604w = c1403n;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f14585d.setRenderEffect(c1403n != null ? c1403n.a() : null);
        }
    }

    @Override // r0.d
    public final void K(float f6) {
        this.f14600s = f6;
        this.f14585d.setCameraDistance(f6);
    }

    @Override // r0.d
    public final float L() {
        return this.f14596o;
    }

    @Override // r0.d
    public final void M(q qVar) {
        AbstractC1392c.a(qVar).drawRenderNode(this.f14585d);
    }

    @Override // r0.d
    public final float N() {
        return this.f14593l;
    }

    @Override // r0.d
    public final int O() {
        return this.f14591j;
    }

    public final void P() {
        boolean z5 = this.f14601t;
        boolean z6 = false;
        boolean z7 = z5 && !this.f14589h;
        if (z5 && this.f14589h) {
            z6 = true;
        }
        if (z7 != this.f14602u) {
            this.f14602u = z7;
            this.f14585d.setClipToBounds(z7);
        }
        if (z6 != this.f14603v) {
            this.f14603v = z6;
            this.f14585d.setClipToOutline(z6);
        }
    }

    public final void Q(RenderNode renderNode, int i6) {
        if (i6 == 1) {
            renderNode.setUseCompositingLayer(true, this.f14587f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i6 == 2) {
            renderNode.setUseCompositingLayer(false, this.f14587f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.f14587f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void R() {
        int i6 = this.f14605x;
        if (i6 != 1 && this.f14591j == 3 && this.f14604w == null) {
            Q(this.f14585d, i6);
        } else {
            Q(this.f14585d, 1);
        }
    }

    @Override // r0.d
    public final float a() {
        return this.f14590i;
    }

    @Override // r0.d
    public final float b() {
        return this.f14592k;
    }

    @Override // r0.d
    public final void c(float f6) {
        this.f14596o = f6;
        this.f14585d.setElevation(f6);
    }

    @Override // r0.d
    public final C1403n d() {
        return this.f14604w;
    }

    @Override // r0.d
    public final void e(float f6) {
        this.f14599r = f6;
        this.f14585d.setRotationZ(f6);
    }

    @Override // r0.d
    public final void f(float f6) {
        this.f14595n = f6;
        this.f14585d.setTranslationY(f6);
    }

    @Override // r0.d
    public final void g(Outline outline, long j3) {
        this.f14585d.setOutline(outline);
        this.f14589h = outline != null;
        P();
    }

    @Override // r0.d
    public final void h(int i6) {
        this.f14591j = i6;
        Paint paint = this.f14587f;
        if (paint == null) {
            paint = new Paint();
            this.f14587f = paint;
        }
        paint.setBlendMode(y.x(i6));
        R();
    }

    @Override // r0.d
    public final void i() {
        this.f14585d.discardDisplayList();
    }

    @Override // r0.d
    public final int j() {
        return this.f14605x;
    }

    @Override // r0.d
    public final C1400k k() {
        return null;
    }

    @Override // r0.d
    public final void l(float f6) {
        this.f14593l = f6;
        this.f14585d.setScaleY(f6);
    }

    @Override // r0.d
    public final void m(InterfaceC0961c interfaceC0961c, m mVar, b bVar, G g3) {
        RecordingCanvas beginRecording;
        C1496b c1496b = this.f14584c;
        beginRecording = this.f14585d.beginRecording();
        try {
            r rVar = this.f14583b;
            C1391b c1391b = rVar.a;
            Canvas canvas = c1391b.a;
            c1391b.a = beginRecording;
            C0158m c0158m = c1496b.f13944e;
            c0158m.q(interfaceC0961c);
            c0158m.r(mVar);
            c0158m.f1973f = bVar;
            c0158m.s(this.f14586e);
            c0158m.p(c1391b);
            g3.f(c1496b);
            rVar.a.a = canvas;
        } finally {
            this.f14585d.endRecording();
        }
    }

    @Override // r0.d
    public final void n(int i6, int i7, long j3) {
        this.f14585d.setPosition(i6, i7, ((int) (j3 >> 32)) + i6, ((int) (4294967295L & j3)) + i7);
        this.f14586e = AbstractC1410a.S(j3);
    }

    @Override // r0.d
    public final float o() {
        return S.l.f7374V;
    }

    @Override // r0.d
    public final boolean p() {
        boolean hasDisplayList;
        hasDisplayList = this.f14585d.hasDisplayList();
        return hasDisplayList;
    }

    @Override // r0.d
    public final float q() {
        return this.f14599r;
    }

    @Override // r0.d
    public final void r(long j3) {
        if ((9223372034707292159L & j3) == 9205357640488583168L) {
            this.f14585d.resetPivot();
        } else {
            this.f14585d.setPivotX(Float.intBitsToFloat((int) (j3 >> 32)));
            this.f14585d.setPivotY(Float.intBitsToFloat((int) (j3 & 4294967295L)));
        }
    }

    @Override // r0.d
    public final long s() {
        return this.f14597p;
    }

    @Override // r0.d
    public final void t() {
        this.f14585d.setRotationX(S.l.f7374V);
    }

    @Override // r0.d
    public final void u(float f6) {
        this.f14590i = f6;
        this.f14585d.setAlpha(f6);
    }

    @Override // r0.d
    public final float v() {
        return this.f14595n;
    }

    @Override // r0.d
    public final void w() {
        this.f14585d.setRotationY(S.l.f7374V);
    }

    @Override // r0.d
    public final long x() {
        return this.f14598q;
    }

    @Override // r0.d
    public final void y(long j3) {
        this.f14597p = j3;
        this.f14585d.setAmbientShadowColor(y.B(j3));
    }

    @Override // r0.d
    public final void z() {
        Paint paint = this.f14587f;
        if (paint == null) {
            paint = new Paint();
            this.f14587f = paint;
        }
        paint.setColorFilter(null);
        R();
    }
}
