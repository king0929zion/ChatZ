package w2;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.N;
import i1.AbstractC1087g;
import i2.C1115i;
import java.lang.ref.WeakReference;
import q2.C1503c;
import r2.InterfaceC1632e;

/* renamed from: w2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ComponentCallbacks2C1841k implements ComponentCallbacks2 {

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f15412c;

    /* renamed from: e, reason: collision with root package name */
    public Context f15413e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC1632e f15414f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15415g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15416h = true;

    public ComponentCallbacks2C1841k(C1115i c1115i) {
        this.f15412c = new WeakReference(c1115i);
    }

    public final synchronized void a() {
        try {
            C1115i c1115i = (C1115i) this.f15412c.get();
            if (c1115i == null) {
                b();
            } else if (this.f15414f == null) {
                InterfaceC1632e d6 = c1115i.f12078d.f15406b ? AbstractC1087g.d(c1115i.a, this, c1115i.f12079e) : new N(20);
                this.f15414f = d6;
                this.f15416h = d6.a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f15415g) {
                return;
            }
            this.f15415g = true;
            Context context = this.f15413e;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            InterfaceC1632e interfaceC1632e = this.f15414f;
            if (interfaceC1632e != null) {
                interfaceC1632e.shutdown();
            }
            this.f15412c.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        if (((C1115i) this.f15412c.get()) == null) {
            b();
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i6) {
        C1115i c1115i = (C1115i) this.f15412c.get();
        if (c1115i != null) {
            C1503c c1503c = (C1503c) c1115i.f12077c.getValue();
            if (c1503c != null) {
                c1503c.a.o(i6);
                C0.c cVar = c1503c.f13953b;
                synchronized (cVar) {
                    if (i6 >= 10 && i6 != 20) {
                        cVar.b();
                    }
                }
            }
        } else {
            b();
        }
    }
}
