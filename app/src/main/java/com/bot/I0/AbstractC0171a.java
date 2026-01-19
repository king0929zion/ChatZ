package I0;

import N1.C0290l;
import T.AbstractC0633u;
import T.C0602e;
import T.C0626q;
import T.C0642y0;
import T.EnumC0630s0;
import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.InterfaceC0846u;
import b0.C0873f;
import b4.C0911i;
import b4.InterfaceC0910h;
import com.tencent.mmkv.R;
import h0.C1026c;
import h0.InterfaceC1042s;
import java.lang.ref.WeakReference;
import x4.AbstractC1888A;
import x4.C1911Y;
import y4.AbstractC1999e;
import y4.C1998d;

/* renamed from: I0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0171a implements ViewGroup,   {

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2271c;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f2272e;

    /* renamed from: f, reason: collision with root package name */
    public q1 f2273f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0633u f2274g;

    /* renamed from: h, reason: collision with root package name */
    public U0 f2275h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2276i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2277j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2278k;

    public AbstractC0171a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        V0 v02 = new V0(this, 0);
        addOnAttachStateChangeListener(v02);
        F0.F f6 = new F0.F(1);
        io.ktor.utils.io.u.k(this).a.add(f6);
        this.f2275h = new U0(this, v02, f6, 0);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(AbstractC0633u abstractC0633u) {
        if (this.f2274g != abstractC0633u) {
            this.f2274g = abstractC0633u;
            if (abstractC0633u != null) {
                this.f2271c = null;
            }
            q1 q1Var = this.f2273f;
            if (q1Var != null) {
                q1Var.a();
                this.f2273f = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f2272e != iBinder) {
            this.f2272e = iBinder;
            this.f2271c = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i6, layoutParams);
    }

    public abstract void b(int i6, C0626q c0626q);

    public final void c() {
        if (this.f2277j) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.f2274g == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        f();
    }

    public final void e() {
        q1 q1Var = this.f2273f;
        if (q1Var != null) {
            q1Var.a();
        }
        this.f2273f = null;
        requestLayout();
    }

    public final void f() {
        if (this.f2273f == null) {
            try {
                this.f2277j = true;
                this.f2273f = s1.a(this, i(), new C0873f(new F0.B(this, 1), true, -656146368));
            } finally {
                this.f2277j = false;
            }
        }
    }

    public void g(boolean z5, int i6, int i7, int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i8 - i6) - getPaddingRight(), (i9 - i7) - getPaddingBottom());
        }
    }

    /* renamed from: getAutoClearFocusBehavior-4UtRPd4, reason: not valid java name */
    public final int m0getAutoClearFocusBehavior4UtRPd4() {
        Object tag = getTag(R.id.auto_clear_focus_behavior_tag);
        C0184g0 c0184g0 = tag instanceof C0184g0 ? (C0184g0) tag : null;
        if (c0184g0 != null) {
            return c0184g0.a;
        }
        return 1;
    }

    public final boolean getHasComposition() {
        return this.f2273f != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f2276i;
    }

    public void h(int i6, int i7) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i6, i7);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i6) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i6)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i7)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [m4.w, java.lang.Object] */
    public final AbstractC0633u i() {
        C0642y0 c0642y0;
        InterfaceC0910h interfaceC0910h;
        Z z5;
        int i6;
        AbstractC0633u abstractC0633u = this.f2274g;
        if (abstractC0633u == null) {
            abstractC0633u = m1.b(this);
            if (abstractC0633u == null) {
                Object parent = getParent();
                while (abstractC0633u == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC0633u = m1.b(view);
                    parent = io.ktor.utils.io.u.j(view);
                }
            }
            if (abstractC0633u != null) {
                AbstractC0633u abstractC0633u2 = (!(abstractC0633u instanceof C0642y0) || ((EnumC0630s0) ((C0642y0) abstractC0633u).f8290u.getValue()).compareTo(EnumC0630s0.f8206e) > 0) ? abstractC0633u : null;
                if (abstractC0633u2 != null) {
                    this.f2271c = new WeakReference(abstractC0633u2);
                }
            } else {
                abstractC0633u = null;
            }
            if (abstractC0633u == null) {
                WeakReference weakReference = this.f2271c;
                if (weakReference == null || (abstractC0633u = (AbstractC0633u) weakReference.get()) == null || ((abstractC0633u instanceof C0642y0) && ((EnumC0630s0) ((C0642y0) abstractC0633u).f8290u.getValue()).compareTo(EnumC0630s0.f8206e) <= 0)) {
                    abstractC0633u = null;
                }
                if (abstractC0633u == null) {
                    if (!isAttachedToWindow()) {
                        E0.a.b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC0633u b5 = m1.b(view2);
                    if (b5 == null) {
                        ((c1) e1.a.get()).getClass();
                        C0911i c0911i = C0911i.f11057c;
                        X3.n nVar = X.f2253p;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC0910h = (InterfaceC0910h) X.f2253p.getValue();
                        } else {
                            interfaceC0910h = (InterfaceC0910h) X.f2254q.get();
                            if (interfaceC0910h == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC0910h Y5 = interfaceC0910h.Y(c0911i);
                        Z z6 = (Z) Y5.r(C0602e.f8079f);
                        if (z6 != null) {
                            Z z7 = new Z(z6);
                            C0290l c0290l = (C0290l) z7.f2269f;
                            synchronized (c0290l.f3755b) {
                                c0290l.a = false;
                                z5 = z7;
                            }
                        } else {
                            z5 = 0;
                        }
                        Object obj = new Object();
                        InterfaceC0910h interfaceC0910h2 = (InterfaceC1042s) Y5.r(C1026c.f11801s);
                        if (interfaceC0910h2 == null) {
                            interfaceC0910h2 = new J0();
                            obj.f12973c = interfaceC0910h2;
                        }
                        if (z5 != 0) {
                            c0911i = z5;
                        }
                        InterfaceC0910h Y6 = Y5.Y(c0911i).Y(interfaceC0910h2);
                        c0642y0 = new C0642y0(Y6);
                        synchronized (c0642y0.f8272c) {
                            i6 = 1;
                            c0642y0.f8289t = true;
                        }
                        C4.c c6 = AbstractC1888A.c(Y6);
                        InterfaceC0846u e6 = androidx.lifecycle.O.e(view2);
                        androidx.lifecycle.O g3 = e6 != null ? e6.g() : null;
                        if (g3 == null) {
                            E0.a.c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new RuntimeException();
                        }
                        view2.addOnAttachStateChangeListener(new f1(view2, c0642y0));
                        g3.a(new j1(c6, z5, c0642y0, obj, view2));
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, c0642y0);
                        C1911Y c1911y = C1911Y.f15677c;
                        Handler handler = view2.getHandler();
                        int i7 = AbstractC1999e.a;
                        view2.addOnAttachStateChangeListener(new V0(AbstractC1888A.y(c1911y, new C1998d(handler, "windowRecomposer cleanup", false).f16023i, new d1(c0642y0, view2, null), 2), i6));
                    } else {
                        if (!(b5 instanceof C0642y0)) {
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        c0642y0 = (C0642y0) b5;
                    }
                    C0642y0 c0642y02 = ((EnumC0630s0) c0642y0.f8290u.getValue()).compareTo(EnumC0630s0.f8206e) > 0 ? c0642y0 : null;
                    if (c0642y02 != null) {
                        this.f2271c = new WeakReference(c0642y02);
                    }
                    return c0642y0;
                }
            }
        }
        return abstractC0633u;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f2278k || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        g(z5, i6, i7, i8, i9);
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        f();
        h(i6, i7);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i6);
        }
    }

    /* renamed from: setAutoClearFocusBehavior-17tfJxM, reason: not valid java name */
    public final void m1setAutoClearFocusBehavior17tfJxM(int i6) {
        setTag(R.id.auto_clear_focus_behavior_tag, new C0184g0(i6));
    }

    public final void setParentCompositionContext(AbstractC0633u abstractC0633u) {
        setParentContext(abstractC0633u);
    }

    public final void setShowLayoutBounds(boolean z5) {
        this.f2276i = z5;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((ViewTreeObserverOnGlobalLayoutListenerC0216x) ((H0.r0) childAt)).setShowLayoutBounds(z5);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z5) {
        super.setTransitionGroup(z5);
        this.f2278k = true;
    }

    public final void setViewCompositionStrategy(W0 w02) {
        U0 u02 = this.f2275h;
        if (u02 != null) {
            u02.b();
        }
        ((K) w02).getClass();
        V0 v02 = new V0(this, 0);
        addOnAttachStateChangeListener(v02);
        F0.F f6 = new F0.F(1);
        io.ktor.utils.io.u.k(this).a.add(f6);
        this.f2275h = new U0(this, v02, f6, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6) {
        c();
        super.addView(view, i6);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z5) {
        c();
        return super.addViewInLayout(view, i6, layoutParams, z5);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, int i7) {
        c();
        super.addView(view, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i6, layoutParams);
    }
}
