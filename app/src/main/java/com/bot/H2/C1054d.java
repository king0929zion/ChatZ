package h2;

import android.app.Activity;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.WindowManager;
import g2.C1017a;
import m4.AbstractC1276k;

/* renamed from: h2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1054d implements InterfaceC1052b, h {

    /* renamed from: b, reason: collision with root package name */
    public static final C1054d f11916b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final C1054d f11917c = new Object();

    @Override // h2.InterfaceC1052b
    public Rect a(Activity activity) {
        Rect bounds = ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        AbstractC1276k.e(bounds, "getBounds(...)");
        return bounds;
    }

    @Override // h2.h
    public C1017a c(ContextWrapper contextWrapper, InterfaceC1055e interfaceC1055e) {
        AbstractC1276k.f(interfaceC1055e, "densityCompatHelper");
        WindowManager windowManager = (WindowManager) contextWrapper.getSystemService(WindowManager.class);
        float f6 = contextWrapper.getResources().getDisplayMetrics().density;
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        AbstractC1276k.e(bounds, "getBounds(...)");
        return new C1017a(bounds, f6);
    }
}
