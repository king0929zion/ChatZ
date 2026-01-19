package X0;

import B0.M;
import D.C0091s;
import D.Q;
import H0.C0158m;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import S0.L;
import S0.O;
import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vladsch.flexmark.html2md.converter.FlexmarkHtmlConverter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import m4.AbstractC1276k;
import n0.C1354c;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class y implements q {
    public final View a;

    /* renamed from: b, reason: collision with root package name */
    public final C0158m f9133b;

    /* renamed from: c, reason: collision with root package name */
    public final z f9134c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9135d;

    /* renamed from: e, reason: collision with root package name */
    public l4.c f9136e;

    /* renamed from: f, reason: collision with root package name */
    public l4.c f9137f;

    /* renamed from: g, reason: collision with root package name */
    public v f9138g;

    /* renamed from: h, reason: collision with root package name */
    public k f9139h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f9140i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f9141j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f9142k;

    /* renamed from: l, reason: collision with root package name */
    public final C0685c f9143l;

    /* renamed from: m, reason: collision with root package name */
    public final V.e f9144m;

    /* renamed from: n, reason: collision with root package name */
    public I.h f9145n;

    public y(View view, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        C0158m c0158m = new C0158m(view);
        z zVar = new z(Choreographer.getInstance());
        this.a = view;
        this.f9133b = c0158m;
        this.f9134c = zVar;
        this.f9136e = C0684b.f9080h;
        this.f9137f = C0684b.f9081i;
        this.f9138g = new v(O.f7610b, FlexmarkHtmlConverter.DEFAULT_NODE, 4);
        this.f9139h = k.f9108g;
        this.f9140i = new ArrayList();
        this.f9141j = X3.a.c(X3.g.f9391e, new A0.b(this, 12));
        this.f9143l = new C0685c(viewTreeObserverOnGlobalLayoutListenerC0216x, c0158m);
        this.f9144m = new V.e(new x[16]);
    }

    @Override // X0.q
    public final void a() {
        i(x.f9128c);
    }

    @Override // X0.q
    public final void b() {
        i(x.f9130f);
    }

    /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.Object, X3.f] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, X3.f] */
    @Override // X0.q
    public final void c(v vVar, v vVar2) {
        boolean z5 = (O.b(this.f9138g.f9125b, vVar2.f9125b) && AbstractC1276k.b(this.f9138g.f9126c, vVar2.f9126c)) ? false : true;
        this.f9138g = vVar2;
        int size = this.f9140i.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar = (r) ((WeakReference) this.f9140i.get(i6)).get();
            if (rVar != null) {
                rVar.f9117d = vVar2;
            }
        }
        C0685c c0685c = this.f9143l;
        synchronized (c0685c.f9086c) {
            c0685c.f9093j = null;
            c0685c.f9095l = null;
            c0685c.f9094k = null;
            c0685c.f9096m = C0684b.f9078f;
            c0685c.f9097n = null;
            c0685c.f9098o = null;
        }
        if (AbstractC1276k.b(vVar, vVar2)) {
            if (z5) {
                C0158m c0158m = this.f9133b;
                int f6 = O.f(vVar2.f9125b);
                int e6 = O.e(vVar2.f9125b);
                O o5 = this.f9138g.f9126c;
                int f7 = o5 != null ? O.f(o5.a) : -1;
                O o6 = this.f9138g.f9126c;
                ((InputMethodManager) c0158m.f1973f.getValue()).updateSelection((View) c0158m.f1972e, f6, e6, f7, o6 != null ? O.e(o6.a) : -1);
                return;
            }
            return;
        }
        if (vVar != null && (!AbstractC1276k.b(vVar.a.f7630e, vVar2.a.f7630e) || (O.b(vVar.f9125b, vVar2.f9125b) && !AbstractC1276k.b(vVar.f9126c, vVar2.f9126c)))) {
            C0158m c0158m2 = this.f9133b;
            ((InputMethodManager) c0158m2.f1973f.getValue()).restartInput((View) c0158m2.f1972e);
            return;
        }
        int size2 = this.f9140i.size();
        for (int i7 = 0; i7 < size2; i7++) {
            r rVar2 = (r) ((WeakReference) this.f9140i.get(i7)).get();
            if (rVar2 != null) {
                v vVar3 = this.f9138g;
                C0158m c0158m3 = this.f9133b;
                if (rVar2.f9121h) {
                    rVar2.f9117d = vVar3;
                    if (rVar2.f9119f) {
                        ((InputMethodManager) c0158m3.f1973f.getValue()).updateExtractedText((View) c0158m3.f1972e, rVar2.f9118e, Y4.d.X(vVar3));
                    }
                    O o7 = vVar3.f9126c;
                    long j3 = vVar3.f9125b;
                    int f8 = o7 != null ? O.f(o7.a) : -1;
                    O o8 = vVar3.f9126c;
                    ((InputMethodManager) c0158m3.f1973f.getValue()).updateSelection((View) c0158m3.f1972e, O.f(j3), O.e(j3), f8, o8 != null ? O.e(o8.a) : -1);
                }
            }
        }
    }

    @Override // X0.q
    public final void d() {
        this.f9135d = false;
        this.f9136e = C0684b.f9082j;
        this.f9137f = C0684b.f9083k;
        this.f9142k = null;
        i(x.f9129e);
    }

    @Override // X0.q
    public final void e(v vVar, k kVar, C0091s c0091s, Q q3) {
        this.f9135d = true;
        this.f9138g = vVar;
        this.f9139h = kVar;
        this.f9136e = c0091s;
        this.f9137f = q3;
        i(x.f9128c);
    }

    @Override // X0.q
    public final void f(C1354c c1354c) {
        Rect rect;
        this.f9142k = new Rect(AbstractC1410a.K(c1354c.a), AbstractC1410a.K(c1354c.f13295b), AbstractC1410a.K(c1354c.f13296c), AbstractC1410a.K(c1354c.f13297d));
        if (!this.f9140i.isEmpty() || (rect = this.f9142k) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // X0.q
    public final void g() {
        i(x.f9131g);
    }

    @Override // X0.q
    public final void h(v vVar, p pVar, L l3, M m3, C1354c c1354c, C1354c c1354c2) {
        C0685c c0685c = this.f9143l;
        synchronized (c0685c.f9086c) {
            try {
                c0685c.f9093j = vVar;
                c0685c.f9095l = pVar;
                c0685c.f9094k = l3;
                c0685c.f9096m = m3;
                c0685c.f9097n = c1354c;
                c0685c.f9098o = c1354c2;
                if (!c0685c.f9088e) {
                    if (c0685c.f9087d) {
                    }
                }
                c0685c.a();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(x xVar) {
        this.f9144m.b(xVar);
        if (this.f9145n == null) {
            I.h hVar = new I.h(this, 3);
            this.f9134c.execute(hVar);
            this.f9145n = hVar;
        }
    }
}
