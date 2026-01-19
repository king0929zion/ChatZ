package t1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import f0.C0987j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: t1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1705h extends C0987j {

    /* renamed from: f, reason: collision with root package name */
    public View f14872f;

    @Override // f0.C0987j
    public final void F() {
        int ime;
        View view = this.f14872f;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController != null) {
            ime = WindowInsets.Type.ime();
            windowInsetsController.show(ime);
        }
        super.F();
    }

        @Override // f0.C0987j
    public final void x() {
        int ime;
        View view = this.f14872f;
        WindowInsetsController windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        if (windowInsetsController == null) {
            super.x();
            return;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        WindowInsetsController.OnControllableInsetsChangedListener r42 = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: t1.g
            @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
            public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i6) {
                atomicBoolean.set((i6 & 8) != 0);
            }
        };
        windowInsetsController.addOnControllableInsetsChangedListener(r42);
        if (!atomicBoolean.get() && view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
        windowInsetsController.removeOnControllableInsetsChangedListener(r42);
        ime = WindowInsets.Type.ime();
        windowInsetsController.hide(ime);
    }
}
