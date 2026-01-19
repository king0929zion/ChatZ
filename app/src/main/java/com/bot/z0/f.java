package z0;

import android.view.KeyEvent;
import h0.AbstractC1040q;

/* loaded from: classes.dex */
public final class f extends AbstractC1040q implements e {

    /* renamed from: r, reason: collision with root package name */
    public l4.c f16218r;

    /* renamed from: s, reason: collision with root package name */
    public l4.c f16219s;

    @Override // z0.e
    public final boolean F(KeyEvent keyEvent) {
        l4.c cVar = this.f16218r;
        if (cVar != null) {
            return ((Boolean) cVar.f(new C2014b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // z0.e
    public final boolean k(KeyEvent keyEvent) {
        l4.c cVar = this.f16219s;
        if (cVar != null) {
            return ((Boolean) cVar.f(new C2014b(keyEvent))).booleanValue();
        }
        return false;
    }
}
