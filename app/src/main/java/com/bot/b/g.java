package B;

import H0.AbstractC0157l;
import H0.F0Inner;
import P0.v;
import P0.x;
import R.Z;
import android.view.autofill.AutofillValue;
import i0.C1067f;
import m4.AbstractC1276k;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements l4.c {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f354c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x f355e;

    public /* synthetic */ g(x xVar, int i6) {
        this.f354c = i6;
        this.f355e = xVar;
    }

    @Override // l4.c
    public final Object f(Object obj) {
        boolean z5;
        boolean z6;
        switch (this.f354c) {
            case 0:
                AutofillValue autofillValue = ((C1067f) obj).a;
                Boolean valueOf = autofillValue.isToggle() ? Boolean.valueOf(autofillValue.getToggleValue()) : null;
                if (valueOf != null) {
                    v.g(this.f355e, valueOf.booleanValue() ? R0.a.f6850c : R0.a.f6851e);
                    z5 = true;
                } else {
                    z5 = false;
                }
                return Boolean.valueOf(z5);
            case 1:
                AutofillValue autofillValue2 = ((C1067f) obj).a;
                Boolean valueOf2 = autofillValue2.isToggle() ? Boolean.valueOf(autofillValue2.getToggleValue()) : null;
                if (valueOf2 != null) {
                    v.g(this.f355e, valueOf2.booleanValue() ? R0.a.f6850c : R0.a.f6851e);
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                F0 f02 = (F0) obj;
                AbstractC1276k.d(f02, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                Z z7 = (Z) f02;
                z7.f6733s = true;
                z7.f6732r.f(this.f355e);
                AbstractC0157l.m(z7);
                return Boolean.FALSE;
        }
    }
}
