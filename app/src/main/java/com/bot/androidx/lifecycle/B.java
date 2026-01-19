package androidx.lifecycle;

import android.os.Handler;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class B implements InterfaceC0846u {

    /* renamed from: l, reason: collision with root package name */
    public static final B f10806l = new B();

    /* renamed from: c, reason: collision with root package name */
    public int f10807c;

    /* renamed from: e, reason: collision with root package name */
    public int f10808e;

    /* renamed from: h, reason: collision with root package name */
    public Handler f10811h;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10809f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10810g = true;

    /* renamed from: i, reason: collision with root package name */
    public final C0848w f10812i = new C0848w(this, true);

    /* renamed from: j, reason: collision with root package name */
    public final I.h f10813j = new I.h(this, 4);

    /* renamed from: k, reason: collision with root package name */
    public final Y f10814k = new Y(this);

    public final void b() {
        int i6 = this.f10808e + 1;
        this.f10808e = i6;
        if (i6 == 1) {
            if (this.f10809f) {
                this.f10812i.n(EnumC0841o.ON_RESUME);
                this.f10809f = false;
            } else {
                Handler handler = this.f10811h;
                AbstractC1276k.c(handler);
                handler.removeCallbacks(this.f10813j);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0846u
    public final O g() {
        return this.f10812i;
    }
}
