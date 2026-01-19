package com.bot;

import A4.g0;
import F0.F;
import G2.a;
import G2.d;
import I0.C0202p0;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.W;
import b.C0855D;
import b.C0856E;
import b.C0867k;
import b.m;
import b.o;
import b0.C0873f;
import c.i;
import d.C0932a;
import e.f;
import e.h;
import f.C0970a;
import f0.C0987j;
import i4.AbstractC1117a;
import i4.AbstractC1120d;
import i4.AbstractC1121e;
import java.util.LinkedHashMap;
import m4.AbstractC1276k;
import m4.AbstractC1289x;
import o0.s;
import o0.y;
import o3.InterfaceC1409a;
import o3.e;
import p3.C1487b;
import r3.b;
import s3.C1670b;
import s4.j;
import x2.C1867c;
import x2.C1873i;
import x2.C1874j;

/* loaded from: classes.dex */
public final class MainActivity extends m implements b {

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f11132D = 0;

    /* renamed from: B, reason: collision with root package name */
    public d f11134B;

    /* renamed from: C, reason: collision with root package name */
    public final h f11135C;

    /* renamed from: x, reason: collision with root package name */
    public C0987j f11136x;

    /* renamed from: y, reason: collision with root package name */
    public volatile C1487b f11137y;

    /* renamed from: z, reason: collision with root package name */
    public final Object f11138z = new Object();

    /* renamed from: A, reason: collision with root package name */
    public boolean f11133A = false;

    public MainActivity() {
        C1873i c1873i = new C1873i(this);
        C0932a c0932a = this.f10933e;
        c0932a.getClass();
        m mVar = c0932a.f11381b;
        if (mVar != null) {
            c1873i.a(mVar);
        }
        c0932a.a.add(c1873i);
        final C0970a c0970a = new C0970a(4);
        final F f6 = new F(18);
        final C0867k c0867k = this.f10940l;
        AbstractC1276k.f(c0867k, "registry");
        final String str = "activity_rq#" + this.f10939k.getAndIncrement();
        LinkedHashMap linkedHashMap = c0867k.f10923c;
        AbstractC1276k.f(str, "key");
        C0848w c0848w = this.f10932c;
        if (c0848w.f10884g.compareTo(EnumC0842p.f10878g) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + c0848w.f10884g + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        c0867k.c(str);
        f fVar = (f) linkedHashMap.get(str);
        fVar = fVar == null ? new f(c0848w) : fVar;
        InterfaceC0844s interfaceC0844s = new InterfaceC0844s() { // from class: e.d
            @Override // androidx.lifecycle.InterfaceC0844s
            public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
                EnumC0841o enumC0841o2 = EnumC0841o.ON_START;
                C0867k c0867k2 = C0867k.this;
                String str2 = str;
                if (enumC0841o2 != enumC0841o) {
                    if (EnumC0841o.ON_STOP == enumC0841o) {
                        c0867k2.f10925e.remove(str2);
                        return;
                    } else {
                        if (EnumC0841o.ON_DESTROY == enumC0841o) {
                            c0867k2.d(str2);
                            return;
                        }
                        return;
                    }
                }
                LinkedHashMap linkedHashMap2 = c0867k2.f10925e;
                Bundle bundle = c0867k2.f10927g;
                LinkedHashMap linkedHashMap3 = c0867k2.f10926f;
                F f7 = f6;
                C0970a c0970a2 = c0970a;
                linkedHashMap2.put(str2, new e(f7, c0970a2));
                if (linkedHashMap3.containsKey(str2)) {
                    Object obj = linkedHashMap3.get(str2);
                    linkedHashMap3.remove(str2);
                    f7.a(obj);
                }
                C0954b c0954b = (C0954b) AbstractC1117a.q(str2, bundle);
                if (c0954b != null) {
                    bundle.remove(str2);
                    f7.a(c0970a2.M(c0954b.f11522e, c0954b.f11521c));
                }
            }
        };
        fVar.a.a(interfaceC0844s);
        fVar.f11528b.add(interfaceC0844s);
        linkedHashMap.put(str, fVar);
        this.f11135C = new h(c0867k, str, c0970a, 0);
    }

    @Override // r3.b
    public final Object b() {
        return l().b();
    }

    @Override // androidx.lifecycle.InterfaceC0837k
    public final W c() {
        W w5 = (W) this.f10949u.getValue();
        C1867c c1867c = (C1867c) ((InterfaceC1409a) AbstractC1120d.o(this, InterfaceC1409a.class));
        C1670b a = c1867c.a();
        C0987j c0987j = new C0987j(c1867c.a, c1867c.f15569b);
        w5.getClass();
        return new e(a, w5, c0987j);
    }

    public final C1487b l() {
        if (this.f11137y == null) {
            synchronized (this.f11138z) {
                try {
                    if (this.f11137y == null) {
                        this.f11137y = new C1487b(this, 0);
                    }
                } finally {
                }
            }
        }
        return this.f11137y;
    }

    public final d m() {
        d dVar = this.f11134B;
        if (dVar != null) {
            return dVar;
        }
        AbstractC1276k.k("preferencesManager");
        throw null;
    }

    public final void n(Bundle bundle) {
        super.onCreate(bundle);
        if (getApplication() instanceof b) {
            C1487b c1487b = (C1487b) l().f13910g;
            C0987j c0987j = ((p3.d) C1487b.c(c1487b.f13908e, (MainActivity) c1487b.f13910g).a(AbstractC1289x.a(p3.d.class))).f13913c;
            this.f11136x = c0987j;
            if (((F1.f) c0987j.f11690e) == null) {
                c0987j.f11690e = d();
            }
        }
    }

    public final void o() {
        C0855D c0855d = C0855D.f10906g;
        C0855D c0855d2 = C0855D.f10905f;
        boolean z5 = false;
        boolean z6 = (getResources().getConfiguration().uiMode & 48) == 32;
        int ordinal = ((G2.e) m().f1654c.getValue()).ordinal();
        if (ordinal == 0) {
            z5 = z6;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            z5 = true;
        }
        if (z5) {
            long j3 = s.f13480g;
            int B5 = y.B(j3);
            C0856E c0856e = new C0856E(B5, B5, 2, c0855d2);
            int B6 = y.B(j3);
            o.a(this, c0856e, new C0856E(B6, B6, 2, c0855d2));
        } else {
            long j4 = s.f13480g;
            o.a(this, new C0856E(y.B(j4), y.B(j4), 1, c0855d), new C0856E(y.B(j4), y.B(j4), 1, c0855d));
        }
        if (Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
            getWindow().setStatusBarContrastEnforced(false);
        }
        Window window = getWindow();
        long j5 = s.f13480g;
        window.setStatusBarColor(y.B(j5));
        getWindow().setNavigationBarColor(y.B(j5));
    }

    @Override // b.m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        n(bundle);
        a aVar = (a) m().f1657f.f201c.getValue();
        N n3 = i5.a.a;
        String str = aVar.f1651c;
        int i6 = 0;
        n3.getClass();
        N.k(new Object[0]);
        d m3 = m();
        g0 g0Var = m3.f1656e;
        if (g0Var.getValue() == a.f1647f) {
            m3.c();
        } else {
            m3.a(((a) g0Var.getValue()).f1652e);
        }
        try {
            o();
            N.k(new Object[0]);
        } catch (Exception e6) {
            N n5 = i5.a.a;
            e6.getMessage();
            n5.getClass();
            N.o(new Object[0]);
        }
        i5.a.a.getClass();
        N.v(new Object[0]);
        if (Build.VERSION.SDK_INT >= 33) {
            if (AbstractC1121e.g(this, "android.permission.POST_NOTIFICATIONS") == 0) {
                N.k(new Object[0]);
            } else {
                boolean shouldShowRequestPermissionRationale = shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS");
                h hVar = this.f11135C;
                if (shouldShowRequestPermissionRationale) {
                    N.k(new Object[0]);
                    hVar.n0("android.permission.POST_NOTIFICATIONS");
                } else {
                    hVar.n0("android.permission.POST_NOTIFICATIONS");
                }
            }
        }
        C0873f c0873f = new C0873f(new C1874j(this, i6), true, 1303462078);
        ViewGroup.LayoutParams layoutParams = i.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        C0202p0 c0202p0 = childAt instanceof C0202p0 ? (C0202p0) childAt : null;
        if (c0202p0 != null) {
            c0202p0.setParentCompositionContext(null);
            c0202p0.setContent(c0873f);
        } else {
            C0202p0 c0202p02 = new C0202p0(this);
            c0202p02.setParentCompositionContext(null);
            c0202p02.setContent(c0873f);
            View decorView = getWindow().getDecorView();
            if (O.e(decorView) == null) {
                O.k(decorView, this);
            }
            if (O.f(decorView) == null) {
                decorView.setTag(com.tencent.mmkv.R.id.view_tree_view_model_store_owner, this);
            }
            if (j.t(decorView) == null) {
                decorView.setTag(com.tencent.mmkv.R.id.view_tree_saved_state_registry_owner, this);
            }
            setContentView(c0202p02, i.a);
        }
        N.k(new Object[0]);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        C0987j c0987j = this.f11136x;
        if (c0987j != null) {
            c0987j.f11690e = null;
        }
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
    }
}
