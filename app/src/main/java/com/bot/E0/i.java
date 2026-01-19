package e0;

import M.q;
import android.os.Bundle;
import androidx.lifecycle.C0848w;
import androidx.lifecycle.O;
import java.util.Map;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class i implements f, U1.e {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f11560c;

    /* renamed from: e, reason: collision with root package name */
    public C0848w f11561e;

    /* renamed from: f, reason: collision with root package name */
    public q f11562f;

    public i(g gVar) {
        this.f11560c = gVar;
        Object d6 = gVar.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = d6 instanceof Bundle ? (Bundle) d6 : null;
        if (bundle != null && this.f11562f == null) {
            q qVar = new q(new W1.a(this, new A.b(this, 29)), 27);
            this.f11562f = qVar;
            qVar.s(bundle);
        }
        gVar.e("androidx.savedstate.SavedStateRegistry", new Y3.l(this, 9));
    }

    @Override // e0.f
    public final boolean b(Object obj) {
        return this.f11560c.b(obj);
    }

    @Override // e0.f
    public final Map c() {
        return this.f11560c.c();
    }

    @Override // e0.f
    public final Object d(String str) {
        return this.f11560c.d(str);
    }

    @Override // e0.f
    public final e e(String str, InterfaceC1193a interfaceC1193a) {
        return this.f11560c.e(str, interfaceC1193a);
    }

    @Override // U1.e
    public final q f() {
        q qVar = this.f11562f;
        if (qVar == null) {
            q qVar2 = new q(new W1.a(this, new A.b(this, 29)), 27);
            this.f11562f = qVar2;
            qVar2.s(null);
            qVar = qVar2;
        }
        return (q) qVar.f3180f;
    }

    @Override // androidx.lifecycle.InterfaceC0846u
    public final O g() {
        C0848w c0848w = this.f11561e;
        if (c0848w != null) {
            return c0848w;
        }
        C0848w c0848w2 = new C0848w(this, false);
        this.f11561e = c0848w2;
        return c0848w2;
    }
}
