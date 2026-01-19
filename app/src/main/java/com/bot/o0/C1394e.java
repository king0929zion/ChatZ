package o0;

import I0.V0;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.mmkv.R;
import q0.C1496b;
import s0.AbstractC1650a;
import s0.C1651b;

/* renamed from: o0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1394e implements w {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f13459f = true;
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13460b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public C1651b f13461c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13462d;

    /* renamed from: e, reason: collision with root package name */
    public final ComponentCallbacks2C1393d f13463e;

    public C1394e(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        this.a = viewTreeObserverOnGlobalLayoutListenerC0216x;
        ComponentCallbacks2C1393d componentCallbacks2C1393d = new ComponentCallbacks2C1393d(this);
        this.f13463e = componentCallbacks2C1393d;
        if (viewTreeObserverOnGlobalLayoutListenerC0216x.isAttachedToWindow()) {
            Context context = viewTreeObserverOnGlobalLayoutListenerC0216x.getContext();
            if (!this.f13462d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C1393d);
                this.f13462d = true;
            }
        }
        viewTreeObserverOnGlobalLayoutListenerC0216x.addOnAttachStateChangeListener(new V0(this, 2));
    }

    @Override // o0.w
    public final void a(r0.b bVar) {
        synchronized (this.f13460b) {
            if (!bVar.f14551s) {
                bVar.f14551s = true;
                bVar.b();
            }
        }
    }

    @Override // o0.w
    public final r0.b b() {
        r0.d iVar;
        r0.b bVar;
        synchronized (this.f13460b) {
            try {
                ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x = this.a;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 29) {
                    viewTreeObserverOnGlobalLayoutListenerC0216x.getUniqueDrawingId();
                }
                if (i6 >= 29) {
                    iVar = new r0.g();
                } else if (f13459f) {
                    try {
                        iVar = new r0.e(this.a, new r(), new C1496b());
                    } catch (Throwable unused) {
                        f13459f = false;
                        iVar = new r0.i(c(this.a));
                    }
                } else {
                    iVar = new r0.i(c(this.a));
                }
                bVar = new r0.b(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [s0.b, s0.a, android.view.View, android.view.ViewGroup] */
    public final AbstractC1650a c(ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x) {
        C1651b c1651b = this.f13461c;
        if (c1651b != null) {
            return c1651b;
        }
        ViewGroup viewGroup = new ViewGroup(viewTreeObserverOnGlobalLayoutListenerC0216x.getContext());
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewTreeObserverOnGlobalLayoutListenerC0216x.addView((View) viewGroup, -1);
        this.f13461c = viewGroup;
        return viewGroup;
    }
}
