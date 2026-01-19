package M;

import b4.InterfaceC0905c;
import java.util.concurrent.atomic.AtomicReference;
import x4.AbstractC1888A;
import x4.InterfaceC1922e0;
import x4.InterfaceC1942y;
import x4.s0;

/* loaded from: classes.dex */
public final class l extends d4.i implements l4.e {

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f3173h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f3174i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, InterfaceC0905c interfaceC0905c) {
        super(2, interfaceC0905c);
        this.f3174i = mVar;
    }

    @Override // l4.e
    public final Object m(Object obj, Object obj2) {
        return ((l) p((InterfaceC0905c) obj2, (InterfaceC1942y) obj)).r(X3.y.a);
    }

    @Override // d4.a
    public final InterfaceC0905c p(InterfaceC0905c interfaceC0905c, Object obj) {
        l lVar = new l(this.f3174i, interfaceC0905c);
        lVar.f3173h = obj;
        return lVar;
    }

    @Override // d4.a
    public final Object r(Object obj) {
        boolean z5;
        X3.a.e(obj);
        InterfaceC1942y interfaceC1942y = (InterfaceC1942y) this.f3173h;
        m mVar = this.f3174i;
        InterfaceC1922e0 interfaceC1922e0 = (InterfaceC1922e0) mVar.f3175b.getAndSet(null);
        AtomicReference atomicReference = mVar.f3175b;
        s0 y5 = AbstractC1888A.y(interfaceC1942y, null, new k(interfaceC1922e0, mVar, null), 3);
        while (true) {
            if (atomicReference.compareAndSet(null, y5)) {
                z5 = true;
                break;
            }
            if (atomicReference.get() != null) {
                z5 = false;
                break;
            }
        }
        return Boolean.valueOf(z5);
    }
}
