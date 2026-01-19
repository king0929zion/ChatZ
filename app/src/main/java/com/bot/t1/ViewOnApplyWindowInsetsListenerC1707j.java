package t1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: t1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC1707j implements View.OnApplyWindowInsetsListener {
    public P a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1702e f14874c;

    public ViewOnApplyWindowInsetsListenerC1707j(View view, InterfaceC1702e interfaceC1702e) {
        this.f14873b = view;
        this.f14874c = interfaceC1702e;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        P c6 = P.c(view, windowInsets);
        int i6 = Build.VERSION.SDK_INT;
        InterfaceC1702e interfaceC1702e = this.f14874c;
        if (i6 < 30) {
            AbstractC1708k.a(windowInsets, this.f14873b);
            if (c6.equals(this.a)) {
                return interfaceC1702e.a(view, c6).b();
            }
        }
        this.a = c6;
        P a = interfaceC1702e.a(view, c6);
        if (i6 >= 30) {
            return a.b();
        }
        int i7 = AbstractC1713p.a;
        AbstractC1706i.a(view);
        return a.b();
    }
}
