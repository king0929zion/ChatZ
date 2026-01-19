package p;

import H0.AbstractC0156k;
import H0.C0158m;
import H0.InterfaceC0160o;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.InterfaceC0961c;
import f0.C0987j;
import n0.C1356e;
import o0.AbstractC1392c;
import o0.C1391b;
import o4.AbstractC1410a;
import q0.C1495a;
import q0.C1496b;
import r.X0;
import v.InterfaceC1802i0;

/* renamed from: p.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1430e0 extends AbstractC0156k implements InterfaceC0160o {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f13696t = 1;

    /* renamed from: u, reason: collision with root package name */
    public final C1459u f13697u;

    /* renamed from: v, reason: collision with root package name */
    public final X f13698v;

    /* renamed from: w, reason: collision with root package name */
    public Object f13699w;

    public C1430e0(B0.X x5, C1459u c1459u, X x6) {
        this.f13697u = c1459u;
        this.f13698v = x6;
        M0(x5);
    }

    public static boolean P0(float f6, EdgeEffect edgeEffect, Canvas canvas) {
        if (f6 == S.l.f7374V) {
            return edgeEffect.draw(canvas);
        }
        int save = canvas.save();
        canvas.rotate(f6);
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public static boolean Q0(float f6, long j3, EdgeEffect edgeEffect, Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(f6);
        canvas.translate(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)));
        boolean draw = edgeEffect.draw(canvas);
        canvas.restoreToCount(save);
        return draw;
    }

    public RenderNode R0() {
        RenderNode renderNode = (RenderNode) this.f13699w;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode c6 = o1.b.c();
        this.f13699w = c6;
        return c6;
    }

    @Override // H0.InterfaceC0160o
    public final void k0(H0.L l3) {
        boolean z5;
        char c6;
        long j3;
        RecordingCanvas beginRecording;
        float f6;
        boolean z6;
        boolean z7;
        C1459u c1459u;
        RecordingCanvas recordingCanvas;
        char c7;
        float f7;
        float f8;
        float f9;
        float f10;
        switch (this.f13696t) {
            case 0:
                InterfaceC1802i0 interfaceC1802i0 = (InterfaceC1802i0) this.f13699w;
                C1496b c1496b = l3.f1765c;
                long c8 = c1496b.c();
                C1459u c1459u2 = this.f13697u;
                c1459u2.i(c8);
                if (C1356e.e(c1496b.c())) {
                    l3.b();
                    return;
                }
                l3.b();
                c1459u2.f13801d.getValue();
                Canvas a = AbstractC1392c.a(c1496b.f13944e.g());
                X x5 = this.f13698v;
                if (X.f(x5.f13662f)) {
                    z5 = Q0(270.0f, (Float.floatToRawIntBits(l3.e0(interfaceC1802i0.b(l3.getLayoutDirection()))) & 4294967295L) | (Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1496b.c() & 4294967295L))) << 32), x5.c(), a);
                } else {
                    z5 = false;
                }
                if (X.f(x5.f13660d)) {
                    c6 = ' ';
                    j3 = 4294967295L;
                    z5 = Q0(S.l.f7374V, (((long) Float.floatToRawIntBits(S.l.f7374V)) << 32) | (((long) Float.floatToRawIntBits(l3.e0(interfaceC1802i0.c()))) & 4294967295L), x5.e(), a) || z5;
                } else {
                    c6 = ' ';
                    j3 = 4294967295L;
                }
                if (X.f(x5.f13663g)) {
                    z5 = Q0(90.0f, (((long) Float.floatToRawIntBits(l3.e0(interfaceC1802i0.d(l3.getLayoutDirection())) + (-((float) AbstractC1410a.K(Float.intBitsToFloat((int) (c1496b.c() >> c6))))))) & j3) | (((long) Float.floatToRawIntBits(S.l.f7374V)) << c6), x5.d(), a) || z5;
                }
                if (X.f(x5.f13661e)) {
                    z5 = Q0(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (c1496b.c() & j3))) + l3.e0(interfaceC1802i0.a()))) & j3) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (c1496b.c() >> c6)))) << c6), x5.b(), a) || z5;
                }
                if (z5) {
                    c1459u2.d();
                    return;
                }
                return;
            default:
                C1496b c1496b2 = l3.f1765c;
                long c9 = c1496b2.c();
                C1459u c1459u3 = this.f13697u;
                c1459u3.i(c9);
                Canvas a6 = AbstractC1392c.a(c1496b2.f13944e.g());
                c1459u3.f13801d.getValue();
                if (C1356e.e(c1496b2.c())) {
                    l3.b();
                    return;
                }
                boolean isHardwareAccelerated = a6.isHardwareAccelerated();
                X x6 = this.f13698v;
                if (!isHardwareAccelerated) {
                    EdgeEffect edgeEffect = x6.f13660d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = x6.f13661e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = x6.f13662f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = x6.f13663g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = x6.f13664h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = x6.f13665i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = x6.f13666j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = x6.f13667k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    l3.b();
                    return;
                }
                float e02 = l3.e0(L.a);
                boolean z8 = X.f(x6.f13660d) || X.g(x6.f13664h) || X.f(x6.f13661e) || X.g(x6.f13665i);
                boolean z9 = X.f(x6.f13662f) || X.g(x6.f13666j) || X.f(x6.f13663g) || X.g(x6.f13667k);
                if (z8 && z9) {
                    R0().setPosition(0, 0, a6.getWidth(), a6.getHeight());
                } else if (z8) {
                    R0().setPosition(0, 0, (AbstractC1410a.K(e02) * 2) + a6.getWidth(), a6.getHeight());
                } else {
                    if (!z9) {
                        l3.b();
                        return;
                    }
                    R0().setPosition(0, 0, a6.getWidth(), (AbstractC1410a.K(e02) * 2) + a6.getHeight());
                }
                beginRecording = R0().beginRecording();
                boolean g3 = X.g(x6.f13666j);
                X0 x02 = X0.f14184e;
                if (g3) {
                    EdgeEffect edgeEffect9 = x6.f13666j;
                    if (edgeEffect9 == null) {
                        edgeEffect9 = x6.a(x02);
                        x6.f13666j = edgeEffect9;
                    }
                    P0(90.0f, edgeEffect9, beginRecording);
                    edgeEffect9.finish();
                }
                if (X.f(x6.f13662f)) {
                    EdgeEffect c10 = x6.c();
                    z7 = P0(270.0f, c10, beginRecording);
                    if (X.g(x6.f13662f)) {
                        z6 = z9;
                        float intBitsToFloat = Float.intBitsToFloat((int) (c1459u3.c() & 4294967295L));
                        EdgeEffect edgeEffect10 = x6.f13666j;
                        if (edgeEffect10 == null) {
                            edgeEffect10 = x6.a(x02);
                            x6.f13666j = edgeEffect10;
                        }
                        int i6 = Build.VERSION.SDK_INT;
                        float b5 = i6 >= 31 ? AbstractC1462x.b(c10) : S.l.f7374V;
                        f6 = e02;
                        float f11 = 1 - intBitsToFloat;
                        if (i6 >= 31) {
                            AbstractC1462x.c(edgeEffect10, b5, f11);
                        } else {
                            edgeEffect10.onPull(b5, f11);
                        }
                    } else {
                        f6 = e02;
                        z6 = z9;
                    }
                } else {
                    f6 = e02;
                    z6 = z9;
                    z7 = false;
                }
                boolean g6 = X.g(x6.f13664h);
                X0 x03 = X0.f14183c;
                if (g6) {
                    EdgeEffect edgeEffect11 = x6.f13664h;
                    if (edgeEffect11 == null) {
                        edgeEffect11 = x6.a(x03);
                        x6.f13664h = edgeEffect11;
                    }
                    P0(180.0f, edgeEffect11, beginRecording);
                    edgeEffect11.finish();
                }
                if (X.f(x6.f13660d)) {
                    EdgeEffect e6 = x6.e();
                    boolean z10 = P0(S.l.f7374V, e6, beginRecording) || z7;
                    if (X.g(x6.f13660d)) {
                        long c11 = c1459u3.c();
                        recordingCanvas = beginRecording;
                        c7 = SequenceUtils.SPC;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (c11 >> 32));
                        EdgeEffect edgeEffect12 = x6.f13664h;
                        if (edgeEffect12 == null) {
                            edgeEffect12 = x6.a(x03);
                            x6.f13664h = edgeEffect12;
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31) {
                            c1459u = c1459u3;
                            f10 = AbstractC1462x.b(e6);
                        } else {
                            c1459u = c1459u3;
                            f10 = S.l.f7374V;
                        }
                        if (i7 >= 31) {
                            AbstractC1462x.c(edgeEffect12, f10, intBitsToFloat2);
                        } else {
                            edgeEffect12.onPull(f10, intBitsToFloat2);
                        }
                    } else {
                        c1459u = c1459u3;
                        recordingCanvas = beginRecording;
                        c7 = SequenceUtils.SPC;
                    }
                    z7 = z10;
                } else {
                    c1459u = c1459u3;
                    recordingCanvas = beginRecording;
                    c7 = SequenceUtils.SPC;
                }
                if (X.g(x6.f13667k)) {
                    EdgeEffect edgeEffect13 = x6.f13667k;
                    if (edgeEffect13 == null) {
                        edgeEffect13 = x6.a(x02);
                        x6.f13667k = edgeEffect13;
                    }
                    P0(270.0f, edgeEffect13, recordingCanvas);
                    edgeEffect13.finish();
                }
                if (X.f(x6.f13663g)) {
                    EdgeEffect d6 = x6.d();
                    boolean z11 = P0(90.0f, d6, recordingCanvas) || z7;
                    if (X.g(x6.f13663g)) {
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (c1459u.c() & 4294967295L));
                        EdgeEffect edgeEffect14 = x6.f13667k;
                        if (edgeEffect14 == null) {
                            edgeEffect14 = x6.a(x02);
                            x6.f13667k = edgeEffect14;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        float b6 = i8 >= 31 ? AbstractC1462x.b(d6) : S.l.f7374V;
                        if (i8 >= 31) {
                            AbstractC1462x.c(edgeEffect14, b6, intBitsToFloat3);
                        } else {
                            edgeEffect14.onPull(b6, intBitsToFloat3);
                        }
                    }
                    z7 = z11;
                }
                if (X.g(x6.f13665i)) {
                    EdgeEffect edgeEffect15 = x6.f13665i;
                    if (edgeEffect15 == null) {
                        edgeEffect15 = x6.a(x03);
                        x6.f13665i = edgeEffect15;
                    }
                    f7 = S.l.f7374V;
                    P0(S.l.f7374V, edgeEffect15, recordingCanvas);
                    edgeEffect15.finish();
                } else {
                    f7 = S.l.f7374V;
                }
                if (X.f(x6.f13661e)) {
                    EdgeEffect b7 = x6.b();
                    boolean z12 = P0(180.0f, b7, recordingCanvas) || z7;
                    if (X.g(x6.f13661e)) {
                        float intBitsToFloat4 = Float.intBitsToFloat((int) (c1459u.c() >> c7));
                        EdgeEffect edgeEffect16 = x6.f13665i;
                        if (edgeEffect16 == null) {
                            edgeEffect16 = x6.a(x03);
                            x6.f13665i = edgeEffect16;
                        }
                        int i9 = Build.VERSION.SDK_INT;
                        float b8 = i9 >= 31 ? AbstractC1462x.b(b7) : f7;
                        float f12 = 1 - intBitsToFloat4;
                        if (i9 >= 31) {
                            AbstractC1462x.c(edgeEffect16, b8, f12);
                        } else {
                            edgeEffect16.onPull(b8, f12);
                        }
                    }
                    z7 = z12;
                }
                if (z7) {
                    c1459u.d();
                }
                float f13 = z6 ? f7 : f6;
                if (!z8) {
                    f7 = f6;
                }
                e1.m layoutDirection = l3.getLayoutDirection();
                C1391b c1391b = new C1391b();
                c1391b.a = recordingCanvas;
                long c12 = c1496b2.c();
                C0158m c0158m = c1496b2.f13944e;
                C1495a c1495a = ((C1496b) c0158m.f1974g).f13943c;
                InterfaceC0961c interfaceC0961c = c1495a.a;
                e1.m mVar = c1495a.f13940b;
                o0.q g7 = c0158m.g();
                long j4 = c1496b2.f13944e.j();
                C0158m c0158m2 = c1496b2.f13944e;
                r0.b bVar = (r0.b) c0158m2.f1973f;
                c0158m2.q(l3);
                c0158m2.r(layoutDirection);
                c0158m2.p(c1391b);
                c0158m2.s(c12);
                c0158m2.f1973f = null;
                c1391b.h();
                try {
                    ((C0987j) c1496b2.f13944e.f1972e).G(f13, f7);
                    try {
                        l3.b();
                        c1391b.p();
                        C0158m c0158m3 = c1496b2.f13944e;
                        c0158m3.q(interfaceC0961c);
                        c0158m3.r(mVar);
                        c0158m3.p(g7);
                        c0158m3.s(j4);
                        c0158m3.f1973f = bVar;
                        R0().endRecording();
                        int save = a6.save();
                        a6.translate(f8, f9);
                        a6.drawRenderNode(R0());
                        a6.restoreToCount(save);
                        return;
                    } finally {
                        ((C0987j) c1496b2.f13944e.f1972e).G(-f13, -f7);
                    }
                } catch (Throwable th) {
                    c1391b.p();
                    C0158m c0158m4 = c1496b2.f13944e;
                    c0158m4.q(interfaceC0961c);
                    c0158m4.r(mVar);
                    c0158m4.p(g7);
                    c0158m4.s(j4);
                    c0158m4.f1973f = bVar;
                    throw th;
                }
        }
    }

    public C1430e0(B0.X x5, C1459u c1459u, X x6, InterfaceC1802i0 interfaceC1802i0) {
        this.f13697u = c1459u;
        this.f13698v = x6;
        this.f13699w = interfaceC1802i0;
        M0(x5);
    }
}
