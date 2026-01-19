package h1;

import B0.F;
import B0.G;
import B0.I;
import B0.M;
import F0.AbstractC0137z;
import H0.C0165u;
import H0.J;
import H0.r0;
import H0.s0;
import H0.t0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import I0.m1;
import T.C0622o;
import T.InterfaceC0608h;
import Y3.C;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import h0.C1038o;
import h0.InterfaceC1041r;
import i4.AbstractC1117a;
import java.util.LinkedHashMap;
import l4.InterfaceC1193a;
import o0.y;
import t1.AbstractC1708k;
import t1.AbstractC1713p;
import t1.InterfaceC1702e;
import t1.L;
import t1.P;
import x4.AbstractC1888A;

/* loaded from: classes.dex */
public abstract class i extends ViewGroup implements InterfaceC0608h, s0, InterfaceC1702e {

    /* renamed from: A, reason: collision with root package name */
    public final N f11851A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f11852B;

    /* renamed from: C, reason: collision with root package name */
    public final J f11853C;

    /* renamed from: c, reason: collision with root package name */
    public final A0.e f11854c;

    /* renamed from: e, reason: collision with root package name */
    public final View f11855e;

    /* renamed from: f, reason: collision with root package name */
    public final r0 f11856f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1193a f11857g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11858h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC1193a f11859i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC1193a f11860j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC1041r f11861k;

    /* renamed from: l, reason: collision with root package name */
    public l4.c f11862l;

    /* renamed from: m, reason: collision with root package name */
    public InterfaceC0961c f11863m;

    /* renamed from: n, reason: collision with root package name */
    public l4.c f11864n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0846u f11865o;

    /* renamed from: p, reason: collision with root package name */
    public U1.e f11866p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f11867q;

    /* renamed from: r, reason: collision with root package name */
    public long f11868r;

    /* renamed from: s, reason: collision with root package name */
    public P f11869s;

    /* renamed from: t, reason: collision with root package name */
    public l4.c f11870t;

    /* renamed from: u, reason: collision with root package name */
    public final h f11871u;

    /* renamed from: v, reason: collision with root package name */
    public final h f11872v;

    /* renamed from: w, reason: collision with root package name */
    public l4.c f11873w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f11874x;

    /* renamed from: y, reason: collision with root package name */
    public int f11875y;

    /* renamed from: z, reason: collision with root package name */
    public int f11876z;

    public i(Context context, C0622o c0622o, int i6, A0.e eVar, View view, r0 r0Var) {
        super(context);
        this.f11854c = eVar;
        this.f11855e = view;
        this.f11856f = r0Var;
        LinkedHashMap linkedHashMap = m1.a;
        setTag(R.id.androidx_compose_ui_view_composition_context, c0622o);
        int i7 = 0;
        setSaveFromParentEnabled(false);
        addView(view);
        x xVar = (x) this;
        AbstractC1713p.c(this, new C1047a(xVar, i7));
        AbstractC1708k.b(this, this);
        this.f11857g = g.f11847h;
        this.f11859i = g.f11846g;
        this.f11860j = g.f11845f;
        C1038o c1038o = C1038o.a;
        this.f11861k = c1038o;
        this.f11863m = Y4.d.c();
        int i8 = 2;
        this.f11867q = new int[2];
        this.f11868r = 0L;
        this.f11871u = new h(xVar, 1);
        this.f11872v = new h(xVar, i7);
        this.f11874x = new int[2];
        this.f11875y = Integer.MIN_VALUE;
        this.f11876z = Integer.MIN_VALUE;
        this.f11851A = new N(21);
        J j3 = new J(3);
        j3.f1748s = xVar;
        InterfaceC1041r a = P0.n.a(A0.g.a(c1038o, k.a, eVar), true, C1048b.f11831h);
        I i9 = new I();
        i9.a = new B0.J(xVar, 0);
        M m3 = new M();
        M m5 = i9.f395b;
        if (m5 != null) {
            m5.f401e = null;
        }
        i9.f395b = m3;
        m3.f401e = i9;
        setOnRequestDisallowInterceptTouchEvent$ui(m3);
        InterfaceC1041r c6 = AbstractC0137z.m(l0.h.e(a.c(i9), new c.f(xVar, j3, xVar, 2)), new C1049c(xVar, j3, i8)).c(new n(new B0.J(xVar, 2)));
        j3.f0(this.f11861k.c(c6));
        this.f11862l = new F(12, j3, c6);
        j3.b0(this.f11863m);
        this.f11864n = new G(j3, 17);
        j3.f1728Q = new C1049c(xVar, j3, i7);
        j3.f1729R = new B0.J(xVar, 1);
        j3.e0(new C1050d(xVar, j3));
        this.f11853C = j3;
    }

    public static final int e(x xVar, int i6, int i7, int i8) {
        return (i8 >= 0 || i6 == i7) ? View.MeasureSpec.makeMeasureSpec(AbstractC1117a.f(i8, i6, i7), 1073741824) : (i8 != -2 || i7 == Integer.MAX_VALUE) ? (i8 != -1 || i7 == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
    }

    public static o1.c f(o1.c cVar, int i6, int i7, int i8, int i9) {
        int i10 = cVar.a - i6;
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = cVar.f13501b - i7;
        if (i11 < 0) {
            i11 = 0;
        }
        int i12 = cVar.f13502c - i8;
        if (i12 < 0) {
            i12 = 0;
        }
        int i13 = cVar.f13503d - i9;
        return o1.c.b(i10, i11, i12, i13 >= 0 ? i13 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t0 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            E0.a.b("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return ((ViewTreeObserverOnGlobalLayoutListenerC0216x) this.f11856f).getSnapshotObserver();
    }

    @Override // t1.InterfaceC1702e
    public final P a(View view, P p5) {
        this.f11869s = new P(p5);
        return g(p5);
    }

    @Override // T.InterfaceC0608h
    public final void b() {
        this.f11860j.b();
    }

    @Override // T.InterfaceC0608h
    public final void c() {
        this.f11859i.b();
        removeAllViewsInLayout();
    }

    public final P g(P p5) {
        L l3 = p5.a;
        o1.c g3 = l3.g(-1);
        o1.c cVar = o1.c.f13500e;
        if (!g3.equals(cVar) || !l3.h(-9).equals(cVar) || l3.f() != null) {
            C0165u c0165u = this.f11853C.f1721J.f1916c;
            if (c0165u.f1999V.f11819q) {
                long Q5 = C.Q(c0165u.U(0L));
                int i6 = (int) (Q5 >> 32);
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = (int) (Q5 & 4294967295L);
                if (i7 < 0) {
                    i7 = 0;
                }
                long m3 = AbstractC0137z.h(c0165u).m();
                int i8 = (int) (m3 >> 32);
                int i9 = (int) (m3 & 4294967295L);
                long j3 = c0165u.f1487f;
                long Q6 = C.Q(c0165u.U((Float.floatToRawIntBits((int) (j3 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j3 & 4294967295L)) & 4294967295L)));
                int i10 = i8 - ((int) (Q6 >> 32));
                if (i10 < 0) {
                    i10 = 0;
                }
                int i11 = i9 - ((int) (4294967295L & Q6));
                int i12 = i11 >= 0 ? i11 : 0;
                if (i6 != 0 || i7 != 0 || i10 != 0 || i12 != 0) {
                    return p5.a.n(i6, i7, i10, i12);
                }
            }
        }
        return p5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        int[] iArr = this.f11874x;
        getLocationInWindow(iArr);
        int i6 = iArr[0];
        region.op(i6, iArr[1], getWidth() + i6, getHeight() + iArr[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final InterfaceC0961c getDensity() {
        return this.f11863m;
    }

    public final View getInteropView() {
        return this.f11855e;
    }

    public final J getLayoutNode() {
        return this.f11853C;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.f11855e.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0846u getLifecycleOwner() {
        return this.f11865o;
    }

    public final InterfaceC1041r getModifier() {
        return this.f11861k;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        this.f11851A.getClass();
        return 0;
    }

    public final l4.c getOnDensityChanged$ui() {
        return this.f11864n;
    }

    public final l4.c getOnModifierChanged$ui() {
        return this.f11862l;
    }

    public final l4.c getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.f11873w;
    }

    public final InterfaceC1193a getRelease() {
        return this.f11860j;
    }

    public final InterfaceC1193a getReset() {
        return this.f11859i;
    }

    public final U1.e getSavedStateRegistryOwner() {
        return this.f11866p;
    }

    public final InterfaceC1193a getUpdate() {
        return this.f11857g;
    }

    public final View getView() {
        return this.f11855e;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        if (!this.f11852B) {
            this.f11853C.C();
            return null;
        }
        this.f11855e.postOnAnimation(new I.c(3, this.f11872v));
        return null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f11855e.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f11871u.b();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        if (!this.f11852B) {
            this.f11853C.C();
        } else {
            this.f11855e.postOnAnimation(new I.c(3, this.f11872v));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().a.b(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        this.f11855e.layout(0, 0, i8 - i6, i9 - i7);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        View view = this.f11855e;
        if (view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i6), View.MeasureSpec.getSize(i7));
            return;
        }
        if (view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        view.measure(i6, i7);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
        this.f11875y = i6;
        this.f11876z = i7;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f6, float f7, boolean z5) {
        if (!this.f11855e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1888A.y(this.f11854c.c(), null, new e(z5, this, Y4.d.g(f6 * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f6, float f7) {
        if (!this.f11855e.isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC1888A.y(this.f11854c.c(), null, new f(this, Y4.d.g(f6 * (-1.0f), f7 * (-1.0f)), null), 3);
        return false;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i6) {
        super.onWindowVisibilityChanged(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        l4.c cVar = this.f11870t;
        if (cVar == null) {
            return true;
        }
        cVar.f(rect != null ? y.D(rect) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
        l4.c cVar = this.f11873w;
        if (cVar != null) {
            cVar.f(Boolean.valueOf(z5));
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    public final void setDensity(InterfaceC0961c interfaceC0961c) {
        if (interfaceC0961c != this.f11863m) {
            this.f11863m = interfaceC0961c;
            l4.c cVar = this.f11864n;
            if (cVar != null) {
                cVar.f(interfaceC0961c);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0846u interfaceC0846u) {
        if (interfaceC0846u != this.f11865o) {
            this.f11865o = interfaceC0846u;
            O.k(this, interfaceC0846u);
        }
    }

    public final void setModifier(InterfaceC1041r interfaceC1041r) {
        if (interfaceC1041r != this.f11861k) {
            this.f11861k = interfaceC1041r;
            l4.c cVar = this.f11862l;
            if (cVar != null) {
                cVar.f(interfaceC1041r);
            }
        }
    }

    public final void setOnDensityChanged$ui(l4.c cVar) {
        this.f11864n = cVar;
    }

    public final void setOnModifierChanged$ui(l4.c cVar) {
        this.f11862l = cVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(l4.c cVar) {
        this.f11873w = cVar;
    }

    public final void setRelease(InterfaceC1193a interfaceC1193a) {
        this.f11860j = interfaceC1193a;
    }

    public final void setReset(InterfaceC1193a interfaceC1193a) {
        this.f11859i = interfaceC1193a;
    }

    public final void setSavedStateRegistryOwner(U1.e eVar) {
        if (eVar != this.f11866p) {
            this.f11866p = eVar;
            setTag(R.id.view_tree_saved_state_registry_owner, eVar);
        }
    }

    public final void setUpdate(InterfaceC1193a interfaceC1193a) {
        this.f11857g = interfaceC1193a;
        this.f11858h = true;
        this.f11871u.b();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // H0.s0
    public final boolean u() {
        return isAttachedToWindow();
    }
}
