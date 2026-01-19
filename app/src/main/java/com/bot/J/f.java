package J;

import F0.InterfaceC0134w;
import i4.AbstractC1117a;
import n0.C1354c;
import u.AbstractC1734b;

/* loaded from: classes.dex */
public final class f implements K.e {

    /* renamed from: c, reason: collision with root package name */
    public final long f2783c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2784e;

    public f(h hVar, long j3) {
        this.f2784e = hVar;
        this.f2783c = j3;
    }

    @Override // K.e
    public final G.c data() {
        return i.b(this.f2784e);
    }

    @Override // K.e
    public final long l(InterfaceC0134w interfaceC0134w) {
        InterfaceC0134w interfaceC0134w2 = (InterfaceC0134w) this.f2784e.f2791u.getValue();
        if (interfaceC0134w2 != null) {
            return interfaceC0134w.R(interfaceC0134w2, this.f2783c);
        }
        AbstractC1734b.d("Tried to open context menu before the anchor was placed.");
        throw new RuntimeException();
    }

    @Override // K.e
    public final C1354c r(InterfaceC0134w interfaceC0134w) {
        return AbstractC1117a.a(l(interfaceC0134w), 0L);
    }
}
