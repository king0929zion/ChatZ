package F0;

import T.C0601d0;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import f0.AbstractC0992o;
import f0.C0996s;
import java.util.Collections;
import java.util.List;
import k.C1147A;
import m4.AbstractC1276k;
import p1.AbstractC1484a;
import t1.AbstractC1708k;
import t1.AbstractC1713p;
import t1.C1701d;
import t1.InterfaceC1702e;

/* renamed from: F0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0129q extends O4.d implements Runnable, InterfaceC1702e, View.OnAttachStateChangeListener {

    /* renamed from: f, reason: collision with root package name */
    public boolean f1508f;

    /* renamed from: g, reason: collision with root package name */
    public int f1509g;

    /* renamed from: h, reason: collision with root package name */
    public t1.P f1510h;

    /* renamed from: i, reason: collision with root package name */
    public final k.M f1511i;

    /* renamed from: j, reason: collision with root package name */
    public final C0601d0 f1512j;

    /* renamed from: k, reason: collision with root package name */
    public final k.I f1513k;

    /* renamed from: l, reason: collision with root package name */
    public final C0996s f1514l;

    public RunnableC0129q() {
        super(1);
        k.M m3 = new k.M(9);
        C0.a.getClass();
        m3.m(B0.f1383b, new F0("caption bar"));
        m3.m(B0.f1384c, new F0("display cutout"));
        m3.m(B0.f1385d, new F0("ime"));
        m3.m(B0.f1386e, new F0("mandatory system gestures"));
        m3.m(B0.f1387f, new F0("navigation bars"));
        m3.m(B0.f1388g, new F0("status bars"));
        m3.m(B0.f1389h, new F0("system gestures"));
        m3.m(B0.f1390i, new F0("tappable element"));
        m3.m(B0.f1391j, new F0("waterfall"));
        this.f1511i = m3;
        this.f1512j = new C0601d0(0);
        this.f1513k = new k.I(4);
        this.f1514l = new C0996s();
    }

    @Override // t1.InterfaceC1702e
    public final t1.P a(View view, t1.P p5) {
        if (this.f1508f) {
            this.f1510h = p5;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return p5;
            }
        } else if (this.f1509g == 0) {
            f(p5);
        }
        return p5;
    }

    @Override // O4.d
    public final void b(t1.z zVar) {
        boolean z5 = false;
        this.f1508f = false;
        int d6 = zVar.a.d();
        this.f1509g &= ~d6;
        this.f1510h = null;
        C0 c02 = (C0) E0.a.b(d6);
        if (c02 != null) {
            Object g3 = this.f1511i.g(c02);
            AbstractC1276k.c(g3);
            F0 f02 = (F0) g3;
            f02.f1401c.h(S.l.f7374V);
            f02.f1403e.h(1.0f);
            f02.f1402d.h(0L);
            f02.f1401c.h(S.l.f7374V);
            f02.f1400b.setValue(Boolean.FALSE);
            f02.f1408j = -1L;
            f02.f1409k = -1L;
            C0601d0 c0601d0 = this.f1512j;
            c0601d0.h(c0601d0.g() + 1);
            synchronized (AbstractC0992o.f11707c) {
                k.N n3 = AbstractC0992o.f11714j.f11668h;
                if (n3 != null) {
                    if (n3.h()) {
                        z5 = true;
                    }
                }
            }
            if (z5) {
                AbstractC0992o.a();
            }
        }
    }

    @Override // O4.d
    public final void c() {
        this.f1508f = true;
    }

    @Override // O4.d
    public final t1.P d(t1.P p5, List list) {
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            t1.z zVar = (t1.z) list.get(i6);
            C0 c02 = (C0) E0.a.b(zVar.a.d());
            if (c02 != null) {
                Object g3 = this.f1511i.g(c02);
                AbstractC1276k.c(g3);
                F0 f02 = (F0) g3;
                if (((Boolean) f02.f1400b.getValue()).booleanValue()) {
                    f02.f1401c.h(zVar.a.c());
                    t1.y yVar = zVar.a;
                    f02.f1403e.h(yVar.a());
                    f02.f1402d.h(yVar.b());
                }
            }
        }
        f(p5);
        return p5;
    }

    @Override // O4.d
    public final e0.k e(t1.z zVar, e0.k kVar) {
        t1.P p5 = this.f1510h;
        boolean z5 = false;
        this.f1508f = false;
        this.f1510h = null;
        if (zVar.a.b() > 0 && p5 != null) {
            int d6 = zVar.a.d();
            this.f1509g |= d6;
            C0 c02 = (C0) E0.a.b(d6);
            if (c02 != null) {
                Object g3 = this.f1511i.g(c02);
                AbstractC1276k.c(g3);
                F0 f02 = (F0) g3;
                o1.c g6 = p5.a.g(d6);
                long j3 = (g6.a << 48) | (g6.f13501b << 32) | (g6.f13502c << 16) | g6.f13503d;
                long j4 = f02.f1406h;
                if (!AbstractC0137z.g(j3, j4)) {
                    f02.f1408j = j4;
                    f02.f1409k = j3;
                    f02.f1400b.setValue(Boolean.TRUE);
                    f02.f1401c.h(zVar.a.c());
                    t1.y yVar = zVar.a;
                    f02.f1403e.h(yVar.a());
                    f02.f1402d.h(yVar.b());
                    C0601d0 c0601d0 = this.f1512j;
                    c0601d0.h(c0601d0.g() + 1);
                    synchronized (AbstractC0992o.f11707c) {
                        k.N n3 = AbstractC0992o.f11714j.f11668h;
                        if (n3 != null) {
                            if (n3.h()) {
                                z5 = true;
                            }
                        }
                    }
                    if (z5) {
                        AbstractC0992o.a();
                        return kVar;
                    }
                }
            }
        }
        return kVar;
    }

    public final void f(t1.P p5) {
        char c6;
        char c7;
        boolean z5;
        char c8;
        boolean z6;
        boolean z7;
        long j3;
        boolean z8;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j4;
        int i6;
        C1147A c1147a = E0.a;
        int[] iArr3 = c1147a.f12558b;
        Object[] objArr3 = c1147a.f12559c;
        long[] jArr3 = c1147a.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i7 = 0;
            z6 = false;
            z7 = false;
            c6 = 16;
            c7 = SequenceUtils.SPC;
            while (true) {
                long j5 = jArr3[i7];
                z5 = true;
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    int i10 = 0;
                    c8 = '0';
                    while (i10 < i9) {
                        if ((j5 & 255) < 128) {
                            int i11 = (i7 << 3) + i10;
                            int i12 = iArr3[i11];
                            C0 c02 = (C0) objArr3[i11];
                            o1.c g3 = p5.a.g(i12);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j6 = (g3.a << 48) | (g3.f13501b << 32) | (g3.f13502c << 16) | g3.f13503d;
                            Object g6 = this.f1511i.g(c02);
                            AbstractC1276k.c(g6);
                            F0 f02 = (F0) g6;
                            j4 = j5;
                            if (!AbstractC0137z.g(j6, f02.f1406h)) {
                                f02.f1406h = j6;
                                z6 = true;
                                if (!AbstractC0137z.g(j6, 0L)) {
                                    z7 = true;
                                }
                            }
                            if (i12 != 8) {
                                o1.c h3 = p5.a.h(i12);
                                objArr2 = objArr3;
                                long j7 = (h3.f13501b << 32) | (h3.a << 48) | (h3.f13502c << 16) | h3.f13503d;
                                if (!AbstractC0137z.g(f02.f1407i, j7)) {
                                    f02.f1407i = j7;
                                    z6 = true;
                                    if (!AbstractC0137z.g(j7, 0L)) {
                                        z7 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            f02.a.setValue(Boolean.valueOf(p5.a.q(i12)));
                            i6 = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j4 = j5;
                            i6 = i8;
                        }
                        j5 = j4 >> i6;
                        i10++;
                        i8 = i6;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i9 != i8) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c8 = '0';
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c6 = 16;
            c7 = SequenceUtils.SPC;
            z5 = true;
            c8 = '0';
            z6 = false;
            z7 = false;
        }
        C1701d f6 = p5.a.f();
        if (f6 == null) {
            j3 = 0;
        } else {
            o1.c a = f6.a();
            j3 = (a.a << c8) | (a.f13501b << c7) | (a.f13502c << c6) | a.f13503d;
        }
        k.M m3 = this.f1511i;
        C0.a.getClass();
        Object g7 = m3.g(B0.f1391j);
        AbstractC1276k.c(g7);
        F0 f03 = (F0) g7;
        f03.a.setValue(Boolean.valueOf(!AbstractC0137z.g(j3, 0L)));
        if (!AbstractC0137z.g(f03.f1406h, j3)) {
            f03.f1406h = j3;
            f03.f1407i = j3;
            z6 = z5;
            if (!AbstractC0137z.g(j3, 0L)) {
                z7 = z6;
            }
        }
        if (f6 == null) {
            k.I i13 = this.f1513k;
            if (i13.f12466b > 0) {
                i13.d();
                this.f1514l.clear();
                z6 = z5;
            }
        } else {
            List b5 = Build.VERSION.SDK_INT >= 28 ? AbstractC1484a.b(f6.a) : Collections.EMPTY_LIST;
            int size = b5.size();
            k.I i14 = this.f1513k;
            if (size < i14.f12466b) {
                i14.l(b5.size(), this.f1513k.f12466b);
                this.f1514l.b(b5.size(), this.f1514l.size());
                z6 = z5;
            } else {
                int size2 = b5.size() - this.f1513k.f12466b;
                int i15 = 0;
                while (i15 < size2) {
                    k.I i16 = this.f1513k;
                    i16.a(T.r.A(b5.get(i16.f12466b)));
                    this.f1514l.add(new C0128p("display cutout rect " + this.f1513k.f12466b));
                    i15++;
                    z6 = z5;
                }
            }
            int size3 = b5.size();
            for (int i17 = 0; i17 < size3; i17++) {
                Rect rect = (Rect) b5.get(i17);
                T.X x5 = (T.X) this.f1513k.f(i17);
                if (!AbstractC1276k.b(x5.getValue(), rect)) {
                    x5.setValue(rect);
                    z6 = z5;
                }
            }
            if (!b5.isEmpty()) {
                z7 = z5;
            }
        }
        if ((z7 || this.f1512j.g() != 0) && z6) {
            C0601d0 c0601d0 = this.f1512j;
            c0601d0.h(c0601d0.g() + 1);
            synchronized (AbstractC0992o.f11707c) {
                k.N n3 = AbstractC0992o.f11714j.f11668h;
                if (n3 != null) {
                    boolean z9 = z5;
                    z8 = n3.h() == z9 ? z9 : false;
                }
            }
            if (z8) {
                AbstractC0992o.a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i6 = AbstractC1713p.a;
        AbstractC1708k.b(view, this);
        AbstractC1713p.c(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        int i6 = AbstractC1713p.a;
        AbstractC1708k.b(view, null);
        AbstractC1713p.c(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1508f) {
            this.f1509g = 0;
            this.f1508f = false;
            t1.P p5 = this.f1510h;
            if (p5 != null) {
                f(p5);
                this.f1510h = null;
            }
        }
    }
}
