package b;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0842p;
import androidx.lifecycle.InterfaceC0846u;
import androidx.lifecycle.O;
import java.util.Iterator;
import java.util.ListIterator;
import m4.AbstractC1276k;

/* renamed from: b.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0853B {
    public final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    public final Y3.j f10899b = new Y3.j();

    /* renamed from: c, reason: collision with root package name */
    public u f10900c;

    /* renamed from: d, reason: collision with root package name */
    public final OnBackInvokedCallback f10901d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedDispatcher f10902e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10903f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10904g;

    public C0853B(Runnable runnable) {
        this.a = runnable;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33) {
            this.f10901d = i6 >= 34 ? new y(new v(this, 0), new v(this, 1), new w(this, 0), new w(this, 1)) : new x(0, new w(this, 2));
        }
    }

    public final void a(InterfaceC0846u interfaceC0846u, u uVar) {
        AbstractC1276k.f(interfaceC0846u, "owner");
        AbstractC1276k.f(uVar, "onBackPressedCallback");
        O g3 = interfaceC0846u.g();
        if (g3.g() == EnumC0842p.f10875c) {
            return;
        }
        uVar.f10956b.add(new z(this, g3, uVar));
        e();
        uVar.f10957c = new I.o(0, this, C0853B.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void b() {
        u uVar;
        u uVar2 = this.f10900c;
        if (uVar2 == null) {
            Y3.j jVar = this.f10899b;
            ListIterator listIterator = jVar.listIterator(jVar.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    uVar = 0;
                    break;
                } else {
                    uVar = listIterator.previous();
                    if (((u) uVar).a) {
                        break;
                    }
                }
            }
            uVar2 = uVar;
        }
        this.f10900c = null;
        if (uVar2 != null) {
            uVar2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void c() {
        u uVar;
        u uVar2 = this.f10900c;
        if (uVar2 == null) {
            Y3.j jVar = this.f10899b;
            ListIterator listIterator = jVar.listIterator(jVar.a());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    uVar = 0;
                    break;
                } else {
                    uVar = listIterator.previous();
                    if (((u) uVar).a) {
                        break;
                    }
                }
            }
            uVar2 = uVar;
        }
        this.f10900c = null;
        if (uVar2 != null) {
            uVar2.b();
        } else {
            this.a.run();
        }
    }

    public final void d(boolean z5) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f10902e;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f10901d) == null) {
            return;
        }
        if (z5 && !this.f10903f) {
            AbstractC0863g.h(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10903f = true;
        } else {
            if (z5 || !this.f10903f) {
                return;
            }
            AbstractC0863g.i(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f10903f = false;
        }
    }

    public final void e() {
        boolean z5 = this.f10904g;
        boolean z6 = false;
        Y3.j jVar = this.f10899b;
        if (jVar == null || !jVar.isEmpty()) {
            Iterator it = jVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((u) it.next()).a) {
                    z6 = true;
                    break;
                }
            }
        }
        this.f10904g = z6;
        if (z6 == z5 || Build.VERSION.SDK_INT < 33) {
            return;
        }
        d(z6);
    }
}
