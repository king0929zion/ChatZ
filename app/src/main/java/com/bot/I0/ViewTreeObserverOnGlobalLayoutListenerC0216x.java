package I0;

import B0.C0025a;
import B0.C0028d;
import B0.C0029e;
import B0.C0036l;
import B0.InterfaceC0034j;
import B0.InterfaceC0045v;
import B0.InterfaceC0046w;
import F0.AbstractC0137z;
import F0.RunnableC0129q;
import H0.AbstractC0156k;
import H0.AbstractC0157l;
import H0.C0139a0;
import H0.C0140b;
import H0.C0149f0;
import H0.C0153h0;
import H0.C0158m;
import H0.C0163s;
import H0.EnumC0167w;
import S0.C0545g;
import T.C0602e;
import T.C0607g0;
import T.InterfaceC0604f;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.lifecycle.InterfaceC0832f;
import androidx.lifecycle.InterfaceC0846u;
import b4.InterfaceC0910h;
import c.C0914b;
import c0.C0918a;
import c0.C0920c;
import c0.InterfaceC0921d;
import com.tencent.mmkv.R;
import com.vladsch.flexmark.parser.PegdownExtensions;
import com.vladsch.flexmark.util.format.TableCell;
import com.vladsch.flexmark.util.sequence.SequenceUtils;
import e1.C0959a;
import e1.InterfaceC0961c;
import f0.AbstractC0992o;
import f0.C0987j;
import f0.C1000w;
import f0.C1001x;
import g1.AbstractC1016a;
import h0.AbstractC1025b;
import h0.AbstractC1040q;
import h0.C1043t;
import i0.AbstractC1071j;
import i0.C1064c;
import i0.C1070i;
import i0.C1072k;
import i0.InterfaceC1068g;
import i4.AbstractC1117a;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import k.AbstractC1168o;
import k.C1147A;
import k.C1148B;
import k.C1173u;
import l4.InterfaceC1193a;
import m0.AbstractC1249d;
import m0.EnumC1245A;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import m4.C1266a;
import m4.C1270e;
import n0.C1354c;
import o0.C1382D;
import o0.C1391b;
import o0.C1394e;
import o4.AbstractC1410a;
import t1.AbstractC1713p;
import w0.InterfaceC1830a;
import x0.C1861a;
import x0.C1863c;
import x0.InterfaceC1862b;
import x4.AbstractC1888A;
import y0.C1986a;

/* renamed from: I0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0216x extends ViewGroup implements H0.r0, H0.y0, InterfaceC0034j, InterfaceC0832f, H0.p0, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, m0.l {

    /* renamed from: N0, reason: collision with root package name */
    public static Class f2401N0;

    /* renamed from: O0, reason: collision with root package name */
    public static Method f2402O0;

    /* renamed from: P0, reason: collision with root package name */
    public static Method f2403P0;

    /* renamed from: Q0, reason: collision with root package name */
    public static final k.I f2404Q0 = new k.I();

    /* renamed from: R0, reason: collision with root package name */
    public static RunnableC0193l f2405R0;

    /* renamed from: S0, reason: collision with root package name */
    public static Method f2406S0;

    /* renamed from: A, reason: collision with root package name */
    public final P0.r f2407A;

    /* renamed from: A0, reason: collision with root package name */
    public final k.I f2408A0;

    /* renamed from: B, reason: collision with root package name */
    public final D f2409B;

    /* renamed from: B0, reason: collision with root package name */
    public float f2410B0;

    /* renamed from: C, reason: collision with root package name */
    public j0.d f2411C;

    /* renamed from: C0, reason: collision with root package name */
    public float f2412C0;

    /* renamed from: D, reason: collision with root package name */
    public final C0183g f2413D;
    public final RunnableC0210u D0;

    /* renamed from: E, reason: collision with root package name */
    public final C1394e f2414E;

    /* renamed from: E0, reason: collision with root package name */
    public final RunnableC0191k f2415E0;

    /* renamed from: F, reason: collision with root package name */
    public final C1072k f2416F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f2417F0;

    /* renamed from: G, reason: collision with root package name */
    public final k.I f2418G;

    /* renamed from: G0, reason: collision with root package name */
    public final B0 f2419G0;

    /* renamed from: H, reason: collision with root package name */
    public k.I f2420H;

    /* renamed from: H0, reason: collision with root package name */
    public final r f2421H0;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2422I;

    /* renamed from: I0, reason: collision with root package name */
    public final InterfaceC0186h0 f2423I0;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2424J;
    public boolean J0;

    /* renamed from: K, reason: collision with root package name */
    public final C0036l f2425K;
    public final A3.c K0;

    /* renamed from: L, reason: collision with root package name */
    public final B0.B f2426L;

    /* renamed from: L0, reason: collision with root package name */
    public View f2427L0;

    /* renamed from: M, reason: collision with root package name */
    public final C0607g0 f2428M;

    /* renamed from: M0, reason: collision with root package name */
    public final C0206s f2429M0;

    /* renamed from: N, reason: collision with root package name */
    public final B0.H f2430N;

    /* renamed from: O, reason: collision with root package name */
    public final C1064c f2431O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f2432P;

    /* renamed from: Q, reason: collision with root package name */
    public final C0187i f2433Q;

    /* renamed from: R, reason: collision with root package name */
    public final C0185h f2434R;

    /* renamed from: S, reason: collision with root package name */
    public final H0.t0 f2435S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f2436T;

    /* renamed from: U, reason: collision with root package name */
    public C0176c0 f2437U;

    /* renamed from: V, reason: collision with root package name */
    public C0959a f2438V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f2439W;

    /* renamed from: a0, reason: collision with root package name */
    public final H0.Y f2440a0;

    /* renamed from: b0, reason: collision with root package name */
    public long f2441b0;

    /* renamed from: c, reason: collision with root package name */
    public long f2442c;

    /* renamed from: c0, reason: collision with root package name */
    public final int[] f2443c0;

    /* renamed from: d0, reason: collision with root package name */
    public final float[] f2444d0;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2445e;

    /* renamed from: e0, reason: collision with root package name */
    public final float[] f2446e0;

    /* renamed from: f, reason: collision with root package name */
    public C1986a f2447f;

    /* renamed from: f0, reason: collision with root package name */
    public final float[] f2448f0;

    /* renamed from: g, reason: collision with root package name */
    public final H0.L f2449g;

    /* renamed from: g0, reason: collision with root package name */
    public long f2450g0;

    /* renamed from: h, reason: collision with root package name */
    public G0 f2451h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f2452h0;

    /* renamed from: i, reason: collision with root package name */
    public H0 f2453i;

    /* renamed from: i0, reason: collision with root package name */
    public long f2454i0;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0921d f2455j;

    /* renamed from: j0, reason: collision with root package name */
    public final C0607g0 f2456j0;

    /* renamed from: k, reason: collision with root package name */
    public final Y3.j f2457k;

    /* renamed from: k0, reason: collision with root package name */
    public final T.E f2458k0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0191k f2459l;

    /* renamed from: l0, reason: collision with root package name */
    public l4.c f2460l0;

    /* renamed from: m, reason: collision with root package name */
    public final C0607g0 f2461m;

    /* renamed from: m0, reason: collision with root package name */
    public final X0.y f2462m0;

    /* renamed from: n, reason: collision with root package name */
    public final View f2463n;

    /* renamed from: n0, reason: collision with root package name */
    public final X0.w f2464n0;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2465o;

    /* renamed from: o0, reason: collision with root package name */
    public final AtomicReference f2466o0;

    /* renamed from: p, reason: collision with root package name */
    public final m0.q f2467p;

    /* renamed from: p0, reason: collision with root package name */
    public final C0207s0 f2468p0;

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC0910h f2469q;

    /* renamed from: q0, reason: collision with root package name */
    public final C0 f2470q0;

    /* renamed from: r, reason: collision with root package name */
    public final k0.b f2471r;

    /* renamed from: r0, reason: collision with root package name */
    public final C0607g0 f2472r0;

    /* renamed from: s, reason: collision with root package name */
    public final F0 f2473s;

    /* renamed from: s0, reason: collision with root package name */
    public final C0607g0 f2474s0;

    /* renamed from: t, reason: collision with root package name */
    public final o0.r f2475t;

    /* renamed from: t0, reason: collision with root package name */
    public final C0205r0 f2476t0;

    /* renamed from: u, reason: collision with root package name */
    public final C0174b0 f2477u;

    /* renamed from: u0, reason: collision with root package name */
    public final C1863c f2478u0;

    /* renamed from: v, reason: collision with root package name */
    public final RunnableC0129q f2479v;

    /* renamed from: v0, reason: collision with root package name */
    public final G0.b f2480v0;

    /* renamed from: w, reason: collision with root package name */
    public final H0.J f2481w;

    /* renamed from: w0, reason: collision with root package name */
    public final T f2482w0;

    /* renamed from: x, reason: collision with root package name */
    public final C1147A f2483x;

    /* renamed from: x0, reason: collision with root package name */
    public MotionEvent f2484x0;

    /* renamed from: y, reason: collision with root package name */
    public final Q0.b f2485y;

    /* renamed from: y0, reason: collision with root package name */
    public long f2486y0;

    /* renamed from: z, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f2487z;

    /* renamed from: z0, reason: collision with root package name */
    public final M.q f2488z0;

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, B0.B] */
    /* JADX WARN: Type inference failed for: r0v18, types: [B0.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [P0.e, h0.q] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, I0.C0] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Object, G0.b] */
    /* JADX WARN: Type inference failed for: r3v38, types: [java.lang.Object, I0.T] */
    public ViewTreeObserverOnGlobalLayoutListenerC0216x(Context context, InterfaceC0910h interfaceC0910h) {
        super(context);
        this.f2442c = 9205357640488583168L;
        this.f2445e = true;
        this.f2449g = new H0.L();
        this.f2455j = C0918a.f11098c;
        this.f2457k = new Y3.j();
        int i6 = 0;
        this.f2459l = new RunnableC0191k(this, i6);
        e1.e b5 = AbstractC1410a.b(context);
        C0602e c0602e = C0602e.f8081h;
        this.f2461m = new C0607g0(b5, c0602e);
        int i7 = Build.VERSION.SDK_INT;
        boolean z5 = i7 >= 35;
        this.f2465o = z5;
        ?? abstractC1040q = new AbstractC1040q();
        this.f2467p = new m0.q(this, this);
        this.f2469q = interfaceC0910h;
        this.f2471r = new k0.b();
        this.f2473s = new F0();
        this.f2475t = new o0.r();
        this.f2477u = new C0174b0(ViewConfiguration.get(context));
        this.f2479v = new RunnableC0129q();
        H0.J j3 = new H0.J(3);
        j3.e0(F0.p0.f1507b);
        j3.b0(getDensity());
        j3.g0(getViewConfiguration());
        j3.f0(new C0212v(this).c(((m0.q) getFocusOwner()).f12902e).c(m8getDragAndDropManager().f12594c));
        this.f2481w = j3;
        C1147A c1147a = AbstractC1168o.a;
        this.f2483x = new C1147A();
        m9getLayoutNodes();
        this.f2485y = new Q0.b();
        this.f2487z = this;
        this.f2407A = new P0.r(getRoot(), abstractC1040q, m9getLayoutNodes());
        D d6 = new D(this);
        this.f2409B = d6;
        this.f2411C = new j0.d(this, new I.o(0, this, K.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1, 0, 1));
        this.f2413D = new C0183g(context);
        this.f2414E = new C1394e(this);
        this.f2416F = new C1072k();
        this.f2418G = new k.I();
        this.f2425K = new C0036l();
        H0.J root = getRoot();
        ?? obj = new Object();
        obj.f378b = root;
        obj.f379c = new C0029e(root.f1721J.f1916c);
        obj.f380d = new A3.c(1, (byte) 0);
        obj.f381e = new C0163s();
        this.f2426L = obj;
        this.f2428M = T.r.A(new Configuration(context.getResources().getConfiguration()));
        C1072k autofillTree = getAutofillTree();
        ?? obj2 = new Object();
        obj2.f391c = this;
        obj2.f392e = autofillTree;
        AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        obj2.f393f = autofillManager;
        int i8 = 1;
        setImportantForAutofill(1);
        AutofillId autofillId = getAutofillId();
        if (autofillId == null) {
            throw B3.e.f("Required value was null.");
        }
        obj2.f394g = autofillId;
        this.f2430N = obj2;
        AutofillManager autofillManager2 = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager2 == null) {
            throw B3.e.f("Autofill service could not be located.");
        }
        this.f2431O = new C1064c(new C0987j(autofillManager2, i8), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f2433Q = new C0187i(context);
        this.f2434R = new C0185h(m7getClipboardManager());
        this.f2435S = new H0.t0(new C0203q(this, 1));
        this.f2440a0 = new H0.Y(getRoot());
        long j4 = TableCell.NOT_TRACKED;
        this.f2441b0 = (j4 & 4294967295L) | (j4 << 32);
        this.f2443c0 = new int[]{0, 0};
        float[] a = C1382D.a();
        this.f2444d0 = a;
        this.f2446e0 = C1382D.a();
        this.f2448f0 = C1382D.a();
        this.f2450g0 = -1L;
        this.f2454i0 = 9187343241974906880L;
        this.f2456j0 = T.r.A(null);
        this.f2458k0 = T.r.s(new r(this, 2));
        X0.y yVar = new X0.y(getView(), this);
        this.f2462m0 = yVar;
        this.f2464n0 = new X0.w(yVar);
        this.f2466o0 = new AtomicReference(null);
        this.f2468p0 = new C0207s0(getTextInputService());
        this.f2470q0 = new Object();
        this.f2472r0 = new C0607g0(Y4.d.y(context), c0602e);
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = m0.j.a;
        e1.m mVar = e1.m.f11576c;
        e1.m mVar2 = layoutDirection != 0 ? layoutDirection != 1 ? null : e1.m.f11577e : mVar;
        this.f2474s0 = T.r.A(mVar2 != null ? mVar2 : mVar);
        this.f2476t0 = new C0205r0(this, 1);
        this.f2478u0 = new C1863c(isInTouchMode() ? 1 : 2);
        ?? obj3 = new Object();
        new V.e(new C0140b[16]);
        new V.e(new Y4.l[16]);
        new V.e(new H0.J[16]);
        new V.e(new Y4.l[16]);
        this.f2480v0 = obj3;
        ?? obj4 = new Object();
        new F2.h(new A0.b(obj4, 6));
        this.f2482w0 = obj4;
        this.f2488z0 = new M.q(9);
        this.f2408A0 = new k.I();
        this.D0 = new RunnableC0210u(this, i6);
        int i9 = 1;
        this.f2415E0 = new RunnableC0191k(this, i9);
        this.f2419G0 = new B0(context, new C0203q(this, i6));
        this.f2421H0 = new r(this, i9);
        this.f2423I0 = i7 < 29 ? new C0188i0(a) : new C0190j0();
        addOnAttachStateChangeListener(this.f2411C);
        setWillNotDraw(false);
        setFocusable(true);
        J.a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AbstractC1713p.b(this, d6);
        setOnDragListener(m8getDragAndDropManager());
        getRoot().d(this);
        if (i7 >= 29) {
            F.a.a(this);
        }
        if (z5) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            this.f2463n = view;
            addView(view, -1);
        }
        this.K0 = i7 >= 31 ? new A3.c(15, (byte) 0) : null;
        this.f2429M0 = new C0206s(this);
    }

    public static final void b(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, int i6, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int d6;
        D d7 = viewTreeObserverOnGlobalLayoutListenerC0216x.f2409B;
        if (AbstractC1276k.b(str, d7.f2146H)) {
            int d8 = d7.f2144F.d(i6);
            if (d8 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, d8);
                return;
            }
            return;
        }
        if (!AbstractC1276k.b(str, d7.f2147I) || (d6 = d7.f2145G.d(i6)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, d6);
    }

    @X3.c
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m2getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @X3.c
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0197n get_viewTreeOwners() {
        return (C0197n) this.f2456j0.getValue();
    }

    public static void i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0216x) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0216x) childAt).A();
            } else if (childAt instanceof ViewGroup) {
                i((ViewGroup) childAt);
            }
        }
    }

    public static long k(int i6) {
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        if (mode == Integer.MIN_VALUE) {
            return (0 << 32) | size;
        }
        if (mode == 0) {
            return (0 << 32) | TableCell.NOT_TRACKED;
        }
        if (mode != 1073741824) {
            throw new IllegalStateException();
        }
        long j3 = size;
        return j3 | (j3 << 32);
    }

    public static View m(View view, int i6) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC1276k.b(declaredMethod.invoke(view, null), Integer.valueOf(i6))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View m3 = m(viewGroup.getChildAt(i7), i6);
                    if (m3 != null) {
                        return m3;
                    }
                }
            }
        }
        return null;
    }

    public static void p(H0.J j3) {
        j3.D();
        V.e z5 = j3.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            p((H0.J) objArr[i7]);
        }
    }

    public static boolean r(MotionEvent motionEvent) {
        boolean z5 = (Float.floatToRawIntBits(motionEvent.getX()) & TableCell.NOT_TRACKED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & TableCell.NOT_TRACKED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & TableCell.NOT_TRACKED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & TableCell.NOT_TRACKED) >= 2139095040;
        if (!z5) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i6 = 1; i6 < pointerCount; i6++) {
                z5 = (Float.floatToRawIntBits(motionEvent.getX(i6)) & TableCell.NOT_TRACKED) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i6)) & TableCell.NOT_TRACKED) >= 2139095040 || (Build.VERSION.SDK_INT >= 29 && !K0.a.a(motionEvent, i6));
                if (z5) {
                    break;
                }
            }
        }
        return z5;
    }

    private void setDensity(InterfaceC0961c interfaceC0961c) {
        this.f2461m.setValue(interfaceC0961c);
    }

    private void setFontFamilyResolver(W0.d dVar) {
        this.f2472r0.setValue(dVar);
    }

    private void setLayoutDirection(e1.m mVar) {
        this.f2474s0.setValue(mVar);
    }

    private final void set_viewTreeOwners(C0197n c0197n) {
        this.f2456j0.setValue(c0197n);
    }

    public final void A() {
        if (this.f2432P) {
            C1001x c1001x = getSnapshotObserver().a;
            synchronized (c1001x.f11743g) {
                try {
                    V.e eVar = c1001x.f11742f;
                    int i6 = eVar.f8761f;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        C1000w c1000w = (C1000w) eVar.f8759c[i8];
                        c1000w.d();
                        if (!c1000w.f11730f.j()) {
                            i7++;
                        } else if (i7 > 0) {
                            Object[] objArr = eVar.f8759c;
                            objArr[i8 - i7] = objArr[i8];
                        }
                    }
                    int i9 = i6 - i7;
                    Arrays.fill(eVar.f8759c, i9, i6, (Object) null);
                    eVar.f8761f = i9;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f2432P = false;
        }
        C0176c0 c0176c0 = this.f2437U;
        if (c0176c0 != null) {
            i(c0176c0);
        }
        C1064c c1064c = this.f2431O;
        if (c1064c != null) {
            C1148B c1148b = c1064c.f11947k;
            if (c1148b.f12439d == 0 && c1064c.f11948l) {
                ((AutofillManager) c1064c.f11940c.f11690e).commit();
                c1064c.f11948l = false;
            }
            if (c1148b.f12439d != 0) {
                c1064c.f11948l = true;
            }
        }
        while (this.f2408A0.i() && this.f2408A0.f(0) != null) {
            int i10 = this.f2408A0.f12466b;
            for (int i11 = 0; i11 < i10; i11++) {
                InterfaceC1193a interfaceC1193a = (InterfaceC1193a) this.f2408A0.f(i11);
                k.I i12 = this.f2408A0;
                if (i11 < 0 || i11 >= i12.f12466b) {
                    i12.n(i11);
                    throw null;
                }
                Object[] objArr2 = i12.a;
                Object obj = objArr2[i11];
                objArr2[i11] = null;
                if (interfaceC1193a != null) {
                    interfaceC1193a.b();
                }
            }
            this.f2408A0.l(0, i10);
        }
    }

    public final void B(H0.J j3) {
        D d6 = this.f2409B;
        d6.f2140B = true;
        if (d6.o()) {
            d6.p(j3);
        }
        j0.d dVar = this.f2411C;
        dVar.f12329j = true;
        if (dVar.g()) {
            dVar.f12330k.t(X3.y.a);
        }
    }

    public final void C(H0.J j3, boolean z5, boolean z6, boolean z7) {
        H0.J v5;
        H0.J v6;
        H0.Y y5 = this.f2440a0;
        if (!z5) {
            if (y5.p(j3, z6) && z7) {
                I(j3);
                return;
            }
            return;
        }
        C0158m c0158m = y5.f1843b;
        H0.J j4 = j3.f1741l;
        H0.N n3 = j3.f1722K;
        if (j4 == null) {
            E0.a.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int ordinal = n3.f1769d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new RuntimeException();
                }
                if (!n3.f1770e || z6) {
                    n3.f1770e = true;
                    n3.f1781p.f1885y = true;
                    if (j3.f1732U) {
                        return;
                    }
                    if ((AbstractC1276k.b(j3.J(), Boolean.TRUE) || H0.Y.h(j3)) && ((v5 = j3.v()) == null || !v5.f1722K.f1770e)) {
                        c0158m.c(j3, EnumC0167w.f2004c);
                    } else if ((j3.I() || H0.Y.i(j3)) && ((v6 = j3.v()) == null || !v6.q())) {
                        c0158m.c(j3, EnumC0167w.f2006f);
                    }
                    if (y5.f1845d || !z7) {
                        return;
                    }
                    I(j3);
                    return;
                }
                return;
            }
        }
        y5.f1849h.b(new H0.X(j3, true, z6));
    }

    public final void D(H0.J j3, boolean z5, boolean z6) {
        H0.N n3 = j3.f1722K;
        EnumC0167w enumC0167w = EnumC0167w.f2007g;
        H0.Y y5 = this.f2440a0;
        if (!z5) {
            y5.getClass();
            int ordinal = n3.f1769d.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new RuntimeException();
            }
            H0.J v5 = j3.v();
            boolean z7 = v5 == null || v5.I();
            if (!z6) {
                if (j3.q()) {
                    return;
                }
                if (j3.p() && j3.I() == z7 && j3.I() == n3.f1781p.f1884x) {
                    return;
                }
            }
            C0139a0 c0139a0 = n3.f1781p;
            c0139a0.f1886z = true;
            c0139a0.f1853A = true;
            if (!j3.f1732U && c0139a0.f1884x && z7) {
                if ((v5 == null || !v5.p()) && (v5 == null || !v5.q())) {
                    y5.f1843b.c(j3, enumC0167w);
                }
                if (y5.f1845d) {
                    return;
                }
                I(null);
                return;
            }
            return;
        }
        C0158m c0158m = y5.f1843b;
        int ordinal2 = n3.f1769d.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new RuntimeException();
                }
            }
        }
        if ((n3.f1770e || n3.f1771f) && !z6) {
            return;
        }
        n3.f1771f = true;
        n3.f1772g = true;
        C0139a0 c0139a02 = n3.f1781p;
        c0139a02.f1886z = true;
        c0139a02.f1853A = true;
        if (j3.f1732U) {
            return;
        }
        H0.J v6 = j3.v();
        if (AbstractC1276k.b(j3.J(), Boolean.TRUE) && ((v6 == null || !v6.f1722K.f1770e) && (v6 == null || !v6.f1722K.f1771f))) {
            c0158m.c(j3, EnumC0167w.f2005e);
        } else if (j3.I() && ((v6 == null || !v6.p()) && (v6 == null || !v6.q()))) {
            c0158m.c(j3, enumC0167w);
        }
        if (y5.f1845d) {
            return;
        }
        I(null);
    }

    public final void E() {
        D d6 = this.f2409B;
        d6.f2140B = true;
        if (d6.o() && !d6.f2151M) {
            d6.f2151M = true;
            d6.f2162m.post(d6.f2153O);
        }
        j0.d dVar = this.f2411C;
        dVar.f12329j = true;
        if (!dVar.g() || dVar.f12336q) {
            return;
        }
        dVar.f12336q = true;
        dVar.f12331l.post(dVar.f12337r);
    }

    public final void F() {
        if (this.f2452h0) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.f2450g0) {
            this.f2450g0 = currentAnimationTimeMillis;
            InterfaceC0186h0 interfaceC0186h0 = this.f2423I0;
            float[] fArr = this.f2446e0;
            interfaceC0186h0.a(this, fArr);
            K.l(fArr, this.f2448f0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f2443c0;
            view.getLocationOnScreen(iArr);
            float f6 = iArr[0];
            float f7 = iArr[1];
            view.getLocationInWindow(iArr);
            float f8 = iArr[0];
            float f9 = f7 - iArr[1];
            this.f2454i0 = (Float.floatToRawIntBits(f6 - f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L);
        }
    }

    public final void G(MotionEvent motionEvent) {
        this.f2450g0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC0186h0 interfaceC0186h0 = this.f2423I0;
        float[] fArr = this.f2446e0;
        interfaceC0186h0.a(this, fArr);
        K.l(fArr, this.f2448f0);
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        long b5 = C1382D.b((Float.floatToRawIntBits(x5) << 32) | (Float.floatToRawIntBits(y5) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (b5 >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (b5 & 4294967295L));
        this.f2454i0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    public final boolean H() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    public final void I(H0.J j3) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (j3 != null) {
            while (j3 != null && j3.r() == H0.H.f1705c) {
                if (!this.f2439W) {
                    H0.J v5 = j3.v();
                    if (v5 == null) {
                        break;
                    }
                    long j4 = v5.f1721J.f1916c.f1488g;
                    if (C0959a.f(j4) && C0959a.e(j4)) {
                        break;
                    }
                }
                j3 = j3.v();
            }
            if (j3 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final long J(long j3) {
        F();
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (this.f2454i0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L)) - Float.intBitsToFloat((int) (this.f2454i0 & 4294967295L));
        return C1382D.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f2448f0);
    }

    public final int K(MotionEvent motionEvent) {
        Object obj;
        if (this.J0) {
            this.J0 = false;
            int metaState = motionEvent.getMetaState();
            this.f2473s.getClass();
            b1.a.setValue(new B0.K(metaState));
        }
        C0036l c0036l = this.f2425K;
        M.q c6 = c0036l.c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        B0.B b5 = this.f2426L;
        if (c6 == null) {
            if (!b5.a) {
                C1173u c1173u = (C1173u) ((A3.c) b5.f380d).f119e;
                int i6 = c1173u.f12575g;
                Object[] objArr = c1173u.f12574f;
                for (int i7 = 0; i7 < i6; i7++) {
                    objArr[i7] = null;
                }
                c1173u.f12575g = 0;
                c1173u.f12572c = false;
                ((C0029e) b5.f379c).c();
            }
            return 0;
        }
        List list = (List) c6.f3179e;
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i8 = size - 1;
                obj = list.get(size);
                if (((B0.A) obj).f371e && (actionMasked == 0 || actionMasked == 5)) {
                    break;
                }
                if (i8 < 0) {
                    break;
                }
                size = i8;
            }
        }
        obj = null;
        B0.A a = (B0.A) obj;
        if (a != null) {
            this.f2442c = a.f370d;
        }
        int b6 = b5.b(c6, this, s(motionEvent));
        c6.f3180f = null;
        if ((actionMasked != 0 && actionMasked != 5) || (b6 & 1) != 0) {
            return b6;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        c0036l.f456c.delete(pointerId);
        c0036l.f455b.delete(pointerId);
        return b6;
    }

    public final void L(MotionEvent motionEvent, int i6, long j3, boolean z5) {
        int actionMasked = motionEvent.getActionMasked();
        int i7 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i7 = motionEvent.getActionIndex();
            }
        } else if (i6 != 9 && i6 != 10) {
            i7 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i7 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i8 = 0; i8 < pointerCount; i8++) {
            pointerPropertiesArr[i8] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerCoordsArr[i9] = new MotionEvent.PointerCoords();
        }
        int i10 = 0;
        while (i10 < pointerCount) {
            int i11 = ((i7 < 0 || i10 < i7) ? 0 : 1) + i10;
            motionEvent.getPointerProperties(i11, pointerPropertiesArr[i10]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i10];
            motionEvent.getPointerCoords(i11, pointerCoords);
            float f6 = pointerCoords.x;
            long v5 = v((Float.floatToRawIntBits(pointerCoords.y) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (v5 >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (v5 & 4294967295L));
            i10++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j3 : motionEvent.getDownTime(), j3, i6, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z5 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        M.q c6 = this.f2425K.c(obtain, this);
        AbstractC1276k.c(c6);
        this.f2426L.b(c6, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(l4.e r5, d4.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof I0.C0214w
            if (r0 == 0) goto L13
            r0 = r6
            I0.w r0 = (I0.C0214w) r0
            int r1 = r0.f2396i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2396i = r1
            goto L18
        L13:
            I0.w r0 = new I0.w
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2394g
            int r1 = r0.f2396i
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 == r2) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            X3.a.e(r6)
            goto L49
        L2d:
            X3.a.e(r6)
            I0.q r6 = new I0.q
            r1 = 2
            r6.<init>(r4, r1)
            r0.f2396i = r2
            h0.u r1 = new h0.u
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = r4.f2466o0
            r1.<init>(r6, r3, r5, r2)
            java.lang.Object r5 = x4.AbstractC1888A.l(r1, r0)
            c4.a r6 = c4.EnumC0927a.f11114c
            if (r5 != r6) goto L49
            return
        L49:
            N0.e r5 = new N0.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.M(l4.e, d4.c):void");
    }

    public final void N(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (AbstractC1276k.b(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale != configuration.fontScale || configuration2.densityDpi != configuration.densityDpi) {
            setDensity(AbstractC1410a.b(getContext()));
        }
        if ((configuration2.diff(configuration) & (-1342235264)) != 0) {
            this.f2473s.getClass();
        }
        int i6 = Build.VERSION.SDK_INT;
        if ((i6 >= 31 ? configuration2.fontWeightAdjustment : 0) != (i6 >= 31 ? configuration.fontWeightAdjustment : 0)) {
            setFontFamilyResolver(Y4.d.y(getContext()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.O():void");
    }

    public final void P(float f6) {
        if (this.f2465o) {
            if (f6 > S.l.f7374V) {
                if (Float.isNaN(this.f2410B0) || f6 > this.f2410B0) {
                    this.f2410B0 = f6;
                    return;
                }
                return;
            }
            if (f6 < S.l.f7374V) {
                if (Float.isNaN(this.f2412C0) || f6 < this.f2412C0) {
                    this.f2412C0 = f6;
                }
            }
        }
    }

    @Override // m0.l
    public final void a(m0.C c6, m0.C c7) {
        C0149f0 c0149f0;
        C0149f0 c0149f02;
        if (c6 != null) {
            m0.C c8 = c6;
            if (!c8.f11806c.f11819q) {
                E0.a.b("visitAncestors called on an unattached node");
            }
            AbstractC1040q abstractC1040q = c8.f11806c;
            H0.J v5 = AbstractC0157l.v(c6);
            LinkedHashSet linkedHashSet = null;
            ArrayList arrayList = null;
            while (v5 != null) {
                if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.TASKLISTITEMS) != 0) {
                    while (abstractC1040q != null) {
                        if ((abstractC1040q.f11808f & PegdownExtensions.TASKLISTITEMS) != 0) {
                            AbstractC1040q abstractC1040q2 = abstractC1040q;
                            V.e eVar = null;
                            while (abstractC1040q2 != null) {
                                if (abstractC1040q2 instanceof y0.c) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(abstractC1040q2);
                                } else if ((abstractC1040q2.f11808f & PegdownExtensions.TASKLISTITEMS) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                                    int i6 = 0;
                                    for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                        if ((abstractC1040q3.f11808f & PegdownExtensions.TASKLISTITEMS) != 0) {
                                            i6++;
                                            if (i6 == 1) {
                                                abstractC1040q2 = abstractC1040q3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new V.e(new AbstractC1040q[16]);
                                                }
                                                if (abstractC1040q2 != null) {
                                                    eVar.b(abstractC1040q2);
                                                    abstractC1040q2 = null;
                                                }
                                                eVar.b(abstractC1040q3);
                                            }
                                        }
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC1040q2 = AbstractC0157l.e(eVar);
                            }
                        }
                        abstractC1040q = abstractC1040q.f11810h;
                    }
                }
                v5 = v5.v();
                abstractC1040q = (v5 == null || (c0149f02 = v5.f1721J) == null) ? null : c0149f02.f1918e;
            }
            if (arrayList == null) {
                return;
            }
            if (c7 != null) {
                if (!c7.f11806c.f11819q) {
                    E0.a.b("visitAncestors called on an unattached node");
                }
                AbstractC1040q abstractC1040q4 = c7.f11806c;
                H0.J v6 = AbstractC0157l.v(c7);
                LinkedHashSet linkedHashSet2 = null;
                while (v6 != null) {
                    if ((v6.f1721J.f1919f.f11809g & PegdownExtensions.TASKLISTITEMS) != 0) {
                        while (abstractC1040q4 != null) {
                            if ((abstractC1040q4.f11808f & PegdownExtensions.TASKLISTITEMS) != 0) {
                                AbstractC1040q abstractC1040q5 = abstractC1040q4;
                                V.e eVar2 = null;
                                while (abstractC1040q5 != null) {
                                    if (abstractC1040q5 instanceof y0.c) {
                                        if (linkedHashSet2 == null) {
                                            linkedHashSet2 = new LinkedHashSet();
                                        }
                                        linkedHashSet2.add(abstractC1040q5);
                                    } else if ((abstractC1040q5.f11808f & PegdownExtensions.TASKLISTITEMS) != 0 && (abstractC1040q5 instanceof AbstractC0156k)) {
                                        int i7 = 0;
                                        for (AbstractC1040q abstractC1040q6 = ((AbstractC0156k) abstractC1040q5).f1964s; abstractC1040q6 != null; abstractC1040q6 = abstractC1040q6.f11811i) {
                                            if ((abstractC1040q6.f11808f & PegdownExtensions.TASKLISTITEMS) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    abstractC1040q5 = abstractC1040q6;
                                                } else {
                                                    if (eVar2 == null) {
                                                        eVar2 = new V.e(new AbstractC1040q[16]);
                                                    }
                                                    if (abstractC1040q5 != null) {
                                                        eVar2.b(abstractC1040q5);
                                                        abstractC1040q5 = null;
                                                    }
                                                    eVar2.b(abstractC1040q6);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    abstractC1040q5 = AbstractC0157l.e(eVar2);
                                }
                            }
                            abstractC1040q4 = abstractC1040q4.f11810h;
                        }
                    }
                    v6 = v6.v();
                    abstractC1040q4 = (v6 == null || (c0149f0 = v6.f1721J) == null) ? null : c0149f0.f1918e;
                }
                linkedHashSet = linkedHashSet2;
            }
            int size = arrayList.size();
            for (int i8 = 0; i8 < size; i8++) {
                y0.c cVar = (y0.c) arrayList.get(i8);
                if (!(linkedHashSet != null ? linkedHashSet.contains(cVar) : false)) {
                    cVar.f0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i6, int i7) {
        m0.C c6 = ((m0.q) getFocusOwner()).f12900c;
        if (!c6.f11819q) {
            return;
        }
        if (!c6.f11806c.f11819q) {
            E0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q = c6.f11806c;
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11811i;
        if (abstractC1040q2 == null) {
            AbstractC0157l.b(eVar, abstractC1040q);
        } else {
            eVar.b(abstractC1040q2);
        }
        while (true) {
            int i8 = eVar.f8761f;
            if (i8 == 0) {
                return;
            }
            AbstractC1040q abstractC1040q3 = (AbstractC1040q) eVar.k(i8 - 1);
            if ((abstractC1040q3.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                for (AbstractC1040q abstractC1040q4 = abstractC1040q3; abstractC1040q4 != null && abstractC1040q4.f11819q; abstractC1040q4 = abstractC1040q4.f11811i) {
                    if ((abstractC1040q4.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                        AbstractC1040q abstractC1040q5 = abstractC1040q4;
                        V.e eVar2 = null;
                        while (abstractC1040q5 != null) {
                            int i9 = 0;
                            if (abstractC1040q5 instanceof m0.C) {
                                m0.C c7 = (m0.C) abstractC1040q5;
                                if (c7.f11819q && c7.O0().a) {
                                    super.addFocusables(arrayList, i6, i7);
                                    m0.C c8 = ((m0.q) getFocusOwner()).f12900c;
                                    if (c8.f11819q) {
                                        if (!c8.f11806c.f11819q) {
                                            E0.a.b("visitSubtreeIf called on an unattached node");
                                        }
                                        V.e eVar3 = new V.e(new AbstractC1040q[16]);
                                        AbstractC1040q abstractC1040q6 = c8.f11806c;
                                        AbstractC1040q abstractC1040q7 = abstractC1040q6.f11811i;
                                        if (abstractC1040q7 == null) {
                                            AbstractC0157l.b(eVar3, abstractC1040q6);
                                        } else {
                                            eVar3.b(abstractC1040q7);
                                        }
                                        while (true) {
                                            int i10 = eVar3.f8761f;
                                            if (i10 == 0) {
                                                break;
                                            }
                                            AbstractC1040q abstractC1040q8 = (AbstractC1040q) eVar3.k(i10 - 1);
                                            if ((abstractC1040q8.f11809g & PegdownExtensions.ANCHORLINKS) != 0) {
                                                for (AbstractC1040q abstractC1040q9 = abstractC1040q8; abstractC1040q9 != null && abstractC1040q9.f11819q; abstractC1040q9 = abstractC1040q9.f11811i) {
                                                    if ((abstractC1040q9.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                                        AbstractC1040q abstractC1040q10 = abstractC1040q9;
                                                        V.e eVar4 = null;
                                                        while (abstractC1040q10 != null) {
                                                            if (abstractC1040q10 instanceof m0.C) {
                                                                m0.C c9 = (m0.C) abstractC1040q10;
                                                                if (c9.f11819q) {
                                                                    m0.u O02 = c9.O0();
                                                                    if (c9.f11819q && !c9.f12872r && O02.a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((abstractC1040q10.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q10 instanceof AbstractC0156k)) {
                                                                int i11 = 0;
                                                                for (AbstractC1040q abstractC1040q11 = ((AbstractC0156k) abstractC1040q10).f1964s; abstractC1040q11 != null; abstractC1040q11 = abstractC1040q11.f11811i) {
                                                                    if ((abstractC1040q11.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                                                        i11++;
                                                                        if (i11 == 1) {
                                                                            abstractC1040q10 = abstractC1040q11;
                                                                        } else {
                                                                            if (eVar4 == null) {
                                                                                eVar4 = new V.e(new AbstractC1040q[16]);
                                                                            }
                                                                            if (abstractC1040q10 != null) {
                                                                                eVar4.b(abstractC1040q10);
                                                                                abstractC1040q10 = null;
                                                                            }
                                                                            eVar4.b(abstractC1040q11);
                                                                        }
                                                                    }
                                                                }
                                                                if (i11 == 1) {
                                                                }
                                                            }
                                                            abstractC1040q10 = AbstractC0157l.e(eVar4);
                                                        }
                                                    }
                                                }
                                            }
                                            AbstractC0157l.b(eVar3, abstractC1040q8);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((abstractC1040q5.f11808f & PegdownExtensions.ANCHORLINKS) != 0 && (abstractC1040q5 instanceof AbstractC0156k)) {
                                for (AbstractC1040q abstractC1040q12 = ((AbstractC0156k) abstractC1040q5).f1964s; abstractC1040q12 != null; abstractC1040q12 = abstractC1040q12.f11811i) {
                                    if ((abstractC1040q12.f11808f & PegdownExtensions.ANCHORLINKS) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            abstractC1040q5 = abstractC1040q12;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC1040q5 != null) {
                                                eVar2.b(abstractC1040q5);
                                                abstractC1040q5 = null;
                                            }
                                            eVar2.b(abstractC1040q12);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            abstractC1040q5 = AbstractC0157l.e(eVar2);
                        }
                    }
                }
            }
            AbstractC0157l.b(eVar, abstractC1040q3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        P0.m x5;
        l4.c cVar;
        l4.c cVar2;
        C1064c c1064c = this.f2431O;
        if (c1064c != null) {
            int size = sparseArray.size();
            for (int i6 = 0; i6 < size; i6++) {
                int keyAt = sparseArray.keyAt(i6);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                H0.J j3 = (H0.J) c1064c.f11941e.f4505c.b(keyAt);
                if (j3 != null && (x5 = j3.x()) != null) {
                    k.M m3 = x5.f4492c;
                    Object g3 = m3.g(P0.l.f4472g);
                    if (g3 == null) {
                        g3 = null;
                    }
                    P0.a aVar = (P0.a) g3;
                    if (aVar != null && (cVar2 = (l4.c) aVar.f4430b) != null) {
                    }
                    Object g6 = m3.g(P0.l.f4473h);
                    P0.a aVar2 = (P0.a) (g6 != null ? g6 : null);
                    if (aVar2 != null && (cVar = (l4.c) aVar2.f4430b) != null) {
                    }
                }
            }
        }
        B0.H h3 = this.f2430N;
        if (h3 != null) {
            C1072k c1072k = (C1072k) h3.f392e;
            if (c1072k.a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i7 = 0; i7 < size2; i7++) {
                int keyAt2 = sparseArray.keyAt(i7);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(keyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (c1072k.a.get(Integer.valueOf(keyAt2)) != null) {
                        throw new ClassCastException();
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0832f
    public final void c(InterfaceC0846u interfaceC0846u) {
        InterfaceC0604f interfaceC0604f;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(K.j());
        }
        H0 h02 = this.f2453i;
        if (h02 != null) {
            G0 g02 = this.f2451h;
            AbstractC1276k.c(g02);
            A3.c cVar = h02.a;
            C0920c c0920c = (C0920c) cVar.f119e;
            if (!c0920c.f11099c || c0920c.f11101f) {
                return;
            }
            try {
                interfaceC0604f = ((r1) g02).f2382c.s(new A0.b(h02, 7));
            } catch (CancellationException unused) {
                C0920c c0920c2 = (C0920c) cVar.f119e;
                if (!c0920c2.f11100e) {
                    if (c0920c2.f11101f) {
                        d0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    c0920c2.a();
                    c0920c2.f11101f = true;
                }
                interfaceC0604f = null;
            }
            InterfaceC0604f interfaceC0604f2 = h02.f2182d;
            if (interfaceC0604f2 != null) {
                interfaceC0604f2.cancel();
            }
            h02.f2182d = interfaceC0604f;
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i6) {
        return this.f2409B.f(false, i6, this.f2442c);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i6) {
        return this.f2409B.f(true, i6, this.f2442c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            p(getRoot());
        }
        w(true);
        AbstractC0992o.j().m();
        this.f2422I = true;
        o0.r rVar = this.f2475t;
        C1391b c1391b = rVar.a;
        Canvas canvas2 = c1391b.a;
        c1391b.a = canvas;
        getRoot().i(c1391b, null);
        rVar.a.a = canvas2;
        k.I i6 = this.f2418G;
        if (i6.i()) {
            int i7 = i6.f12466b;
            for (int i8 = 0; i8 < i7; i8++) {
                ((C0219y0) ((H0.q0) i6.f(i8))).f();
            }
        }
        int i9 = Z0.f2270c;
        i6.d();
        this.f2422I = false;
        k.I i10 = this.f2420H;
        if (i10 != null) {
            i6.c(i10);
            i10.d();
        }
        if (this.f2465o) {
            AbstractC0182f0.a(this, this.f2410B0);
            View view = this.f2463n;
            if (view == null) {
                AbstractC1276k.k("frameRateCategoryView");
                throw null;
            }
            AbstractC0182f0.a(view, this.f2412C0);
            if (!Float.isNaN(this.f2412C0)) {
                view.invalidate();
                drawChild(canvas, view, getDrawingTime());
            }
            this.f2410B0 = Float.NaN;
            this.f2412C0 = Float.NaN;
        }
        getRectManager().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:643:0x0430, code lost:
    
        if ((r2 / r3) >= 5.0f) goto L246;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0 */
    /* JADX WARN: Type inference failed for: r32v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r32v2 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r5v85 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchGenericMotionEvent(android.view.MotionEvent r43) {
        /*
            Method dump skipped, instructions count: 1947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.dispatchGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (t(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((m0.q) getFocusOwner()).f(keyEvent, new C0028d(3, this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f2473s.getClass();
        b1.a.setValue(new B0.K(metaState));
        return ((m0.q) getFocusOwner()).f(keyEvent, m0.m.f12896e) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C0149f0 c0149f0;
        if (isFocused()) {
            m0.q qVar = (m0.q) getFocusOwner();
            if (qVar.f12901d.f12895e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                m0.C f6 = AbstractC1249d.f(qVar.f12900c);
                if (f6 != null) {
                    if (!f6.f11806c.f11819q) {
                        E0.a.b("visitAncestors called on an unattached node");
                    }
                    AbstractC1040q abstractC1040q = f6.f11806c;
                    H0.J v5 = AbstractC0157l.v(f6);
                    while (v5 != null) {
                        if ((v5.f1721J.f1919f.f11809g & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0) {
                            while (abstractC1040q != null) {
                                if ((abstractC1040q.f11808f & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0) {
                                    AbstractC1040q abstractC1040q2 = abstractC1040q;
                                    V.e eVar = null;
                                    while (abstractC1040q2 != null) {
                                        if ((abstractC1040q2.f11808f & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0 && (abstractC1040q2 instanceof AbstractC0156k)) {
                                            int i6 = 0;
                                            for (AbstractC1040q abstractC1040q3 = ((AbstractC0156k) abstractC1040q2).f1964s; abstractC1040q3 != null; abstractC1040q3 = abstractC1040q3.f11811i) {
                                                if ((abstractC1040q3.f11808f & PegdownExtensions.SUPPRESS_INLINE_HTML) != 0) {
                                                    i6++;
                                                    if (i6 == 1) {
                                                        abstractC1040q2 = abstractC1040q3;
                                                    } else {
                                                        if (eVar == null) {
                                                            eVar = new V.e(new AbstractC1040q[16]);
                                                        }
                                                        if (abstractC1040q2 != null) {
                                                            eVar.b(abstractC1040q2);
                                                            abstractC1040q2 = null;
                                                        }
                                                        eVar.b(abstractC1040q3);
                                                    }
                                                }
                                            }
                                            if (i6 == 1) {
                                            }
                                        }
                                        abstractC1040q2 = AbstractC0157l.e(eVar);
                                    }
                                }
                                abstractC1040q = abstractC1040q.f11810h;
                            }
                        }
                        v5 = v5.v();
                        abstractC1040q = (v5 == null || (c0149f0 = v5.f1721J) == null) ? null : c0149f0.f1918e;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            E.a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object c0184g0;
        m0.C h3;
        if (this.f2417F0) {
            RunnableC0191k runnableC0191k = this.f2415E0;
            removeCallbacks(runnableC0191k);
            MotionEvent motionEvent2 = this.f2484x0;
            AbstractC1276k.c(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f2417F0 = false;
            } else {
                runnableC0191k.run();
            }
        }
        if (!r(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || t(motionEvent))) {
            int o5 = o(motionEvent);
            if ((o5 & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z5 = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z6 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z5 && z6) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (c0184g0 = view.getTag(R.id.auto_clear_focus_behavior_tag)) == null) {
                    c0184g0 = new C0184g0(1);
                }
                if (c0184g0.equals(new C0184g0(1)) && (h3 = ((m0.q) getFocusOwner()).h()) != null) {
                    H0.i0 u5 = AbstractC0157l.u(h3);
                    if (!AbstractC0137z.h(u5).Q(u5, true).a((Float.floatToRawIntBits(motionEvent.getX()) << 32) | (Float.floatToRawIntBits(motionEvent.getY()) & 4294967295L))) {
                        m0.n.a(getFocusOwner());
                    }
                }
            }
            if ((o5 & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.InterfaceC0832f
    public final void f(InterfaceC0846u interfaceC0846u) {
        H0 h02 = this.f2453i;
        if (h02 != null) {
            C0920c c0920c = (C0920c) h02.a.f119e;
            if (c0920c.f11099c && !c0920c.f11101f) {
                InterfaceC0604f interfaceC0604f = h02.f2182d;
                if (interfaceC0604f != null) {
                    interfaceC0604f.cancel();
                }
                h02.f2182d = null;
                return;
            }
            if (c0920c.f11100e) {
                return;
            }
            if (!c0920c.f11101f) {
                d0.a.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!c0920c.f11102g.i()) {
                d0.a.a("Attempted to start retaining exited values with pending exited values");
            }
            c0920c.f11101f = false;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i6) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return m(this, i6);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, Integer.valueOf(i6));
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [m4.w, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i6) {
        C1354c a;
        if (view == null || this.f2440a0.f1844c) {
            return super.focusSearch(view, i6);
        }
        View rootView = getRootView();
        AbstractC1276k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View findNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i6);
        if (findNextFocus == null || !K.a(this, findNextFocus)) {
            findNextFocus = null;
        }
        if (view == this) {
            m0.C f6 = AbstractC1249d.f(((m0.q) getFocusOwner()).f12900c);
            a = f6 != null ? AbstractC1249d.i(f6) : null;
            if (a == null) {
                a = m0.j.a(view, this);
            }
        } else {
            a = m0.j.a(view, this);
        }
        m0.f d6 = m0.j.d(i6);
        int i7 = d6 != null ? d6.a : 6;
        ?? obj = new Object();
        if (((m0.q) getFocusOwner()).g(i7, a, new A0.k(obj, 2)) == null) {
            return view;
        }
        Object obj2 = obj.f12973c;
        if (obj2 == null) {
            if (findNextFocus == null) {
                return super.focusSearch(view, i6);
            }
        } else if (findNextFocus == null || i7 == 1 || i7 == 2 || AbstractC1249d.o(AbstractC1249d.i((m0.C) obj2), m0.j.a(findNextFocus, this), a, i7)) {
            return this;
        }
        return findNextFocus;
    }

    public final C0176c0 getAndroidViewsHandler$ui() {
        if (this.f2437U == null) {
            C0176c0 c0176c0 = new C0176c0(getContext());
            this.f2437U = c0176c0;
            addView(c0176c0, -1);
            requestLayout();
        }
        C0176c0 c0176c02 = this.f2437U;
        AbstractC1276k.c(c0176c02);
        return c0176c02;
    }

    public InterfaceC1068g getAutofill() {
        return this.f2430N;
    }

    public AbstractC1071j getAutofillManager() {
        return this.f2431O;
    }

    public C1072k getAutofillTree() {
        return this.f2416F;
    }

    public final Configuration getConfiguration() {
        return (Configuration) this.f2428M.getValue();
    }

    public final j0.d getContentCaptureManager$ui() {
        return this.f2411C;
    }

    public InterfaceC0910h getCoroutineContext() {
        return this.f2469q;
    }

    public InterfaceC0961c getDensity() {
        return (InterfaceC0961c) this.f2461m.getValue();
    }

    public C1354c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            m0.C f6 = AbstractC1249d.f(((m0.q) getFocusOwner()).f12900c);
            if (f6 != null) {
                return AbstractC1249d.i(f6);
            }
            return null;
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return m0.j.a(findFocus, this);
        }
        return null;
    }

    public m0.n getFocusOwner() {
        return this.f2467p;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C1354c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.a);
            rect.top = Math.round(embeddedViewFocusRect.f13295b);
            rect.right = Math.round(embeddedViewFocusRect.f13296c);
            rect.bottom = Math.round(embeddedViewFocusRect.f13297d);
            return;
        }
        if (AbstractC1276k.b(((m0.q) getFocusOwner()).g(6, null, C0201p.f2340f), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public W0.d getFontFamilyResolver() {
        return (W0.d) this.f2472r0.getValue();
    }

    public W0.c getFontLoader() {
        return this.f2470q0;
    }

    public final G0 getFrameEndScheduler$ui() {
        return this.f2451h;
    }

    public o0.w getGraphicsContext() {
        return this.f2414E;
    }

    public InterfaceC1830a getHapticFeedBack() {
        return this.f2476t0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f2440a0.f1843b.l() || !this.f2457k.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC1862b getInputModeManager() {
        return this.f2478u0;
    }

    public final RunnableC0129q getInsetsListener() {
        return this.f2479v;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f2450g0;
    }

    @Override // android.view.View, android.view.ViewParent
    public e1.m getLayoutDirection() {
        return (e1.m) this.f2474s0.getValue();
    }

    public long getMeasureIteration() {
        H0.Y y5 = this.f2440a0;
        if (!y5.f1844c) {
            E0.a.a("measureIteration should be only used during the measure/layout pass");
        }
        return y5.f1848g;
    }

    public G0.b getModifierLocalManager() {
        return this.f2480v0;
    }

    public F0.j0 getPlacementScope() {
        int i6 = F0.m0.f1494b;
        return new F0.S(this, 1);
    }

    public InterfaceC0046w getPointerIconService() {
        return this.f2429M0;
    }

    /* renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final C1986a m3getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f2447f;
    }

    public Q0.b getRectManager() {
        return this.f2485y;
    }

    public InterfaceC0921d getRetainedValuesStore() {
        return this.f2455j;
    }

    public H0.J getRoot() {
        return this.f2481w;
    }

    public H0.y0 getRootForTest() {
        return this.f2487z;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        A3.c cVar;
        if (Build.VERSION.SDK_INT < 31 || (cVar = this.K0) == null) {
            return false;
        }
        return ((Boolean) ((C0607g0) cVar.f119e).getValue()).booleanValue();
    }

    public P0.r getSemanticsOwner() {
        return this.f2407A;
    }

    public H0.L getSharedDrawScope() {
        return this.f2449g;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C0180e0.a.a(this) : this.f2436T;
    }

    public H0.t0 getSnapshotObserver() {
        return this.f2435S;
    }

    public S0 getSoftwareKeyboardController() {
        return this.f2468p0;
    }

    public X0.w getTextInputService() {
        return this.f2464n0;
    }

    public T0 getTextToolbar() {
        return this.f2482w0;
    }

    public final H0.x0 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    public X0 getViewConfiguration() {
        return this.f2477u;
    }

    public final C0197n getViewTreeOwners() {
        return (C0197n) this.f2458k0.getValue();
    }

    public a1 getWindowInfo() {
        return this.f2473s;
    }

    public final C1064c get_autofillManager$ui() {
        return this.f2431O;
    }

    public final H0.q0 l(l4.e eVar, C0153h0 c0153h0, r0.b bVar) {
        V.e eVar2;
        Reference poll;
        Object obj;
        if (bVar != null) {
            return new C0219y0(bVar, null, this, eVar, c0153h0);
        }
        do {
            M.q qVar = this.f2488z0;
            ReferenceQueue referenceQueue = (ReferenceQueue) qVar.f3180f;
            eVar2 = (V.e) qVar.f3179e;
            poll = referenceQueue.poll();
            if (poll != null) {
                eVar2.j(poll);
            }
        } while (poll != null);
        while (true) {
            int i6 = eVar2.f8761f;
            if (i6 == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) eVar2.k(i6 - 1)).get();
            if (obj != null) {
                break;
            }
        }
        H0.q0 q0Var = (H0.q0) obj;
        if (q0Var == null) {
            return new C0219y0(getGraphicsContext().b(), getGraphicsContext(), this, eVar, c0153h0);
        }
        C0219y0 c0219y0 = (C0219y0) q0Var;
        o0.w wVar = c0219y0.f2492e;
        if (wVar == null) {
            throw B3.e.f("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c0219y0.f2491c.f14551s) {
            E0.a.a("layer should have been released before reuse");
        }
        c0219y0.f2491c = wVar.b();
        c0219y0.f2497j = false;
        c0219y0.f2494g = eVar;
        c0219y0.f2495h = c0153h0;
        c0219y0.f2507t = false;
        c0219y0.f2508u = false;
        c0219y0.f2509v = true;
        C1382D.d(c0219y0.f2498k);
        float[] fArr = c0219y0.f2499l;
        if (fArr != null) {
            C1382D.d(fArr);
        }
        c0219y0.f2505r = o0.O.f13454b;
        c0219y0.f2510w = false;
        long j3 = TableCell.NOT_TRACKED;
        c0219y0.f2496i = (j3 & 4294967295L) | (j3 << 32);
        c0219y0.f2506s = null;
        c0219y0.f2504q = 0;
        return q0Var;
    }

    public final void n(H0.J j3, boolean z5) {
        this.f2440a0.f(j3, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:104:0x0090, B:106:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:107:0x0056, B:113:0x0062, B:116:0x006a), top: B:89:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int o(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.o(android.view.MotionEvent):int");
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [I0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.lifecycle.W, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        InterfaceC0921d interfaceC0921d;
        androidx.lifecycle.O g3;
        Object obj;
        super.onAttachedToWindow();
        int i6 = Build.VERSION.SDK_INT;
        if (i6 < 30) {
            setShowLayoutBounds(K.j());
        }
        this.f2479v.onViewAttachedToWindow(this);
        if (i6 > 28) {
            if (f2405R0 == null) {
                ?? obj2 = new Object();
                f2405R0 = obj2;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f2401N0 == null) {
                        f2401N0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f2403P0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f2401N0;
                        f2403P0 = cls != null ? cls.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                    }
                    Method method = f2403P0;
                    if (method != null) {
                        method.invoke(null, obj2);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            k.I i7 = f2404Q0;
            synchronized (i7) {
                i7.a(this);
            }
        }
        this.f2473s.a.setValue(Boolean.valueOf(hasWindowFocus()));
        F0 f02 = this.f2473s;
        int i8 = 0;
        new r(this, i8);
        f02.getClass();
        q(getRoot());
        p(getRoot());
        getSnapshotObserver().a.e();
        B0.H h3 = this.f2430N;
        if (h3 != null) {
            C1070i c1070i = C1070i.a;
            c1070i.getClass();
            ((AutofillManager) h3.f393f).registerCallback(c1070i);
        }
        InterfaceC0846u e6 = androidx.lifecycle.O.e(this);
        U1.e t5 = s4.j.t(this);
        androidx.lifecycle.a0 f6 = androidx.lifecycle.O.f(this);
        G0 g02 = this.f2451h;
        if (e6 == null || f6 == null || g02 == null) {
            interfaceC0921d = null;
        } else {
            androidx.lifecycle.Z e7 = f6.e();
            ?? obj3 = new Object();
            F1.a aVar = F1.a.f1544b;
            AbstractC1276k.f(aVar, "extras");
            B0.H h6 = new B0.H(e7, obj3, aVar);
            C1270e a = AbstractC1289x.a(I0.class);
            String b5 = a.b();
            if (b5 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            I0 i02 = (I0) h6.g(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b5));
            Object parent = getParent();
            AbstractC1276k.d(parent, "null cannot be cast to non-null type android.view.View");
            int id = ((View) parent).getId();
            C1147A c1147a = i02.f2183b;
            Object b6 = c1147a.b(id);
            if (b6 == null) {
                b6 = new k.I(1);
                c1147a.i(id, b6);
            }
            k.I i9 = (k.I) b6;
            Object[] objArr = i9.a;
            int i10 = i9.f12466b;
            while (true) {
                if (i8 >= i10) {
                    obj = null;
                    break;
                }
                obj = objArr[i8];
                if (!((H0) obj).f2181c) {
                    break;
                } else {
                    i8++;
                }
            }
            H0 h02 = (H0) obj;
            if (h02 == null) {
                h02 = new H0();
                i9.a(h02);
            }
            h02.f2181c = true;
            this.f2453i = h02;
            interfaceC0921d = h02.f2180b;
        }
        if (interfaceC0921d == null) {
            interfaceC0921d = C0918a.f11098c;
        }
        this.f2455j = interfaceC0921d;
        C0197n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (e6 != null && t5 != null && (e6 != viewTreeOwners.a || t5 != viewTreeOwners.f2330b || f6 != viewTreeOwners.f2331c))) {
            if (e6 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (t5 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (g3 = viewTreeOwners.a.g()) != null) {
                g3.j(this);
            }
            e6.g().a(this);
            C0197n c0197n = new C0197n(e6, t5, f6);
            set_viewTreeOwners(c0197n);
            l4.c cVar = this.f2460l0;
            if (cVar != null) {
                cVar.f(c0197n);
            }
            this.f2460l0 = null;
        }
        this.f2478u0.a.setValue(new C1861a(isInTouchMode() ? 1 : 2));
        C0197n viewTreeOwners2 = getViewTreeOwners();
        androidx.lifecycle.O g6 = viewTreeOwners2 != null ? viewTreeOwners2.a.g() : null;
        if (g6 == null) {
            throw B3.e.f("No lifecycle owner exists");
        }
        g6.a(this);
        g6.a(this.f2411C);
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            H.a.b(this);
        }
        C1064c c1064c = this.f2431O;
        if (c1064c != null) {
            ((m0.q) getFocusOwner()).f12904g.a(c1064c);
            getSemanticsOwner().f4506d.a(c1064c);
        }
        ((m0.q) getFocusOwner()).f12904g.a(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        C1043t c1043t = (C1043t) this.f2466o0.get();
        S s5 = (S) (c1043t != null ? c1043t.f11820b : null);
        if (s5 == null) {
            return this.f2462m0.f9135d;
        }
        C1043t c1043t2 = (C1043t) s5.f2245g.get();
        D0 d02 = (D0) (c1043t2 != null ? c1043t2.f11820b : null);
        return d02 != null && (d02.f2179e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        N(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: I0.ViewTreeObserverOnGlobalLayoutListenerC0216x.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        P0.p pVar;
        String a;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        j0.d dVar = this.f2411C;
        dVar.getClass();
        for (long j3 : jArr) {
            P0.q qVar = (P0.q) dVar.e().b((int) j3);
            if (qVar != null && (pVar = qVar.a) != null) {
                AbstractC0189j.o();
                ViewTranslationRequest.Builder k3 = AbstractC0189j.k(dVar.f12323c.getAutofillId(), pVar.f4502g);
                Object g3 = pVar.f4499d.f4492c.g(P0.t.f4508B);
                if (g3 == null) {
                    g3 = null;
                }
                List list = (List) g3;
                if (list != null && (a = AbstractC1016a.a(list, SequenceUtils.EOL, null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new C0545g(a));
                    k3.setValue("android:text", forText);
                    build = k3.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2479v.onViewDetachedFromWindow(this);
        if (this.f2465o) {
            View view = this.f2463n;
            if (view == null) {
                AbstractC1276k.k("frameRateCategoryView");
                throw null;
            }
            removeView(view);
        }
        int i6 = Build.VERSION.SDK_INT;
        if (i6 > 28) {
            k.I i7 = f2404Q0;
            synchronized (i7) {
                i7.j(this);
            }
        }
        C1001x c1001x = getSnapshotObserver().a;
        C0914b c0914b = c1001x.f11744h;
        if (c0914b != null) {
            c0914b.b();
        }
        c1001x.a();
        this.f2473s.getClass();
        C0197n viewTreeOwners = getViewTreeOwners();
        androidx.lifecycle.O g3 = viewTreeOwners != null ? viewTreeOwners.a.g() : null;
        if (g3 == null) {
            throw B3.e.f("No lifecycle owner exists");
        }
        g3.j(this.f2411C);
        g3.j(this);
        B0.H h3 = this.f2430N;
        if (h3 != null) {
            C1070i c1070i = C1070i.a;
            c1070i.getClass();
            ((AutofillManager) h3.f393f).unregisterCallback(c1070i);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        H0 h02 = this.f2453i;
        if (h02 != null) {
            h02.f2181c = false;
        }
        this.f2453i = null;
        if (i6 >= 31) {
            H.a.a(this);
        }
        C1064c c1064c = this.f2431O;
        if (c1064c != null) {
            getSemanticsOwner().f4506d.j(c1064c);
            ((m0.q) getFocusOwner()).f12904g.j(c1064c);
        }
        Q0.b rectManager = getRectManager();
        I.c cVar = rectManager.f6320g;
        if (cVar != null) {
            AbstractC1025b.a.removeCallbacks(cVar);
            rectManager.f6320g = null;
        }
        ((m0.q) getFocusOwner()).f12904g.j(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z5, int i6, Rect rect) {
        super.onFocusChanged(z5, i6, rect);
        if (z5 || hasFocus()) {
            return;
        }
        m0.q qVar = (m0.q) getFocusOwner();
        AbstractC1249d.d(qVar.f12900c, true);
        if (qVar.h() != null) {
            m0.C h3 = qVar.h();
            qVar.k(null);
            if (h3 != null) {
                h3.N0(EnumC1245A.f12868c, EnumC1245A.f12870f);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f2450g0 = 0L;
        O();
        int i6 = Build.VERSION.SDK_INT;
        if (32 > i6 || i6 >= 34) {
            return;
        }
        N(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        this.f2450g0 = 0L;
        this.f2440a0.j(this.f2421H0);
        this.f2438V = null;
        O();
        if (this.f2437U != null) {
            getAndroidViewsHandler$ui().layout(0, 0, i8 - i6, i9 - i7);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i6, int i7) {
        H0.Y y5 = this.f2440a0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                q(getRoot());
            }
            long k3 = k(i6);
            long k5 = k(i7);
            long r5 = s4.j.r((int) (k3 >>> 32), (int) (k3 & 4294967295L), (int) (k5 >>> 32), (int) (4294967295L & k5));
            C0959a c0959a = this.f2438V;
            if (c0959a == null) {
                this.f2438V = new C0959a(r5);
                this.f2439W = false;
            } else if (!C0959a.b(c0959a.a, r5)) {
                this.f2439W = true;
            }
            y5.q(r5);
            y5.l();
            setMeasuredDimension(getRoot().f1722K.f1781p.f1485c, getRoot().f1722K.f1781p.f1486e);
            if (this.f2437U != null) {
                getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f1722K.f1781p.f1485c, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f1722K.f1781p.f1486e, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i6) {
        if (viewStructure != null) {
            C1064c c1064c = this.f2431O;
            if (c1064c != null) {
                H0.J j3 = c1064c.f11941e.a;
                AutofillId autofillId = c1064c.f11946j;
                String str = c1064c.f11944h;
                Q0.b bVar = c1064c.f11943g;
                s4.j.E(viewStructure, j3, autofillId, str, bVar);
                Object[] objArr = k.T.a;
                k.I i7 = new k.I(2);
                i7.a(j3);
                i7.a(viewStructure);
                while (i7.i()) {
                    Object k3 = i7.k(i7.f12466b - 1);
                    AbstractC1276k.d(k3, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) k3;
                    Object k5 = i7.k(i7.f12466b - 1);
                    AbstractC1276k.d(k5, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    V.b bVar2 = (V.b) ((H0.J) k5).n();
                    int i8 = ((V.e) bVar2.f8751e).f8761f;
                    for (int i9 = 0; i9 < i8; i9++) {
                        H0.J j4 = (H0.J) bVar2.get(i9);
                        if (!j4.f1732U && j4.H() && j4.I()) {
                            P0.m x5 = j4.x();
                            if (x5 != null) {
                                k.M m3 = x5.f4492c;
                                if (m3.b(P0.l.f4472g) || m3.b(P0.l.f4473h) || m3.b(P0.t.f4538q) || m3.b(P0.t.f4539r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    s4.j.E(newChild, j4, autofillId, str, bVar);
                                    i7.a(j4);
                                    i7.a(newChild);
                                }
                            }
                            i7.a(j4);
                            i7.a(viewStructure2);
                        }
                    }
                }
            }
            B0.H h3 = this.f2430N;
            if (h3 != null) {
                C1072k c1072k = (C1072k) h3.f392e;
                LinkedHashMap linkedHashMap = c1072k.a;
                LinkedHashMap linkedHashMap2 = c1072k.a;
                if (linkedHashMap.isEmpty()) {
                    return;
                }
                int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    int intValue = ((Number) entry.getKey()).intValue();
                    if (entry.getValue() != null) {
                        throw new ClassCastException();
                    }
                    ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                    newChild2.setAutofillId((AutofillId) h3.f394g, intValue);
                    newChild2.setId(intValue, ((ViewTreeObserverOnGlobalLayoutListenerC0216x) h3.f391c).getContext().getPackageName(), null, null);
                    newChild2.setAutofillType(1);
                    throw null;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i6) {
        InterfaceC0045v interfaceC0045v;
        int toolType = motionEvent.getToolType(i6);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (interfaceC0045v = ((C0206s) getPointerIconService()).a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i6);
        }
        Context context = getContext();
        return interfaceC0045v instanceof C0025a ? PointerIcon.getSystemIcon(context, ((C0025a) interfaceC0045v).f432b) : PointerIcon.getSystemIcon(context, 1000);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i6) {
        if (this.f2445e) {
            int[] iArr = m0.j.a;
            e1.m mVar = e1.m.f11576c;
            e1.m mVar2 = i6 != 0 ? i6 != 1 ? null : e1.m.f11577e : mVar;
            if (mVar2 != null) {
                mVar = mVar2;
            }
            setLayoutDirection(mVar);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [m4.a, O0.j] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        A3.c cVar;
        if (Build.VERSION.SDK_INT >= 31 && (cVar = this.K0) != null) {
            P0.r semanticsOwner = getSemanticsOwner();
            InterfaceC0910h coroutineContext = getCoroutineContext();
            V.e eVar = new V.e(new O0.k[16]);
            Y4.l.Y(semanticsOwner.a(), 0, new C1266a(1, 8, V.e.class, eVar, "add", "add(Ljava/lang/Object;)Z"));
            Y3.k.A0(eVar.f8759c, new O.y0(new l4.c[]{O0.d.f4290g, O0.d.f4291h}, 2), 0, eVar.f8761f);
            int i6 = eVar.f8761f;
            O0.k kVar = (O0.k) (i6 == 0 ? null : eVar.f8759c[i6 - 1]);
            if (kVar != null) {
                e1.k kVar2 = kVar.f4308c;
                O0.f fVar = new O0.f(kVar.a, kVar2, AbstractC1888A.c(coroutineContext), cVar, this);
                H0.i0 i0Var = kVar.f4309d;
                C1354c Q5 = AbstractC0137z.h(i0Var).Q(i0Var, true);
                long c6 = kVar2.c();
                ScrollCaptureTarget f6 = AbstractC0189j.f(this, o0.y.y(h5.e.h0(Q5)), new Point((int) (c6 >> 32), (int) (c6 & 4294967295L)), fVar);
                f6.setScrollBounds(o0.y.y(kVar2));
                consumer.accept(f6);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        O();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z5) {
        this.f2478u0.a.setValue(new C1861a(z5 ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        j0.d dVar = this.f2411C;
        dVar.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC1276k.b(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC1117a.l(dVar, longSparseArray);
        } else {
            dVar.f12323c.post(new N1.y(14, dVar, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z5) {
        boolean j3;
        this.f2473s.a.setValue(Boolean.valueOf(z5));
        this.J0 = true;
        super.onWindowFocusChanged(z5);
        if (!z5 || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (j3 = K.j())) {
            return;
        }
        setShowLayoutBounds(j3);
        p(getRoot());
    }

    public final void q(H0.J j3) {
        this.f2440a0.p(j3, false);
        V.e z5 = j3.z();
        Object[] objArr = z5.f8759c;
        int i6 = z5.f8761f;
        for (int i7 = 0; i7 < i6; i7++) {
            q((H0.J) objArr[i7]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i6, Rect rect) {
        if (!isFocused()) {
            m0.f d6 = m0.j.d(i6);
            int i7 = d6 != null ? d6.a : 7;
            Boolean g3 = ((m0.q) getFocusOwner()).g(i7, rect != null ? o0.y.D(rect) : null, new C0208t(i7, 0));
            Boolean bool = Boolean.TRUE;
            if (!AbstractC1276k.b(g3, bool)) {
                if (!AbstractC1276k.b(((m0.q) getFocusOwner()).g(i7, null, new C0208t(i7, 1)), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i7 == 1 || i7 == 2) {
                        return ((m0.q) getFocusOwner()).j(i7);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean s(MotionEvent motionEvent) {
        float x5 = motionEvent.getX();
        float y5 = motionEvent.getY();
        return S.l.f7374V <= x5 && x5 <= ((float) getWidth()) && S.l.f7374V <= y5 && y5 <= ((float) getHeight());
    }

    public void setAccessibilityEventBatchIntervalMillis(long j3) {
        this.f2409B.f2160k = j3;
    }

    public final void setConfiguration(Configuration configuration) {
        this.f2428M.setValue(configuration);
    }

    public final void setContentCaptureManager$ui(j0.d dVar) {
        this.f2411C = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [h0.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [V.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(InterfaceC0910h interfaceC0910h) {
        this.f2469q = interfaceC0910h;
        AbstractC1040q abstractC1040q = getRoot().f1721J.f1919f;
        if (abstractC1040q instanceof B0.X) {
            ((B0.X) abstractC1040q).O0();
        }
        if (!abstractC1040q.f11806c.f11819q) {
            E0.a.b("visitSubtreeIf called on an unattached node");
        }
        V.e eVar = new V.e(new AbstractC1040q[16]);
        AbstractC1040q abstractC1040q2 = abstractC1040q.f11806c;
        AbstractC1040q abstractC1040q3 = abstractC1040q2.f11811i;
        if (abstractC1040q3 == null) {
            AbstractC0157l.b(eVar, abstractC1040q2);
        } else {
            eVar.b(abstractC1040q3);
        }
        while (true) {
            int i6 = eVar.f8761f;
            if (i6 == 0) {
                return;
            }
            AbstractC1040q abstractC1040q4 = (AbstractC1040q) eVar.k(i6 - 1);
            if ((abstractC1040q4.f11809g & 16) != 0) {
                for (AbstractC1040q abstractC1040q5 = abstractC1040q4; abstractC1040q5 != null && abstractC1040q5.f11819q; abstractC1040q5 = abstractC1040q5.f11811i) {
                    if ((abstractC1040q5.f11808f & 16) != 0) {
                        AbstractC0156k abstractC0156k = abstractC1040q5;
                        ?? r5 = 0;
                        while (abstractC0156k != 0) {
                            if (abstractC0156k instanceof H0.w0) {
                                H0.w0 w0Var = (H0.w0) abstractC0156k;
                                if (w0Var instanceof B0.X) {
                                    ((B0.X) w0Var).O0();
                                }
                            } else if ((abstractC0156k.f11808f & 16) != 0 && (abstractC0156k instanceof AbstractC0156k)) {
                                AbstractC1040q abstractC1040q6 = abstractC0156k.f1964s;
                                int i7 = 0;
                                abstractC0156k = abstractC0156k;
                                r5 = r5;
                                while (abstractC1040q6 != null) {
                                    if ((abstractC1040q6.f11808f & 16) != 0) {
                                        i7++;
                                        r5 = r5;
                                        if (i7 == 1) {
                                            abstractC0156k = abstractC1040q6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new V.e(new AbstractC1040q[16]);
                                            }
                                            if (abstractC0156k != 0) {
                                                r5.b(abstractC0156k);
                                                abstractC0156k = 0;
                                            }
                                            r5.b(abstractC1040q6);
                                        }
                                    }
                                    abstractC1040q6 = abstractC1040q6.f11811i;
                                    abstractC0156k = abstractC0156k;
                                    r5 = r5;
                                }
                                if (i7 == 1) {
                                }
                            }
                            abstractC0156k = AbstractC0157l.e(r5);
                        }
                    }
                }
            }
            AbstractC0157l.b(eVar, abstractC1040q4);
        }
    }

    public final void setFrameEndScheduler$ui(G0 g02) {
        this.f2451h = g02;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j3) {
        this.f2450g0 = j3;
    }

    public final void setOnViewTreeOwnersAvailable(l4.c cVar) {
        C0197n viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            cVar.f(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f2460l0 = cVar;
    }

    /* renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m4setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(C1986a c1986a) {
        this.f2447f = c1986a;
    }

    public void setShowLayoutBounds(boolean z5) {
        this.f2436T = z5;
    }

    public void setUncaughtExceptionHandler(H0.x0 x0Var) {
        this.f2440a0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(H0.x0 x0Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final boolean t(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f2484x0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void u(float[] fArr) {
        F();
        C1382D.e(fArr, this.f2446e0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f2454i0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f2454i0 & 4294967295L));
        float[] fArr2 = this.f2444d0;
        C1382D.d(fArr2);
        C1382D.f(fArr2, intBitsToFloat, intBitsToFloat2);
        K.o(fArr, fArr2);
    }

    public final long v(long j3) {
        F();
        long b5 = C1382D.b(j3, this.f2446e0);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f2454i0 >> 32)) + Float.intBitsToFloat((int) (b5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f2454i0 & 4294967295L)) + Float.intBitsToFloat((int) (b5 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public final void w(boolean z5) {
        r rVar;
        H0.Y y5 = this.f2440a0;
        if (y5.f1843b.l() || ((V.e) y5.f1846e.f3179e).f8761f != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z5) {
                try {
                    rVar = this.f2421H0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                rVar = null;
            }
            if (y5.j(rVar)) {
                requestLayout();
            }
            y5.a(false);
            if (this.f2424J) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.f2424J = false;
            }
            Trace.endSection();
        }
    }

    public final void x(H0.J j3, long j4) {
        H0.Y y5 = this.f2440a0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            y5.k(j3, j4);
            if (!y5.f1843b.l()) {
                y5.a(false);
                if (this.f2424J) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f2424J = false;
                }
            }
            getRectManager().a();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean y(int i6) {
        if (i6 == 7 || i6 == 8) {
            return false;
        }
        Integer c6 = m0.j.c(i6);
        if (c6 == null) {
            throw B3.e.f("Invalid focus direction");
        }
        int intValue = c6.intValue();
        m0.C h3 = ((m0.q) getFocusOwner()).h();
        if (h3 == null) {
            throw new IllegalStateException("findNextViewInEmbeddedView called when owner does not have anything focused.");
        }
        Integer c7 = m0.j.c(i6);
        if (c7 == null) {
            throw B3.e.f("Invalid focus direction");
        }
        int intValue2 = c7.intValue();
        h1.x xVar = AbstractC0157l.v(h3).f1748s;
        View interopView = xVar != null ? xVar.getInteropView() : null;
        View findFocus = findFocus();
        FocusFinder focusFinder = FocusFinder.getInstance();
        View rootView = getRootView();
        AbstractC1276k.d(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
        View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, findFocus, intValue2);
        if (findNextFocus == null || interopView == null || !K.a(interopView, findNextFocus)) {
            findNextFocus = null;
        }
        if (findNextFocus != null) {
            return m0.j.b(findNextFocus, Integer.valueOf(intValue), null);
        }
        return false;
    }

    public final void z(H0.q0 q0Var, boolean z5) {
        k.I i6 = this.f2418G;
        if (!z5) {
            if (this.f2422I) {
                return;
            }
            i6.j(q0Var);
            k.I i7 = this.f2420H;
            if (i7 != null) {
                i7.j(q0Var);
                return;
            }
            return;
        }
        if (!this.f2422I) {
            i6.a(q0Var);
            return;
        }
        k.I i8 = this.f2420H;
        if (i8 == null) {
            i8 = new k.I();
            this.f2420H = i8;
        }
        i8.a(q0Var);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6) {
        AbstractC1276k.c(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i6, layoutParams, true);
    }

    public C0183g getAccessibilityManager() {
        return this.f2413D;
    }

    /* renamed from: getClipboard, reason: merged with bridge method [inline-methods] */
    public C0185h m6getClipboard() {
        return this.f2434R;
    }

    /* renamed from: getClipboardManager, reason: merged with bridge method [inline-methods] */
    public C0187i m7getClipboardManager() {
        return this.f2433Q;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public k0.b m8getDragAndDropManager() {
        return this.f2471r;
    }

    /* renamed from: getLayoutNodes, reason: merged with bridge method [inline-methods] */
    public C1147A m9getLayoutNodes() {
        return this.f2483x;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0216x getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, int i7) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i6;
        generateDefaultLayoutParams.height = i7;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i6, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
