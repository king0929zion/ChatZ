package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import b2.C0883a;
import b2.InterfaceC0884b;
import java.util.List;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0884b {
    @Override // b2.InterfaceC0884b
    public final List a() {
        return Y3.v.f9812c;
    }

    @Override // b2.InterfaceC0884b
    public final Object b(Context context) {
        AbstractC1276k.f(context, "context");
        C0883a c6 = C0883a.c(context);
        AbstractC1276k.e(c6, "getInstance(...)");
        if (!c6.f11003b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!r.a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            AbstractC1276k.d(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new C0843q());
        }
        B b5 = B.f10806l;
        b5.getClass();
        b5.f10811h = new Handler();
        b5.f10812i.n(EnumC0841o.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        AbstractC1276k.d(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new A(b5));
        return b5;
    }
}
