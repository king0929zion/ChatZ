package h1;

import android.view.View;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class w extends AbstractC1040q implements m0.v {
    @Override // m0.v
    public final void e(m0.s sVar) {
        View c6 = k.c(this);
        sVar.e(this.f11806c.f11819q && k.c(this).hasFocusable());
        View findFocus = c6.findFocus();
        if (findFocus != null) {
            sVar.c(m0.j.a(findFocus, c6));
        }
    }
}
