package t4;

import Y3.z;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements h, InterfaceC1731c {
    public final h a;

    public n(h hVar) {
        this.a = hVar;
    }

    @Override // t4.InterfaceC1731c
    public final h a(int i6) {
        return i6 >= 6 ? C1732d.a : new m(this.a, i6, 6);
    }

    @Override // t4.h
    public final Iterator iterator() {
        return new z(this);
    }

    @Override // t4.InterfaceC1731c
    public final h take() {
        return this;
    }
}
