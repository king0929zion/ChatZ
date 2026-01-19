package Q;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import i1.EnumC1080D;
import i4.AbstractC1118b;
import i4.AbstractC1121e;
import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;
import n.C1316c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class T0 extends b.n {

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1193a f5518g;

    /* renamed from: h, reason: collision with root package name */
    public C0456q1 f5519h;

    /* renamed from: i, reason: collision with root package name */
    public long f5520i;

    /* renamed from: j, reason: collision with root package name */
    public final View f5521j;

    /* renamed from: k, reason: collision with root package name */
    public final O0 f5522k;

    public T0(InterfaceC1193a interfaceC1193a, C0456q1 c0456q1, long j3, View view, e1.m mVar, InterfaceC0961c interfaceC0961c, UUID uuid, C1316c c1316c, InterfaceC1942y interfaceC1942y) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme));
        this.f5518g = interfaceC1193a;
        this.f5519h = c0456q1;
        this.f5520i = j3;
        this.f5521j = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC1118b.u(window, false);
        O0 o02 = new O0(getContext());
        o02.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        o02.setClipChildren(false);
        o02.setElevation(interfaceC0961c.e0(f6));
        o02.setOutlineProvider(new I0.Y0(1));
        this.f5522k = o02;
        setContentView(o02);
        androidx.lifecycle.O.k(o02, androidx.lifecycle.O.e(view));
        o02.setTag(R.id.view_tree_view_model_store_owner, androidx.lifecycle.O.f(view));
        o02.setTag(R.id.view_tree_saved_state_registry_owner, s4.j.t(view));
        d(this.f5518g, this.f5519h, this.f5520i, mVar);
        window.getDecorView();
        int i6 = Build.VERSION.SDK_INT;
        AbstractC1121e s5 = i6 >= 35 ? new t1.S(window) : i6 >= 30 ? new t1.S(window) : new t1.Q(window);
        this.f5519h.getClass();
        long j4 = this.f5520i;
        long j5 = o0.s.f13480g;
        s5.o(!o0.s.d(j4, j5) && ((double) o0.y.t(j4)) <= 0.5d);
        this.f5519h.getClass();
        long j6 = this.f5520i;
        s5.n(!o0.s.d(j6, j5) && ((double) o0.y.t(j6)) <= 0.5d);
        this.f10953f.a(this, new S0(this.f5519h.f6052b, interfaceC1942y, c1316c, new A.b(this, 24)));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(InterfaceC1193a interfaceC1193a, C0456q1 c0456q1, long j3, e1.m mVar) {
        this.f5518g = interfaceC1193a;
        this.f5519h = c0456q1;
        this.f5520i = j3;
        EnumC1080D enumC1080D = c0456q1.a;
        ViewGroup.LayoutParams layoutParams = this.f5521j.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i6 = 1;
        boolean z5 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = enumC1080D.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z5 = true;
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                z5 = false;
            }
        }
        Window window = getWindow();
        AbstractC1276k.c(window);
        window.setFlags(z5 ? 8192 : -8193, 8192);
        int ordinal2 = mVar.ordinal();
        if (ordinal2 == 0) {
            i6 = 0;
        } else if (ordinal2 != 1) {
            throw new RuntimeException();
        }
        this.f5522k.setLayoutDirection(i6);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f5518g.b();
        }
        return onTouchEvent;
    }
}
