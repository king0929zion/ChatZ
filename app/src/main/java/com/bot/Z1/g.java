package Z1;

import X3.n;
import Y3.l;
import android.content.Context;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final class g implements Y1.b {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9877c;

    /* renamed from: e, reason: collision with root package name */
    public final String f9878e;

    /* renamed from: f, reason: collision with root package name */
    public final C0.c f9879f;

    /* renamed from: g, reason: collision with root package name */
    public final n f9880g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9881h;

    public g(Context context, String str, C0.c cVar) {
        AbstractC1276k.f(context, "context");
        AbstractC1276k.f(cVar, "callback");
        this.f9877c = context;
        this.f9878e = str;
        this.f9879f = cVar;
        this.f9880g = X3.a.d(new l(this, 1));
    }

    @Override // Y1.b
    public final Y1.a G() {
        return ((f) this.f9880g.getValue()).c(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n nVar = this.f9880g;
        if (nVar.a()) {
            ((f) nVar.getValue()).close();
        }
    }

    @Override // Y1.b
    public final String getDatabaseName() {
        return this.f9878e;
    }

    @Override // Y1.b
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        n nVar = this.f9880g;
        if (nVar.a()) {
            ((f) nVar.getValue()).setWriteAheadLoggingEnabled(z5);
        }
        this.f9881h = z5;
    }
}
