package a1;

import T.E;
import android.graphics.Paint;
import android.text.TextPaint;
import d1.l;
import m4.AbstractC1276k;
import n0.C1356e;
import o0.AbstractC1404o;
import o0.C1389K;
import o0.s;
import o0.y;
import q0.AbstractC1499e;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797e extends TextPaint {
    public L1.d a;

    /* renamed from: b, reason: collision with root package name */
    public l f10567b;

    /* renamed from: c, reason: collision with root package name */
    public int f10568c;

    /* renamed from: d, reason: collision with root package name */
    public C1389K f10569d;

    /* renamed from: e, reason: collision with root package name */
    public s f10570e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1404o f10571f;

    /* renamed from: g, reason: collision with root package name */
    public E f10572g;

    /* renamed from: h, reason: collision with root package name */
    public C1356e f10573h;

    /* renamed from: i, reason: collision with root package name */
    public AbstractC1499e f10574i;

    public final L1.d a() {
        L1.d dVar = this.a;
        if (dVar != null) {
            return dVar;
        }
        L1.d dVar2 = new L1.d(this);
        this.a = dVar2;
        return dVar2;
    }

    public final void b(int i6) {
        if (i6 == this.f10568c) {
            return;
        }
        a().d(i6);
        this.f10568c = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if ((r1 == null ? false : n0.C1356e.a(r1.a, r7)) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(final o0.AbstractC1404o r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.f10572g = r0
            r5.f10571f = r0
            r5.f10573h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof o0.N
            if (r1 == 0) goto L1d
            o0.N r6 = (o0.N) r6
            long r6 = r6.a
            long r6 = Y3.C.J(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof o0.AbstractC1388J
            if (r1 == 0) goto L71
            o0.o r1 = r5.f10571f
            boolean r1 = m4.AbstractC1276k.b(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            n0.e r1 = r5.f10573h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = n0.C1356e.a(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f10571f = r6
            n0.e r1 = new n0.e
            r1.<init>(r7)
            r5.f10573h = r1
            a1.d r1 = new a1.d
            r1.<init>()
            T.E r6 = T.r.s(r1)
            r5.f10572g = r6
        L58:
            L1.d r6 = r5.a()
            T.E r7 = r5.f10572g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.h(r7)
            r5.f10570e = r0
            a1.j.c(r5, r9)
            return
        L71:
            N0.e r6 = new N0.e
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C0797e.c(o0.o, long, float):void");
    }

    public final void d(long j3) {
        s sVar = this.f10570e;
        if (sVar == null ? false : s.d(sVar.a, j3)) {
            return;
        }
        if (j3 != 16) {
            this.f10570e = new s(j3);
            setColor(y.B(j3));
            this.f10572g = null;
            this.f10571f = null;
            this.f10573h = null;
            setShader(null);
        }
    }

    public final void e(AbstractC1499e abstractC1499e) {
        if (abstractC1499e == null || AbstractC1276k.b(this.f10574i, abstractC1499e)) {
            return;
        }
        this.f10574i = abstractC1499e;
        if (abstractC1499e.equals(q0.g.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(abstractC1499e instanceof q0.h)) {
            throw new RuntimeException();
        }
        a().l(1);
        q0.h hVar = (q0.h) abstractC1499e;
        a().k(hVar.a);
        L1.d a = a();
        ((Paint) a.f3002b).setStrokeMiter(hVar.f13947b);
        a().j(hVar.f13949d);
        a().i(hVar.f13948c);
        ((Paint) a().f3002b).setPathEffect(null);
    }

    public final void f(C1389K c1389k) {
        if (c1389k == null || AbstractC1276k.b(this.f10569d, c1389k)) {
            return;
        }
        this.f10569d = c1389k;
        if (c1389k.equals(C1389K.f13435d)) {
            clearShadowLayer();
            return;
        }
        C1389K c1389k2 = this.f10569d;
        float f6 = c1389k2.f13437c;
        if (f6 == S.l.f7374V) {
            f6 = Float.MIN_VALUE;
        }
        setShadowLayer(f6, Float.intBitsToFloat((int) (c1389k2.f13436b >> 32)), Float.intBitsToFloat((int) (this.f10569d.f13436b & 4294967295L)), y.B(this.f10569d.a));
    }

    public final void g(l lVar) {
        if (lVar == null || AbstractC1276k.b(this.f10567b, lVar)) {
            return;
        }
        this.f10567b = lVar;
        int i6 = lVar.a;
        setUnderlineText((i6 | 1) == i6);
        int i7 = this.f10567b.a;
        setStrikeThruText((i7 | 2) == i7);
    }
}
