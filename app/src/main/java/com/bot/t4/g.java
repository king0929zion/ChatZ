package t4;

import Y3.t;
import java.util.Iterator;
import l4.InterfaceC1193a;

/* loaded from: classes.dex */
public final class g implements h {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final l4.c f14947b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14948c;

    public g(t tVar, l4.c cVar) {
        l lVar = l.f14952l;
        this.f14948c = tVar;
        this.f14947b = cVar;
    }

    @Override // t4.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new e(this);
            default:
                return new Z.c(this);
        }
    }

    public g(InterfaceC1193a interfaceC1193a, l4.c cVar) {
        this.f14948c = interfaceC1193a;
        this.f14947b = cVar;
    }
}
