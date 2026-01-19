package j2;

import A4.W;
import android.graphics.drawable.Drawable;
import i2.C1112f;
import t2.InterfaceC1724h;
import u2.InterfaceC1756a;

/* loaded from: classes.dex */
public final class i implements InterfaceC1756a, InterfaceC1724h {
    public final /* synthetic */ l a;

    @Override // u2.InterfaceC1756a
    public void a(Drawable drawable) {
        l lVar = this.a;
        lVar.k(new c(drawable != null ? lVar.j(drawable) : null));
    }

    @Override // t2.InterfaceC1724h
    public Object e(C1112f c1112f) {
        return W.i(new k(this.a.f12379i, 0), c1112f);
    }
}
