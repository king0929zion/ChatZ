package i1;

import F0.InterfaceC0134w;
import I0.AbstractC0171a;
import I0.Y0;
import T.AbstractC0633u;
import T.C0607g0;
import T.C0626q;
import T.C0627q0;
import T.E;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.O;
import b.AbstractC0863g;
import c.C0914b;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import f0.C1001x;
import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: i1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1105y extends AbstractC0171a {

    /* renamed from: A, reason: collision with root package name */
    public final C1001x f12031A;

    /* renamed from: B, reason: collision with root package name */
    public b.x f12032B;

    /* renamed from: C, reason: collision with root package name */
    public final C0607g0 f12033C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f12034D;

    /* renamed from: E, reason: collision with root package name */
    public final int[] f12035E;

    /* renamed from: l, reason: collision with root package name */
    public InterfaceC1193a f12036l;

    /* renamed from: m, reason: collision with root package name */
    public C1079C f12037m;

    /* renamed from: n, reason: collision with root package name */
    public String f12038n;

    /* renamed from: o, reason: collision with root package name */
    public final View f12039o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12040p;

    /* renamed from: q, reason: collision with root package name */
    public final C1077A f12041q;

    /* renamed from: r, reason: collision with root package name */
    public final WindowManager f12042r;

    /* renamed from: s, reason: collision with root package name */
    public final WindowManager.LayoutParams f12043s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC1078B f12044t;

    /* renamed from: u, reason: collision with root package name */
    public e1.m f12045u;

    /* renamed from: v, reason: collision with root package name */
    public final C0607g0 f12046v;

    /* renamed from: w, reason: collision with root package name */
    public final C0607g0 f12047w;

    /* renamed from: x, reason: collision with root package name */
    public e1.k f12048x;

    /* renamed from: y, reason: collision with root package name */
    public final E f12049y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f12050z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [i1.A] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public C1105y(InterfaceC1193a interfaceC1193a, C1079C c1079c, String str, View view, InterfaceC0961c interfaceC0961c, InterfaceC1078B interfaceC1078B, UUID uuid, boolean z5) {
        super(view.getContext());
        ?? obj = Build.VERSION.SDK_INT >= 29 ? new Object() : new Object();
        this.f12036l = interfaceC1193a;
        this.f12037m = c1079c;
        this.f12038n = str;
        this.f12039o = view;
        this.f12040p = z5;
        this.f12041q = obj;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC1276k.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f12042r = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C1079C c1079c2 = this.f12037m;
        boolean b5 = AbstractC1094n.b(view);
        boolean z6 = c1079c2.f11955b;
        int i6 = c1079c2.a;
        if (z6 && b5) {
            i6 |= 8192;
        } else if (z6 && !b5) {
            i6 &= -8193;
        }
        layoutParams.flags = i6;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f12043s = layoutParams;
        this.f12044t = interfaceC1078B;
        this.f12045u = e1.m.f11576c;
        this.f12046v = T.r.A(null);
        this.f12047w = T.r.A(null);
        this.f12049y = T.r.s(new A0.b(this, 16));
        this.f12050z = new Rect();
        this.f12031A = new C1001x(new C1091k(this, 2));
        setId(android.R.id.content);
        O.k(this, O.e(view));
        setTag(R.id.view_tree_view_model_store_owner, O.f(view));
        setTag(R.id.view_tree_saved_state_registry_owner, s4.j.t(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC0961c.e0((float) 8));
        setOutlineProvider(new Y0(3));
        this.f12033C = T.r.A(AbstractC1100t.a);
        this.f12035E = new int[2];
    }

    private final l4.e getContent() {
        return (l4.e) this.f12033C.getValue();
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0134w getParentLayoutCoordinates() {
        return (InterfaceC0134w) this.f12047w.getValue();
    }

    private final e1.k getVisibleDisplayBounds() {
        this.f12041q.getClass();
        View view = this.f12039o;
        Rect rect = this.f12050z;
        view.getWindowVisibleDisplayFrame(rect);
        return new e1.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(l4.e eVar) {
        this.f12033C.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(InterfaceC0134w interfaceC0134w) {
        this.f12047w.setValue(interfaceC0134w);
    }

    @Override // I0.AbstractC0171a
    public final void b(int i6, C0626q c0626q) {
        c0626q.d0(-857613600);
        int i7 = (c0626q.h(this) ? 4 : 2) | i6;
        if (c0626q.S(i7 & 1, (i7 & 3) != 2)) {
            getContent().m(c0626q, 0);
        } else {
            c0626q.V();
        }
        C0627q0 t5 = c0626q.t();
        if (t5 != null) {
            t5.f8193d = new F0.B(this, i6, 8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f12037m.f11956c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC1193a interfaceC1193a = this.f12036l;
                if (interfaceC1193a != null) {
                    interfaceC1193a.b();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // I0.AbstractC0171a
    public final void g(boolean z5, int i6, int i7, int i8, int i9) {
        super.g(z5, i6, i7, i8, i9);
        this.f12037m.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f12043s;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f12041q.getClass();
        this.f12042r.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f12049y.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.f12043s;
    }

    public final e1.m getParentLayoutDirection() {
        return this.f12045u;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final e1.l m14getPopupContentSizebOM6tXw() {
        return (e1.l) this.f12046v.getValue();
    }

    public final InterfaceC1078B getPositionProvider() {
        return this.f12044t;
    }

    @Override // I0.AbstractC0171a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f12034D;
    }

    public AbstractC0171a getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.f12038n;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // I0.AbstractC0171a
    public final void h(int i6, int i7) {
        this.f12037m.getClass();
        e1.k visibleDisplayBounds = getVisibleDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), Integer.MIN_VALUE));
    }

    public final void k(AbstractC0633u abstractC0633u, l4.e eVar) {
        setParentCompositionContext(abstractC0633u);
        setContent(eVar);
        this.f12034D = true;
    }

    public final void l(InterfaceC1193a interfaceC1193a, C1079C c1079c, String str, e1.m mVar) {
        int i6;
        this.f12036l = interfaceC1193a;
        this.f12038n = str;
        if (!AbstractC1276k.b(this.f12037m, c1079c)) {
            c1079c.getClass();
            this.f12037m = c1079c;
            boolean b5 = AbstractC1094n.b(this.f12039o);
            boolean z5 = c1079c.f11955b;
            int i7 = c1079c.a;
            if (z5 && b5) {
                i7 |= 8192;
            } else if (z5 && !b5) {
                i7 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f12043s;
            layoutParams.flags = i7;
            this.f12041q.getClass();
            this.f12042r.updateViewLayout(this, layoutParams);
        }
        int ordinal = mVar.ordinal();
        if (ordinal != 0) {
            i6 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i6 = 0;
        }
        super.setLayoutDirection(i6);
    }

    public final void m() {
        InterfaceC0134w parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.j()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long m3 = parentLayoutCoordinates.m();
            long r5 = parentLayoutCoordinates.r(0L);
            e1.k E5 = h5.e.E((Math.round(Float.intBitsToFloat((int) (r5 >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (r5 & 4294967295L)))), m3);
            if (E5.equals(this.f12048x)) {
                return;
            }
            this.f12048x = E5;
            o();
        }
    }

    public final void n(InterfaceC0134w interfaceC0134w) {
        setParentLayoutCoordinates(interfaceC0134w);
        m();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, m4.v] */
    public final void o() {
        e1.l m14getPopupContentSizebOM6tXw;
        e1.k kVar = this.f12048x;
        if (kVar == null || (m14getPopupContentSizebOM6tXw = m14getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j3 = m14getPopupContentSizebOM6tXw.a;
        e1.k visibleDisplayBounds = getVisibleDisplayBounds();
        long b5 = (visibleDisplayBounds.b() & 4294967295L) | (visibleDisplayBounds.d() << 32);
        ?? obj = new Object();
        obj.f12972c = 0L;
        this.f12031A.d(this, C1084d.f11978k, new C1104x(obj, this, kVar, b5, j3));
        int[] iArr = new int[2];
        this.f12039o.getLocationOnScreen(iArr);
        boolean z5 = this.f12040p;
        WindowManager.LayoutParams layoutParams = this.f12043s;
        if (z5) {
            long j4 = obj.f12972c;
            layoutParams.x = (int) (j4 >> 32);
            layoutParams.y = (int) (j4 & 4294967295L);
        } else {
            long j5 = obj.f12972c;
            layoutParams.x = ((int) (j5 >> 32)) - iArr[0];
            layoutParams.y = ((int) (j5 & 4294967295L)) - iArr[1];
        }
        boolean z6 = this.f12037m.f11958e;
        C1077A c1077a = this.f12041q;
        if (z6) {
            c1077a.a(this, (int) (b5 >> 32), (int) (b5 & 4294967295L));
        }
        c1077a.getClass();
        this.f12042r.updateViewLayout(this, layoutParams);
    }

    @Override // I0.AbstractC0171a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12031A.e();
        if (!this.f12037m.f11956c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f12032B == null) {
            this.f12032B = new b.x(1, this.f12036l);
        }
        AbstractC0863g.f(this, this.f12032B);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1001x c1001x = this.f12031A;
        C0914b c0914b = c1001x.f11744h;
        if (c0914b != null) {
            c0914b.b();
        }
        c1001x.a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC0863g.g(this, this.f12032B);
        }
        this.f12032B = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f12037m.f11957d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < S.l.f7374V || motionEvent.getX() >= getWidth() || motionEvent.getY() < S.l.f7374V || motionEvent.getY() >= getHeight())) {
            InterfaceC1193a interfaceC1193a = this.f12036l;
            if (interfaceC1193a != null) {
                interfaceC1193a.b();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            InterfaceC1193a interfaceC1193a2 = this.f12036l;
            if (interfaceC1193a2 != null) {
                interfaceC1193a2.b();
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i6) {
    }

    public final void setParentLayoutDirection(e1.m mVar) {
        this.f12045u = mVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m15setPopupContentSizefhxjrPA(e1.l lVar) {
        this.f12046v.setValue(lVar);
    }

    public final void setPositionProvider(InterfaceC1078B interfaceC1078B) {
        this.f12044t = interfaceC1078B;
    }

    public final void setTestTag(String str) {
        this.f12038n = str;
    }
}
