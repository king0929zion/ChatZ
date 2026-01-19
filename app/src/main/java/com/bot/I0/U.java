package I0;

import android.view.Choreographer;
import b4.InterfaceC0905c;
import x4.InterfaceC1942y;

/* loaded from: classes.dex */
public final class U extends d4.i implements l4.e {
    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((U) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        return new d4.i(2, interfaceC0905c);
    }

    @Override // d4.a
    public final Object r(Object obj) {
        X3.a.e(obj);
        return Choreographer.getInstance();
    }
}
