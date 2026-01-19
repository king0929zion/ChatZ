package i0;

import H0.AbstractC0157l;
import H0.J;
import I0.ViewTreeObserverOnGlobalLayoutListenerC0216x;
import P0.r;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import f0.C0987j;
import k.C1148B;
import k.M;
import m0.C;

/* renamed from: i0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064c extends AbstractC1071j implements m0.l {

    /* renamed from: c, reason: collision with root package name */
    public final C0987j f11940c;

    /* renamed from: e, reason: collision with root package name */
    public final r f11941e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0216x f11942f;

    /* renamed from: g, reason: collision with root package name */
    public final Q0.b f11943g;

    /* renamed from: h, reason: collision with root package name */
    public final String f11944h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f11945i = new Rect();

    /* renamed from: j, reason: collision with root package name */
    public final AutofillId f11946j;

    /* renamed from: k, reason: collision with root package name */
    public final C1148B f11947k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11948l;

    public C1064c(C0987j c0987j, r rVar, ViewTreeObserverOnGlobalLayoutListenerC0216x viewTreeObserverOnGlobalLayoutListenerC0216x, Q0.b bVar, String str) {
        this.f11940c = c0987j;
        this.f11941e = rVar;
        this.f11942f = viewTreeObserverOnGlobalLayoutListenerC0216x;
        this.f11943g = bVar;
        this.f11944h = str;
        viewTreeObserverOnGlobalLayoutListenerC0216x.setImportantForAutofill(1);
        AutofillId autofillId = viewTreeObserverOnGlobalLayoutListenerC0216x.getAutofillId();
        if (autofillId == null) {
            throw B3.e.f("Required value was null.");
        }
        this.f11946j = autofillId;
        this.f11947k = new C1148B();
    }

    @Override // m0.l
    public final void a(C c6, C c7) {
        J v5;
        P0.m x5;
        J v6;
        P0.m x6;
        if (c6 != null && (v6 = AbstractC0157l.v(c6)) != null && (x6 = v6.x()) != null) {
            M m3 = x6.f4492c;
            if (m3.b(P0.l.f4472g) || m3.b(P0.l.f4473h)) {
                ((AutofillManager) this.f11940c.f11690e).notifyViewExited(this.f11942f, v6.f1734e);
            }
        }
        if (c7 == null || (v5 = AbstractC0157l.v(c7)) == null || (x5 = v5.x()) == null) {
            return;
        }
        M m5 = x5.f4492c;
        if (m5.b(P0.l.f4472g) || m5.b(P0.l.f4473h)) {
            int i6 = v5.f1734e;
            this.f11943g.a.i(i6, new C1062a(this, i6));
        }
    }
}
