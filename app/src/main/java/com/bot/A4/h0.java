package A4;

import B4.AbstractC0049b;
import B4.AbstractC0050c;
import B4.AbstractC0051d;
import b4.InterfaceC0905c;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h0 extends AbstractC0051d {
    public final AtomicReference a = new AtomicReference(null);

    @Override // B4.AbstractC0051d
    public final boolean a(AbstractC0049b abstractC0049b) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(W.f221b);
        return true;
    }

    @Override // B4.AbstractC0051d
    public final InterfaceC0905c[] b(AbstractC0049b abstractC0049b) {
        this.a.set(null);
        return AbstractC0050c.a;
    }
}
