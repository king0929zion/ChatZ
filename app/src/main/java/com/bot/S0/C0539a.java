package S0;

import B4.D;
import a1.AbstractC0794b;
import a1.C0793a;
import a1.C0795c;
import a1.C0797e;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import e1.C0959a;
import n0.C1354c;
import o0.AbstractC1392c;
import o0.AbstractC1404o;
import o0.C1389K;
import q0.AbstractC1499e;

/* renamed from: S0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539a {
    public final C0795c a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7615b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7616c;

    /* renamed from: d, reason: collision with root package name */
    public final T0.j f7617d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f7618e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f7619f;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0539a(a1.C0795c r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.C0539a.<init>(a1.c, int, int, long):void");
    }

    public final T0.j a(int i6, int i7, TextUtils.TruncateAt truncateAt, int i8, int i9, int i10, int i11, int i12, CharSequence charSequence) {
        w wVar;
        float d6 = d();
        C0795c c0795c = this.a;
        C0797e c0797e = c0795c.f10559g;
        int i13 = c0795c.f10564l;
        T0.e eVar = c0795c.f10561i;
        P p5 = c0795c.f10554b;
        C0793a c0793a = AbstractC0794b.a;
        y yVar = p5.f7614c;
        return new T0.j(charSequence, d6, c0797e, i6, truncateAt, i13, (yVar == null || (wVar = yVar.f7676b) == null) ? false : wVar.a, i8, i10, i11, i12, i9, i7, eVar);
    }

    public final float b() {
        return this.f7617d.a();
    }

    /* JADX WARN: Type inference failed for: r13v26, types: [T0.a] */
    public final long c(C1354c c1354c, int i6, F0.F f6) {
        U0.c bVar;
        int i7;
        int[] iArr;
        SegmentFinder h3;
        RectF z5 = o0.y.z(c1354c);
        boolean z6 = i6 != 0 && i6 == 1;
        final B4.D d6 = new B4.D(f6, 15);
        T0.j jVar = this.f7617d;
        TextPaint textPaint = jVar.a;
        Layout layout = jVar.f8316f;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            if (z6) {
                h3 = new U0.a(new M.q(25, layout.getText(), jVar.j()));
            } else {
                M.n.p();
                h3 = M.n.h(M.n.g(layout.getText(), textPaint));
            }
            iArr = layout.getRangeForRect(z5, h3, new Layout.TextInclusionStrategy() { // from class: T0.a
                @Override // android.text.Layout.TextInclusionStrategy
                public final boolean isSegmentInside(RectF rectF, RectF rectF2) {
                    return ((Boolean) D.this.m(rectF, rectF2)).booleanValue();
                }
            });
        } else {
            E1.b c6 = jVar.c();
            if (z6) {
                bVar = new M.q(25, layout.getText(), jVar.j());
            } else {
                CharSequence text = layout.getText();
                bVar = i8 >= 29 ? new U0.b(text, textPaint) : new U0.b(text);
            }
            U0.c cVar = bVar;
            int lineForVertical = layout.getLineForVertical((int) z5.top);
            if (z5.top <= jVar.e(lineForVertical) || (lineForVertical = lineForVertical + 1) < jVar.f8317g) {
                int i9 = lineForVertical;
                int lineForVertical2 = layout.getLineForVertical((int) z5.bottom);
                if (lineForVertical2 != 0 || z5.bottom >= jVar.g(0)) {
                    int e6 = T0.g.e(jVar, layout, c6, i9, z5, cVar, d6, true);
                    while (true) {
                        i7 = i9;
                        if (e6 != -1 || i7 >= lineForVertical2) {
                            break;
                        }
                        i9 = i7 + 1;
                        e6 = T0.g.e(jVar, layout, c6, i9, z5, cVar, d6, true);
                    }
                    if (e6 != -1) {
                        int i10 = lineForVertical2;
                        int e7 = T0.g.e(jVar, layout, c6, i10, z5, cVar, d6, false);
                        while (e7 == -1 && i7 < i10) {
                            i10--;
                            e7 = T0.g.e(jVar, layout, c6, i10, z5, cVar, d6, false);
                        }
                        if (e7 != -1) {
                            iArr = new int[]{cVar.d(e6 + 1), cVar.f(e7 - 1)};
                        }
                    }
                }
            }
            iArr = null;
        }
        return iArr == null ? O.f7610b : F.b(iArr[0], iArr[1]);
    }

    public final float d() {
        return C0959a.h(this.f7616c);
    }

    public final void e(o0.q qVar) {
        Canvas a = AbstractC1392c.a(qVar);
        T0.j jVar = this.f7617d;
        if (jVar.f8314d) {
            a.save();
            a.clipRect(S.l.f7374V, S.l.f7374V, d(), b());
        }
        int i6 = jVar.f8318h;
        if (a.getClipBounds(jVar.f8326p)) {
            if (i6 != 0) {
                a.translate(S.l.f7374V, i6);
            }
            ThreadLocal threadLocal = T0.k.a;
            Object obj = threadLocal.get();
            if (obj == null) {
                obj = new Canvas();
                threadLocal.set(obj);
            }
            T0.i iVar = (T0.i) obj;
            iVar.a = a;
            try {
                jVar.f8316f.draw(iVar);
                if (i6 != 0) {
                    a.translate(S.l.f7374V, (-1) * i6);
                }
            } finally {
                iVar.a = null;
            }
        }
        if (jVar.f8314d) {
            a.restore();
        }
    }

    public final void f(o0.q qVar, long j3, C1389K c1389k, d1.l lVar, AbstractC1499e abstractC1499e) {
        C0797e c0797e = this.a.f10559g;
        int i6 = c0797e.f10568c;
        c0797e.d(j3);
        c0797e.f(c1389k);
        c0797e.g(lVar);
        c0797e.e(abstractC1499e);
        c0797e.b(3);
        e(qVar);
        c0797e.b(i6);
    }

    public final void g(o0.q qVar, AbstractC1404o abstractC1404o, float f6, C1389K c1389k, d1.l lVar, AbstractC1499e abstractC1499e) {
        C0797e c0797e = this.a.f10559g;
        int i6 = c0797e.f10568c;
        float d6 = d();
        float b5 = b();
        c0797e.c(abstractC1404o, (Float.floatToRawIntBits(b5) & 4294967295L) | (Float.floatToRawIntBits(d6) << 32), f6);
        c0797e.f(c1389k);
        c0797e.g(lVar);
        c0797e.e(abstractC1499e);
        c0797e.b(3);
        e(qVar);
        c0797e.b(i6);
    }
}
