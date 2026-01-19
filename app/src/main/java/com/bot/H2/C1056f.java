package h2;

import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import g2.C1017a;
import m4.AbstractC1276k;

/* renamed from: h2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1056f implements InterfaceC1055e, h {

    /* renamed from: b, reason: collision with root package name */
    public static final C1056f f11918b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C1056f f11919c = new Object();

    @Override // h2.InterfaceC1055e
    public float b(ContextWrapper contextWrapper) {
        return ((WindowManager) contextWrapper.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }

    @Override // h2.h
    public C1017a c(ContextWrapper contextWrapper, InterfaceC1055e interfaceC1055e) {
        AbstractC1276k.f(interfaceC1055e, "densityCompatHelper");
        WindowManager windowManager = contextWrapper.isUiContext() ? (WindowManager) contextWrapper.getSystemService(WindowManager.class) : (WindowManager) contextWrapper.getApplicationContext().getSystemService(WindowManager.class);
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        AbstractC1276k.e(bounds, "getBounds(...)");
        return new C1017a(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
}
