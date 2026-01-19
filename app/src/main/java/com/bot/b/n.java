package b;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.EnumC0841o;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import com.tencent.mmkv.R;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public abstract class n extends Dialog implements InterfaceC0846u, InterfaceC0854C, U1.e {

    /* renamed from: c, reason: collision with root package name */
    public C0848w f10951c;

    /* renamed from: e, reason: collision with root package name */
    public final M.q f10952e;

    /* renamed from: f, reason: collision with root package name */
    public final C0853B f10953f;

    public n(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, 0);
        this.f10952e = new M.q(new W1.a(this, new A.b(this, 29)), 27);
        this.f10953f = new C0853B(new I.h(this, 7));
    }

    public static void b(n nVar) {
        super.onBackPressed();
    }

    @Override // b.InterfaceC0854C
    public final C0853B a() {
        return this.f10953f;
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1276k.f(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        AbstractC1276k.c(window);
        View decorView = window.getDecorView();
        AbstractC1276k.e(decorView, "window!!.decorView");
        O.k(decorView, this);
        Window window2 = getWindow();
        AbstractC1276k.c(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1276k.e(decorView2, "window!!.decorView");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC1276k.c(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1276k.e(decorView3, "window!!.decorView");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // U1.e
    public final M.q f() {
        return (M.q) this.f10952e.f3180f;
    }

    @Override // androidx.lifecycle.InterfaceC0846u
    public final O g() {
        C0848w c0848w = this.f10951c;
        if (c0848w != null) {
            return c0848w;
        }
        C0848w c0848w2 = new C0848w(this, true);
        this.f10951c = c0848w2;
        return c0848w2;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f10953f.c();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1276k.e(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C0853B c0853b = this.f10953f;
            c0853b.f10902e = onBackInvokedDispatcher;
            c0853b.d(c0853b.f10904g);
        }
        this.f10952e.s(bundle);
        C0848w c0848w = this.f10951c;
        if (c0848w == null) {
            c0848w = new C0848w(this, true);
            this.f10951c = c0848w;
        }
        c0848w.n(EnumC0841o.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC1276k.e(onSaveInstanceState, "super.onSaveInstanceState()");
        this.f10952e.t(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0848w c0848w = this.f10951c;
        if (c0848w == null) {
            c0848w = new C0848w(this, true);
            this.f10951c = c0848w;
        }
        c0848w.n(EnumC0841o.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0848w c0848w = this.f10951c;
        if (c0848w == null) {
            c0848w = new C0848w(this, true);
            this.f10951c = c0848w;
        }
        c0848w.n(EnumC0841o.ON_DESTROY);
        this.f10951c = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public final void setContentView(int i6) {
        c();
        super.setContentView(i6);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        AbstractC1276k.f(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1276k.f(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
