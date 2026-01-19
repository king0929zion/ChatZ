package v;

import T.C0607g0;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import f0.AbstractC0992o;
import java.util.WeakHashMap;
import o0.C1397h;
import t1.AbstractC1700c;
import t1.AbstractC1708k;
import t1.AbstractC1709l;
import t1.AbstractC1713p;
import t1.C1701d;

/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: w, reason: collision with root package name */
    public static final WeakHashMap f15220w = new WeakHashMap();
    public final C1785a a;

    /* renamed from: b, reason: collision with root package name */
    public final C1785a f15221b;

    /* renamed from: c, reason: collision with root package name */
    public final C1785a f15222c;

    /* renamed from: d, reason: collision with root package name */
    public final C1785a f15223d;

    /* renamed from: e, reason: collision with root package name */
    public final C1785a f15224e;

    /* renamed from: f, reason: collision with root package name */
    public final C1785a f15225f;

    /* renamed from: g, reason: collision with root package name */
    public final C1785a f15226g;

    /* renamed from: h, reason: collision with root package name */
    public final C1785a f15227h;

    /* renamed from: i, reason: collision with root package name */
    public final C1785a f15228i;

    /* renamed from: j, reason: collision with root package name */
    public final C0 f15229j;

    /* renamed from: k, reason: collision with root package name */
    public final C0607g0 f15230k;

    /* renamed from: l, reason: collision with root package name */
    public final x0 f15231l;

    /* renamed from: m, reason: collision with root package name */
    public final C0 f15232m;

    /* renamed from: n, reason: collision with root package name */
    public final C0 f15233n;

    /* renamed from: o, reason: collision with root package name */
    public final C0 f15234o;

    /* renamed from: p, reason: collision with root package name */
    public final C0 f15235p;

    /* renamed from: q, reason: collision with root package name */
    public final C0 f15236q;

    /* renamed from: r, reason: collision with root package name */
    public final C0 f15237r;

    /* renamed from: s, reason: collision with root package name */
    public final C0 f15238s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15239t;

    /* renamed from: u, reason: collision with root package name */
    public int f15240u;

    /* renamed from: v, reason: collision with root package name */
    public final N f15241v;

    public G0(View view) {
        C1785a b5 = C1810p.b(4, "captionBar");
        this.a = b5;
        C1785a b6 = C1810p.b(PegdownExtensions.FENCED_CODE_BLOCKS, "displayCutout");
        this.f15221b = b6;
        C1785a b7 = C1810p.b(8, "ime");
        this.f15222c = b7;
        C1785a b8 = C1810p.b(32, "mandatorySystemGestures");
        this.f15223d = b8;
        C1785a b9 = C1810p.b(2, "navigationBars");
        this.f15224e = b9;
        C1785a b10 = C1810p.b(1, "statusBars");
        this.f15225f = b10;
        C1785a b11 = C1810p.b(519, "systemBars");
        this.f15226g = b11;
        C1785a b12 = C1810p.b(16, "systemGestures");
        this.f15227h = b12;
        C1785a b13 = C1810p.b(64, "tappableElement");
        this.f15228i = b13;
        C0 c02 = new C0(new S(0, 0, 0, 0), "waterfall");
        this.f15229j = c02;
        this.f15230k = T.r.A(null);
        this.f15231l = new x0(new x0(b11, b7), b6);
        new x0(new x0(new x0(b13, b8), b12), c02);
        this.f15232m = C1810p.d(4, "captionBarIgnoringVisibility");
        this.f15233n = C1810p.d(2, "navigationBarsIgnoringVisibility");
        this.f15234o = C1810p.d(1, "statusBarsIgnoringVisibility");
        this.f15235p = C1810p.d(519, "systemBarsIgnoringVisibility");
        this.f15236q = C1810p.d(64, "tappableElementIgnoringVisibility");
        this.f15237r = new C0(new S(0, 0, 0, 0), "imeAnimationTarget");
        this.f15238s = new C0(new S(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f15239t = bool != null ? bool.booleanValue() : false;
        this.f15241v = new N(this);
        int i6 = AbstractC1713p.a;
        t1.P a = AbstractC1709l.a(view);
        if (a != null) {
            t1.L l3 = a.a;
            b5.f(l3.q(4));
            b6.f(l3.q(PegdownExtensions.FENCED_CODE_BLOCKS));
            b7.f(l3.q(8));
            b8.f(l3.q(32));
            b9.f(l3.q(2));
            b10.f(l3.q(1));
            b11.f(l3.q(519));
            b12.f(l3.q(16));
            b13.f(l3.q(64));
        }
    }

    public static void b(G0 g02, t1.P p5) {
        boolean z5 = false;
        g02.a.g(p5, 0);
        g02.f15222c.g(p5, 0);
        g02.f15221b.g(p5, 0);
        g02.f15224e.g(p5, 0);
        g02.f15225f.g(p5, 0);
        g02.f15226g.g(p5, 0);
        g02.f15227h.g(p5, 0);
        g02.f15228i.g(p5, 0);
        g02.f15223d.g(p5, 0);
        g02.f15232m.f(AbstractC1787b.E(p5.a.h(4)));
        g02.f15233n.f(AbstractC1787b.E(p5.a.h(2)));
        g02.f15234o.f(AbstractC1787b.E(p5.a.h(1)));
        g02.f15235p.f(AbstractC1787b.E(p5.a.h(519)));
        g02.f15236q.f(AbstractC1787b.E(p5.a.h(64)));
        C1701d f6 = p5.a.f();
        g02.f15229j.f(AbstractC1787b.E(f6 != null ? f6.a() : o1.c.f13500e));
        C1397h c1397h = null;
        if (f6 != null) {
            Path a = Build.VERSION.SDK_INT >= 31 ? AbstractC1700c.a(f6.a) : null;
            if (a != null) {
                c1397h = new C1397h(a);
            }
        }
        g02.f15230k.setValue(c1397h);
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

    public final void a(View view) {
        if (this.f15240u == 0) {
            int i6 = AbstractC1713p.a;
            N n3 = this.f15241v;
            AbstractC1708k.b(view, n3);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(n3);
            AbstractC1713p.c(view, n3);
        }
        this.f15240u++;
    }
}
