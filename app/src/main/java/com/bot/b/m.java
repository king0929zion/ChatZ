package b;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.H;
import androidx.lifecycle.InterfaceC0837k;
import androidx.lifecycle.InterfaceC0844s;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.J;
import androidx.lifecycle.N;
import androidx.lifecycle.O;
import androidx.lifecycle.V;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import com.bot.MainActivity;
import com.tencent.mmkv.R;
import d.C0932a;
import d.InterfaceC0933b;
import f0.C0987j;
import i4.AbstractC1117a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import m4.AbstractC1291z;
import o4.AbstractC1410a;
import s1.InterfaceC1652a;

/* loaded from: classes.dex */
public abstract class m extends Activity implements a0, InterfaceC0837k, U1.e, InterfaceC0854C, e.i, InterfaceC0846u {
    private static final C0864h Companion = new Object();

    /* renamed from: w */
    public static final /* synthetic */ int f10931w = 0;

    /* renamed from: c */
    public final C0848w f10932c = new C0848w(this, true);

    /* renamed from: e */
    public final C0932a f10933e;

    /* renamed from: f */
    public final C0987j f10934f;

    /* renamed from: g */
    public final M.q f10935g;

    /* renamed from: h */
    public Z f10936h;

    /* renamed from: i */
    public final ViewTreeObserverOnDrawListenerC0866j f10937i;

    /* renamed from: j */
    public final X3.n f10938j;

    /* renamed from: k */
    public final AtomicInteger f10939k;

    /* renamed from: l */
    public final C0867k f10940l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f10941m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f10942n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f10943o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f10944p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f10945q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f10946r;

    /* renamed from: s */
    public boolean f10947s;

    /* renamed from: t */
    public boolean f10948t;

    /* renamed from: u */
    public final X3.n f10949u;

    /* renamed from: v */
    public final X3.n f10950v;

    public m() {
        C0932a c0932a = new C0932a();
        this.f10933e = c0932a;
        final MainActivity mainActivity = (MainActivity) this;
        this.f10934f = new C0987j(19);
        W1.a aVar = new W1.a(this, new A.b(this, 29));
        M.q qVar = new M.q(aVar, 27);
        this.f10935g = qVar;
        this.f10937i = new ViewTreeObserverOnDrawListenerC0866j(mainActivity);
        this.f10938j = X3.a.d(new l(mainActivity, 2));
        this.f10939k = new AtomicInteger();
        this.f10940l = new C0867k(mainActivity);
        this.f10941m = new CopyOnWriteArrayList();
        this.f10942n = new CopyOnWriteArrayList();
        this.f10943o = new CopyOnWriteArrayList();
        this.f10944p = new CopyOnWriteArrayList();
        this.f10945q = new CopyOnWriteArrayList();
        this.f10946r = new CopyOnWriteArrayList();
        C0848w c0848w = this.f10932c;
        if (c0848w == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i6 = 0;
        c0848w.a(new InterfaceC0844s() { // from class: b.d
            @Override // androidx.lifecycle.InterfaceC0844s
            public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
                Window window;
                View peekDecorView;
                switch (i6) {
                    case 0:
                        MainActivity mainActivity2 = mainActivity;
                        if (enumC0841o != EnumC0841o.ON_STOP || (window = mainActivity2.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        MainActivity mainActivity3 = mainActivity;
                        if (enumC0841o == EnumC0841o.ON_DESTROY) {
                            mainActivity3.f10933e.f11381b = null;
                            if (!mainActivity3.isChangingConfigurations()) {
                                mainActivity3.e().a();
                            }
                            ViewTreeObserverOnDrawListenerC0866j viewTreeObserverOnDrawListenerC0866j = mainActivity3.f10937i;
                            MainActivity mainActivity4 = viewTreeObserverOnDrawListenerC0866j.f10921g;
                            mainActivity4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0866j);
                            mainActivity4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0866j);
                            return;
                        }
                        return;
                }
            }
        });
        final int i7 = 1;
        this.f10932c.a(new InterfaceC0844s() { // from class: b.d
            @Override // androidx.lifecycle.InterfaceC0844s
            public final void d(InterfaceC0846u interfaceC0846u, EnumC0841o enumC0841o) {
                Window window;
                View peekDecorView;
                switch (i7) {
                    case 0:
                        MainActivity mainActivity2 = mainActivity;
                        if (enumC0841o != EnumC0841o.ON_STOP || (window = mainActivity2.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
                            return;
                        }
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    default:
                        MainActivity mainActivity3 = mainActivity;
                        if (enumC0841o == EnumC0841o.ON_DESTROY) {
                            mainActivity3.f10933e.f11381b = null;
                            if (!mainActivity3.isChangingConfigurations()) {
                                mainActivity3.e().a();
                            }
                            ViewTreeObserverOnDrawListenerC0866j viewTreeObserverOnDrawListenerC0866j = mainActivity3.f10937i;
                            MainActivity mainActivity4 = viewTreeObserverOnDrawListenerC0866j.f10921g;
                            mainActivity4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0866j);
                            mainActivity4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0866j);
                            return;
                        }
                        return;
                }
            }
        });
        this.f10932c.a(new U1.b(mainActivity, i7));
        aVar.a();
        O.d(this);
        ((M.q) qVar.f3180f).u("android:support:activity-result", new E1.a(mainActivity, 2));
        InterfaceC0933b interfaceC0933b = new InterfaceC0933b() { // from class: b.e
            @Override // d.InterfaceC0933b
            public final void a(m mVar) {
                AbstractC1276k.f(mVar, "it");
                MainActivity mainActivity2 = MainActivity.this;
                Bundle j3 = ((M.q) mainActivity2.f10935g.f3180f).j("android:support:activity-result");
                if (j3 != null) {
                    C0867k c0867k = mainActivity2.f10940l;
                    LinkedHashMap linkedHashMap = c0867k.f10922b;
                    LinkedHashMap linkedHashMap2 = c0867k.a;
                    Bundle bundle = c0867k.f10927g;
                    ArrayList<Integer> integerArrayList = j3.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = j3.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = j3.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0867k.f10924d.addAll(stringArrayList2);
                    }
                    Bundle bundle2 = j3.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    if (bundle2 != null) {
                        bundle.putAll(bundle2);
                    }
                    int size = stringArrayList.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        String str = stringArrayList.get(i8);
                        if (linkedHashMap.containsKey(str)) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (!bundle.containsKey(str)) {
                                AbstractC1291z.a(linkedHashMap2).remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i8);
                        AbstractC1276k.e(num2, "rcs[i]");
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i8);
                        AbstractC1276k.e(str2, "keys[i]");
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        c0867k.f10922b.put(str3, Integer.valueOf(intValue));
                    }
                }
            }
        };
        m mVar = c0932a.f11381b;
        if (mVar != null) {
            interfaceC0933b.a(mVar);
        }
        c0932a.a.add(interfaceC0933b);
        this.f10949u = X3.a.d(new l(mainActivity, 0));
        this.f10950v = X3.a.d(new l(mainActivity, 3));
    }

    public static final /* synthetic */ void h(MainActivity mainActivity) {
        super.onBackPressed();
    }

    @Override // b.InterfaceC0854C
    public final C0853B a() {
        return (C0853B) this.f10950v.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        this.f10937i.a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0837k
    public final F1.f d() {
        F1.f fVar = new F1.f();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = fVar.a;
        if (application != null) {
            Application application2 = getApplication();
            AbstractC1276k.e(application2, "application");
            linkedHashMap.put(V.f10863d, application2);
        }
        linkedHashMap.put(O.a, this);
        linkedHashMap.put(O.f10850b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(O.f10851c, extras);
        }
        return fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, t1.o] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.m.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC1276k.f(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        if (AbstractC1117a.k(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // androidx.lifecycle.a0
    public final Z e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f10936h == null) {
            C0865i c0865i = (C0865i) getLastNonConfigurationInstance();
            if (c0865i != null) {
                this.f10936h = c0865i.a;
            }
            if (this.f10936h == null) {
                this.f10936h = new Z();
            }
        }
        Z z5 = this.f10936h;
        AbstractC1276k.c(z5);
        return z5;
    }

    @Override // U1.e
    public final M.q f() {
        return (M.q) this.f10935g.f3180f;
    }

    @Override // androidx.lifecycle.InterfaceC0846u
    public final O g() {
        return this.f10932c;
    }

    public final void i() {
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        O.k(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1276k.e(decorView2, "window.decorView");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC1276k.e(decorView3, "window.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC1276k.e(decorView4, "window.decorView");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC1276k.e(decorView5, "window.decorView");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public final void j(Bundle bundle) {
        super.onCreate(bundle);
        int i6 = J.f10842e;
        H.b(this);
    }

    public final void k(Bundle bundle) {
        AbstractC1276k.f(bundle, "outState");
        this.f10932c.p(EnumC0842p.f10877f);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i6, int i7, Intent intent) {
        if (this.f10940l.a(i6, i7, intent)) {
            return;
        }
        super.onActivityResult(i6, i7, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        a().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        AbstractC1276k.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f10941m.iterator();
        while (it.hasNext()) {
            ((InterfaceC1652a) it.next()).accept(configuration);
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f10935g.s(bundle);
        C0932a c0932a = this.f10933e;
        c0932a.getClass();
        c0932a.f11381b = this;
        Iterator it = c0932a.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0933b) it.next()).a(this);
        }
        j(bundle);
        int i6 = J.f10842e;
        H.b(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i6, Menu menu) {
        AbstractC1276k.f(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i6, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f10934f.f11690e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        AbstractC1276k.f(menuItem, "item");
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.f10934f.f11690e).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5) {
        if (this.f10947s) {
            return;
        }
        Iterator it = this.f10944p.iterator();
        while (it.hasNext()) {
            ((InterfaceC1652a) it.next()).accept(new N(14));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        AbstractC1276k.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f10943o.iterator();
        while (it.hasNext()) {
            ((InterfaceC1652a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i6, Menu menu) {
        AbstractC1276k.f(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f10934f.f11690e).iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i6, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5) {
        if (this.f10948t) {
            return;
        }
        Iterator it = this.f10945q.iterator();
        while (it.hasNext()) {
            ((InterfaceC1652a) it.next()).accept(new N(15));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i6, View view, Menu menu) {
        AbstractC1276k.f(menu, "menu");
        if (i6 != 0) {
            return true;
        }
        super.onPreparePanel(i6, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.f10934f.f11690e).iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        AbstractC1276k.f(strArr, "permissions");
        AbstractC1276k.f(iArr, "grantResults");
        if (this.f10940l.a(i6, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b.i] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0865i c0865i;
        Z z5 = this.f10936h;
        if (z5 == null && (c0865i = (C0865i) getLastNonConfigurationInstance()) != null) {
            z5 = c0865i.a;
        }
        if (z5 == null) {
            return null;
        }
        Object obj = new Object();
        obj.a = z5;
        return obj;
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC1276k.f(bundle, "outState");
        C0848w c0848w = this.f10932c;
        if (c0848w != null) {
            c0848w.p(EnumC0842p.f10877f);
        }
        k(bundle);
        this.f10935g.t(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i6) {
        super.onTrimMemory(i6);
        Iterator it = this.f10942n.iterator();
        while (it.hasNext()) {
            ((InterfaceC1652a) it.next()).accept(Integer.valueOf(i6));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f10946r.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC1410a.y()) {
                AbstractC1410a.g("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            t tVar = (t) this.f10938j.getValue();
            synchronized (tVar.a) {
                try {
                    tVar.f10954b = true;
                    ArrayList arrayList = tVar.f10955c;
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        ((InterfaceC1193a) obj).b();
                    }
                    tVar.f10955c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i6) {
        i();
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        this.f10937i.a(decorView);
        super.setContentView(i6);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i6) {
        AbstractC1276k.f(intent, "intent");
        super.startActivityForResult(intent, i6);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9) {
        AbstractC1276k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i6, Bundle bundle) {
        AbstractC1276k.f(intent, "intent");
        super.startActivityForResult(intent, i6, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i6, Intent intent, int i7, int i8, int i9, Bundle bundle) {
        AbstractC1276k.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i6, intent, i7, i8, i9, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        i();
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        this.f10937i.a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z5, Configuration configuration) {
        AbstractC1276k.f(configuration, "newConfig");
        this.f10947s = true;
        try {
            super.onMultiWindowModeChanged(z5, configuration);
            this.f10947s = false;
            Iterator it = this.f10944p.iterator();
            while (it.hasNext()) {
                ((InterfaceC1652a) it.next()).accept(new N(14));
            }
        } catch (Throwable th) {
            this.f10947s = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z5, Configuration configuration) {
        AbstractC1276k.f(configuration, "newConfig");
        this.f10948t = true;
        try {
            super.onPictureInPictureModeChanged(z5, configuration);
            this.f10948t = false;
            Iterator it = this.f10945q.iterator();
            while (it.hasNext()) {
                ((InterfaceC1652a) it.next()).accept(new N(15));
            }
        } catch (Throwable th) {
            this.f10948t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        i();
        View decorView = getWindow().getDecorView();
        AbstractC1276k.e(decorView, "window.decorView");
        this.f10937i.a(decorView);
        super.setContentView(view, layoutParams);
    }
}
