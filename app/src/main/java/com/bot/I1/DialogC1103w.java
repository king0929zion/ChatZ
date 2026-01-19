package i1;

import I0.Y0;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.O;
import b.C0853B;
import com.tencent.mmkv.R;
import e1.InterfaceC0961c;
import i4.AbstractC1118b;
import java.util.UUID;
import l4.InterfaceC1193a;
import m4.AbstractC1276k;

/* renamed from: i1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogC1103w extends b.n {

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC1193a f12021g;

    /* renamed from: h, reason: collision with root package name */
    public C1102v f12022h;

    /* renamed from: i, reason: collision with root package name */
    public final View f12023i;

    /* renamed from: j, reason: collision with root package name */
    public final C1101u f12024j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12025k;

    public DialogC1103w(InterfaceC1193a interfaceC1193a, C1102v c1102v, View view, e1.m mVar, InterfaceC0961c interfaceC0961c, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), c1102v.f12019e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme));
        this.f12021g = interfaceC1193a;
        this.f12022h = c1102v;
        this.f12023i = view;
        float f6 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        AbstractC1118b.u(window, this.f12022h.f12019e);
        window.setGravity(17);
        if (!this.f12022h.f12019e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 28) {
                C1096p.a.a(attributes);
            }
            if (i6 >= 30) {
                C1097q c1097q = C1097q.a;
                c1097q.b(attributes, 0);
                c1097q.c(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        C1101u c1101u = new C1101u(getContext(), window);
        setTitle(this.f12022h.f12020f);
        c1101u.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        c1101u.setClipChildren(false);
        c1101u.setElevation(interfaceC0961c.e0(f6));
        c1101u.setOutlineProvider(new Y0(2));
        this.f12024j = c1101u;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(c1101u);
        O.k(c1101u, O.e(view));
        c1101u.setTag(R.id.view_tree_view_model_store_owner, O.f(view));
        c1101u.setTag(R.id.view_tree_saved_state_registry_owner, s4.j.t(view));
        e(this.f12021g, this.f12022h, mVar);
        C0853B c0853b = this.f10953f;
        C1081a c1081a = new C1081a(this, 1);
        AbstractC1276k.f(c0853b, "<this>");
        c0853b.a(this, new I1.n(c1081a));
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof C1101u) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = viewGroup.getChildAt(i6);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void e(InterfaceC1193a interfaceC1193a, C1102v c1102v, e1.m mVar) {
        int i6;
        this.f12021g = interfaceC1193a;
        this.f12022h = c1102v;
        EnumC1080D enumC1080D = c1102v.f12017c;
        boolean b5 = AbstractC1094n.b(this.f12023i);
        int ordinal = enumC1080D.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b5 = true;
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                b5 = false;
            }
        }
        Window window = getWindow();
        AbstractC1276k.c(window);
        window.setFlags(b5 ? 8192 : -8193, 8192);
        int ordinal2 = mVar.ordinal();
        if (ordinal2 == 0) {
            i6 = 0;
        } else {
            if (ordinal2 != 1) {
                throw new RuntimeException();
            }
            i6 = 1;
        }
        C1101u c1101u = this.f12024j;
        c1101u.setLayoutDirection(i6);
        boolean z5 = c1102v.f12019e;
        boolean z6 = c1102v.f12018d;
        Window window2 = c1101u.f12010l;
        boolean z7 = (c1101u.f12014p && z6 == c1101u.f12012n && z5 == c1101u.f12013o) ? false : true;
        c1101u.f12012n = z6;
        c1101u.f12013o = z5;
        if (z7) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i7 = z6 ? -2 : -1;
            if (i7 != attributes.width || !c1101u.f12014p) {
                window2.setLayout(i7, -2);
                c1101u.f12014p = true;
            }
        }
        setCanceledOnTouchOutside(c1102v.f12016b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z5 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i6, KeyEvent keyEvent) {
        if (!this.f12022h.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i6 != 111) {
            return super.onKeyUp(i6, keyEvent);
        }
        this.f12021g.b();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            i1.v r1 = r9.f12022h
            boolean r1 = r1.f12016b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L8b
            i1.u r1 = r9.f12024j
            r1.getClass()
            float r5 = r10.getX()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            float r5 = r10.getY()
            boolean r6 = java.lang.Float.isInfinite(r5)
            if (r6 != 0) goto L6e
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L6e
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L39
            goto L6e
        L39:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = o4.AbstractC1410a.K(r5)
            if (r7 > r5) goto L6e
            if (r5 > r6) goto L6e
            float r5 = r10.getY()
            int r5 = o4.AbstractC1410a.K(r5)
            if (r8 > r5) goto L6e
            if (r5 > r1) goto L6e
            goto L8b
        L6e:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L88
            if (r10 == r4) goto L7c
            if (r10 == r2) goto L79
            goto L95
        L79:
            r9.f12025k = r3
            return r0
        L7c:
            boolean r10 = r9.f12025k
            if (r10 == 0) goto L95
            l4.a r10 = r9.f12021g
            r10.b()
            r9.f12025k = r3
            return r4
        L88:
            r9.f12025k = r4
            return r4
        L8b:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L96
            if (r10 == r4) goto L96
            if (r10 == r2) goto L96
        L95:
            return r0
        L96:
            r9.f12025k = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.DialogC1103w.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
