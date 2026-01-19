package W1;

import A.b;
import F2.h;
import L1.f;
import U1.e;
import android.os.Bundle;
import androidx.lifecycle.EnumC0842p;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class a {
    public final e a;

    /* renamed from: b, reason: collision with root package name */
    public final b f8851b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8854e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f8855f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8856g;

    /* renamed from: c, reason: collision with root package name */
    public final h f8852c = new h(22);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f8853d = new LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public boolean f8857h = true;

    public a(e eVar, b bVar) {
        this.a = eVar;
        this.f8851b = bVar;
    }

    public final void a() {
        e eVar = this.a;
        if (eVar.g().g() != EnumC0842p.f10876e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f8854e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f8851b.b();
        eVar.g().a(new f(this, 2));
        this.f8854e = true;
    }
}
