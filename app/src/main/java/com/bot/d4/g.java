package d4;

import b4.C0911i;
import b4.InterfaceC0905c;
import b4.InterfaceC0910h;

/* loaded from: classes.dex */
public abstract class g implements a {
    public g(InterfaceC0905c interfaceC0905c) {
        super(interfaceC0905c);
        if (interfaceC0905c != null && interfaceC0905c.o() != C0911i.f11057c) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // b4.InterfaceC0905c
    public final InterfaceC0910h o() {
        return C0911i.f11057c;
    }
}
