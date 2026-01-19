package q0;

import H0.C0158m;
import android.graphics.Paint;
import android.graphics.Shader;
import e1.m;
import m4.AbstractC1276k;
import o0.AbstractC1404o;
import o0.C1395f;
import o0.C1397h;
import o0.C1400k;
import o0.q;
import o0.s;
import o0.y;

/* renamed from: q0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1496b implements InterfaceC1498d {

    /* renamed from: c, reason: collision with root package name */
    public final C1495a f13943c;

    /* renamed from: e, reason: collision with root package name */
    public final C0158m f13944e;

    /* renamed from: f, reason: collision with root package name */
    public L1.d f13945f;

    /* renamed from: g, reason: collision with root package name */
    public L1.d f13946g;

    /* JADX WARN: Type inference failed for: r0v0, types: [q0.a, java.lang.Object] */
    public C1496b() {
        ?? obj = new Object();
        obj.a = AbstractC1497c.a;
        obj.f13940b = m.f11576c;
        obj.f13941c = f.a;
        obj.f13942d = 0L;
        this.f13943c = obj;
        this.f13944e = new C0158m(this);
    }

    public static L1.d b(C1496b c1496b, long j3, AbstractC1499e abstractC1499e, float f6, int i6) {
        L1.d g3 = c1496b.g(abstractC1499e);
        if (f6 != 1.0f) {
            j3 = s.c(s.e(j3) * f6, j3);
        }
        if (!s.d(y.c(((Paint) g3.f3002b).getColor()), j3)) {
            g3.e(j3);
        }
        if (((Shader) g3.f3003c) != null) {
            g3.h(null);
        }
        if (!AbstractC1276k.b((C1400k) g3.f3004d, null)) {
            g3.f(null);
        }
        if (g3.a != i6) {
            g3.d(i6);
        }
        if (((Paint) g3.f3002b).isFilterBitmap()) {
            return g3;
        }
        g3.g(1);
        return g3;
    }

    @Override // q0.InterfaceC1498d
    public final void B(long j3, float f6, long j4, AbstractC1499e abstractC1499e) {
        this.f13943c.f13941c.t(f6, j4, b(this, j3, abstractC1499e, 1.0f, 3));
    }

    @Override // q0.InterfaceC1498d
    public final void C(AbstractC1404o abstractC1404o, long j3, long j4, float f6, AbstractC1499e abstractC1499e, int i6) {
        int i7 = (int) (j3 >> 32);
        int i8 = (int) (j3 & 4294967295L);
        this.f13943c.f13941c.r(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j4 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (4294967295L & j4)) + Float.intBitsToFloat(i8), d(abstractC1404o, abstractC1499e, f6, null, i6, 1));
    }

    @Override // q0.InterfaceC1498d
    public final void G(long j3, long j4, long j5, float f6, int i6) {
        q qVar = this.f13943c.f13941c;
        L1.d dVar = this.f13946g;
        if (dVar == null) {
            dVar = y.g();
            dVar.l(1);
            this.f13946g = dVar;
        }
        Paint paint = (Paint) dVar.f3002b;
        if (!s.d(y.c(paint.getColor()), j3)) {
            dVar.e(j3);
        }
        if (((Shader) dVar.f3003c) != null) {
            dVar.h(null);
        }
        if (!AbstractC1276k.b((C1400k) dVar.f3004d, null)) {
            dVar.f(null);
        }
        if (dVar.a != 3) {
            dVar.d(3);
        }
        if (paint.getStrokeWidth() != f6) {
            dVar.k(f6);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) dVar.f3002b).setStrokeMiter(4.0f);
        }
        if (dVar.a() != i6) {
            dVar.i(i6);
        }
        if (dVar.b() != 0) {
            dVar.j(0);
        }
        if (!paint.isFilterBitmap()) {
            dVar.g(1);
        }
        qVar.g(j4, j5, dVar);
    }

    @Override // e1.InterfaceC0961c
    public final float a() {
        return this.f13943c.a.a();
    }

    @Override // e1.InterfaceC0961c
    public final float b0() {
        return this.f13943c.a.b0();
    }

    public final L1.d d(AbstractC1404o abstractC1404o, AbstractC1499e abstractC1499e, float f6, C1400k c1400k, int i6, int i7) {
        L1.d g3 = g(abstractC1499e);
        if (abstractC1404o != null) {
            abstractC1404o.a(f6, c(), g3);
        } else {
            if (((Shader) g3.f3003c) != null) {
                g3.h(null);
            }
            long c6 = y.c(((Paint) g3.f3002b).getColor());
            long j3 = s.f13475b;
            if (!s.d(c6, j3)) {
                g3.e(j3);
            }
            if (((Paint) g3.f3002b).getAlpha() / 255.0f != f6) {
                g3.c(f6);
            }
        }
        if (!AbstractC1276k.b((C1400k) g3.f3004d, c1400k)) {
            g3.f(c1400k);
        }
        if (g3.a != i6) {
            g3.d(i6);
        }
        if (((Paint) g3.f3002b).isFilterBitmap() == i7) {
            return g3;
        }
        g3.g(i7);
        return g3;
    }

    public final void e(C1395f c1395f, C1400k c1400k) {
        this.f13943c.f13941c.b(c1395f, d(null, g.a, 1.0f, c1400k, 3, 1));
    }

    public final L1.d g(AbstractC1499e abstractC1499e) {
        if (AbstractC1276k.b(abstractC1499e, g.a)) {
            L1.d dVar = this.f13945f;
            if (dVar != null) {
                return dVar;
            }
            L1.d g3 = y.g();
            g3.l(0);
            this.f13945f = g3;
            return g3;
        }
        if (!(abstractC1499e instanceof h)) {
            throw new RuntimeException();
        }
        L1.d dVar2 = this.f13946g;
        if (dVar2 == null) {
            dVar2 = y.g();
            dVar2.l(1);
            this.f13946g = dVar2;
        }
        Paint paint = (Paint) dVar2.f3002b;
        float strokeWidth = paint.getStrokeWidth();
        h hVar = (h) abstractC1499e;
        float f6 = hVar.a;
        if (strokeWidth != f6) {
            dVar2.k(f6);
        }
        int a = dVar2.a();
        int i6 = hVar.f13948c;
        if (a != i6) {
            dVar2.i(i6);
        }
        float strokeMiter = paint.getStrokeMiter();
        float f7 = hVar.f13947b;
        if (strokeMiter != f7) {
            ((Paint) dVar2.f3002b).setStrokeMiter(f7);
        }
        int b5 = dVar2.b();
        int i7 = hVar.f13949d;
        if (b5 == i7) {
            return dVar2;
        }
        dVar2.j(i7);
        return dVar2;
    }

    @Override // q0.InterfaceC1498d
    public final C0158m g0() {
        return this.f13944e;
    }

    @Override // q0.InterfaceC1498d
    public final m getLayoutDirection() {
        return this.f13943c.f13940b;
    }

    @Override // q0.InterfaceC1498d
    public final void h0(C1397h c1397h, AbstractC1404o abstractC1404o, float f6, AbstractC1499e abstractC1499e, int i6) {
        this.f13943c.f13941c.e(c1397h, d(abstractC1404o, abstractC1499e, f6, null, i6, 1));
    }

    @Override // q0.InterfaceC1498d
    public final void i(long j3, long j4, long j5, long j6, AbstractC1499e abstractC1499e) {
        int i6 = (int) (j4 >> 32);
        int i7 = (int) (j4 & 4294967295L);
        this.f13943c.f13941c.a(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j5 & 4294967295L)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), b(this, j3, abstractC1499e, 1.0f, 3));
    }

    @Override // q0.InterfaceC1498d
    public final void n(C1395f c1395f, long j3, long j4, long j5, float f6, C1400k c1400k, int i6) {
        this.f13943c.f13941c.o(c1395f, j3, j4, j5, d(null, g.a, f6, c1400k, 3, i6));
    }

    @Override // q0.InterfaceC1498d
    public final void w0(long j3, long j4, long j5, float f6, int i6) {
        int i7 = (int) (j4 >> 32);
        int i8 = (int) (j4 & 4294967295L);
        this.f13943c.f13941c.r(Float.intBitsToFloat(i7), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (4294967295L & j5)) + Float.intBitsToFloat(i8), b(this, j3, g.a, f6, i6));
    }

    @Override // q0.InterfaceC1498d
    public final void x(long j3, float f6, float f7, long j4, long j5, AbstractC1499e abstractC1499e) {
        int i6 = (int) (j4 >> 32);
        int i7 = (int) (j4 & 4294967295L);
        this.f13943c.f13941c.j(Float.intBitsToFloat(i6), Float.intBitsToFloat(i7), Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat(i6), Float.intBitsToFloat((int) (j5 & 4294967295L)) + Float.intBitsToFloat(i7), f6, f7, b(this, j3, abstractC1499e, 1.0f, 3));
    }

    @Override // q0.InterfaceC1498d
    public final void y(C1397h c1397h, long j3, AbstractC1499e abstractC1499e) {
        this.f13943c.f13941c.e(c1397h, b(this, j3, abstractC1499e, 1.0f, 3));
    }
}
