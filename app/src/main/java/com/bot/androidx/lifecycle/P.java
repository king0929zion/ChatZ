package androidx.lifecycle;

import android.os.Bundle;
import i4.AbstractC1118b;
import java.util.Arrays;
import java.util.Map;
import m4.AbstractC1276k;
import o4.AbstractC1410a;

/* loaded from: classes.dex */
public final class P implements U1.d {
    public final M.q a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10853b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f10854c;

    /* renamed from: d, reason: collision with root package name */
    public final X3.n f10855d;

    public P(M.q qVar, a0 a0Var) {
        AbstractC1276k.f(qVar, "savedStateRegistry");
        this.a = qVar;
        this.f10855d = X3.a.d(new Y3.l(a0Var, 6));
    }

    @Override // U1.d
    public final Bundle a() {
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        Bundle bundle = this.f10854c;
        if (bundle != null) {
            d6.putAll(bundle);
        }
        for (Map.Entry entry : ((Q) this.f10855d.getValue()).f10856b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle a = ((E1.a) ((K) entry.getValue()).f10844b.f1295e).a();
            if (!a.isEmpty()) {
                AbstractC1410a.F(d6, str, a);
            }
        }
        this.f10853b = false;
        return d6;
    }

    public final void b() {
        if (this.f10853b) {
            return;
        }
        Bundle j3 = this.a.j("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle d6 = AbstractC1118b.d((X3.i[]) Arrays.copyOf(new X3.i[0], 0));
        Bundle bundle = this.f10854c;
        if (bundle != null) {
            d6.putAll(bundle);
        }
        if (j3 != null) {
            d6.putAll(j3);
        }
        this.f10854c = d6;
        this.f10853b = true;
    }
}
