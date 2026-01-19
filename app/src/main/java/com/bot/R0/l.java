package r0;

import H0.C0158m;
import I0.Y0;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import e1.InterfaceC0961c;
import e1.m;
import o0.C1391b;
import o0.q;
import o0.r;
import q0.AbstractC1497c;
import q0.C1495a;
import q0.C1496b;
import s0.AbstractC1650a;

/* loaded from: classes.dex */
public final class l extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final Y0 f14632n = new Y0(4);

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1650a f14633c;

    /* renamed from: e, reason: collision with root package name */
    public final r f14634e;

    /* renamed from: f, reason: collision with root package name */
    public final C1496b f14635f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f14636g;

    /* renamed from: h, reason: collision with root package name */
    public Outline f14637h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f14638i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0961c f14639j;

    /* renamed from: k, reason: collision with root package name */
    public m f14640k;

    /* renamed from: l, reason: collision with root package name */
    public l4.c f14641l;

    /* renamed from: m, reason: collision with root package name */
    public b f14642m;

    public l(AbstractC1650a abstractC1650a, r rVar, C1496b c1496b) {
        super(abstractC1650a.getContext());
        this.f14633c = abstractC1650a;
        this.f14634e = rVar;
        this.f14635f = c1496b;
        setOutlineProvider(f14632n);
        this.f14638i = true;
        this.f14639j = AbstractC1497c.a;
        this.f14640k = m.f11576c;
        d.a.getClass();
        this.f14641l = C1627a.f14532g;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        r rVar = this.f14634e;
        C1391b c1391b = rVar.a;
        Canvas canvas2 = c1391b.a;
        c1391b.a = canvas;
        InterfaceC0961c interfaceC0961c = this.f14639j;
        m mVar = this.f14640k;
        float width = getWidth();
        float height = getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        b bVar = this.f14642m;
        l4.c cVar = this.f14641l;
        C1496b c1496b = this.f14635f;
        C0158m c0158m = c1496b.f13944e;
        C1495a c1495a = ((C1496b) c0158m.f1974g).f13943c;
        InterfaceC0961c interfaceC0961c2 = c1495a.a;
        m mVar2 = c1495a.f13940b;
        q g3 = c0158m.g();
        C0158m c0158m2 = c1496b.f13944e;
        long j3 = c0158m2.j();
        b bVar2 = (b) c0158m2.f1973f;
        c0158m2.q(interfaceC0961c);
        c0158m2.r(mVar);
        c0158m2.p(c1391b);
        c0158m2.s(floatToRawIntBits);
        c0158m2.f1973f = bVar;
        c1391b.h();
        try {
            cVar.f(c1496b);
            c1391b.p();
            c0158m2.q(interfaceC0961c2);
            c0158m2.r(mVar2);
            c0158m2.p(g3);
            c0158m2.s(j3);
            c0158m2.f1973f = bVar2;
            rVar.a.a = canvas2;
            this.f14636g = false;
        } catch (Throwable th) {
            c1391b.p();
            c0158m2.q(interfaceC0961c2);
            c0158m2.r(mVar2);
            c0158m2.p(g3);
            c0158m2.s(j3);
            c0158m2.f1973f = bVar2;
            throw th;
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f14638i;
    }

    public final r getCanvasHolder() {
        return this.f14634e;
    }

    public final View getOwnerView() {
        return this.f14633c;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f14638i;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.f14636g) {
            return;
        }
        this.f14636g = true;
        super.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z5) {
        if (this.f14638i != z5) {
            this.f14638i = z5;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z5) {
        this.f14636g = z5;
    }
}
